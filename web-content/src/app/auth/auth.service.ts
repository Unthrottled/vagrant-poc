import {Injectable} from "@angular/core";

import {Observable} from "rxjs/Observable";
import "rxjs/add/observable/of";
import "rxjs/add/operator/do";
import "rxjs/add/operator/delay";
import {User} from "./user.model";

@Injectable()
export class AuthService {
  isLoggedIn = false;

  // store the URL so we can redirect after logging in
  redirectUrl: string;

  login(user: User): Observable<boolean> {
    return Observable.create(true)
      .delay(1000)
      .do((val: boolean) => this.isLoggedIn = val);
  }

  logout(): void {
    this.isLoggedIn = false;
  }
}
