import { Component, OnInit, Output, EventEmitter } from '@angular/core';

import { MenuItem } from 'primeng/api';

import { AppMenu } from '../../app-menu';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  appMenu: MenuItem[] = AppMenu;
  
  collapsed: boolean;

  @Output() collapse = new EventEmitter<boolean>();
  
  ngOnInit() {
    this.collapsed = false;
  }

  toggleCollapsed() {
    this.collapsed = !this.collapsed;
    this.collapse.emit(this.collapsed);
  }
}
