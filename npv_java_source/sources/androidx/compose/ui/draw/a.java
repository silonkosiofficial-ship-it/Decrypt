package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
final class a extends androidx.compose.ui.d.c implements p111l0.c, F0.i0, p111l0.b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p111l0.d f19616P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19617Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private androidx.compose.ui.draw.f f19618R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p237x7.l f19619S;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    static final class C0376a extends p247y7.AbstractC7352v implements p237x7.a {
        C0376a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p141o0.C1 b() {
            return androidx.compose.ui.draw.a.this.U1();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p111l0.d f19622E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p111l0.d dVar) {
            super(0);
            this.f19622E = dVar;
        }

        public final void a() {
            androidx.compose.ui.draw.a.this.T1().l(this.f19622E);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public a(p111l0.d dVar, p237x7.l lVar) {
        this.f19616P = dVar;
        this.f19619S = lVar;
        dVar.t(this);
        dVar.F(new androidx.compose.ui.draw.a.C0376a());
    }

    private final p111l0.h V1(p161q0.c cVar) {
        if (!this.f19617Q) {
            p111l0.d dVar = this.f19616P;
            dVar.C(null);
            dVar.y(cVar);
            F0.j0.a(this, new androidx.compose.ui.draw.a.b(dVar));
            if (dVar.f() == null) {
                C0.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new p087i7.C6665k();
            }
            this.f19617Q = true;
        }
        p111l0.h hVarF = this.f19616P.f();
        p247y7.AbstractC7350t.c(hVarF);
        return hVarF;
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        super.E1();
        androidx.compose.ui.draw.f fVar = this.f19618R;
        if (fVar != null) {
            fVar.d();
        }
    }

    @Override // F0.i0
    public void L0() {
        N();
    }

    @Override // p111l0.c
    public void N() {
        androidx.compose.ui.draw.f fVar = this.f19618R;
        if (fVar != null) {
            fVar.d();
        }
        this.f19617Q = false;
        this.f19616P.C(null);
        F0.AbstractC0933t.a(this);
    }

    public final p237x7.l T1() {
        return this.f19619S;
    }

    public final p141o0.C1 U1() {
        androidx.compose.ui.draw.f fVar = this.f19618R;
        if (fVar == null) {
            fVar = new androidx.compose.ui.draw.f();
            this.f19618R = fVar;
        }
        if (fVar.c() == null) {
            fVar.e(F0.AbstractC0925k.j(this));
        }
        return fVar;
    }

    public final void W1(p237x7.l lVar) {
        this.f19619S = lVar;
        N();
    }

    @Override // p111l0.b
    public Y0.e getDensity() {
        return F0.AbstractC0925k.i(this);
    }

    @Override // p111l0.b
    public Y0.v getLayoutDirection() {
        return F0.AbstractC0925k.l(this);
    }

    @Override // p111l0.b
    public long i() {
        return Y0.u.d(F0.AbstractC0925k.h(this, F0.AbstractC0918f0.a(128)).a());
    }

    @Override // F0.InterfaceC0932s
    public void m0() {
        N();
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        V1(cVar).a().l(cVar);
    }
}
