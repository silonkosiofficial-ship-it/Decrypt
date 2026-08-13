package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1984x extends androidx.core.view.C1990a {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1984x.d f20346O = new androidx.compose.ui.platform.C1984x.d(null);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f20347P = 8;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final p170r.AbstractC7037l f20348Q = p170r.AbstractC7038m.a(p071h0.l.f45817a, p071h0.l.f45818b, p071h0.l.f45829m, p071h0.l.f45840x, p071h0.l.f45805A, p071h0.l.f45806B, p071h0.l.f45807C, p071h0.l.f45808D, p071h0.l.f45809E, p071h0.l.f45810F, p071h0.l.f45819c, p071h0.l.f45820d, p071h0.l.f45821e, p071h0.l.f45822f, p071h0.l.f45823g, p071h0.l.f45824h, p071h0.l.f45825i, p071h0.l.f45826j, p071h0.l.f45827k, p071h0.l.f45828l, p071h0.l.f45830n, p071h0.l.f45831o, p071h0.l.f45832p, p071h0.l.f45833q, p071h0.l.f45834r, p071h0.l.f45835s, p071h0.l.f45836t, p071h0.l.f45837u, p071h0.l.f45838v, p071h0.l.f45839w, p071h0.l.f45841y, p071h0.l.f45842z);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private androidx.compose.ui.platform.C1984x.g f20349A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p170r.AbstractC7039n f20350B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p170r.D f20351C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p170r.A f20352D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p170r.A f20353E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f20354F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.String f20355G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final U0.t f20356H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p170r.C f20357I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private androidx.compose.ui.platform.C1964o1 f20358J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f20359K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.lang.Runnable f20360L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final java.util.List f20361M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p237x7.l f20362N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f20363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20364e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p237x7.l f20365f = new androidx.compose.ui.platform.C1984x.m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager f20366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener f20369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener f20370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.util.List f20371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final android.os.Handler f20372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.compose.ui.platform.C1984x.e f20373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C1.B f20375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p170r.C f20377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p170r.C f20378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p170r.Z f20379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p170r.Z f20380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private java.lang.Integer f20382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p170r.C7027b f20383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Y8.j f20384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f20385z;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$a */
    public static final class a implements android.view.View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            android.view.accessibility.AccessibilityManager accessibilityManager = androidx.compose.ui.platform.C1984x.this.f20366g;
            androidx.compose.ui.platform.C1984x c1984x = androidx.compose.ui.platform.C1984x.this;
            accessibilityManager.addAccessibilityStateChangeListener(c1984x.f20369j);
            accessibilityManager.addTouchExplorationStateChangeListener(c1984x.f20370k);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            androidx.compose.ui.platform.C1984x.this.f20372m.removeCallbacks(androidx.compose.ui.platform.C1984x.this.f20360L);
            android.view.accessibility.AccessibilityManager accessibilityManager = androidx.compose.ui.platform.C1984x.this.f20366g;
            androidx.compose.ui.platform.C1984x c1984x = androidx.compose.ui.platform.C1984x.this;
            accessibilityManager.removeAccessibilityStateChangeListener(c1984x.f20369j);
            accessibilityManager.removeTouchExplorationStateChangeListener(c1984x.f20370k);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.b f20387a = new androidx.compose.ui.platform.C1984x.b();

        private b() {
        }

        public static final void a(C1.B b6, K0.o oVar) {
            K0.a aVar;
            if (!androidx.compose.ui.platform.A.h(oVar) || (aVar = (K0.a) K0.l.a(oVar.w(), K0.j.f5973a.w())) == null) {
                return;
            }
            b6.b(new C1.B.a(android.R.id.accessibilityActionSetProgress, aVar.b()));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$c */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.c f20388a = new androidx.compose.ui.platform.C1984x.c();

        private c() {
        }

        public static final void a(C1.B b6, K0.o oVar) {
            if (androidx.compose.ui.platform.A.h(oVar)) {
                K0.k kVarW = oVar.w();
                K0.j jVar = K0.j.f5973a;
                K0.a aVar = (K0.a) K0.l.a(kVarW, jVar.q());
                if (aVar != null) {
                    b6.b(new C1.B.a(android.R.id.accessibilityActionPageUp, aVar.b()));
                }
                K0.a aVar2 = (K0.a) K0.l.a(oVar.w(), jVar.n());
                if (aVar2 != null) {
                    b6.b(new C1.B.a(android.R.id.accessibilityActionPageDown, aVar2.b()));
                }
                K0.a aVar3 = (K0.a) K0.l.a(oVar.w(), jVar.o());
                if (aVar3 != null) {
                    b6.b(new C1.B.a(android.R.id.accessibilityActionPageLeft, aVar3.b()));
                }
                K0.a aVar4 = (K0.a) K0.l.a(oVar.w(), jVar.p());
                if (aVar4 != null) {
                    b6.b(new C1.B.a(android.R.id.accessibilityActionPageRight, aVar4.b()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$d */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$e */
    private final class e extends C1.E {
        public e() {
        }

        @Override // C1.E
        public void a(int i6, C1.B b6, java.lang.String str, android.os.Bundle bundle) {
            androidx.compose.ui.platform.C1984x.this.K(i6, b6, str, bundle);
        }

        @Override // C1.E
        public C1.B b(int i6) {
            C1.B bS = androidx.compose.ui.platform.C1984x.this.S(i6);
            androidx.compose.ui.platform.C1984x c1984x = androidx.compose.ui.platform.C1984x.this;
            if (c1984x.f20376q && i6 == c1984x.f20374o) {
                c1984x.f20375p = bS;
            }
            return bS;
        }

        @Override // C1.E
        public C1.B d(int i6) {
            return b(androidx.compose.ui.platform.C1984x.this.f20374o);
        }

        @Override // C1.E
        public boolean f(int i6, int i10, android.os.Bundle bundle) {
            return androidx.compose.ui.platform.C1984x.this.v0(i6, i10, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$f */
    private static final class f implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.f f20390C = new androidx.compose.ui.platform.C1984x.f();

        private f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(K0.o oVar, K0.o oVar2) {
            p131n0.i iVarJ = oVar.j();
            p131n0.i iVarJ2 = oVar2.j();
            int iCompare = java.lang.Float.compare(iVarJ.i(), iVarJ2.i());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = java.lang.Float.compare(iVarJ.l(), iVarJ2.l());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = java.lang.Float.compare(iVarJ.e(), iVarJ2.e());
            return iCompare3 != 0 ? iCompare3 : java.lang.Float.compare(iVarJ.j(), iVarJ2.j());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$g */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K0.o f20391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f20395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f20396f;

        public g(K0.o oVar, int i6, int i10, int i11, int i12, long j6) {
            this.f20391a = oVar;
            this.f20392b = i6;
            this.f20393c = i10;
            this.f20394d = i11;
            this.f20395e = i12;
            this.f20396f = j6;
        }

        public final int a() {
            return this.f20392b;
        }

        public final int b() {
            return this.f20394d;
        }

        public final int c() {
            return this.f20393c;
        }

        public final K0.o d() {
            return this.f20391a;
        }

        public final int e() {
            return this.f20395e;
        }

        public final long f() {
            return this.f20396f;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$h */
    private static final class h implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.h f20397C = new androidx.compose.ui.platform.C1984x.h();

        private h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(K0.o oVar, K0.o oVar2) {
            p131n0.i iVarJ = oVar.j();
            p131n0.i iVarJ2 = oVar2.j();
            int iCompare = java.lang.Float.compare(iVarJ2.j(), iVarJ.j());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = java.lang.Float.compare(iVarJ.l(), iVarJ2.l());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = java.lang.Float.compare(iVarJ.e(), iVarJ2.e());
            return iCompare3 != 0 ? iCompare3 : java.lang.Float.compare(iVarJ2.i(), iVarJ.i());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$i */
    private static final class i implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.i f20398C = new androidx.compose.ui.platform.C1984x.i();

        private i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p087i7.u uVar, p087i7.u uVar2) {
            int iCompare = java.lang.Float.compare(((p131n0.i) uVar.c()).l(), ((p131n0.i) uVar2.c()).l());
            return iCompare != 0 ? iCompare : java.lang.Float.compare(((p131n0.i) uVar.c()).e(), ((p131n0.i) uVar2.c()).e());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$j */
    public /* synthetic */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20399a;

        static {
            int[] iArr = new int[L0.a.values().length];
            try {
                iArr[L0.a.On.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[L0.a.Off.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[L0.a.Indeterminate.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f20399a = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$k */
    static final class k extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f20400F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f20401G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f20402H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f20403I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f20405K;

        k(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f20403I = obj;
            this.f20405K |= Integer.MIN_VALUE;
            return androidx.compose.ui.platform.C1984x.this.M(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$l */
    static final class l extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.l f20406D = new androidx.compose.ui.platform.C1984x.l();

        l() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$m */
    static final class m extends p247y7.AbstractC7352v implements p237x7.l {
        m() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return java.lang.Boolean.valueOf(androidx.compose.ui.platform.C1984x.this.l0().getParent().requestSendAccessibilityEvent(androidx.compose.ui.platform.C1984x.this.l0(), accessibilityEvent));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$n */
    static final class n extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.C1961n1 f20408D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.C1984x f20409E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.ui.platform.C1961n1 c1961n1, androidx.compose.ui.platform.C1984x c1984x) {
            super(0);
            this.f20408D = c1961n1;
            this.f20409E = c1984x;
        }

        public final void a() {
            K0.o oVarB;
            F0.J jQ;
            K0.i iVarA = this.f20408D.a();
            K0.i iVarE = this.f20408D.e();
            java.lang.Float fB = this.f20408D.b();
            java.lang.Float fC = this.f20408D.c();
            float fFloatValue = (iVarA == null || fB == null) ? 0.0f : ((java.lang.Number) iVarA.c().b()).floatValue() - fB.floatValue();
            float fFloatValue2 = (iVarE == null || fC == null) ? 0.0f : ((java.lang.Number) iVarE.c().b()).floatValue() - fC.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iF0 = this.f20409E.F0(this.f20408D.d());
                androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) this.f20409E.a0().c(this.f20409E.f20374o);
                if (c1967p1 != null) {
                    androidx.compose.ui.platform.C1984x c1984x = this.f20409E;
                    try {
                        C1.B b6 = c1984x.f20375p;
                        if (b6 != null) {
                            b6.j0(c1984x.L(c1967p1));
                            p087i7.M m6 = p087i7.M.f46721a;
                        }
                    } catch (java.lang.IllegalStateException unused) {
                        p087i7.M m10 = p087i7.M.f46721a;
                    }
                }
                this.f20409E.l0().invalidate();
                androidx.compose.ui.platform.C1967p1 c1967p2 = (androidx.compose.ui.platform.C1967p1) this.f20409E.a0().c(iF0);
                if (c1967p2 != null && (oVarB = c1967p2.b()) != null && (jQ = oVarB.q()) != null) {
                    androidx.compose.ui.platform.C1984x c1984x2 = this.f20409E;
                    if (iVarA != null) {
                        c1984x2.f20377r.s(iF0, iVarA);
                    }
                    if (iVarE != null) {
                        c1984x2.f20378s.s(iF0, iVarE);
                    }
                    c1984x2.s0(jQ);
                }
            }
            if (iVarA != null) {
                this.f20408D.g((java.lang.Float) iVarA.c().b());
            }
            if (iVarE != null) {
                this.f20408D.h((java.lang.Float) iVarE.c().b());
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$o */
    static final class o extends p247y7.AbstractC7352v implements p237x7.l {
        o() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.C1961n1 c1961n1) {
            androidx.compose.ui.platform.C1984x.this.D0(c1961n1);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.platform.C1961n1) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$p */
    static final class p extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.p f20411D = new androidx.compose.ui.platform.C1984x.p();

        p() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.J j6) {
            K0.k kVarI = j6.I();
            boolean z6 = false;
            if (kVarI != null && kVarI.M()) {
                z6 = true;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$q */
    static final class q extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.q f20412D = new androidx.compose.ui.platform.C1984x.q();

        q() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.J j6) {
            return java.lang.Boolean.valueOf(j6.k0().q(F0.AbstractC0918f0.a(8)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.x$r */
    static final class r extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1984x.r f20413D = new androidx.compose.ui.platform.C1984x.r();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.x$r$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final androidx.compose.ui.platform.C1984x.r.a f20414D = new androidx.compose.ui.platform.C1984x.r.a();

            a() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float b() {
                return java.lang.Float.valueOf(0.0f);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.x$r$b */
        static final class b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final androidx.compose.ui.platform.C1984x.r.b f20415D = new androidx.compose.ui.platform.C1984x.r.b();

            b() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float b() {
                return java.lang.Float.valueOf(0.0f);
            }
        }

        r() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer u(K0.o oVar, K0.o oVar2) {
            K0.k kVarW = oVar.w();
            K0.r rVar = K0.r.f6030a;
            return java.lang.Integer.valueOf(java.lang.Float.compare(((java.lang.Number) kVarW.C(rVar.H(), androidx.compose.ui.platform.C1984x.r.a.f20414D)).floatValue(), ((java.lang.Number) oVar2.w().C(rVar.H(), androidx.compose.ui.platform.C1984x.r.b.f20415D)).floatValue()));
        }
    }

    public C1984x(androidx.compose.ui.platform.r rVar) {
        this.f20363d = rVar;
        java.lang.Object systemService = rVar.getContext().getSystemService("accessibility");
        p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.f20366g = accessibilityManager;
        this.f20368i = 100L;
        this.f20369j = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.u
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z6) {
                androidx.compose.ui.platform.C1984x.W(this.f20332C, z6);
            }
        };
        this.f20370k = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.v
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                androidx.compose.ui.platform.C1984x.c1(this.f20335a, z6);
            }
        };
        this.f20371l = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f20372m = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f20373n = new androidx.compose.ui.platform.C1984x.e();
        this.f20374o = Integer.MIN_VALUE;
        this.f20377r = new p170r.C(0, 1, null);
        this.f20378s = new p170r.C(0, 1, null);
        this.f20379t = new p170r.Z(0, 1, null);
        this.f20380u = new p170r.Z(0, 1, null);
        this.f20381v = -1;
        this.f20383x = new p170r.C7027b(0, 1, null);
        this.f20384y = Y8.m.b(1, null, null, 6, null);
        this.f20385z = true;
        this.f20350B = p170r.AbstractC7040o.a();
        this.f20351C = new p170r.D(0, 1, null);
        this.f20352D = new p170r.A(0, 1, null);
        this.f20353E = new p170r.A(0, 1, null);
        this.f20354F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f20355G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f20356H = new U0.t();
        this.f20357I = p170r.AbstractC7040o.b();
        this.f20358J = new androidx.compose.ui.platform.C1964o1(rVar.getSemanticsOwner().a(), p170r.AbstractC7040o.a());
        rVar.addOnAttachStateChangeListener(new androidx.compose.ui.platform.C1984x.a());
        this.f20360L = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.w
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.C1984x.E0(this.f20344C);
            }
        };
        this.f20361M = new java.util.ArrayList();
        this.f20362N = new androidx.compose.ui.platform.C1984x.o();
    }

    private static final boolean A0(K0.i iVar) {
        return (((java.lang.Number) iVar.c().b()).floatValue() < ((java.lang.Number) iVar.a().b()).floatValue() && !iVar.b()) || (((java.lang.Number) iVar.c().b()).floatValue() > 0.0f && iVar.b());
    }

    private final boolean B0(int i6, java.util.List list) {
        boolean z6;
        androidx.compose.ui.platform.C1961n1 c1961n1A = androidx.compose.ui.platform.AbstractC1970q1.a(list, i6);
        if (c1961n1A != null) {
            z6 = false;
        } else {
            c1961n1A = new androidx.compose.ui.platform.C1961n1(i6, this.f20361M, null, null, null, null);
            z6 = true;
        }
        this.f20361M.add(c1961n1A);
        return z6;
    }

    private final boolean C0(int i6) {
        if (!r0() || n0(i6)) {
            return false;
        }
        int i10 = this.f20374o;
        if (i10 != Integer.MIN_VALUE) {
            J0(this, i10, 65536, null, null, 12, null);
        }
        this.f20374o = i6;
        this.f20363d.invalidate();
        J0(this, i6, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(androidx.compose.ui.platform.C1961n1 c1961n1) {
        if (c1961n1.R()) {
            this.f20363d.getSnapshotObserver().i(c1961n1, this.f20362N, new androidx.compose.ui.platform.C1984x.n(c1961n1, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(androidx.compose.ui.platform.C1984x c1984x) {
        android.os.Trace.beginSection("measureAndLayout");
        try {
            F0.n0.c(c1984x.f20363d, false, 1, null);
            p087i7.M m6 = p087i7.M.f46721a;
            android.os.Trace.endSection();
            android.os.Trace.beginSection("checkForSemanticsChanges");
            try {
                c1984x.P();
                android.os.Trace.endSection();
                c1984x.f20359K = false;
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            android.os.Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F0(int i6) {
        if (i6 == this.f20363d.getSemanticsOwner().a().o()) {
            return -1;
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x008d A[LOOP:1: B:15:0x0054->B:27:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[EDGE_INSN: B:41:0x0090->B:28:0x0090 BREAK  A[LOOP:1: B:15:0x0054->B:27:0x008d], SYNTHETIC] */
    private final void G0(K0.o oVar, androidx.compose.ui.platform.C1964o1 c1964o1) {
        p170r.D dB = p170r.AbstractC7042q.b();
        java.util.List listT = oVar.t();
        int size = listT.size();
        for (int i6 = 0; i6 < size; i6++) {
            K0.o oVar2 = (K0.o) listT.get(i6);
            if (a0().a(oVar2.o())) {
                if (!c1964o1.a().a(oVar2.o())) {
                    s0(oVar.q());
                    return;
                }
                dB.f(oVar2.o());
            }
        }
        p170r.D dA = c1964o1.a();
        int[] iArr = dA.f53400b;
        long[] jArr = dA.f53399a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128 && !dB.a(iArr[(i10 << 3) + i12])) {
                            s0(oVar.q());
                            return;
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        java.util.List listT2 = oVar.t();
        int size2 = listT2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            K0.o oVar3 = (K0.o) listT2.get(i13);
            if (a0().a(oVar3.o())) {
                java.lang.Object objC = this.f20357I.c(oVar3.o());
                p247y7.AbstractC7350t.c(objC);
                G0(oVar3, (androidx.compose.ui.platform.C1964o1) objC);
            }
        }
    }

    private final boolean H0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!p0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f20376q = true;
        }
        try {
            return ((java.lang.Boolean) this.f20365f.l(accessibilityEvent)).booleanValue();
        } finally {
            this.f20376q = false;
        }
    }

    private final boolean I0(int i6, int i10, java.lang.Integer num, java.util.List list) {
        if (i6 == Integer.MIN_VALUE || !p0()) {
            return false;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventR = R(i6, i10);
        if (num != null) {
            accessibilityEventR.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventR.setContentDescription(p002a1.a.e(list, ",", null, null, 0, null, null, 62, null));
        }
        android.os.Trace.beginSection("sendEvent");
        try {
            return H0(accessibilityEventR);
        } finally {
            android.os.Trace.endSection();
        }
    }

    static /* synthetic */ boolean J0(androidx.compose.ui.platform.C1984x c1984x, int i6, int i10, java.lang.Integer num, java.util.List list, int i11, java.lang.Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            list = null;
        }
        return c1984x.I0(i6, i10, num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i6, C1.B b6, java.lang.String str, android.os.Bundle bundle) {
        K0.o oVarB;
        int iE;
        androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) a0().c(i6);
        if (c1967p1 == null || (oVarB = c1967p1.b()) == null) {
            return;
        }
        java.lang.String strI0 = i0(oVarB);
        if (p247y7.AbstractC7350t.b(str, this.f20354F)) {
            iE = this.f20352D.e(i6, -1);
            if (iE == -1) {
                return;
            }
        } else {
            if (!p247y7.AbstractC7350t.b(str, this.f20355G)) {
                if (!oVarB.w().f(K0.j.f5973a.i()) || bundle == null || !p247y7.AbstractC7350t.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    K0.k kVarW = oVarB.w();
                    K0.r rVar = K0.r.f6030a;
                    if (!kVarW.f(rVar.C()) || bundle == null || !p247y7.AbstractC7350t.b(str, "androidx.compose.ui.semantics.testTag")) {
                        if (p247y7.AbstractC7350t.b(str, "androidx.compose.ui.semantics.id")) {
                            b6.v().putInt(str, oVarB.o());
                            return;
                        }
                        return;
                    } else {
                        java.lang.String str2 = (java.lang.String) K0.l.a(oVarB.w(), rVar.C());
                        if (str2 != null) {
                            b6.v().putCharSequence(str, str2);
                            return;
                        }
                        return;
                    }
                }
                int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i11 > 0 && i10 >= 0) {
                    if (i10 < (strI0 != null ? strI0.length() : Integer.MAX_VALUE)) {
                        M0.K kE = androidx.compose.ui.platform.AbstractC1970q1.e(oVarB.w());
                        if (kE == null) {
                            return;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (int i12 = 0; i12 < i11; i12++) {
                            int i13 = i10 + i12;
                            arrayList.add(i13 >= kE.l().j().length() ? null : a1(oVarB, kE.d(i13)));
                        }
                        b6.v().putParcelableArray(str, (android.os.Parcelable[]) arrayList.toArray(new android.graphics.RectF[0]));
                        return;
                    }
                }
                return;
            }
            iE = this.f20353E.e(i6, -1);
            if (iE == -1) {
                return;
            }
        }
        b6.v().putInt(str, iE);
    }

    private final void K0(int i6, int i10, java.lang.String str) {
        android.view.accessibility.AccessibilityEvent accessibilityEventR = R(F0(i6), 32);
        accessibilityEventR.setContentChangeTypes(i10);
        if (str != null) {
            accessibilityEventR.getText().add(str);
        }
        H0(accessibilityEventR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect L(androidx.compose.ui.platform.C1967p1 c1967p1) {
        android.graphics.Rect rectA = c1967p1.a();
        long j6 = this.f20363d.j(p131n0.h.a(rectA.left, rectA.top));
        long j10 = this.f20363d.j(p131n0.h.a(rectA.right, rectA.bottom));
        return new android.graphics.Rect((int) java.lang.Math.floor(p131n0.g.m(j6)), (int) java.lang.Math.floor(p131n0.g.n(j6)), (int) java.lang.Math.ceil(p131n0.g.m(j10)), (int) java.lang.Math.ceil(p131n0.g.n(j10)));
    }

    private final void L0(int i6) {
        androidx.compose.ui.platform.C1984x.g gVar = this.f20349A;
        if (gVar != null) {
            if (i6 != gVar.d().o()) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                android.view.accessibility.AccessibilityEvent accessibilityEventR = R(F0(gVar.d().o()), 131072);
                accessibilityEventR.setFromIndex(gVar.b());
                accessibilityEventR.setToIndex(gVar.e());
                accessibilityEventR.setAction(gVar.a());
                accessibilityEventR.setMovementGranularity(gVar.c());
                accessibilityEventR.getText().add(i0(gVar.d()));
                H0(accessibilityEventR);
            }
        }
        this.f20349A = null;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0586  */
    /* JADX WARN: Code duplicated, block: B:181:0x061e  */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void M0(p170r.AbstractC7039n r37) {
        /*
            Method dump skipped, instruction units count: 1639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1984x.M0(r.n):void");
    }

    private final void N0(F0.J j6, p170r.D d6) {
        K0.k kVarI;
        F0.J j10;
        if (j6.K0() && !this.f20363d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j6)) {
            if (!j6.k0().q(F0.AbstractC0918f0.a(8))) {
                j6 = androidx.compose.ui.platform.A.j(j6, androidx.compose.ui.platform.C1984x.q.f20412D);
            }
            if (j6 == null || (kVarI = j6.I()) == null) {
                return;
            }
            if (!kVarI.M() && (j10 = androidx.compose.ui.platform.A.j(j6, androidx.compose.ui.platform.C1984x.p.f20411D)) != null) {
                j6 = j10;
            }
            int iQ0 = j6.q0();
            if (d6.f(iQ0)) {
                J0(this, F0(iQ0), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    private final boolean O(p170r.AbstractC7039n abstractC7039n, boolean z6, int i6, long j6) {
        K0.v vVarK;
        boolean z10;
        K0.i iVar;
        if (p131n0.g.j(j6, p131n0.g.f51312b.b()) || !p131n0.g.p(j6)) {
            return false;
        }
        if (z6) {
            vVarK = K0.r.f6030a.I();
        } else {
            if (z6) {
                throw new p087i7.s();
            }
            vVarK = K0.r.f6030a.k();
        }
        java.lang.Object[] objArr = abstractC7039n.f53395c;
        long[] jArr = abstractC7039n.f53393a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            boolean z11 = false;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j10 & 255) < 128) {
                            androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) objArr[(i10 << 3) + i12];
                            if (p141o0.X1.e(c1967p1.a()).b(j6) && (iVar = (K0.i) K0.l.a(c1967p1.b().w(), vVarK)) != null) {
                                int i13 = iVar.b() ? -i6 : i6;
                                if (i6 == 0 && iVar.b()) {
                                    i13 = -1;
                                }
                                if (i13 < 0) {
                                    if (((java.lang.Number) iVar.c().b()).floatValue() > 0.0f) {
                                        z11 = true;
                                    }
                                } else if (((java.lang.Number) iVar.c().b()).floatValue() < ((java.lang.Number) iVar.a().b()).floatValue()) {
                                    z11 = true;
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return z11;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    z10 = z11;
                }
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    private final void O0(F0.J j6) {
        if (j6.K0() && !this.f20363d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j6)) {
            int iQ0 = j6.q0();
            K0.i iVar = (K0.i) this.f20377r.c(iQ0);
            K0.i iVar2 = (K0.i) this.f20378s.c(iQ0);
            if (iVar == null && iVar2 == null) {
                return;
            }
            android.view.accessibility.AccessibilityEvent accessibilityEventR = R(iQ0, 4096);
            if (iVar != null) {
                accessibilityEventR.setScrollX((int) ((java.lang.Number) iVar.c().b()).floatValue());
                accessibilityEventR.setMaxScrollX((int) ((java.lang.Number) iVar.a().b()).floatValue());
            }
            if (iVar2 != null) {
                accessibilityEventR.setScrollY((int) ((java.lang.Number) iVar2.c().b()).floatValue());
                accessibilityEventR.setMaxScrollY((int) ((java.lang.Number) iVar2.a().b()).floatValue());
            }
            H0(accessibilityEventR);
        }
    }

    private final void P() {
        android.os.Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p0()) {
                G0(this.f20363d.getSemanticsOwner().a(), this.f20358J);
            }
            p087i7.M m6 = p087i7.M.f46721a;
            android.os.Trace.endSection();
            android.os.Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                M0(a0());
                android.os.Trace.endSection();
                android.os.Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    g1();
                } finally {
                    android.os.Trace.endSection();
                }
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            android.os.Trace.endSection();
            throw th2;
        }
    }

    private final boolean P0(K0.o oVar, int i6, int i10, boolean z6) {
        java.lang.String strI0;
        K0.k kVarW = oVar.w();
        K0.j jVar = K0.j.f5973a;
        if (kVarW.f(jVar.x()) && androidx.compose.ui.platform.A.h(oVar)) {
            p237x7.q qVar = (p237x7.q) ((K0.a) oVar.w().s(jVar.x())).a();
            if (qVar != null) {
                return ((java.lang.Boolean) qVar.j(java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10), java.lang.Boolean.valueOf(z6))).booleanValue();
            }
            return false;
        }
        if ((i6 == i10 && i10 == this.f20381v) || (strI0 = i0(oVar)) == null) {
            return false;
        }
        if (i6 < 0 || i6 != i10 || i10 > strI0.length()) {
            i6 = -1;
        }
        this.f20381v = i6;
        boolean z10 = strI0.length() > 0;
        H0(U(F0(oVar.o()), z10 ? java.lang.Integer.valueOf(this.f20381v) : null, z10 ? java.lang.Integer.valueOf(this.f20381v) : null, z10 ? java.lang.Integer.valueOf(strI0.length()) : null, strI0));
        L0(oVar.o());
        return true;
    }

    private final boolean Q(int i6) {
        if (!n0(i6)) {
            return false;
        }
        this.f20374o = Integer.MIN_VALUE;
        this.f20375p = null;
        this.f20363d.invalidate();
        J0(this, i6, 65536, null, null, 12, null);
        return true;
    }

    private final void Q0(K0.o oVar, C1.B b6) {
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        if (kVarW.f(rVar.h())) {
            b6.r0(true);
            b6.u0((java.lang.CharSequence) K0.l.a(oVar.w(), rVar.h()));
        }
    }

    private final android.view.accessibility.AccessibilityEvent R(int i6, int i10) {
        androidx.compose.ui.platform.C1967p1 c1967p1;
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i10);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f20363d.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f20363d, i6);
        if (p0() && (c1967p1 = (androidx.compose.ui.platform.C1967p1) a0().c(i6)) != null) {
            accessibilityEventObtain.setPassword(c1967p1.b().w().f(K0.r.f6030a.w()));
        }
        return accessibilityEventObtain;
    }

    private final void R0(K0.o oVar, C1.B b6) {
        b6.k0(f0(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final C1.B S(int i6) {
        androidx.lifecycle.r rVarA;
        androidx.lifecycle.AbstractC2079k abstractC2079kU;
        androidx.compose.ui.platform.r.b viewTreeOwners = this.f20363d.getViewTreeOwners();
        if (((viewTreeOwners == null || (rVarA = viewTreeOwners.a()) == null || (abstractC2079kU = rVarA.u()) == null) ? null : abstractC2079kU.b()) == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
            return null;
        }
        C1.B bZ = C1.B.Z();
        androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) a0().c(i6);
        if (c1967p1 == null) {
            return null;
        }
        K0.o oVarB = c1967p1.b();
        if (i6 == -1) {
            android.view.ViewParent parentForAccessibility = this.f20363d.getParentForAccessibility();
            bZ.H0(parentForAccessibility instanceof android.view.View ? (android.view.View) parentForAccessibility : null);
        } else {
            K0.o oVarR = oVarB.r();
            java.lang.Integer numValueOf = oVarR != null ? java.lang.Integer.valueOf(oVarR.o()) : null;
            if (numValueOf == null) {
                C0.a.c("semanticsNode " + i6 + " has null parent");
                throw new p087i7.C6665k();
            }
            int iIntValue = numValueOf.intValue();
            bZ.I0(this.f20363d, iIntValue != this.f20363d.getSemanticsOwner().a().o() ? iIntValue : -1);
        }
        bZ.Q0(this.f20363d, i6);
        bZ.j0(L(c1967p1));
        y0(i6, bZ, oVarB);
        return bZ;
    }

    private final java.lang.String T(K0.o oVar) {
        java.util.Collection collection;
        java.lang.CharSequence charSequence;
        K0.k kVarN = oVar.a().n();
        K0.r rVar = K0.r.f6030a;
        java.util.Collection collection2 = (java.util.Collection) K0.l.a(kVarN, rVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (java.util.Collection) K0.l.a(kVarN, rVar.D())) == null || collection.isEmpty()) && ((charSequence = (java.lang.CharSequence) K0.l.a(kVarN, rVar.g())) == null || charSequence.length() == 0))) {
            return this.f20363d.getContext().getResources().getString(p071h0.m.f45849g);
        }
        return null;
    }

    private final void T0(K0.o oVar, C1.B b6) {
        b6.R0(g0(oVar));
    }

    private final android.view.accessibility.AccessibilityEvent U(int i6, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.CharSequence charSequence) {
        android.view.accessibility.AccessibilityEvent accessibilityEventR = R(i6, 8192);
        if (num != null) {
            accessibilityEventR.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventR.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventR.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventR.getText().add(charSequence);
        }
        return accessibilityEventR;
    }

    private final void U0(K0.o oVar, C1.B b6) {
        M0.C1332d c1332dH0 = h0(oVar);
        b6.S0(c1332dH0 != null ? b1(c1332dH0) : null);
    }

    private final void V0() {
        this.f20352D.i();
        this.f20353E.i();
        androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) a0().c(-1);
        K0.o oVarB = c1967p1 != null ? c1967p1.b() : null;
        p247y7.AbstractC7350t.c(oVarB);
        java.util.List listZ0 = Z0(androidx.compose.ui.platform.A.k(oVarB), p097j7.AbstractC6879v.s(oVarB));
        int iO = p097j7.AbstractC6879v.o(listZ0);
        if (1 > iO) {
            return;
        }
        int i6 = 1;
        while (true) {
            int iO2 = ((K0.o) listZ0.get(i6 - 1)).o();
            int iO3 = ((K0.o) listZ0.get(i6)).o();
            this.f20352D.q(iO2, iO3);
            this.f20353E.q(iO3, iO2);
            if (i6 == iO) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(androidx.compose.ui.platform.C1984x c1984x, boolean z6) {
        c1984x.f20371l = z6 ? c1984x.f20366g.getEnabledAccessibilityServiceList(-1) : p097j7.AbstractC6879v.m();
    }

    private final java.util.List W0(boolean z6, java.util.ArrayList arrayList, p170r.C c6) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int iO = p097j7.AbstractC6879v.o(arrayList);
        int size = 0;
        if (iO >= 0) {
            int i6 = 0;
            while (true) {
                K0.o oVar = (K0.o) arrayList.get(i6);
                if (i6 == 0 || !Y0(arrayList2, oVar)) {
                    arrayList2.add(new p087i7.u(oVar.j(), p097j7.AbstractC6879v.s(oVar)));
                }
                if (i6 == iO) {
                    break;
                }
                i6++;
            }
        }
        p097j7.AbstractC6879v.B(arrayList2, androidx.compose.ui.platform.C1984x.i.f20398C);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p087i7.u uVar = (p087i7.u) arrayList2.get(i10);
            p097j7.AbstractC6879v.B((java.util.List) uVar.d(), new androidx.compose.ui.platform.C1988z(new androidx.compose.ui.platform.C1986y(z6 ? androidx.compose.ui.platform.C1984x.h.f20397C : androidx.compose.ui.platform.C1984x.f.f20390C, F0.J.f2334n0.b())));
            arrayList3.addAll((java.util.Collection) uVar.d());
        }
        final androidx.compose.ui.platform.C1984x.r rVar = androidx.compose.ui.platform.C1984x.r.f20413D;
        p097j7.AbstractC6879v.B(arrayList3, new java.util.Comparator() { // from class: androidx.compose.ui.platform.t
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.ui.platform.C1984x.X0(rVar, obj, obj2);
            }
        });
        while (size <= p097j7.AbstractC6879v.o(arrayList3)) {
            java.util.List list = (java.util.List) c6.c(((K0.o) arrayList3.get(size)).o());
            if (list != null) {
                if (q0((K0.o) arrayList3.get(size))) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    private final void X(K0.o oVar, java.util.ArrayList arrayList, p170r.C c6) {
        boolean zK = androidx.compose.ui.platform.A.k(oVar);
        boolean zBooleanValue = ((java.lang.Boolean) oVar.w().C(K0.r.f6030a.s(), androidx.compose.ui.platform.C1984x.l.f20406D)).booleanValue();
        if ((zBooleanValue || q0(oVar)) && a0().b(oVar.o())) {
            arrayList.add(oVar);
        }
        if (zBooleanValue) {
            c6.s(oVar.o(), Z0(zK, p097j7.AbstractC6879v.W0(oVar.k())));
            return;
        }
        java.util.List listK = oVar.k();
        int size = listK.size();
        for (int i6 = 0; i6 < size; i6++) {
            X((K0.o) listK.get(i6), arrayList, c6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X0(p237x7.p pVar, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) pVar.u(obj, obj2)).intValue();
    }

    private final int Y(K0.o oVar) {
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        return (kVarW.f(rVar.d()) || !oVar.w().f(rVar.E())) ? this.f20381v : M0.N.i(((M0.N) oVar.w().s(rVar.E())).r());
    }

    private static final boolean Y0(java.util.ArrayList arrayList, K0.o oVar) {
        float fL = oVar.j().l();
        float fE = oVar.j().e();
        boolean z6 = fL >= fE;
        int iO = p097j7.AbstractC6879v.o(arrayList);
        if (iO >= 0) {
            int i6 = 0;
            while (true) {
                p131n0.i iVar = (p131n0.i) ((p087i7.u) arrayList.get(i6)).c();
                boolean z10 = iVar.l() >= iVar.e();
                if (!z6 && !z10 && java.lang.Math.max(fL, iVar.l()) < java.lang.Math.min(fE, iVar.e())) {
                    arrayList.set(i6, new p087i7.u(iVar.o(0.0f, fL, Float.POSITIVE_INFINITY, fE), ((p087i7.u) arrayList.get(i6)).d()));
                    ((java.util.List) ((p087i7.u) arrayList.get(i6)).d()).add(oVar);
                    return true;
                }
                if (i6 != iO) {
                    i6++;
                }
            }
        }
        return false;
    }

    private final int Z(K0.o oVar) {
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        return (kVarW.f(rVar.d()) || !oVar.w().f(rVar.E())) ? this.f20381v : M0.N.n(((M0.N) oVar.w().s(rVar.E())).r());
    }

    private final java.util.List Z0(boolean z6, java.util.List list) {
        p170r.C cB = p170r.AbstractC7040o.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            X((K0.o) list.get(i6), arrayList, cB);
        }
        return W0(z6, arrayList, cB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p170r.AbstractC7039n a0() {
        if (this.f20385z) {
            this.f20385z = false;
            this.f20350B = androidx.compose.ui.platform.AbstractC1970q1.b(this.f20363d.getSemanticsOwner());
            if (p0()) {
                V0();
            }
        }
        return this.f20350B;
    }

    private final android.graphics.RectF a1(K0.o oVar, p131n0.i iVar) {
        if (oVar == null) {
            return null;
        }
        p131n0.i iVarT = iVar.t(oVar.s());
        p131n0.i iVarI = oVar.i();
        p131n0.i iVarP = iVarT.r(iVarI) ? iVarT.p(iVarI) : null;
        if (iVarP == null) {
            return null;
        }
        long j6 = this.f20363d.j(p131n0.h.a(iVarP.i(), iVarP.l()));
        long j10 = this.f20363d.j(p131n0.h.a(iVarP.j(), iVarP.e()));
        return new android.graphics.RectF(p131n0.g.m(j6), p131n0.g.n(j6), p131n0.g.m(j10), p131n0.g.n(j10));
    }

    private final android.text.SpannableString b1(M0.C1332d c1332d) {
        return (android.text.SpannableString) e1(U0.a.b(c1332d, this.f20363d.getDensity(), this.f20363d.getFontFamilyResolver(), this.f20356H), 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(androidx.compose.ui.platform.C1984x c1984x, boolean z6) {
        c1984x.f20371l = c1984x.f20366g.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean d1(K0.o oVar, int i6, boolean z6, boolean z10) {
        int iZ;
        int i10;
        int iO = oVar.o();
        java.lang.Integer num = this.f20382w;
        if (num == null || iO != num.intValue()) {
            this.f20381v = -1;
            this.f20382w = java.lang.Integer.valueOf(oVar.o());
        }
        java.lang.String strI0 = i0(oVar);
        boolean z11 = false;
        if (strI0 != null && strI0.length() != 0) {
            androidx.compose.ui.platform.InterfaceC1938g interfaceC1938gJ0 = j0(oVar, i6);
            if (interfaceC1938gJ0 == null) {
                return false;
            }
            int iY = Y(oVar);
            if (iY == -1) {
                iY = z6 ? 0 : strI0.length();
            }
            int[] iArrA = z6 ? interfaceC1938gJ0.a(iY) : interfaceC1938gJ0.b(iY);
            if (iArrA == null) {
                return false;
            }
            int i11 = iArrA[0];
            z11 = true;
            int i12 = iArrA[1];
            if (z10 && o0(oVar)) {
                iZ = Z(oVar);
                if (iZ == -1) {
                    iZ = z6 ? i11 : i12;
                }
                i10 = z6 ? i12 : i11;
            } else {
                iZ = z6 ? i12 : i11;
                i10 = iZ;
            }
            this.f20349A = new androidx.compose.ui.platform.C1984x.g(oVar, z6 ? 256 : 512, i6, i11, i12, android.os.SystemClock.uptimeMillis());
            P0(oVar, iZ, i10, true);
        }
        return z11;
    }

    private final java.lang.CharSequence e1(java.lang.CharSequence charSequence, int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("size should be greater than 0".toString());
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i6) {
            return charSequence;
        }
        int i10 = i6 - 1;
        if (java.lang.Character.isHighSurrogate(charSequence.charAt(i10)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i6))) {
            i6 = i10;
        }
        java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(0, i6);
        p247y7.AbstractC7350t.d(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    private final boolean f0(K0.o oVar) {
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        L0.a aVar = (L0.a) K0.l.a(kVarW, rVar.G());
        K0.h hVar = (K0.h) K0.l.a(oVar.w(), rVar.y());
        boolean z6 = aVar != null;
        if (((java.lang.Boolean) K0.l.a(oVar.w(), rVar.A())) != null) {
            return hVar != null ? K0.h.k(hVar.n(), K0.h.f5956b.g()) : false ? z6 : true;
        }
        return z6;
    }

    private final void f1(int i6) {
        int i10 = this.f20364e;
        if (i10 == i6) {
            return;
        }
        this.f20364e = i6;
        J0(this, i6, 128, null, null, 12, null);
        J0(this, i10, 256, null, null, 12, null);
    }

    private final java.lang.String g0(K0.o oVar) {
        int iK;
        android.content.res.Resources resources;
        int i6;
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        java.lang.Object objA = K0.l.a(kVarW, rVar.B());
        L0.a aVar = (L0.a) K0.l.a(oVar.w(), rVar.G());
        K0.h hVar = (K0.h) K0.l.a(oVar.w(), rVar.y());
        if (aVar != null) {
            int i10 = androidx.compose.ui.platform.C1984x.j.f20399a[aVar.ordinal()];
            if (i10 == 1) {
                if ((hVar == null ? false : K0.h.k(hVar.n(), K0.h.f5956b.f())) && objA == null) {
                    resources = this.f20363d.getContext().getResources();
                    i6 = p071h0.m.f45851i;
                    objA = resources.getString(i6);
                }
            } else if (i10 == 2) {
                if ((hVar == null ? false : K0.h.k(hVar.n(), K0.h.f5956b.f())) && objA == null) {
                    resources = this.f20363d.getContext().getResources();
                    i6 = p071h0.m.f45850h;
                    objA = resources.getString(i6);
                }
            } else if (i10 == 3 && objA == null) {
                resources = this.f20363d.getContext().getResources();
                i6 = p071h0.m.f45846d;
                objA = resources.getString(i6);
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) K0.l.a(oVar.w(), rVar.A());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(hVar == null ? false : K0.h.k(hVar.n(), K0.h.f5956b.g())) && objA == null) {
                objA = this.f20363d.getContext().getResources().getString(zBooleanValue ? p071h0.m.f45848f : p071h0.m.f45847e);
            }
        }
        K0.g gVar = (K0.g) K0.l.a(oVar.w(), rVar.x());
        if (gVar != null) {
            if (gVar != K0.g.f5951d.a()) {
                if (objA == null) {
                    E7.e eVarC = gVar.c();
                    float fB = ((((java.lang.Number) eVarC.e()).floatValue() - ((java.lang.Number) eVarC.d()).floatValue()) > 0.0f ? 1 : ((((java.lang.Number) eVarC.e()).floatValue() - ((java.lang.Number) eVarC.d()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (gVar.b() - ((java.lang.Number) eVarC.d()).floatValue()) / (((java.lang.Number) eVarC.e()).floatValue() - ((java.lang.Number) eVarC.d()).floatValue());
                    if (fB < 0.0f) {
                        fB = 0.0f;
                    }
                    if (fB > 1.0f) {
                        fB = 1.0f;
                    }
                    if (fB == 0.0f) {
                        iK = 0;
                    } else {
                        iK = 100;
                        if (!(fB == 1.0f)) {
                            iK = E7.j.k(java.lang.Math.round(fB * 100), 1, 99);
                        }
                    }
                    objA = this.f20363d.getContext().getResources().getString(p071h0.m.f45854l, java.lang.Integer.valueOf(iK));
                }
            } else if (objA == null) {
                objA = this.f20363d.getContext().getResources().getString(p071h0.m.f45845c);
            }
        }
        if (oVar.w().f(rVar.g())) {
            objA = T(oVar);
        }
        return (java.lang.String) objA;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:0: B:5:0x0024->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7 A[EDGE_INSN: B:54:0x00a7->B:29:0x00a7 BREAK  A[LOOP:0: B:5:0x0024->B:28:0x009c], SYNTHETIC] */
    private final void g1() {
        K0.k kVarB;
        p170r.D d6 = new p170r.D(0, 1, null);
        p170r.D d10 = this.f20351C;
        int[] iArr = d10.f53400b;
        long[] jArr = d10.f53399a;
        int length = jArr.length - 2;
        long j6 = 128;
        long j10 = 255;
        char c6 = 7;
        long j11 = -9187201950435737472L;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j12 = jArr[i6];
                long[] jArr2 = jArr;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                    jArr = jArr2;
                    j6 = 128;
                    j10 = 255;
                } else {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j12 & j10) < j6) {
                            int i12 = iArr[(i6 << 3) + i11];
                            androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) a0().c(i12);
                            K0.o oVarB = c1967p1 != null ? c1967p1.b() : null;
                            if (oVarB == null || !oVarB.w().f(K0.r.f6030a.v())) {
                                d6.f(i12);
                                androidx.compose.ui.platform.C1964o1 c1964o1 = (androidx.compose.ui.platform.C1964o1) this.f20357I.c(i12);
                                K0(i12, 32, (c1964o1 == null || (kVarB = c1964o1.b()) == null) ? null : (java.lang.String) K0.l.a(kVarB, K0.r.f6030a.v()));
                            }
                        }
                        j12 >>= 8;
                        i11++;
                        j6 = 128;
                        j10 = 255;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i6 != length) {
                        break;
                    }
                    i6++;
                    jArr = jArr2;
                    j6 = 128;
                    j10 = 255;
                }
            }
        }
        this.f20351C.r(d6);
        this.f20357I.i();
        p170r.AbstractC7039n abstractC7039nA0 = a0();
        int[] iArr2 = abstractC7039nA0.f53394b;
        java.lang.Object[] objArr = abstractC7039nA0.f53395c;
        long[] jArr3 = abstractC7039nA0.f53393a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr3[i13];
                if ((((~j13) << c6) & j13 & j11) != j11) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j13 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            int i17 = iArr2[i16];
                            androidx.compose.ui.platform.C1967p1 c1967p2 = (androidx.compose.ui.platform.C1967p1) objArr[i16];
                            K0.k kVarW = c1967p2.b().w();
                            K0.r rVar = K0.r.f6030a;
                            if (kVarW.f(rVar.v()) && this.f20351C.f(i17)) {
                                K0(i17, 16, (java.lang.String) c1967p2.b().w().s(rVar.v()));
                            }
                            this.f20357I.s(i17, new androidx.compose.ui.platform.C1964o1(c1967p2.b(), a0()));
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                }
                i13++;
                c6 = 7;
                j11 = -9187201950435737472L;
            }
        }
        this.f20358J = new androidx.compose.ui.platform.C1964o1(this.f20363d.getSemanticsOwner().a(), a0());
    }

    private final M0.C1332d h0(K0.o oVar) {
        M0.C1332d c1332dK0 = k0(oVar.w());
        java.util.List list = (java.util.List) K0.l.a(oVar.w(), K0.r.f6030a.D());
        return c1332dK0 == null ? list != null ? (M0.C1332d) p097j7.AbstractC6879v.k0(list) : null : c1332dK0;
    }

    private final java.lang.String i0(K0.o oVar) {
        M0.C1332d c1332d;
        if (oVar == null) {
            return null;
        }
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        if (kVarW.f(rVar.d())) {
            return p002a1.a.e((java.util.List) oVar.w().s(rVar.d()), ",", null, null, 0, null, null, 62, null);
        }
        boolean zF = oVar.w().f(rVar.g());
        K0.k kVarW2 = oVar.w();
        if (zF) {
            M0.C1332d c1332dK0 = k0(kVarW2);
            if (c1332dK0 != null) {
                return c1332dK0.i();
            }
            return null;
        }
        java.util.List list = (java.util.List) K0.l.a(kVarW2, rVar.D());
        if (list == null || (c1332d = (M0.C1332d) p097j7.AbstractC6879v.k0(list)) == null) {
            return null;
        }
        return c1332d.i();
    }

    private final androidx.compose.ui.platform.InterfaceC1938g j0(K0.o oVar, int i6) {
        java.lang.String strI0;
        androidx.compose.ui.platform.AbstractC1923b abstractC1923bA;
        M0.K kE;
        if (oVar == null || (strI0 = i0(oVar)) == null || strI0.length() == 0) {
            return null;
        }
        if (i6 == 1) {
            abstractC1923bA = androidx.compose.ui.platform.C1926c.f20084d.a(this.f20363d.getContext().getResources().getConfiguration().locale);
        } else {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 == 8) {
                        abstractC1923bA = androidx.compose.ui.platform.C1935f.f20107c.a();
                    } else if (i6 != 16) {
                        return null;
                    }
                }
                if (!oVar.w().f(K0.j.f5973a.i()) || (kE = androidx.compose.ui.platform.AbstractC1970q1.e(oVar.w())) == null) {
                    return null;
                }
                if (i6 == 4) {
                    androidx.compose.ui.platform.C1929d c1929dA = androidx.compose.ui.platform.C1929d.f20092d.a();
                    c1929dA.j(strI0, kE);
                    return c1929dA;
                }
                androidx.compose.ui.platform.C1932e c1932eA = androidx.compose.ui.platform.C1932e.f20098f.a();
                c1932eA.j(strI0, kE, oVar);
                return c1932eA;
            }
            abstractC1923bA = androidx.compose.ui.platform.C1941h.f20112d.a(this.f20363d.getContext().getResources().getConfiguration().locale);
        }
        abstractC1923bA.e(strI0);
        return abstractC1923bA;
    }

    private final M0.C1332d k0(K0.k kVar) {
        return (M0.C1332d) K0.l.a(kVar, K0.r.f6030a.g());
    }

    private final boolean n0(int i6) {
        return this.f20374o == i6;
    }

    private final boolean o0(K0.o oVar) {
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        return !kVarW.f(rVar.d()) && oVar.w().f(rVar.g());
    }

    private final boolean q0(K0.o oVar) {
        java.util.List list = (java.util.List) K0.l.a(oVar.w(), K0.r.f6030a.d());
        boolean z6 = ((list != null ? (java.lang.String) p097j7.AbstractC6879v.k0(list) : null) == null && h0(oVar) == null && g0(oVar) == null && !f0(oVar)) ? false : true;
        if (androidx.compose.ui.platform.AbstractC1970q1.g(oVar)) {
            if (oVar.w().M()) {
                return true;
            }
            if (oVar.A() && z6) {
                return true;
            }
        }
        return false;
    }

    private final boolean r0() {
        return this.f20367h || (this.f20366g.isEnabled() && this.f20366g.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(F0.J j6) {
        if (this.f20383x.add(j6)) {
            this.f20384y.j(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x01bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a A[PHI: r0 r1
  0x019a: PHI (r0v158 K0.o) = (r0v157 K0.o), (r0v146 K0.o) binds: [B:97:0x01b7, B:88:0x0198] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r1v68 K0.k) = (r1v67 K0.k), (r1v71 K0.k) binds: [B:97:0x01b7, B:88:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7 A[PHI: r0
  0x01a7: PHI (r0v147 K0.o) = (r0v146 K0.o), (r0v157 K0.o), (r0v157 K0.o), (r0v146 K0.o) binds: [B:86:0x0192, B:95:0x01b1, B:97:0x01b7, B:88:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01a7 -> B:91:0x01a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01b7 -> B:89:0x019a). Please report as a decompilation issue!!! */
    public final boolean v0(int i6, int i10, android.os.Bundle bundle) {
        K0.o oVarB;
        p237x7.a aVar;
        p237x7.a aVar2;
        p237x7.a aVar3;
        p237x7.a aVar4;
        K0.k kVarW;
        K0.v vVarQ;
        p237x7.a aVar5;
        java.lang.Object objB;
        K0.k kVarW2;
        K0.v vVarO;
        p237x7.a aVar6;
        java.lang.Object objB2;
        p237x7.a aVar7;
        p237x7.a aVar8;
        p237x7.a aVar9;
        p237x7.a aVar10;
        p237x7.a aVar11;
        p237x7.l lVar;
        K0.a aVar12;
        D0.InterfaceC0900t interfaceC0900tB0;
        long jC;
        K0.i iVar;
        K0.i iVar2;
        float fX0;
        float fX1;
        p237x7.p pVar;
        K0.k kVarW3;
        K0.a aVar13;
        p237x7.l lVar2;
        p237x7.a aVar14;
        p237x7.a aVar15;
        p237x7.a aVar16;
        p237x7.a aVar17;
        p237x7.a aVar18;
        java.lang.CharSequence charSequence;
        java.util.List list;
        androidx.compose.ui.platform.C1967p1 c1967p1 = (androidx.compose.ui.platform.C1967p1) a0().c(i6);
        if (c1967p1 == null || (oVarB = c1967p1.b()) == null) {
            return false;
        }
        if (i10 == 64) {
            return C0(i6);
        }
        if (i10 == 128) {
            return Q(i6);
        }
        if (i10 == 256 || i10 == 512) {
            if (bundle != null) {
                return d1(oVarB, bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), i10 == 256, bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
            }
            return false;
        }
        if (i10 == 16384) {
            K0.a aVar19 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.c());
            if (aVar19 == null || (aVar = (p237x7.a) aVar19.a()) == null) {
                return false;
            }
            return ((java.lang.Boolean) aVar.b()).booleanValue();
        }
        if (i10 == 131072) {
            boolean zP0 = P0(oVarB, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zP0) {
                J0(this, F0(oVarB.o()), 0, null, null, 12, null);
            }
            return zP0;
        }
        if (!androidx.compose.ui.platform.A.h(oVarB)) {
            return false;
        }
        if (i10 == 1) {
            K0.a aVar20 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.s());
            if (aVar20 == null || (aVar2 = (p237x7.a) aVar20.a()) == null) {
                return false;
            }
            return ((java.lang.Boolean) aVar2.b()).booleanValue();
        }
        if (i10 == 2) {
            if (!p247y7.AbstractC7350t.b(K0.l.a(oVarB.w(), K0.r.f6030a.i()), java.lang.Boolean.TRUE)) {
                return false;
            }
            this.f20363d.getFocusOwner().e(false, true, true, androidx.compose.ui.focus.d.f19669b.c());
            return true;
        }
        java.lang.Object string = null;
        switch (i10) {
            case 16:
                K0.a aVar21 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.k());
                if (aVar21 != null && (aVar3 = (p237x7.a) aVar21.a()) != null) {
                    string = (java.lang.Boolean) aVar3.b();
                }
                java.lang.Boolean bool = string;
                J0(this, i6, 1, null, null, 12, null);
                if (bool != 0) {
                    return bool.booleanValue();
                }
                return false;
            case 32:
                K0.a aVar22 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.m());
                if (aVar22 == null || (aVar4 = (p237x7.a) aVar22.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar4.b()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                K0.a aVar23 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.r());
                if (aVar23 == null || (aVar7 = (p237x7.a) aVar23.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar7.b()).booleanValue();
            case 65536:
                K0.a aVar24 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.e());
                if (aVar24 == null || (aVar8 = (p237x7.a) aVar24.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar8.b()).booleanValue();
            case 262144:
                K0.a aVar25 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.g());
                if (aVar25 == null || (aVar9 = (p237x7.a) aVar25.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar9.b()).booleanValue();
            case 524288:
                K0.a aVar26 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.b());
                if (aVar26 == null || (aVar10 = (p237x7.a) aVar26.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar10.b()).booleanValue();
            case 1048576:
                K0.a aVar27 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.f());
                if (aVar27 == null || (aVar11 = (p237x7.a) aVar27.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar11.b()).booleanValue();
            case 2097152:
                string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                K0.a aVar28 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.y());
                if (aVar28 == null || (lVar = (p237x7.l) aVar28.a()) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((java.lang.Boolean) lVar.l(new M0.C1332d(string, null, null, 6, null))).booleanValue();
            case android.R.id.accessibilityActionShowOnScreen:
                K0.o oVarR = oVarB.r();
                if (oVarR == null || (kVarW3 = oVarR.w()) == null) {
                    aVar12 = null;
                } else {
                    aVar12 = (K0.a) K0.l.a(kVarW3, K0.j.f5973a.t());
                }
                if (oVarR != null || aVar12 != null) {
                    if (oVarR == null) {
                        return false;
                    }
                    p131n0.i iVarA = D0.AbstractC0901u.a(oVarR.p().l());
                    interfaceC0900tB0 = oVarR.p().l().b0();
                    if (interfaceC0900tB0 != null) {
                        jC = D0.AbstractC0901u.e(interfaceC0900tB0);
                    } else {
                        jC = p131n0.g.f51312b.c();
                    }
                    p131n0.i iVarT = iVarA.t(jC);
                    p131n0.i iVarB = p131n0.j.b(oVarB.s(), Y0.u.d(oVarB.u()));
                    K0.k kVarW4 = oVarR.w();
                    K0.r rVar = K0.r.f6030a;
                    iVar = (K0.i) K0.l.a(kVarW4, rVar.k());
                    iVar2 = (K0.i) K0.l.a(oVarR.w(), rVar.I());
                    fX0 = x0(iVarB.i() - iVarT.i(), iVarB.j() - iVarT.j());
                    if (iVar != null && iVar.b()) {
                        fX0 = -fX0;
                    }
                    if (androidx.compose.ui.platform.A.k(oVarB)) {
                        fX0 = -fX0;
                    }
                    fX1 = x0(iVarB.l() - iVarT.l(), iVarB.e() - iVarT.e());
                    if (iVar2 != null && iVar2.b()) {
                        fX1 = -fX1;
                    }
                    if (aVar12 == null && (pVar = (p237x7.p) aVar12.a()) != null) {
                        return ((java.lang.Boolean) pVar.u(java.lang.Float.valueOf(fX0), java.lang.Float.valueOf(fX1))).booleanValue();
                    }
                }
                oVarR = oVarR.r();
                if (oVarR == null || (kVarW3 = oVarR.w()) == null) {
                    aVar12 = null;
                } else {
                    aVar12 = (K0.a) K0.l.a(kVarW3, K0.j.f5973a.t());
                }
                if (oVarR != null) {
                }
                if (oVarR == null) {
                    return false;
                }
                p131n0.i iVarA2 = D0.AbstractC0901u.a(oVarR.p().l());
                interfaceC0900tB0 = oVarR.p().l().b0();
                if (interfaceC0900tB0 != null) {
                    jC = D0.AbstractC0901u.e(interfaceC0900tB0);
                } else {
                    jC = p131n0.g.f51312b.c();
                }
                p131n0.i iVarT2 = iVarA2.t(jC);
                p131n0.i iVarB2 = p131n0.j.b(oVarB.s(), Y0.u.d(oVarB.u()));
                K0.k kVarW5 = oVarR.w();
                K0.r rVar2 = K0.r.f6030a;
                iVar = (K0.i) K0.l.a(kVarW5, rVar2.k());
                iVar2 = (K0.i) K0.l.a(oVarR.w(), rVar2.I());
                fX0 = x0(iVarB2.i() - iVarT2.i(), iVarB2.j() - iVarT2.j());
                if (iVar != null) {
                    fX0 = -fX0;
                }
                if (androidx.compose.ui.platform.A.k(oVarB)) {
                    fX0 = -fX0;
                }
                fX1 = x0(iVarB2.l() - iVarT2.l(), iVarB2.e() - iVarT2.e());
                if (iVar2 != null) {
                    fX1 = -fX1;
                }
                return aVar12 == null ? false : false;
            case android.R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (aVar13 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.w())) == null || (lVar2 = (p237x7.l) aVar13.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) lVar2.l(java.lang.Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case android.R.id.accessibilityActionImeEnter:
                K0.a aVar29 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.l());
                if (aVar29 == null || (aVar14 = (p237x7.a) aVar29.a()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) aVar14.b()).booleanValue();
            default:
                switch (i10) {
                    case android.R.id.accessibilityActionScrollUp:
                    case android.R.id.accessibilityActionScrollLeft:
                    case android.R.id.accessibilityActionScrollDown:
                    case android.R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i10) {
                            case android.R.id.accessibilityActionPageUp:
                                K0.a aVar30 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.q());
                                if (aVar30 == null || (aVar15 = (p237x7.a) aVar30.a()) == null) {
                                    return false;
                                }
                                return ((java.lang.Boolean) aVar15.b()).booleanValue();
                            case android.R.id.accessibilityActionPageDown:
                                K0.a aVar31 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.n());
                                if (aVar31 == null || (aVar16 = (p237x7.a) aVar31.a()) == null) {
                                    return false;
                                }
                                return ((java.lang.Boolean) aVar16.b()).booleanValue();
                            case android.R.id.accessibilityActionPageLeft:
                                K0.a aVar32 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.o());
                                if (aVar32 == null || (aVar17 = (p237x7.a) aVar32.a()) == null) {
                                    return false;
                                }
                                return ((java.lang.Boolean) aVar17.b()).booleanValue();
                            case android.R.id.accessibilityActionPageRight:
                                K0.a aVar33 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.p());
                                if (aVar33 == null || (aVar18 = (p237x7.a) aVar33.a()) == null) {
                                    return false;
                                }
                                return ((java.lang.Boolean) aVar18.b()).booleanValue();
                            default:
                                p170r.Z z6 = (p170r.Z) this.f20379t.e(i6);
                                if (z6 == null || (charSequence = (java.lang.CharSequence) z6.e(i10)) == null || (list = (java.util.List) K0.l.a(oVarB.w(), K0.j.f5973a.d())) == null) {
                                    return false;
                                }
                                int size = list.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    K0.d dVar = (K0.d) list.get(i11);
                                    if (p247y7.AbstractC7350t.b(dVar.b(), charSequence)) {
                                        return ((java.lang.Boolean) dVar.a().b()).booleanValue();
                                    }
                                }
                                return false;
                        }
                }
                break;
        }
        boolean z10 = i10 == 4096;
        boolean z11 = i10 == 8192;
        boolean z12 = i10 == 16908345;
        boolean z13 = i10 == 16908347;
        boolean z14 = i10 == 16908344;
        boolean z15 = i10 == 16908346;
        boolean z16 = z12 || z13 || z10 || z11;
        boolean z17 = z14 || z15 || z10 || z11;
        if (z10 || z11) {
            K0.g gVar = (K0.g) K0.l.a(oVarB.w(), K0.r.f6030a.x());
            K0.a aVar34 = (K0.a) K0.l.a(oVarB.w(), K0.j.f5973a.w());
            if (gVar != null && aVar34 != null) {
                float fC = (E7.j.c(((java.lang.Number) gVar.c().e()).floatValue(), ((java.lang.Number) gVar.c().d()).floatValue()) - E7.j.f(((java.lang.Number) gVar.c().d()).floatValue(), ((java.lang.Number) gVar.c().e()).floatValue())) / (gVar.d() > 0 ? gVar.d() + 1 : 20);
                if (z11) {
                    fC = -fC;
                }
                p237x7.l lVar3 = (p237x7.l) aVar34.a();
                if (lVar3 != null) {
                    return ((java.lang.Boolean) lVar3.l(java.lang.Float.valueOf(gVar.b() + fC))).booleanValue();
                }
                return false;
            }
        }
        long jK = D0.AbstractC0901u.a(oVarB.p().l()).k();
        java.lang.Float fD = androidx.compose.ui.platform.AbstractC1970q1.d(oVarB.w());
        K0.k kVarW6 = oVarB.w();
        K0.j jVar = K0.j.f5973a;
        K0.a aVar35 = (K0.a) K0.l.a(kVarW6, jVar.t());
        if (aVar35 == null) {
            return false;
        }
        K0.k kVarW7 = oVarB.w();
        K0.r rVar3 = K0.r.f6030a;
        K0.i iVar3 = (K0.i) K0.l.a(kVarW7, rVar3.k());
        if (iVar3 != null && z16) {
            float fFloatValue = fD != null ? fD.floatValue() : p131n0.m.i(jK);
            if (z12 || z11) {
                fFloatValue = -fFloatValue;
            }
            if (iVar3.b()) {
                fFloatValue = -fFloatValue;
            }
            if (androidx.compose.ui.platform.A.k(oVarB) && (z12 || z13)) {
                fFloatValue = -fFloatValue;
            }
            if (w0(iVar3, fFloatValue)) {
                if (!oVarB.w().f(jVar.o()) && !oVarB.w().f(jVar.p())) {
                    p237x7.p pVar2 = (p237x7.p) aVar35.a();
                    if (pVar2 != null) {
                        objB2 = pVar2.u(java.lang.Float.valueOf(fFloatValue), java.lang.Float.valueOf(0.0f));
                        return ((java.lang.Boolean) objB2).booleanValue();
                    }
                    return false;
                }
                if (fFloatValue > 0.0f) {
                    kVarW2 = oVarB.w();
                    vVarO = jVar.p();
                } else {
                    kVarW2 = oVarB.w();
                    vVarO = jVar.o();
                }
                K0.a aVar36 = (K0.a) K0.l.a(kVarW2, vVarO);
                if (aVar36 != null && (aVar6 = (p237x7.a) aVar36.a()) != null) {
                    objB2 = aVar6.b();
                    return ((java.lang.Boolean) objB2).booleanValue();
                }
                return false;
            }
        }
        K0.i iVar4 = (K0.i) K0.l.a(oVarB.w(), rVar3.I());
        if (iVar4 == null || !z17) {
            return false;
        }
        float fFloatValue2 = fD != null ? fD.floatValue() : p131n0.m.g(jK);
        if (z14 || z11) {
            fFloatValue2 = -fFloatValue2;
        }
        if (iVar4.b()) {
            fFloatValue2 = -fFloatValue2;
        }
        if (!w0(iVar4, fFloatValue2)) {
            return false;
        }
        if (!oVarB.w().f(jVar.q()) && !oVarB.w().f(jVar.n())) {
            p237x7.p pVar3 = (p237x7.p) aVar35.a();
            if (pVar3 != null) {
                objB = pVar3.u(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(fFloatValue2));
                return ((java.lang.Boolean) objB).booleanValue();
            }
            return false;
        }
        if (fFloatValue2 > 0.0f) {
            kVarW = oVarB.w();
            vVarQ = jVar.n();
        } else {
            kVarW = oVarB.w();
            vVarQ = jVar.q();
        }
        K0.a aVar37 = (K0.a) K0.l.a(kVarW, vVarQ);
        if (aVar37 != null && (aVar5 = (p237x7.a) aVar37.a()) != null) {
            objB = aVar5.b();
            return ((java.lang.Boolean) objB).booleanValue();
        }
        return false;
    }

    private static final boolean w0(K0.i iVar, float f6) {
        return (f6 < 0.0f && ((java.lang.Number) iVar.c().b()).floatValue() > 0.0f) || (f6 > 0.0f && ((java.lang.Number) iVar.c().b()).floatValue() < ((java.lang.Number) iVar.a().b()).floatValue());
    }

    private static final float x0(float f6, float f10) {
        if (java.lang.Math.signum(f6) == java.lang.Math.signum(f10)) {
            return java.lang.Math.abs(f6) < java.lang.Math.abs(f10) ? f6 : f10;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x031d  */
    private final void y0(int i6, C1.B b6, K0.o oVar) {
        C1.B.a aVar;
        android.view.View viewH;
        boolean z6;
        boolean zBooleanValue;
        android.content.res.Resources resources;
        int i10;
        b6.m0("android.view.View");
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        if (kVarW.f(rVar.g())) {
            b6.m0("android.widget.EditText");
        }
        if (oVar.w().f(rVar.D())) {
            b6.m0("android.widget.TextView");
        }
        K0.h hVar = (K0.h) K0.l.a(oVar.w(), rVar.y());
        if (hVar != null) {
            hVar.n();
            if (oVar.x() || oVar.t().isEmpty()) {
                K0.h.a aVar2 = K0.h.f5956b;
                if (K0.h.k(hVar.n(), aVar2.g())) {
                    resources = this.f20363d.getContext().getResources();
                    i10 = p071h0.m.f45853k;
                } else if (K0.h.k(hVar.n(), aVar2.f())) {
                    resources = this.f20363d.getContext().getResources();
                    i10 = p071h0.m.f45852j;
                } else {
                    java.lang.String strI = androidx.compose.ui.platform.AbstractC1970q1.i(hVar.n());
                    if (!K0.h.k(hVar.n(), aVar2.d()) || oVar.A() || oVar.w().M()) {
                        b6.m0(strI);
                    }
                }
                b6.L0(resources.getString(i10));
            }
            p087i7.M m6 = p087i7.M.f46721a;
        }
        b6.F0(this.f20363d.getContext().getPackageName());
        b6.z0(androidx.compose.ui.platform.AbstractC1970q1.f(oVar));
        java.util.List listT = oVar.t();
        int size = listT.size();
        for (int i11 = 0; i11 < size; i11++) {
            K0.o oVar2 = (K0.o) listT.get(i11);
            if (a0().a(oVar2.o())) {
                androidx.compose.ui.viewinterop.c cVar = this.f20363d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(oVar2.q());
                if (oVar2.o() != -1) {
                    if (cVar != null) {
                        b6.c(cVar);
                    } else {
                        b6.d(this.f20363d, oVar2.o());
                    }
                }
            }
        }
        if (i6 == this.f20374o) {
            b6.f0(true);
            aVar = C1.B.a.f1246l;
        } else {
            b6.f0(false);
            aVar = C1.B.a.f1245k;
        }
        b6.b(aVar);
        U0(oVar, b6);
        Q0(oVar, b6);
        T0(oVar, b6);
        R0(oVar, b6);
        K0.k kVarW2 = oVar.w();
        K0.r rVar2 = K0.r.f6030a;
        L0.a aVar3 = (L0.a) K0.l.a(kVarW2, rVar2.G());
        if (aVar3 != null) {
            if (aVar3 == L0.a.On) {
                b6.l0(true);
            } else if (aVar3 == L0.a.Off) {
                b6.l0(false);
            }
            p087i7.M m10 = p087i7.M.f46721a;
        }
        java.lang.Boolean bool = (java.lang.Boolean) K0.l.a(oVar.w(), rVar2.A());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (hVar == null ? false : K0.h.k(hVar.n(), K0.h.f5956b.g())) {
                b6.O0(zBooleanValue2);
            } else {
                b6.l0(zBooleanValue2);
            }
            p087i7.M m11 = p087i7.M.f46721a;
        }
        if (!oVar.w().M() || oVar.t().isEmpty()) {
            java.util.List list = (java.util.List) K0.l.a(oVar.w(), rVar2.d());
            b6.q0(list != null ? (java.lang.String) p097j7.AbstractC6879v.k0(list) : null);
        }
        java.lang.String str = (java.lang.String) K0.l.a(oVar.w(), rVar2.C());
        if (str != null) {
            K0.o oVarR = oVar;
            while (true) {
                if (oVarR == null) {
                    zBooleanValue = false;
                    break;
                }
                K0.k kVarW3 = oVarR.w();
                K0.s sVar = K0.s.f6067a;
                if (kVarW3.f(sVar.a())) {
                    zBooleanValue = ((java.lang.Boolean) oVarR.w().s(sVar.a())).booleanValue();
                    break;
                }
                oVarR = oVarR.r();
            }
            if (zBooleanValue) {
                b6.Y0(str);
            }
        }
        K0.k kVarW4 = oVar.w();
        K0.r rVar3 = K0.r.f6030a;
        if (((p087i7.M) K0.l.a(kVarW4, rVar3.j())) != null) {
            b6.x0(true);
            p087i7.M m12 = p087i7.M.f46721a;
        }
        b6.J0(oVar.w().f(rVar3.w()));
        b6.s0(oVar.w().f(rVar3.p()));
        java.lang.Integer num = (java.lang.Integer) K0.l.a(oVar.w(), rVar3.u());
        b6.D0(num != null ? num.intValue() : -1);
        b6.t0(androidx.compose.ui.platform.A.h(oVar));
        b6.v0(oVar.w().f(rVar3.i()));
        if (b6.O()) {
            b6.w0(((java.lang.Boolean) oVar.w().s(rVar3.i())).booleanValue());
            if (b6.P()) {
                b6.a(2);
            } else {
                b6.a(1);
            }
        }
        b6.Z0(androidx.compose.ui.platform.AbstractC1970q1.g(oVar));
        K0.f fVar = (K0.f) K0.l.a(oVar.w(), rVar3.t());
        if (fVar != null) {
            int i12 = fVar.i();
            K0.f.a aVar4 = K0.f.f5947b;
            b6.B0((K0.f.f(i12, aVar4.b()) || !K0.f.f(i12, aVar4.a())) ? 1 : 2);
            p087i7.M m13 = p087i7.M.f46721a;
        }
        b6.n0(false);
        K0.k kVarW5 = oVar.w();
        K0.j jVar = K0.j.f5973a;
        K0.a aVar5 = (K0.a) K0.l.a(kVarW5, jVar.k());
        if (aVar5 != null) {
            boolean zB = p247y7.AbstractC7350t.b(K0.l.a(oVar.w(), rVar3.A()), java.lang.Boolean.TRUE);
            K0.h.a aVar6 = K0.h.f5956b;
            if (hVar == null ? false : K0.h.k(hVar.n(), aVar6.g())) {
                z6 = true;
            } else if (hVar == null ? false : K0.h.k(hVar.n(), aVar6.e())) {
                z6 = true;
            } else {
                z6 = false;
            }
            b6.n0(!z6 || (z6 && !zB));
            if (androidx.compose.ui.platform.A.h(oVar) && b6.L()) {
                b6.b(new C1.B.a(16, aVar5.b()));
            }
            p087i7.M m14 = p087i7.M.f46721a;
        }
        b6.C0(false);
        K0.a aVar7 = (K0.a) K0.l.a(oVar.w(), jVar.m());
        if (aVar7 != null) {
            b6.C0(true);
            if (androidx.compose.ui.platform.A.h(oVar)) {
                b6.b(new C1.B.a(32, aVar7.b()));
            }
            p087i7.M m15 = p087i7.M.f46721a;
        }
        K0.a aVar8 = (K0.a) K0.l.a(oVar.w(), jVar.c());
        if (aVar8 != null) {
            b6.b(new C1.B.a(16384, aVar8.b()));
            p087i7.M m16 = p087i7.M.f46721a;
        }
        if (androidx.compose.ui.platform.A.h(oVar)) {
            K0.a aVar9 = (K0.a) K0.l.a(oVar.w(), jVar.y());
            if (aVar9 != null) {
                b6.b(new C1.B.a(2097152, aVar9.b()));
                p087i7.M m17 = p087i7.M.f46721a;
            }
            K0.a aVar10 = (K0.a) K0.l.a(oVar.w(), jVar.l());
            if (aVar10 != null) {
                b6.b(new C1.B.a(android.R.id.accessibilityActionImeEnter, aVar10.b()));
                p087i7.M m18 = p087i7.M.f46721a;
            }
            K0.a aVar11 = (K0.a) K0.l.a(oVar.w(), jVar.e());
            if (aVar11 != null) {
                b6.b(new C1.B.a(65536, aVar11.b()));
                p087i7.M m19 = p087i7.M.f46721a;
            }
            K0.a aVar12 = (K0.a) K0.l.a(oVar.w(), jVar.r());
            if (aVar12 != null) {
                if (b6.P() && this.f20363d.getClipboardManager().c()) {
                    b6.b(new C1.B.a(32768, aVar12.b()));
                }
                p087i7.M m20 = p087i7.M.f46721a;
            }
        }
        java.lang.String strI0 = i0(oVar);
        if (!(strI0 == null || strI0.length() == 0)) {
            b6.T0(Z(oVar), Y(oVar));
            K0.a aVar13 = (K0.a) K0.l.a(oVar.w(), jVar.x());
            b6.b(new C1.B.a(131072, aVar13 != null ? aVar13.b() : null));
            b6.a(256);
            b6.a(512);
            b6.E0(11);
            java.util.List list2 = (java.util.List) K0.l.a(oVar.w(), rVar3.d());
            if ((list2 == null || list2.isEmpty()) && oVar.w().f(jVar.i()) && !androidx.compose.ui.platform.A.i(oVar)) {
                b6.E0(b6.x() | 20);
            }
        }
        int i13 = android.os.Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            java.lang.CharSequence charSequenceC = b6.C();
            if (!(charSequenceC == null || charSequenceC.length() == 0) && oVar.w().f(jVar.i())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (oVar.w().f(rVar3.C())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            b6.g0(arrayList);
        }
        K0.g gVar = (K0.g) K0.l.a(oVar.w(), rVar3.x());
        if (gVar != null) {
            b6.m0(oVar.w().f(jVar.w()) ? "android.widget.SeekBar" : "android.widget.ProgressBar");
            if (gVar != K0.g.f5951d.a()) {
                b6.K0(C1.B.g.a(1, ((java.lang.Number) gVar.c().d()).floatValue(), ((java.lang.Number) gVar.c().e()).floatValue(), gVar.b()));
            }
            if (oVar.w().f(jVar.w()) && androidx.compose.ui.platform.A.h(oVar)) {
                if (gVar.b() < E7.j.c(((java.lang.Number) gVar.c().e()).floatValue(), ((java.lang.Number) gVar.c().d()).floatValue())) {
                    b6.b(C1.B.a.f1251q);
                }
                if (gVar.b() > E7.j.f(((java.lang.Number) gVar.c().d()).floatValue(), ((java.lang.Number) gVar.c().e()).floatValue())) {
                    b6.b(C1.B.a.f1252r);
                }
            }
        }
        if (i13 >= 24) {
            androidx.compose.ui.platform.C1984x.b.a(b6, oVar);
        }
        G0.a.d(oVar, b6);
        G0.a.e(oVar, b6);
        K0.i iVar = (K0.i) K0.l.a(oVar.w(), rVar3.k());
        K0.a aVar14 = (K0.a) K0.l.a(oVar.w(), jVar.t());
        if (iVar != null && aVar14 != null) {
            if (!G0.a.b(oVar)) {
                b6.m0("android.widget.HorizontalScrollView");
            }
            if (((java.lang.Number) iVar.a().b()).floatValue() > 0.0f) {
                b6.N0(true);
            }
            if (androidx.compose.ui.platform.A.h(oVar)) {
                if (A0(iVar)) {
                    b6.b(C1.B.a.f1251q);
                    b6.b(!androidx.compose.ui.platform.A.k(oVar) ? C1.B.a.f1222F : C1.B.a.f1220D);
                }
                if (z0(iVar)) {
                    b6.b(C1.B.a.f1252r);
                    b6.b(!androidx.compose.ui.platform.A.k(oVar) ? C1.B.a.f1220D : C1.B.a.f1222F);
                }
            }
        }
        K0.i iVar2 = (K0.i) K0.l.a(oVar.w(), rVar3.I());
        if (iVar2 != null && aVar14 != null) {
            if (!G0.a.b(oVar)) {
                b6.m0("android.widget.ScrollView");
            }
            if (((java.lang.Number) iVar2.a().b()).floatValue() > 0.0f) {
                b6.N0(true);
            }
            if (androidx.compose.ui.platform.A.h(oVar)) {
                if (A0(iVar2)) {
                    b6.b(C1.B.a.f1251q);
                    b6.b(C1.B.a.f1221E);
                }
                if (z0(iVar2)) {
                    b6.b(C1.B.a.f1252r);
                    b6.b(C1.B.a.f1219C);
                }
            }
        }
        if (i13 >= 29) {
            androidx.compose.ui.platform.C1984x.c.a(b6, oVar);
        }
        b6.G0((java.lang.CharSequence) K0.l.a(oVar.w(), rVar3.v()));
        if (androidx.compose.ui.platform.A.h(oVar)) {
            K0.a aVar15 = (K0.a) K0.l.a(oVar.w(), jVar.g());
            if (aVar15 != null) {
                b6.b(new C1.B.a(262144, aVar15.b()));
                p087i7.M m21 = p087i7.M.f46721a;
            }
            K0.a aVar16 = (K0.a) K0.l.a(oVar.w(), jVar.b());
            if (aVar16 != null) {
                b6.b(new C1.B.a(524288, aVar16.b()));
                p087i7.M m22 = p087i7.M.f46721a;
            }
            K0.a aVar17 = (K0.a) K0.l.a(oVar.w(), jVar.f());
            if (aVar17 != null) {
                b6.b(new C1.B.a(1048576, aVar17.b()));
                p087i7.M m23 = p087i7.M.f46721a;
            }
            if (oVar.w().f(jVar.d())) {
                java.util.List list3 = (java.util.List) oVar.w().s(jVar.d());
                int size2 = list3.size();
                p170r.AbstractC7037l abstractC7037l = f20348Q;
                if (size2 >= abstractC7037l.b()) {
                    throw new java.lang.IllegalStateException("Can't have more than " + abstractC7037l.b() + " custom actions for one widget");
                }
                p170r.Z z10 = new p170r.Z(0, 1, null);
                p170r.H hB = p170r.O.b();
                if (this.f20380u.d(i6)) {
                    p170r.H h6 = (p170r.H) this.f20380u.e(i6);
                    p170r.B b10 = new p170r.B(0, 1, null);
                    int[] iArr = abstractC7037l.f53390a;
                    int i14 = abstractC7037l.f53391b;
                    for (int i15 = 0; i15 < i14; i15++) {
                        b10.g(iArr[i15]);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int size3 = list3.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        K0.d dVar = (K0.d) list3.get(i16);
                        p247y7.AbstractC7350t.c(h6);
                        if (h6.a(dVar.b())) {
                            int iC = h6.c(dVar.b());
                            z10.m(iC, dVar.b());
                            hB.s(dVar.b(), iC);
                            b10.k(iC);
                            b6.b(new C1.B.a(iC, dVar.b()));
                        } else {
                            arrayList2.add(dVar);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i17 = 0; i17 < size4; i17++) {
                        K0.d dVar2 = (K0.d) arrayList2.get(i17);
                        int iA = b10.a(i17);
                        z10.m(iA, dVar2.b());
                        hB.s(dVar2.b(), iA);
                        b6.b(new C1.B.a(iA, dVar2.b()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i18 = 0; i18 < size5; i18++) {
                        K0.d dVar3 = (K0.d) list3.get(i18);
                        int iA2 = f20348Q.a(i18);
                        z10.m(iA2, dVar3.b());
                        hB.s(dVar3.b(), iA2);
                        b6.b(new C1.B.a(iA2, dVar3.b()));
                    }
                }
                this.f20379t.m(i6, z10);
                this.f20380u.m(i6, hB);
            }
        }
        b6.M0(q0(oVar));
        int iE = this.f20352D.e(i6, -1);
        if (iE != -1) {
            android.view.View viewH2 = androidx.compose.ui.platform.AbstractC1970q1.h(this.f20363d.getAndroidViewsHandler$ui_release(), iE);
            if (viewH2 != null) {
                b6.W0(viewH2);
            } else {
                b6.X0(this.f20363d, iE);
            }
            K(i6, b6, this.f20354F, null);
        }
        int iE2 = this.f20353E.e(i6, -1);
        if (iE2 == -1 || (viewH = androidx.compose.ui.platform.AbstractC1970q1.h(this.f20363d.getAndroidViewsHandler$ui_release(), iE2)) == null) {
            return;
        }
        b6.U0(viewH);
        K(i6, b6, this.f20355G, null);
    }

    private static final boolean z0(K0.i iVar) {
        return (((java.lang.Number) iVar.c().b()).floatValue() > 0.0f && !iVar.b()) || (((java.lang.Number) iVar.c().b()).floatValue() < ((java.lang.Number) iVar.a().b()).floatValue() && iVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:49:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:49:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[Catch: all -> 0x003a, LOOP:0: B:34:0x008f->B:35:0x0091, LOOP_END, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:49:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:49:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0086 -> B:42:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cf -> B:42:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object M(p127m7.e r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1984x.M(m7.e):java.lang.Object");
    }

    public final boolean N(boolean z6, int i6, long j6) {
        if (p247y7.AbstractC7350t.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            return O(a0(), z6, i6, j6);
        }
        return false;
    }

    public final void S0(long j6) {
        this.f20368i = j6;
    }

    public final boolean V(android.view.MotionEvent motionEvent) {
        if (!r0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iM0 = m0(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f20363d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            f1(iM0);
            if (iM0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f20364e == Integer.MIN_VALUE) {
            return this.f20363d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        f1(Integer.MIN_VALUE);
        return true;
    }

    @Override // androidx.core.view.C1990a
    public C1.E b(android.view.View view) {
        return this.f20373n;
    }

    public final java.lang.String b0() {
        return this.f20355G;
    }

    public final java.lang.String c0() {
        return this.f20354F;
    }

    public final p170r.A d0() {
        return this.f20353E;
    }

    public final p170r.A e0() {
        return this.f20352D;
    }

    public final androidx.compose.ui.platform.r l0() {
        return this.f20363d;
    }

    public final int m0(float f6, float f10) {
        int iF0;
        F0.n0.c(this.f20363d, false, 1, null);
        F0.C0935v c0935v = new F0.C0935v();
        this.f20363d.getRoot().z0(p131n0.h.a(f6, f10), c0935v, (12 & 4) != 0, (12 & 8) != 0);
        int iO = p097j7.AbstractC6879v.o(c0935v);
        while (true) {
            iF0 = Integer.MIN_VALUE;
            if (-1 >= iO) {
                break;
            }
            F0.J jM = F0.AbstractC0925k.m(c0935v.get(iO));
            if (this.f20363d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(jM) != null) {
                return Integer.MIN_VALUE;
            }
            if (jM.k0().q(F0.AbstractC0918f0.a(8))) {
                iF0 = F0(jM.q0());
                if (androidx.compose.ui.platform.AbstractC1970q1.f(K0.p.a(jM, false))) {
                    break;
                }
            }
            iO--;
        }
        return iF0;
    }

    public final boolean p0() {
        if (this.f20367h) {
            return true;
        }
        return this.f20366g.isEnabled() && (this.f20371l.isEmpty() ^ true);
    }

    public final void t0(F0.J j6) {
        this.f20385z = true;
        if (p0()) {
            s0(j6);
        }
    }

    public final void u0() {
        this.f20385z = true;
        if (!p0() || this.f20359K) {
            return;
        }
        this.f20359K = true;
        this.f20372m.post(this.f20360L);
    }
}
