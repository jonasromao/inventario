import { Component } from '@angular/core';

import { AuthenticationService } from '../../authentication/authentication.service';
import { RouterService } from '../../services/router.service';

import { LoginTO } from '../../models/login.to';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss', '../../styles/flat-page.scss'],
})
export class LoginComponent {
  
  loginTO: LoginTO = new LoginTO();

  constructor(
    private authenticationService: AuthenticationService,
    private router: RouterService,
  ) { }
  
  login() {
    this.authenticationService.login(this.loginTO).subscribe(
      _ => {
        this.router.navigateToHome();
      },
    );
  }

  registrar() {
    this.router.navigateToRegistrar();
  }

}