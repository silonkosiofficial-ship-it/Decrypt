package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1914u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f18577c = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.ProgressBar f18578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.graphics.Bitmap f18579b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.u$a */
    private static class a {
        public static void a(android.graphics.drawable.LayerDrawable layerDrawable, android.graphics.drawable.LayerDrawable layerDrawable2, int i6) {
            layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
            layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
            layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
            layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
            layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
            layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
            layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
            layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
            layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
        }
    }

    C1914u(android.widget.ProgressBar progressBar) {
        this.f18578a = progressBar;
    }

    private android.graphics.drawable.shapes.Shape a() {
        return new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.AnimationDrawable)) {
            return drawable;
        }
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i6 = 0; i6 < numberOfFrames; i6++) {
            android.graphics.drawable.Drawable drawableD = d(animationDrawable.getFrame(i6), true);
            drawableD.setLevel(10000);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i6));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    android.graphics.Bitmap b() {
        return this.f18579b;
    }

    void c(android.util.AttributeSet attributeSet, int i6) {
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(this.f18578a.getContext(), attributeSet, f18577c, i6, 0);
        android.graphics.drawable.Drawable drawableH = c0VarV.h(0);
        if (drawableH != null) {
            this.f18578a.setIndeterminateDrawable(e(drawableH));
        }
        android.graphics.drawable.Drawable drawableH2 = c0VarV.h(1);
        if (drawableH2 != null) {
            this.f18578a.setProgressDrawable(d(drawableH2, false));
        }
        c0VarV.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable, boolean z6) {
        if (drawable instanceof androidx.core.graphics.drawable.b) {
            androidx.core.graphics.drawable.b bVar = (androidx.core.graphics.drawable.b) drawable;
            android.graphics.drawable.Drawable drawableB = bVar.b();
            if (drawableB != null) {
                bVar.a(d(drawableB, z6));
            }
        } else {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    int id = layerDrawable.getId(i6);
                    drawableArr[i6] = d(layerDrawable.getDrawable(i6), id == 16908301 || id == 16908303);
                }
                android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    androidx.appcompat.widget.C1914u.a.a(layerDrawable, layerDrawable2, i10);
                }
                return layerDrawable2;
            }
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f18579b == null) {
                    this.f18579b = bitmap;
                }
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
