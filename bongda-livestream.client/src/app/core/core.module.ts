import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { HeaderComponent } from './component/header.component';
import { CommonModule } from '@angular/common';
import { FooterComponent } from './component/footer.component';
import { MatchComponent } from './component/match.component';
import { MatchFormComponent } from './component/match-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MatchCommentComponent } from './component/match-comment.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BrowserModule } from '@angular/platform-browser';
import { TeamComponent } from './component/team.component';
import { HeaderService } from '../service/header.service';
import { UrlFrontend } from '../contants/url.constant';
import { HttpService } from '../service/http.service';


@NgModule({
  imports: [
    CommonModule,
    ReactiveFormsModule,
    FormsModule,
    NgbModule.forRoot()
  ],
  declarations: [
    HeaderComponent,
    FooterComponent,
    MatchComponent,
    MatchFormComponent,
    MatchCommentComponent,
    TeamComponent
  ],
  providers: [
    UrlFrontend,
    HttpService,
    HeaderService
  ],
  exports: [
    HeaderComponent,
    FooterComponent,
    MatchComponent,
    MatchFormComponent,
    MatchCommentComponent,
    TeamComponent,

    /*Form module*/
    ReactiveFormsModule,
    FormsModule,

    BrowserModule,
    BrowserAnimationsModule,
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class CoreModule {
}
