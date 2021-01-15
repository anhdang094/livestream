import {RouterModule, Routes} from '@angular/router';
import {ModuleWithProviders} from '@angular/core';
import {ManagerPageComponent} from './component/manage.component';
import {LoginComponent} from './component/login.component';
import {HomePageComponent} from './component/homepage.component';
import { SchedulePageComponent } from './component/schedule.component';
import { RankingPageComponent } from './component/ranking.component';
import { BetsComponent } from './component/bets.component';
/**
 * Created by Administrator on 08/06/2017.
 */
const appRoutes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'homepage', component: HomePageComponent },
  { path: 'schedule', component: SchedulePageComponent },
  { path: 'ranking', component: RankingPageComponent },
  { path: 'bets', component: BetsComponent },
  { path: 'manage', component: ManagerPageComponent },
  { path: '', redirectTo: 'homepage', pathMatch: 'full' },
  { path: '**', redirectTo: 'homepage', pathMatch: 'full'}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
