package com.dianavintila.mvvm1.ui.main;

import android.util.Log;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
   public final ObservableBoolean isChecked = new ObservableBoolean();

   public void onclearSelected(){
      isChecked.set(false);
      Log.d(MainViewModel.class.getSimpleName(),"onButtonSelected()");
   }

}