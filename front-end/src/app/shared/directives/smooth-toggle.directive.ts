import { Directive, OnChanges, Input, ElementRef, Output, EventEmitter, SimpleChanges, HostBinding } from '@angular/core';

@Directive({
  selector: '[smoothToggle]',
  host: {
    '[style.overflowY]': '"hidden"',
    '[style.transition]': '"height 0.2s ease"',
  },
})
export class SmoothToggleDirective implements OnChanges {
  
  @Input() smoothToggle: boolean;
  @Output() smoothToggleChange = new EventEmitter<boolean>();

  @HostBinding('style.height') height: string;
  
  constructor(
    private element: ElementRef
  ) { }

  ngOnChanges(changes: SimpleChanges) {
    const smoothToggleChange = changes.smoothToggle;
    if (smoothToggleChange) {
      setTimeout(_ => this.toggle(smoothToggleChange.currentValue));
    } 
  }

  toggle(isExpanded: boolean) {
    if (isExpanded) {
      this.setExpandedStyle(this.element.nativeElement);
    } else {
      this.setCollapsedStyle(this.element.nativeElement);
    }
  } 

  setExpandedStyle(element: HTMLElement) {
    var sectionHeight = element.scrollHeight;
    this.height = sectionHeight + 'px';
  }

  setCollapsedStyle(element: HTMLElement) {
    this.height = '0';
  }
}