import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { PrimeNgModule } from './primeng/primeng.module';

import { TableComponent } from './components/table/table.component';

import { SmoothToggleDirective } from './directives/smooth-toggle.directive';

const modules = [
  CommonModule,
  FormsModule,
  PrimeNgModule,
];

const components = [
  TableComponent,
];

const directives = [
  SmoothToggleDirective,
];

@NgModule({
  imports: [
    modules,
  ],
  declarations: [
    components,
    directives,
  ],
  exports: [
    modules,
    components,
    directives,
  ],
})
export class SharedModule {
  static forRoot(): ModuleWithProviders {
    return {
      ngModule: SharedModule,
      providers: [
        ...PrimeNgModule.forRoot().providers,
      ],
    }
  }
}