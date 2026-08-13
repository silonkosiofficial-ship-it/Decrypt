package p122m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends p122m1.j {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f50460I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f50461J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f50462K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f50463L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f50464M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f50465N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f50466O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f50467P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f50468Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private p132n1.b.C0649b f50469R0 = new p132n1.b.C0649b();

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private n1.b.c f50470S0;

    public final boolean f2(java.util.HashSet hashSet) {
        p247y7.AbstractC7350t.f(hashSet, "widgets");
        int iE2 = e2();
        for (int i6 = 0; i6 < iE2; i6++) {
            if (p097j7.AbstractC6879v.Z(hashSet, d2()[i6])) {
                return true;
            }
        }
        return false;
    }

    public final int g2() {
        return this.f50468Q0;
    }

    public final int h2() {
        return this.f50467P0;
    }

    public final int i2() {
        return this.f50461J0;
    }

    public final int j2() {
        return this.f50464M0;
    }

    public final int k2() {
        return this.f50465N0;
    }

    public final int l2() {
        return this.f50460I0;
    }

    public void m2(int i6, int i10, int i11, int i12) {
    }

    protected final void n2(p122m1.e eVar, m1.e.b bVar, int i6, m1.e.b bVar2, int i10) {
        p247y7.AbstractC7350t.f(eVar, "widget");
        p247y7.AbstractC7350t.f(bVar, "horizontalBehavior");
        p247y7.AbstractC7350t.f(bVar2, "verticalBehavior");
        while (this.f50470S0 == null && o0() != null) {
            p122m1.e eVarO0 = o0();
            p247y7.AbstractC7350t.d(eVarO0, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.ConstraintWidgetContainer");
            this.f50470S0 = ((p122m1.f) eVarO0).E2();
        }
        this.f50469R0.n(bVar);
        this.f50469R0.v(bVar2);
        this.f50469R0.o(i6);
        this.f50469R0.w(i10);
        n1.b.c cVar = this.f50470S0;
        p247y7.AbstractC7350t.c(cVar);
        cVar.b(eVar, this.f50469R0);
        eVar.U1(this.f50469R0.k());
        eVar.m1(this.f50469R0.i());
        eVar.l1(this.f50469R0.h());
        eVar.a1(this.f50469R0.g());
    }

    protected final boolean o2() {
        n1.b.c cVarE2;
        if (o0() != null) {
            p122m1.e eVarO0 = o0();
            p247y7.AbstractC7350t.d(eVarO0, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.ConstraintWidgetContainer");
            cVarE2 = ((p122m1.f) eVarO0).E2();
        } else {
            cVarE2 = null;
        }
        if (cVarE2 == null) {
            return false;
        }
        int iE2 = e2();
        for (int i6 = 0; i6 < iE2; i6++) {
            p122m1.e eVar = d2()[i6];
            if (eVar != null && !(eVar instanceof p122m1.h)) {
                m1.e.b bVarR = eVar.r(0);
                m1.e.b bVarR2 = eVar.r(1);
                m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar || eVar.Q() == 1 || bVarR2 != bVar || eVar.P() == 1) {
                    if (bVarR == bVar) {
                        bVarR = m1.e.b.WRAP_CONTENT;
                    }
                    if (bVarR2 == bVar) {
                        bVarR2 = m1.e.b.WRAP_CONTENT;
                    }
                    p132n1.b.C0649b c0649b = this.f50469R0;
                    p247y7.AbstractC7350t.c(bVarR);
                    c0649b.n(bVarR);
                    p132n1.b.C0649b c0649b2 = this.f50469R0;
                    p247y7.AbstractC7350t.c(bVarR2);
                    c0649b2.v(bVarR2);
                    this.f50469R0.o(eVar.B0());
                    this.f50469R0.w(eVar.w());
                    cVarE2.b(eVar, this.f50469R0);
                    eVar.U1(this.f50469R0.k());
                    eVar.m1(this.f50469R0.i());
                    eVar.a1(this.f50469R0.g());
                }
            }
        }
        return true;
    }

    public final boolean p2() {
        return this.f50466O0;
    }

    protected final void q2(boolean z6) {
        this.f50466O0 = z6;
    }

    public final void r2(int i6, int i10) {
        this.f50467P0 = i6;
        this.f50468Q0 = i10;
    }

    public final void s2(int i6) {
        this.f50461J0 = i6;
    }

    public final void t2(int i6) {
        this.f50462K0 = i6;
        this.f50464M0 = i6;
    }

    public final void u2(int i6) {
        this.f50463L0 = i6;
        this.f50465N0 = i6;
    }

    public final void v2(int i6) {
        this.f50460I0 = i6;
    }
}
