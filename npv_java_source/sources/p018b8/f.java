package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends R7.AbstractC1501g implements Z7.c {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final b8.f.a f24208a0 = new b8.f.a(null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final java.util.Set f24209b0 = p097j7.Z.g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p008a8.g f24210K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p048e8.g f24211L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final O7.InterfaceC1424e f24212M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p008a8.g f24213N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f24214O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final O7.EnumC1425f f24215P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final O7.D f24216Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final O7.n0 f24217R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f24218S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final b8.f.b f24219T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p018b8.g f24220U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final O7.Y f24221V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final p248y8.f f24222W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final p018b8.l f24223X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final P7.g f24224Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final E8.i f24225Z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final class b extends F8.AbstractC0941b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final E8.i f24226d;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p018b8.f f24228D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p018b8.f fVar) {
                super(0);
                this.f24228D = fVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                return O7.g0.d(this.f24228D);
            }
        }

        public b() {
            super(p018b8.f.this.f24213N.e());
            this.f24226d = p018b8.f.this.f24213N.e().d(new b8.f.b.a(p018b8.f.this));
        }

        private final F8.E r() {
            p138n8.c cVarB;
            java.util.ArrayList arrayList;
            p138n8.c cVarS = s();
            if (cVarS == null || cVarS.d() || !cVarS.i(L7.j.f6324x)) {
                cVarS = null;
            }
            if (cVarS == null) {
                cVarB = X7.m.f16025a.b(p218v8.c.l(p018b8.f.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarS;
            }
            O7.InterfaceC1424e interfaceC1424eW = p218v8.c.w(p018b8.f.this.f24213N.d(), cVarB, W7.d.FROM_JAVA_LOADER);
            if (interfaceC1424eW == null) {
                return null;
            }
            int size = interfaceC1424eW.p().x().size();
            java.util.List listX = p018b8.f.this.p().x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            int size2 = listX.size();
            if (size2 == size) {
                java.util.List list = listX;
                arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new F8.k0(F8.u0.INVARIANT, ((O7.f0) it.next()).w()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarS != null) {
                    return null;
                }
                F8.k0 k0Var = new F8.k0(F8.u0.INVARIANT, ((O7.f0) p097j7.AbstractC6879v.G0(listX)).w());
                E7.i iVar = new E7.i(1, size);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(iVar, 10));
                java.util.Iterator it2 = iVar.iterator();
                while (it2.hasNext()) {
                    ((p097j7.O) it2).b();
                    arrayList2.add(k0Var);
                }
                arrayList = arrayList2;
            }
            return F8.F.g(F8.a0.f2872D.i(), interfaceC1424eW, arrayList);
        }

        private final p138n8.c s() {
            java.lang.String str;
            P7.g gVarK = p018b8.f.this.k();
            p138n8.c cVar = X7.B.f15913r;
            p247y7.AbstractC7350t.e(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            P7.c cVarJ = gVarK.j(cVar);
            if (cVarJ == null) {
                return null;
            }
            java.lang.Object objH0 = p097j7.AbstractC6879v.H0(cVarJ.a().values());
            p198t8.u uVar = objH0 instanceof p198t8.u ? (p198t8.u) objH0 : null;
            if (uVar == null || (str = (java.lang.String) uVar.b()) == null || !p138n8.e.e(str)) {
                return null;
            }
            return new p138n8.c(str);
        }

        @Override // F8.AbstractC0945f
        protected java.util.Collection g() {
            java.util.Collection collectionU = p018b8.f.this.Y0().u();
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionU.size());
            java.util.ArrayList<p048e8.x> arrayList2 = new java.util.ArrayList(0);
            F8.E eR = r();
            java.util.Iterator it = collectionU.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p048e8.j jVar = (p048e8.j) it.next();
                F8.E eH = p018b8.f.this.f24213N.a().r().h(p018b8.f.this.f24213N.g().o(jVar, p028c8.b.b(F8.p0.SUPERTYPE, false, false, null, 7, null)), p018b8.f.this.f24213N);
                if (eH.W0().w() instanceof O7.J.b) {
                    arrayList2.add(jVar);
                }
                if (!p247y7.AbstractC7350t.b(eH.W0(), eR != null ? eR.W0() : null) && !L7.g.b0(eH)) {
                    arrayList.add(eH);
                }
            }
            O7.InterfaceC1424e interfaceC1424e = p018b8.f.this.f24212M;
            P8.a.a(arrayList, interfaceC1424e != null ? N7.m.a(interfaceC1424e, p018b8.f.this).c().p(interfaceC1424e.w(), F8.u0.INVARIANT) : null);
            P8.a.a(arrayList, eR);
            if (!arrayList2.isEmpty()) {
                B8.r rVarC = p018b8.f.this.f24213N.a().c();
                O7.InterfaceC1424e interfaceC1424eW = w();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList2, 10));
                for (p048e8.x xVar : arrayList2) {
                    p247y7.AbstractC7350t.d(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((p048e8.j) xVar).s());
                }
                rVarC.b(interfaceC1424eW, arrayList3);
            }
            return arrayList.isEmpty() ^ true ? p097j7.AbstractC6879v.T0(arrayList) : p097j7.AbstractC6879v.e(p018b8.f.this.f24213N.d().t().i());
        }

        @Override // F8.AbstractC0945f
        protected O7.d0 k() {
            return p018b8.f.this.f24213N.a().v();
        }

        @Override // F8.AbstractC0951l, F8.e0
        /* JADX INFO: renamed from: q */
        public O7.InterfaceC1424e w() {
            return p018b8.f.this;
        }

        public java.lang.String toString() {
            java.lang.String strG = p018b8.f.this.getName().g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            return strG;
        }

        @Override // F8.e0
        public java.util.List x() {
            return (java.util.List) this.f24226d.b();
        }

        @Override // F8.e0
        public boolean y() {
            return true;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List<p048e8.y> listG = p018b8.f.this.Y0().g();
            p018b8.f fVar = p018b8.f.this;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listG, 10));
            for (p048e8.y yVar : listG) {
                O7.f0 f0VarA = fVar.f24213N.f().a(yVar);
                if (f0VarA == null) {
                    throw new java.lang.AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.Y0() + ", so it must be resolved");
                }
                arrayList.add(f0VarA);
            }
            return arrayList;
        }
    }

    public static final class d implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(p218v8.c.l((O7.InterfaceC1424e) obj).b(), p218v8.c.l((O7.InterfaceC1424e) obj2).b());
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            p138n8.b bVarK = p218v8.c.k(p018b8.f.this);
            if (bVarK != null) {
                return p018b8.f.this.a1().a().f().a(bVarK);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b8.f$f, reason: collision with other inner class name */
    static final class C0461f extends p247y7.AbstractC7352v implements p237x7.l {
        C0461f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p018b8.g l(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "it");
            p008a8.g gVar2 = p018b8.f.this.f24213N;
            p018b8.f fVar = p018b8.f.this;
            return new p018b8.g(gVar2, fVar, fVar.Y0(), p018b8.f.this.f24212M != null, p018b8.f.this.f24220U);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p008a8.g gVar, O7.InterfaceC1432m interfaceC1432m, p048e8.g gVar2, O7.InterfaceC1424e interfaceC1424e) {
        O7.D dA;
        super(gVar.e(), interfaceC1432m, gVar2.getName(), gVar.a().t().a(gVar2), false);
        p247y7.AbstractC7350t.f(gVar, "outerContext");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar2, "jClass");
        this.f24210K = gVar;
        this.f24211L = gVar2;
        this.f24212M = interfaceC1424e;
        p008a8.g gVarD = p008a8.a.d(gVar, this, gVar2, 0, 4, null);
        this.f24213N = gVarD;
        gVarD.a().h().d(gVar2, this);
        gVar2.O();
        this.f24214O = p087i7.AbstractC6669o.b(new b8.f.e());
        this.f24215P = gVar2.t() ? O7.EnumC1425f.ANNOTATION_CLASS : gVar2.M() ? O7.EnumC1425f.INTERFACE : gVar2.F() ? O7.EnumC1425f.ENUM_CLASS : O7.EnumC1425f.CLASS;
        if (gVar2.t() || gVar2.F()) {
            dA = O7.D.FINAL;
        } else {
            dA = O7.D.f8107C.a(gVar2.J(), gVar2.J() || gVar2.N() || gVar2.M(), !gVar2.q());
        }
        this.f24216Q = dA;
        this.f24217R = gVar2.h();
        this.f24218S = (gVar2.f() == null || gVar2.W()) ? false : true;
        this.f24219T = new b8.f.b();
        p018b8.g gVar3 = new p018b8.g(gVarD, this, gVar2, interfaceC1424e != null, null, 16, null);
        this.f24220U = gVar3;
        this.f24221V = O7.Y.f8134e.a(this, gVarD.e(), gVarD.a().k().c(), new p018b8.f.C0461f());
        this.f24222W = new p248y8.f(gVar3);
        this.f24223X = new p018b8.l(gVarD, gVar2, this);
        this.f24224Y = p008a8.e.a(gVarD, gVar2);
        this.f24225Z = gVarD.e().d(new b8.f.c());
    }

    public /* synthetic */ f(p008a8.g gVar, O7.InterfaceC1432m interfaceC1432m, p048e8.g gVar2, O7.InterfaceC1424e interfaceC1424e, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, interfaceC1432m, gVar2, (i6 & 8) != 0 ? null : interfaceC1424e);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        return (java.util.List) this.f24225Z.b();
    }

    @Override // O7.InterfaceC1424e
    public boolean E() {
        return false;
    }

    @Override // R7.AbstractC1495a, O7.InterfaceC1424e
    public p248y8.h H0() {
        return this.f24222W;
    }

    @Override // O7.InterfaceC1424e
    public boolean I() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public O7.h0 I0() {
        return null;
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection O() {
        java.util.List listM;
        if (this.f24216Q == O7.D.SEALED) {
            p028c8.a aVarB = p028c8.b.b(F8.p0.COMMON, false, false, null, 7, null);
            java.util.Collection collectionT = this.f24211L.T();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = collectionT.iterator();
            while (it.hasNext()) {
                O7.InterfaceC1427h interfaceC1427hW = this.f24213N.g().o((p048e8.j) it.next(), aVarB).W0().w();
                O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
                if (interfaceC1424e != null) {
                    arrayList.add(interfaceC1424e);
                }
            }
            listM = p097j7.AbstractC6879v.L0(arrayList, new b8.f.d());
        } else {
            listM = p097j7.AbstractC6879v.m();
        }
        return listM;
    }

    @Override // O7.InterfaceC1424e
    public boolean P() {
        return false;
    }

    @Override // O7.C
    public boolean R() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean R0() {
        return false;
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        return this.f24218S;
    }

    public final p018b8.f W0(Y7.g gVar, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(gVar, "javaResolverCache");
        p008a8.g gVar2 = this.f24213N;
        p008a8.g gVarI = p008a8.a.i(gVar2, gVar2.a().x(gVar));
        O7.InterfaceC1432m interfaceC1432mB = b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        return new p018b8.f(gVarI, interfaceC1432mB, this.f24211L, interfaceC1424e);
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1423d X() {
        return null;
    }

    @Override // O7.InterfaceC1424e
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public java.util.List r() {
        return (java.util.List) this.f24220U.x0().b();
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h Y() {
        return this.f24223X;
    }

    public final p048e8.g Y0() {
        return this.f24211L;
    }

    public final java.util.List Z0() {
        return (java.util.List) this.f24214O.getValue();
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1424e a0() {
        return null;
    }

    public final p008a8.g a1() {
        return this.f24210K;
    }

    @Override // R7.AbstractC1495a, O7.InterfaceC1424e
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public p018b8.g M0() {
        p248y8.h hVarM0 = super.M0();
        p247y7.AbstractC7350t.d(hVarM0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (p018b8.g) hVarM0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.t
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public p018b8.g Q(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return (p018b8.g) this.f24221V.c(gVar);
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        if (!p247y7.AbstractC7350t.b(this.f24217R, O7.AbstractC1438t.f8182a) || this.f24211L.f() != null) {
            return X7.J.d(this.f24217R);
        }
        O7.AbstractC1439u abstractC1439u = X7.s.f16035a;
        p247y7.AbstractC7350t.c(abstractC1439u);
        return abstractC1439u;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        return this.f24215P;
    }

    @Override // P7.a
    public P7.g k() {
        return this.f24224Y;
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        return false;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        return this.f24219T;
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        return this.f24216Q;
    }

    public java.lang.String toString() {
        return "Lazy Java class " + p218v8.c.m(this);
    }
}
