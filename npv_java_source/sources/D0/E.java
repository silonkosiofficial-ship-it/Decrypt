package D0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements D0.InterfaceC0900t {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F0.U f1789C;

    public E(F0.U u6) {
        this.f1789C = u6;
    }

    private final long c() {
        F0.U uA = D0.F.a(this.f1789C);
        D0.InterfaceC0900t interfaceC0900tM1 = uA.m1();
        n0.g.a aVar = p131n0.g.f51312b;
        return p131n0.g.q(G(interfaceC0900tM1, aVar.c()), b().G(uA.K1(), aVar.c()));
    }

    @Override // D0.InterfaceC0900t
    public long C(long j6) {
        return b().C(p131n0.g.r(j6, c()));
    }

    @Override // D0.InterfaceC0900t
    public long G(D0.InterfaceC0900t interfaceC0900t, long j6) {
        return m0(interfaceC0900t, j6, true);
    }

    @Override // D0.InterfaceC0900t
    public D0.InterfaceC0900t H() {
        F0.U uJ2;
        if (!K()) {
            C0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        F0.AbstractC0914d0 abstractC0914d0P2 = b().p2();
        if (abstractC0914d0P2 == null || (uJ2 = abstractC0914d0P2.j2()) == null) {
            return null;
        }
        return uJ2.m1();
    }

    @Override // D0.InterfaceC0900t
    public boolean K() {
        return b().K();
    }

    @Override // D0.InterfaceC0900t
    public void M(float[] fArr) {
        b().M(fArr);
    }

    @Override // D0.InterfaceC0900t
    public p131n0.i N(D0.InterfaceC0900t interfaceC0900t, boolean z6) {
        return b().N(interfaceC0900t, z6);
    }

    @Override // D0.InterfaceC0900t
    public long W(long j6) {
        return p131n0.g.r(b().W(j6), c());
    }

    @Override // D0.InterfaceC0900t
    public void Y(D0.InterfaceC0900t interfaceC0900t, float[] fArr) {
        b().Y(interfaceC0900t, fArr);
    }

    @Override // D0.InterfaceC0900t
    public long a() {
        F0.U u6 = this.f1789C;
        return Y0.u.a(u6.I0(), u6.w0());
    }

    public final F0.AbstractC0914d0 b() {
        return this.f1789C.K1();
    }

    @Override // D0.InterfaceC0900t
    public D0.InterfaceC0900t b0() {
        F0.U uJ2;
        if (!K()) {
            C0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        F0.AbstractC0914d0 abstractC0914d0P2 = b().o1().m0().p2();
        if (abstractC0914d0P2 == null || (uJ2 = abstractC0914d0P2.j2()) == null) {
            return null;
        }
        return uJ2.m1();
    }

    @Override // D0.InterfaceC0900t
    public long h0(long j6) {
        return b().h0(p131n0.g.r(j6, c()));
    }

    @Override // D0.InterfaceC0900t
    public long m0(D0.InterfaceC0900t interfaceC0900t, long j6, boolean z6) {
        if (!(interfaceC0900t instanceof D0.E)) {
            F0.U uA = D0.F.a(this.f1789C);
            return p131n0.g.r(m0(uA.L1(), j6, z6), uA.K1().m1().m0(interfaceC0900t, p131n0.g.f51312b.c(), z6));
        }
        F0.U u6 = ((D0.E) interfaceC0900t).f1789C;
        u6.K1().C2();
        F0.U uJ2 = b().a2(u6.K1()).j2();
        if (uJ2 != null) {
            long jK = Y0.p.k(Y0.p.l(u6.P1(uJ2, !z6), Y0.q.d(j6)), this.f1789C.P1(uJ2, !z6));
            return p131n0.h.a(Y0.p.h(jK), Y0.p.i(jK));
        }
        F0.U uA2 = D0.F.a(u6);
        long jL = Y0.p.l(Y0.p.l(u6.P1(uA2, !z6), uA2.t1()), Y0.q.d(j6));
        F0.U uA3 = D0.F.a(this.f1789C);
        long jK2 = Y0.p.k(jL, Y0.p.l(this.f1789C.P1(uA3, !z6), uA3.t1()));
        long jA = p131n0.h.a(Y0.p.h(jK2), Y0.p.i(jK2));
        F0.AbstractC0914d0 abstractC0914d0P2 = uA3.K1().p2();
        p247y7.AbstractC7350t.c(abstractC0914d0P2);
        F0.AbstractC0914d0 abstractC0914d0P3 = uA2.K1().p2();
        p247y7.AbstractC7350t.c(abstractC0914d0P3);
        return abstractC0914d0P2.m0(abstractC0914d0P3, jA, z6);
    }

    @Override // D0.InterfaceC0900t
    public long s(long j6) {
        return p131n0.g.r(b().s(j6), c());
    }
}
