package com.regularpranksters.transformationworkshop.semanticgraph;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.regularpranksters.transformationworkshop.R;

/**
 * Created by paulsavchenko on 12.02.2018.
 */

public class SemanticGraphActivity extends MvpAppCompatActivity implements SemanticGraphView{

    @InjectPresenter SemanticGraphPresenter mSemanticGraphPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semantic_graph_activity);
    }

    @Override
    public void updateNode() {

    }

    @Override
    public void updateGraph() {

    }
}
