package com.horizon.hearttree.heart;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Snapshot {
    Canvas canvas;
    Bitmap bitmap;
    Snapshot(Bitmap bitmap){
        this.bitmap = bitmap;
        this.canvas = new Canvas(bitmap);
    }
}
