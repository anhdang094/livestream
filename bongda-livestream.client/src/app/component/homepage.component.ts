import { Component, OnInit } from '@angular/core';
import { HomePageService } from '../service/homepage.service';
import { User } from '../model/user.model';
import { Match } from '../model/match.model';
import { Team } from '../model/team.model';
import { MatchComment } from '../model/match-comment';

/**
 * Created by Administrator on 08/06/2017.
 */
@Component({
  selector: 'app-homepage',
  templateUrl: '../view/homepage.view.html',
  styleUrls: ['../style/homepage.style.css']
})

export class HomePageComponent implements OnInit {
  constructor(private homepageService: HomePageService) {
  }

  matchComments: MatchComment[] = [
    {
      user: new User(0, 'Hai LX', 0),
      comment: 'Trận này MU sẽ thắng. Manchester United chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Tong M', 0),
      comment: 'Trận này Manchester City sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Anh XD', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Tuu VT', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'The TK', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Xuan U', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Hai MU', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Tuan P', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
    {
      user: new User(0, 'Ha RT', 0),
      comment: 'Trận này MU sẽ thắng. Manchester City chấp 2 trái rưỡi',
    },
  ];

  matchs: Match[] = [
    {
      id: '1',
      createdTime: '123456',
      host: new Team('../../assets/images/team-logos/logo-1.png', 'Manchester United', 'MU'),
      guest: new Team('../../assets/images/team-logos/logo-2.png', 'Manchester City', 'MC'),
      leagueName: 'Ngoại Hạng Anh',
      dateStart: '13/08/2017',
      timeStart: '19:30',
      dateEnd: '13/08/2017',
      timeEnd: '21:30',
      stadium: 'Old Trafford',
      isProgressing: true,
      matchComments: this.matchComments
    },
    {
      id: '1',
      createdTime: '123456',
      host: new Team('../../assets/images/team-logos/logo-3.png', 'Manchester United', 'MU'),
      guest: new Team('../../assets/images/team-logos/logo-4.png', 'Manchester City', 'MC'),
      leagueName: 'Ngoại Hạng Anh',
      dateStart: '13/08/2017',
      timeStart: '19:30',
      dateEnd: '13/08/2017',
      timeEnd: '21:30',
      stadium: 'Old Trafford',
      isProgressing: true,
      matchComments: this.matchComments
    },
    {
      id: '1',
      createdTime: '123456',
      host: new Team('../../assets/images/team-logos/logo-4.png', 'Manchester United', 'MU'),
      guest: new Team('../../assets/images/team-logos/logo-6.png', 'Manchester City', 'MC'),
      leagueName: 'Ngoại Hạng Anh',
      dateStart: '13/08/2017',
      timeStart: '19:30',
      dateEnd: '13/08/2017',
      timeEnd: '21:30',
      stadium: 'Old Trafford',
      isProgressing: false,
      matchComments: this.matchComments
    },
    {
      id: '1',
      createdTime: '123456',
      host: new Team('../../assets/images/team-logos/logo-5.png', 'Manchester United', 'MU'),
      guest: new Team('../../assets/images/team-logos/logo-3.png', 'Manchester City', 'MC'),
      leagueName: 'Ngoại Hạng Anh',
      dateStart: '13/08/2017',
      timeStart: '19:30',
      dateEnd: '13/08/2017',
      timeEnd: '21:30',
      stadium: 'Old Trafford',
      isProgressing: false,
      matchComments: this.matchComments
    }
  ];

  ngOnInit() {
  }

}
