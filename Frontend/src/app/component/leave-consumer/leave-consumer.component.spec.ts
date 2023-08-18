import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { LeaveConsumerComponent } from './leave-consumer.component';
import { LeaveService } from '../../services/leave.service';
import { of } from 'rxjs';
import { LeaveApplication } from '../../models/leave-application.model';

let leaveConsumerBoundaryTest = `LeaveConsumer boundary test`;

describe('LeaveConsumerComponent', () => {
  let component: LeaveConsumerComponent;
  let fixture: ComponentFixture<LeaveConsumerComponent>;
  let leaveService: LeaveService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LeaveConsumerComponent],
      imports: [HttpClientTestingModule],
      providers: [LeaveService]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LeaveConsumerComponent);
    component = fixture.componentInstance;
    leaveService = TestBed.inject(LeaveService);
    fixture.detectChanges();
  });

  describe('boundary', () => {
    it(`${leaveConsumerBoundaryTest} should create leave consumer`, () => {
      expect(component).toBeTruthy();
    });

    it(`${leaveConsumerBoundaryTest} should load leave applications on button click`, () => {
      const leaveApplications: LeaveApplication[] = [
      ];

      jest.spyOn(leaveService, 'getAllLeaveApplications').mockReturnValue(of(leaveApplications));

      component.loadLeaveApplications();
      expect(component.leaveApplications).toEqual(leaveApplications);
    });
  });
});