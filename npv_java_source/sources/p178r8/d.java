package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p178r8.d f53988a = new p178r8.d();

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final r8.d.a f53989D = new r8.d.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
            return java.lang.Boolean.FALSE;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1420a f53990D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1420a f53991E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
            super(2);
            this.f53990D = interfaceC1420a;
            this.f53991E = interfaceC1420a2;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
            return java.lang.Boolean.valueOf(p247y7.AbstractC7350t.b(interfaceC1432m, this.f53990D) && p247y7.AbstractC7350t.b(interfaceC1432m2, this.f53991E));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final r8.d.c f53992D = new r8.d.c();

        c() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
            return java.lang.Boolean.FALSE;
        }
    }

    private d() {
    }

    public static /* synthetic */ boolean c(p178r8.d dVar, O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, boolean z6, boolean z10, boolean z11, G8.g gVar, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i6 & 16) != 0) {
            z11 = false;
        }
        return dVar.b(interfaceC1420a, interfaceC1420a2, z6, z12, z11, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z6, O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, F8.e0 e0Var, F8.e0 e0Var2) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "$a");
        p247y7.AbstractC7350t.f(interfaceC1420a2, "$b");
        p247y7.AbstractC7350t.f(e0Var, "c1");
        p247y7.AbstractC7350t.f(e0Var2, "c2");
        if (p247y7.AbstractC7350t.b(e0Var, e0Var2)) {
            return true;
        }
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        O7.InterfaceC1427h interfaceC1427hW2 = e0Var2.w();
        if ((interfaceC1427hW instanceof O7.f0) && (interfaceC1427hW2 instanceof O7.f0)) {
            return f53988a.i((O7.f0) interfaceC1427hW, (O7.f0) interfaceC1427hW2, z6, new r8.d.b(interfaceC1420a, interfaceC1420a2));
        }
        return false;
    }

    private final boolean e(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1424e interfaceC1424e2) {
        return p247y7.AbstractC7350t.b(interfaceC1424e.p(), interfaceC1424e2.p());
    }

    public static /* synthetic */ boolean g(p178r8.d dVar, O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            z10 = true;
        }
        return dVar.f(interfaceC1432m, interfaceC1432m2, z6, z10);
    }

    public static /* synthetic */ boolean j(p178r8.d dVar, O7.f0 f0Var, O7.f0 f0Var2, boolean z6, p237x7.p pVar, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            pVar = r8.d.c.f53992D;
        }
        return dVar.i(f0Var, f0Var2, z6, pVar);
    }

    private final boolean k(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2, p237x7.p pVar, boolean z6) {
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1432m.b();
        O7.InterfaceC1432m interfaceC1432mB2 = interfaceC1432m2.b();
        return ((interfaceC1432mB instanceof O7.InterfaceC1421b) || (interfaceC1432mB2 instanceof O7.InterfaceC1421b)) ? ((java.lang.Boolean) pVar.u(interfaceC1432mB, interfaceC1432mB2)).booleanValue() : g(this, interfaceC1432mB, interfaceC1432mB2, z6, false, 8, null);
    }

    private final O7.a0 l(O7.InterfaceC1420a interfaceC1420a) {
        while (interfaceC1420a instanceof O7.InterfaceC1421b) {
            O7.InterfaceC1421b interfaceC1421b = (O7.InterfaceC1421b) interfaceC1420a;
            if (interfaceC1421b.j() != O7.InterfaceC1421b.a.FAKE_OVERRIDE) {
                break;
            }
            java.util.Collection collectionF = interfaceC1421b.f();
            p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
            interfaceC1420a = (O7.InterfaceC1421b) p097j7.AbstractC6879v.H0(collectionF);
            if (interfaceC1420a == null) {
                return null;
            }
        }
        return interfaceC1420a.o();
    }

    public final boolean b(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, boolean z6, boolean z10, boolean z11, G8.g gVar) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "a");
        p247y7.AbstractC7350t.f(interfaceC1420a2, "b");
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        if (p247y7.AbstractC7350t.b(interfaceC1420a, interfaceC1420a2)) {
            return true;
        }
        if (!p247y7.AbstractC7350t.b(interfaceC1420a.getName(), interfaceC1420a2.getName())) {
            return false;
        }
        if (z10 && (interfaceC1420a instanceof O7.C) && (interfaceC1420a2 instanceof O7.C) && ((O7.C) interfaceC1420a).R() != ((O7.C) interfaceC1420a2).R()) {
            return false;
        }
        if ((p247y7.AbstractC7350t.b(interfaceC1420a.b(), interfaceC1420a2.b()) && (!z6 || !p247y7.AbstractC7350t.b(l(interfaceC1420a), l(interfaceC1420a2)))) || p178r8.f.E(interfaceC1420a) || p178r8.f.E(interfaceC1420a2) || !k(interfaceC1420a, interfaceC1420a2, r8.d.a.f53989D, z6)) {
            return false;
        }
        p178r8.l lVarI = p178r8.l.i(gVar, new p178r8.c(z6, interfaceC1420a, interfaceC1420a2));
        p247y7.AbstractC7350t.e(lVarI, "create(...)");
        r8.l.i.a aVarC = lVarI.E(interfaceC1420a, interfaceC1420a2, null, !z11).c();
        r8.l.i.a aVar = r8.l.i.a.OVERRIDABLE;
        return aVarC == aVar && lVarI.E(interfaceC1420a2, interfaceC1420a, null, z11 ^ true).c() == aVar;
    }

    public final boolean f(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2, boolean z6, boolean z10) {
        if ((interfaceC1432m instanceof O7.InterfaceC1424e) && (interfaceC1432m2 instanceof O7.InterfaceC1424e)) {
            return e((O7.InterfaceC1424e) interfaceC1432m, (O7.InterfaceC1424e) interfaceC1432m2);
        }
        if ((interfaceC1432m instanceof O7.f0) && (interfaceC1432m2 instanceof O7.f0)) {
            return j(this, (O7.f0) interfaceC1432m, (O7.f0) interfaceC1432m2, z6, null, 8, null);
        }
        if ((interfaceC1432m instanceof O7.InterfaceC1420a) && (interfaceC1432m2 instanceof O7.InterfaceC1420a)) {
            return c(this, (O7.InterfaceC1420a) interfaceC1432m, (O7.InterfaceC1420a) interfaceC1432m2, z6, z10, false, G8.g.a.f3136a, 16, null);
        }
        boolean z11 = interfaceC1432m instanceof O7.K;
        java.lang.Object objE = interfaceC1432m;
        java.lang.Object objE2 = interfaceC1432m2;
        if (z11 && (interfaceC1432m2 instanceof O7.K)) {
            objE = interfaceC1432m;
            objE2 = interfaceC1432m2;
            objE = ((O7.K) interfaceC1432m).e();
            objE2 = ((O7.K) interfaceC1432m2).e();
        }
        objE = interfaceC1432m;
        objE2 = interfaceC1432m2;
        return p247y7.AbstractC7350t.b(objE, objE2);
    }

    public final boolean h(O7.f0 f0Var, O7.f0 f0Var2, boolean z6) {
        p247y7.AbstractC7350t.f(f0Var, "a");
        p247y7.AbstractC7350t.f(f0Var2, "b");
        return j(this, f0Var, f0Var2, z6, null, 8, null);
    }

    public final boolean i(O7.f0 f0Var, O7.f0 f0Var2, boolean z6, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(f0Var, "a");
        p247y7.AbstractC7350t.f(f0Var2, "b");
        p247y7.AbstractC7350t.f(pVar, "equivalentCallables");
        if (p247y7.AbstractC7350t.b(f0Var, f0Var2)) {
            return true;
        }
        return !p247y7.AbstractC7350t.b(f0Var.b(), f0Var2.b()) && k(f0Var, f0Var2, pVar, z6) && f0Var.getIndex() == f0Var2.getIndex();
    }
}
