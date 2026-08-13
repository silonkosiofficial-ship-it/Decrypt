package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f43493c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43497g;

    protected b(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(p125m4.c.f50566a0);
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, attributeSet, p125m4.j.f50760G, i6, i10, new int[0]);
        this.f43491a = B4.c.c(context, typedArrayI, p125m4.j.f50832P, dimensionPixelSize);
        this.f43492b = java.lang.Math.min(B4.c.c(context, typedArrayI, p125m4.j.f50824O, 0), this.f43491a / 2);
        this.f43495e = typedArrayI.getInt(p125m4.j.f50800L, 0);
        this.f43496f = typedArrayI.getInt(p125m4.j.f50768H, 0);
        this.f43497g = typedArrayI.getDimensionPixelSize(p125m4.j.f50784J, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    private void c(android.content.Context context, android.content.res.TypedArray typedArray) {
        if (!typedArray.hasValue(p125m4.j.f50776I)) {
            this.f43493c = new int[]{p195t4.a.b(context, p125m4.a.f50518l, -1)};
            return;
        }
        if (typedArray.peekValue(p125m4.j.f50776I).type != 1) {
            this.f43493c = new int[]{typedArray.getColor(p125m4.j.f50776I, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(p125m4.j.f50776I, -1));
        this.f43493c = intArray;
        if (intArray.length == 0) {
            throw new java.lang.IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(android.content.Context context, android.content.res.TypedArray typedArray) {
        int iA;
        if (typedArray.hasValue(p125m4.j.f50816N)) {
            iA = typedArray.getColor(p125m4.j.f50816N, -1);
        } else {
            this.f43494d = this.f43493c[0];
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f6 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            iA = p195t4.a.a(this.f43494d, (int) (f6 * 255.0f));
        }
        this.f43494d = iA;
    }

    public boolean a() {
        return this.f43496f != 0;
    }

    public boolean b() {
        return this.f43495e != 0;
    }

    void e() {
        if (this.f43497g < 0) {
            throw new java.lang.IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
