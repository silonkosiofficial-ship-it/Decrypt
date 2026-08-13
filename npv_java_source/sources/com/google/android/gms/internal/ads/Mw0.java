package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Mw0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Mw0 f30110f = new com.google.android.gms.internal.ads.Mw0(0, new int[0], new java.lang.Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f30112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object[] f30113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30115e;

    private Mw0() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private Mw0(int i6, int[] iArr, java.lang.Object[] objArr, boolean z6) {
        this.f30114d = -1;
        this.f30111a = i6;
        this.f30112b = iArr;
        this.f30113c = objArr;
        this.f30115e = z6;
    }

    public static com.google.android.gms.internal.ads.Mw0 c() {
        return f30110f;
    }

    static com.google.android.gms.internal.ads.Mw0 e(com.google.android.gms.internal.ads.Mw0 mw0, com.google.android.gms.internal.ads.Mw0 mw1) {
        int i6 = mw0.f30111a + mw1.f30111a;
        int[] iArrCopyOf = java.util.Arrays.copyOf(mw0.f30112b, i6);
        java.lang.System.arraycopy(mw1.f30112b, 0, iArrCopyOf, mw0.f30111a, mw1.f30111a);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(mw0.f30113c, i6);
        java.lang.System.arraycopy(mw1.f30113c, 0, objArrCopyOf, mw0.f30111a, mw1.f30111a);
        return new com.google.android.gms.internal.ads.Mw0(i6, iArrCopyOf, objArrCopyOf, true);
    }

    static com.google.android.gms.internal.ads.Mw0 f() {
        return new com.google.android.gms.internal.ads.Mw0();
    }

    private final void l(int i6) {
        int[] iArr = this.f30112b;
        if (i6 > iArr.length) {
            int i10 = this.f30111a;
            int i11 = i10 + (i10 / 2);
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f30112b = java.util.Arrays.copyOf(iArr, i6);
            this.f30113c = java.util.Arrays.copyOf(this.f30113c, i6);
        }
    }

    public final int a() {
        int iE;
        int iF;
        int iE2;
        int i6 = this.f30114d;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f30111a; i11++) {
            int i12 = this.f30112b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((java.lang.Long) this.f30113c[i11]).longValue();
                    iE2 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = (com.google.android.gms.internal.ads.AbstractC3753fv0) this.f30113c[i11];
                    int iE3 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(i15);
                    int iN = abstractC3753fv0.n();
                    iE2 = iE3 + com.google.android.gms.internal.ads.AbstractC5070rv0.e(iN) + iN;
                } else if (i14 == 3) {
                    int iE4 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(i13 << 3);
                    iE = iE4 + iE4;
                    iF = ((com.google.android.gms.internal.ads.Mw0) this.f30113c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new java.lang.IllegalStateException(new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type."));
                    }
                    ((java.lang.Integer) this.f30113c[i11]).intValue();
                    iE2 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(i13 << 3) + 4;
                }
                i10 += iE2;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((java.lang.Long) this.f30113c[i11]).longValue();
                iE = com.google.android.gms.internal.ads.AbstractC5070rv0.e(i16);
                iF = com.google.android.gms.internal.ads.AbstractC5070rv0.f(jLongValue);
            }
            iE2 = iE + iF;
            i10 += iE2;
        }
        this.f30114d = i10;
        return i10;
    }

    public final int b() {
        int i6 = this.f30114d;
        if (i6 != -1) {
            return i6;
        }
        int iE = 0;
        for (int i10 = 0; i10 < this.f30111a; i10++) {
            int i11 = this.f30112b[i10] >>> 3;
            com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = (com.google.android.gms.internal.ads.AbstractC3753fv0) this.f30113c[i10];
            int iE2 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(8);
            int iE3 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(16) + com.google.android.gms.internal.ads.AbstractC5070rv0.e(i11);
            int iE4 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(24);
            int iN = abstractC3753fv0.n();
            iE += iE2 + iE2 + iE3 + iE4 + com.google.android.gms.internal.ads.AbstractC5070rv0.e(iN) + iN;
        }
        this.f30114d = iE;
        return iE;
    }

    final com.google.android.gms.internal.ads.Mw0 d(com.google.android.gms.internal.ads.Mw0 mw0) {
        if (mw0.equals(f30110f)) {
            return this;
        }
        g();
        int i6 = this.f30111a + mw0.f30111a;
        l(i6);
        java.lang.System.arraycopy(mw0.f30112b, 0, this.f30112b, this.f30111a, mw0.f30111a);
        java.lang.System.arraycopy(mw0.f30113c, 0, this.f30113c, this.f30111a, mw0.f30111a);
        this.f30111a = i6;
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.ads.Mw0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Mw0 mw0 = (com.google.android.gms.internal.ads.Mw0) obj;
        int i6 = this.f30111a;
        if (i6 == mw0.f30111a) {
            int[] iArr = this.f30112b;
            int[] iArr2 = mw0.f30112b;
            for (int i10 = 0; i10 < i6; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            java.lang.Object[] objArr = this.f30113c;
            java.lang.Object[] objArr2 = mw0.f30113c;
            int i11 = this.f30111a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f30115e) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f30115e) {
            this.f30115e = false;
        }
    }

    public final int hashCode() {
        int i6 = this.f30111a;
        int i10 = i6 + 527;
        int[] iArr = this.f30112b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i6; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        java.lang.Object[] objArr = this.f30113c;
        int i14 = this.f30111a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    final void i(java.lang.StringBuilder sb, int i6) {
        for (int i10 = 0; i10 < this.f30111a; i10++) {
            com.google.android.gms.internal.ads.AbstractC4743ow0.b(sb, i6, java.lang.String.valueOf(this.f30112b[i10] >>> 3), this.f30113c[i10]);
        }
    }

    final void j(int i6, java.lang.Object obj) {
        g();
        l(this.f30111a + 1);
        int[] iArr = this.f30112b;
        int i10 = this.f30111a;
        iArr[i10] = i6;
        this.f30113c[i10] = obj;
        this.f30111a = i10 + 1;
    }

    public final void k(com.google.android.gms.internal.ads.Yw0 yw0) {
        if (this.f30111a != 0) {
            for (int i6 = 0; i6 < this.f30111a; i6++) {
                int i10 = this.f30112b[i6];
                java.lang.Object obj = this.f30113c[i6];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    yw0.o(i12, ((java.lang.Long) obj).longValue());
                } else if (i11 == 1) {
                    yw0.E(i12, ((java.lang.Long) obj).longValue());
                } else if (i11 == 2) {
                    yw0.J(i12, (com.google.android.gms.internal.ads.AbstractC3753fv0) obj);
                } else if (i11 == 3) {
                    yw0.H(i12);
                    ((com.google.android.gms.internal.ads.Mw0) obj).k(yw0);
                    yw0.L(i12);
                } else {
                    if (i11 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type."));
                    }
                    yw0.m(i12, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }
}
