package com.regularpranksters.transformationworkshop.myexercises.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by paulsavchenko on 14.02.2018.
 */

public class Exercise extends RealmObject{

    @PrimaryKey
    public long exID; //TODO: make id manually incremented or generate random UUID

    public String exerciseName; //TODO: name must be generated from it's type and user-defined name as a "question" or "target" like in semantic graph

    public String exerciseType;
}
