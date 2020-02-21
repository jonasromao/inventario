import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.scss'],
})
export class TopbarComponent implements OnInit {  

  appName: string;

  userItem: MenuItem;

  constructor() { }

  ngOnInit() {
    this.setup();
  }

  setup() {
    this.appName = 'Projeto Base';

    this.userItem = {
      label: 'John Smith',
      icon: 'pi pi-user',
      items: [
        { label: 'Profile', icon: 'pi pi-user' },
        { label: 'Inbox', icon: 'pi pi-envelope' },
        { label: 'Settings', icon: 'pi pi-cog' },
        { label: 'Log out', icon: 'pi pi-sign-out' },
      ],      
    };
  }

  toggleSidebar() {
    const dom: any = document.querySelector('body');
    dom.classList.toggle('push-right');
  }

}
