package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements p178r8.g {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16023a;

        static {
            int[] iArr = new int[r8.l.i.a.values().length];
            try {
                iArr[r8.l.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            f16023a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.l.b f16024D = new X7.l.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.j0 j0Var) {
            return j0Var.getType();
        }
    }

    @Override // p178r8.g
    public r8.g.a a() {
        return r8.g.a.SUCCESS_ONLY;
    }

    @Override // p178r8.g
    public r8.g.b b(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "superDescriptor");
        p247y7.AbstractC7350t.f(interfaceC1420a2, "subDescriptor");
        if (interfaceC1420a2 instanceof Z7.e) {
            Z7.e eVar = (Z7.e) interfaceC1420a2;
            java.util.List listG = eVar.g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            if (!(!listG.isEmpty())) {
                r8.l.i iVarW = p178r8.l.w(interfaceC1420a, interfaceC1420a2);
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return r8.g.b.UNKNOWN;
                }
                java.util.List listN = eVar.n();
                p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                R8.h hVarG = R8.k.G(p097j7.AbstractC6879v.Y(listN), X7.l.b.f16024D);
                F8.E eL = eVar.l();
                p247y7.AbstractC7350t.c(eL);
                R8.h hVarJ = R8.k.J(hVarG, eL);
                O7.X xV0 = eVar.v0();
                for (F8.E e6 : R8.k.I(hVarJ, p097j7.AbstractC6879v.q(xV0 != null ? xV0.getType() : null))) {
                    if ((!e6.U0().isEmpty()) && !(e6.Z0() instanceof p028c8.h)) {
                        return r8.g.b.UNKNOWN;
                    }
                }
                O7.InterfaceC1420a interfaceC1420aI = (O7.InterfaceC1420a) interfaceC1420a.c(new p028c8.g(null, 1, null).c());
                if (interfaceC1420aI == null) {
                    return r8.g.b.UNKNOWN;
                }
                if (interfaceC1420aI instanceof O7.Z) {
                    O7.Z z6 = (O7.Z) interfaceC1420aI;
                    java.util.List listG2 = z6.g();
                    p247y7.AbstractC7350t.e(listG2, "getTypeParameters(...)");
                    if (!listG2.isEmpty()) {
                        interfaceC1420aI = z6.z().y(p097j7.AbstractC6879v.m()).i();
                        p247y7.AbstractC7350t.c(interfaceC1420aI);
                    }
                }
                r8.l.i.a aVarC = p178r8.l.f54007f.F(interfaceC1420aI, interfaceC1420a2, false).c();
                p247y7.AbstractC7350t.e(aVarC, "getResult(...)");
                return X7.l.a.f16023a[aVarC.ordinal()] == 1 ? r8.g.b.OVERRIDABLE : r8.g.b.UNKNOWN;
            }
        }
        return r8.g.b.UNKNOWN;
    }
}
