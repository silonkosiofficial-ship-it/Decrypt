package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class Q implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final X9.Q.a f16083D = new X9.Q.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final java.lang.String f16084E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.C1839g f16085C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ X9.Q d(X9.Q.a aVar, java.io.File file, boolean z6, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                z6 = false;
            }
            return aVar.a(file, z6);
        }

        public static /* synthetic */ X9.Q e(X9.Q.a aVar, java.lang.String str, boolean z6, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                z6 = false;
            }
            return aVar.b(str, z6);
        }

        public static /* synthetic */ X9.Q f(X9.Q.a aVar, java.nio.file.Path path, boolean z6, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                z6 = false;
            }
            return aVar.c(path, z6);
        }

        public final X9.Q a(java.io.File file, boolean z6) {
            p247y7.AbstractC7350t.f(file, "<this>");
            java.lang.String string = file.toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return b(string, z6);
        }

        public final X9.Q b(java.lang.String str, boolean z6) {
            p247y7.AbstractC7350t.f(str, "<this>");
            return Y9.d.k(str, z6);
        }

        public final X9.Q c(java.nio.file.Path path, boolean z6) {
            p247y7.AbstractC7350t.f(path, "<this>");
            return b(path.toString(), z6);
        }
    }

    static {
        java.lang.String str = java.io.File.separator;
        p247y7.AbstractC7350t.e(str, "separator");
        f16084E = str;
    }

    public Q(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        this.f16085C = c1839g;
    }

    public static /* synthetic */ X9.Q w(X9.Q q6, X9.Q q10, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return q6.u(q10, z6);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "other");
        return g().compareTo(q6.g());
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof X9.Q) && p247y7.AbstractC7350t.b(((X9.Q) obj).g(), g());
    }

    public final X9.C1839g g() {
        return this.f16085C;
    }

    public int hashCode() {
        return g().hashCode();
    }

    public final X9.Q i() {
        int iO = Y9.d.o(this);
        if (iO == -1) {
            return null;
        }
        return new X9.Q(g().K(0, iO));
    }

    public final java.util.List m() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iO = Y9.d.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < g().I() && g().n(iO) == 92) {
            iO++;
        }
        int I10 = g().I();
        int i6 = iO;
        while (iO < I10) {
            if (g().n(iO) == 47 || g().n(iO) == 92) {
                arrayList.add(g().K(i6, iO));
                i6 = iO + 1;
            }
            iO++;
        }
        if (i6 < g().I()) {
            arrayList.add(g().K(i6, g().I()));
        }
        return arrayList;
    }

    public final boolean n() {
        return Y9.d.o(this) != -1;
    }

    public final java.lang.String o() {
        return q().O();
    }

    public final X9.C1839g q() {
        int iL = Y9.d.l(this);
        if (iL != -1) {
            return X9.C1839g.L(g(), iL + 1, 0, 2, null);
        }
        return (z() == null || g().I() != 2) ? g() : X9.C1839g.f16150G;
    }

    public final X9.Q r() {
        return f16083D.b(toString(), true);
    }

    public final X9.Q s() {
        X9.Q q6;
        if (p247y7.AbstractC7350t.b(g(), Y9.d.f16579d) || p247y7.AbstractC7350t.b(g(), Y9.d.f16576a) || p247y7.AbstractC7350t.b(g(), Y9.d.f16577b) || Y9.d.n(this)) {
            return null;
        }
        int iL = Y9.d.l(this);
        if (iL != 2 || z() == null) {
            if (iL == 1 && g().J(Y9.d.f16577b)) {
                return null;
            }
            if (iL != -1 || z() == null) {
                if (iL == -1) {
                    return new X9.Q(Y9.d.f16579d);
                }
                if (iL != 0) {
                    return new X9.Q(X9.C1839g.L(g(), 0, iL, 1, null));
                }
                q6 = new X9.Q(X9.C1839g.L(g(), 0, 1, 1, null));
            } else {
                if (g().I() == 2) {
                    return null;
                }
                q6 = new X9.Q(X9.C1839g.L(g(), 0, 2, 1, null));
            }
        } else {
            if (g().I() == 3) {
                return null;
            }
            q6 = new X9.Q(X9.C1839g.L(g(), 0, 3, 1, null));
        }
        return q6;
    }

    public final X9.Q t(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "other");
        if (!p247y7.AbstractC7350t.b(i(), q6.i())) {
            throw new java.lang.IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + q6).toString());
        }
        java.util.List listM = m();
        java.util.List listM2 = q6.m();
        int iMin = java.lang.Math.min(listM.size(), listM2.size());
        int i6 = 0;
        while (i6 < iMin && p247y7.AbstractC7350t.b(listM.get(i6), listM2.get(i6))) {
            i6++;
        }
        if (i6 == iMin && g().I() == q6.g().I()) {
            return X9.Q.a.e(f16083D, ".", false, 1, null);
        }
        if (listM2.subList(i6, listM2.size()).indexOf(Y9.d.f16580e) != -1) {
            throw new java.lang.IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + q6).toString());
        }
        if (p247y7.AbstractC7350t.b(q6.g(), Y9.d.f16579d)) {
            return this;
        }
        X9.C1836d c1836d = new X9.C1836d();
        X9.C1839g c1839gM = Y9.d.m(q6);
        if (c1839gM == null && (c1839gM = Y9.d.m(this)) == null) {
            c1839gM = Y9.d.s(f16084E);
        }
        int size = listM2.size();
        for (int i10 = i6; i10 < size; i10++) {
            c1836d.h1(Y9.d.f16580e);
            c1836d.h1(c1839gM);
        }
        int size2 = listM.size();
        while (i6 < size2) {
            c1836d.h1((X9.C1839g) listM.get(i6));
            c1836d.h1(c1839gM);
            i6++;
        }
        return Y9.d.q(c1836d, false);
    }

    public java.lang.String toString() {
        return g().O();
    }

    public final X9.Q u(X9.Q q6, boolean z6) {
        p247y7.AbstractC7350t.f(q6, "child");
        return Y9.d.j(this, q6, z6);
    }

    public final X9.Q v(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "child");
        return Y9.d.j(this, Y9.d.q(new X9.C1836d().t0(str), false), false);
    }

    public final java.io.File x() {
        return new java.io.File(toString());
    }

    public final java.nio.file.Path y() {
        java.nio.file.Path path = java.nio.file.Paths.get(toString(), new java.lang.String[0]);
        p247y7.AbstractC7350t.e(path, "get(...)");
        return path;
    }

    public final java.lang.Character z() {
        if (X9.C1839g.w(g(), Y9.d.f16576a, 0, 2, null) != -1 || g().I() < 2 || g().n(1) != 58) {
            return null;
        }
        char cN = (char) g().n(0);
        if (('a' > cN || cN >= '{') && ('A' > cN || cN >= '[')) {
            return null;
        }
        return java.lang.Character.valueOf(cN);
    }
}
