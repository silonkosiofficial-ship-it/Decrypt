package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3883h5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f35990c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35988a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35989b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35991d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35992e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35993f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35994g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35995h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35996i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35997j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35998k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public final com.google.android.gms.internal.ads.C2185Ax a() {
        android.text.Layout.Alignment alignment;
        float f6 = this.f35995h;
        float f10 = -3.4028235E38f;
        if (f6 == -3.4028235E38f) {
            int i6 = this.f35991d;
            if (i6 != 4) {
                f6 = i6 != 5 ? 0.5f : 1.0f;
            } else {
                f6 = 0.0f;
            }
        }
        int i10 = this.f35996i;
        if (i10 == Integer.MIN_VALUE) {
            int i11 = this.f35991d;
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 3) {
                i10 = 2;
            } else if (i11 == 4) {
                i10 = 0;
            } else if (i11 != 5) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        }
        com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
        int i12 = this.f35991d;
        if (i12 == 1) {
            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (i12 == 2) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        } else if (i12 == 3) {
            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i12 == 4) {
            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (i12 != 5) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("WebvttCueParser", "Unknown textAlignment: " + i12);
            alignment = null;
        } else {
            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        c2185Ax.m(alignment);
        float f11 = this.f35992e;
        int i13 = this.f35993f;
        if (f11 != -3.4028235E38f && i13 == 0 && (f11 < 0.0f || f11 > 1.0f)) {
            f10 = 1.0f;
        } else if (f11 != -3.4028235E38f) {
            f10 = f11;
        } else if (i13 == 0) {
            f10 = 1.0f;
        }
        c2185Ax.e(f10, i13);
        c2185Ax.f(this.f35994g);
        c2185Ax.h(f6);
        c2185Ax.i(i10);
        float f12 = this.f35997j;
        if (i10 == 0) {
            f6 = 1.0f - f6;
        } else if (i10 != 1) {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(i10));
            }
        } else if (f6 <= 0.5f) {
            f6 += f6;
        } else {
            float f13 = 1.0f - f6;
            f6 = f13 + f13;
        }
        c2185Ax.k(java.lang.Math.min(f12, f6));
        c2185Ax.o(this.f35998k);
        java.lang.CharSequence charSequence = this.f35990c;
        if (charSequence != null) {
            c2185Ax.l(charSequence);
        }
        return c2185Ax;
    }
}
