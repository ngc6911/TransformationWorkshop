package com.regularpranksters.transformationworkshop.myexercises;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.regularpranksters.transformationworkshop.R;

public class MyExercisesActivity extends MvpAppCompatActivity implements MyExercisesView {

    @InjectPresenter
    MyExercisesPresenter mMyExercisesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_exercises_activity);
    }

    @Override
    public void updateExercises() {

    }
}
