package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class r extends android.view.ViewGroup implements F0.o0, androidx.compose.ui.platform.H1, p251z0.Q, androidx.lifecycle.InterfaceC2073e {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final androidx.compose.ui.platform.r.a f20216g1 = new androidx.compose.ui.platform.r.a(null);

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f20217h1 = 8;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static java.lang.Class f20218i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static java.lang.reflect.Method f20219j1;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private long f20220A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private boolean f20221B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f20222C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20223C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f20224D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final V.G1 f20225D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F0.L f20226E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private p237x7.l f20227E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20228F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener f20229F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final K0.e f20230G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final android.view.ViewTreeObserver.OnScrollChangedListener f20231G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final androidx.compose.ui.semantics.EmptySemanticsElement f20232H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener f20233H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p121m0.i f20234I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private final S0.Z f20235I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final androidx.compose.ui.platform.DragAndDropModifierOnDragListener f20236J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private final S0.X f20237J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private p127m7.i f20238K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f20239K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p101k0.c f20240L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private final androidx.compose.ui.platform.InterfaceC1975s1 f20241L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final androidx.compose.ui.platform.K1 f20242M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private final R0.InterfaceC1493g f20243M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final androidx.compose.ui.d f20244N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20245N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final androidx.compose.ui.d f20246O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f20247O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p141o0.C6995r0 f20248P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20249P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final F0.J f20250Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private final p211v0.a f20251Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final F0.x0 f20252R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private final p221w0.c f20253R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final K0.q f20254S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private final E0.f f20255S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final androidx.compose.ui.platform.C1984x f20256T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private final androidx.compose.ui.platform.t1 f20257T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p091j0.b f20258U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private android.view.MotionEvent f20259U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final androidx.compose.ui.platform.C1947j f20260V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private long f20261V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final p141o0.C1 f20262W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private final androidx.compose.ui.platform.I1 f20263W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private final X.b f20264X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private final androidx.compose.ui.platform.r.u f20265Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private final java.lang.Runnable f20266Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final p081i0.w f20267a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private boolean f20268a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final java.util.List f20269b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private final p237x7.a f20270b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private java.util.List f20271c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final androidx.compose.ui.platform.InterfaceC1942h0 f20272c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f20273d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean f20274d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f20275e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final J0.l f20276e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final p251z0.C7373i f20277f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private final p251z0.y f20278f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final p251z0.F f20279g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private p237x7.l f20280h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final p081i0.d f20281i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f20282j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final androidx.compose.ui.platform.C1950k f20283k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final F0.q0 f20284l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f20285m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private androidx.compose.ui.platform.C1936f0 f20286n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private androidx.compose.ui.platform.C1983w0 f20287o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Y0.C1859b f20288p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f20289q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final F0.V f20290r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final androidx.compose.ui.platform.A1 f20291s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f20292t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final int[] f20293u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final float[] f20294v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final float[] f20295w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final float[] f20296x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private long f20297y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f20298z0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (androidx.compose.ui.platform.r.f20218i1 == null) {
                    androidx.compose.ui.platform.r.f20218i1 = java.lang.Class.forName("android.os.SystemProperties");
                    java.lang.Class cls = androidx.compose.ui.platform.r.f20218i1;
                    androidx.compose.ui.platform.r.f20219j1 = cls != null ? cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE) : null;
                }
                java.lang.reflect.Method method = androidx.compose.ui.platform.r.f20219j1;
                java.lang.Object objInvoke = method != null ? method.invoke(null, "debug.layout", java.lang.Boolean.FALSE) : null;
                java.lang.Boolean bool = objInvoke instanceof java.lang.Boolean ? (java.lang.Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.r f20299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p233x2.f f20300b;

        public b(androidx.lifecycle.r rVar, p233x2.f fVar) {
            this.f20299a = rVar;
            this.f20300b = fVar;
        }

        public final androidx.lifecycle.r a() {
            return this.f20299a;
        }

        public final p233x2.f b() {
            return this.f20300b;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final java.lang.Boolean a(int i6) {
            boolean zRequestFocusFromTouch;
            p221w0.a.C0741a c0741a = p221w0.a.f56161b;
            if (p221w0.a.f(i6, c0741a.b())) {
                zRequestFocusFromTouch = androidx.compose.ui.platform.r.this.isInTouchMode();
            } else if (p221w0.a.f(i6, c0741a.a())) {
                zRequestFocusFromTouch = androidx.compose.ui.platform.r.this.isInTouchMode() ? androidx.compose.ui.platform.r.this.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return java.lang.Boolean.valueOf(zRequestFocusFromTouch);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((p221w0.a) obj).i());
        }
    }

    public static final class d extends androidx.core.view.C1990a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ F0.J f20303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.r f20304f;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final androidx.compose.ui.platform.r.d.a f20305D = new androidx.compose.ui.platform.r.d.a();

            a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean l(F0.J j6) {
                return java.lang.Boolean.valueOf(j6.k0().q(F0.AbstractC0918f0.a(8)));
            }
        }

        d(F0.J j6, androidx.compose.ui.platform.r rVar) {
            this.f20303e = j6;
            this.f20304f = rVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e  */
        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            if (androidx.compose.ui.platform.r.this.f20256T.p0()) {
                b6.Z0(false);
            }
            F0.J jF = K0.p.f(this.f20303e, androidx.compose.ui.platform.r.d.a.f20305D);
            java.lang.Integer numValueOf = jF != null ? java.lang.Integer.valueOf(jF.q0()) : null;
            if (numValueOf != null) {
                if (numValueOf.intValue() == androidx.compose.ui.platform.r.this.getSemanticsOwner().a().o()) {
                    numValueOf = -1;
                }
            } else {
                numValueOf = -1;
            }
            b6.I0(this.f20304f, numValueOf.intValue());
            int iQ0 = this.f20303e.q0();
            int iE = androidx.compose.ui.platform.r.this.f20256T.e0().e(iQ0, -1);
            if (iE != -1) {
                android.view.View viewH = androidx.compose.ui.platform.AbstractC1970q1.h(androidx.compose.ui.platform.r.this.getAndroidViewsHandler$ui_release(), iE);
                if (viewH != null) {
                    b6.W0(viewH);
                } else {
                    b6.X0(this.f20304f, iE);
                }
                androidx.compose.ui.platform.r.this.Z(iQ0, b6.a1(), androidx.compose.ui.platform.r.this.f20256T.c0());
            }
            int iE2 = androidx.compose.ui.platform.r.this.f20256T.d0().e(iQ0, -1);
            if (iE2 != -1) {
                android.view.View viewH2 = androidx.compose.ui.platform.AbstractC1970q1.h(androidx.compose.ui.platform.r.this.getAndroidViewsHandler$ui_release(), iE2);
                if (viewH2 != null) {
                    b6.U0(viewH2);
                } else {
                    b6.V0(this.f20304f, iE2);
                }
                androidx.compose.ui.platform.r.this.Z(iQ0, b6.a1(), androidx.compose.ui.platform.r.this.f20256T.b0());
            }
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.r.e f20306D = new androidx.compose.ui.platform.r.e();

        e() {
            super(1);
        }

        public final void a(android.content.res.Configuration configuration) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((android.content.res.Configuration) obj);
            return p087i7.M.f46721a;
        }
    }

    /* synthetic */ class f extends p247y7.C7348q implements p237x7.a {
        f(java.lang.Object obj) {
            super(0, obj, androidx.compose.ui.platform.S.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.coreshims.d b() {
            return androidx.compose.ui.platform.S.g((android.view.View) this.f57287D);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.view.KeyEvent f20308E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(android.view.KeyEvent keyEvent) {
            super(0);
            this.f20308E = keyEvent;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(androidx.compose.ui.platform.r.super.dispatchKeyEvent(this.f20308E));
        }
    }

    /* synthetic */ class h extends p247y7.C7348q implements p237x7.q {
        h(java.lang.Object obj) {
            super(3, obj, androidx.compose.ui.platform.r.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            androidx.appcompat.app.D.a(obj);
            return s(null, ((p131n0.m) obj2).m(), (p237x7.l) obj3);
        }

        public final java.lang.Boolean s(p101k0.h hVar, long j6, p237x7.l lVar) {
            return java.lang.Boolean.valueOf(((androidx.compose.ui.platform.r) this.f57287D).Q0(hVar, j6, lVar));
        }
    }

    /* synthetic */ class i extends p247y7.C7348q implements p237x7.l {
        i(java.lang.Object obj) {
            super(1, obj, androidx.compose.ui.platform.r.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            s((p237x7.a) obj);
            return p087i7.M.f46721a;
        }

        public final void s(p237x7.a aVar) {
            ((androidx.compose.ui.platform.r) this.f57287D).x(aVar);
        }
    }

    /* synthetic */ class j extends p247y7.C7348q implements p237x7.p {
        j(java.lang.Object obj) {
            super(2, obj, androidx.compose.ui.platform.r.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(androidx.compose.ui.focus.d dVar, p131n0.i iVar) {
            return java.lang.Boolean.valueOf(((androidx.compose.ui.platform.r) this.f57287D).B0(dVar, iVar));
        }
    }

    /* synthetic */ class k extends p247y7.C7348q implements p237x7.l {
        k(java.lang.Object obj) {
            super(1, obj, androidx.compose.ui.platform.r.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return s(((androidx.compose.ui.focus.d) obj).o());
        }

        public final java.lang.Boolean s(int i6) {
            return java.lang.Boolean.valueOf(((androidx.compose.ui.platform.r) this.f57287D).A0(i6));
        }
    }

    /* synthetic */ class l extends p247y7.C7348q implements p237x7.a {
        l(java.lang.Object obj) {
            super(0, obj, androidx.compose.ui.platform.r.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((androidx.compose.ui.platform.r) this.f57287D).y0();
        }
    }

    /* synthetic */ class m extends p247y7.C7348q implements p237x7.a {
        m(java.lang.Object obj) {
            super(0, obj, androidx.compose.ui.platform.r.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final p131n0.i b() {
            return ((androidx.compose.ui.platform.r) this.f57287D).z0();
        }
    }

    static final class o extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.r.o f20309D = new androidx.compose.ui.platform.r.o();

        o() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            return java.lang.Boolean.TRUE;
        }
    }

    static final class p extends p247y7.AbstractC7352v implements p237x7.l {

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f20311D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f20311D = dVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                java.lang.Boolean boolK = androidx.compose.ui.focus.r.k(focusTargetNode, this.f20311D.o());
                return java.lang.Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f20312D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f20312D = dVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                java.lang.Boolean boolK = androidx.compose.ui.focus.r.k(focusTargetNode, this.f20312D.o());
                return java.lang.Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        p() {
            super(1);
        }

        public final java.lang.Boolean a(android.view.KeyEvent keyEvent) {
            androidx.compose.ui.focus.d dVarK0 = androidx.compose.ui.platform.r.this.k0(keyEvent);
            if (dVarK0 == null || !p231x0.c.e(p231x0.d.b(keyEvent), p231x0.c.f56893a.a())) {
                return java.lang.Boolean.FALSE;
            }
            p131n0.i iVarZ0 = androidx.compose.ui.platform.r.this.z0();
            java.lang.Boolean boolO = androidx.compose.ui.platform.r.this.getFocusOwner().o(dVarK0.o(), iVarZ0, new androidx.compose.ui.platform.r.p.b(dVarK0));
            if (boolO != null ? boolO.booleanValue() : true) {
                return java.lang.Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.h.a(dVarK0.o())) {
                return java.lang.Boolean.FALSE;
            }
            java.lang.Integer numC = androidx.compose.ui.focus.f.c(dVarK0.o());
            if (numC == null) {
                throw new java.lang.IllegalStateException("Invalid focus direction".toString());
            }
            int iIntValue = numC.intValue();
            android.graphics.Rect rectB = iVarZ0 != null ? p141o0.X1.b(iVarZ0) : null;
            if (rectB == null) {
                throw new java.lang.IllegalStateException("Invalid rect".toString());
            }
            android.view.View viewI0 = androidx.compose.ui.platform.r.this.i0(iIntValue);
            if (!(!p247y7.AbstractC7350t.b(viewI0, androidx.compose.ui.platform.r.this))) {
                viewI0 = null;
            }
            if ((viewI0 == null || !androidx.compose.ui.focus.f.b(viewI0, java.lang.Integer.valueOf(iIntValue), rectB)) && androidx.compose.ui.platform.r.this.getFocusOwner().e(false, true, false, dVarK0.o())) {
                java.lang.Boolean boolO2 = androidx.compose.ui.platform.r.this.getFocusOwner().o(dVarK0.o(), null, new androidx.compose.ui.platform.r.p.a(dVarK0));
                return java.lang.Boolean.valueOf(boolO2 != null ? boolO2.booleanValue() : true);
            }
            return java.lang.Boolean.TRUE;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((p231x0.b) obj).f());
        }
    }

    public static final class q implements p251z0.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p251z0.InterfaceC7386w f20313a = p251z0.InterfaceC7386w.f57607a.a();

        q() {
        }

        @Override // p251z0.y
        public void a(p251z0.InterfaceC7386w interfaceC7386w) {
            if (interfaceC7386w == null) {
                interfaceC7386w = p251z0.InterfaceC7386w.f57607a.a();
            }
            this.f20313a = interfaceC7386w;
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                androidx.compose.ui.platform.N.f19887a.a(androidx.compose.ui.platform.r.this, interfaceC7386w);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.r$r, reason: collision with other inner class name */
    static final class C0384r extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f20316E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0384r(androidx.compose.ui.viewinterop.c cVar) {
            super(0);
            this.f20316E = cVar;
        }

        public final void a() {
            androidx.compose.ui.platform.r.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f20316E);
            java.util.HashMap<F0.J, androidx.compose.ui.viewinterop.c> layoutNodeToHolder = androidx.compose.ui.platform.r.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            p247y7.W.d(layoutNodeToHolder).remove(androidx.compose.ui.platform.r.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f20316E));
            this.f20316E.setImportantForAccessibility(0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class s extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f20317D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i6) {
            super(1);
            this.f20317D = i6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            java.lang.Boolean boolK = androidx.compose.ui.focus.r.k(focusTargetNode, this.f20317D);
            return java.lang.Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    static final class t extends p247y7.AbstractC7352v implements p237x7.a {
        t() {
            super(0);
        }

        public final void a() {
            android.view.MotionEvent motionEvent = androidx.compose.ui.platform.r.this.f20259U0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    androidx.compose.ui.platform.r.this.f20261V0 = android.os.SystemClock.uptimeMillis();
                    androidx.compose.ui.platform.r rVar = androidx.compose.ui.platform.r.this;
                    rVar.post(rVar.f20265Y0);
                }
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public static final class u implements java.lang.Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.compose.ui.platform.r.this.removeCallbacks(this);
            android.view.MotionEvent motionEvent = androidx.compose.ui.platform.r.this.f20259U0;
            if (motionEvent != null) {
                boolean z6 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z6) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i6 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i6 = 2;
                }
                androidx.compose.ui.platform.r rVar = androidx.compose.ui.platform.r.this;
                rVar.O0(motionEvent, i6, rVar.f20261V0, false);
            }
        }
    }

    static final class v extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.r.v f20320D = new androidx.compose.ui.platform.r.v();

        v() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(B0.b bVar) {
            return java.lang.Boolean.FALSE;
        }
    }

    static final class w extends p247y7.AbstractC7352v implements p237x7.l {
        w() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(p237x7.a aVar) {
            aVar.b();
        }

        public final void e(final p237x7.a aVar) {
            android.os.Handler handler = androidx.compose.ui.platform.r.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                aVar.b();
                return;
            }
            android.os.Handler handler2 = androidx.compose.ui.platform.r.this.getHandler();
            if (handler2 != null) {
                handler2.post(new java.lang.Runnable() { // from class: androidx.compose.ui.platform.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.compose.ui.platform.r.w.f(aVar);
                    }
                });
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            e((p237x7.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class x extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f20322F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f20324H;

        x(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f20322F = obj;
            this.f20324H |= Integer.MIN_VALUE;
            return androidx.compose.ui.platform.r.this.u(null, this);
        }
    }

    static final class y extends p247y7.AbstractC7352v implements p237x7.l {
        y() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.V l(W8.N n6) {
            androidx.compose.ui.platform.r rVar = androidx.compose.ui.platform.r.this;
            return new androidx.compose.ui.platform.V(rVar, rVar.getTextInputService(), n6);
        }
    }

    static final class z extends p247y7.AbstractC7352v implements p237x7.a {
        z() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.r.b b() {
            return androidx.compose.ui.platform.r.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(android.content.Context context, p127m7.i iVar) {
        super(context);
        n0.g.a aVar = p131n0.g.f51312b;
        this.f20222C = aVar.b();
        this.f20224D = true;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        this.f20226E = new F0.L(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.f20228F = V.v1.h(Y0.AbstractC1858a.a(context), V.v1.m());
        K0.e eVar = new K0.e();
        this.f20230G = eVar;
        androidx.compose.ui.semantics.EmptySemanticsElement emptySemanticsElement = new androidx.compose.ui.semantics.EmptySemanticsElement(eVar);
        this.f20232H = emptySemanticsElement;
        this.f20234I = new androidx.compose.ui.focus.FocusOwnerImpl(new androidx.compose.ui.platform.r.i(this), new androidx.compose.ui.platform.r.j(this), new androidx.compose.ui.platform.r.k(this), new androidx.compose.ui.platform.r.l(this), new androidx.compose.ui.platform.r.m(this), new p247y7.AbstractC7355y(this) { // from class: androidx.compose.ui.platform.r.n
            @Override // F7.l
            public java.lang.Object get() {
                return ((androidx.compose.ui.platform.r) this.f57287D).getLayoutDirection();
            }
        });
        androidx.compose.ui.platform.DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new androidx.compose.ui.platform.DragAndDropModifierOnDragListener(new androidx.compose.ui.platform.r.h(this));
        this.f20236J = dragAndDropModifierOnDragListener;
        this.f20238K = iVar;
        this.f20240L = dragAndDropModifierOnDragListener;
        this.f20242M = new androidx.compose.ui.platform.K1();
        androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.f19586a;
        androidx.compose.ui.d dVarA = androidx.compose.ui.input.key.a.a(aVar2, new androidx.compose.ui.platform.r.p());
        this.f20244N = dVarA;
        androidx.compose.ui.d dVarA2 = androidx.compose.ui.input.rotary.a.a(aVar2, androidx.compose.ui.platform.r.v.f20320D);
        this.f20246O = dVarA2;
        this.f20248P = new p141o0.C6995r0();
        F0.J j6 = new F0.J(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        j6.e(D0.b0.f1819b);
        j6.a(getDensity());
        j6.g(aVar2.b(emptySemanticsElement).b(dVarA2).b(dVarA).b(getFocusOwner().b()).b(dragAndDropModifierOnDragListener.d()));
        this.f20250Q = j6;
        this.f20252R = this;
        this.f20254S = new K0.q(getRoot(), eVar);
        androidx.compose.ui.platform.C1984x c1984x = new androidx.compose.ui.platform.C1984x(this);
        this.f20256T = c1984x;
        this.f20258U = new p091j0.b(this, new androidx.compose.ui.platform.r.f(this));
        this.f20260V = new androidx.compose.ui.platform.C1947j(context);
        this.f20262W = p141o0.M.a(this);
        this.f20267a0 = new p081i0.w();
        this.f20269b0 = new java.util.ArrayList();
        this.f20277f0 = new p251z0.C7373i();
        this.f20279g0 = new p251z0.F(getRoot());
        this.f20280h0 = androidx.compose.ui.platform.r.e.f20306D;
        this.f20281i0 = a0() ? new p081i0.d(this, getAutofillTree()) : null;
        this.f20283k0 = new androidx.compose.ui.platform.C1950k(context);
        this.f20284l0 = new F0.q0(new androidx.compose.ui.platform.r.w());
        this.f20290r0 = new F0.V(getRoot());
        this.f20291s0 = new androidx.compose.ui.platform.C1924b0(android.view.ViewConfiguration.get(context));
        this.f20292t0 = Y0.q.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f20293u0 = new int[]{0, 0};
        float[] fArrC = p141o0.J1.c(null, 1, null);
        this.f20294v0 = fArrC;
        this.f20295w0 = p141o0.J1.c(null, 1, null);
        this.f20296x0 = p141o0.J1.c(null, 1, null);
        this.f20297y0 = -1L;
        this.f20220A0 = aVar.a();
        this.f20221B0 = true;
        this.f20223C0 = V.A1.d(null, null, 2, null);
        this.f20225D0 = V.v1.e(new androidx.compose.ui.platform.r.z());
        this.f20229F0 = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                androidx.compose.ui.platform.r.m0(this.f20149C);
            }
        };
        this.f20231G0 = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                androidx.compose.ui.platform.r.L0(this.f20159C);
            }
        };
        this.f20233H0 = new android.view.ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z6) {
                androidx.compose.ui.platform.r.R0(this.f20166C, z6);
            }
        };
        S0.Z z6 = new S0.Z(getView(), this);
        this.f20235I0 = z6;
        this.f20237J0 = new S0.X((S0.P) androidx.compose.ui.platform.S.h().l(z6));
        this.f20239K0 = p071h0.o.a();
        this.f20241L0 = new androidx.compose.ui.platform.C1971r0(getTextInputService());
        this.f20243M0 = new androidx.compose.ui.platform.U(context);
        this.f20245N0 = V.v1.h(R0.l.a(context), V.v1.m());
        this.f20247O0 = l0(context.getResources().getConfiguration());
        Y0.v vVarE = androidx.compose.ui.focus.f.e(context.getResources().getConfiguration().getLayoutDirection());
        this.f20249P0 = V.A1.d(vVarE == null ? Y0.v.Ltr : vVarE, null, 2, null);
        this.f20251Q0 = new p211v0.c(this);
        this.f20253R0 = new p221w0.c(isInTouchMode() ? p221w0.a.f56161b.b() : p221w0.a.f56161b.a(), new androidx.compose.ui.platform.r.c(), objArr2 == true ? 1 : 0);
        this.f20255S0 = new E0.f(this);
        this.f20257T0 = new androidx.compose.ui.platform.W(this);
        this.f20263W0 = new androidx.compose.ui.platform.I1();
        this.f20264X0 = new X.b(new p237x7.a[16], 0);
        this.f20265Y0 = new androidx.compose.ui.platform.r.u();
        this.f20266Z0 = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.q
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.r.M0(this.f20213C);
            }
        };
        this.f20270b1 = new androidx.compose.ui.platform.r.t();
        int i6 = android.os.Build.VERSION.SDK_INT;
        this.f20272c1 = i6 < 29 ? new androidx.compose.ui.platform.C1945i0(fArrC, objArr == true ? 1 : 0) : new androidx.compose.ui.platform.C1951k0();
        addOnAttachStateChangeListener(this.f20258U);
        setWillNotDraw(false);
        setFocusable(true);
        if (i6 >= 26) {
            androidx.compose.ui.platform.Q.f19968a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.X.n0(this, c1984x);
        p237x7.l lVarA = androidx.compose.ui.platform.H1.f19865k.a();
        if (lVarA != null) {
            lVarA.l(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().u(this);
        if (i6 >= 29) {
            androidx.compose.ui.platform.D.f19846a.a(this);
        }
        this.f20276e1 = i6 >= 31 ? new J0.l() : null;
        this.f20278f1 = new androidx.compose.ui.platform.r.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0(int i6) {
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.b()) || androidx.compose.ui.focus.d.l(i6, aVar.c())) {
            return false;
        }
        java.lang.Integer numC = androidx.compose.ui.focus.f.c(i6);
        if (numC == null) {
            throw new java.lang.IllegalStateException("Invalid focus direction".toString());
        }
        int iIntValue = numC.intValue();
        p131n0.i iVarZ0 = z0();
        android.graphics.Rect rectB = iVarZ0 != null ? p141o0.X1.b(iVarZ0) : null;
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        android.view.View viewFindNextFocus = rectB == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectB, iIntValue);
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.f.b(viewFindNextFocus, java.lang.Integer.valueOf(iIntValue), rectB);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B0(androidx.compose.ui.focus.d dVar, p131n0.i iVar) {
        java.lang.Integer numC;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((dVar == null || (numC = androidx.compose.ui.focus.f.c(dVar.o())) == null) ? 130 : numC.intValue(), iVar != null ? p141o0.X1.b(iVar) : null);
    }

    private final long C0(int i6, int i10) {
        return p087i7.G.g(p087i7.G.g(i10) | p087i7.G.g(p087i7.G.g(i6) << 32));
    }

    private final void D0() {
        if (this.f20298z0) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f20297y0) {
            this.f20297y0 = jCurrentAnimationTimeMillis;
            F0();
            android.view.ViewParent parent = getParent();
            android.view.View view = this;
            while (parent instanceof android.view.ViewGroup) {
                view = (android.view.View) parent;
                parent = ((android.view.ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f20293u0);
            int[] iArr = this.f20293u0;
            float f6 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f20293u0;
            this.f20220A0 = p131n0.h.a(f6 - iArr2[0], f10 - iArr2[1]);
        }
    }

    private final void E0(android.view.MotionEvent motionEvent) {
        this.f20297y0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        F0();
        long jF = p141o0.J1.f(this.f20295w0, p131n0.h.a(motionEvent.getX(), motionEvent.getY()));
        this.f20220A0 = p131n0.h.a(motionEvent.getRawX() - p131n0.g.m(jF), motionEvent.getRawY() - p131n0.g.n(jF));
    }

    private final void F0() {
        this.f20272c1.a(this, this.f20295w0);
        androidx.compose.ui.platform.I0.a(this.f20295w0, this.f20296x0);
    }

    private final void J0(F0.J j6) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (j6 != null) {
            while (j6 != null && j6.g0() == F0.J.g.InMeasureBlock && d0(j6)) {
                j6 = j6.o0();
            }
            if (j6 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void K0(androidx.compose.ui.platform.r rVar, F0.J j6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            j6 = null;
        }
        rVar.J0(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(androidx.compose.ui.platform.r rVar) {
        rVar.S0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(androidx.compose.ui.platform.r rVar) {
        rVar.f20268a1 = false;
        android.view.MotionEvent motionEvent = rVar.f20259U0;
        p247y7.AbstractC7350t.c(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        rVar.N0(motionEvent);
    }

    private final int N0(android.view.MotionEvent motionEvent) {
        java.lang.Object obj;
        if (this.f20274d1) {
            this.f20274d1 = false;
            this.f20242M.b(p251z0.O.b(motionEvent.getMetaState()));
        }
        p251z0.D dC = this.f20277f0.c(motionEvent, this);
        if (dC == null) {
            this.f20279g0.c();
            return p251z0.G.a(false, false);
        }
        java.util.List listB = dC.b();
        int size = listB.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i6 = size - 1;
            obj = listB.get(size);
            if (((p251z0.E) obj).b()) {
                break;
            }
            if (i6 < 0) {
                obj = null;
                break;
            }
            size = i6;
        }
        p251z0.E e6 = (p251z0.E) obj;
        if (e6 != null) {
            this.f20222C = e6.f();
        }
        int iB = this.f20279g0.b(dC, this, v0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || p251z0.S.c(iB)) {
            return iB;
        }
        this.f20277f0.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(android.view.MotionEvent motionEvent, int i6, long j6, boolean z6) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i6 != 9 && i6 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new android.view.MotionEvent.PointerProperties();
        }
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new android.view.MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            long j10 = j(p131n0.h.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = p131n0.g.m(j10);
            pointerCoords.y = p131n0.g.n(j10);
            i12++;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j6 : motionEvent.getDownTime(), j6, i6, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z6 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        p251z0.D dC = this.f20277f0.c(motionEventObtain, this);
        p247y7.AbstractC7350t.c(dC);
        this.f20279g0.b(dC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void P0(androidx.compose.ui.platform.r rVar, android.view.MotionEvent motionEvent, int i6, long j6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 8) != 0) {
            z6 = true;
        }
        rVar.O0(motionEvent, i6, j6, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q0(p101k0.h hVar, long j6, p237x7.l lVar) {
        android.content.res.Resources resources = getContext().getResources();
        p101k0.a aVar = new p101k0.a(Y0.g.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j6, lVar, null);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.compose.ui.platform.E.f19856a.a(this, hVar, aVar);
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(androidx.compose.ui.platform.r rVar, boolean z6) {
        rVar.f20253R0.b(z6 ? p221w0.a.f56161b.b() : p221w0.a.f56161b.a());
    }

    private final void S0() {
        getLocationOnScreen(this.f20293u0);
        long j6 = this.f20292t0;
        int iH = Y0.p.h(j6);
        int i6 = Y0.p.i(j6);
        int[] iArr = this.f20293u0;
        boolean z6 = false;
        int i10 = iArr[0];
        if (iH != i10 || i6 != iArr[1]) {
            this.f20292t0 = Y0.q.a(i10, iArr[1]);
            if (iH != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE) {
                getRoot().V().I().B1();
                z6 = true;
            }
        }
        this.f20290r0.c(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(int i6, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        int iE;
        if (p247y7.AbstractC7350t.b(str, this.f20256T.c0())) {
            iE = this.f20256T.e0().e(i6, -1);
            if (iE == -1) {
                return;
            }
        } else if (!p247y7.AbstractC7350t.b(str, this.f20256T.b0()) || (iE = this.f20256T.d0().e(i6, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iE);
    }

    private final boolean a0() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    private final boolean d0(F0.J j6) {
        F0.J jO0;
        return this.f20289q0 || !((jO0 = j6.o0()) == null || jO0.N());
    }

    private final void e0(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = viewGroup.getChildAt(i6);
            if (childAt instanceof androidx.compose.ui.platform.r) {
                ((androidx.compose.ui.platform.r) childAt).r();
            } else if (childAt instanceof android.view.ViewGroup) {
                e0((android.view.ViewGroup) childAt);
            }
        }
    }

    private final long f0(int i6) {
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int size = android.view.View.MeasureSpec.getSize(i6);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return C0(size, size);
                }
                throw new java.lang.IllegalStateException();
            }
            size = Integer.MAX_VALUE;
        }
        return C0(0, size);
    }

    private final void g0() {
        if (this.f20275e0) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f20275e0 = false;
        }
    }

    @p087i7.InterfaceC6659e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.r.b get_viewTreeOwners() {
        return (androidx.compose.ui.platform.r.b) this.f20223C0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View i0(int i6) {
        android.view.View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
            android.view.View rootView = getRootView();
            p247y7.AbstractC7350t.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, viewFindNextFocus, i6);
            if (viewFindNextFocus != null && !androidx.compose.ui.platform.S.e(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final android.view.View j0(int i6, android.view.View view) throws java.lang.NoSuchMethodException {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (p247y7.AbstractC7350t.b(declaredMethod.invoke(view, null), java.lang.Integer.valueOf(i6))) {
                return view;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    android.view.View viewJ0 = j0(i6, viewGroup.getChildAt(i10));
                    if (viewJ0 != null) {
                        return viewJ0;
                    }
                }
            }
        }
        return null;
    }

    private final int l0(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(androidx.compose.ui.platform.r rVar) {
        rVar.S0();
    }

    private final int n0(android.view.MotionEvent motionEvent) {
        removeCallbacks(this.f20265Y0);
        try {
            E0(motionEvent);
            this.f20298z0 = true;
            a(false);
            android.os.Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                android.view.MotionEvent motionEvent2 = this.f20259U0;
                boolean z6 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && p0(motionEvent, motionEvent2)) {
                    if (u0(motionEvent2)) {
                        this.f20279g0.c();
                    } else if (motionEvent2.getActionMasked() != 10 && z6) {
                        P0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                boolean z10 = motionEvent.getToolType(0) == 3;
                if (!z6 && z10 && actionMasked != 3 && actionMasked != 9 && v0(motionEvent)) {
                    P0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                android.view.MotionEvent motionEvent3 = this.f20259U0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    android.view.MotionEvent motionEvent4 = this.f20259U0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.f20277f0.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        android.view.MotionEvent motionEvent5 = this.f20259U0;
                        float x6 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        android.view.MotionEvent motionEvent6 = this.f20259U0;
                        boolean z11 = (x6 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        android.view.MotionEvent motionEvent7 = this.f20259U0;
                        boolean z12 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z11 || z12) {
                            if (pointerId >= 0) {
                                this.f20277f0.e(pointerId);
                            }
                            this.f20279g0.a();
                        }
                    }
                }
                this.f20259U0 = android.view.MotionEvent.obtainNoHistory(motionEvent);
                int iN0 = N0(motionEvent);
                android.os.Trace.endSection();
                this.f20298z0 = false;
                return iN0;
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.f20298z0 = false;
            throw th2;
        }
    }

    private final boolean o0(android.view.MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f6 = -motionEvent.getAxisValue(26);
        return getFocusOwner().c(new B0.b(f6 * androidx.core.view.AbstractC1993b0.j(viewConfiguration, getContext()), f6 * androidx.core.view.AbstractC1993b0.f(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean p0(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void r0(F0.J j6) {
        j6.E0();
        X.b bVarW0 = j6.w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            int i6 = 0;
            do {
                r0((F0.J) objArrS[i6]);
                i6++;
            } while (i6 < iT);
        }
    }

    private final void s0(F0.J j6) {
        int i6 = 0;
        F0.V.G(this.f20290r0, j6, false, 2, null);
        X.b bVarW0 = j6.w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarW0.s();
            do {
                s0((F0.J) objArrS[i6]);
                i6++;
            } while (i6 < iT);
        }
    }

    private void setDensity(Y0.e eVar) {
        this.f20228F.setValue(eVar);
    }

    private void setFontFamilyResolver(R0.AbstractC1494h.b bVar) {
        this.f20245N0.setValue(bVar);
    }

    private void setLayoutDirection(Y0.v vVar) {
        this.f20249P0.setValue(vVar);
    }

    private final void set_viewTreeOwners(androidx.compose.ui.platform.r.b bVar) {
        this.f20223C0.setValue(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    private final boolean t0(android.view.MotionEvent motionEvent) {
        boolean z6;
        float x6 = motionEvent.getX();
        if (java.lang.Float.isInfinite(x6) || java.lang.Float.isNaN(x6)) {
            z6 = true;
        } else {
            float y6 = motionEvent.getY();
            if (java.lang.Float.isInfinite(y6) || java.lang.Float.isNaN(y6)) {
                z6 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (java.lang.Float.isInfinite(rawX) || java.lang.Float.isNaN(rawX)) {
                    z6 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (java.lang.Float.isInfinite(rawY) || java.lang.Float.isNaN(rawY)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
        }
        if (!z6) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i6 = 1; i6 < pointerCount; i6++) {
                float x10 = motionEvent.getX(i6);
                if (java.lang.Float.isInfinite(x10) || java.lang.Float.isNaN(x10)) {
                    z6 = true;
                } else {
                    float y10 = motionEvent.getY(i6);
                    if (java.lang.Float.isInfinite(y10) || java.lang.Float.isNaN(y10) || (android.os.Build.VERSION.SDK_INT >= 29 && !androidx.compose.ui.platform.M0.f19883a.a(motionEvent, i6))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    break;
                }
            }
        }
        return z6;
    }

    private final boolean u0(android.view.MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean v0(android.view.MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        return 0.0f <= x6 && x6 <= ((float) getWidth()) && 0.0f <= y6 && y6 <= ((float) getHeight());
    }

    private final boolean w0(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f20259U0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p131n0.i z0() {
        if (isFocused()) {
            return getFocusOwner().h();
        }
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.f.a(viewFindFocus);
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void D(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.b(this, rVar);
    }

    public final boolean G0(F0.m0 m0Var) {
        if (this.f20287o0 != null) {
            androidx.compose.ui.platform.B1.f19815R.b();
        }
        this.f20263W0.c(m0Var);
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void H(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.e(this, rVar);
    }

    public final void H0(androidx.compose.ui.viewinterop.c cVar) {
        x(new androidx.compose.ui.platform.r.C0384r(cVar));
    }

    public final void I0() {
        this.f20282j0 = true;
    }

    public final void Y(androidx.compose.ui.viewinterop.c cVar, F0.J j6) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(cVar, j6);
        getAndroidViewsHandler$ui_release().addView(cVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(j6, cVar);
        cVar.setImportantForAccessibility(1);
        androidx.core.view.X.n0(cVar, new androidx.compose.ui.platform.r.d(j6, this));
    }

    @Override // F0.o0
    public void a(boolean z6) {
        p237x7.a aVar;
        if (this.f20290r0.m() || this.f20290r0.n()) {
            android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z6) {
                try {
                    aVar = this.f20270b1;
                } finally {
                    android.os.Trace.endSection();
                }
            } else {
                aVar = null;
            }
            if (this.f20290r0.r(aVar)) {
                requestLayout();
            }
            F0.V.d(this.f20290r0, false, 1, null);
            g0();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6) {
        p247y7.AbstractC7350t.c(view);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, int i10) {
        android.view.ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i6;
        layoutParamsGenerateDefaultLayoutParams.height = i10;
        p087i7.M m6 = p087i7.M.f46721a;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i6, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.View
    public void autofill(android.util.SparseArray sparseArray) {
        p081i0.d dVar;
        if (!a0() || (dVar = this.f20281i0) == null) {
            return;
        }
        p081i0.f.a(dVar, sparseArray);
    }

    @Override // F0.o0
    public void b(F0.J j6) {
    }

    public final java.lang.Object b0(p127m7.e eVar) {
        java.lang.Object objM = this.f20256T.M(eVar);
        return objM == p137n7.b.g() ? objM : p087i7.M.f46721a;
    }

    @Override // F0.o0
    public long c(long j6) {
        D0();
        return p141o0.J1.f(this.f20295w0, j6);
    }

    public final java.lang.Object c0(p127m7.e eVar) {
        java.lang.Object objB = this.f20258U.b(eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i6) {
        return this.f20256T.N(false, i6, this.f20222C);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i6) {
        return this.f20256T.N(true, i6, this.f20222C);
    }

    @Override // F0.o0
    public long d(long j6) {
        D0();
        return p141o0.J1.f(this.f20296x0, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            r0(getRoot());
        }
        F0.n0.c(this, false, 1, null);
        p051f0.k.f44821e.n();
        this.f20273d0 = true;
        p141o0.C6995r0 c6995r0 = this.f20248P;
        android.graphics.Canvas canvasA = c6995r0.a().a();
        c6995r0.a().w(canvas);
        getRoot().B(c6995r0.a(), null);
        c6995r0.a().w(canvasA);
        if (true ^ this.f20269b0.isEmpty()) {
            int size = this.f20269b0.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((F0.m0) this.f20269b0.get(i6)).j();
            }
        }
        if (androidx.compose.ui.platform.B1.f19815R.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f20269b0.clear();
        this.f20273d0 = false;
        java.util.List list = this.f20271c0;
        if (list != null) {
            p247y7.AbstractC7350t.c(list);
            this.f20269b0.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (this.f20268a1) {
            removeCallbacks(this.f20266Z0);
            if (motionEvent.getActionMasked() == 8) {
                this.f20268a1 = false;
            } else {
                this.f20266Z0.run();
            }
        }
        if (motionEvent.getActionMasked() == 8 && !t0(motionEvent) && isAttachedToWindow()) {
            return motionEvent.isFromSource(4194304) ? o0(motionEvent) : p251z0.S.c(n0(motionEvent));
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        if (this.f20268a1) {
            removeCallbacks(this.f20266Z0);
            this.f20266Z0.run();
        }
        if (t0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f20256T.V(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && v0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                android.view.MotionEvent motionEvent2 = this.f20259U0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f20259U0 = android.view.MotionEvent.obtainNoHistory(motionEvent);
                this.f20268a1 = true;
                postDelayed(this.f20266Z0, 8L);
                return false;
            }
        } else if (!w0(motionEvent)) {
            return false;
        }
        return p251z0.S.c(n0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().j(p231x0.b.b(keyEvent), new androidx.compose.ui.platform.r.g(keyEvent));
        }
        this.f20242M.b(p251z0.O.b(keyEvent.getMetaState()));
        return p121m0.h.a(getFocusOwner(), p231x0.b.b(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().l(p231x0.b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(android.view.ViewStructure viewStructure) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            androidx.compose.ui.platform.B.f19814a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f20268a1) {
            removeCallbacks(this.f20266Z0);
            android.view.MotionEvent motionEvent2 = this.f20259U0;
            p247y7.AbstractC7350t.c(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || p0(motionEvent, motionEvent2)) {
                this.f20266Z0.run();
            } else {
                this.f20268a1 = false;
            }
        }
        if (t0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !w0(motionEvent)) {
            return false;
        }
        int iN0 = n0(motionEvent);
        if (p251z0.S.b(iN0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return p251z0.S.c(iN0);
    }

    @Override // F0.o0
    public void e(android.view.View view) {
        this.f20275e0 = true;
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public void f(androidx.lifecycle.r rVar) {
        setShowLayoutBounds(f20216g1.b());
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int i6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        android.view.View viewJ0 = null;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.Object objInvoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(i6));
                if (objInvoke instanceof android.view.View) {
                    viewJ0 = (android.view.View) objInvoke;
                }
            } else {
                viewJ0 = j0(i6, this);
            }
        } catch (java.lang.NoSuchMethodException unused) {
        }
        return viewJ0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View view, int i6) {
        if (view != null) {
            p131n0.i iVarA = androidx.compose.ui.focus.f.a(view);
            androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.f.d(i6);
            if (p247y7.AbstractC7350t.b(getFocusOwner().o(dVarD != null ? dVarD.o() : androidx.compose.ui.focus.d.f19669b.a(), iVarA, androidx.compose.ui.platform.r.o.f20309D), java.lang.Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i6);
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void g(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.a(this, rVar);
    }

    @Override // F0.o0
    public androidx.compose.ui.platform.C1947j getAccessibilityManager() {
        return this.f20260V;
    }

    public final androidx.compose.ui.platform.C1936f0 getAndroidViewsHandler$ui_release() {
        if (this.f20286n0 == null) {
            androidx.compose.ui.platform.C1936f0 c1936f0 = new androidx.compose.ui.platform.C1936f0(getContext());
            this.f20286n0 = c1936f0;
            addView(c1936f0);
            requestLayout();
        }
        androidx.compose.ui.platform.C1936f0 c1936f1 = this.f20286n0;
        p247y7.AbstractC7350t.c(c1936f1);
        return c1936f1;
    }

    @Override // F0.o0
    public p081i0.g getAutofill() {
        return this.f20281i0;
    }

    @Override // F0.o0
    public p081i0.w getAutofillTree() {
        return this.f20267a0;
    }

    @Override // F0.o0
    public androidx.compose.ui.platform.C1950k getClipboardManager() {
        return this.f20283k0;
    }

    public final p237x7.l getConfigurationChangeObserver() {
        return this.f20280h0;
    }

    public final p091j0.b getContentCaptureManager$ui_release() {
        return this.f20258U;
    }

    @Override // F0.o0
    public p127m7.i getCoroutineContext() {
        return this.f20238K;
    }

    @Override // F0.o0
    public Y0.e getDensity() {
        return (Y0.e) this.f20228F.getValue();
    }

    @Override // F0.o0
    public p101k0.c getDragAndDropManager() {
        return this.f20240L;
    }

    @Override // F0.o0
    public p121m0.i getFocusOwner() {
        return this.f20234I;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        p087i7.M m6;
        p131n0.i iVarZ0 = z0();
        if (iVarZ0 != null) {
            rect.left = java.lang.Math.round(iVarZ0.i());
            rect.top = java.lang.Math.round(iVarZ0.l());
            rect.right = java.lang.Math.round(iVarZ0.j());
            rect.bottom = java.lang.Math.round(iVarZ0.e());
            m6 = p087i7.M.f46721a;
        } else {
            m6 = null;
        }
        if (m6 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // F0.o0
    public R0.AbstractC1494h.b getFontFamilyResolver() {
        return (R0.AbstractC1494h.b) this.f20245N0.getValue();
    }

    @Override // F0.o0
    public R0.InterfaceC1493g getFontLoader() {
        return this.f20243M0;
    }

    @Override // F0.o0
    public p141o0.C1 getGraphicsContext() {
        return this.f20262W;
    }

    @Override // F0.o0
    public p211v0.a getHapticFeedBack() {
        return this.f20251Q0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f20290r0.m();
    }

    @Override // F0.o0
    public p221w0.b getInputModeManager() {
        return this.f20253R0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f20297y0;
    }

    @Override // android.view.View, android.view.ViewParent, F0.o0
    public Y0.v getLayoutDirection() {
        return (Y0.v) this.f20249P0.getValue();
    }

    public long getMeasureIteration() {
        return this.f20290r0.q();
    }

    @Override // F0.o0
    public E0.f getModifierLocalManager() {
        return this.f20255S0;
    }

    @Override // F0.o0
    public D0.X.a getPlacementScope() {
        return D0.Y.b(this);
    }

    @Override // F0.o0
    public p251z0.y getPointerIconService() {
        return this.f20278f1;
    }

    @Override // F0.o0
    public F0.J getRoot() {
        return this.f20250Q;
    }

    public F0.x0 getRootForTest() {
        return this.f20252R;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        J0.l lVar;
        if (android.os.Build.VERSION.SDK_INT < 31 || (lVar = this.f20276e1) == null) {
            return false;
        }
        return lVar.c();
    }

    public K0.q getSemanticsOwner() {
        return this.f20254S;
    }

    @Override // F0.o0
    public F0.L getSharedDrawScope() {
        return this.f20226E;
    }

    @Override // F0.o0
    public boolean getShowLayoutBounds() {
        return this.f20285m0;
    }

    @Override // F0.o0
    public F0.q0 getSnapshotObserver() {
        return this.f20284l0;
    }

    @Override // F0.o0
    public androidx.compose.ui.platform.InterfaceC1975s1 getSoftwareKeyboardController() {
        return this.f20241L0;
    }

    @Override // F0.o0
    public S0.X getTextInputService() {
        return this.f20237J0;
    }

    @Override // F0.o0
    public androidx.compose.ui.platform.t1 getTextToolbar() {
        return this.f20257T0;
    }

    public android.view.View getView() {
        return this;
    }

    @Override // F0.o0
    public androidx.compose.ui.platform.A1 getViewConfiguration() {
        return this.f20291s0;
    }

    public final androidx.compose.ui.platform.r.b getViewTreeOwners() {
        return (androidx.compose.ui.platform.r.b) this.f20225D0.getValue();
    }

    @Override // F0.o0
    public androidx.compose.ui.platform.J1 getWindowInfo() {
        return this.f20242M;
    }

    @Override // F0.o0
    public void h(F0.J j6, boolean z6, boolean z10) {
        if (z6) {
            if (!this.f20290r0.B(j6, z10)) {
                return;
            }
        } else if (!this.f20290r0.E(j6, z10)) {
            return;
        }
        K0(this, null, 1, null);
    }

    public final void h0(androidx.compose.ui.viewinterop.c cVar, android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(cVar, canvas);
    }

    @Override // p251z0.Q
    public long j(long j6) {
        D0();
        long jF = p141o0.J1.f(this.f20295w0, j6);
        return p131n0.h.a(p131n0.g.m(jF) + p131n0.g.m(this.f20220A0), p131n0.g.n(jF) + p131n0.g.n(this.f20220A0));
    }

    @Override // p251z0.Q
    public void k(float[] fArr) {
        D0();
        p141o0.J1.n(fArr, this.f20295w0);
        androidx.compose.ui.platform.S.j(fArr, p131n0.g.m(this.f20220A0), p131n0.g.n(this.f20220A0), this.f20294v0);
    }

    public androidx.compose.ui.focus.d k0(android.view.KeyEvent keyEvent) {
        int iC;
        long jA = p231x0.d.a(keyEvent);
        p231x0.a.C0751a c0751a = p231x0.a.f56741b;
        if (p231x0.a.p(jA, c0751a.l())) {
            iC = p231x0.d.f(keyEvent) ? androidx.compose.ui.focus.d.f19669b.f() : androidx.compose.ui.focus.d.f19669b.e();
        } else if (p231x0.a.p(jA, c0751a.e())) {
            iC = androidx.compose.ui.focus.d.f19669b.g();
        } else if (p231x0.a.p(jA, c0751a.d())) {
            iC = androidx.compose.ui.focus.d.f19669b.d();
        } else {
            if (p231x0.a.p(jA, c0751a.f()) ? true : p231x0.a.p(jA, c0751a.k())) {
                iC = androidx.compose.ui.focus.d.f19669b.h();
            } else {
                if (p231x0.a.p(jA, c0751a.c()) ? true : p231x0.a.p(jA, c0751a.j())) {
                    iC = androidx.compose.ui.focus.d.f19669b.a();
                } else {
                    if (p231x0.a.p(jA, c0751a.b()) ? true : p231x0.a.p(jA, c0751a.g()) ? true : p231x0.a.p(jA, c0751a.i())) {
                        iC = androidx.compose.ui.focus.d.f19669b.b();
                    } else {
                        if (!(p231x0.a.p(jA, c0751a.a()) ? true : p231x0.a.p(jA, c0751a.h()))) {
                            return null;
                        }
                        iC = androidx.compose.ui.focus.d.f19669b.c();
                    }
                }
            }
        }
        return androidx.compose.ui.focus.d.i(iC);
    }

    @Override // F0.o0
    public void l(F0.J j6, long j10) {
        android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f20290r0.s(j6, j10);
            if (!this.f20290r0.m()) {
                F0.V.d(this.f20290r0, false, 1, null);
                g0();
            }
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // F0.o0
    public void m(F0.J j6) {
        this.f20290r0.v(j6);
        I0();
    }

    @Override // F0.o0
    public void n(F0.J j6) {
        this.f20290r0.D(j6);
        K0(this, null, 1, null);
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void o(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.c(this, rVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.lifecycle.r rVarA;
        androidx.lifecycle.AbstractC2079k abstractC2079kU;
        androidx.lifecycle.r rVarA2;
        p081i0.d dVar;
        super.onAttachedToWindow();
        this.f20242M.c(hasWindowFocus());
        s0(getRoot());
        r0(getRoot());
        getSnapshotObserver().k();
        if (a0() && (dVar = this.f20281i0) != null) {
            p081i0.v.f46624a.a(dVar);
        }
        androidx.lifecycle.r rVarA3 = androidx.lifecycle.Z.a(this);
        p233x2.f fVarA = p233x2.g.a(this);
        androidx.compose.ui.platform.r.b viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.AbstractC2079k abstractC2079kU2 = null;
        if (viewTreeOwners == null || (rVarA3 != null && fVarA != null && (rVarA3 != viewTreeOwners.a() || fVarA != viewTreeOwners.a()))) {
            if (rVarA3 == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarA == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (rVarA = viewTreeOwners.a()) != null && (abstractC2079kU = rVarA.u()) != null) {
                abstractC2079kU.d(this);
            }
            rVarA3.u().a(this);
            androidx.compose.ui.platform.r.b bVar = new androidx.compose.ui.platform.r.b(rVarA3, fVarA);
            set_viewTreeOwners(bVar);
            p237x7.l lVar = this.f20227E0;
            if (lVar != null) {
                lVar.l(bVar);
            }
            this.f20227E0 = null;
        }
        this.f20253R0.b(isInTouchMode() ? p221w0.a.f56161b.b() : p221w0.a.f56161b.a());
        androidx.compose.ui.platform.r.b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (rVarA2 = viewTreeOwners2.a()) != null) {
            abstractC2079kU2 = rVarA2.u();
        }
        if (abstractC2079kU2 == null) {
            C0.a.c("No lifecycle owner exists");
            throw new p087i7.C6665k();
        }
        abstractC2079kU2.a(this);
        abstractC2079kU2.a(this.f20258U);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f20229F0);
        getViewTreeObserver().addOnScrollChangedListener(this.f20231G0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f20233H0);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.J.f19870a.b(this);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        androidx.compose.ui.platform.V v6 = (androidx.compose.ui.platform.V) p071h0.o.c(this.f20239K0);
        return v6 == null ? this.f20235I0.r() : v6.f();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(Y0.AbstractC1858a.a(getContext()));
        if (l0(configuration) != this.f20247O0) {
            this.f20247O0 = l0(configuration);
            setFontFamilyResolver(R0.l.a(getContext()));
        }
        this.f20280h0.l(configuration);
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        androidx.compose.ui.platform.V v6 = (androidx.compose.ui.platform.V) p071h0.o.c(this.f20239K0);
        return v6 == null ? this.f20235I0.o(editorInfo) : v6.e(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, java.util.function.Consumer consumer) {
        this.f20258U.s(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        p081i0.d dVar;
        androidx.lifecycle.r rVarA;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        androidx.compose.ui.platform.r.b viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.AbstractC2079k abstractC2079kU = (viewTreeOwners == null || (rVarA = viewTreeOwners.a()) == null) ? null : rVarA.u();
        if (abstractC2079kU == null) {
            C0.a.c("No lifecycle owner exists");
            throw new p087i7.C6665k();
        }
        abstractC2079kU.d(this.f20258U);
        abstractC2079kU.d(this);
        if (a0() && (dVar = this.f20281i0) != null) {
            p081i0.v.f46624a.b(dVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f20229F0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f20231G0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f20233H0);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.J.f19870a.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z6, int i6, android.graphics.Rect rect) {
        super.onFocusChanged(z6, i6, rect);
        if (z6 || hasFocus()) {
            return;
        }
        getFocusOwner().m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        this.f20290r0.r(this.f20270b1);
        this.f20288p0 = null;
        S0();
        if (this.f20286n0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i11 - i6, i12 - i10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        android.os.Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                s0(getRoot());
            }
            long jF0 = f0(i6);
            int iG = (int) p087i7.G.g(jF0 >>> 32);
            int iG2 = (int) p087i7.G.g(jF0 & 4294967295L);
            long jF1 = f0(i10);
            long jA = Y0.C1859b.f16201b.a(iG, iG2, (int) p087i7.G.g(jF1 >>> 32), (int) p087i7.G.g(4294967295L & jF1));
            Y0.C1859b c1859b = this.f20288p0;
            boolean zF = false;
            if (c1859b == null) {
                this.f20288p0 = Y0.C1859b.a(jA);
                this.f20289q0 = false;
            } else {
                if (c1859b != null) {
                    zF = Y0.C1859b.f(c1859b.r(), jA);
                }
                if (!zF) {
                    this.f20289q0 = true;
                }
            }
            this.f20290r0.H(jA);
            this.f20290r0.t();
            setMeasuredDimension(getRoot().t0(), getRoot().O());
            if (this.f20286n0 != null) {
                getAndroidViewsHandler$ui_release().measure(android.view.View.MeasureSpec.makeMeasureSpec(getRoot().t0(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getRoot().O(), 1073741824));
            }
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i6) {
        p081i0.d dVar;
        if (!a0() || viewStructure == null || (dVar = this.f20281i0) == null) {
            return;
        }
        p081i0.f.b(dVar, viewStructure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i6) {
        if (this.f20224D) {
            Y0.v vVarE = androidx.compose.ui.focus.f.e(i6);
            if (vVarE == null) {
                vVarE = Y0.v.Ltr;
            }
            setLayoutDirection(vVarE);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect rect, android.graphics.Point point, java.util.function.Consumer consumer) {
        J0.l lVar;
        if (android.os.Build.VERSION.SDK_INT < 31 || (lVar = this.f20276e1) == null) {
            return;
        }
        lVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(android.util.LongSparseArray longSparseArray) {
        p091j0.b bVar = this.f20258U;
        bVar.x(bVar, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        boolean zB;
        this.f20242M.c(z6);
        this.f20274d1 = true;
        super.onWindowFocusChanged(z6);
        if (!z6 || getShowLayoutBounds() == (zB = f20216g1.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        q0();
    }

    @Override // F0.o0
    public void p(F0.J j6, boolean z6) {
        this.f20290r0.i(j6, z6);
    }

    @Override // F0.o0
    public void q(F0.J j6, boolean z6, boolean z10, boolean z11) {
        if (z6) {
            if (!this.f20290r0.C(j6, z10) || !z11) {
                return;
            }
        } else if (!this.f20290r0.F(j6, z10) || !z11) {
            return;
        }
        J0(j6);
    }

    public void q0() {
        r0(getRoot());
    }

    @Override // F0.o0
    public void r() {
        if (this.f20282j0) {
            getSnapshotObserver().b();
            this.f20282j0 = false;
        }
        androidx.compose.ui.platform.C1936f0 c1936f0 = this.f20286n0;
        if (c1936f0 != null) {
            e0(c1936f0);
        }
        while (this.f20264X0.x()) {
            int iT = this.f20264X0.t();
            for (int i6 = 0; i6 < iT; i6++) {
                p237x7.a aVar = (p237x7.a) this.f20264X0.s()[i6];
                this.f20264X0.J(i6, null);
                if (aVar != null) {
                    aVar.b();
                }
            }
            this.f20264X0.E(0, iT);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i6, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().f().e()) {
            return super.requestFocus(i6, rect);
        }
        androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.f.d(i6);
        int iO = dVarD != null ? dVarD.o() : androidx.compose.ui.focus.d.f19669b.b();
        java.lang.Boolean boolO = getFocusOwner().o(iO, rect != null ? p141o0.X1.e(rect) : null, new androidx.compose.ui.platform.r.s(iO));
        if (boolO != null) {
            return boolO.booleanValue();
        }
        return false;
    }

    @Override // p251z0.Q
    public long s(long j6) {
        D0();
        return p141o0.J1.f(this.f20296x0, p131n0.h.a(p131n0.g.m(j6) - p131n0.g.m(this.f20220A0), p131n0.g.n(j6) - p131n0.g.n(this.f20220A0)));
    }

    public void setAccessibilityEventBatchIntervalMillis(long j6) {
        this.f20256T.S0(j6);
    }

    public final void setConfigurationChangeObserver(p237x7.l lVar) {
        this.f20280h0 = lVar;
    }

    public final void setContentCaptureManager$ui_release(p091j0.b bVar) {
        this.f20258U = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public void setCoroutineContext(p127m7.i iVar) {
        this.f20238K = iVar;
        F0.InterfaceC0924j interfaceC0924jK = getRoot().k0().k();
        if (interfaceC0924jK instanceof p251z0.W) {
            ((p251z0.W) interfaceC0924jK).o1();
        }
        int iA = F0.AbstractC0918f0.a(16);
        if (!interfaceC0924jK.E0().A1()) {
            C0.a.b("visitSubtree called on an unattached node");
        }
        androidx.compose.ui.d.c cVarR1 = interfaceC0924jK.E0().r1();
        F0.J jM = F0.AbstractC0925k.m(interfaceC0924jK);
        F0.C0908a0 c0908a0 = new F0.C0908a0();
        while (jM != null) {
            if (cVarR1 == null) {
                cVarR1 = jM.k0().k();
            }
            if ((cVarR1.q1() & iA) != 0) {
                while (cVarR1 != null) {
                    if ((cVarR1.v1() & iA) != 0) {
                        ?? G10 = cVarR1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            if (G10 instanceof F0.v0) {
                                F0.v0 v0Var = (F0.v0) G10;
                                if (v0Var instanceof p251z0.W) {
                                    ((p251z0.W) v0Var).o1();
                                }
                            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                int i6 = 0;
                                G10 = G10;
                                bVar = bVar;
                                while (cVarU1 != null) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            bVar = bVar;
                                            G10 = cVarU1;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (G10 != 0) {
                                                bVar.d(G10);
                                                G10 = 0;
                                            }
                                            bVar.d(cVarU1);
                                        }
                                    }
                                    cVarU1 = cVarU1.r1();
                                    G10 = G10;
                                    bVar = bVar;
                                }
                                if (i6 == 1) {
                                }
                            }
                            G10 = F0.AbstractC0925k.g(bVar);
                        }
                    }
                    cVarR1 = cVarR1.r1();
                }
            }
            c0908a0.c(jM.w0());
            jM = c0908a0.a() ? (F0.J) c0908a0.b() : null;
            cVarR1 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j6) {
        this.f20297y0 = j6;
    }

    public final void setOnViewTreeOwnersAvailable(p237x7.l lVar) {
        androidx.compose.ui.platform.r.b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.l(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f20227E0 = lVar;
    }

    @Override // F0.o0
    public void setShowLayoutBounds(boolean z6) {
        this.f20285m0 = z6;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // F0.o0
    public void t() {
        this.f20256T.u0();
        this.f20258U.v();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // F0.o0
    public java.lang.Object u(p237x7.p pVar, p127m7.e eVar) {
        androidx.compose.ui.platform.r.x xVar;
        if (eVar instanceof androidx.compose.ui.platform.r.x) {
            xVar = (androidx.compose.ui.platform.r.x) eVar;
            int i6 = xVar.f20324H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xVar.f20324H = i6 - Integer.MIN_VALUE;
            } else {
                xVar = new androidx.compose.ui.platform.r.x(eVar);
            }
        } else {
            xVar = new androidx.compose.ui.platform.r.x(eVar);
        }
        java.lang.Object obj = xVar.f20322F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = xVar.f20324H;
        if (i10 == 0) {
            p087i7.x.b(obj);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f20239K0;
            androidx.compose.ui.platform.r.y yVar = new androidx.compose.ui.platform.r.y();
            xVar.f20324H = 1;
            if (p071h0.o.d(atomicReference, yVar, pVar, xVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
        }
        throw new p087i7.C6665k();
    }

    @Override // F0.o0
    public F0.m0 v(p237x7.p pVar, p237x7.a aVar, p171r0.C7053c c7053c) {
        if (c7053c != null) {
            return new androidx.compose.ui.platform.C1989z0(c7053c, null, this, pVar, aVar);
        }
        F0.m0 m0Var = (F0.m0) this.f20263W0.b();
        if (m0Var != null) {
            m0Var.c(pVar, aVar);
            return m0Var;
        }
        if (isHardwareAccelerated() && android.os.Build.VERSION.SDK_INT != 28) {
            return new androidx.compose.ui.platform.C1989z0(getGraphicsContext().b(), getGraphicsContext(), this, pVar, aVar);
        }
        if (isHardwareAccelerated() && this.f20221B0) {
            try {
                return new androidx.compose.ui.platform.C1949j1(this, pVar, aVar);
            } catch (java.lang.Throwable unused) {
                this.f20221B0 = false;
            }
        }
        if (this.f20287o0 == null) {
            androidx.compose.ui.platform.B1.c cVar = androidx.compose.ui.platform.B1.f19815R;
            if (!cVar.a()) {
                cVar.d(new android.view.View(getContext()));
            }
            androidx.compose.ui.platform.C1983w0 c1983w0 = cVar.b() ? new androidx.compose.ui.platform.C1983w0(getContext()) : new androidx.compose.ui.platform.C1(getContext());
            this.f20287o0 = c1983w0;
            addView(c1983w0);
        }
        androidx.compose.ui.platform.C1983w0 c1983w1 = this.f20287o0;
        p247y7.AbstractC7350t.c(c1983w1);
        return new androidx.compose.ui.platform.B1(this, c1983w1, pVar, aVar);
    }

    @Override // F0.o0
    public void w(F0.J j6) {
        this.f20256T.t0(j6);
        this.f20258U.u(j6);
    }

    @Override // F0.o0
    public void x(p237x7.a aVar) {
        if (this.f20264X0.l(aVar)) {
            return;
        }
        this.f20264X0.d(aVar);
    }

    public final void x0(F0.m0 m0Var, boolean z6) {
        java.util.List arrayList;
        if (z6) {
            if (this.f20273d0) {
                arrayList = this.f20271c0;
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    this.f20271c0 = arrayList;
                }
            } else {
                arrayList = this.f20269b0;
            }
            arrayList.add(m0Var);
            return;
        }
        if (this.f20273d0) {
            return;
        }
        this.f20269b0.remove(m0Var);
        java.util.List list = this.f20271c0;
        if (list != null) {
            list.remove(m0Var);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2073e
    public /* synthetic */ void y(androidx.lifecycle.r rVar) {
        androidx.lifecycle.AbstractC2072d.f(this, rVar);
    }
}
