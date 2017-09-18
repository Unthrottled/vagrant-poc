/// <reference path="../util/EventSource.d.ts"/>
import {Injectable} from '@angular/core';
import {SessionService} from '../session/session.service';
import {Observable} from 'rxjs/Observable';
import {HostService} from '../session/host.service';
import {Observer} from 'rxjs/Observer';
import 'rxjs/add/operator/mergeMap';
import {Message} from './message';
import {Scheduler} from "rxjs/Rx";
import {Http, Response} from "@angular/http";

@Injectable()
export class MessageService {
    constructor(private http: Http, private hostService: HostService) {
    }

    fetchMessages(): Observable<Message> {
        return Observable.interval(200)
            .flatMap(i=>this.http.get(this.hostService.fetchUrl() + "vagrant-poc/api"))
            .map((response: Response)=> new Message(response.json()));
    }
}
