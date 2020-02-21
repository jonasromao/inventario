import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable()
export class RouterService {
  
  constructor(
    private router: Router,
  ) { }

  navigateToLogin() {
    this.router.navigate(['login']);
  }

  navigateToRegistrar() {
    this.router.navigate(['registrar']);
  }

  navigateToHome() {
    this.router.navigate(['home']);
  }
}