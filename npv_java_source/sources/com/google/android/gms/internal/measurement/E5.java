package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class E5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.E5 f40494f = new com.google.android.gms.internal.measurement.E5(0, new int[0], new java.lang.Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f40496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object[] f40497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40499e;

    private E5() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private E5(int i6, int[] iArr, java.lang.Object[] objArr, boolean z6) {
        this.f40498d = -1;
        this.f40495a = i6;
        this.f40496b = iArr;
        this.f40497c = objArr;
        this.f40499e = z6;
    }

    static com.google.android.gms.internal.measurement.E5 c(com.google.android.gms.internal.measurement.E5 e6, com.google.android.gms.internal.measurement.E5 e10) {
        int i6 = e6.f40495a + e10.f40495a;
        int[] iArrCopyOf = java.util.Arrays.copyOf(e6.f40496b, i6);
        java.lang.System.arraycopy(e10.f40496b, 0, iArrCopyOf, e6.f40495a, e10.f40495a);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(e6.f40497c, i6);
        java.lang.System.arraycopy(e10.f40497c, 0, objArrCopyOf, e6.f40495a, e10.f40495a);
        return new com.google.android.gms.internal.measurement.E5(i6, iArrCopyOf, objArrCopyOf, true);
    }

    private final void d(int i6) {
        int[] iArr = this.f40496b;
        if (i6 > iArr.length) {
            int i10 = this.f40495a;
            int i11 = i10 + (i10 / 2);
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f40496b = java.util.Arrays.copyOf(iArr, i6);
            this.f40497c = java.util.Arrays.copyOf(this.f40497c, i6);
        }
    }

    private static void f(int i6, java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        int i10 = i6 >>> 3;
        int i11 = i6 & 7;
        if (i11 == 0) {
            x6.m(i10, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            x6.e(i10, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            x6.q(i10, (com.google.android.gms.internal.measurement.L3) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new java.lang.RuntimeException(com.google.android.gms.internal.measurement.C4.a());
            }
            x6.o(i10, ((java.lang.Integer) obj).intValue());
        } else if (x6.a() == 1) {
            x6.B(i10);
            ((com.google.android.gms.internal.measurement.E5) obj).j(x6);
            x6.r(i10);
        } else {
            x6.r(i10);
            ((com.google.android.gms.internal.measurement.E5) obj).j(x6);
            x6.B(i10);
        }
    }

    public static com.google.android.gms.internal.measurement.E5 k() {
        return f40494f;
    }

    static com.google.android.gms.internal.measurement.E5 l() {
        return new com.google.android.gms.internal.measurement.E5();
    }

    private final void n() {
        if (!this.f40499e) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final int a() {
        int iM0;
        int i6 = this.f40498d;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f40495a; i11++) {
            int i12 = this.f40496b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iM0 = com.google.android.gms.internal.measurement.AbstractC5982c4.m0(i13, ((java.lang.Long) this.f40497c[i11]).longValue());
            } else if (i14 == 1) {
                iM0 = com.google.android.gms.internal.measurement.AbstractC5982c4.P(i13, ((java.lang.Long) this.f40497c[i11]).longValue());
            } else if (i14 == 2) {
                iM0 = com.google.android.gms.internal.measurement.AbstractC5982c4.Q(i13, (com.google.android.gms.internal.measurement.L3) this.f40497c[i11]);
            } else if (i14 == 3) {
                iM0 = (com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i13) << 1) + ((com.google.android.gms.internal.measurement.E5) this.f40497c[i11]).a();
            } else {
                if (i14 != 5) {
                    throw new java.lang.IllegalStateException(com.google.android.gms.internal.measurement.C4.a());
                }
                iM0 = com.google.android.gms.internal.measurement.AbstractC5982c4.h0(i13, ((java.lang.Integer) this.f40497c[i11]).intValue());
            }
            i10 += iM0;
        }
        this.f40498d = i10;
        return i10;
    }

    final com.google.android.gms.internal.measurement.E5 b(com.google.android.gms.internal.measurement.E5 e6) {
        if (e6.equals(f40494f)) {
            return this;
        }
        n();
        int i6 = this.f40495a + e6.f40495a;
        d(i6);
        java.lang.System.arraycopy(e6.f40496b, 0, this.f40496b, this.f40495a, e6.f40495a);
        java.lang.System.arraycopy(e6.f40497c, 0, this.f40497c, this.f40495a, e6.f40495a);
        this.f40495a = i6;
        return this;
    }

    final void e(int i6, java.lang.Object obj) {
        n();
        d(this.f40495a + 1);
        int[] iArr = this.f40496b;
        int i10 = this.f40495a;
        iArr[i10] = i6;
        this.f40497c[i10] = obj;
        this.f40495a = i10 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.measurement.E5)) {
            return false;
        }
        com.google.android.gms.internal.measurement.E5 e6 = (com.google.android.gms.internal.measurement.E5) obj;
        int i6 = this.f40495a;
        if (i6 == e6.f40495a) {
            int[] iArr = this.f40496b;
            int[] iArr2 = e6.f40496b;
            for (int i10 = 0; i10 < i6; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            java.lang.Object[] objArr = this.f40497c;
            java.lang.Object[] objArr2 = e6.f40497c;
            int i11 = this.f40495a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g(com.google.android.gms.internal.measurement.X5 x6) {
        if (x6.a() == 2) {
            for (int i6 = this.f40495a - 1; i6 >= 0; i6--) {
                x6.w(this.f40496b[i6] >>> 3, this.f40497c[i6]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.f40495a; i10++) {
            x6.w(this.f40496b[i10] >>> 3, this.f40497c[i10]);
        }
    }

    final void h(java.lang.StringBuilder sb, int i6) {
        for (int i10 = 0; i10 < this.f40495a; i10++) {
            com.google.android.gms.internal.measurement.AbstractC5974b5.d(sb, i6, java.lang.String.valueOf(this.f40496b[i10] >>> 3), this.f40497c[i10]);
        }
    }

    public final int hashCode() {
        int i6 = this.f40495a;
        int i10 = (i6 + 527) * 31;
        int[] iArr = this.f40496b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i6; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        java.lang.Object[] objArr = this.f40497c;
        int i14 = this.f40495a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int i() {
        int i6 = this.f40498d;
        if (i6 != -1) {
            return i6;
        }
        int iZ = 0;
        for (int i10 = 0; i10 < this.f40495a; i10++) {
            iZ += com.google.android.gms.internal.measurement.AbstractC5982c4.Z(this.f40496b[i10] >>> 3, (com.google.android.gms.internal.measurement.L3) this.f40497c[i10]);
        }
        this.f40498d = iZ;
        return iZ;
    }

    public final void j(com.google.android.gms.internal.measurement.X5 x6) {
        if (this.f40495a == 0) {
            return;
        }
        if (x6.a() == 1) {
            for (int i6 = 0; i6 < this.f40495a; i6++) {
                f(this.f40496b[i6], this.f40497c[i6], x6);
            }
            return;
        }
        for (int i10 = this.f40495a - 1; i10 >= 0; i10--) {
            f(this.f40496b[i10], this.f40497c[i10], x6);
        }
    }

    public final void m() {
        if (this.f40499e) {
            this.f40499e = false;
        }
    }
}
