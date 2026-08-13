package p092j1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j1.g.b f49161k = new j1.g.b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f49162l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p092j1.c f49163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49164b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.HashMap f49165c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.HashMap f49166d = new java.util.HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.HashMap f49167e = new java.util.HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p092j1.a f49168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.ArrayList f49170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f49171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f49172j;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 j1.g$a, still in use, count: 1, list:
  (r0v0 j1.g$a) from 0x0040: INVOKE ("spread"), (r0v0 j1.g$a) STATIC call: i7.B.a(java.lang.Object, java.lang.Object):i7.u A[MD:(java.lang.Object, java.lang.Object):i7.u (m), WRAPPED]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final j1.g.a.C0614a f49173C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final java.util.Map f49174D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final java.util.Map f49175E;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f49180J;

        /* JADX INFO: renamed from: j1.g$a$a, reason: collision with other inner class name */
        public static final class C0614a {
            private C0614a() {
            }

            public /* synthetic */ C0614a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a(java.lang.String str) {
                if (!b().containsKey(str)) {
                    return -1;
                }
                java.lang.Object obj = b().get(str);
                p247y7.AbstractC7350t.c(obj);
                return ((java.lang.Number) obj).intValue();
            }

            public final java.util.Map b() {
                return j1.g.a.f49175E;
            }
        }

        static {
            j1.g.a[] aVarArrE = e();
            f49180J = p157p7.b.a(aVarArrE);
            f49173C = new j1.g.a.C0614a(null);
            f49174D = p097j7.S.j(p087i7.B.a("packed", aVar), p087i7.B.a("spread_inside", aVar), p087i7.B.a("spread", aVar));
            f49175E = p097j7.S.j(p087i7.B.a("packed", 2), p087i7.B.a("spread_inside", 1), p087i7.B.a("spread", 0));
        }

        private a() {
            super(str, i);
        }

        public static j1.g.a valueOf(java.lang.String str) {
            return (j1.g.a) java.lang.Enum.valueOf(j1.g.a.class, str);
        }

        public static j1.g.a[] values() {
            return (j1.g.a[]) f49179I.clone();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT;


        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f49202X = p157p7.b.a(e());
    }

    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM;


        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f49210J = p157p7.b.a(e());
    }

    public enum e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW;


        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f49224P = p157p7.b.a(e());
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49225a;

        static {
            int[] iArr = new int[j1.g.e.values().length];
            try {
                iArr[j1.g.e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[j1.g.e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.g.e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[j1.g.e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[j1.g.e.BARRIER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[j1.g.e.VERTICAL_FLOW.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[j1.g.e.HORIZONTAL_FLOW.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[j1.g.e.GRID.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[j1.g.e.ROW.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[j1.g.e.COLUMN.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            f49225a = iArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 j1.g$g, still in use, count: 1, list:
  (r0v0 j1.g$g) from 0x0034: INVOKE ("none"), (r0v0 j1.g$g) STATIC call: i7.B.a(java.lang.Object, java.lang.Object):i7.u A[MD:(java.lang.Object, java.lang.Object):i7.u (m), WRAPPED]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: j1.g$g, reason: collision with other inner class name */
    public static final class EnumC0615g {
        NONE,
        CHAIN,
        ALIGNED;


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final p092j1.g.EnumC0615g.a f49226C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final java.util.Map f49227D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final java.util.Map f49228E;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f49233J;

        /* JADX INFO: renamed from: j1.g$g$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a(java.lang.String str) {
                if (!b().containsKey(str)) {
                    return -1;
                }
                java.lang.Object obj = b().get(str);
                p247y7.AbstractC7350t.c(obj);
                return ((java.lang.Number) obj).intValue();
            }

            public final java.util.Map b() {
                return p092j1.g.EnumC0615g.f49228E;
            }
        }

        static {
            p092j1.g.EnumC0615g[] enumC0615gArrE = e();
            f49233J = p157p7.b.a(enumC0615gArrE);
            f49226C = new p092j1.g.EnumC0615g.a(null);
            f49227D = p097j7.S.j(p087i7.B.a("none", enumC0615g), p087i7.B.a("chain", enumC0615g), p087i7.B.a("aligned", enumC0615g));
            f49228E = p097j7.S.j(p087i7.B.a("none", 0), p087i7.B.a("chain", 3), p087i7.B.a("aligned", 2));
        }

        private EnumC0615g() {
            super(str, i);
        }

        public static p092j1.g.EnumC0615g valueOf(java.lang.String str) {
            return (p092j1.g.EnumC0615g) java.lang.Enum.valueOf(p092j1.g.EnumC0615g.class, str);
        }

        public static p092j1.g.EnumC0615g[] values() {
            return (p092j1.g.EnumC0615g[]) f49232I.clone();
        }
    }

    public g() {
        p092j1.a aVar = new p092j1.a(this);
        this.f49168f = aVar;
        this.f49170h = new java.util.ArrayList();
        this.f49171i = new java.util.ArrayList();
        this.f49172j = true;
        aVar.A0(0);
        this.f49165c.put(0, aVar);
    }

    private final java.lang.String g() {
        int i6 = this.f49169g;
        this.f49169g = i6 + 1;
        return "__HELPER_KEY_" + i6 + "__";
    }

    public final p092j1.g A(p092j1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "dimension");
        this.f49168f.G0(dVar);
        return this;
    }

    public final p102k1.j B() {
        p092j1.e eVarO = o(null, j1.g.e.VERTICAL_CHAIN);
        p247y7.AbstractC7350t.d(eVarO, "null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.VerticalChainReference");
        return (p102k1.j) eVarO;
    }

    public final p102k1.h C(java.lang.Object obj) {
        return m(obj, 1);
    }

    public final p092j1.g D(p092j1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "dimension");
        return A(dVar);
    }

    public final void a(p122m1.f fVar) {
        p122m1.e eVarA;
        p247y7.AbstractC7350t.f(fVar, "container");
        fVar.g2();
        this.f49168f.d0().a(this, fVar, 0);
        this.f49168f.B().a(this, fVar, 1);
        java.util.Iterator it = this.f49166d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            p092j1.e eVar = (p092j1.e) this.f49166d.get(next);
            p122m1.j jVarV0 = eVar != null ? eVar.V0() : null;
            if (jVarV0 != null) {
                p092j1.f fVarD = (p092j1.f) this.f49165c.get(next);
                if (fVarD == null) {
                    fVarD = d(next);
                }
                p247y7.AbstractC7350t.c(fVarD);
                fVarD.b(jVarV0);
            }
        }
        for (java.lang.Object obj : this.f49165c.keySet()) {
            p092j1.f fVar2 = (p092j1.f) this.f49165c.get(obj);
            if (!p247y7.AbstractC7350t.b(fVar2, this.f49168f)) {
                p247y7.AbstractC7350t.c(fVar2);
                if (fVar2.c() instanceof p092j1.e) {
                    p092j1.e eVar2 = (p092j1.e) fVar2.c();
                    p122m1.j jVarV1 = eVar2 != null ? eVar2.V0() : null;
                    if (jVarV1 != null) {
                        p092j1.f fVarD2 = (p092j1.f) this.f49165c.get(obj);
                        if (fVarD2 == null) {
                            fVarD2 = d(obj);
                        }
                        p247y7.AbstractC7350t.c(fVarD2);
                        fVarD2.b(jVarV1);
                    }
                }
            }
        }
        java.util.Iterator it2 = this.f49165c.keySet().iterator();
        while (it2.hasNext()) {
            p092j1.f fVar3 = (p092j1.f) this.f49165c.get(it2.next());
            if (p247y7.AbstractC7350t.b(fVar3, this.f49168f)) {
                fVar3.b(fVar);
            } else {
                p247y7.AbstractC7350t.c(fVar3);
                p122m1.e eVarA2 = fVar3.a();
                p247y7.AbstractC7350t.c(eVarA2);
                eVarA2.c1(java.lang.String.valueOf(fVar3.getKey()));
                eVarA2.I1(null);
                if (fVar3.c() instanceof p102k1.h) {
                    fVar3.apply();
                }
                fVar.a2(eVarA2);
            }
        }
        java.util.Iterator it3 = this.f49166d.keySet().iterator();
        while (it3.hasNext()) {
            p092j1.e eVar3 = (p092j1.e) this.f49166d.get(it3.next());
            if ((eVar3 != null ? eVar3.V0() : null) != null) {
                java.util.Iterator it4 = eVar3.X0().iterator();
                while (it4.hasNext()) {
                    p092j1.f fVar4 = (p092j1.f) this.f49165c.get(it4.next());
                    p122m1.j jVarV2 = eVar3.V0();
                    p247y7.AbstractC7350t.c(jVarV2);
                    p247y7.AbstractC7350t.c(fVar4);
                    jVarV2.a2(fVar4.a());
                }
            } else if (eVar3 != null) {
            }
            eVar3.apply();
        }
        java.util.Iterator it5 = this.f49165c.keySet().iterator();
        while (it5.hasNext()) {
            p092j1.f fVar5 = (p092j1.f) this.f49165c.get(it5.next());
            if (!p247y7.AbstractC7350t.b(fVar5, this.f49168f)) {
                p247y7.AbstractC7350t.c(fVar5);
                if (fVar5.c() instanceof p092j1.e) {
                    p092j1.e eVar4 = (p092j1.e) fVar5.c();
                    p122m1.j jVarV3 = eVar4 != null ? eVar4.V0() : null;
                    if (jVarV3 != null) {
                        for (java.lang.Object obj2 : eVar4.X0()) {
                            p092j1.f fVar6 = (p092j1.f) this.f49165c.get(obj2);
                            if (fVar6 != null) {
                                eVarA = fVar6.a();
                            } else if (obj2 instanceof p092j1.f) {
                                eVarA = ((p092j1.f) obj2).a();
                            } else {
                                java.lang.System.out.println((java.lang.Object) ("couldn't find reference for " + obj2));
                            }
                            jVarV3.a2(eVarA);
                        }
                        fVar5.apply();
                    }
                }
            }
        }
        for (java.lang.Object obj3 : this.f49165c.keySet()) {
            p092j1.f fVar7 = (p092j1.f) this.f49165c.get(obj3);
            p247y7.AbstractC7350t.c(fVar7);
            fVar7.apply();
            p122m1.e eVarA3 = fVar7.a();
            if (eVarA3 != null && obj3 != null) {
                eVarA3.J1(obj3.toString());
            }
        }
    }

    public final p102k1.c b(java.lang.Object obj, j1.g.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "direction");
        p092j1.a aVarD = d(obj);
        if ((aVarD != null ? aVarD.c() : null) == null || !(aVarD.c() instanceof p102k1.c)) {
            p102k1.c cVar = new p102k1.c(this);
            cVar.Z0(dVar);
            if (aVarD != null) {
                aVarD.w0(cVar);
            }
        }
        return (p102k1.c) (aVarD != null ? aVarD.c() : null);
    }

    public final void c(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "id");
        this.f49170h.add(obj);
        this.f49172j = true;
    }

    public final p092j1.a d(java.lang.Object obj) {
        p092j1.f fVar = (p092j1.f) this.f49165c.get(obj);
        p092j1.f fVar2 = fVar;
        if (fVar == null) {
            p092j1.a aVarF = f(obj);
            java.util.HashMap map = this.f49165c;
            p247y7.AbstractC7350t.c(obj);
            map.put(obj, aVarF);
            aVarF.A0(obj);
            fVar2 = aVarF;
        }
        if (fVar2 instanceof p092j1.a) {
            return (p092j1.a) fVar2;
        }
        return null;
    }

    public int e(java.lang.Object obj) {
        if (obj instanceof java.lang.Float) {
            return A7.a.d(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Number) obj).intValue();
        }
        return 0;
    }

    public final p092j1.a f(java.lang.Object obj) {
        return new p092j1.a(this);
    }

    public final p092j1.c h() {
        return this.f49163a;
    }

    public final p102k1.f i(java.lang.Object obj, boolean z6) {
        p092j1.a aVarD = d(obj);
        if ((aVarD != null ? aVarD.c() : null) == null || !(aVarD.c() instanceof p102k1.f)) {
            p102k1.f fVar = z6 ? new p102k1.f(this, j1.g.e.VERTICAL_FLOW) : new p102k1.f(this, j1.g.e.HORIZONTAL_FLOW);
            if (aVarD != null) {
                aVarD.w0(fVar);
            }
        }
        return (p102k1.f) (aVarD != null ? aVarD.c() : null);
    }

    public final p102k1.g j(java.lang.Object obj, java.lang.String str) {
        p247y7.AbstractC7350t.f(obj, "key");
        p247y7.AbstractC7350t.f(str, "gridType");
        p092j1.a aVarD = d(obj);
        if ((aVarD != null ? aVarD.c() : null) == null || !(aVarD.c() instanceof p102k1.g)) {
            j1.g.e eVar = j1.g.e.GRID;
            if (str.charAt(0) == 'r') {
                eVar = j1.g.e.ROW;
            } else if (str.charAt(0) == 'c') {
                eVar = j1.g.e.COLUMN;
            }
            p102k1.g gVar = new p102k1.g(this, eVar);
            if (aVarD != null) {
                aVarD.w0(gVar);
            }
        }
        return (p102k1.g) (aVarD != null ? aVarD.c() : null);
    }

    public final java.util.ArrayList k(java.lang.String str) {
        if (this.f49167e.containsKey(str)) {
            return (java.util.ArrayList) this.f49167e.get(str);
        }
        return null;
    }

    public final p092j1.a l() {
        return this.f49168f;
    }

    public final p102k1.h m(java.lang.Object obj, int i6) {
        p092j1.a aVarD = d(obj);
        if ((aVarD != null ? aVarD.c() : null) == null || !(aVarD.c() instanceof p102k1.h)) {
            p102k1.h hVar = new p102k1.h(this);
            hVar.g(i6);
            hVar.f(obj);
            if (aVarD != null) {
                aVarD.w0(hVar);
            }
        }
        return (p102k1.h) (aVarD != null ? aVarD.c() : null);
    }

    public final p092j1.g n(p092j1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "dimension");
        return x(dVar);
    }

    public final p092j1.e o(java.lang.Object obj, j1.g.e eVar) {
        p092j1.e iVar;
        if (obj == null) {
            obj = g();
        }
        p092j1.e fVar = (p092j1.e) this.f49166d.get(obj);
        if (fVar == null) {
            switch (eVar == null ? -1 : j1.g.f.f49225a[eVar.ordinal()]) {
                case 1:
                    iVar = new p102k1.i(this);
                    fVar = iVar;
                    break;
                case 2:
                    iVar = new p102k1.j(this);
                    fVar = iVar;
                    break;
                case 3:
                    iVar = new p102k1.a(this);
                    fVar = iVar;
                    break;
                case 4:
                    iVar = new p102k1.b(this);
                    fVar = iVar;
                    break;
                case 5:
                    iVar = new p102k1.c(this);
                    fVar = iVar;
                    break;
                case 6:
                case 7:
                    fVar = new p102k1.f(this, eVar);
                    break;
                case 8:
                case 9:
                case 10:
                    fVar = new p102k1.g(this, eVar);
                    break;
                default:
                    p247y7.AbstractC7350t.c(eVar);
                    fVar = new p092j1.e(this, eVar);
                    break;
            }
            fVar.A0(obj);
            this.f49166d.put(obj, fVar);
        }
        return fVar;
    }

    public final p102k1.i p() {
        p092j1.e eVarO = o(null, j1.g.e.HORIZONTAL_CHAIN);
        p247y7.AbstractC7350t.d(eVarO, "null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.HorizontalChainReference");
        return (p102k1.i) eVarO;
    }

    public final p102k1.h q(java.lang.Object obj) {
        return m(obj, 0);
    }

    public final boolean r(p122m1.e eVar) {
        if (this.f49172j) {
            this.f49171i.clear();
            java.util.Iterator it = this.f49170h.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = this.f49165c.get(it.next());
                p247y7.AbstractC7350t.c(obj);
                p122m1.e eVarA = ((p092j1.f) obj).a();
                if (eVarA != null) {
                    this.f49171i.add(eVarA);
                }
            }
            this.f49172j = false;
        }
        return p097j7.AbstractC6879v.Z(this.f49171i, eVar);
    }

    public final boolean s() {
        return !this.f49164b;
    }

    public final void t(java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(obj2, "view");
        p092j1.a aVarD = d(obj);
        if (aVarD != null) {
            aVarD.F0(obj2);
        }
    }

    public final p092j1.f u(java.lang.Object obj) {
        return (p092j1.f) this.f49165c.get(obj);
    }

    public final void v() {
        java.util.Iterator it = this.f49165c.keySet().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = this.f49165c.get(it.next());
            p247y7.AbstractC7350t.c(obj);
            p122m1.e eVarA = ((p092j1.f) obj).a();
            p247y7.AbstractC7350t.c(eVarA);
            eVarA.W0();
        }
        this.f49165c.clear();
        this.f49165c.put(0, this.f49168f);
        this.f49166d.clear();
        this.f49167e.clear();
        this.f49170h.clear();
        this.f49172j = true;
    }

    public final void w(p092j1.c cVar) {
        this.f49163a = cVar;
    }

    public final p092j1.g x(p092j1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "dimension");
        this.f49168f.x0(dVar);
        return this;
    }

    public final void y(boolean z6) {
        this.f49164b = !z6;
    }

    public final void z(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList;
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(str2, "tag");
        p092j1.a aVarD = d(str);
        if (aVarD instanceof p092j1.a) {
            aVarD.C0(str2);
            if (this.f49167e.containsKey(str2)) {
                arrayList = (java.util.ArrayList) this.f49167e.get(str2);
            } else {
                arrayList = new java.util.ArrayList();
                this.f49167e.put(str2, arrayList);
            }
            p247y7.AbstractC7350t.c(arrayList);
            arrayList.add(str);
        }
    }
}
