package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
final class c extends androidx.compose.ui.d.c implements F0.InterfaceC0932s, F0.i0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f18913P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p141o0.AbstractC6984n0 f18914Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f18915R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p141o0.e2 f18916S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private long f18917T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Y0.v f18918U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private p141o0.L1 f18919V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p141o0.e2 f18920W;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f18921D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c f18922E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p161q0.c f18923F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p247y7.O o6, androidx.compose.foundation.c cVar, p161q0.c cVar2) {
            super(0);
            this.f18921D = o6;
            this.f18922E = cVar;
            this.f18923F = cVar2;
        }

        public final void a() {
            this.f18921D.f57254C = this.f18922E.W1().a(this.f18923F.i(), this.f18923F.getLayoutDirection(), this.f18923F);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private c(long j6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.e2 e2Var) {
        this.f18913P = j6;
        this.f18914Q = abstractC6984n0;
        this.f18915R = f6;
        this.f18916S = e2Var;
        this.f18917T = p131n0.m.f51333b.a();
    }

    public /* synthetic */ c(long j6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.e2 e2Var, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, abstractC6984n0, f6, e2Var);
    }

    private final void T1(p161q0.c cVar) {
        p141o0.L1 l1V1 = V1(cVar);
        if (!p141o0.C7016y0.o(this.f18913P, p141o0.C7016y0.f52264b.g())) {
            p141o0.M1.c(cVar, l1V1, this.f18913P, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? p161q0.l.f52928a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? p161q0.g.f52924B.a() : 0);
        }
        p141o0.AbstractC6984n0 abstractC6984n0 = this.f18914Q;
        if (abstractC6984n0 != null) {
            p141o0.M1.b(cVar, l1V1, abstractC6984n0, this.f18915R, null, null, 0, 56, null);
        }
    }

    private final void U1(p161q0.c cVar) {
        if (!p141o0.C7016y0.o(this.f18913P, p141o0.C7016y0.f52264b.g())) {
            p161q0.f.m(cVar, this.f18913P, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        p141o0.AbstractC6984n0 abstractC6984n0 = this.f18914Q;
        if (abstractC6984n0 != null) {
            p161q0.f.l(cVar, abstractC6984n0, 0L, 0L, this.f18915R, null, null, 0, 118, null);
        }
    }

    private final p141o0.L1 V1(p161q0.c cVar) {
        p247y7.O o6 = new p247y7.O();
        if (p131n0.m.f(cVar.i(), this.f18917T) && cVar.getLayoutDirection() == this.f18918U && p247y7.AbstractC7350t.b(this.f18920W, this.f18916S)) {
            p141o0.L1 l6 = this.f18919V;
            p247y7.AbstractC7350t.c(l6);
            o6.f57254C = l6;
        } else {
            F0.j0.a(this, new androidx.compose.foundation.c.a(o6, this, cVar));
        }
        this.f18919V = (p141o0.L1) o6.f57254C;
        this.f18917T = cVar.i();
        this.f18918U = cVar.getLayoutDirection();
        this.f18920W = this.f18916S;
        java.lang.Object obj = o6.f57254C;
        p247y7.AbstractC7350t.c(obj);
        return (p141o0.L1) obj;
    }

    @Override // F0.i0
    public void L0() {
        this.f18917T = p131n0.m.f51333b.a();
        this.f18918U = null;
        this.f18919V = null;
        this.f18920W = null;
        F0.AbstractC0933t.a(this);
    }

    public final p141o0.e2 W1() {
        return this.f18916S;
    }

    public final void X1(p141o0.AbstractC6984n0 abstractC6984n0) {
        this.f18914Q = abstractC6984n0;
    }

    public final void Y1(long j6) {
        this.f18913P = j6;
    }

    public final void b(float f6) {
        this.f18915R = f6;
    }

    public final void l0(p141o0.e2 e2Var) {
        this.f18916S = e2Var;
    }

    @Override // F0.InterfaceC0932s
    public /* synthetic */ void m0() {
        F0.r.a(this);
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        if (this.f18916S == p141o0.Y1.a()) {
            U1(cVar);
        } else {
            T1(cVar);
        }
        cVar.l1();
    }
}
