package O7;

/* JADX INFO: renamed from: O7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1438t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O7.AbstractC1439u f8182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O7.AbstractC1439u f8183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O7.AbstractC1439u f8184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O7.AbstractC1439u f8185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O7.AbstractC1439u f8186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O7.AbstractC1439u f8187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O7.AbstractC1439u f8188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O7.AbstractC1439u f8189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O7.AbstractC1439u f8190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.Set f8191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.Map f8192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final O7.AbstractC1439u f8193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p257z8.g f8194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p257z8.g f8195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p257z8.g f8196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final M8.l f8197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final java.util.Map f8198q;

    /* JADX INFO: renamed from: O7.t$a */
    static class a implements p257z8.g {
        a() {
        }

        @Override // p257z8.g
        public F8.E getType() {
            throw new java.lang.IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: O7.t$b */
    static class b implements p257z8.g {
        b() {
        }

        @Override // p257z8.g
        public F8.E getType() {
            throw new java.lang.IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: O7.t$c */
    static class c implements p257z8.g {
        c() {
        }

        @Override // p257z8.g
        public F8.E getType() {
            throw new java.lang.IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: O7.t$d */
    static class d extends O7.r {
        d(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "what";
            } else if (i6 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i6 == 1 || i6 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(O7.InterfaceC1432m interfaceC1432m) {
            if (interfaceC1432m == null) {
                g(0);
            }
            return p178r8.f.j(interfaceC1432m) != O7.b0.f8149a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == 0) {
                g(1);
            }
            if (interfaceC1432m == null) {
                g(2);
            }
            if (p178r8.f.J(interfaceC1436q) && h(interfaceC1432m)) {
                return O7.AbstractC1438t.f(interfaceC1436q, interfaceC1432m);
            }
            if (interfaceC1436q instanceof O7.InterfaceC1431l) {
                O7.InterfaceC1428i interfaceC1428iB = ((O7.InterfaceC1431l) interfaceC1436q).b();
                if (z6 && p178r8.f.G(interfaceC1428iB) && p178r8.f.J(interfaceC1428iB) && (interfaceC1432m instanceof O7.InterfaceC1431l) && p178r8.f.J(interfaceC1432m.b()) && O7.AbstractC1438t.f(interfaceC1436q, interfaceC1432m)) {
                    return true;
                }
            }
            while (interfaceC1436q != 0) {
                interfaceC1436q = interfaceC1436q.b();
                if (((interfaceC1436q instanceof O7.InterfaceC1424e) && !p178r8.f.x(interfaceC1436q)) || (interfaceC1436q instanceof O7.K)) {
                    break;
                }
            }
            if (interfaceC1436q == 0) {
                return false;
            }
            while (interfaceC1432m != null) {
                if (interfaceC1436q == interfaceC1432m) {
                    return true;
                }
                if (interfaceC1432m instanceof O7.K) {
                    return (interfaceC1436q instanceof O7.K) && ((O7.K) interfaceC1436q).e().equals(((O7.K) interfaceC1432m).e()) && p178r8.f.b(interfaceC1432m, interfaceC1436q);
                }
                interfaceC1432m = interfaceC1432m.b();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: O7.t$e */
    static class e extends O7.r {
        e(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            O7.InterfaceC1432m interfaceC1432mQ;
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            if (O7.AbstractC1438t.f8182a.e(gVar, interfaceC1436q, interfaceC1432m, z6)) {
                if (gVar == O7.AbstractC1438t.f8195n) {
                    return true;
                }
                if (gVar != O7.AbstractC1438t.f8194m && (interfaceC1432mQ = p178r8.f.q(interfaceC1436q, O7.InterfaceC1424e.class)) != null && (gVar instanceof p257z8.h)) {
                    return ((p257z8.h) gVar).v().a().equals(interfaceC1432mQ.a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: O7.t$f */
    static class f extends O7.r {
        f(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "from";
            } else if (i6 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i6 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i6 == 2 || i6 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1424e interfaceC1424e) {
            if (interfaceC1436q == null) {
                g(2);
            }
            if (interfaceC1424e == null) {
                g(3);
            }
            if (gVar == O7.AbstractC1438t.f8196o) {
                return false;
            }
            if (!(interfaceC1436q instanceof O7.InterfaceC1421b) || (interfaceC1436q instanceof O7.InterfaceC1431l) || gVar == O7.AbstractC1438t.f8195n) {
                return true;
            }
            if (gVar == O7.AbstractC1438t.f8194m || gVar == null) {
                return false;
            }
            F8.E type = gVar.getType();
            return p178r8.f.I(type, interfaceC1424e) || F8.AbstractC0959u.a(type);
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            O7.InterfaceC1424e interfaceC1424e;
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            O7.InterfaceC1424e interfaceC1424e2 = (O7.InterfaceC1424e) p178r8.f.q(interfaceC1436q, O7.InterfaceC1424e.class);
            O7.InterfaceC1424e interfaceC1424e3 = (O7.InterfaceC1424e) p178r8.f.r(interfaceC1432m, O7.InterfaceC1424e.class, false);
            if (interfaceC1424e3 == null) {
                return false;
            }
            if (interfaceC1424e2 != null && p178r8.f.x(interfaceC1424e2) && (interfaceC1424e = (O7.InterfaceC1424e) p178r8.f.q(interfaceC1424e2, O7.InterfaceC1424e.class)) != null && p178r8.f.H(interfaceC1424e3, interfaceC1424e)) {
                return true;
            }
            O7.InterfaceC1436q interfaceC1436qM = p178r8.f.M(interfaceC1436q);
            O7.InterfaceC1424e interfaceC1424e4 = (O7.InterfaceC1424e) p178r8.f.q(interfaceC1436qM, O7.InterfaceC1424e.class);
            if (interfaceC1424e4 == null) {
                return false;
            }
            if (p178r8.f.H(interfaceC1424e3, interfaceC1424e4) && h(gVar, interfaceC1436qM, interfaceC1424e3)) {
                return true;
            }
            return e(gVar, interfaceC1436q, interfaceC1424e3.b(), z6);
        }
    }

    /* JADX INFO: renamed from: O7.t$g */
    static class g extends O7.r {
        g(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            if (p178r8.f.g(interfaceC1432m).U(p178r8.f.g(interfaceC1436q))) {
                return O7.AbstractC1438t.f8197p.a(interfaceC1436q, interfaceC1432m);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: O7.t$h */
    static class h extends O7.r {
        h(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: O7.t$i */
    static class i extends O7.r {
        i(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            throw new java.lang.IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: O7.t$j */
    static class j extends O7.r {
        j(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            throw new java.lang.IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: O7.t$k */
    static class k extends O7.r {
        k(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: O7.t$l */
    static class l extends O7.r {
        l(O7.n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // O7.AbstractC1439u
        public boolean e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
            if (interfaceC1436q == null) {
                g(0);
            }
            if (interfaceC1432m == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        O7.AbstractC1438t.d dVar = new O7.AbstractC1438t.d(O7.m0.e.f8174c);
        f8182a = dVar;
        O7.AbstractC1438t.e eVar = new O7.AbstractC1438t.e(O7.m0.f.f8175c);
        f8183b = eVar;
        O7.AbstractC1438t.f fVar = new O7.AbstractC1438t.f(O7.m0.g.f8176c);
        f8184c = fVar;
        O7.AbstractC1438t.g gVar = new O7.AbstractC1438t.g(O7.m0.b.f8171c);
        f8185d = gVar;
        O7.AbstractC1438t.h hVar = new O7.AbstractC1438t.h(O7.m0.h.f8177c);
        f8186e = hVar;
        O7.AbstractC1438t.i iVar = new O7.AbstractC1438t.i(O7.m0.d.f8173c);
        f8187f = iVar;
        O7.AbstractC1438t.j jVar = new O7.AbstractC1438t.j(O7.m0.a.f8170c);
        f8188g = jVar;
        O7.AbstractC1438t.k kVar = new O7.AbstractC1438t.k(O7.m0.c.f8172c);
        f8189h = kVar;
        O7.AbstractC1438t.l lVar = new O7.AbstractC1438t.l(O7.m0.i.f8178c);
        f8190i = lVar;
        f8191j = j$.util.DesugarCollections.unmodifiableSet(p097j7.Z.g(dVar, eVar, gVar, iVar));
        java.util.HashMap mapE = P8.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f8192k = j$.util.DesugarCollections.unmodifiableMap(mapE);
        f8193l = hVar;
        f8194m = new O7.AbstractC1438t.a();
        f8195n = new O7.AbstractC1438t.b();
        f8196o = new O7.AbstractC1438t.c();
        java.util.Iterator it = java.util.ServiceLoader.load(M8.l.class, M8.l.class.getClassLoader()).iterator();
        f8197p = it.hasNext() ? (M8.l) it.next() : M8.l.a.f7101a;
        f8198q = new java.util.HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    private static /* synthetic */ void a(int i6) {
        java.lang.String str = i6 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i6 != 16 ? 3 : 2];
        if (i6 != 1 && i6 != 3 && i6 != 5 && i6 != 7) {
            switch (i6) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i6 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i6) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 == 16) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static java.lang.Integer d(O7.AbstractC1439u abstractC1439u, O7.AbstractC1439u abstractC1439u2) {
        if (abstractC1439u == null) {
            a(12);
        }
        if (abstractC1439u2 == null) {
            a(13);
        }
        java.lang.Integer numA = abstractC1439u.a(abstractC1439u2);
        if (numA != null) {
            return numA;
        }
        java.lang.Integer numA2 = abstractC1439u2.a(abstractC1439u);
        if (numA2 != null) {
            return java.lang.Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static O7.InterfaceC1436q e(p257z8.g gVar, O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
        O7.InterfaceC1436q interfaceC1436qE;
        if (interfaceC1436q == null) {
            a(8);
        }
        if (interfaceC1432m == null) {
            a(9);
        }
        O7.InterfaceC1432m interfaceC1432mA = interfaceC1436q.a();
        while (true) {
            O7.InterfaceC1436q interfaceC1436q2 = (O7.InterfaceC1436q) interfaceC1432mA;
            if (interfaceC1436q2 == null || interfaceC1436q2.h() == f8187f) {
                break;
            }
            if (!interfaceC1436q2.h().e(gVar, interfaceC1436q2, interfaceC1432m, z6)) {
                return interfaceC1436q2;
            }
            interfaceC1432mA = p178r8.f.q(interfaceC1436q2, O7.InterfaceC1436q.class);
        }
        if (!(interfaceC1436q instanceof R7.I) || (interfaceC1436qE = e(gVar, ((R7.I) interfaceC1436q).y0(), interfaceC1432m, z6)) == null) {
            return null;
        }
        return interfaceC1436qE;
    }

    public static boolean f(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
        if (interfaceC1432m == null) {
            a(6);
        }
        if (interfaceC1432m2 == null) {
            a(7);
        }
        O7.b0 b0VarJ = p178r8.f.j(interfaceC1432m2);
        if (b0VarJ != O7.b0.f8149a) {
            return b0VarJ.equals(p178r8.f.j(interfaceC1432m));
        }
        return false;
    }

    public static boolean g(O7.AbstractC1439u abstractC1439u) {
        if (abstractC1439u == null) {
            a(14);
        }
        return abstractC1439u == f8182a || abstractC1439u == f8183b;
    }

    public static boolean h(O7.InterfaceC1436q interfaceC1436q, O7.InterfaceC1432m interfaceC1432m, boolean z6) {
        if (interfaceC1436q == null) {
            a(2);
        }
        if (interfaceC1432m == null) {
            a(3);
        }
        return e(f8195n, interfaceC1436q, interfaceC1432m, z6) == null;
    }

    private static void i(O7.AbstractC1439u abstractC1439u) {
        f8198q.put(abstractC1439u.b(), abstractC1439u);
    }

    public static O7.AbstractC1439u j(O7.n0 n0Var) {
        if (n0Var == null) {
            a(15);
        }
        O7.AbstractC1439u abstractC1439u = (O7.AbstractC1439u) f8198q.get(n0Var);
        if (abstractC1439u != null) {
            return abstractC1439u;
        }
        throw new java.lang.IllegalArgumentException("Inapplicable visibility: " + n0Var);
    }
}
