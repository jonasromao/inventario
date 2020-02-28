import { MenuItem } from 'primeng/api';

export const AppMenu: MenuItem[] = [
  {
    label: 'Crud Page',
    icon: 'pi pi-table',
    routerLink: 'crud-page',
  },
  {
    label: 'Usuários',
    icon: 'pi pi-user',
    routerLink: 'usuarios',
  },
  {
    label: 'Perfis',
    icon: 'pi pi-key',
  },
  {
    label: 'Menu com submenu',
    icon: 'pi pi-list',
    items: [
      {
        label: 'Submenu 1',
      },
      {
        label: 'Submenu 2',
      },
      {
        label: 'Submenu 3',
      },
    ],
  },
];