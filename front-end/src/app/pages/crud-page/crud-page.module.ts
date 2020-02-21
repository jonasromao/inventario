import { NgModule } from '@angular/core';
import { SharedModule } from '../../shared/shared.module';
import { CrudPageComponent } from './crud-page.component';

@NgModule({
  imports: [
    SharedModule,
  ],
  declarations: [
    CrudPageComponent,
  ]
})
export class CrudPageModule {

}