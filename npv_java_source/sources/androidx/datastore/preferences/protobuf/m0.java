package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.m0 f22064f = new androidx.datastore.preferences.protobuf.m0(0, new int[0], new java.lang.Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f22066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object[] f22067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22069e;

    private m0() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private m0(int i6, int[] iArr, java.lang.Object[] objArr, boolean z6) {
        this.f22068d = -1;
        this.f22065a = i6;
        this.f22066b = iArr;
        this.f22067c = objArr;
        this.f22069e = z6;
    }

    private void b(int i6) {
        int[] iArr = this.f22066b;
        if (i6 > iArr.length) {
            int i10 = this.f22065a;
            int i11 = i10 + (i10 / 2);
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f22066b = java.util.Arrays.copyOf(iArr, i6);
            this.f22067c = java.util.Arrays.copyOf(this.f22067c, i6);
        }
    }

    public static androidx.datastore.preferences.protobuf.m0 c() {
        return f22064f;
    }

    private static int f(int[] iArr, int i6) {
        int i10 = 17;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        return i10;
    }

    private static int g(java.lang.Object[] objArr, int i6) {
        int iHashCode = 17;
        for (int i10 = 0; i10 < i6; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return iHashCode;
    }

    static androidx.datastore.preferences.protobuf.m0 j(androidx.datastore.preferences.protobuf.m0 m0Var, androidx.datastore.preferences.protobuf.m0 m0Var2) {
        int i6 = m0Var.f22065a + m0Var2.f22065a;
        int[] iArrCopyOf = java.util.Arrays.copyOf(m0Var.f22066b, i6);
        java.lang.System.arraycopy(m0Var2.f22066b, 0, iArrCopyOf, m0Var.f22065a, m0Var2.f22065a);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(m0Var.f22067c, i6);
        java.lang.System.arraycopy(m0Var2.f22067c, 0, objArrCopyOf, m0Var.f22065a, m0Var2.f22065a);
        return new androidx.datastore.preferences.protobuf.m0(i6, iArrCopyOf, objArrCopyOf, true);
    }

    static androidx.datastore.preferences.protobuf.m0 k() {
        return new androidx.datastore.preferences.protobuf.m0();
    }

    private static boolean l(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            if (!objArr[i10].equals(objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i6, java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        int iA = androidx.datastore.preferences.protobuf.r0.a(i6);
        int iB = androidx.datastore.preferences.protobuf.r0.b(i6);
        if (iB == 0) {
            s0Var.p(iA, ((java.lang.Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            s0Var.h(iA, ((java.lang.Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            s0Var.w(iA, (androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new java.lang.RuntimeException(androidx.datastore.preferences.protobuf.C2065z.e());
            }
            s0Var.d(iA, ((java.lang.Integer) obj).intValue());
        } else if (s0Var.i() == androidx.datastore.preferences.protobuf.s0.a.ASCENDING) {
            s0Var.s(iA);
            ((androidx.datastore.preferences.protobuf.m0) obj).r(s0Var);
            s0Var.F(iA);
        } else {
            s0Var.F(iA);
            ((androidx.datastore.preferences.protobuf.m0) obj).r(s0Var);
            s0Var.s(iA);
        }
    }

    void a() {
        if (!this.f22069e) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i6 = this.f22068d;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f22065a; i11++) {
            int i12 = this.f22066b[i11];
            int iA = androidx.datastore.preferences.protobuf.r0.a(i12);
            int iB = androidx.datastore.preferences.protobuf.r0.b(i12);
            if (iB == 0) {
                iR = androidx.datastore.preferences.protobuf.AbstractC2050j.R(iA, ((java.lang.Long) this.f22067c[i11]).longValue());
            } else if (iB == 1) {
                iR = androidx.datastore.preferences.protobuf.AbstractC2050j.n(iA, ((java.lang.Long) this.f22067c[i11]).longValue());
            } else if (iB == 2) {
                iR = androidx.datastore.preferences.protobuf.AbstractC2050j.f(iA, (androidx.datastore.preferences.protobuf.AbstractC2047g) this.f22067c[i11]);
            } else if (iB == 3) {
                iR = (androidx.datastore.preferences.protobuf.AbstractC2050j.O(iA) * 2) + ((androidx.datastore.preferences.protobuf.m0) this.f22067c[i11]).d();
            } else {
                if (iB != 5) {
                    throw new java.lang.IllegalStateException(androidx.datastore.preferences.protobuf.C2065z.e());
                }
                iR = androidx.datastore.preferences.protobuf.AbstractC2050j.l(iA, ((java.lang.Integer) this.f22067c[i11]).intValue());
            }
            i10 += iR;
        }
        this.f22068d = i10;
        return i10;
    }

    public int e() {
        int i6 = this.f22068d;
        if (i6 != -1) {
            return i6;
        }
        int iD = 0;
        for (int i10 = 0; i10 < this.f22065a; i10++) {
            iD += androidx.datastore.preferences.protobuf.AbstractC2050j.D(androidx.datastore.preferences.protobuf.r0.a(this.f22066b[i10]), (androidx.datastore.preferences.protobuf.AbstractC2047g) this.f22067c[i10]);
        }
        this.f22068d = iD;
        return iD;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.datastore.preferences.protobuf.m0)) {
            return false;
        }
        androidx.datastore.preferences.protobuf.m0 m0Var = (androidx.datastore.preferences.protobuf.m0) obj;
        int i6 = this.f22065a;
        return i6 == m0Var.f22065a && o(this.f22066b, m0Var.f22066b, i6) && l(this.f22067c, m0Var.f22067c, this.f22065a);
    }

    public void h() {
        this.f22069e = false;
    }

    public int hashCode() {
        int i6 = this.f22065a;
        return ((((527 + i6) * 31) + f(this.f22066b, i6)) * 31) + g(this.f22067c, this.f22065a);
    }

    androidx.datastore.preferences.protobuf.m0 i(androidx.datastore.preferences.protobuf.m0 m0Var) {
        if (m0Var.equals(c())) {
            return this;
        }
        a();
        int i6 = this.f22065a + m0Var.f22065a;
        b(i6);
        java.lang.System.arraycopy(m0Var.f22066b, 0, this.f22066b, this.f22065a, m0Var.f22065a);
        java.lang.System.arraycopy(m0Var.f22067c, 0, this.f22067c, this.f22065a, m0Var.f22065a);
        this.f22065a = i6;
        return this;
    }

    final void m(java.lang.StringBuilder sb, int i6) {
        for (int i10 = 0; i10 < this.f22065a; i10++) {
            androidx.datastore.preferences.protobuf.Q.d(sb, i6, java.lang.String.valueOf(androidx.datastore.preferences.protobuf.r0.a(this.f22066b[i10])), this.f22067c[i10]);
        }
    }

    void n(int i6, java.lang.Object obj) {
        a();
        b(this.f22065a + 1);
        int[] iArr = this.f22066b;
        int i10 = this.f22065a;
        iArr[i10] = i6;
        this.f22067c[i10] = obj;
        this.f22065a = i10 + 1;
    }

    void p(androidx.datastore.preferences.protobuf.s0 s0Var) {
        if (s0Var.i() == androidx.datastore.preferences.protobuf.s0.a.DESCENDING) {
            for (int i6 = this.f22065a - 1; i6 >= 0; i6--) {
                s0Var.c(androidx.datastore.preferences.protobuf.r0.a(this.f22066b[i6]), this.f22067c[i6]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.f22065a; i10++) {
            s0Var.c(androidx.datastore.preferences.protobuf.r0.a(this.f22066b[i10]), this.f22067c[i10]);
        }
    }

    public void r(androidx.datastore.preferences.protobuf.s0 s0Var) {
        if (this.f22065a == 0) {
            return;
        }
        if (s0Var.i() == androidx.datastore.preferences.protobuf.s0.a.ASCENDING) {
            for (int i6 = 0; i6 < this.f22065a; i6++) {
                q(this.f22066b[i6], this.f22067c[i6], s0Var);
            }
            return;
        }
        for (int i10 = this.f22065a - 1; i10 >= 0; i10--) {
            q(this.f22066b[i10], this.f22067c[i10], s0Var);
        }
    }
}
