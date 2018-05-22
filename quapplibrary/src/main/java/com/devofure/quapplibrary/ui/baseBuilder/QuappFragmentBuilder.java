package com.devofure.quapplibrary.ui.baseBuilder;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public class QuappFragmentBuilder extends QuappBuilder {

     public QuappFragmentBuilder(int idRootLayout, LayoutInflater inflater, ViewGroup container) {
         super((ViewGroup) inflater.inflate(idRootLayout, container, false));
     }
}
