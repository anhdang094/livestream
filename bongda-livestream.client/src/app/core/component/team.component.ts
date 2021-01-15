import { Component, Input } from '@angular/core';
import { Team } from '../../model/team.model';

/**
 * Created by Administrator on 08/06/2017.
 */
@Component({
  selector: 'app-team',
  templateUrl: '../view/team.view.html',
  styleUrls: ['../style/team.style.scss']
})

export class TeamComponent {

  @Input() team: Team;

}
