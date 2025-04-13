import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ApiService } from './api.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent implements OnInit{
  constructor (protected http: HttpClient) {}
  title = 'Thất bại';

ngOnInit(): void {
  this.http.get('http://localhost:8080/test', { responseType: 'text' }).subscribe(
    (res: string) => {
      console.log(res);
      if (res) {
        this.title = res;
      }
    },
    (error) => {
      console.error('Error fetching data:', error);
    }
  );
}
}
