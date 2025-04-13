import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'doAnApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'chucvu',
    data: { pageTitle: 'doAnApp.chucvu.home.title' },
    loadChildren: () => import('./chucvu/chucvu.routes'),
  },
  {
    path: 'phongban',
    data: { pageTitle: 'doAnApp.phongban.home.title' },
    loadChildren: () => import('./phongban/phongban.routes'),
  },
  {
    path: 'nhanvien',
    data: { pageTitle: 'doAnApp.nhanvien.home.title' },
    loadChildren: () => import('./nhanvien/nhanvien.routes'),
  },
  {
    path: 'bangchamcong',
    data: { pageTitle: 'doAnApp.bangchamcong.home.title' },
    loadChildren: () => import('./bangchamcong/bangchamcong.routes'),
  },
  {
    path: 'tanggiamtl',
    data: { pageTitle: 'doAnApp.tanggiamtl.home.title' },
    loadChildren: () => import('./tanggiamtl/tanggiamtl.routes'),
  },
  {
    path: 'thamsotl',
    data: { pageTitle: 'doAnApp.thamsotl.home.title' },
    loadChildren: () => import('./thamsotl/thamsotl.routes'),
  },
  {
    path: 'thuetn',
    data: { pageTitle: 'doAnApp.thuetn.home.title' },
    loadChildren: () => import('./thuetn/thuetn.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
