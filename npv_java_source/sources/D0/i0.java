package D0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1864f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.k0 f1865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D0.C f1866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.p f1867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.p f1868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.p f1869e;

    public interface a {
        int b();

        void e();

        void f(java.lang.Object obj, p237x7.l lVar);

        void g(int i6, long j6);
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {
        b() {
            super(2);
        }

        public final void a(F0.J j6, V.AbstractC1744s abstractC1744s) {
            D0.i0.this.h().I(abstractC1744s);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((F0.J) obj, (V.AbstractC1744s) obj2);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {
        c() {
            super(2);
        }

        public final void a(F0.J j6, p237x7.p pVar) {
            j6.e(D0.i0.this.h().u(pVar));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((F0.J) obj, (p237x7.p) obj2);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {
        d() {
            super(2);
        }

        public final void a(F0.J j6, D0.i0 i0Var) {
            D0.i0 i0Var2 = D0.i0.this;
            D0.C cR0 = j6.r0();
            if (cR0 == null) {
                cR0 = new D0.C(j6, D0.i0.this.f1865a);
                j6.J1(cR0);
            }
            i0Var2.f1866b = cR0;
            D0.i0.this.h().B();
            D0.i0.this.h().J(D0.i0.this.f1865a);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((F0.J) obj, (D0.i0) obj2);
            return p087i7.M.f46721a;
        }
    }

    public i0() {
        this(D0.Q.f1800a);
    }

    public i0(D0.k0 k0Var) {
        this.f1865a = k0Var;
        this.f1867c = new D0.i0.d();
        this.f1868d = new D0.i0.b();
        this.f1869e = new D0.i0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0.C h() {
        D0.C c6 = this.f1866b;
        if (c6 != null) {
            return c6;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void d() {
        h().z();
    }

    public final p237x7.p e() {
        return this.f1868d;
    }

    public final p237x7.p f() {
        return this.f1869e;
    }

    public final p237x7.p g() {
        return this.f1867c;
    }

    public final D0.i0.a i(java.lang.Object obj, p237x7.p pVar) {
        return h().G(obj, pVar);
    }
}
