package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f43060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43061b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr2[i6] = iArr[i6] * 2;
        }
        return iArr2;
    }

    static float b(float f6, float f10, float f11) {
        return 1.0f - ((f6 - f11) / (f10 - f11));
    }

    public float c() {
        return this.f43061b;
    }

    public float d() {
        return this.f43060a;
    }

    void e(android.content.Context context) {
        float fH = this.f43060a;
        if (fH <= 0.0f) {
            fH = com.google.android.material.carousel.e.h(context);
        }
        this.f43060a = fH;
        float fG = this.f43061b;
        if (fG <= 0.0f) {
            fG = com.google.android.material.carousel.e.g(context);
        }
        this.f43061b = fG;
    }

    boolean f() {
        return true;
    }

    abstract com.google.android.material.carousel.f g(com.google.android.material.carousel.b bVar, android.view.View view);

    abstract boolean h(com.google.android.material.carousel.b bVar, int i6);
}
