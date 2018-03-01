package com.swift.hotta.tapbreak01;

import android.app.Application;
import android.content.Context;
import android.view.View;

/**
 * 使わない！！！！！！！！
 * Created by swift01 on 2018/03/01.
 */

public class GameCanvasView extends View {

    MyApplication myApplication;

    public GameCanvasView(Context context) {
        super(context);
    }

    public GameCanvasView(Context context, MyApplication ins_myApplication) {
        this(context);
        this.myApplication = ins_myApplication;
    }



}
