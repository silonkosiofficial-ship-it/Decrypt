package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
final class k extends p040e.r implements androidx.compose.ui.platform.G1 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p237x7.a f20647F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private androidx.compose.ui.window.i f20648G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final android.view.View f20649H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final androidx.compose.ui.window.h f20650I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final float f20651J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f20652K;

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
        b() {
            super(1);
        }

        public final void a(p040e.w wVar) {
            if (androidx.compose.ui.window.k.this.f20648G.b()) {
                androidx.compose.ui.window.k.this.f20647F.b();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p040e.w) obj);
            return p087i7.M.f46721a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20654a;

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
            f20654a = iArr;
        }
    }

    public k(p237x7.a aVar, androidx.compose.ui.window.i iVar, android.view.View view, Y0.v vVar, Y0.e eVar, java.util.UUID uuid) {
        super(new android.view.ContextThemeWrapper(view.getContext(), (android.os.Build.VERSION.SDK_INT >= 31 || iVar.a()) ? p071h0.n.f45855a : p071h0.n.f45856b), 0, 2, null);
        this.f20647F = aVar;
        this.f20648G = iVar;
        this.f20649H = view;
        float fQ = Y0.i.q(8);
        this.f20651J = fQ;
        android.view.Window window = getWindow();
        if (window == null) {
            throw new java.lang.IllegalStateException("Dialog has no window".toString());
        }
        this.f20652K = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        androidx.core.view.AbstractC2011k0.b(window, this.f20648G.a());
        androidx.compose.ui.window.h hVar = new androidx.compose.ui.window.h(getContext(), window);
        hVar.setTag(p071h0.l.f45812H, "Dialog:" + uuid);
        hVar.setClipChildren(false);
        hVar.setElevation(eVar.B0(fQ));
        hVar.setOutlineProvider(new androidx.compose.ui.window.k.a());
        this.f20650I = hVar;
        android.view.View decorView = window.getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            f(viewGroup);
        }
        setContentView(hVar);
        androidx.lifecycle.Z.b(hVar, androidx.lifecycle.Z.a(view));
        androidx.lifecycle.a0.b(hVar, androidx.lifecycle.a0.a(view));
        p233x2.g.b(hVar, p233x2.g.a(view));
        q(this.f20647F, this.f20648G, vVar);
        p040e.z.b(b(), this, false, new androidx.compose.ui.window.k.b(), 2, null);
    }

    private static final void f(android.view.ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof androidx.compose.ui.window.h) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = viewGroup.getChildAt(i6);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                f(viewGroup2);
            }
        }
    }

    private final void m(Y0.v vVar) {
        androidx.compose.ui.window.h hVar = this.f20650I;
        int i6 = androidx.compose.ui.window.k.c.f20654a[vVar.ordinal()];
        int i10 = 1;
        if (i6 == 1) {
            i10 = 0;
        } else if (i6 != 2) {
            throw new p087i7.s();
        }
        hVar.setLayoutDirection(i10);
    }

    private final void n(androidx.compose.ui.window.t tVar) {
        boolean zA = androidx.compose.ui.window.u.a(tVar, androidx.compose.ui.window.b.i(this.f20649H));
        android.view.Window window = getWindow();
        p247y7.AbstractC7350t.c(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void k() {
        this.f20650I.f();
    }

    public final void l(V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        this.f20650I.m(abstractC1744s, pVar);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f20648G.c()) {
            this.f20647F.b();
        }
        return zOnTouchEvent;
    }

    public final void q(p237x7.a aVar, androidx.compose.ui.window.i iVar, Y0.v vVar) {
        android.view.Window window;
        int i6;
        android.view.Window window2;
        this.f20647F = aVar;
        this.f20648G = iVar;
        n(iVar.d());
        m(vVar);
        if (iVar.e() && !this.f20650I.l() && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        this.f20650I.n(iVar.e());
        if (android.os.Build.VERSION.SDK_INT < 31) {
            if (iVar.a()) {
                window = getWindow();
                if (window == null) {
                    return;
                } else {
                    i6 = this.f20652K;
                }
            } else {
                window = getWindow();
                if (window == null) {
                    return;
                } else {
                    i6 = 16;
                }
            }
            window.setSoftInputMode(i6);
        }
    }
}
