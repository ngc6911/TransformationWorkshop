package com.regularpranksters.transformationworkshop.data.local;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by paulsavchenko on 14.02.2018.
 */

public class SemanticGraph extends RealmObject {

    @PrimaryKey
    public long graphID;

    public String graphName;

    public RealmList<Vertice> vertices;
    public RealmList<Edge> edges;

    class Vertice extends RealmObject {
        int verticeID;
        String verticeName;

        String color;
    }

    class Edge extends RealmObject {
        Vertice from;
        Vertice to;

        String color;
    }

}