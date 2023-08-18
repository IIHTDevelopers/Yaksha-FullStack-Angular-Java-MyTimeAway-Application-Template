import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { LeaveService } from './leave.service';

let leaveServiceBoundaryTest = `LeaveService boundary test`;

describe('LeaveService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
  });

  describe('boundary', () => {
    it(`${leaveServiceBoundaryTest} should create leave service`, () => {
      const service: LeaveService = TestBed.inject(LeaveService);
      expect(service).toBeTruthy();
    });
  });
});
