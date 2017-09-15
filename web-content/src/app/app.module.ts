import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";

import {AppComponent} from "./app.component";
import {HttpModule} from "@angular/http";
import {MessageComponent} from "./messages/message.component";
import {HostService} from "./session/host.service";
import {SessionService} from "./session/session.service";
import {MessageService} from "./messages/message.service";
import {WindowRef} from "./util/window";

const appRoutes = [
  {path: '', component: MessageComponent},
];


@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(
      appRoutes
    )
  ],
  exports: [
    RouterModule
  ],
  declarations: [
    AppComponent,
    MessageComponent
  ],
  bootstrap: [AppComponent],
  providers: [HostService, SessionService, MessageService, WindowRef]
})
export class AppModule {
}
