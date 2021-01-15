import { Component, Input } from '@angular/core';
import { MatchComment } from '../../model/match-comment';
import { User } from '../../model/user.model';

/**
 * Created by Administrator on 08/06/2017.
 */
@Component({
  selector: 'app-match-comment',
  templateUrl: '../view/match-comment.view.html',
  styleUrls: ['../style/match-comment.style.scss']
})

export class MatchCommentComponent {
  @Input() matchComments: MatchComment[];

}
