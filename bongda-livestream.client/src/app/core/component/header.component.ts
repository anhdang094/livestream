import { Component, OnInit } from '@angular/core';
import { UrlFrontend } from '../../contants/url.constant';
import { Router } from '@angular/router';
import { HeaderService } from '../../service/header.service';
import { User } from '../../model/user.model';

/**
 * Created by Administrator on 08/06/2017.
 */
@Component({
  selector: 'app-header',
  templateUrl: '../view/header.view.html',
  styleUrls: ['../../style/app-football.style.css']
})

export class HeaderComponent implements OnInit {

  urlFront: UrlFrontend;
  routerUrl: Router;

  constructor(private router: Router,
              private urlConstants: UrlFrontend,
              private headerService: HeaderService) {
    this.urlFront = this.urlConstants;
    this.routerUrl = this.router;
  }

  ngOnInit() {
  }

  redirect(url: string) {
    this.router.navigateByUrl(url);
  }

  getActive(url: string) {
    return (url === this.router.url);
  }

  doGet() {
    let user: User;
    this.headerService.getUser().then(result => {
      user = result;
      console.log(user.id);
    });
  }
}
