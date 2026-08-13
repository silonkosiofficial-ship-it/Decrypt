package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class A3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.A3 f41320f = new com.google.android.gms.internal.play_billing.A3(0, new int[0], new java.lang.Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f41322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object[] f41323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41324d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41325e;

    private A3(int i6, int[] iArr, java.lang.Object[] objArr, boolean z6) {
        this.f41321a = i6;
        this.f41322b = iArr;
        this.f41323c = objArr;
        this.f41325e = z6;
    }

    public static com.google.android.gms.internal.play_billing.A3 c() {
        return f41320f;
    }

    static com.google.android.gms.internal.play_billing.A3 e(com.google.android.gms.internal.play_billing.A3 a6, com.google.android.gms.internal.play_billing.A3 a10) {
        int i6 = a6.f41321a + a10.f41321a;
        int[] iArrCopyOf = java.util.Arrays.copyOf(a6.f41322b, i6);
        java.lang.System.arraycopy(a10.f41322b, 0, iArrCopyOf, a6.f41321a, a10.f41321a);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(a6.f41323c, i6);
        java.lang.System.arraycopy(a10.f41323c, 0, objArrCopyOf, a6.f41321a, a10.f41321a);
        return new com.google.android.gms.internal.play_billing.A3(i6, iArrCopyOf, objArrCopyOf, true);
    }

    static com.google.android.gms.internal.play_billing.A3 f() {
        return new com.google.android.gms.internal.play_billing.A3(0, new int[8], new java.lang.Object[8], true);
    }

    private final void l(int i6) {
        int[] iArr = this.f41322b;
        if (i6 > iArr.length) {
            int i10 = this.f41321a;
            int i11 = i10 + (i10 / 2);
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f41322b = java.util.Arrays.copyOf(iArr, i6);
            this.f41323c = java.util.Arrays.copyOf(this.f41323c, i6);
        }
    }

    public final int a() {
        int iZ;
        int iA;
        int iZ2;
        int i6 = this.f41324d;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f41321a; i11++) {
            int i12 = this.f41322b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((java.lang.Long) this.f41323c[i11]).longValue();
                    iZ2 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2 = (com.google.android.gms.internal.play_billing.AbstractC6268o2) this.f41323c[i11];
                    int iZ3 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i15);
                    int iF = abstractC6268o2.f();
                    iZ2 = iZ3 + com.google.android.gms.internal.play_billing.AbstractC6309v2.z(iF) + iF;
                } else if (i14 == 3) {
                    int iZ4 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i13 << 3);
                    iZ = iZ4 + iZ4;
                    iA = ((com.google.android.gms.internal.play_billing.A3) this.f41323c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new java.lang.IllegalStateException(new com.google.android.gms.internal.play_billing.R2("Protocol message tag had invalid wire type."));
                    }
                    ((java.lang.Integer) this.f41323c[i11]).intValue();
                    iZ2 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i13 << 3) + 4;
                }
                i10 += iZ2;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((java.lang.Long) this.f41323c[i11]).longValue();
                iZ = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i16);
                iA = com.google.android.gms.internal.play_billing.AbstractC6309v2.a(jLongValue);
            }
            iZ2 = iZ + iA;
            i10 += iZ2;
        }
        this.f41324d = i10;
        return i10;
    }

    public final int b() {
        int i6 = this.f41324d;
        if (i6 != -1) {
            return i6;
        }
        int iZ = 0;
        for (int i10 = 0; i10 < this.f41321a; i10++) {
            int i11 = this.f41322b[i10] >>> 3;
            com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2 = (com.google.android.gms.internal.play_billing.AbstractC6268o2) this.f41323c[i10];
            int iZ2 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(8);
            int iZ3 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(16) + com.google.android.gms.internal.play_billing.AbstractC6309v2.z(i11);
            int iZ4 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(24);
            int iF = abstractC6268o2.f();
            iZ += iZ2 + iZ2 + iZ3 + iZ4 + com.google.android.gms.internal.play_billing.AbstractC6309v2.z(iF) + iF;
        }
        this.f41324d = iZ;
        return iZ;
    }

    final com.google.android.gms.internal.play_billing.A3 d(com.google.android.gms.internal.play_billing.A3 a6) {
        if (a6.equals(f41320f)) {
            return this;
        }
        g();
        int i6 = this.f41321a + a6.f41321a;
        l(i6);
        java.lang.System.arraycopy(a6.f41322b, 0, this.f41322b, this.f41321a, a6.f41321a);
        java.lang.System.arraycopy(a6.f41323c, 0, this.f41323c, this.f41321a, a6.f41321a);
        this.f41321a = i6;
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.play_billing.A3)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.A3 a6 = (com.google.android.gms.internal.play_billing.A3) obj;
        int i6 = this.f41321a;
        if (i6 == a6.f41321a) {
            int[] iArr = this.f41322b;
            int[] iArr2 = a6.f41322b;
            for (int i10 = 0; i10 < i6; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            java.lang.Object[] objArr = this.f41323c;
            java.lang.Object[] objArr2 = a6.f41323c;
            int i11 = this.f41321a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f41325e) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f41325e) {
            this.f41325e = false;
        }
    }

    public final int hashCode() {
        int i6 = this.f41321a;
        int i10 = i6 + 527;
        int[] iArr = this.f41322b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i6; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        java.lang.Object[] objArr = this.f41323c;
        int i14 = this.f41321a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    final void i(java.lang.StringBuilder sb, int i6) {
        for (int i10 = 0; i10 < this.f41321a; i10++) {
            com.google.android.gms.internal.play_billing.AbstractC6245k3.b(sb, i6, java.lang.String.valueOf(this.f41322b[i10] >>> 3), this.f41323c[i10]);
        }
    }

    final void j(int i6, java.lang.Object obj) {
        g();
        l(this.f41321a + 1);
        int[] iArr = this.f41322b;
        int i10 = this.f41321a;
        iArr[i10] = i6;
        this.f41323c[i10] = obj;
        this.f41321a = i10 + 1;
    }

    public final void k(com.google.android.gms.internal.play_billing.K3 k6) {
        if (this.f41321a != 0) {
            for (int i6 = 0; i6 < this.f41321a; i6++) {
                int i10 = this.f41322b[i6];
                java.lang.Object obj = this.f41323c[i6];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    k6.o(i12, ((java.lang.Long) obj).longValue());
                } else if (i11 == 1) {
                    k6.E(i12, ((java.lang.Long) obj).longValue());
                } else if (i11 == 2) {
                    k6.I(i12, (com.google.android.gms.internal.play_billing.AbstractC6268o2) obj);
                } else if (i11 == 3) {
                    k6.H(i12);
                    ((com.google.android.gms.internal.play_billing.A3) obj).k(k6);
                    k6.L(i12);
                } else {
                    if (i11 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.gms.internal.play_billing.R2("Protocol message tag had invalid wire type."));
                    }
                    k6.m(i12, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }
}
