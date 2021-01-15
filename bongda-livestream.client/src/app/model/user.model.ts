/**
 * Created by Administrator on 08/06/2017.
 */
export class User {
  public id: number = null;
  public name: string = null;
  public age: number = null;

  constructor(id: number, name: string, age: number) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
