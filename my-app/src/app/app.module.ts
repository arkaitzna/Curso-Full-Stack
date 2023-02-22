import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Component2Component } from './components/component2/component2.component';
import { Directive1Directive } from './directives/directive1.directive';
import { Pipe2Pipe } from './pipes/pipe2.pipe';

@NgModule({
  declarations: [
    AppComponent,
    Component2Component,
    Directive1Directive,
    Pipe2Pipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
