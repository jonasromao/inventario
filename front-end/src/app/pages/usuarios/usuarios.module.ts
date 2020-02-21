import { NgModule } from '@angular/core';
import { SharedModule } from '../../shared/shared.module';
import { UsuarioPageComponent } from './usuarios.component';

@NgModule({
  imports: [
    SharedModule,
  ],
  declarations: [
    UsuarioPageComponent,
  ]
})
export class UsuarioPageModule {

}