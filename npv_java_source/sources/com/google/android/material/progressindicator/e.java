package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.google.android.material.progressindicator.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43520j;

    public e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50513g);
    }

    public e(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, com.google.android.material.progressindicator.CircularProgressIndicator.f43471R);
    }

    public e(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(p125m4.c.f50564Z);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(p125m4.c.f50563Y);
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, attributeSet, p125m4.j.f51017m1, i6, i10, new int[0]);
        this.f43518h = java.lang.Math.max(B4.c.c(context, typedArrayI, p125m4.j.f51041p1, dimensionPixelSize), this.f43491a * 2);
        this.f43519i = B4.c.c(context, typedArrayI, p125m4.j.f51033o1, dimensionPixelSize2);
        this.f43520j = typedArrayI.getInt(p125m4.j.f51025n1, 0);
        typedArrayI.recycle();
        e();
    }
}
