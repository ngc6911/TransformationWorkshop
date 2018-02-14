package com.regularpranksters.transformationworkshop.myexercises;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Created by paulsavchenko on 13.02.2018.
 */

@StateStrategyType(AddToEndSingleStrategy.class)
public interface MyExercisesView extends MvpView{
    void updateExercises();
}
