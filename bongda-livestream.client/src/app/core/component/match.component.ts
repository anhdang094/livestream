import { Component, Input } from '@angular/core';
import { Match } from '../../model/match.model';

/**
 * Created by Administrator on 08/06/2017.
 */
@Component({
  selector: 'app-match',
  templateUrl: '../view/match.view.html',
  styleUrls: ['../style/match.style.scss']
})

export class MatchComponent {

  @Input() match: Match;

}
