package p241y0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.compose.ui.d.c implements F0.E0, p241y0.b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p241y0.b f57135P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p241y0.c f57136Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final java.lang.Object f57137R;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f57138F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        long f57139G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        long f57140H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57141I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f57143K;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57141I = obj;
            this.f57143K |= Integer.MIN_VALUE;
            return p241y0.d.this.J(0L, 0L, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f57144F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        long f57145G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57146H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f57148J;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57146H = obj;
            this.f57148J |= Integer.MIN_VALUE;
            return p241y0.d.this.h1(0L, this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W8.N b() {
            return p241y0.d.this.U1();
        }
    }

    public d(p241y0.b bVar, p241y0.c cVar) {
        this.f57135P = bVar;
        this.f57136Q = cVar == null ? new p241y0.c() : cVar;
        this.f57137R = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W8.N U1() {
        W8.N nH;
        p241y0.d dVarW1 = W1();
        if ((dVarW1 == null || (nH = dVarW1.U1()) == null) && (nH = this.f57136Q.h()) == null) {
            throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return nH;
    }

    private final p241y0.b V1() {
        if (A1()) {
            return W1();
        }
        return null;
    }

    private final void X1() {
        if (this.f57136Q.f() == this) {
            this.f57136Q.j(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    private final void Y1(p241y0.c cVar) {
        X1();
        if (cVar != null) {
            if (!p247y7.AbstractC7350t.b(cVar, this.f57136Q)) {
            }
            if (A1()) {
                Z1();
            }
        }
        cVar = new p241y0.c();
        this.f57136Q = cVar;
        if (A1()) {
            Z1();
        }
    }

    private final void Z1() {
        this.f57136Q.j(this);
        this.f57136Q.i(new y0.d.c());
        this.f57136Q.k(t1());
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        Z1();
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        X1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // p241y0.b
    public java.lang.Object J(long j6, long j10, p127m7.e eVar) {
        y0.d.a aVar;
        long j11;
        long j12;
        p241y0.d dVar;
        long j13;
        long jA;
        long j14;
        if (eVar instanceof y0.d.a) {
            aVar = (y0.d.a) eVar;
            int i6 = aVar.f57143K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f57143K = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new y0.d.a(eVar);
            }
        } else {
            aVar = new y0.d.a(eVar);
        }
        java.lang.Object objJ = aVar.f57141I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f57143K;
        if (i10 != 0) {
            if (i10 == 1) {
                long j15 = aVar.f57140H;
                long j16 = aVar.f57139G;
                dVar = (p241y0.d) aVar.f57138F;
                p087i7.x.b(objJ);
                j12 = j15;
                j11 = j16;
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = aVar.f57139G;
                p087i7.x.b(objJ);
            }
            jA = ((Y0.A) objJ).o();
            j13 = j14;
            return Y0.A.b(Y0.A.l(j13, jA));
        }
        p087i7.x.b(objJ);
        p241y0.b bVar = this.f57135P;
        aVar.f57138F = this;
        j11 = j6;
        aVar.f57139G = j11;
        j12 = j10;
        aVar.f57140H = j12;
        aVar.f57143K = 1;
        objJ = bVar.J(j6, j10, aVar);
        if (objJ == objG) {
            return objG;
        }
        dVar = this;
        long jO = ((Y0.A) objJ).o();
        p241y0.b bVarV1 = dVar.V1();
        if (bVarV1 != null) {
            long jL = Y0.A.l(j11, jO);
            long jK = Y0.A.k(j12, jO);
            aVar.f57138F = null;
            aVar.f57139G = jO;
            aVar.f57143K = 2;
            objJ = bVarV1.J(jL, jK, aVar);
            if (objJ == objG) {
                return objG;
            }
            j14 = jO;
            jA = ((Y0.A) objJ).o();
            j13 = j14;
        } else {
            j13 = jO;
            jA = Y0.A.f16198b.a();
        }
        return Y0.A.b(Y0.A.l(j13, jA));
    }

    @Override // F0.E0
    public java.lang.Object K() {
        return this.f57137R;
    }

    public final p241y0.d W1() {
        if (A1()) {
            return (p241y0.d) F0.F0.b(this);
        }
        return null;
    }

    public final void a2(p241y0.b bVar, p241y0.c cVar) {
        this.f57135P = bVar;
        Y1(cVar);
    }

    @Override // p241y0.b
    public long e1(long j6, long j10, int i6) {
        long jE1 = this.f57135P.e1(j6, j10, i6);
        p241y0.b bVarV1 = V1();
        return p131n0.g.r(jE1, bVarV1 != null ? bVarV1.e1(p131n0.g.r(j6, jE1), p131n0.g.q(j10, jE1), i6) : p131n0.g.f51312b.c());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p241y0.b
    public java.lang.Object h1(long j6, p127m7.e eVar) {
        y0.d.b bVar;
        long jA;
        p241y0.d dVar;
        long j10;
        if (eVar instanceof y0.d.b) {
            bVar = (y0.d.b) eVar;
            int i6 = bVar.f57148J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f57148J = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new y0.d.b(eVar);
            }
        } else {
            bVar = new y0.d.b(eVar);
        }
        java.lang.Object objH1 = bVar.f57146H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f57148J;
        if (i10 != 0) {
            if (i10 == 1) {
                j6 = bVar.f57145G;
                dVar = (p241y0.d) bVar.f57144F;
                p087i7.x.b(objH1);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = bVar.f57145G;
                p087i7.x.b(objH1);
            }
            return Y0.A.b(Y0.A.l(j10, ((Y0.A) objH1).o()));
        }
        p087i7.x.b(objH1);
        p241y0.b bVarV1 = V1();
        if (bVarV1 != null) {
            bVar.f57144F = this;
            bVar.f57145G = j6;
            bVar.f57148J = 1;
            objH1 = bVarV1.h1(j6, bVar);
            if (objH1 == objG) {
                return objG;
            }
            dVar = this;
        } else {
            jA = Y0.A.f16198b.a();
            dVar = this;
        }
        long j11 = j6;
        j10 = jA;
        p241y0.b bVar2 = dVar.f57135P;
        long jK = Y0.A.k(j11, j10);
        bVar.f57144F = null;
        bVar.f57145G = j10;
        bVar.f57148J = 2;
        objH1 = bVar2.h1(jK, bVar);
        if (objH1 == objG) {
            return objG;
        }
        return Y0.A.b(Y0.A.l(j10, ((Y0.A) objH1).o()));
        jA = ((Y0.A) objH1).o();
        long j12 = j6;
        j10 = jA;
        p241y0.b bVar3 = dVar.f57135P;
        long jK2 = Y0.A.k(j12, j10);
        bVar.f57144F = null;
        bVar.f57145G = j10;
        bVar.f57148J = 2;
        objH1 = bVar3.h1(jK2, bVar);
        if (objH1 == objG) {
            return objG;
        }
        return Y0.A.b(Y0.A.l(j10, ((Y0.A) objH1).o()));
    }

    @Override // p241y0.b
    public long u0(long j6, int i6) {
        p241y0.b bVarV1 = V1();
        long jU0 = bVarV1 != null ? bVarV1.u0(j6, i6) : p131n0.g.f51312b.c();
        return p131n0.g.r(jU0, this.f57135P.u0(p131n0.g.q(j6, jU0), i6));
    }
}
