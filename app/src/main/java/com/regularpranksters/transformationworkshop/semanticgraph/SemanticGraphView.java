package com.regularpranksters.transformationworkshop.semanticgraph;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Created by paulsavchenko on 12.02.2018.
 */

@StateStrategyType(AddToEndSingleStrategy.class)
public interface SemanticGraphView extends MvpView {
    void updateNode();
    void updateGraph();
}
