package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final X9.C1839g f16576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X9.C1839g f16577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X9.C1839g f16578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X9.C1839g f16579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X9.C1839g f16580e;

    static {
        X9.C1839g.a aVar = X9.C1839g.f16149F;
        f16576a = aVar.c("/");
        f16577b = aVar.c("\\");
        f16578c = aVar.c("/\\");
        f16579d = aVar.c(".");
        f16580e = aVar.c("..");
    }

    public static final X9.Q j(X9.Q q6, X9.Q q10, boolean z6) {
        p247y7.AbstractC7350t.f(q6, "<this>");
        p247y7.AbstractC7350t.f(q10, "child");
        if (q10.n() || q10.z() != null) {
            return q10;
        }
        X9.C1839g c1839gM = m(q6);
        if (c1839gM == null && (c1839gM = m(q10)) == null) {
            c1839gM = s(X9.Q.f16084E);
        }
        X9.C1836d c1836d = new X9.C1836d();
        c1836d.h1(q6.g());
        if (c1836d.d1() > 0) {
            c1836d.h1(c1839gM);
        }
        c1836d.h1(q10.g());
        return q(c1836d, z6);
    }

    public static final X9.Q k(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return q(new X9.C1836d().t0(str), z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(X9.Q q6) {
        int iB = X9.C1839g.B(q6.g(), f16576a, 0, 2, null);
        return iB != -1 ? iB : X9.C1839g.B(q6.g(), f16577b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X9.C1839g m(X9.Q q6) {
        X9.C1839g c1839gG = q6.g();
        X9.C1839g c1839g = f16576a;
        if (X9.C1839g.w(c1839gG, c1839g, 0, 2, null) != -1) {
            return c1839g;
        }
        X9.C1839g c1839gG2 = q6.g();
        X9.C1839g c1839g2 = f16577b;
        if (X9.C1839g.w(c1839gG2, c1839g2, 0, 2, null) != -1) {
            return c1839g2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(X9.Q q6) {
        return q6.g().m(f16580e) && (q6.g().I() == 2 || q6.g().C(q6.g().I() + (-3), f16576a, 0, 1) || q6.g().C(q6.g().I() + (-3), f16577b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(X9.Q q6) {
        if (q6.g().I() == 0) {
            return -1;
        }
        if (q6.g().n(0) == 47) {
            return 1;
        }
        if (q6.g().n(0) == 92) {
            if (q6.g().I() <= 2 || q6.g().n(1) != 92) {
                return 1;
            }
            int iU = q6.g().u(f16577b, 2);
            return iU == -1 ? q6.g().I() : iU;
        }
        if (q6.g().I() > 2 && q6.g().n(1) == 58 && q6.g().n(2) == 92) {
            char cN = (char) q6.g().n(0);
            if ('a' <= cN && cN < '{') {
                return 3;
            }
            if ('A' <= cN && cN < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(X9.C1836d c1836d, X9.C1839g c1839g) {
        if (!p247y7.AbstractC7350t.b(c1839g, f16577b) || c1836d.d1() < 2 || c1836d.r0(1L) != 58) {
            return false;
        }
        char cR0 = (char) c1836d.r0(0L);
        return ('a' <= cR0 && cR0 < '{') || ('A' <= cR0 && cR0 < '[');
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a8 A[SYNTHETIC] */
    public static final X9.Q q(X9.C1836d c1836d, boolean z6) throws java.io.EOFException {
        X9.C1839g c1839g;
        boolean z10;
        java.util.ArrayList arrayList;
        int size;
        long jH0;
        X9.C1839g c1839gA;
        X9.C1839g c1839g2;
        p247y7.AbstractC7350t.f(c1836d, "<this>");
        X9.C1836d c1836d2 = new X9.C1836d();
        X9.C1839g c1839gR = null;
        int i6 = 0;
        while (true) {
            if (!c1836d.x0(0L, f16576a)) {
                c1839g = f16577b;
                if (!c1836d.x0(0L, c1839g)) {
                    break;
                }
            }
            byte bM = c1836d.m();
            if (c1839gR == null) {
                c1839gR = r(bM);
            }
            i6++;
        }
        boolean z11 = i6 >= 2 && p247y7.AbstractC7350t.b(c1839gR, c1839g);
        if (!z11) {
            if (i6 > 0) {
                p247y7.AbstractC7350t.c(c1839gR);
            } else {
                long jH1 = c1836d.h0(f16578c);
                if (c1839gR == null) {
                    c1839gR = jH1 == -1 ? s(X9.Q.f16084E) : r(c1836d.r0(jH1));
                }
                if (p(c1836d, c1839gR)) {
                    if (jH1 == 2) {
                        c1836d2.F0(c1836d, 3L);
                    } else {
                        c1836d2.F0(c1836d, 2L);
                    }
                }
            }
            if (c1836d2.d1() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList = new java.util.ArrayList();
            while (!c1836d.j()) {
                jH0 = c1836d.h0(f16578c);
                if (jH0 == -1) {
                    c1839gA = c1836d.P0();
                } else {
                    c1839gA = c1836d.A(jH0);
                    c1836d.m();
                }
                c1839g2 = f16580e;
                if (p247y7.AbstractC7350t.b(c1839gA, c1839g2)) {
                    if (z10 || !arrayList.isEmpty()) {
                        if (z6 || (!z10 && (arrayList.isEmpty() || p247y7.AbstractC7350t.b(p097j7.AbstractC6879v.t0(arrayList), c1839g2)))) {
                            arrayList.add(c1839gA);
                        } else if (!z11 || arrayList.size() != 1) {
                            p097j7.AbstractC6879v.M(arrayList);
                        }
                    }
                } else if (p247y7.AbstractC7350t.b(c1839gA, f16579d) && !p247y7.AbstractC7350t.b(c1839gA, X9.C1839g.f16150G)) {
                    arrayList.add(c1839gA);
                }
            }
            size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    c1836d2.h1(c1839gR);
                }
                c1836d2.h1((X9.C1839g) arrayList.get(i10));
            }
            if (c1836d2.d1() == 0) {
                c1836d2.h1(f16579d);
            }
            return new X9.Q(c1836d2.P0());
        }
        p247y7.AbstractC7350t.c(c1839gR);
        c1836d2.h1(c1839gR);
        c1836d2.h1(c1839gR);
        if (c1836d2.d1() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList = new java.util.ArrayList();
        while (!c1836d.j()) {
            jH0 = c1836d.h0(f16578c);
            if (jH0 == -1) {
                c1839gA = c1836d.P0();
            } else {
                c1839gA = c1836d.A(jH0);
                c1836d.m();
            }
            c1839g2 = f16580e;
            if (p247y7.AbstractC7350t.b(c1839gA, c1839g2)) {
                if (z10) {
                }
                if (z6) {
                }
                arrayList.add(c1839gA);
            } else if (p247y7.AbstractC7350t.b(c1839gA, f16579d)) {
            }
        }
        size = arrayList.size();
        while (i10 < size) {
            if (i10 > 0) {
                c1836d2.h1(c1839gR);
            }
            c1836d2.h1((X9.C1839g) arrayList.get(i10));
        }
        if (c1836d2.d1() == 0) {
            c1836d2.h1(f16579d);
        }
        return new X9.Q(c1836d2.P0());
    }

    private static final X9.C1839g r(byte b6) {
        if (b6 == 47) {
            return f16576a;
        }
        if (b6 == 92) {
            return f16577b;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: " + ((int) b6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X9.C1839g s(java.lang.String str) {
        if (p247y7.AbstractC7350t.b(str, "/")) {
            return f16576a;
        }
        if (p247y7.AbstractC7350t.b(str, "\\")) {
            return f16577b;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: " + str);
    }
}
