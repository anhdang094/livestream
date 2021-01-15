import { Team } from './team.model';
import { MatchComment } from './match-comment';

export class Match {
  public id: string = null;
  public createdTime: string = null;
  public host: Team = null;
  public guest: Team = null;
  public leagueName: string = null;
  public dateStart: string = null;
  public timeStart: string = null;
  public dateEnd: string = null;
  public timeEnd: string = null;
  public stadium: string = null;
  public isProgressing: boolean;
  public matchComments: MatchComment[] = [];
}
