// leave-application.component.spec.ts
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LeaveApplicationComponent } from './leave-application.component';
import { LeaveService } from '../../services/leave.service';

let leaveApplicationBoundaryTest = `LeaveApplication boundary test`;

describe('LeaveApplicationComponent', () => {
  let component: LeaveApplicationComponent;
  let fixture: ComponentFixture<LeaveApplicationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LeaveApplicationComponent],
      imports: [FormsModule, HttpClientModule],
      providers: [LeaveService]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LeaveApplicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  describe('boundary', () => {
    it(`${leaveApplicationBoundaryTest} should create leave application component`, () => {
      expect(component).toBeTruthy();
    });
  });
});
