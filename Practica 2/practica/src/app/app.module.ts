import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IndiceComponent } from './pages/indice/indice.component';
import { ContactoComponent } from './pages/contacto/contacto.component';
import { TutorialesComponent } from './pages/tutoriales/tutoriales.component';
import { HeaderComponent } from './services/header/header.component';
import { FooterComponent } from './services/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    IndiceComponent,
    ContactoComponent,
    TutorialesComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
