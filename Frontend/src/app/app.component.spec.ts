import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { RouterTestingModule } from '@angular/router/testing';

let appComponentBoundaryTest = `AppComponent boundary test`;

describe('AppComponent', () => {
    let fixture: ComponentFixture<AppComponent>;
    let component: AppComponent;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            declarations: [AppComponent],
            imports: [RouterTestingModule]
        }).compileComponents();

        fixture = TestBed.createComponent(AppComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    describe('boundary', () => {
        it(`${appComponentBoundaryTest} should create the app`, () => {
            expect(component).toBeTruthy();
        });

        it(`${appComponentBoundaryTest} should contain the "Leave Application" text`, () => {
            const compiled = fixture.nativeElement;
            expect(compiled.querySelector('h1').textContent).toContain('Leave Application');
        });
    });
});
