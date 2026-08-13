package K;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends androidx.compose.ui.d.c implements androidx.compose.ui.platform.R0, F0.InterfaceC0921h, F0.InterfaceC0934u, K.q0.a {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private K.q0 f5871P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private H.C1230w f5872Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private N.F f5873R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final V.InterfaceC1753w0 f5874S = V.A1.d(null, null, 2, null);

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5875G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f5877I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f5877I = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5875G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                K.n0 n0Var = K.n0.this;
                p237x7.p pVar = this.f5877I;
                this.f5875G = 1;
                if (androidx.compose.ui.platform.S0.b(n0Var, pVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            throw new p087i7.C6665k();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((K.n0.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return K.n0.this.new a(this.f5877I, eVar);
        }
    }

    public n0(K.q0 q0Var, H.C1230w c1230w, N.F f6) {
        this.f5871P = q0Var;
        this.f5872Q = c1230w;
        this.f5873R = f6;
    }

    private void T1(D0.InterfaceC0900t interfaceC0900t) {
        this.f5874S.setValue(interfaceC0900t);
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        this.f5871P.j(this);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        this.f5871P.l(this);
    }

    @Override // K.q0.a
    public D0.InterfaceC0900t I0() {
        return (D0.InterfaceC0900t) this.f5874S.getValue();
    }

    public void U1(H.C1230w c1230w) {
        this.f5872Q = c1230w;
    }

    public final void V1(K.q0 q0Var) {
        if (A1()) {
            this.f5871P.e();
            this.f5871P.l(this);
        }
        this.f5871P = q0Var;
        if (A1()) {
            this.f5871P.j(this);
        }
    }

    public void W1(N.F f6) {
        this.f5873R = f6;
    }

    @Override // K.q0.a
    public N.F d0() {
        return this.f5873R;
    }

    @Override // K.q0.a
    public androidx.compose.ui.platform.InterfaceC1975s1 getSoftwareKeyboardController() {
        return (androidx.compose.ui.platform.InterfaceC1975s1) F0.AbstractC0923i.a(this, androidx.compose.ui.platform.AbstractC1966p0.o());
    }

    @Override // K.q0.a
    public androidx.compose.ui.platform.A1 getViewConfiguration() {
        return (androidx.compose.ui.platform.A1) F0.AbstractC0923i.a(this, androidx.compose.ui.platform.AbstractC1966p0.r());
    }

    @Override // K.q0.a
    public H.C1230w i1() {
        return this.f5872Q;
    }

    @Override // F0.InterfaceC0934u
    public void s(D0.InterfaceC0900t interfaceC0900t) {
        T1(interfaceC0900t);
    }

    @Override // K.q0.a
    public W8.InterfaceC1822z0 z0(p237x7.p pVar) {
        if (A1()) {
            return W8.AbstractC1788i.d(t1(), null, W8.P.UNDISPATCHED, new K.n0.a(pVar, null), 1, null);
        }
        return null;
    }
}
