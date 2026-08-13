package F0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F0.l0.a f2676c = new F0.l0.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2677d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f2678a = new X.b(new F0.J[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F0.J[] f2679b;

    public static final class a {

        /* JADX INFO: renamed from: F0.l0$a$a, reason: collision with other inner class name */
        private static final class C0062a implements java.util.Comparator {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public static final F0.l0.a.C0062a f2680C = new F0.l0.a.C0062a();

            private C0062a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(F0.J j6, F0.J j10) {
                int iG = p247y7.AbstractC7350t.g(j10.L(), j6.L());
                return iG != 0 ? iG : p247y7.AbstractC7350t.g(j6.hashCode(), j10.hashCode());
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final void b(F0.J j6) {
        j6.A();
        int i6 = 0;
        j6.F1(false);
        X.b bVarW0 = j6.w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            do {
                b((F0.J) objArrS[i6]);
                i6++;
            } while (i6 < iT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        F0.J[] jArr;
        this.f2678a.N(F0.l0.a.C0062a.f2680C);
        int iT = this.f2678a.t();
        F0.J[] jArr2 = this.f2679b;
        if (jArr2 == null || jArr2.length < iT) {
            jArr = jArr2;
            jArr = new F0.J[java.lang.Math.max(16, this.f2678a.t())];
        }
        jArr = jArr2;
        this.f2679b = null;
        for (int i6 = 0; i6 < iT; i6++) {
            jArr[i6] = this.f2678a.s()[i6];
        }
        this.f2678a.j();
        while (true) {
            iT--;
            if (-1 >= iT) {
                this.f2679b = jArr;
                return;
            }
            F0.J j6 = jArr[iT];
            p247y7.AbstractC7350t.c(j6);
            if (j6.j0()) {
                b(j6);
            }
        }
    }

    public final boolean c() {
        return this.f2678a.x();
    }

    public final void d(F0.J j6) {
        this.f2678a.d(j6);
        j6.F1(true);
    }

    public final void e(F0.J j6) {
        this.f2678a.j();
        this.f2678a.d(j6);
        j6.F1(true);
    }

    public final void f(F0.J j6) {
        this.f2678a.A(j6);
    }
}
