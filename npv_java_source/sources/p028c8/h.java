package p028c8;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends F8.AbstractC0963y implements F8.L {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final c8.h.a f24465D = new c8.h.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "it");
            return "(raw) " + str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(F8.M m6, F8.M m10) {
        this(m6, m10, false);
        p247y7.AbstractC7350t.f(m6, "lowerBound");
        p247y7.AbstractC7350t.f(m10, "upperBound");
    }

    private h(F8.M m6, F8.M m10, boolean z6) {
        super(m6, m10);
        if (z6) {
            return;
        }
        G8.e.f3134a.d(m6, m10);
    }

    private static final boolean j1(java.lang.String str, java.lang.String str2) {
        return p247y7.AbstractC7350t.b(str, S8.r.J0(str2, "out ")) || p247y7.AbstractC7350t.b(str2, "*");
    }

    private static final java.util.List k1(p168q8.c cVar, F8.E e6) {
        java.util.List listU0 = e6.U0();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listU0, 10));
        java.util.Iterator it = listU0.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.x((F8.i0) it.next()));
        }
        return arrayList;
    }

    private static final java.lang.String l1(java.lang.String str, java.lang.String str2) {
        if (!S8.r.b0(str, '<', false, 2, null)) {
            return str;
        }
        return S8.r.p1(str, '<', null, 2, null) + '<' + str2 + '>' + S8.r.l1(str, '>', null, 2, null);
    }

    @Override // F8.AbstractC0963y
    public F8.M d1() {
        return e1();
    }

    @Override // F8.AbstractC0963y
    public java.lang.String g1(p168q8.c cVar, p168q8.f fVar) {
        p087i7.u uVar;
        p247y7.AbstractC7350t.f(cVar, "renderer");
        p247y7.AbstractC7350t.f(fVar, "options");
        java.lang.String strW = cVar.w(e1());
        java.lang.String strW2 = cVar.w(f1());
        if (fVar.n()) {
            return "raw (" + strW + ".." + strW2 + ')';
        }
        if (f1().U0().isEmpty()) {
            return cVar.t(strW, strW2, K8.a.i(this));
        }
        java.util.List listK1 = k1(cVar, e1());
        java.util.List listK2 = k1(cVar, f1());
        java.util.List list = listK1;
        java.lang.String strR0 = p097j7.AbstractC6879v.r0(list, ", ", null, null, 0, null, c8.h.a.f24465D, 30, null);
        java.util.List listC1 = p097j7.AbstractC6879v.c1(list, listK2);
        if (!(listC1 instanceof java.util.Collection) || !listC1.isEmpty()) {
            java.util.Iterator it = listC1.iterator();
            do {
                if (!it.hasNext()) {
                    strW2 = l1(strW2, strR0);
                    break;
                }
                uVar = (p087i7.u) it.next();
            } while (j1((java.lang.String) uVar.c(), (java.lang.String) uVar.d()));
        } else {
            strW2 = l1(strW2, strR0);
            break;
        }
        java.lang.String strL1 = l1(strW, strR0);
        return p247y7.AbstractC7350t.b(strL1, strW2) ? strL1 : cVar.t(strL1, strW2, K8.a.i(this));
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public p028c8.h a1(boolean z6) {
        return new p028c8.h(e1().a1(z6), f1().a1(z6));
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public F8.AbstractC0963y g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.E eA = gVar.a(e1());
        p247y7.AbstractC7350t.d(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        F8.E eA2 = gVar.a(f1());
        p247y7.AbstractC7350t.d(eA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new p028c8.h((F8.M) eA, (F8.M) eA2, true);
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public p028c8.h c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return new p028c8.h(e1().c1(a0Var), f1().c1(a0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F8.AbstractC0963y, F8.E
    public p248y8.h u() {
        O7.InterfaceC1427h interfaceC1427hW = W0().w();
        F8.h0 h0Var = null;
        java.lang.Object[] objArr = 0;
        O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
        if (interfaceC1424e != null) {
            p248y8.h hVarF0 = interfaceC1424e.f0(new p028c8.g(h0Var, 1, objArr == true ? 1 : 0));
            p247y7.AbstractC7350t.e(hVarF0, "getMemberScope(...)");
            return hVarF0;
        }
        throw new java.lang.IllegalStateException(("Incorrect classifier: " + W0().w()).toString());
    }
}
