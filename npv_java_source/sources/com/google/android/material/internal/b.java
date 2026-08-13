package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f43430a = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.ThreadLocal f43431b = new java.lang.ThreadLocal();

    public static void a(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        c(viewGroup, view, rect);
    }

    private static void b(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            android.view.View view2 = (android.view.View) parent;
            b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    public static void c(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        java.lang.ThreadLocal threadLocal = f43430a;
        android.graphics.Matrix matrix = (android.graphics.Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        b(viewGroup, view, matrix);
        java.lang.ThreadLocal threadLocal2 = f43431b;
        android.graphics.RectF rectF = (android.graphics.RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
