import {Component, OnInit} from '@angular/core';
import {FormControl} from '@angular/forms';

/**
 * Created by Administrator on 08/06/2017.
 */
@Component({
  selector: 'app-form-match',
  styleUrls: ['../style/match-form.style.scss'],
  templateUrl: '../view/match-form.view.html'
})

export class MatchFormComponent implements OnInit {
  myControl = new FormControl();
  options = [
    'One',
    'Two',
    'Three'
  ];

  ngOnInit() {
  }

}
