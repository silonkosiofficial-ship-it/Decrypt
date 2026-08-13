package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.compose.ui.platform.AbstractC1920a implements androidx.compose.ui.platform.G1 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final androidx.compose.ui.window.l.c f20655h0 = new androidx.compose.ui.window.l.c(null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f20656i0 = 8;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final p237x7.l f20657j0 = androidx.compose.ui.window.l.b.f20678D;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private p237x7.a f20658K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private androidx.compose.ui.window.s f20659L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.lang.String f20660M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final android.view.View f20661N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final androidx.compose.ui.window.n f20662O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.view.WindowManager f20663P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final android.view.WindowManager.LayoutParams f20664Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private androidx.compose.ui.window.r f20665R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Y0.v f20666S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20667T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20668U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Y0.r f20669V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final V.G1 f20670W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final float f20671a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final android.graphics.Rect f20672b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final p051f0.u f20673c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private java.lang.Object f20674d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20675e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f20676f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final int[] f20677g0;

    public static final class a extends android.view.ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, android.graphics.Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.window.l.b f20678D = new androidx.compose.ui.window.l.b();

        b() {
            super(1);
        }

        public final void a(androidx.compose.ui.window.l lVar) {
            if (lVar.isAttachedToWindow()) {
                lVar.y();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.window.l) obj);
            return p087i7.M.f46721a;
        }
    }

    private static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f20680E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i6) {
            super(2);
            this.f20680E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.ui.window.l.this.b(interfaceC1734n, V.S0.a(this.f20680E | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20681a;

        static {
            int[] iArr = new int[Y0.v.values().length];
            try {
                iArr[Y0.v.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.v.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f20681a = iArr;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {
        f() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            D0.InterfaceC0900t parentLayoutCoordinates = androidx.compose.ui.window.l.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.K()) {
                parentLayoutCoordinates = null;
            }
            return java.lang.Boolean.valueOf((parentLayoutCoordinates == null || androidx.compose.ui.window.l.this.m2getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(p237x7.a aVar) {
            aVar.b();
        }

        public final void e(final p237x7.a aVar) {
            android.os.Handler handler = androidx.compose.ui.window.l.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                aVar.b();
                return;
            }
            android.os.Handler handler2 = androidx.compose.ui.window.l.this.getHandler();
            if (handler2 != null) {
                handler2.post(new java.lang.Runnable() { // from class: androidx.compose.ui.window.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.compose.ui.window.l.g.f(aVar);
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

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.N f20684D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.l f20685E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ Y0.r f20686F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f20687G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f20688H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p247y7.N n6, androidx.compose.ui.window.l lVar, Y0.r rVar, long j6, long j10) {
            super(0);
            this.f20684D = n6;
            this.f20685E = lVar;
            this.f20686F = rVar;
            this.f20687G = j6;
            this.f20688H = j10;
        }

        public final void a() {
            this.f20684D.f57253C = this.f20685E.getPositionProvider().a(this.f20686F, this.f20687G, this.f20685E.getParentLayoutDirection(), this.f20688H);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public l(p237x7.a aVar, androidx.compose.ui.window.s sVar, java.lang.String str, android.view.View view, Y0.e eVar, androidx.compose.ui.window.r rVar, java.util.UUID uuid, androidx.compose.ui.window.n nVar) {
        super(view.getContext(), null, 0, 6, null);
        this.f20658K = aVar;
        this.f20659L = sVar;
        this.f20660M = str;
        this.f20661N = view;
        this.f20662O = nVar;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f20663P = (android.view.WindowManager) systemService;
        this.f20664Q = m();
        this.f20665R = rVar;
        this.f20666S = Y0.v.Ltr;
        this.f20667T = V.A1.d(null, null, 2, null);
        this.f20668U = V.A1.d(null, null, 2, null);
        this.f20670W = V.v1.e(new androidx.compose.ui.window.l.f());
        float fQ = Y0.i.q(8);
        this.f20671a0 = fQ;
        this.f20672b0 = new android.graphics.Rect();
        this.f20673c0 = new p051f0.u(new androidx.compose.ui.window.l.g());
        setId(android.R.id.content);
        androidx.lifecycle.Z.b(this, androidx.lifecycle.Z.a(view));
        androidx.lifecycle.a0.b(this, androidx.lifecycle.a0.a(view));
        p233x2.g.b(this, p233x2.g.a(view));
        setTag(p071h0.l.f45812H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(eVar.B0(fQ));
        setOutlineProvider(new androidx.compose.ui.window.l.a());
        this.f20675e0 = V.A1.d(androidx.compose.ui.window.g.f20633a.a(), null, 2, null);
        this.f20677g0 = new int[2];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(p237x7.a aVar, androidx.compose.ui.window.s sVar, java.lang.String str, android.view.View view, Y0.e eVar, androidx.compose.ui.window.r rVar, java.util.UUID uuid, androidx.compose.ui.window.n nVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        androidx.compose.ui.window.n pVar;
        if ((i6 & 128) != 0) {
            pVar = android.os.Build.VERSION.SDK_INT >= 29 ? new androidx.compose.ui.window.p() : new androidx.compose.ui.window.q();
        } else {
            pVar = nVar;
        }
        this(aVar, sVar, str, view, eVar, rVar, uuid, pVar);
    }

    private final p237x7.p getContent() {
        return (p237x7.p) this.f20675e0.getValue();
    }

    private final int getDisplayHeight() {
        return java.lang.Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return java.lang.Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0.InterfaceC0900t getParentLayoutCoordinates() {
        return (D0.InterfaceC0900t) this.f20668U.getValue();
    }

    private final android.view.WindowManager.LayoutParams m() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.b.h(this.f20659L, androidx.compose.ui.window.b.i(this.f20661N));
        layoutParams.type = 1002;
        layoutParams.token = this.f20661N.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f20661N.getContext().getResources().getString(p071h0.m.f45844b));
        return layoutParams;
    }

    private final void o() {
        if (!this.f20659L.a() || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f20674d0 == null) {
            this.f20674d0 = androidx.compose.ui.window.e.b(this.f20658K);
        }
        androidx.compose.ui.window.e.d(this, this.f20674d0);
    }

    private final void p() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.e.e(this, this.f20674d0);
        }
        this.f20674d0 = null;
    }

    private final void setContent(p237x7.p pVar) {
        this.f20675e0.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(D0.InterfaceC0900t interfaceC0900t) {
        this.f20668U.setValue(interfaceC0900t);
    }

    private final void t(Y0.v vVar) {
        int i6 = androidx.compose.ui.window.l.e.f20681a[vVar.ordinal()];
        int i10 = 1;
        if (i6 == 1) {
            i10 = 0;
        } else if (i6 != 2) {
            throw new p087i7.s();
        }
        super.setLayoutDirection(i10);
    }

    private final void x(androidx.compose.ui.window.s sVar) {
        if (p247y7.AbstractC7350t.b(this.f20659L, sVar)) {
            return;
        }
        if (sVar.f() && !this.f20659L.f()) {
            android.view.WindowManager.LayoutParams layoutParams = this.f20664Q;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.f20659L = sVar;
        this.f20664Q.flags = androidx.compose.ui.window.b.h(sVar, androidx.compose.ui.window.b.i(this.f20661N));
        this.f20662O.a(this.f20663P, this, this.f20664Q);
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void b(V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-857613600);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(this) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i10 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().u(interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.ui.window.l.d(i6));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f20659L.a()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                p237x7.a aVar = this.f20658K;
                if (aVar != null) {
                    aVar.b();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((java.lang.Boolean) this.f20670W.getValue()).booleanValue();
    }

    public final android.view.WindowManager.LayoutParams getParams$ui_release() {
        return this.f20664Q;
    }

    public final Y0.v getParentLayoutDirection() {
        return this.f20666S;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final Y0.t m2getPopupContentSizebOM6tXw() {
        return (Y0.t) this.f20667T.getValue();
    }

    public final androidx.compose.ui.window.r getPositionProvider() {
        return this.f20665R;
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f20676f0;
    }

    public androidx.compose.ui.platform.AbstractC1920a getSubCompositionView() {
        return this;
    }

    public final java.lang.String getTestTag() {
        return this.f20660M;
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
        return androidx.compose.ui.platform.F1.b(this);
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void h(boolean z6, int i6, int i10, int i11, int i12) {
        android.view.View childAt;
        super.h(z6, i6, i10, i11, i12);
        if (this.f20659L.f() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f20664Q.width = childAt.getMeasuredWidth();
        this.f20664Q.height = childAt.getMeasuredHeight();
        this.f20662O.a(this.f20663P, this, this.f20664Q);
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void i(int i6, int i10) {
        if (!this.f20659L.f()) {
            i6 = android.view.View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE);
            i10 = android.view.View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE);
        }
        super.i(i6, i10);
    }

    public final void n() {
        androidx.lifecycle.Z.b(this, null);
        this.f20663P.removeViewImmediate(this);
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20673c0.s();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20673c0.t();
        this.f20673c0.j();
        p();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f20659L.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            p237x7.a aVar = this.f20658K;
            if (aVar != null) {
                aVar.b();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        p237x7.a aVar2 = this.f20658K;
        if (aVar2 != null) {
            aVar2.b();
        }
        return true;
    }

    public final void q() {
        int[] iArr = this.f20677g0;
        int i6 = iArr[0];
        int i10 = iArr[1];
        this.f20661N.getLocationOnScreen(iArr);
        int[] iArr2 = this.f20677g0;
        if (i6 == iArr2[0] && i10 == iArr2[1]) {
            return;
        }
        v();
    }

    public final void r(V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        setParentCompositionContext(abstractC1744s);
        setContent(pVar);
        this.f20676f0 = true;
    }

    public final void s() {
        this.f20663P.addView(this, this.f20664Q);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
    }

    public final void setParentLayoutDirection(Y0.v vVar) {
        this.f20666S = vVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(Y0.t tVar) {
        this.f20667T.setValue(tVar);
    }

    public final void setPositionProvider(androidx.compose.ui.window.r rVar) {
        this.f20665R = rVar;
    }

    public final void setTestTag(java.lang.String str) {
        this.f20660M = str;
    }

    public final void u(p237x7.a aVar, androidx.compose.ui.window.s sVar, java.lang.String str, Y0.v vVar) {
        this.f20658K = aVar;
        this.f20660M = str;
        x(sVar);
        t(vVar);
    }

    public final void v() {
        D0.InterfaceC0900t parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.K()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jF = D0.AbstractC0901u.f(parentLayoutCoordinates);
            Y0.r rVarA = Y0.s.a(Y0.q.a(java.lang.Math.round(p131n0.g.m(jF)), java.lang.Math.round(p131n0.g.n(jF))), jA);
            if (p247y7.AbstractC7350t.b(rVarA, this.f20669V)) {
                return;
            }
            this.f20669V = rVarA;
            y();
        }
    }

    public final void w(D0.InterfaceC0900t interfaceC0900t) {
        setParentLayoutCoordinates(interfaceC0900t);
        v();
    }

    public final void y() {
        Y0.t tVarM2getPopupContentSizebOM6tXw;
        Y0.r rVar = this.f20669V;
        if (rVar == null || (tVarM2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j6 = tVarM2getPopupContentSizebOM6tXw.j();
        android.graphics.Rect rect = this.f20672b0;
        this.f20662O.c(this.f20661N, rect);
        Y0.r rVarJ = androidx.compose.ui.window.b.j(rect);
        long jA = Y0.u.a(rVarJ.k(), rVarJ.f());
        p247y7.N n6 = new p247y7.N();
        n6.f57253C = Y0.p.f16221b.a();
        this.f20673c0.o(this, f20657j0, new androidx.compose.ui.window.l.h(n6, this, rVar, jA, j6));
        this.f20664Q.x = Y0.p.h(n6.f57253C);
        this.f20664Q.y = Y0.p.i(n6.f57253C);
        if (this.f20659L.c()) {
            this.f20662O.b(this, Y0.t.g(jA), Y0.t.f(jA));
        }
        this.f20662O.a(this.f20663P, this, this.f20664Q);
    }
}
