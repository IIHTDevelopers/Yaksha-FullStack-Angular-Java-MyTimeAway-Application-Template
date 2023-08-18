package com.leaveapplication.functional;

import static com.leaveapplication.utils.TestUtils.businessTestFile;
import static com.leaveapplication.utils.TestUtils.currentTest;
import static com.leaveapplication.utils.TestUtils.testReport;
import static com.leaveapplication.utils.TestUtils.yakshaAssert;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.leaveapplication.controller.LeaveApplicationController;
import com.leaveapplication.dto.LeaveApplicationDTO;
import com.leaveapplication.service.LeaveApplicationService;
import com.leaveapplication.utils.MasterData;

@WebMvcTest(LeaveApplicationController.class)
@AutoConfigureMockMvc
public class LeaveApplicationControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LeaveApplicationService leaveApplicationService;

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testCreateLeave() throws Exception {
		LeaveApplicationDTO leaveApplicationDTO = MasterData.getLeaveApplicationDTO();
		LeaveApplicationDTO savedLeaveApplicationDTO = MasterData.getLeaveApplicationDTO();
		savedLeaveApplicationDTO.setId(leaveApplicationDTO.getId());

		when(leaveApplicationService.createLeaveApplication(any())).thenReturn(MasterData.getLeaveApplication());
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/leave")
				.content(MasterData.asJsonString(leaveApplicationDTO)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		yakshaAssert(currentTest(),
				(result.getResponse().getContentAsString()
						.contentEquals(MasterData.asJsonString(savedLeaveApplicationDTO)) ? "true" : "false"),
				businessTestFile);

	}

	@Test
	public void testGetLeaveById() throws Exception {
		LeaveApplicationDTO leaveApplicationDTO = MasterData.getLeaveApplicationDTO();
		when(this.leaveApplicationService.getLeaveApplicationById(leaveApplicationDTO.getId()))
				.thenReturn(MasterData.getLeaveApplication());
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/leave/" + leaveApplicationDTO.getId())
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		yakshaAssert(currentTest(),
				(result.getResponse().getContentAsString().contentEquals(MasterData.asJsonString(leaveApplicationDTO))
						? "true"
						: "false"),
				businessTestFile);

	}
}