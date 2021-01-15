import { User } from './user.model';

export class MatchComment {
  public user: User = null;
  public comment: string = null;

  constructor(user: User, comment: string) {
    this.user = user;
    this.comment = comment;
  }
}
