import { NgModule } from '@angular/core';

import { SharedModule } from '../shared/shared.module';

import { LayoutComponent } from './layout.component';
import { TopbarComponent } from './topbar/topbar.component';
import { TopbarItemComponent } from './topbar/topbar-item/topbar-item.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { SidebarItemComponent } from './sidebar/sidebar-item/sidebar-item.component';

@NgModule({
  imports: [
    SharedModule,
  ],
  declarations: [
    LayoutComponent,
    TopbarComponent,
    TopbarItemComponent,
    SidebarComponent,
    SidebarItemComponent,
  ],
})
export class LayoutModule { }