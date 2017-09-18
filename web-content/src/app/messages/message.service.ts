/// <reference path="../util/EventSource.d.ts"/>
import {Injectable} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {HostService} from "../session/host.service";
import "rxjs/add/operator/mergeMap";
import {Message} from "./message";
import {Http, Response} from "@angular/http";

@Injectable()
export class MessageService {
    constructor(private http: Http, private hostService: HostService) {
    }

    fetchMessages(): Observable<Message> {
        return Observable.interval(200)
            .flatMap(i => this.http.get(this.hostService.fetchUrl() + "vagrant-poc/api"))
            .map((response: Response) => new Message(response.text()));
    }
}
