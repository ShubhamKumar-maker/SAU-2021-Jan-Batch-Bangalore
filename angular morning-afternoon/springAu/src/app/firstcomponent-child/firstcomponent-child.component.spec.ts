import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FirstcomponentChildComponent } from './firstcomponent-child.component';

describe('FirstcomponentChildComponent', () => {
  let component: FirstcomponentChildComponent;
  let fixture: ComponentFixture<FirstcomponentChildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FirstcomponentChildComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FirstcomponentChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
