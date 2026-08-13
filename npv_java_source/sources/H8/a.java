package H8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends R7.C1502h {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        H8.k kVar = H8.k.f4528a;
        O7.G gI = kVar.i();
        O7.D d6 = O7.D.OPEN;
        O7.EnumC1425f enumC1425f = O7.EnumC1425f.CLASS;
        java.util.List listM = p097j7.AbstractC6879v.m();
        O7.a0 a0Var = O7.a0.f8143a;
        super(gI, fVar, d6, enumC1425f, listM, a0Var, false, E8.f.f2273e);
        R7.C1500f c1500fW1 = R7.C1500f.w1(this, P7.g.f8385d.b(), true, a0Var);
        c1500fW1.z1(p097j7.AbstractC6879v.m(), O7.AbstractC1438t.f8185d);
        p247y7.AbstractC7350t.e(c1500fW1, "apply(...)");
        H8.g gVar = H8.g.SCOPE_FOR_ERROR_CLASS;
        java.lang.String string = c1500fW1.getName().toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        p248y8.h hVarB = H8.k.b(gVar, string, "");
        H8.j jVar = H8.j.f4479V0;
        c1500fW1.p1(new H8.h(kVar.e(jVar, new java.lang.String[0]), hVarB, jVar, null, false, new java.lang.String[0], 24, null));
        T0(hVarB, p097j7.Z.c(c1500fW1), c1500fW1);
    }

    @Override // R7.AbstractC1495a, R7.t
    public p248y8.h M(F8.l0 l0Var, G8.g gVar) {
        p247y7.AbstractC7350t.f(l0Var, "typeSubstitution");
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        H8.g gVar2 = H8.g.SCOPE_FOR_ERROR_CLASS;
        java.lang.String string = getName().toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return H8.k.b(gVar2, string, l0Var.toString());
    }

    @Override // R7.AbstractC1495a, O7.c0
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1424e c(F8.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "substitutor");
        return this;
    }

    @Override // R7.C1502h
    public java.lang.String toString() {
        java.lang.String strG = getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return strG;
    }
}
