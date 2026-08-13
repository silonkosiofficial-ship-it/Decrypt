package S0;

/* JADX INFO: renamed from: S0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1604l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S0.C1604l.a f12364f = new S0.C1604l.a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12365g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0.M f12366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12370e;

    /* JADX INFO: renamed from: S0.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private C1604l(M0.C1332d c1332d, long j6) {
        this.f12366a = new S0.M(c1332d.i());
        this.f12367b = M0.N.l(j6);
        this.f12368c = M0.N.k(j6);
        this.f12369d = -1;
        this.f12370e = -1;
        int iL = M0.N.l(j6);
        int iK = M0.N.k(j6);
        if (iL < 0 || iL > c1332d.length()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + c1332d.length());
        }
        if (iK < 0 || iK > c1332d.length()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + c1332d.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }

    public /* synthetic */ C1604l(M0.C1332d c1332d, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, j6);
    }

    private final void q(int i6) {
        if (i6 >= 0) {
            this.f12368c = i6;
            return;
        }
        throw new java.lang.IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i6).toString());
    }

    private final void r(int i6) {
        if (i6 >= 0) {
            this.f12367b = i6;
            return;
        }
        throw new java.lang.IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i6).toString());
    }

    public final void a() {
        this.f12369d = -1;
        this.f12370e = -1;
    }

    public final void b(int i6, int i10) {
        long jB = M0.O.b(i6, i10);
        this.f12366a.c(i6, i10, "");
        long jA = S0.AbstractC1605m.a(M0.O.b(this.f12367b, this.f12368c), jB);
        r(M0.N.l(jA));
        q(M0.N.k(jA));
        if (l()) {
            long jA2 = S0.AbstractC1605m.a(M0.O.b(this.f12369d, this.f12370e), jB);
            if (M0.N.h(jA2)) {
                a();
            } else {
                this.f12369d = M0.N.l(jA2);
                this.f12370e = M0.N.k(jA2);
            }
        }
    }

    public final char c(int i6) {
        return this.f12366a.a(i6);
    }

    public final M0.N d() {
        if (l()) {
            return M0.N.b(M0.O.b(this.f12369d, this.f12370e));
        }
        return null;
    }

    public final int e() {
        return this.f12370e;
    }

    public final int f() {
        return this.f12369d;
    }

    public final int g() {
        int i6 = this.f12367b;
        int i10 = this.f12368c;
        if (i6 == i10) {
            return i10;
        }
        return -1;
    }

    public final int h() {
        return this.f12366a.b();
    }

    public final long i() {
        return M0.O.b(this.f12367b, this.f12368c);
    }

    public final int j() {
        return this.f12368c;
    }

    public final int k() {
        return this.f12367b;
    }

    public final boolean l() {
        return this.f12369d != -1;
    }

    public final void m(int i6, int i10, java.lang.String str) {
        if (i6 < 0 || i6 > this.f12366a.b()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + i6 + ") offset is outside of text region " + this.f12366a.b());
        }
        if (i10 < 0 || i10 > this.f12366a.b()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + i10 + ") offset is outside of text region " + this.f12366a.b());
        }
        if (i6 <= i10) {
            this.f12366a.c(i6, i10, str);
            r(str.length() + i6);
            q(i6 + str.length());
            this.f12369d = -1;
            this.f12370e = -1;
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not set reversed range: " + i6 + " > " + i10);
    }

    public final void n(int i6, int i10) {
        if (i6 < 0 || i6 > this.f12366a.b()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + i6 + ") offset is outside of text region " + this.f12366a.b());
        }
        if (i10 < 0 || i10 > this.f12366a.b()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + i10 + ") offset is outside of text region " + this.f12366a.b());
        }
        if (i6 < i10) {
            this.f12369d = i6;
            this.f12370e = i10;
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not set reversed or empty range: " + i6 + " > " + i10);
    }

    public final void o(int i6) {
        p(i6, i6);
    }

    public final void p(int i6, int i10) {
        if (i6 < 0 || i6 > this.f12366a.b()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + i6 + ") offset is outside of text region " + this.f12366a.b());
        }
        if (i10 < 0 || i10 > this.f12366a.b()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + i10 + ") offset is outside of text region " + this.f12366a.b());
        }
        if (i6 <= i10) {
            r(i6);
            q(i10);
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not set reversed range: " + i6 + " > " + i10);
    }

    public final M0.C1332d s() {
        return new M0.C1332d(toString(), null, null, 6, null);
    }

    public java.lang.String toString() {
        return this.f12366a.toString();
    }
}
