package p218v8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.f f56014a;

    /* synthetic */ class a extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final v8.c.a f56015L = new v8.c.a();

        a() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "declaresDefaultValue";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(O7.j0.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "declaresDefaultValue()Z";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.j0 j0Var) {
            p247y7.AbstractC7350t.f(j0Var, "p0");
            return java.lang.Boolean.valueOf(j0Var.D0());
        }
    }

    public static final class b extends P8.b.AbstractC0201b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p247y7.O f56016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56017b;

        b(p247y7.O o6, p237x7.l lVar) {
            this.f56016a = o6;
            this.f56017b = lVar;
        }

        @Override // P8.b.AbstractC0201b, P8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "current");
            if (this.f56016a.f57254C == null && ((java.lang.Boolean) this.f56017b.l(interfaceC1421b)).booleanValue()) {
                this.f56016a.f57254C = interfaceC1421b;
            }
        }

        @Override // P8.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "current");
            return this.f56016a.f57254C == null;
        }

        @Override // P8.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public O7.InterfaceC1421b a() {
            return (O7.InterfaceC1421b) this.f56016a.f57254C;
        }
    }

    /* JADX INFO: renamed from: v8.c$c, reason: collision with other inner class name */
    static final class C0736c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p218v8.c.C0736c f56018D = new p218v8.c.C0736c();

        C0736c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1432m l(O7.InterfaceC1432m interfaceC1432m) {
            p247y7.AbstractC7350t.f(interfaceC1432m, "it");
            return interfaceC1432m.b();
        }
    }

    static {
        p138n8.f fVarO = p138n8.f.o("value");
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        f56014a = fVarO;
    }

    public static final boolean c(O7.j0 j0Var) {
        p247y7.AbstractC7350t.f(j0Var, "<this>");
        java.lang.Boolean boolE = P8.b.e(p097j7.AbstractC6879v.e(j0Var), p218v8.a.f56012a, v8.c.a.f56015L);
        p247y7.AbstractC7350t.e(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable d(O7.j0 j0Var) {
        java.util.Collection collectionF = j0Var.f();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionF, 10));
        java.util.Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(((O7.j0) it.next()).a());
        }
        return arrayList;
    }

    public static final O7.InterfaceC1421b e(O7.InterfaceC1421b interfaceC1421b, boolean z6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return (O7.InterfaceC1421b) P8.b.b(p097j7.AbstractC6879v.e(interfaceC1421b), new p218v8.b(z6), new v8.c.b(new p247y7.O(), lVar));
    }

    public static /* synthetic */ O7.InterfaceC1421b f(O7.InterfaceC1421b interfaceC1421b, boolean z6, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return e(interfaceC1421b, z6, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable g(boolean z6, O7.InterfaceC1421b interfaceC1421b) {
        if (z6) {
            interfaceC1421b = interfaceC1421b != null ? interfaceC1421b.a() : null;
        }
        java.util.Collection collectionF = interfaceC1421b != null ? interfaceC1421b.f() : null;
        return collectionF == null ? p097j7.AbstractC6879v.m() : collectionF;
    }

    public static final p138n8.c h(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        p138n8.d dVarM = m(interfaceC1432m);
        if (!dVarM.f()) {
            dVarM = null;
        }
        if (dVarM != null) {
            return dVarM.l();
        }
        return null;
    }

    public static final O7.InterfaceC1424e i(P7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = cVar.getType().W0().w();
        if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hW;
        }
        return null;
    }

    public static final L7.g j(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return p(interfaceC1432m).t();
    }

    public static final p138n8.b k(O7.InterfaceC1427h interfaceC1427h) {
        O7.InterfaceC1432m interfaceC1432mB;
        p138n8.b bVarK;
        if (interfaceC1427h == null || (interfaceC1432mB = interfaceC1427h.b()) == null) {
            return null;
        }
        if (interfaceC1432mB instanceof O7.K) {
            return new p138n8.b(((O7.K) interfaceC1432mB).e(), interfaceC1427h.getName());
        }
        if (!(interfaceC1432mB instanceof O7.InterfaceC1428i) || (bVarK = k((O7.InterfaceC1427h) interfaceC1432mB)) == null) {
            return null;
        }
        return bVarK.d(interfaceC1427h.getName());
    }

    public static final p138n8.c l(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        p138n8.c cVarN = p178r8.f.n(interfaceC1432m);
        p247y7.AbstractC7350t.e(cVarN, "getFqNameSafe(...)");
        return cVarN;
    }

    public static final p138n8.d m(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        p138n8.d dVarM = p178r8.f.m(interfaceC1432m);
        p247y7.AbstractC7350t.e(dVarM, "getFqName(...)");
        return dVarM;
    }

    public static final O7.C1444z n(O7.InterfaceC1424e interfaceC1424e) {
        O7.h0 h0VarI0 = interfaceC1424e != null ? interfaceC1424e.I0() : null;
        if (h0VarI0 instanceof O7.C1444z) {
            return (O7.C1444z) h0VarI0;
        }
        return null;
    }

    public static final G8.g o(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "<this>");
        androidx.appcompat.app.D.a(g6.q0(G8.h.a()));
        return G8.g.a.f3136a;
    }

    public static final O7.G p(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        O7.G g6 = p178r8.f.g(interfaceC1432m);
        p247y7.AbstractC7350t.e(g6, "getContainingModule(...)");
        return g6;
    }

    public static final O7.H q(O7.InterfaceC1424e interfaceC1424e) {
        O7.h0 h0VarI0 = interfaceC1424e != null ? interfaceC1424e.I0() : null;
        if (h0VarI0 instanceof O7.H) {
            return (O7.H) h0VarI0;
        }
        return null;
    }

    public static final R8.h r(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return R8.k.v(s(interfaceC1432m), 1);
    }

    public static final R8.h s(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return R8.k.n(interfaceC1432m, p218v8.c.C0736c.f56018D);
    }

    public static final O7.InterfaceC1421b t(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        if (!(interfaceC1421b instanceof O7.T)) {
            return interfaceC1421b;
        }
        O7.U uK0 = ((O7.T) interfaceC1421b).K0();
        p247y7.AbstractC7350t.e(uK0, "getCorrespondingProperty(...)");
        return uK0;
    }

    public static final O7.InterfaceC1424e u(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
        for (F8.E e6 : interfaceC1424e.w().W0().u()) {
            if (!L7.g.b0(e6)) {
                O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
                if (p178r8.f.w(interfaceC1427hW)) {
                    p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (O7.InterfaceC1424e) interfaceC1427hW;
                }
            }
        }
        return null;
    }

    public static final boolean v(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "<this>");
        androidx.appcompat.app.D.a(g6.q0(G8.h.a()));
        return false;
    }

    public static final O7.InterfaceC1424e w(O7.G g6, p138n8.c cVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(g6, "<this>");
        p247y7.AbstractC7350t.f(cVar, "topLevelClassFqName");
        p247y7.AbstractC7350t.f(bVar, "location");
        cVar.d();
        p138n8.c cVarE = cVar.e();
        p247y7.AbstractC7350t.e(cVarE, "parent(...)");
        p248y8.h hVarU = g6.s0(cVarE).u();
        p138n8.f fVarG = cVar.g();
        p247y7.AbstractC7350t.e(fVarG, "shortName(...)");
        O7.InterfaceC1427h interfaceC1427hG = hVarU.g(fVarG, bVar);
        if (interfaceC1427hG instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hG;
        }
        return null;
    }
}
