package F0;

/* JADX INFO: renamed from: F0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0927m extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f2681P = F0.AbstractC0920g0.g(this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private androidx.compose.ui.d.c f2682Q;

    private final void X1(int i6, boolean z6) {
        androidx.compose.ui.d.c cVarR1;
        int iV1 = v1();
        N1(i6);
        if (iV1 != i6) {
            if (F0.AbstractC0925k.f(this)) {
                J1(i6);
            }
            if (A1()) {
                androidx.compose.ui.d.c cVarE0 = E0();
                androidx.compose.ui.d.c cVarX1 = this;
                while (cVarX1 != null) {
                    i6 |= cVarX1.v1();
                    cVarX1.N1(i6);
                    if (cVarX1 == cVarE0) {
                        break;
                    } else {
                        cVarX1 = cVarX1.x1();
                    }
                }
                if (z6 && cVarX1 == cVarE0) {
                    i6 = F0.AbstractC0920g0.h(cVarE0);
                    cVarE0.N1(i6);
                }
                int iQ1 = i6 | ((cVarX1 == null || (cVarR1 = cVarX1.r1()) == null) ? 0 : cVarR1.q1());
                while (cVarX1 != null) {
                    iQ1 |= cVarX1.v1();
                    cVarX1.J1(iQ1);
                    cVarX1 = cVarX1.x1();
                }
            }
        }
    }

    private final void Y1(int i6, androidx.compose.ui.d.c cVar) {
        int iV1 = v1();
        if ((i6 & F0.AbstractC0918f0.a(2)) == 0 || (F0.AbstractC0918f0.a(2) & iV1) == 0 || (this instanceof F0.E)) {
            return;
        }
        C0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
    }

    @Override // androidx.compose.ui.d.c
    public void B1() {
        super.B1();
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.S1(s1());
            if (!cVarU1.A1()) {
                cVarU1.B1();
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public void C1() {
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.C1();
        }
        super.C1();
    }

    @Override // androidx.compose.ui.d.c
    public void G1() {
        super.G1();
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.G1();
        }
    }

    @Override // androidx.compose.ui.d.c
    public void H1() {
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.H1();
        }
        super.H1();
    }

    @Override // androidx.compose.ui.d.c
    public void I1() {
        super.I1();
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.I1();
        }
    }

    @Override // androidx.compose.ui.d.c
    public void K1(androidx.compose.ui.d.c cVar) {
        super.K1(cVar);
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.K1(cVar);
        }
    }

    @Override // androidx.compose.ui.d.c
    public void S1(F0.AbstractC0914d0 abstractC0914d0) {
        super.S1(abstractC0914d0);
        for (androidx.compose.ui.d.c cVarU1 = U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
            cVarU1.S1(abstractC0914d0);
        }
    }

    protected final F0.InterfaceC0924j T1(F0.InterfaceC0924j interfaceC0924j) {
        androidx.compose.ui.d.c cVarE0 = interfaceC0924j.E0();
        if (cVarE0 != interfaceC0924j) {
            androidx.compose.ui.d.c cVar = interfaceC0924j instanceof androidx.compose.ui.d.c ? (androidx.compose.ui.d.c) interfaceC0924j : null;
            androidx.compose.ui.d.c cVarX1 = cVar != null ? cVar.x1() : null;
            if (cVarE0 == E0() && p247y7.AbstractC7350t.b(cVarX1, this)) {
                return interfaceC0924j;
            }
            throw new java.lang.IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (!(!cVarE0.A1())) {
            C0.a.b("Cannot delegate to an already attached node");
        }
        cVarE0.K1(E0());
        int iV1 = v1();
        int iH = F0.AbstractC0920g0.h(cVarE0);
        cVarE0.N1(iH);
        Y1(iH, cVarE0);
        cVarE0.L1(this.f2682Q);
        this.f2682Q = cVarE0;
        cVarE0.P1(this);
        X1(v1() | iH, false);
        if (A1()) {
            if ((iH & F0.AbstractC0918f0.a(2)) == 0 || (iV1 & F0.AbstractC0918f0.a(2)) != 0) {
                S1(s1());
            } else {
                F0.C0910b0 c0910b0K0 = F0.AbstractC0925k.m(this).k0();
                E0().S1(null);
                c0910b0K0.C();
            }
            cVarE0.B1();
            cVarE0.H1();
            F0.AbstractC0920g0.a(cVarE0);
        }
        return interfaceC0924j;
    }

    public final androidx.compose.ui.d.c U1() {
        return this.f2682Q;
    }

    public final int V1() {
        return this.f2681P;
    }

    protected final void W1(F0.InterfaceC0924j interfaceC0924j) {
        androidx.compose.ui.d.c cVar = null;
        for (androidx.compose.ui.d.c cVarR1 = this.f2682Q; cVarR1 != null; cVarR1 = cVarR1.r1()) {
            if (cVarR1 == interfaceC0924j) {
                if (cVarR1.A1()) {
                    F0.AbstractC0920g0.d(cVarR1);
                    cVarR1.I1();
                    cVarR1.C1();
                }
                cVarR1.K1(cVarR1);
                cVarR1.J1(0);
                androidx.compose.ui.d.c cVarR2 = cVarR1.r1();
                if (cVar == null) {
                    this.f2682Q = cVarR2;
                } else {
                    cVar.L1(cVarR2);
                }
                cVarR1.L1(null);
                cVarR1.P1(null);
                int iV1 = v1();
                int iH = F0.AbstractC0920g0.h(this);
                X1(iH, true);
                if (A1() && (iV1 & F0.AbstractC0918f0.a(2)) != 0 && (F0.AbstractC0918f0.a(2) & iH) == 0) {
                    F0.C0910b0 c0910b0K0 = F0.AbstractC0925k.m(this).k0();
                    E0().S1(null);
                    c0910b0K0.C();
                    return;
                }
                return;
            }
            cVar = cVarR1;
        }
        throw new java.lang.IllegalStateException(("Could not find delegate: " + interfaceC0924j).toString());
    }
}
