package S8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N {
    public static final byte a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.C cB = b(str);
        if (cB != null) {
            return cB.o();
        }
        S8.C.u(str);
        throw new p087i7.C6665k();
    }

    public static final p087i7.C b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return c(str, 10);
    }

    public static final p087i7.C c(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.E eG = g(str, i6);
        if (eG == null) {
            return null;
        }
        int iO = eG.o();
        if (java.lang.Integer.compare(iO ^ Integer.MIN_VALUE, p087i7.E.g(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return p087i7.C.e(p087i7.C.g((byte) iO));
    }

    public static final int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.E eF = f(str);
        if (eF != null) {
            return eF.o();
        }
        S8.C.u(str);
        throw new p087i7.C6665k();
    }

    public static final int e(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.E eG = g(str, i6);
        if (eG != null) {
            return eG.o();
        }
        S8.C.u(str);
        throw new p087i7.C6665k();
    }

    public static final p087i7.E f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return g(str, 10);
    }

    public static final p087i7.E g(java.lang.String str, int i6) {
        int i10;
        p247y7.AbstractC7350t.f(str, "<this>");
        S8.AbstractC1628a.a(i6);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (p247y7.AbstractC7350t.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int iG = p087i7.E.g(i6);
        int iA = 119304647;
        while (i10 < length) {
            int iB = S8.AbstractC1629b.b(str.charAt(i10), i6);
            if (iB < 0) {
                return null;
            }
            if (java.lang.Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = S8.M.a(-1, iG);
                    if (java.lang.Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iG2 = p087i7.E.g(i11 * iG);
            int iG3 = p087i7.E.g(p087i7.E.g(iB) + iG2);
            if (java.lang.Integer.compare(iG3 ^ Integer.MIN_VALUE, iG2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            i11 = iG3;
        }
        return p087i7.E.e(i11);
    }

    public static final long h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.G gI = i(str);
        if (gI != null) {
            return gI.q();
        }
        S8.C.u(str);
        throw new p087i7.C6665k();
    }

    public static final p087i7.G i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return j(str, 10);
    }

    public static final p087i7.G j(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        S8.AbstractC1628a.a(i6);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (p247y7.AbstractC7350t.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jG = p087i7.G.g(i6);
        long j6 = 0;
        long jA = 512409557603043100L;
        while (i10 < length) {
            int iB = S8.AbstractC1629b.b(str.charAt(i10), i6);
            if (iB < 0) {
                return null;
            }
            if (java.lang.Long.compare(j6 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = S8.K.a(-1L, jG);
                    if (java.lang.Long.compare(j6 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jG2 = p087i7.G.g(j6 * jG);
            long jG3 = p087i7.G.g(p087i7.G.g(((long) p087i7.E.g(iB)) & 4294967295L) + jG2);
            if (java.lang.Long.compare(jG3 ^ Long.MIN_VALUE, jG2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            j6 = jG3;
        }
        return p087i7.G.e(j6);
    }

    public static final short k(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.J jL = l(str);
        if (jL != null) {
            return jL.o();
        }
        S8.C.u(str);
        throw new p087i7.C6665k();
    }

    public static final p087i7.J l(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return m(str, 10);
    }

    public static final p087i7.J m(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p087i7.E eG = g(str, i6);
        if (eG == null) {
            return null;
        }
        int iO = eG.o();
        if (java.lang.Integer.compare(iO ^ Integer.MIN_VALUE, p087i7.E.g(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return p087i7.J.e(p087i7.J.g((short) iO));
    }
}
