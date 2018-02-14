package com.regularpranksters.transformationworkshop.semanticgraph.graphlayout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by paulsavchenko on 12.02.2018.
 */

public class GraphLayout extends View {
    public GraphLayout(Context context) {
        super(context);
    }

    public GraphLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GraphLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GraphLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
