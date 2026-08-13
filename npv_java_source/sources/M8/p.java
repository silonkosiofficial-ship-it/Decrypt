package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends M8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.p f7108a = new M8.p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.List f7109b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M8.p.a f7110D = new M8.p.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "$this$$receiver");
            java.util.List listN = interfaceC1443y.n();
            p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
            O7.j0 j0Var = (O7.j0) p097j7.AbstractC6879v.v0(listN);
            boolean z6 = false;
            if (j0Var != null && !p218v8.c.c(j0Var) && j0Var.u0() == null) {
                z6 = true;
            }
            M8.p pVar = M8.p.f7108a;
            if (z6) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M8.p.b f7111D = new M8.p.b();

        b() {
            super(1);
        }

        private static final boolean e(O7.InterfaceC1432m interfaceC1432m) {
            return (interfaceC1432m instanceof O7.InterfaceC1424e) && L7.g.a0((O7.InterfaceC1424e) interfaceC1432m);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0050  */
        /* JADX WARN: Code duplicated, block: B:17:0x0052  */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(O7.InterfaceC1443y interfaceC1443y) {
            boolean z6;
            p247y7.AbstractC7350t.f(interfaceC1443y, "$this$$receiver");
            M8.p pVar = M8.p.f7108a;
            O7.InterfaceC1432m interfaceC1432mB = interfaceC1443y.b();
            p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
            if (e(interfaceC1432mB)) {
                z6 = true;
            } else {
                java.util.Collection collectionF = interfaceC1443y.f();
                p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
                java.util.Collection collection = collectionF;
                if (!collection.isEmpty()) {
                    java.util.Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            O7.InterfaceC1432m interfaceC1432mB2 = ((O7.InterfaceC1443y) it.next()).b();
                            p247y7.AbstractC7350t.e(interfaceC1432mB2, "getContainingDeclaration(...)");
                            if (e(interfaceC1432mB2)) {
                            }
                        } else if (O7.AbstractC1437s.c(interfaceC1443y)) {
                            z6 = false;
                        }
                        z6 = true;
                    }
                } else if (O7.AbstractC1437s.c(interfaceC1443y)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            }
            if (z6) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("must override ''equals()'' in Any");
            O7.InterfaceC1432m interfaceC1432mB3 = interfaceC1443y.b();
            p247y7.AbstractC7350t.e(interfaceC1432mB3, "getContainingDeclaration(...)");
            if (p178r8.h.g(interfaceC1432mB3)) {
                p168q8.c cVar = p168q8.c.f53161i;
                O7.InterfaceC1432m interfaceC1432mB4 = interfaceC1443y.b();
                p247y7.AbstractC7350t.d(interfaceC1432mB4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                F8.M mW = ((O7.InterfaceC1424e) interfaceC1432mB4).w();
                p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
                sb.append(" or define ''equals(other: " + cVar.w(K8.a.y(mW)) + "): Boolean''");
            }
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return string;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M8.p.c f7112D = new M8.p.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(O7.InterfaceC1443y interfaceC1443y) {
            boolean zR;
            p247y7.AbstractC7350t.f(interfaceC1443y, "$this$$receiver");
            O7.X xM0 = interfaceC1443y.m0();
            if (xM0 == null) {
                xM0 = interfaceC1443y.v0();
            }
            M8.p pVar = M8.p.f7108a;
            boolean z6 = false;
            if (xM0 != null) {
                F8.E eL = interfaceC1443y.l();
                if (eL != null) {
                    F8.E type = xM0.getType();
                    p247y7.AbstractC7350t.e(type, "getType(...)");
                    zR = K8.a.r(eL, type);
                } else {
                    zR = false;
                }
                if (zR || pVar.d(interfaceC1443y, xM0)) {
                    z6 = true;
                }
            }
            if (z6) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        p138n8.f fVar = M8.q.f7148k;
        M8.k.b bVar = M8.k.b.f7100b;
        M8.h hVar = new M8.h(fVar, new M8.f[]{bVar, new M8.t.a(1)}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null);
        M8.h hVar2 = new M8.h(M8.q.f7149l, new M8.f[]{bVar, new M8.t.a(2)}, M8.p.a.f7110D);
        p138n8.f fVar2 = M8.q.f7139b;
        M8.m mVar = M8.m.f7102a;
        M8.t.a aVar = new M8.t.a(2);
        M8.j jVar = M8.j.f7096a;
        M8.h hVar3 = new M8.h(fVar2, new M8.f[]{bVar, mVar, aVar, jVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null);
        M8.h hVar4 = new M8.h(M8.q.f7140c, new M8.f[]{bVar, mVar, new M8.t.a(3), jVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null);
        M8.h hVar5 = new M8.h(M8.q.f7141d, new M8.f[]{bVar, mVar, new M8.t.b(2), jVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null);
        M8.h hVar6 = new M8.h(M8.q.f7146i, new M8.f[]{bVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null);
        p138n8.f fVar3 = M8.q.f7145h;
        M8.t.d dVar = M8.t.d.f7180b;
        M8.r.a aVar2 = M8.r.a.f7167d;
        M8.h hVar7 = new M8.h(fVar3, new M8.f[]{bVar, dVar, mVar, aVar2}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null);
        p138n8.f fVar4 = M8.q.f7147j;
        M8.t.c cVar = M8.t.c.f7179b;
        f7109b = p097j7.AbstractC6879v.p(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new M8.h(fVar4, new M8.f[]{bVar, cVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7150m, new M8.f[]{bVar, cVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7151n, new M8.f[]{bVar, cVar, aVar2}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7121I, new M8.f[]{bVar, dVar, mVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7122J, new M8.f[]{bVar, dVar, mVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7142e, new M8.f[]{M8.k.a.f7099b}, M8.p.b.f7111D), new M8.h(M8.q.f7144g, new M8.f[]{bVar, M8.r.b.f7169d, dVar, mVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7131S, new M8.f[]{bVar, dVar, mVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7130R, new M8.f[]{bVar, cVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(p097j7.AbstractC6879v.p(M8.q.f7161x, M8.q.f7162y), new M8.f[]{bVar}, M8.p.c.f7112D), new M8.h(M8.q.f7134V, new M8.f[]{bVar, M8.r.c.f7171d, dVar, mVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null), new M8.h(M8.q.f7153p, new M8.f[]{bVar, cVar}, (p237x7.l) null, 4, (p247y7.AbstractC7342k) null));
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(O7.InterfaceC1443y interfaceC1443y, O7.X x6) {
        p138n8.b bVarK;
        F8.E eL;
        p257z8.g value = x6.getValue();
        p247y7.AbstractC7350t.e(value, "getValue(...)");
        if (!(value instanceof p257z8.e)) {
            return false;
        }
        O7.InterfaceC1424e interfaceC1424eV = ((p257z8.e) value).v();
        if (!interfaceC1424eV.R() || (bVarK = p218v8.c.k(interfaceC1424eV)) == null) {
            return false;
        }
        O7.InterfaceC1427h interfaceC1427hB = O7.AbstractC1442x.b(p218v8.c.p(interfaceC1424eV), bVarK);
        O7.e0 e0Var = interfaceC1427hB instanceof O7.e0 ? (O7.e0) interfaceC1427hB : null;
        if (e0Var == null || (eL = interfaceC1443y.l()) == null) {
            return false;
        }
        return K8.a.r(eL, e0Var.c0());
    }

    @Override // M8.b
    public java.util.List b() {
        return f7109b;
    }
}
