export class Team {
  public logoUrl: string = null;
  public teamName: string = null;
  public teamAcronym: string = null;

  constructor(logoUrl: string, teamName: string, teamAcronym: string) {
    this.logoUrl = logoUrl;
    this.teamName = teamName;
    this.teamAcronym = teamAcronym;
  }
}
