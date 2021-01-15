import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomePageComponent } from './component/homepage.component';
import { LoginComponent } from './component/login.component';
import { ManagerPageComponent } from './component/manage.component';
import { CoreModule } from './core/core.module';
import { routing } from './app.routing';
import { UrlFrontend } from './contants/url.constant';
import { HttpService } from './service/http.service';
import { HomePageService } from './service/homepage.service';
import { HttpClientModule } from '@angular/common/http';

import { SchedulePageComponent } from './component/schedule.component';
import { BetsComponent } from './component/bets.component';
import { RankingPageComponent } from './component/ranking.component';

@NgModule({
  imports: [
    CoreModule,
    HttpClientModule,
    routing,
  ],
  declarations: [
    AppComponent,
    HomePageComponent,
    LoginComponent,
    ManagerPageComponent,
    SchedulePageComponent,
    BetsComponent,
    RankingPageComponent,
  ],
  providers: [
    UrlFrontend,
    HttpService,
    HomePageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
