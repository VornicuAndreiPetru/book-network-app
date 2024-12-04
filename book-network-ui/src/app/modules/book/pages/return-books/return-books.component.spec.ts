import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReturnBooksComponent } from './return-books.component';

describe('ReturnBooksComponent', () => {
  let component: ReturnBooksComponent;
  let fixture: ComponentFixture<ReturnBooksComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ReturnBooksComponent]
    });
    fixture = TestBed.createComponent(ReturnBooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
