package F0;

/* JADX INFO: renamed from: F0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0937x extends F0.AbstractC0914d0 {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final F0.C0937x.a f2724x0 = new F0.C0937x.a(null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final p141o0.N1 f2725y0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final F0.C0 f2726v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private F0.U f2727w0;

    /* JADX INFO: renamed from: F0.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: F0.x$b */
    private final class b extends F0.U {
        public b() {
            super(F0.C0937x.this);
        }

        @Override // F0.U
        protected void M1() {
            F0.O.a aVarA0 = o1().a0();
            p247y7.AbstractC7350t.c(aVarA0);
            aVarA0.z1();
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int S(int i6) {
            return o1().d1(i6);
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int T(int i6) {
            return o1().Z0(i6);
        }

        @Override // D0.G
        public D0.X U(long j6) {
            a1(j6);
            X.b bVarW0 = o1().w0();
            int iT = bVarW0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarW0.s();
                int i6 = 0;
                do {
                    F0.O.a aVarA0 = ((F0.J) objArrS[i6]).a0();
                    p247y7.AbstractC7350t.c(aVarA0);
                    aVarA0.E1(F0.J.g.NotUsed);
                    i6++;
                } while (i6 < iT);
            }
            R1(o1().f0().b(this, o1().F(), j6));
            return this;
        }

        @Override // F0.T
        public int f1(D0.AbstractC0882a abstractC0882a) {
            java.lang.Integer num = (java.lang.Integer) G1().y().get(abstractC0882a);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            I1().put(abstractC0882a, java.lang.Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int n0(int i6) {
            return o1().c1(i6);
        }

        @Override // F0.U, D0.InterfaceC0895n
        public int t(int i6) {
            return o1().Y0(i6);
        }
    }

    static {
        p141o0.N1 n1A = p141o0.U.a();
        n1A.G(p141o0.C7016y0.f52264b.e());
        n1A.I(1.0f);
        n1A.F(p141o0.O1.f52148a.b());
        f2725y0 = n1A;
    }

    public C0937x(F0.J j6) {
        super(j6);
        this.f2726v0 = new F0.C0();
        n2().S1(this);
        this.f2727w0 = j6.b0() != null ? new F0.C0937x.b() : null;
    }

    private final void i3() {
        if (z1()) {
            return;
        }
        H2();
        o1().d0().F1();
    }

    @Override // F0.AbstractC0914d0
    public void J2(p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        F0.o0 o0VarB = F0.N.b(o1());
        X.b bVarV0 = o1().v0();
        int iT = bVarV0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarV0.s();
            int i6 = 0;
            do {
                F0.J j6 = (F0.J) objArrS[i6];
                if (j6.k()) {
                    j6.B(interfaceC6993q0, c7053c);
                }
                i6++;
            } while (i6 < iT);
        }
        if (o0VarB.getShowLayoutBounds()) {
            X1(interfaceC6993q0, f2725y0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F0.AbstractC0914d0, D0.X
    public void M0(long j6, float f6, p171r0.C7053c c7053c) {
        super.M0(j6, f6, c7053c);
        i3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F0.AbstractC0914d0, D0.X
    public void R0(long j6, float f6, p237x7.l lVar) {
        super.R0(j6, f6, lVar);
        i3();
    }

    @Override // D0.InterfaceC0895n
    public int S(int i6) {
        return o1().b1(i6);
    }

    @Override // D0.InterfaceC0895n
    public int T(int i6) {
        return o1().X0(i6);
    }

    @Override // D0.G
    public D0.X U(long j6) {
        if (f2()) {
            F0.U uJ2 = j2();
            p247y7.AbstractC7350t.c(uJ2);
            j6 = uJ2.J1();
        }
        a1(j6);
        X.b bVarW0 = o1().w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                ((F0.J) objArrS[i6]).d0().L1(F0.J.g.NotUsed);
                i6++;
            } while (i6 < iT);
        }
        Q2(o1().f0().b(this, o1().G(), j6));
        G2();
        return this;
    }

    @Override // F0.AbstractC0914d0
    public void Z1() {
        if (j2() == null) {
            j3(new F0.C0937x.b());
        }
    }

    @Override // F0.T
    public int f1(D0.AbstractC0882a abstractC0882a) {
        F0.U uJ2 = j2();
        if (uJ2 != null) {
            return uJ2.f1(abstractC0882a);
        }
        java.lang.Integer num = (java.lang.Integer) e2().y().get(abstractC0882a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // F0.AbstractC0914d0
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public F0.C0 n2() {
        return this.f2726v0;
    }

    @Override // F0.AbstractC0914d0
    public F0.U j2() {
        return this.f2727w0;
    }

    protected void j3(F0.U u6) {
        this.f2727w0 = u6;
    }

    @Override // D0.InterfaceC0895n
    public int n0(int i6) {
        return o1().a1(i6);
    }

    @Override // D0.InterfaceC0895n
    public int t(int i6) {
        return o1().W0(i6);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    @Override // F0.AbstractC0914d0
    public void x2(F0.AbstractC0914d0.f fVar, long j6, F0.C0935v c0935v, boolean z6, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (fVar.c(o1())) {
            if (g3(j6)) {
                z11 = z10;
            } else {
                if (z6) {
                    float fV1 = V1(j6, k2());
                    if (!java.lang.Float.isInfinite(fV1) && !java.lang.Float.isNaN(fV1)) {
                        z11 = false;
                    }
                }
                z11 = z10;
            }
            z12 = true;
        } else {
            z11 = z10;
        }
        if (z12) {
            int i6 = c0935v.f2714E;
            X.b bVarV0 = o1().v0();
            int iT = bVarV0.t();
            if (iT > 0) {
                java.lang.Object[] objArrS = bVarV0.s();
                int i10 = iT - 1;
                do {
                    F0.J j10 = (F0.J) objArrS[i10];
                    if (j10.k()) {
                        fVar.b(j10, j6, c0935v, z6, z11);
                        if (!c0935v.N()) {
                            i10--;
                        } else {
                            if (!c0935v.E()) {
                                break;
                            }
                            c0935v.d();
                            i10--;
                        }
                    } else {
                        i10--;
                    }
                } while (i10 >= 0);
            }
            c0935v.f2714E = i6;
        }
    }
}
