import { NgModule } from '@angular/core';

import { AuthenticationService } from './authentication.service';
import { AuthenticationGuard } from './authentication.guard';

import { SharedModule } from '../shared/shared.module';

@NgModule({
  imports: [
    SharedModule,
  ],
  providers: [
    AuthenticationService,
    AuthenticationGuard,
  ],
})
export class AuthenticationModule {

}