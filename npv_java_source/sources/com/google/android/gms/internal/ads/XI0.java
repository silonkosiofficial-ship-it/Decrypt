package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class XI0 implements com.google.android.gms.internal.ads.IJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C2728Pm f33112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f33113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f33114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D[] f33115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33116e;

    public XI0(com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr, int i6) {
        int length = iArr.length;
        com.google.android.gms.internal.ads.LC.f(length > 0);
        c2728Pm.getClass();
        this.f33112a = c2728Pm;
        this.f33113b = length;
        this.f33115d = new com.google.android.gms.internal.ads.D[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f33115d[i10] = c2728Pm.b(iArr[i10]);
        }
        java.util.Arrays.sort(this.f33115d, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.WI0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.android.gms.internal.ads.D) obj2).f26569j - ((com.google.android.gms.internal.ads.D) obj).f26569j;
            }
        });
        this.f33114c = new int[this.f33113b];
        for (int i11 = 0; i11 < this.f33113b; i11++) {
            this.f33114c[i11] = c2728Pm.a(this.f33115d[i11]);
        }
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final com.google.android.gms.internal.ads.D F(int i6) {
        return this.f33115d[i6];
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final int G(int i6) {
        for (int i10 = 0; i10 < this.f33113b; i10++) {
            if (this.f33114c[i10] == i6) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.IJ0
    public final int b() {
        return this.f33114c[0];
    }

    @Override // com.google.android.gms.internal.ads.IJ0
    public final com.google.android.gms.internal.ads.D e() {
        return this.f33115d[0];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.XI0 xi0 = (com.google.android.gms.internal.ads.XI0) obj;
            if (this.f33112a.equals(xi0.f33112a) && java.util.Arrays.equals(this.f33114c, xi0.f33114c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final int f() {
        return this.f33114c.length;
    }

    public final int hashCode() {
        int i6 = this.f33116e;
        if (i6 != 0) {
            return i6;
        }
        int iIdentityHashCode = (java.lang.System.identityHashCode(this.f33112a) * 31) + java.util.Arrays.hashCode(this.f33114c);
        this.f33116e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final com.google.android.gms.internal.ads.C2728Pm i() {
        return this.f33112a;
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final int r(int i6) {
        return this.f33114c[i6];
    }
}
