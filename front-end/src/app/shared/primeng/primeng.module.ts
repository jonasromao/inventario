import { NgModule, ModuleWithProviders } from '@angular/core';
import {
  AutoCompleteModule,
  AccordionModule,
  ButtonModule,
  CalendarModule,
  CheckboxModule,
  ConfirmDialogModule,
  DataTableModule,
  DialogModule,
  DropdownModule,
  FileUploadModule,
  GrowlModule,
  InputMaskModule,
  InputTextModule,
  InputTextareaModule,
  MenuModule,
  MenubarModule,
  MessagesModule,
  PaginatorModule,
  PanelModule,
  PasswordModule,
  PickListModule,
  ProgressBarModule,
  RadioButtonModule,
  SelectButtonModule,
  SharedModule,
  SliderModule,
  SpinnerModule,
  TooltipModule,
  TreeModule,
  ConfirmationService,
} from 'primeng/primeng';
import { TableModule } from 'primeng/table';

@NgModule({
  exports: [
    AutoCompleteModule,
    AccordionModule,
    ButtonModule,
    CalendarModule,
    CheckboxModule,
    ConfirmDialogModule,
    DataTableModule,
    DialogModule,
    DropdownModule,
    FileUploadModule,
    GrowlModule,
    InputMaskModule,
    InputTextModule,
    InputTextareaModule,
    MenuModule,
    MenubarModule,
    MessagesModule,
    PaginatorModule,
    PanelModule,
    PasswordModule,
    PickListModule,
    ProgressBarModule,
    RadioButtonModule,
    SelectButtonModule,
    SharedModule,
    SliderModule,
    SpinnerModule,
    TooltipModule,
    TableModule,
    TreeModule,
  ],
})
export class PrimeNgModule {
  static forRoot(): ModuleWithProviders {
    return {
      ngModule: PrimeNgModule,
      providers: [
        ConfirmationService,
      ],
    }
  }
}
