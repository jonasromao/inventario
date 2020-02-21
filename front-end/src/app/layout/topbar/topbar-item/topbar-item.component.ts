import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';

import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-topbar-item',
  templateUrl: './topbar-item.component.html',
  styleUrls: ['./topbar-item.component.scss'],
})
export class TopbarItemComponent {
  @Input() item: MenuItem;

  showChildren: boolean;

  constructor(
    private router: Router,
  ) { }

  handleClick(item: MenuItem) {
    if (item.items) {
      this.showChildren = !this.showChildren;
    } else if (item.routerLink) {
      this.router.navigate(item.routerLink);
    } else if (item.command) {
      item.command();
    }
  }
}