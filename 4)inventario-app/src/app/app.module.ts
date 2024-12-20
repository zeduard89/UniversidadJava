import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductoListaComponent } from './producto-lista/producto-lista.component';
import { HttpClientModule,provideHttpClient, withInterceptorsFromDi, withFetch } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ProductoListaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [
    provideClientHydration(),
    provideHttpClient(
      withInterceptorsFromDi(),
      withFetch()
    )
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
