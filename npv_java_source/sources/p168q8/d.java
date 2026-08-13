package p168q8;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p168q8.c implements p168q8.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p168q8.g f53176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f53177m;

    private final class a implements O7.InterfaceC1434o {

        /* JADX INFO: renamed from: q8.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0693a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f53179a;

            static {
                int[] iArr = new int[p168q8.l.values().length];
                try {
                    iArr[p168q8.l.PRETTY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[p168q8.l.DEBUG.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[p168q8.l.NONE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f53179a = iArr;
            }
        }

        public a() {
        }

        private final void t(O7.T t6, java.lang.StringBuilder sb, java.lang.String str) throws java.io.IOException {
            int i6 = q8.d.a.C0693a.f53179a[p168q8.d.this.k0().ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
                p(t6, sb);
                return;
            }
            p168q8.d.this.Q0(t6, sb);
            sb.append(str + " for ");
            p168q8.d dVar = p168q8.d.this;
            O7.U uK0 = t6.K0();
            p247y7.AbstractC7350t.e(uK0, "getCorrespondingProperty(...)");
            dVar.z1(uK0, sb);
        }

        public void A(O7.j0 j0Var, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(j0Var, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.R1(j0Var, true, sb, true);
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object a(O7.W w6, java.lang.Object obj) throws java.io.IOException {
            w(w6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object b(O7.j0 j0Var, java.lang.Object obj) {
            A(j0Var, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object c(O7.e0 e0Var, java.lang.Object obj) {
            y(e0Var, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object d(O7.InterfaceC1443y interfaceC1443y, java.lang.Object obj) throws java.io.IOException {
            p(interfaceC1443y, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object e(O7.InterfaceC1431l interfaceC1431l, java.lang.Object obj) throws java.io.IOException {
            o(interfaceC1431l, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object f(O7.X x6, java.lang.Object obj) {
            x(x6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object g(O7.V v6, java.lang.Object obj) throws java.io.IOException {
            v(v6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object h(O7.U u6, java.lang.Object obj) throws java.io.IOException {
            u(u6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object i(O7.f0 f0Var, java.lang.Object obj) {
            z(f0Var, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object j(O7.K k6, java.lang.Object obj) {
            r(k6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object k(O7.P p6, java.lang.Object obj) {
            s(p6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object l(O7.InterfaceC1424e interfaceC1424e, java.lang.Object obj) throws java.io.IOException {
            n(interfaceC1424e, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        @Override // O7.InterfaceC1434o
        public /* bridge */ /* synthetic */ java.lang.Object m(O7.G g6, java.lang.Object obj) {
            q(g6, (java.lang.StringBuilder) obj);
            return p087i7.M.f46721a;
        }

        public void n(O7.InterfaceC1424e interfaceC1424e, java.lang.StringBuilder sb) throws java.io.IOException {
            p247y7.AbstractC7350t.f(interfaceC1424e, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.W0(interfaceC1424e, sb);
        }

        public void o(O7.InterfaceC1431l interfaceC1431l, java.lang.StringBuilder sb) throws java.io.IOException {
            p247y7.AbstractC7350t.f(interfaceC1431l, "constructorDescriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.b1(interfaceC1431l, sb);
        }

        public void p(O7.InterfaceC1443y interfaceC1443y, java.lang.StringBuilder sb) throws java.io.IOException {
            p247y7.AbstractC7350t.f(interfaceC1443y, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.h1(interfaceC1443y, sb);
        }

        public void q(O7.G g6, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(g6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.r1(g6, sb, true);
        }

        public void r(O7.K k6, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(k6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.v1(k6, sb);
        }

        public void s(O7.P p6, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(p6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.x1(p6, sb);
        }

        public void u(O7.U u6, java.lang.StringBuilder sb) throws java.io.IOException {
            p247y7.AbstractC7350t.f(u6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.z1(u6, sb);
        }

        public void v(O7.V v6, java.lang.StringBuilder sb) throws java.io.IOException {
            p247y7.AbstractC7350t.f(v6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            t(v6, sb, "getter");
        }

        public void w(O7.W w6, java.lang.StringBuilder sb) throws java.io.IOException {
            p247y7.AbstractC7350t.f(w6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            t(w6, sb, "setter");
        }

        public void x(O7.X x6, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(x6, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            sb.append(x6.getName());
        }

        public void y(O7.e0 e0Var, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(e0Var, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.H1(e0Var, sb);
        }

        public void z(O7.f0 f0Var, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(f0Var, "descriptor");
            p247y7.AbstractC7350t.f(sb, "builder");
            p168q8.d.this.M1(f0Var, sb, true);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53181b;

        static {
            int[] iArr = new int[p168q8.m.values().length];
            try {
                iArr[p168q8.m.PLAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p168q8.m.HTML.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f53180a = iArr;
            int[] iArr2 = new int[p168q8.k.values().length];
            try {
                iArr2[p168q8.k.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[p168q8.k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[p168q8.k.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f53181b = iArr2;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(F8.i0 i0Var) throws java.io.IOException {
            p247y7.AbstractC7350t.f(i0Var, "it");
            if (i0Var.b()) {
                return "*";
            }
            p168q8.d dVar = p168q8.d.this;
            F8.E type = i0Var.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            java.lang.String strW = dVar.w(type);
            if (i0Var.a() == F8.u0.INVARIANT) {
                return strW;
            }
            return i0Var.a() + ' ' + strW;
        }
    }

    /* JADX INFO: renamed from: q8.d$d, reason: collision with other inner class name */
    static final class C0694d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: q8.d$d$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final p168q8.d.C0694d.a f53184D = new p168q8.d.C0694d.a();

            a() {
                super(1);
            }

            public final void a(p168q8.f fVar) {
                p247y7.AbstractC7350t.f(fVar, "$this$withOptions");
                fVar.b(p097j7.Z.j(fVar.m(), p097j7.AbstractC6879v.p(L7.j.a.f6331C, L7.j.a.f6333D)));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p168q8.f) obj);
                return p087i7.M.f46721a;
            }
        }

        C0694d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p168q8.d b() {
            p168q8.c cVarY = p168q8.d.this.y(p168q8.d.C0694d.a.f53184D);
            p247y7.AbstractC7350t.d(cVarY, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (p168q8.d) cVarY;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final q8.d.e f53185D = new q8.d.e();

        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(O7.j0 j0Var) {
            return "";
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {
        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(F8.E e6) {
            p168q8.d dVar = p168q8.d.this;
            p247y7.AbstractC7350t.c(e6);
            return dVar.w(e6);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final q8.d.g f53187D = new q8.d.g();

        g() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "it");
            return e6;
        }
    }

    public d(p168q8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "options");
        this.f53176l = gVar;
        gVar.l0();
        this.f53177m = p087i7.AbstractC6669o.b(new p168q8.d.C0694d());
    }

    private final void A1(O7.U u6, java.lang.StringBuilder sb) {
        if (d0().contains(p168q8.e.ANNOTATIONS)) {
            U0(this, sb, u6, null, 2, null);
            O7.InterfaceC1441w interfaceC1441wZ0 = u6.z0();
            if (interfaceC1441wZ0 != null) {
                T0(sb, interfaceC1441wZ0, P7.e.FIELD);
            }
            O7.InterfaceC1441w interfaceC1441wW0 = u6.w0();
            if (interfaceC1441wW0 != null) {
                T0(sb, interfaceC1441wW0, P7.e.PROPERTY_DELEGATE_FIELD);
            }
            if (k0() == p168q8.l.NONE) {
                O7.V vD = u6.d();
                if (vD != null) {
                    T0(sb, vD, P7.e.PROPERTY_GETTER);
                }
                O7.W wI = u6.i();
                if (wI != null) {
                    T0(sb, wI, P7.e.PROPERTY_SETTER);
                    java.util.List listN = wI.n();
                    p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                    O7.j0 j0Var = (O7.j0) p097j7.AbstractC6879v.G0(listN);
                    p247y7.AbstractC7350t.c(j0Var);
                    T0(sb, j0Var, P7.e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void B1(O7.InterfaceC1420a interfaceC1420a, java.lang.StringBuilder sb) {
        O7.X xV0 = interfaceC1420a.v0();
        if (xV0 != null) {
            T0(sb, xV0, P7.e.RECEIVER);
            F8.E type = xV0.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            sb.append(f1(type));
            sb.append(".");
        }
    }

    private final void C1(O7.InterfaceC1420a interfaceC1420a, java.lang.StringBuilder sb) {
        O7.X xV0;
        if (l0() && (xV0 = interfaceC1420a.v0()) != null) {
            sb.append(" on ");
            F8.E type = xV0.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            sb.append(w(type));
        }
    }

    private final void D1(java.lang.StringBuilder sb, F8.M m6) throws java.io.IOException {
        if (p247y7.AbstractC7350t.b(m6, F8.q0.f2967b) || F8.q0.k(m6)) {
            sb.append("???");
            return;
        }
        if (H8.k.o(m6)) {
            if (!A0()) {
                sb.append("???");
                return;
            }
            F8.e0 e0VarW0 = m6.W0();
            p247y7.AbstractC7350t.d(e0VarW0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(e1(((H8.i) e0VarW0).c(0)));
            return;
        }
        if (F8.G.a(m6)) {
            d1(sb, m6);
        } else if (W1(m6)) {
            i1(sb, m6);
        } else {
            d1(sb, m6);
        }
    }

    private final void E1(java.lang.StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final void F1(O7.InterfaceC1424e interfaceC1424e, java.lang.StringBuilder sb) throws java.io.IOException {
        if (H0() || L7.g.n0(interfaceC1424e.w())) {
            return;
        }
        java.util.Collection collectionU = interfaceC1424e.p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        if (collectionU.isEmpty()) {
            return;
        }
        if (collectionU.size() == 1 && L7.g.b0((F8.E) collectionU.iterator().next())) {
            return;
        }
        E1(sb);
        sb.append(": ");
        p097j7.G.o0(collectionU, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new q8.d.f());
    }

    private final void G1(O7.InterfaceC1443y interfaceC1443y, java.lang.StringBuilder sb) {
        q1(sb, interfaceC1443y.y(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(O7.e0 e0Var, java.lang.StringBuilder sb) {
        U0(this, sb, e0Var, null, 2, null);
        O7.AbstractC1439u abstractC1439uH = e0Var.h();
        p247y7.AbstractC7350t.e(abstractC1439uH, "getVisibility(...)");
        U1(abstractC1439uH, sb);
        m1(e0Var, sb);
        sb.append(k1("typealias"));
        sb.append(" ");
        r1(e0Var, sb, true);
        java.util.List listA = e0Var.A();
        p247y7.AbstractC7350t.e(listA, "getDeclaredTypeParameters(...)");
        O1(listA, sb, false);
        V0(e0Var, sb);
        sb.append(" = ");
        sb.append(w(e0Var.o0()));
    }

    private final java.lang.String J0() {
        return N(">");
    }

    private final void K(java.lang.StringBuilder sb, O7.InterfaceC1432m interfaceC1432m) {
        O7.InterfaceC1432m interfaceC1432mB;
        java.lang.String name;
        if ((interfaceC1432m instanceof O7.K) || (interfaceC1432m instanceof O7.P) || (interfaceC1432mB = interfaceC1432m.b()) == null || (interfaceC1432mB instanceof O7.G)) {
            return;
        }
        sb.append(" ");
        sb.append(n1("defined in"));
        sb.append(" ");
        p138n8.d dVarM = p178r8.f.m(interfaceC1432mB);
        p247y7.AbstractC7350t.e(dVarM, "getFqName(...)");
        sb.append(dVarM.e() ? "root package" : u(dVarM));
        if (F0() && (interfaceC1432mB instanceof O7.K) && (interfaceC1432m instanceof O7.InterfaceC1435p) && (name = ((O7.InterfaceC1435p) interfaceC1432m).o().a().getName()) != null) {
            sb.append(" ");
            sb.append(n1("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    private final boolean K0(F8.E e6) {
        return L7.f.r(e6) || !e6.k().isEmpty();
    }

    private final void K1(java.lang.StringBuilder sb, F8.E e6, F8.e0 e0Var) {
        O7.S sA = O7.g0.a(e6);
        if (sA != null) {
            y1(sb, sA);
        } else {
            sb.append(J1(e0Var));
            sb.append(I1(e6.U0()));
        }
    }

    private final void L(java.lang.StringBuilder sb, java.util.List list) throws java.io.IOException {
        p097j7.G.o0(list, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new q8.d.c());
    }

    private final O7.D L0(O7.C c6) {
        if (c6 instanceof O7.InterfaceC1424e) {
            return ((O7.InterfaceC1424e) c6).j() == O7.EnumC1425f.INTERFACE ? O7.D.ABSTRACT : O7.D.FINAL;
        }
        O7.InterfaceC1432m interfaceC1432mB = c6.b();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
        if (interfaceC1424e != null && (c6 instanceof O7.InterfaceC1421b)) {
            O7.InterfaceC1421b interfaceC1421b = (O7.InterfaceC1421b) c6;
            java.util.Collection collectionF = interfaceC1421b.f();
            p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
            if ((!collectionF.isEmpty()) && interfaceC1424e.q() != O7.D.FINAL) {
                return O7.D.OPEN;
            }
            if (interfaceC1424e.j() != O7.EnumC1425f.INTERFACE || p247y7.AbstractC7350t.b(interfaceC1421b.h(), O7.AbstractC1438t.f8182a)) {
                return O7.D.FINAL;
            }
            O7.D dQ = interfaceC1421b.q();
            O7.D d6 = O7.D.ABSTRACT;
            return dQ == d6 ? d6 : O7.D.OPEN;
        }
        return O7.D.FINAL;
    }

    static /* synthetic */ void L1(p168q8.d dVar, java.lang.StringBuilder sb, F8.E e6, F8.e0 e0Var, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            e0Var = e6.W0();
        }
        dVar.K1(sb, e6, e0Var);
    }

    private final java.lang.String M() {
        int i6 = q8.d.b.f53180a[y0().ordinal()];
        if (i6 == 1) {
            return N("->");
        }
        if (i6 == 2) {
            return "&rarr;";
        }
        throw new p087i7.s();
    }

    private final boolean M0(P7.c cVar) {
        return p247y7.AbstractC7350t.b(cVar.e(), L7.j.a.f6335E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(O7.f0 f0Var, java.lang.StringBuilder sb, boolean z6) {
        if (z6) {
            sb.append(N0());
        }
        if (D0()) {
            sb.append("/*");
            sb.append(f0Var.getIndex());
            sb.append("*/ ");
        }
        q1(sb, f0Var.K(), "reified");
        java.lang.String strI = f0Var.s().i();
        boolean z10 = true;
        q1(sb, strI.length() > 0, strI);
        U0(this, sb, f0Var, null, 2, null);
        r1(f0Var, sb, z6);
        int size = f0Var.getUpperBounds().size();
        if ((size > 1 && !z6) || size == 1) {
            F8.E e6 = (F8.E) f0Var.getUpperBounds().iterator().next();
            if (!L7.g.j0(e6)) {
                sb.append(" : ");
                p247y7.AbstractC7350t.c(e6);
                sb.append(w(e6));
            }
        } else if (z6) {
            for (F8.E e10 : f0Var.getUpperBounds()) {
                if (!L7.g.j0(e10)) {
                    if (z10) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    p247y7.AbstractC7350t.c(e10);
                    sb.append(w(e10));
                    z10 = false;
                }
            }
        }
        if (z6) {
            sb.append(J0());
        }
    }

    private final java.lang.String N(java.lang.String str) {
        return y0().g(str);
    }

    private final java.lang.String N0() {
        return N("<");
    }

    private final void N1(java.lang.StringBuilder sb, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            M1((O7.f0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final boolean O0(O7.InterfaceC1421b interfaceC1421b) {
        return !interfaceC1421b.f().isEmpty();
    }

    private final void O1(java.util.List list, java.lang.StringBuilder sb, boolean z6) {
        if (!I0() && (!list.isEmpty())) {
            sb.append(N0());
            N1(sb, list);
            sb.append(J0());
            if (z6) {
                sb.append(" ");
            }
        }
    }

    private final void P0(java.lang.StringBuilder sb, F8.C0940a c0940a) throws java.io.IOException {
        p168q8.m mVarY0 = y0();
        p168q8.m mVar = p168q8.m.HTML;
        if (mVarY0 == mVar) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        t1(sb, c0940a.c0());
        sb.append(" */");
        if (y0() == mVar) {
            sb.append("</i></font>");
        }
    }

    private final void P1(O7.k0 k0Var, java.lang.StringBuilder sb, boolean z6) {
        if (z6 || !(k0Var instanceof O7.j0)) {
            sb.append(k1(k0Var.t0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(O7.T t6, java.lang.StringBuilder sb) {
        m1(t6, sb);
    }

    static /* synthetic */ void Q1(p168q8.d dVar, O7.k0 k0Var, java.lang.StringBuilder sb, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        dVar.P1(k0Var, sb, z6);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    private final void R0(O7.InterfaceC1443y interfaceC1443y, java.lang.StringBuilder sb) {
        boolean z6;
        boolean z10 = false;
        if (interfaceC1443y.W()) {
            java.util.Collection collectionF = interfaceC1443y.f();
            p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
            java.util.Collection collection = collectionF;
            if (!collection.isEmpty()) {
                java.util.Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((O7.InterfaceC1443y) it.next()).W()) {
                            if (!P()) {
                                z6 = false;
                            }
                        }
                    }
                }
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (interfaceC1443y.Q0()) {
            java.util.Collection collectionF2 = interfaceC1443y.f();
            p247y7.AbstractC7350t.e(collectionF2, "getOverriddenDescriptors(...)");
            java.util.Collection collection2 = collectionF2;
            if (collection2.isEmpty()) {
                z10 = true;
            } else {
                java.util.Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (((O7.InterfaceC1443y) it2.next()).Q0()) {
                        if (P()) {
                            break;
                        }
                    }
                }
                z10 = true;
            }
        }
        q1(sb, interfaceC1443y.V(), "tailrec");
        G1(interfaceC1443y, sb);
        q1(sb, interfaceC1443y.m(), "inline");
        q1(sb, z10, "infix");
        q1(sb, z6, "operator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final void R1(O7.j0 j0Var, boolean z6, java.lang.StringBuilder sb, boolean z10) {
        boolean z11;
        if (z10) {
            sb.append(k1("value-parameter"));
            sb.append(" ");
        }
        if (D0()) {
            sb.append("/*");
            sb.append(j0Var.getIndex());
            sb.append("*/ ");
        }
        U0(this, sb, j0Var, null, 2, null);
        q1(sb, j0Var.j0(), "crossinline");
        q1(sb, j0Var.e0(), "noinline");
        boolean z12 = false;
        if (s0()) {
            O7.InterfaceC1420a interfaceC1420aB = j0Var.b();
            O7.InterfaceC1423d interfaceC1423d = interfaceC1420aB instanceof O7.InterfaceC1423d ? (O7.InterfaceC1423d) interfaceC1420aB : null;
            if (interfaceC1423d == null || !interfaceC1423d.G()) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            q1(sb, O(), "actual");
        }
        T1(j0Var, z6, sb, z10, z11);
        if (U() != null) {
            if (n() ? j0Var.D0() : p218v8.c.c(j0Var)) {
                z12 = true;
            }
        }
        if (z12) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(" = ");
            p237x7.l lVarU = U();
            p247y7.AbstractC7350t.c(lVarU);
            sb2.append((java.lang.String) lVarU.l(j0Var));
            sb.append(sb2.toString());
        }
    }

    private final java.util.List S0(P7.c cVar) {
        O7.InterfaceC1423d interfaceC1423dX;
        java.util.List listN;
        java.util.Map mapA = cVar.a();
        java.util.List listM = null;
        O7.InterfaceC1424e interfaceC1424eI = p0() ? p218v8.c.i(cVar) : null;
        if (interfaceC1424eI != null && (interfaceC1423dX = interfaceC1424eI.X()) != null && (listN = interfaceC1423dX.n()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listN) {
                if (((O7.j0) obj).D0()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((O7.j0) it.next()).getName());
            }
            listM = arrayList2;
        }
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listM) {
            p138n8.f fVar = (p138n8.f) obj2;
            p247y7.AbstractC7350t.c(fVar);
            if (!mapA.containsKey(fVar)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((p138n8.f) it2.next()).g() + " = ...");
        }
        java.util.Set<java.util.Map.Entry> setEntrySet = mapA.entrySet();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(p097j7.AbstractC6879v.x(setEntrySet, 10));
        for (java.util.Map.Entry entry : setEntrySet) {
            p138n8.f fVar2 = (p138n8.f) entry.getKey();
            p198t8.g gVar = (p198t8.g) entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(fVar2.g());
            sb.append(" = ");
            sb.append(!listM.contains(fVar2) ? a1(gVar) : "...");
            arrayList5.add(sb.toString());
        }
        return p097j7.AbstractC6879v.K0(p097j7.AbstractC6879v.C0(arrayList4, arrayList5));
    }

    private final void S1(java.util.Collection collection, boolean z6, java.lang.StringBuilder sb) {
        boolean zX1 = X1(z6);
        int size = collection.size();
        C0().c(size, sb);
        java.util.Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            O7.j0 j0Var = (O7.j0) it.next();
            C0().b(j0Var, i6, size, sb);
            R1(j0Var, zX1, sb, false);
            C0().a(j0Var, i6, size, sb);
            i6++;
        }
        C0().d(size, sb);
    }

    private final void T0(java.lang.StringBuilder sb, P7.a aVar, P7.e eVar) {
        if (d0().contains(p168q8.e.ANNOTATIONS)) {
            java.util.Set setM = aVar instanceof F8.E ? m() : W();
            p237x7.l lVarQ = Q();
            for (P7.c cVar : aVar.k()) {
                if (!p097j7.AbstractC6879v.Z(setM, cVar.e()) && !M0(cVar) && (lVarQ == null || ((java.lang.Boolean) lVarQ.l(cVar)).booleanValue())) {
                    sb.append(r(cVar, eVar));
                    if (V()) {
                        sb.append('\n');
                        p247y7.AbstractC7350t.e(sb, "append(...)");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    private final void T1(O7.k0 k0Var, boolean z6, java.lang.StringBuilder sb, boolean z10, boolean z11) {
        F8.E type = k0Var.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        O7.j0 j0Var = k0Var instanceof O7.j0 ? (O7.j0) k0Var : null;
        F8.E eU0 = j0Var != null ? j0Var.u0() : null;
        F8.E e6 = eU0 == null ? type : eU0;
        q1(sb, eU0 != null, "vararg");
        if (z11 || (z10 && !x0())) {
            P1(k0Var, sb, z11);
        }
        if (z6) {
            r1(k0Var, sb, z10);
            sb.append(": ");
        }
        sb.append(w(e6));
        j1(k0Var, sb);
        if (!D0() || eU0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(w(type));
        sb.append("*/");
    }

    static /* synthetic */ void U0(p168q8.d dVar, java.lang.StringBuilder sb, P7.a aVar, P7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            eVar = null;
        }
        dVar.T0(sb, aVar, eVar);
    }

    private final boolean U1(O7.AbstractC1439u abstractC1439u, java.lang.StringBuilder sb) {
        if (!d0().contains(p168q8.e.VISIBILITY)) {
            return false;
        }
        if (e0()) {
            abstractC1439u = abstractC1439u.f();
        }
        if (!r0() && p247y7.AbstractC7350t.b(abstractC1439u, O7.AbstractC1438t.f8193l)) {
            return false;
        }
        sb.append(k1(abstractC1439u.c()));
        sb.append(" ");
        return true;
    }

    private final void V0(O7.InterfaceC1428i interfaceC1428i, java.lang.StringBuilder sb) {
        java.util.List listA = interfaceC1428i.A();
        p247y7.AbstractC7350t.e(listA, "getDeclaredTypeParameters(...)");
        java.util.List listX = interfaceC1428i.p().x();
        p247y7.AbstractC7350t.e(listX, "getParameters(...)");
        if (D0() && interfaceC1428i.S() && listX.size() > listA.size()) {
            sb.append(" /*captured type parameters: ");
            N1(sb, listX.subList(listA.size(), listX.size()));
            sb.append("*/");
        }
    }

    private final void V1(java.util.List list, java.lang.StringBuilder sb) throws java.io.IOException {
        if (I0()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            O7.f0 f0Var = (O7.f0) it.next();
            java.util.List upperBounds = f0Var.getUpperBounds();
            p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
            for (F8.E e6 : p097j7.AbstractC6879v.c0(upperBounds, 1)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                p138n8.f name = f0Var.getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                sb2.append(v(name, false));
                sb2.append(" : ");
                p247y7.AbstractC7350t.c(e6);
                sb2.append(w(e6));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(k1("where"));
            sb.append(" ");
            p097j7.G.o0(arrayList, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(O7.InterfaceC1424e interfaceC1424e, java.lang.StringBuilder sb) throws java.io.IOException {
        O7.InterfaceC1423d interfaceC1423dX;
        boolean z6 = interfaceC1424e.j() == O7.EnumC1425f.ENUM_ENTRY;
        if (!x0()) {
            U0(this, sb, interfaceC1424e, null, 2, null);
            java.util.List listP0 = interfaceC1424e.P0();
            p247y7.AbstractC7350t.e(listP0, "getContextReceivers(...)");
            c1(listP0, sb);
            if (!z6) {
                O7.AbstractC1439u abstractC1439uH = interfaceC1424e.h();
                p247y7.AbstractC7350t.e(abstractC1439uH, "getVisibility(...)");
                U1(abstractC1439uH, sb);
            }
            if ((interfaceC1424e.j() != O7.EnumC1425f.INTERFACE || interfaceC1424e.q() != O7.D.ABSTRACT) && (!interfaceC1424e.j().g() || interfaceC1424e.q() != O7.D.FINAL)) {
                O7.D dQ = interfaceC1424e.q();
                p247y7.AbstractC7350t.e(dQ, "getModality(...)");
                o1(dQ, sb, L0(interfaceC1424e));
            }
            m1(interfaceC1424e, sb);
            q1(sb, d0().contains(p168q8.e.INNER) && interfaceC1424e.S(), "inner");
            q1(sb, d0().contains(p168q8.e.DATA) && interfaceC1424e.R0(), "data");
            q1(sb, d0().contains(p168q8.e.INLINE) && interfaceC1424e.m(), "inline");
            q1(sb, d0().contains(p168q8.e.VALUE) && interfaceC1424e.P(), "value");
            q1(sb, d0().contains(p168q8.e.FUN) && interfaceC1424e.I(), "fun");
            X0(interfaceC1424e, sb);
        }
        if (p178r8.f.x(interfaceC1424e)) {
            Z0(interfaceC1424e, sb);
        } else {
            if (!x0()) {
                E1(sb);
            }
            r1(interfaceC1424e, sb, true);
        }
        if (z6) {
            return;
        }
        java.util.List listA = interfaceC1424e.A();
        p247y7.AbstractC7350t.e(listA, "getDeclaredTypeParameters(...)");
        O1(listA, sb, false);
        V0(interfaceC1424e, sb);
        if (!interfaceC1424e.j().g() && S() && (interfaceC1423dX = interfaceC1424e.X()) != null) {
            sb.append(" ");
            U0(this, sb, interfaceC1423dX, null, 2, null);
            O7.AbstractC1439u abstractC1439uH2 = interfaceC1423dX.h();
            p247y7.AbstractC7350t.e(abstractC1439uH2, "getVisibility(...)");
            U1(abstractC1439uH2, sb);
            sb.append(k1("constructor"));
            java.util.List listN = interfaceC1423dX.n();
            p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
            S1(listN, interfaceC1423dX.L(), sb);
        }
        F1(interfaceC1424e, sb);
        V1(listA, sb);
    }

    private final boolean W1(F8.E e6) {
        if (L7.f.p(e6)) {
            java.util.List listU0 = e6.U0();
            if (!(listU0 instanceof java.util.Collection) || !listU0.isEmpty()) {
                java.util.Iterator it = listU0.iterator();
                while (it.hasNext()) {
                    if (((F8.i0) it.next()).b()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final p168q8.d X() {
        return (p168q8.d) this.f53177m.getValue();
    }

    private final void X0(O7.InterfaceC1424e interfaceC1424e, java.lang.StringBuilder sb) {
        sb.append(k1(p168q8.c.f53153a.a(interfaceC1424e)));
    }

    private final boolean X1(boolean z6) {
        int i6 = q8.d.b.f53181b[h0().ordinal()];
        if (i6 == 1) {
            return true;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                throw new p087i7.s();
            }
        } else if (!z6) {
            return true;
        }
        return false;
    }

    private final void Z0(O7.InterfaceC1432m interfaceC1432m, java.lang.StringBuilder sb) {
        if (m0()) {
            if (x0()) {
                sb.append("companion object");
            }
            E1(sb);
            O7.InterfaceC1432m interfaceC1432mB = interfaceC1432m.b();
            if (interfaceC1432mB != null) {
                sb.append("of ");
                p138n8.f name = interfaceC1432mB.getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                sb.append(v(name, false));
            }
        }
        if (D0() || !p247y7.AbstractC7350t.b(interfaceC1432m.getName(), p138n8.h.f51967d)) {
            if (!x0()) {
                E1(sb);
            }
            p138n8.f name2 = interfaceC1432m.getName();
            p247y7.AbstractC7350t.e(name2, "getName(...)");
            sb.append(v(name2, true));
        }
    }

    private final java.lang.String a1(p198t8.g gVar) {
        p237x7.l lVarM = this.f53176l.M();
        if (lVarM != null) {
            return (java.lang.String) lVarM.l(gVar);
        }
        if (gVar instanceof p198t8.b) {
            java.lang.Iterable iterable = (java.lang.Iterable) ((p198t8.b) gVar).b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                java.lang.String strA1 = a1((p198t8.g) it.next());
                if (strA1 != null) {
                    arrayList.add(strA1);
                }
            }
            return p097j7.AbstractC6879v.r0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (gVar instanceof p198t8.C7156a) {
            return S8.r.J0(p168q8.c.s(this, (P7.c) ((p198t8.C7156a) gVar).b(), null, 2, null), "@");
        }
        if (!(gVar instanceof p198t8.p)) {
            return gVar.toString();
        }
        t8.p.b bVar = (t8.p.b) ((p198t8.p) gVar).b();
        if (bVar instanceof t8.p.b.a) {
            return ((t8.p.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof t8.p.b.C0714b)) {
            throw new p087i7.s();
        }
        t8.p.b.C0714b c0714b = (t8.p.b.C0714b) bVar;
        java.lang.String strB = c0714b.b().b().b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        for (int i6 = 0; i6 < c0714b.a(); i6++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return strB + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public final void b1(O7.InterfaceC1431l interfaceC1431l, java.lang.StringBuilder sb) throws java.io.IOException {
        boolean z6;
        O7.InterfaceC1423d interfaceC1423dX;
        U0(this, sb, interfaceC1431l, null, 2, null);
        if (this.f53176l.T() || interfaceC1431l.H().q() != O7.D.SEALED) {
            O7.AbstractC1439u abstractC1439uH = interfaceC1431l.h();
            p247y7.AbstractC7350t.e(abstractC1439uH, "getVisibility(...)");
            if (U1(abstractC1439uH, sb)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        l1(interfaceC1431l, sb);
        boolean z10 = o0() || !interfaceC1431l.G() || z6;
        if (z10) {
            sb.append(k1("constructor"));
        }
        O7.InterfaceC1428i interfaceC1428iB = interfaceC1431l.b();
        p247y7.AbstractC7350t.e(interfaceC1428iB, "getContainingDeclaration(...)");
        if (v0()) {
            if (z10) {
                sb.append(" ");
            }
            r1(interfaceC1428iB, sb, true);
            java.util.List listG = interfaceC1431l.g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            O1(listG, sb, false);
        }
        java.util.List listN = interfaceC1431l.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        S1(listN, interfaceC1431l.L(), sb);
        if (n0() && !interfaceC1431l.G() && (interfaceC1428iB instanceof O7.InterfaceC1424e) && (interfaceC1423dX = ((O7.InterfaceC1424e) interfaceC1428iB).X()) != null) {
            java.util.List listN2 = interfaceC1423dX.n();
            p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listN2) {
                O7.j0 j0Var = (O7.j0) obj;
                if (!j0Var.D0() && j0Var.u0() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(k1("this"));
                sb.append(p097j7.AbstractC6879v.r0(arrayList, ", ", "(", ")", 0, null, q8.d.e.f53185D, 24, null));
            }
        }
        if (v0()) {
            java.util.List listG2 = interfaceC1431l.g();
            p247y7.AbstractC7350t.e(listG2, "getTypeParameters(...)");
            V1(listG2, sb);
        }
    }

    private final void c1(java.util.List list, java.lang.StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            java.util.Iterator it = list.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                O7.X x6 = (O7.X) it.next();
                T0(sb, x6, P7.e.RECEIVER);
                F8.E type = x6.getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                sb.append(f1(type));
                sb.append(i6 == p097j7.AbstractC6879v.o(list) ? ") " : ", ");
                i6 = i10;
            }
        }
    }

    private final void d1(java.lang.StringBuilder sb, F8.E e6) throws java.io.IOException {
        java.lang.String strI1;
        U0(this, sb, e6, null, 2, null);
        F8.C0954o c0954o = e6 instanceof F8.C0954o ? (F8.C0954o) e6 : null;
        if (c0954o != null) {
            c0954o.i1();
        }
        if (F8.G.a(e6)) {
            if (K8.a.u(e6) && j0()) {
                strI1 = e1(H8.k.f4528a.p(e6));
            } else {
                sb.append((!(e6 instanceof H8.h) || c0()) ? e6.W0().toString() : ((H8.h) e6).f1());
                strI1 = I1(e6.U0());
            }
            sb.append(strI1);
        } else {
            L1(this, sb, e6, null, 2, null);
        }
        if (e6.X0()) {
            sb.append("?");
        }
        if (F8.Q.c(e6)) {
            sb.append(" & Any");
        }
    }

    private final java.lang.String e1(java.lang.String str) {
        int i6 = q8.d.b.f53180a[y0().ordinal()];
        if (i6 == 1) {
            return str;
        }
        if (i6 != 2) {
            throw new p087i7.s();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final java.lang.String f1(F8.E e6) throws java.io.IOException {
        java.lang.String strW = w(e6);
        if ((!W1(e6) || F8.q0.l(e6)) && !(e6 instanceof F8.C0954o)) {
            return strW;
        }
        return '(' + strW + ')';
    }

    private final java.lang.String g1(java.util.List list) {
        return N(p168q8.n.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(O7.InterfaceC1443y interfaceC1443y, java.lang.StringBuilder sb) throws java.io.IOException {
        if (!x0()) {
            if (!w0()) {
                U0(this, sb, interfaceC1443y, null, 2, null);
                java.util.List listA0 = interfaceC1443y.A0();
                p247y7.AbstractC7350t.e(listA0, "getContextReceiverParameters(...)");
                c1(listA0, sb);
                O7.AbstractC1439u abstractC1439uH = interfaceC1443y.h();
                p247y7.AbstractC7350t.e(abstractC1439uH, "getVisibility(...)");
                U1(abstractC1439uH, sb);
                p1(interfaceC1443y, sb);
                if (Y()) {
                    m1(interfaceC1443y, sb);
                }
                u1(interfaceC1443y, sb);
                if (Y()) {
                    R0(interfaceC1443y, sb);
                } else {
                    G1(interfaceC1443y, sb);
                }
                l1(interfaceC1443y, sb);
                if (D0()) {
                    if (interfaceC1443y.F0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC1443y.L0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(k1("fun"));
            sb.append(" ");
            java.util.List listG = interfaceC1443y.g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            O1(listG, sb, true);
            B1(interfaceC1443y, sb);
        }
        r1(interfaceC1443y, sb, true);
        java.util.List listN = interfaceC1443y.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        S1(listN, interfaceC1443y.L(), sb);
        C1(interfaceC1443y, sb);
        F8.E eL = interfaceC1443y.l();
        if (!G0() && (B0() || eL == null || !L7.g.C0(eL))) {
            sb.append(": ");
            sb.append(eL == null ? "[NULL]" : w(eL));
        }
        java.util.List listG2 = interfaceC1443y.g();
        p247y7.AbstractC7350t.e(listG2, "getTypeParameters(...)");
        V1(listG2, sb);
    }

    private final void i1(java.lang.StringBuilder sb, F8.E e6) {
        p138n8.f fVarD;
        int length = sb.length();
        U0(X(), sb, e6, null, 2, null);
        boolean z6 = sb.length() != length;
        F8.E eK = L7.f.k(e6);
        java.util.List listE = L7.f.e(e6);
        if (!listE.isEmpty()) {
            sb.append("context(");
            java.util.Iterator it = listE.subList(0, p097j7.AbstractC6879v.o(listE)).iterator();
            while (it.hasNext()) {
                s1(sb, (F8.E) it.next());
                sb.append(", ");
            }
            s1(sb, (F8.E) p097j7.AbstractC6879v.t0(listE));
            sb.append(") ");
        }
        boolean zR = L7.f.r(e6);
        boolean zX0 = e6.X0();
        boolean z10 = zX0 || (z6 && eK != null);
        if (z10) {
            if (zR) {
                sb.insert(length, '(');
            } else {
                if (z6) {
                    S8.AbstractC1628a.c(S8.r.z1(sb));
                    if (sb.charAt(S8.r.j0(sb) - 1) != ')') {
                        sb.insert(S8.r.j0(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        q1(sb, zR, "suspend");
        if (eK != null) {
            boolean z11 = (W1(eK) && !eK.X0()) || K0(eK) || (eK instanceof F8.C0954o);
            if (z11) {
                sb.append("(");
            }
            s1(sb, eK);
            if (z11) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!L7.f.n(e6) || e6.U0().size() > 1) {
            int i6 = 0;
            for (F8.i0 i0Var : L7.f.m(e6)) {
                int i10 = i6 + 1;
                if (i6 > 0) {
                    sb.append(", ");
                }
                if (i0()) {
                    F8.E type = i0Var.getType();
                    p247y7.AbstractC7350t.e(type, "getType(...)");
                    fVarD = L7.f.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb.append(v(fVarD, false));
                    sb.append(": ");
                }
                sb.append(x(i0Var));
                i6 = i10;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(M());
        sb.append(" ");
        s1(sb, L7.f.l(e6));
        if (z10) {
            sb.append(")");
        }
        if (zX0) {
            sb.append("?");
        }
    }

    private final void j1(O7.k0 k0Var, java.lang.StringBuilder sb) {
        p198t8.g gVarD0;
        java.lang.String strA1;
        if (!b0() || (gVarD0 = k0Var.d0()) == null || (strA1 = a1(gVarD0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(N(strA1));
    }

    private final java.lang.String k1(java.lang.String str) {
        int i6 = q8.d.b.f53180a[y0().ordinal()];
        if (i6 == 1) {
            return str;
        }
        if (i6 != 2) {
            throw new p087i7.s();
        }
        if (R()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void l1(O7.InterfaceC1421b interfaceC1421b, java.lang.StringBuilder sb) {
        if (d0().contains(p168q8.e.MEMBER_KIND) && D0() && interfaceC1421b.j() != O7.InterfaceC1421b.a.DECLARATION) {
            sb.append("/*");
            sb.append(N8.a.f(interfaceC1421b.j().name()));
            sb.append("*/ ");
        }
    }

    private final void m1(O7.C c6, java.lang.StringBuilder sb) {
        q1(sb, c6.C(), "external");
        boolean z6 = false;
        q1(sb, d0().contains(p168q8.e.EXPECT) && c6.R(), "expect");
        if (d0().contains(p168q8.e.ACTUAL) && c6.N0()) {
            z6 = true;
        }
        q1(sb, z6, "actual");
    }

    private final void o1(O7.D d6, java.lang.StringBuilder sb, O7.D d10) {
        if (q0() || d6 != d10) {
            q1(sb, d0().contains(p168q8.e.MODALITY), N8.a.f(d6.name()));
        }
    }

    private final void p1(O7.InterfaceC1421b interfaceC1421b, java.lang.StringBuilder sb) {
        if (p178r8.f.J(interfaceC1421b) && interfaceC1421b.q() == O7.D.FINAL) {
            return;
        }
        if (g0() == p168q8.j.RENDER_OVERRIDE && interfaceC1421b.q() == O7.D.OPEN && O0(interfaceC1421b)) {
            return;
        }
        O7.D dQ = interfaceC1421b.q();
        p247y7.AbstractC7350t.e(dQ, "getModality(...)");
        o1(dQ, sb, L0(interfaceC1421b));
    }

    private final void q1(java.lang.StringBuilder sb, boolean z6, java.lang.String str) {
        if (z6) {
            sb.append(k1(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(O7.InterfaceC1432m interfaceC1432m, java.lang.StringBuilder sb, boolean z6) {
        p138n8.f name = interfaceC1432m.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        sb.append(v(name, z6));
    }

    private final void s1(java.lang.StringBuilder sb, F8.E e6) throws java.io.IOException {
        F8.t0 t0VarZ0 = e6.Z0();
        F8.C0940a c0940a = t0VarZ0 instanceof F8.C0940a ? (F8.C0940a) t0VarZ0 : null;
        if (c0940a == null) {
            t1(sb, e6);
            return;
        }
        if (t0()) {
            t1(sb, c0940a.c0());
            return;
        }
        t1(sb, c0940a.i1());
        if (u0()) {
            P0(sb, c0940a);
        }
    }

    private final void t1(java.lang.StringBuilder sb, F8.E e6) throws java.io.IOException {
        if ((e6 instanceof F8.v0) && n() && !((F8.v0) e6).b1()) {
            sb.append("<Not computed yet>");
            return;
        }
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            sb.append(((F8.AbstractC0963y) t0VarZ0).g1(this, this));
        } else if (t0VarZ0 instanceof F8.M) {
            D1(sb, (F8.M) t0VarZ0);
        }
    }

    private final void u1(O7.InterfaceC1421b interfaceC1421b, java.lang.StringBuilder sb) {
        if (d0().contains(p168q8.e.OVERRIDE) && O0(interfaceC1421b) && g0() != p168q8.j.RENDER_OPEN) {
            q1(sb, true, "override");
            if (D0()) {
                sb.append("/*");
                sb.append(interfaceC1421b.f().size());
                sb.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(O7.K k6, java.lang.StringBuilder sb) {
        w1(k6.e(), "package-fragment", sb);
        if (n()) {
            sb.append(" in ");
            r1(k6.b(), sb, false);
        }
    }

    private final void w1(p138n8.c cVar, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(k1(str));
        p138n8.d dVarJ = cVar.j();
        p247y7.AbstractC7350t.e(dVarJ, "toUnsafe(...)");
        java.lang.String strU = u(dVarJ);
        if (strU.length() > 0) {
            sb.append(" ");
            sb.append(strU);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(O7.P p6, java.lang.StringBuilder sb) {
        w1(p6.e(), "package", sb);
        if (n()) {
            sb.append(" in context of ");
            r1(p6.E0(), sb, false);
        }
    }

    private final void y1(java.lang.StringBuilder sb, O7.S s6) {
        java.lang.String strJ1;
        O7.S sC = s6.c();
        if (sC != null) {
            y1(sb, sC);
            sb.append('.');
            p138n8.f name = s6.b().getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            strJ1 = v(name, false);
        } else {
            F8.e0 e0VarP = s6.b().p();
            p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
            strJ1 = J1(e0VarP);
        }
        sb.append(strJ1);
        sb.append(I1(s6.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(O7.U u6, java.lang.StringBuilder sb) throws java.io.IOException {
        if (!x0()) {
            if (!w0()) {
                A1(u6, sb);
                java.util.List listA0 = u6.A0();
                p247y7.AbstractC7350t.e(listA0, "getContextReceiverParameters(...)");
                c1(listA0, sb);
                O7.AbstractC1439u abstractC1439uH = u6.h();
                p247y7.AbstractC7350t.e(abstractC1439uH, "getVisibility(...)");
                U1(abstractC1439uH, sb);
                boolean z6 = false;
                q1(sb, d0().contains(p168q8.e.CONST) && u6.F(), "const");
                m1(u6, sb);
                p1(u6, sb);
                u1(u6, sb);
                if (d0().contains(p168q8.e.LATEINIT) && u6.B0()) {
                    z6 = true;
                }
                q1(sb, z6, "lateinit");
                l1(u6, sb);
            }
            Q1(this, u6, sb, false, 4, null);
            java.util.List listG = u6.g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            O1(listG, sb, true);
            B1(u6, sb);
        }
        r1(u6, sb, true);
        sb.append(": ");
        F8.E type = u6.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        sb.append(w(type));
        C1(u6, sb);
        j1(u6, sb);
        java.util.List listG2 = u6.g();
        p247y7.AbstractC7350t.e(listG2, "getTypeParameters(...)");
        V1(listG2, sb);
    }

    public boolean A0() {
        return this.f53176l.c0();
    }

    public boolean B0() {
        return this.f53176l.d0();
    }

    public q8.c.l C0() {
        return this.f53176l.e0();
    }

    public boolean D0() {
        return this.f53176l.f0();
    }

    public boolean E0() {
        return this.f53176l.g0();
    }

    public boolean F0() {
        return this.f53176l.h0();
    }

    public boolean G0() {
        return this.f53176l.i0();
    }

    public boolean H0() {
        return this.f53176l.j0();
    }

    public boolean I0() {
        return this.f53176l.k0();
    }

    public java.lang.String I1(java.util.List list) throws java.io.IOException {
        p247y7.AbstractC7350t.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(N0());
        L(sb, list);
        sb.append(J0());
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public java.lang.String J1(F8.e0 e0Var) {
        p247y7.AbstractC7350t.f(e0Var, "typeConstructor");
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        if (interfaceC1427hW instanceof O7.f0 ? true : interfaceC1427hW instanceof O7.InterfaceC1424e ? true : interfaceC1427hW instanceof O7.e0) {
            return Y0(interfaceC1427hW);
        }
        if (interfaceC1427hW == null) {
            return e0Var instanceof F8.D ? ((F8.D) e0Var).e(q8.d.g.f53187D) : e0Var.toString();
        }
        throw new java.lang.IllegalStateException(("Unexpected classifier: " + interfaceC1427hW.getClass()).toString());
    }

    public boolean O() {
        return this.f53176l.r();
    }

    public boolean P() {
        return this.f53176l.s();
    }

    public p237x7.l Q() {
        return this.f53176l.t();
    }

    public boolean R() {
        return this.f53176l.u();
    }

    public boolean S() {
        return this.f53176l.v();
    }

    public p168q8.b T() {
        return this.f53176l.w();
    }

    public p237x7.l U() {
        return this.f53176l.x();
    }

    public boolean V() {
        return this.f53176l.y();
    }

    public java.util.Set W() {
        return this.f53176l.z();
    }

    public boolean Y() {
        return this.f53176l.A();
    }

    public java.lang.String Y0(O7.InterfaceC1427h interfaceC1427h) {
        p247y7.AbstractC7350t.f(interfaceC1427h, "klass");
        return H8.k.m(interfaceC1427h) ? interfaceC1427h.p().toString() : T().a(interfaceC1427h, this);
    }

    public boolean Z() {
        return this.f53176l.B();
    }

    @Override // p168q8.f
    public void a(p168q8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "<set-?>");
        this.f53176l.a(bVar);
    }

    public boolean a0() {
        return this.f53176l.C();
    }

    @Override // p168q8.f
    public void b(java.util.Set set) {
        p247y7.AbstractC7350t.f(set, "<set-?>");
        this.f53176l.b(set);
    }

    public boolean b0() {
        return this.f53176l.D();
    }

    @Override // p168q8.f
    public void c(boolean z6) {
        this.f53176l.c(z6);
    }

    public boolean c0() {
        return this.f53176l.E();
    }

    @Override // p168q8.f
    public void d(java.util.Set set) {
        p247y7.AbstractC7350t.f(set, "<set-?>");
        this.f53176l.d(set);
    }

    public java.util.Set d0() {
        return this.f53176l.F();
    }

    @Override // p168q8.f
    public void e(p168q8.m mVar) {
        p247y7.AbstractC7350t.f(mVar, "<set-?>");
        this.f53176l.e(mVar);
    }

    public boolean e0() {
        return this.f53176l.G();
    }

    @Override // p168q8.f
    public void f(boolean z6) {
        this.f53176l.f(z6);
    }

    public final p168q8.g f0() {
        return this.f53176l;
    }

    @Override // p168q8.f
    public boolean g() {
        return this.f53176l.g();
    }

    public p168q8.j g0() {
        return this.f53176l.H();
    }

    @Override // p168q8.f
    public void h(boolean z6) {
        this.f53176l.h(z6);
    }

    public p168q8.k h0() {
        return this.f53176l.I();
    }

    @Override // p168q8.f
    public void i(boolean z6) {
        this.f53176l.i(z6);
    }

    public boolean i0() {
        return this.f53176l.J();
    }

    @Override // p168q8.f
    public void j(boolean z6) {
        this.f53176l.j(z6);
    }

    public boolean j0() {
        return this.f53176l.K();
    }

    @Override // p168q8.f
    public void k(boolean z6) {
        this.f53176l.k(z6);
    }

    public p168q8.l k0() {
        return this.f53176l.L();
    }

    @Override // p168q8.f
    public void l(p168q8.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "<set-?>");
        this.f53176l.l(kVar);
    }

    public boolean l0() {
        return this.f53176l.N();
    }

    @Override // p168q8.f
    public java.util.Set m() {
        return this.f53176l.m();
    }

    public boolean m0() {
        return this.f53176l.O();
    }

    @Override // p168q8.f
    public boolean n() {
        return this.f53176l.n();
    }

    public boolean n0() {
        return this.f53176l.P();
    }

    public java.lang.String n1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "message");
        int i6 = q8.d.b.f53180a[y0().ordinal()];
        if (i6 == 1) {
            return str;
        }
        if (i6 != 2) {
            throw new p087i7.s();
        }
        return "<i>" + str + "</i>";
    }

    @Override // p168q8.f
    public p168q8.a o() {
        return this.f53176l.o();
    }

    public boolean o0() {
        return this.f53176l.Q();
    }

    @Override // p168q8.f
    public void p(boolean z6) {
        this.f53176l.p(z6);
    }

    public boolean p0() {
        return this.f53176l.R();
    }

    @Override // p168q8.c
    public java.lang.String q(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "declarationDescriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        interfaceC1432m.r0(new q8.d.a(), sb);
        if (E0()) {
            K(sb, interfaceC1432m);
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public boolean q0() {
        return this.f53176l.S();
    }

    @Override // p168q8.c
    public java.lang.String r(P7.c cVar, P7.e eVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(cVar, "annotation");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.g() + ':');
        }
        F8.E type = cVar.getType();
        sb.append(w(type));
        if (Z()) {
            java.util.List listS0 = S0(cVar);
            if (a0() || (!listS0.isEmpty())) {
                p097j7.G.o0(listS0, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (D0() && (F8.G.a(type) || (type.W0().w() instanceof O7.J.b))) {
            sb.append(" /* annotation class not found */");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public boolean r0() {
        return this.f53176l.T();
    }

    public boolean s0() {
        return this.f53176l.U();
    }

    @Override // p168q8.c
    public java.lang.String t(java.lang.String str, java.lang.String str2, L7.g gVar) {
        p247y7.AbstractC7350t.f(str, "lowerRendered");
        p247y7.AbstractC7350t.f(str2, "upperRendered");
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        if (p168q8.n.f(str, str2)) {
            if (!S8.r.V(str2, "(", false, 2, null)) {
                return str + '!';
            }
            return '(' + str + ")!";
        }
        p168q8.b bVarT = T();
        O7.InterfaceC1424e interfaceC1424eW = gVar.w();
        p247y7.AbstractC7350t.e(interfaceC1424eW, "getCollection(...)");
        java.lang.String strQ1 = S8.r.q1(bVarT.a(interfaceC1424eW, this), "Collection", null, 2, null);
        java.lang.String strD = p168q8.n.d(str, strQ1 + "Mutable", str2, strQ1, strQ1 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        java.lang.String strD2 = p168q8.n.d(str, strQ1 + "MutableMap.MutableEntry", str2, strQ1 + "Map.Entry", strQ1 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        p168q8.b bVarT2 = T();
        O7.InterfaceC1424e interfaceC1424eJ = gVar.j();
        p247y7.AbstractC7350t.e(interfaceC1424eJ, "getArray(...)");
        java.lang.String strQ2 = S8.r.q1(bVarT2.a(interfaceC1424eJ, this), "Array", null, 2, null);
        java.lang.String strD3 = p168q8.n.d(str, strQ2 + N("Array<"), str2, strQ2 + N("Array<out "), strQ2 + N("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + str + ".." + str2 + ')';
    }

    public boolean t0() {
        return this.f53176l.V();
    }

    @Override // p168q8.c
    public java.lang.String u(p138n8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "fqName");
        java.util.List listH = dVar.h();
        p247y7.AbstractC7350t.e(listH, "pathSegments(...)");
        return g1(listH);
    }

    public boolean u0() {
        return this.f53176l.W();
    }

    @Override // p168q8.c
    public java.lang.String v(p138n8.f fVar, boolean z6) {
        p247y7.AbstractC7350t.f(fVar, "name");
        java.lang.String strN = N(p168q8.n.b(fVar));
        if (!R() || y0() != p168q8.m.HTML || !z6) {
            return strN;
        }
        return "<b>" + strN + "</b>";
    }

    public boolean v0() {
        return this.f53176l.X();
    }

    @Override // p168q8.c
    public java.lang.String w(F8.E e6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(e6, "type");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        s1(sb, (F8.E) z0().l(e6));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public boolean w0() {
        return this.f53176l.Y();
    }

    @Override // p168q8.c
    public java.lang.String x(F8.i0 i0Var) throws java.io.IOException {
        p247y7.AbstractC7350t.f(i0Var, "typeProjection");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        L(sb, p097j7.AbstractC6879v.e(i0Var));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public boolean x0() {
        return this.f53176l.Z();
    }

    public p168q8.m y0() {
        return this.f53176l.a0();
    }

    public p237x7.l z0() {
        return this.f53176l.b0();
    }
}
