package G8;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements G8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G8.o f3161a = new G8.o();

    private o() {
    }

    @Override // J8.o
    public int A(J8.m mVar) {
        return G8.b.a.g0(this, mVar);
    }

    @Override // J8.o
    public J8.n A0(J8.m mVar, int i6) {
        return G8.b.a.p(this, mVar, i6);
    }

    @Override // J8.o
    public J8.l B(J8.c cVar) {
        return G8.b.a.i0(this, cVar);
    }

    @Override // J8.o
    public boolean B0(J8.m mVar) {
        return G8.b.a.E(this, mVar);
    }

    @Override // F8.o0
    public boolean C(J8.m mVar) {
        return G8.b.a.a0(this, mVar);
    }

    @Override // J8.o
    public boolean C0(J8.j jVar) {
        return G8.b.a.M(this, jVar);
    }

    @Override // J8.o
    public boolean D(J8.i iVar) {
        return G8.b.a.Z(this, iVar);
    }

    @Override // J8.o
    public boolean D0(J8.i iVar) {
        return G8.b.a.N(this, iVar);
    }

    @Override // J8.o
    public boolean E(J8.m mVar) {
        return G8.b.a.H(this, mVar);
    }

    @Override // J8.o
    public boolean E0(J8.l lVar) {
        return G8.b.a.W(this, lVar);
    }

    @Override // J8.o
    public boolean F(J8.n nVar, J8.m mVar) {
        return G8.b.a.B(this, nVar, mVar);
    }

    public F8.d0 F0(boolean z6, boolean z10) {
        return G8.b.a.e0(this, z6, z10);
    }

    @Override // J8.o
    public J8.j G(J8.i iVar) {
        J8.j jVarA;
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.g gVarT0 = t0(iVar);
        if (gVarT0 != null && (jVarA = a(gVarT0)) != null) {
            return jVarA;
        }
        J8.j jVarB = b(iVar);
        p247y7.AbstractC7350t.c(jVarB);
        return jVarB;
    }

    @Override // J8.o
    public boolean H(J8.j jVar) {
        return G8.b.a.X(this, jVar);
    }

    @Override // J8.o
    public J8.i I(java.util.List list) {
        return G8.b.a.D(this, list);
    }

    @Override // J8.o
    public java.util.Collection J(J8.m mVar) {
        return G8.b.a.k0(this, mVar);
    }

    @Override // F8.o0
    public p138n8.d K(J8.m mVar) {
        return G8.b.a.o(this, mVar);
    }

    @Override // J8.o
    public java.util.List L(J8.j jVar, J8.m mVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        p247y7.AbstractC7350t.f(mVar, "constructor");
        return null;
    }

    @Override // J8.o
    public J8.i M(J8.i iVar, boolean z6) {
        return G8.b.a.o0(this, iVar, z6);
    }

    @Override // F8.o0
    public L7.h N(J8.m mVar) {
        return G8.b.a.r(this, mVar);
    }

    @Override // J8.o
    public boolean O(J8.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        return X(e(jVar));
    }

    @Override // G8.b
    public J8.i P(J8.j jVar, J8.j jVar2) {
        return G8.b.a.l(this, jVar, jVar2);
    }

    @Override // J8.o
    public boolean Q(J8.i iVar) {
        return G8.b.a.I(this, iVar);
    }

    @Override // J8.o
    public java.util.List R(J8.i iVar) {
        return G8.b.a.n(this, iVar);
    }

    @Override // J8.o
    public boolean S(J8.d dVar) {
        return G8.b.a.S(this, dVar);
    }

    @Override // J8.o
    public boolean T(J8.m mVar) {
        return G8.b.a.L(this, mVar);
    }

    @Override // J8.r
    public boolean U(J8.j jVar, J8.j jVar2) {
        return G8.b.a.C(this, jVar, jVar2);
    }

    @Override // J8.o
    public boolean V(J8.m mVar) {
        return G8.b.a.G(this, mVar);
    }

    @Override // J8.o
    public boolean W(J8.j jVar) {
        return G8.b.a.R(this, jVar);
    }

    @Override // J8.o
    public boolean X(J8.m mVar) {
        return G8.b.a.F(this, mVar);
    }

    @Override // J8.o
    public boolean Y(J8.d dVar) {
        return G8.b.a.Q(this, dVar);
    }

    @Override // J8.o
    public J8.l Z(J8.j jVar, int i6) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        if (i6 < 0 || i6 >= h(jVar)) {
            return null;
        }
        return c0(jVar, i6);
    }

    @Override // G8.b, J8.o
    public J8.j a(J8.g gVar) {
        return G8.b.a.n0(this, gVar);
    }

    @Override // J8.o
    public J8.l a0(J8.k kVar, int i6) {
        p247y7.AbstractC7350t.f(kVar, "<this>");
        if (kVar instanceof J8.j) {
            return c0((J8.i) kVar, i6);
        }
        if (kVar instanceof J8.a) {
            E e6 = ((J8.a) kVar).get(i6);
            p247y7.AbstractC7350t.e(e6, "get(...)");
            return (J8.l) e6;
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + kVar + ", " + p247y7.P.b(kVar.getClass())).toString());
    }

    @Override // G8.b, J8.o
    public J8.j b(J8.i iVar) {
        return G8.b.a.h(this, iVar);
    }

    @Override // F8.o0
    public J8.i b0(J8.i iVar) {
        J8.j jVarG;
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.j jVarB = b(iVar);
        return (jVarB == null || (jVarG = g(jVarB, true)) == null) ? iVar : jVarG;
    }

    @Override // G8.b, J8.o
    public J8.j c(J8.g gVar) {
        return G8.b.a.b0(this, gVar);
    }

    @Override // J8.o
    public J8.l c0(J8.i iVar, int i6) {
        return G8.b.a.m(this, iVar, i6);
    }

    @Override // G8.b, J8.o
    public J8.d d(J8.j jVar) {
        return G8.b.a.d(this, jVar);
    }

    @Override // J8.o
    public J8.s d0(J8.n nVar) {
        return G8.b.a.z(this, nVar);
    }

    @Override // G8.b, J8.o
    public J8.m e(J8.j jVar) {
        return G8.b.a.m0(this, jVar);
    }

    @Override // J8.o
    public boolean e0(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return (iVar instanceof J8.j) && C0((J8.j) iVar);
    }

    @Override // G8.b, J8.o
    public boolean f(J8.j jVar) {
        return G8.b.a.U(this, jVar);
    }

    @Override // J8.o
    public boolean f0(J8.m mVar) {
        return G8.b.a.K(this, mVar);
    }

    @Override // G8.b, J8.o
    public J8.j g(J8.j jVar, boolean z6) {
        return G8.b.a.p0(this, jVar, z6);
    }

    @Override // J8.o
    public boolean g0(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return k0(u0(iVar)) && !p(iVar);
    }

    @Override // J8.o
    public int h(J8.i iVar) {
        return G8.b.a.b(this, iVar);
    }

    @Override // J8.o
    public boolean h0(J8.m mVar, J8.m mVar2) {
        return G8.b.a.a(this, mVar, mVar2);
    }

    @Override // J8.o
    public J8.j i(J8.j jVar) {
        J8.j jVarY0;
        p247y7.AbstractC7350t.f(jVar, "<this>");
        J8.e eVarT = t(jVar);
        return (eVarT == null || (jVarY0 = y0(eVarT)) == null) ? jVar : jVarY0;
    }

    @Override // J8.o
    public J8.n i0(J8.m mVar) {
        return G8.b.a.v(this, mVar);
    }

    @Override // J8.o
    public J8.k j(J8.j jVar) {
        return G8.b.a.c(this, jVar);
    }

    @Override // J8.o
    public J8.j j0(J8.j jVar, J8.b bVar) {
        return G8.b.a.j(this, jVar, bVar);
    }

    @Override // J8.o
    public boolean k(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.g gVarT0 = t0(iVar);
        if (gVarT0 == null) {
            return false;
        }
        r(gVarT0);
        return false;
    }

    @Override // J8.o
    public boolean k0(J8.m mVar) {
        return G8.b.a.O(this, mVar);
    }

    @Override // F8.o0
    public boolean l(J8.i iVar, p138n8.c cVar) {
        return G8.b.a.A(this, iVar, cVar);
    }

    @Override // J8.o
    public F8.d0.c l0(J8.j jVar) {
        return G8.b.a.j0(this, jVar);
    }

    @Override // J8.o
    public J8.b m(J8.d dVar) {
        return G8.b.a.k(this, dVar);
    }

    @Override // J8.o
    public J8.i m0(J8.i iVar) {
        return G8.b.a.d0(this, iVar);
    }

    @Override // J8.o
    public J8.i n(J8.d dVar) {
        return G8.b.a.c0(this, dVar);
    }

    @Override // J8.o
    public J8.i n0(J8.l lVar) {
        return G8.b.a.u(this, lVar);
    }

    @Override // F8.o0
    public L7.h o(J8.m mVar) {
        return G8.b.a.s(this, mVar);
    }

    @Override // J8.o
    public boolean o0(J8.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        return f0(e(jVar));
    }

    @Override // J8.o
    public boolean p(J8.i iVar) {
        return G8.b.a.P(this, iVar);
    }

    @Override // J8.o
    public boolean p0(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.j jVarB = b(iVar);
        return (jVarB != null ? d(jVarB) : null) != null;
    }

    @Override // F8.o0
    public J8.i q(J8.n nVar) {
        return G8.b.a.t(this, nVar);
    }

    @Override // J8.o
    public J8.c q0(J8.d dVar) {
        return G8.b.a.l0(this, dVar);
    }

    @Override // J8.o
    public J8.f r(J8.g gVar) {
        G8.b.a.f(this, gVar);
        return null;
    }

    @Override // F8.o0
    public boolean r0(J8.m mVar) {
        return G8.b.a.J(this, mVar);
    }

    @Override // J8.o
    public java.util.List s(J8.m mVar) {
        return G8.b.a.q(this, mVar);
    }

    @Override // J8.o
    public int s0(J8.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "<this>");
        if (kVar instanceof J8.j) {
            return h((J8.i) kVar);
        }
        if (kVar instanceof J8.a) {
            return ((J8.a) kVar).size();
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + kVar + ", " + p247y7.P.b(kVar.getClass())).toString());
    }

    @Override // J8.o
    public J8.e t(J8.j jVar) {
        return G8.b.a.e(this, jVar);
    }

    @Override // J8.o
    public J8.g t0(J8.i iVar) {
        return G8.b.a.g(this, iVar);
    }

    @Override // J8.o
    public J8.s u(J8.l lVar) {
        return G8.b.a.y(this, lVar);
    }

    @Override // J8.o
    public J8.m u0(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.j jVarB = b(iVar);
        if (jVarB == null) {
            jVarB = z(iVar);
        }
        return e(jVarB);
    }

    @Override // J8.o
    public boolean v(J8.j jVar) {
        return G8.b.a.Y(this, jVar);
    }

    @Override // J8.o
    public boolean v0(J8.i iVar) {
        return G8.b.a.T(this, iVar);
    }

    @Override // J8.o
    public java.util.Collection w(J8.j jVar) {
        return G8.b.a.h0(this, jVar);
    }

    @Override // F8.o0
    public J8.i w0(J8.i iVar) {
        return G8.b.a.w(this, iVar);
    }

    @Override // J8.o
    public java.util.List x(J8.n nVar) {
        return G8.b.a.x(this, nVar);
    }

    @Override // J8.o
    public boolean x0(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.j jVarB = b(iVar);
        return (jVarB != null ? t(jVarB) : null) != null;
    }

    @Override // J8.o
    public J8.l y(J8.i iVar) {
        return G8.b.a.i(this, iVar);
    }

    @Override // J8.o
    public J8.j y0(J8.e eVar) {
        return G8.b.a.f0(this, eVar);
    }

    @Override // J8.o
    public J8.j z(J8.i iVar) {
        J8.j jVarC;
        p247y7.AbstractC7350t.f(iVar, "<this>");
        J8.g gVarT0 = t0(iVar);
        if (gVarT0 != null && (jVarC = c(gVarT0)) != null) {
            return jVarC;
        }
        J8.j jVarB = b(iVar);
        p247y7.AbstractC7350t.c(jVarB);
        return jVarB;
    }

    @Override // J8.o
    public boolean z0(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return C0(z(iVar)) != C0(G(iVar));
    }
}
