package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class f extends androidx.appcompat.app.AbstractC1894e implements androidx.appcompat.view.menu.g.a, android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final p170r.Y f17530K0 = new p170r.Y();

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private static final boolean f17531L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private static final int[] f17532M0 = {android.R.attr.windowBackground};

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private static final boolean f17533N0 = !"robolectric".equals(android.os.Build.FINGERPRINT);

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private static final boolean f17534O0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    boolean f17535A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    int f17536B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final java.lang.Runnable f17537C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private boolean f17538D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private android.graphics.Rect f17539E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private android.graphics.Rect f17540F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private androidx.appcompat.app.u f17541G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private androidx.appcompat.app.y f17542H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private android.window.OnBackInvokedDispatcher f17543I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private android.window.OnBackInvokedCallback f17544J0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final java.lang.Object f17545L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final android.content.Context f17546M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    android.view.Window f17547N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private androidx.appcompat.app.f.l f17548O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final androidx.appcompat.app.InterfaceC1893d f17549P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    androidx.appcompat.app.AbstractC1890a f17550Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.lang.CharSequence f17551R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private androidx.appcompat.widget.I f17552S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private androidx.appcompat.app.f.C0339f f17553T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private androidx.appcompat.app.f.r f17554U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    androidx.appcompat.view.b f17555V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    androidx.appcompat.widget.ActionBarContextView f17556W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    android.widget.PopupWindow f17557X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    java.lang.Runnable f17558Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    androidx.core.view.C2003g0 f17559Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f17560a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f17561b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    android.view.ViewGroup f17562c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private android.widget.TextView f17563d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private android.view.View f17564e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f17565f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f17566g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f17567h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f17568i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    boolean f17569j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f17570k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f17571l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f17572m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private androidx.appcompat.app.f.q[] f17573n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private androidx.appcompat.app.f.q f17574o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f17575p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f17576q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f17577r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    boolean f17578s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private android.content.res.Configuration f17579t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f17580u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f17581v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f17582w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f17583x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private androidx.appcompat.app.f.n f17584y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private androidx.appcompat.app.f.n f17585z0;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.f fVar = androidx.appcompat.app.f.this;
            if ((fVar.f17536B0 & 1) != 0) {
                fVar.N(0);
            }
            androidx.appcompat.app.f fVar2 = androidx.appcompat.app.f.this;
            if ((fVar2.f17536B0 & 4096) != 0) {
                fVar2.N(108);
            }
            androidx.appcompat.app.f fVar3 = androidx.appcompat.app.f.this;
            fVar3.f17535A0 = false;
            fVar3.f17536B0 = 0;
        }
    }

    class b implements androidx.core.view.G {
        b() {
        }

        @Override // androidx.core.view.G
        public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
            int iL = c2038y0.l();
            int iK0 = androidx.appcompat.app.f.this.K0(c2038y0, null);
            if (iL != iK0) {
                c2038y0 = c2038y0.q(c2038y0.j(), iK0, c2038y0.k(), c2038y0.i());
            }
            return androidx.core.view.X.Z(view, c2038y0);
        }
    }

    class c implements androidx.appcompat.widget.ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            androidx.appcompat.app.f.this.L();
        }
    }

    class d implements java.lang.Runnable {

        class a extends androidx.core.view.AbstractC2007i0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC2005h0
            public void b(android.view.View view) {
                androidx.appcompat.app.f.this.f17556W.setAlpha(1.0f);
                androidx.appcompat.app.f.this.f17559Z.h(null);
                androidx.appcompat.app.f.this.f17559Z = null;
            }

            @Override // androidx.core.view.AbstractC2007i0, androidx.core.view.InterfaceC2005h0
            public void c(android.view.View view) {
                androidx.appcompat.app.f.this.f17556W.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.f fVar = androidx.appcompat.app.f.this;
            fVar.f17557X.showAtLocation(fVar.f17556W, 55, 0, 0);
            androidx.appcompat.app.f.this.O();
            if (!androidx.appcompat.app.f.this.z0()) {
                androidx.appcompat.app.f.this.f17556W.setAlpha(1.0f);
                androidx.appcompat.app.f.this.f17556W.setVisibility(0);
            } else {
                androidx.appcompat.app.f.this.f17556W.setAlpha(0.0f);
                androidx.appcompat.app.f fVar2 = androidx.appcompat.app.f.this;
                fVar2.f17559Z = androidx.core.view.X.e(fVar2.f17556W).b(1.0f);
                androidx.appcompat.app.f.this.f17559Z.h(new androidx.appcompat.app.f.d.a());
            }
        }
    }

    class e extends androidx.core.view.AbstractC2007i0 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void b(android.view.View view) {
            androidx.appcompat.app.f.this.f17556W.setAlpha(1.0f);
            androidx.appcompat.app.f.this.f17559Z.h(null);
            androidx.appcompat.app.f.this.f17559Z = null;
        }

        @Override // androidx.core.view.AbstractC2007i0, androidx.core.view.InterfaceC2005h0
        public void c(android.view.View view) {
            androidx.appcompat.app.f.this.f17556W.setVisibility(0);
            if (androidx.appcompat.app.f.this.f17556W.getParent() instanceof android.view.View) {
                androidx.core.view.X.k0((android.view.View) androidx.appcompat.app.f.this.f17556W.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$f, reason: collision with other inner class name */
    private final class C0339f implements androidx.appcompat.view.menu.m.a {
        C0339f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            androidx.appcompat.app.f.this.E(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            android.view.Window.Callback callbackA0 = androidx.appcompat.app.f.this.a0();
            if (callbackA0 == null) {
                return true;
            }
            callbackA0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class g implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.view.b.a f17593a;

        class a extends androidx.core.view.AbstractC2007i0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC2005h0
            public void b(android.view.View view) {
                androidx.appcompat.app.f.this.f17556W.setVisibility(8);
                androidx.appcompat.app.f fVar = androidx.appcompat.app.f.this;
                android.widget.PopupWindow popupWindow = fVar.f17557X;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f17556W.getParent() instanceof android.view.View) {
                    androidx.core.view.X.k0((android.view.View) androidx.appcompat.app.f.this.f17556W.getParent());
                }
                androidx.appcompat.app.f.this.f17556W.k();
                androidx.appcompat.app.f.this.f17559Z.h(null);
                androidx.appcompat.app.f fVar2 = androidx.appcompat.app.f.this;
                fVar2.f17559Z = null;
                androidx.core.view.X.k0(fVar2.f17562c0);
            }
        }

        public g(androidx.appcompat.view.b.a aVar) {
            this.f17593a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f17593a.a(bVar);
            androidx.appcompat.app.f fVar = androidx.appcompat.app.f.this;
            if (fVar.f17557X != null) {
                fVar.f17547N.getDecorView().removeCallbacks(androidx.appcompat.app.f.this.f17558Y);
            }
            androidx.appcompat.app.f fVar2 = androidx.appcompat.app.f.this;
            if (fVar2.f17556W != null) {
                fVar2.O();
                androidx.appcompat.app.f fVar3 = androidx.appcompat.app.f.this;
                fVar3.f17559Z = androidx.core.view.X.e(fVar3.f17556W).b(0.0f);
                androidx.appcompat.app.f.this.f17559Z.h(new androidx.appcompat.app.f.g.a());
            }
            androidx.appcompat.app.f fVar4 = androidx.appcompat.app.f.this;
            androidx.appcompat.app.InterfaceC1893d interfaceC1893d = fVar4.f17549P;
            if (interfaceC1893d != null) {
                interfaceC1893d.h(fVar4.f17555V);
            }
            androidx.appcompat.app.f fVar5 = androidx.appcompat.app.f.this;
            fVar5.f17555V = null;
            androidx.core.view.X.k0(fVar5.f17562c0);
            androidx.appcompat.app.f.this.I0();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, android.view.Menu menu) {
            return this.f17593a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, android.view.Menu menu) {
            androidx.core.view.X.k0(androidx.appcompat.app.f.this.f17562c0);
            return this.f17593a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, android.view.MenuItem menuItem) {
            return this.f17593a.d(bVar, menuItem);
        }
    }

    static class h {
        static void a(android.content.res.Configuration configuration, java.util.Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void b(android.content.res.Configuration configuration, java.util.Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class i {
        static boolean a(android.os.PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static java.lang.String b(java.util.Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class j {
        static void a(android.content.res.Configuration configuration, android.content.res.Configuration configuration2, android.content.res.Configuration configuration3) {
            android.os.LocaleList locales = configuration.getLocales();
            android.os.LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(android.content.res.Configuration configuration) {
            return androidx.core.os.i.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            android.os.LocaleList.setDefault(android.os.LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(android.content.res.Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(android.os.LocaleList.forLanguageTags(iVar.h()));
        }
    }

    static class k {
        static android.window.OnBackInvokedDispatcher a(android.app.Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static android.window.OnBackInvokedCallback b(java.lang.Object obj, final androidx.appcompat.app.f fVar) {
            j$.util.Objects.requireNonNull(fVar);
            android.window.OnBackInvokedCallback onBackInvokedCallback = new android.window.OnBackInvokedCallback() { // from class: androidx.appcompat.app.r
                public final void onBackInvoked() {
                    fVar.i0();
                }
            };
            androidx.appcompat.app.n.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(java.lang.Object obj, java.lang.Object obj2) {
            androidx.appcompat.app.n.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.m.a(obj2));
        }
    }

    class l extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f17596D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f17597E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private boolean f17598F;

        l(android.view.Window.Callback callback) {
            super(callback);
        }

        public boolean b(android.view.Window.Callback callback, android.view.KeyEvent keyEvent) {
            try {
                this.f17597E = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f17597E = false;
            }
        }

        public void c(android.view.Window.Callback callback) {
            try {
                this.f17596D = true;
                callback.onContentChanged();
            } finally {
                this.f17596D = false;
            }
        }

        public void d(android.view.Window.Callback callback, int i6, android.view.Menu menu) {
            try {
                this.f17598F = true;
                callback.onPanelClosed(i6, menu);
            } finally {
                this.f17598F = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            if (this.f17597E) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return androidx.appcompat.app.f.this.M(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || androidx.appcompat.app.f.this.l0(keyEvent.getKeyCode(), keyEvent);
        }

        final android.view.ActionMode e(android.view.ActionMode.Callback callback) {
            androidx.appcompat.view.f.a aVar = new androidx.appcompat.view.f.a(androidx.appcompat.app.f.this.f17546M, callback);
            androidx.appcompat.view.b bVarC0 = androidx.appcompat.app.f.this.C0(aVar);
            if (bVarC0 != null) {
                return aVar.e(bVarC0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f17596D) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i6, android.view.Menu menu) {
            if (i6 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i6, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public android.view.View onCreatePanelView(int i6) {
            return super.onCreatePanelView(i6);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i6, android.view.Menu menu) {
            super.onMenuOpened(i6, menu);
            androidx.appcompat.app.f.this.o0(i6);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i6, android.view.Menu menu) {
            if (this.f17598F) {
                a().onPanelClosed(i6, menu);
            } else {
                super.onPanelClosed(i6, menu);
                androidx.appcompat.app.f.this.p0(i6);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i6, android.view.View view, android.view.Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i6 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i6, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i6) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.app.f.q qVarX = androidx.appcompat.app.f.this.X(0, true);
            if (qVarX == null || (gVar = qVarX.f17617j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i6);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i6);
            }
        }

        @Override // android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i6) {
            return (androidx.appcompat.app.f.this.g0() && i6 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i6);
        }
    }

    private class m extends androidx.appcompat.app.f.n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.os.PowerManager f17600c;

        m(android.content.Context context) {
            super();
            this.f17600c = (android.os.PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.n
        android.content.IntentFilter b() {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.n
        public int c() {
            return androidx.appcompat.app.f.i.a(this.f17600c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.n
        public void d() {
            androidx.appcompat.app.f.this.y();
        }
    }

    abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.content.BroadcastReceiver f17602a;

        class a extends android.content.BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                androidx.appcompat.app.f.n.this.d();
            }
        }

        n() {
        }

        void a() {
            android.content.BroadcastReceiver broadcastReceiver = this.f17602a;
            if (broadcastReceiver != null) {
                try {
                    androidx.appcompat.app.f.this.f17546M.unregisterReceiver(broadcastReceiver);
                } catch (java.lang.IllegalArgumentException unused) {
                }
                this.f17602a = null;
            }
        }

        abstract android.content.IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            android.content.IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f17602a == null) {
                this.f17602a = new androidx.appcompat.app.f.n.a();
            }
            androidx.appcompat.app.f.this.f17546M.registerReceiver(this.f17602a, intentFilterB);
        }
    }

    private class o extends androidx.appcompat.app.f.n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.C f17605c;

        o(androidx.appcompat.app.C c6) {
            super();
            this.f17605c = c6;
        }

        @Override // androidx.appcompat.app.f.n
        android.content.IntentFilter b() {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.n
        public int c() {
            return this.f17605c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.n
        public void d() {
            androidx.appcompat.app.f.this.y();
        }
    }

    private class p extends androidx.appcompat.widget.ContentFrameLayout {
        public p(android.content.Context context) {
            super(context);
        }

        private boolean b(int i6, int i10) {
            return i6 < -5 || i10 < -5 || i6 > getWidth() + 5 || i10 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            return androidx.appcompat.app.f.this.M(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            androidx.appcompat.app.f.this.G(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i6) {
            setBackgroundDrawable(p100k.a.b(getContext(), i6));
        }
    }

    protected static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.view.ViewGroup f17614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        android.view.View f17615h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        android.view.View f17616i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f17617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f17618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        android.content.Context f17619l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f17620m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f17621n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f17622o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f17623p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f17624q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f17625r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        android.os.Bundle f17626s;

        q(int i6) {
            this.f17608a = i6;
        }

        androidx.appcompat.view.menu.n a(androidx.appcompat.view.menu.m.a aVar) {
            if (this.f17617j == null) {
                return null;
            }
            if (this.f17618k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f17619l, p090j.g.f48768j);
                this.f17618k = eVar;
                eVar.h(aVar);
                this.f17617j.b(this.f17618k);
            }
            return this.f17618k.b(this.f17614g);
        }

        public boolean b() {
            if (this.f17615h == null) {
                return false;
            }
            return this.f17616i != null || this.f17618k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f17617j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f17618k);
            }
            this.f17617j = gVar;
            if (gVar == null || (eVar = this.f17618k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(android.content.Context context) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(p090j.a.f48624a, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                themeNewTheme.applyStyle(i6, true);
            }
            themeNewTheme.resolveAttribute(p090j.a.f48615C, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 == 0) {
                i10 = p090j.i.f48792b;
            }
            themeNewTheme.applyStyle(i10, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f17619l = dVar;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(p090j.j.f49022y0);
            this.f17609b = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48800B0, 0);
            this.f17613f = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48795A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class r implements androidx.appcompat.view.menu.m.a {
        r() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z10 = gVarD != gVar;
            androidx.appcompat.app.f fVar = androidx.appcompat.app.f.this;
            if (z10) {
                gVar = gVarD;
            }
            androidx.appcompat.app.f.q qVarR = fVar.R(gVar);
            if (qVarR != null) {
                if (!z10) {
                    androidx.appcompat.app.f.this.H(qVarR, z6);
                } else {
                    androidx.appcompat.app.f.this.D(qVarR.f17608a, qVarR, gVarD);
                    androidx.appcompat.app.f.this.H(qVarR, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            android.view.Window.Callback callbackA0;
            if (gVar != gVar.D()) {
                return true;
            }
            androidx.appcompat.app.f fVar = androidx.appcompat.app.f.this;
            if (!fVar.f17567h0 || (callbackA0 = fVar.a0()) == null || androidx.appcompat.app.f.this.f17578s0) {
                return true;
            }
            callbackA0.onMenuOpened(108, gVar);
            return true;
        }
    }

    f(android.app.Dialog dialog, androidx.appcompat.app.InterfaceC1893d interfaceC1893d) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC1893d, dialog);
    }

    private f(android.content.Context context, android.view.Window window, androidx.appcompat.app.InterfaceC1893d interfaceC1893d, java.lang.Object obj) {
        this.f17559Z = null;
        this.f17560a0 = true;
        this.f17580u0 = -100;
        this.f17537C0 = new androidx.appcompat.app.f.a();
        this.f17546M = context;
        this.f17549P = interfaceC1893d;
        this.f17545L = obj;
        if (this.f17580u0 == -100 && (obj instanceof android.app.Dialog)) {
            F0();
        }
        if (this.f17580u0 == -100) {
            p170r.Y y6 = f17530K0;
            java.lang.Integer num = (java.lang.Integer) y6.get(obj.getClass().getName());
            if (num != null) {
                this.f17580u0 = num.intValue();
                y6.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            A(window);
        }
        androidx.appcompat.widget.C1905k.g();
    }

    private void A(android.view.Window window) {
        if (this.f17547N != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof androidx.appcompat.app.f.l) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        androidx.appcompat.app.f.l lVar = new androidx.appcompat.app.f.l(callback);
        this.f17548O = lVar;
        window.setCallback(lVar);
        androidx.appcompat.widget.c0 c0VarU = androidx.appcompat.widget.c0.u(this.f17546M, null, f17532M0);
        android.graphics.drawable.Drawable drawableH = c0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        c0VarU.w();
        this.f17547N = window;
        if (android.os.Build.VERSION.SDK_INT < 33 || this.f17543I0 != null) {
            return;
        }
        t(null);
    }

    private boolean A0(android.view.ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        android.view.View decorView = this.f17547N.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof android.view.View) || androidx.core.view.X.Q((android.view.View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int C() {
        int i6 = this.f17580u0;
        return i6 != -100 ? i6 : androidx.appcompat.app.AbstractC1894e.g();
    }

    private void E0() {
        if (this.f17561b0) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void F() {
        androidx.appcompat.app.f.n nVar = this.f17584y0;
        if (nVar != null) {
            nVar.a();
        }
        androidx.appcompat.app.f.n nVar2 = this.f17585z0;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    private androidx.appcompat.app.AbstractActivityC1892c F0() {
        for (android.content.Context baseContext = this.f17546M; baseContext != null && (baseContext instanceof android.content.ContextWrapper); baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void G0(android.content.res.Configuration configuration) {
        android.app.Activity activity = (android.app.Activity) this.f17545L;
        if (activity instanceof androidx.lifecycle.r) {
            if (!((androidx.lifecycle.r) activity).u().b().g(androidx.lifecycle.AbstractC2079k.b.CREATED)) {
                return;
            }
        } else if (!this.f17577r0 || this.f17578s0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    private boolean H0(int i6, androidx.core.os.i iVar, boolean z6) {
        boolean z10;
        android.content.res.Configuration configurationI = I(this.f17546M, i6, iVar, null, false);
        int iT = T(this.f17546M);
        android.content.res.Configuration configuration = this.f17579t0;
        if (configuration == null) {
            configuration = this.f17546M.getResources().getConfiguration();
        }
        int i10 = configuration.uiMode & 48;
        int i11 = configurationI.uiMode & 48;
        androidx.core.os.i iVarW = W(configuration);
        androidx.core.os.i iVarW2 = iVar == null ? null : W(configurationI);
        int i12 = i10 != i11 ? 512 : 0;
        if (iVarW2 != null && !iVarW.equals(iVarW2)) {
            i12 |= 8196;
        }
        boolean z11 = true;
        if (((~iT) & i12) != 0 && z6 && this.f17576q0 && (f17533N0 || this.f17577r0)) {
            java.lang.Object obj = this.f17545L;
            if (!(obj instanceof android.app.Activity) || ((android.app.Activity) obj).isChild()) {
                z10 = false;
            } else {
                androidx.core.app.b.n((android.app.Activity) this.f17545L);
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10 || i12 == 0) {
            z11 = z10;
        } else {
            J0(i11, iVarW2, (i12 & iT) == i12, null);
        }
        if (z11 && iVarW2 != null) {
            y0(W(this.f17546M.getResources().getConfiguration()));
        }
        return z11;
    }

    private android.content.res.Configuration I(android.content.Context context, int i6, androidx.core.os.i iVar, android.content.res.Configuration configuration, boolean z6) {
        int i10;
        if (i6 == 1) {
            i10 = 16;
        } else if (i6 != 2) {
            i10 = z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i10 = 32;
        }
        android.content.res.Configuration configuration2 = new android.content.res.Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            x0(configuration2, iVar);
        }
        return configuration2;
    }

    private android.view.ViewGroup J() {
        android.view.ViewGroup viewGroup;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.f17546M.obtainStyledAttributes(p090j.j.f49022y0);
        if (!typedArrayObtainStyledAttributes.hasValue(p090j.j.f48810D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48846M0, false)) {
            p(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48810D0, false)) {
            p(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48814E0, false)) {
            p(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48818F0, false)) {
            p(10);
        }
        this.f17570k0 = typedArrayObtainStyledAttributes.getBoolean(p090j.j.f49027z0, false);
        typedArrayObtainStyledAttributes.recycle();
        Q();
        this.f17547N.getDecorView();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.f17546M);
        if (this.f17571l0) {
            viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(this.f17569j0 ? p090j.g.f48773o : p090j.g.f48772n, (android.view.ViewGroup) null);
        } else if (this.f17570k0) {
            viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(p090j.g.f48764f, (android.view.ViewGroup) null);
            this.f17568i0 = false;
            this.f17567h0 = false;
        } else if (this.f17567h0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f17546M.getTheme().resolveAttribute(p090j.a.f48627d, typedValue, true);
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f17546M, typedValue.resourceId) : this.f17546M).inflate(p090j.g.f48774p, (android.view.ViewGroup) null);
            androidx.appcompat.widget.I i6 = (androidx.appcompat.widget.I) viewGroup.findViewById(p090j.f.f48748p);
            this.f17552S = i6;
            i6.setWindowCallback(a0());
            if (this.f17568i0) {
                this.f17552S.h(109);
            }
            if (this.f17565f0) {
                this.f17552S.h(2);
            }
            if (this.f17566g0) {
                this.f17552S.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f17567h0 + ", windowActionBarOverlay: " + this.f17568i0 + ", android:windowIsFloating: " + this.f17570k0 + ", windowActionModeOverlay: " + this.f17569j0 + ", windowNoTitle: " + this.f17571l0 + " }");
        }
        androidx.core.view.X.A0(viewGroup, new androidx.appcompat.app.f.b());
        if (this.f17552S == null) {
            this.f17563d0 = (android.widget.TextView) viewGroup.findViewById(p090j.f.f48729M);
        }
        androidx.appcompat.widget.n0.c(viewGroup);
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) viewGroup.findViewById(p090j.f.f48734b);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f17547N.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f17547N.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.app.f.c());
        return viewGroup;
    }

    private void J0(int i6, androidx.core.os.i iVar, boolean z6, android.content.res.Configuration configuration) {
        android.content.res.Resources resources = this.f17546M.getResources();
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i6 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            x0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.A.a(resources);
        }
        int i10 = this.f17581v0;
        if (i10 != 0) {
            this.f17546M.setTheme(i10);
            this.f17546M.getTheme().applyStyle(this.f17581v0, true);
        }
        if (z6 && (this.f17545L instanceof android.app.Activity)) {
            G0(configuration2);
        }
    }

    private void L0(android.view.View view) {
        android.content.Context context;
        int i6;
        if ((androidx.core.view.X.K(view) & 8192) != 0) {
            context = this.f17546M;
            i6 = p090j.c.f48652b;
        } else {
            context = this.f17546M;
            i6 = p090j.c.f48651a;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i6));
    }

    private void P() {
        if (this.f17561b0) {
            return;
        }
        this.f17562c0 = J();
        java.lang.CharSequence charSequenceZ = Z();
        if (!android.text.TextUtils.isEmpty(charSequenceZ)) {
            androidx.appcompat.widget.I i6 = this.f17552S;
            if (i6 != null) {
                i6.setWindowTitle(charSequenceZ);
            } else if (s0() != null) {
                s0().n(charSequenceZ);
            } else {
                android.widget.TextView textView = this.f17563d0;
                if (textView != null) {
                    textView.setText(charSequenceZ);
                }
            }
        }
        z();
        q0(this.f17562c0);
        this.f17561b0 = true;
        androidx.appcompat.app.f.q qVarX = X(0, false);
        if (this.f17578s0) {
            return;
        }
        if (qVarX == null || qVarX.f17617j == null) {
            f0(108);
        }
    }

    private void Q() {
        if (this.f17547N == null) {
            java.lang.Object obj = this.f17545L;
            if (obj instanceof android.app.Activity) {
                A(((android.app.Activity) obj).getWindow());
            }
        }
        if (this.f17547N == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    private int T(android.content.Context context) {
        int i6;
        if (!this.f17583x0 && (this.f17545L instanceof android.app.Activity)) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i10 = android.os.Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    i6 = 269221888;
                } else {
                    i6 = i10 >= 24 ? 786432 : 0;
                }
                android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(context, this.f17545L.getClass()), i6);
                if (activityInfo != null) {
                    this.f17582w0 = activityInfo.configChanges;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                this.f17582w0 = 0;
            }
        }
        this.f17583x0 = true;
        return this.f17582w0;
    }

    private androidx.appcompat.app.f.n U(android.content.Context context) {
        if (this.f17585z0 == null) {
            this.f17585z0 = new androidx.appcompat.app.f.m(context);
        }
        return this.f17585z0;
    }

    private androidx.appcompat.app.f.n V(android.content.Context context) {
        if (this.f17584y0 == null) {
            this.f17584y0 = new androidx.appcompat.app.f.o(androidx.appcompat.app.C.a(context));
        }
        return this.f17584y0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void b0() {
        androidx.appcompat.app.E e6;
        androidx.appcompat.app.AbstractC1890a abstractC1890a;
        P();
        if (this.f17567h0 && this.f17550Q == null) {
            java.lang.Object obj = this.f17545L;
            if (!(obj instanceof android.app.Activity)) {
                if (obj instanceof android.app.Dialog) {
                    e6 = new androidx.appcompat.app.E((android.app.Dialog) this.f17545L);
                }
                abstractC1890a = this.f17550Q;
                if (abstractC1890a != null) {
                    abstractC1890a.l(this.f17538D0);
                }
            }
            e6 = new androidx.appcompat.app.E((android.app.Activity) this.f17545L, this.f17568i0);
            this.f17550Q = e6;
            abstractC1890a = this.f17550Q;
            if (abstractC1890a != null) {
                abstractC1890a.l(this.f17538D0);
            }
        }
    }

    private boolean c0(androidx.appcompat.app.f.q qVar) {
        android.view.View view = qVar.f17616i;
        if (view != null) {
            qVar.f17615h = view;
            return true;
        }
        if (qVar.f17617j == null) {
            return false;
        }
        if (this.f17554U == null) {
            this.f17554U = new androidx.appcompat.app.f.r();
        }
        android.view.View view2 = (android.view.View) qVar.a(this.f17554U);
        qVar.f17615h = view2;
        return view2 != null;
    }

    private boolean d0(androidx.appcompat.app.f.q qVar) {
        qVar.d(S());
        qVar.f17614g = new androidx.appcompat.app.f.p(qVar.f17619l);
        qVar.f17610c = 81;
        return true;
    }

    private boolean e0(androidx.appcompat.app.f.q qVar) {
        android.content.res.Resources.Theme themeNewTheme;
        android.content.Context context = this.f17546M;
        int i6 = qVar.f17608a;
        if ((i6 == 0 || i6 == 108) && this.f17552S != null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(p090j.a.f48627d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(p090j.a.f48628e, typedValue, true);
            } else {
                theme.resolveAttribute(p090j.a.f48628e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        qVar.c(gVar);
        return true;
    }

    private void f0(int i6) {
        this.f17536B0 = (1 << i6) | this.f17536B0;
        if (this.f17535A0) {
            return;
        }
        androidx.core.view.X.f0(this.f17547N.getDecorView(), this.f17537C0);
        this.f17535A0 = true;
    }

    private boolean k0(int i6, android.view.KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        androidx.appcompat.app.f.q qVarX = X(i6, true);
        if (qVarX.f17622o) {
            return false;
        }
        return u0(qVarX, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean n0(int i6, android.view.KeyEvent keyEvent) {
        boolean zU0;
        android.media.AudioManager audioManager;
        androidx.appcompat.widget.I i10;
        if (this.f17555V != null) {
            return false;
        }
        boolean zF = true;
        androidx.appcompat.app.f.q qVarX = X(i6, true);
        if (i6 != 0 || (i10 = this.f17552S) == null || !i10.d() || android.view.ViewConfiguration.get(this.f17546M).hasPermanentMenuKey()) {
            boolean z6 = qVarX.f17622o;
            if (z6 || qVarX.f17621n) {
                H(qVarX, true);
                zF = z6;
            } else if (qVarX.f17620m) {
                if (qVarX.f17625r) {
                    qVarX.f17620m = false;
                    zU0 = u0(qVarX, keyEvent);
                } else {
                    zU0 = true;
                }
                if (zU0) {
                    r0(qVarX, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.f17552S.b()) {
            zF = this.f17552S.f();
        } else if (this.f17578s0 || !u0(qVarX, keyEvent)) {
            zF = false;
        } else {
            zF = this.f17552S.g();
        }
        if (zF && (audioManager = (android.media.AudioManager) this.f17546M.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zF;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    private void r0(androidx.appcompat.app.f.q qVar, android.view.KeyEvent keyEvent) {
        int i6;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (qVar.f17622o || this.f17578s0) {
            return;
        }
        if (qVar.f17608a == 0 && (this.f17546M.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        android.view.Window.Callback callbackA0 = a0();
        if (callbackA0 != null && !callbackA0.onMenuOpened(qVar.f17608a, qVar.f17617j)) {
            H(qVar, true);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.f17546M.getSystemService("window");
        if (windowManager != null && u0(qVar, keyEvent)) {
            android.view.ViewGroup viewGroup = qVar.f17614g;
            if (viewGroup != null && !qVar.f17624q) {
                android.view.View view = qVar.f17616i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i6 = -1;
                }
                qVar.f17621n = false;
                android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams(i6, -2, qVar.f17611d, qVar.f17612e, 1002, 8519680, -3);
                layoutParams2.gravity = qVar.f17610c;
                layoutParams2.windowAnimations = qVar.f17613f;
                windowManager.addView(qVar.f17614g, layoutParams2);
                qVar.f17622o = true;
                if (qVar.f17608a == 0) {
                    I0();
                }
            }
            if (viewGroup == null) {
                if (!d0(qVar) || qVar.f17614g == null) {
                    return;
                }
            } else if (qVar.f17624q && viewGroup.getChildCount() > 0) {
                qVar.f17614g.removeAllViews();
            }
            if (!c0(qVar) || !qVar.b()) {
                qVar.f17624q = true;
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = qVar.f17615h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new android.view.ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f17614g.setBackgroundResource(qVar.f17609b);
            android.view.ViewParent parent = qVar.f17615h.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(qVar.f17615h);
            }
            qVar.f17614g.addView(qVar.f17615h, layoutParams3);
            if (!qVar.f17615h.hasFocus()) {
                qVar.f17615h.requestFocus();
            }
            i6 = -2;
            qVar.f17621n = false;
            android.view.WindowManager.LayoutParams layoutParams4 = new android.view.WindowManager.LayoutParams(i6, -2, qVar.f17611d, qVar.f17612e, 1002, 8519680, -3);
            layoutParams4.gravity = qVar.f17610c;
            layoutParams4.windowAnimations = qVar.f17613f;
            windowManager.addView(qVar.f17614g, layoutParams4);
            qVar.f17622o = true;
            if (qVar.f17608a == 0) {
                I0();
            }
        }
    }

    private boolean t0(androidx.appcompat.app.f.q qVar, int i6, android.view.KeyEvent keyEvent, int i10) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f17620m || u0(qVar, keyEvent)) && (gVar = qVar.f17617j) != null) {
            zPerformShortcut = gVar.performShortcut(i6, keyEvent, i10);
        }
        if (zPerformShortcut && (i10 & 1) == 0 && this.f17552S == null) {
            H(qVar, true);
        }
        return zPerformShortcut;
    }

    private boolean u0(androidx.appcompat.app.f.q qVar, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.I i6;
        androidx.appcompat.widget.I i10;
        androidx.appcompat.widget.I i11;
        if (this.f17578s0) {
            return false;
        }
        if (qVar.f17620m) {
            return true;
        }
        androidx.appcompat.app.f.q qVar2 = this.f17574o0;
        if (qVar2 != null && qVar2 != qVar) {
            H(qVar2, false);
        }
        android.view.Window.Callback callbackA0 = a0();
        if (callbackA0 != null) {
            qVar.f17616i = callbackA0.onCreatePanelView(qVar.f17608a);
        }
        int i12 = qVar.f17608a;
        boolean z6 = i12 == 0 || i12 == 108;
        if (z6 && (i11 = this.f17552S) != null) {
            i11.c();
        }
        if (qVar.f17616i == null) {
            if (z6) {
                s0();
            }
            androidx.appcompat.view.menu.g gVar = qVar.f17617j;
            if (gVar == null || qVar.f17625r) {
                if (gVar == null && (!e0(qVar) || qVar.f17617j == null)) {
                    return false;
                }
                if (z6 && this.f17552S != null) {
                    if (this.f17553T == null) {
                        this.f17553T = new androidx.appcompat.app.f.C0339f();
                    }
                    this.f17552S.a(qVar.f17617j, this.f17553T);
                }
                qVar.f17617j.d0();
                if (!callbackA0.onCreatePanelMenu(qVar.f17608a, qVar.f17617j)) {
                    qVar.c(null);
                    if (z6 && (i6 = this.f17552S) != null) {
                        i6.a(null, this.f17553T);
                    }
                    return false;
                }
                qVar.f17625r = false;
            }
            qVar.f17617j.d0();
            android.os.Bundle bundle = qVar.f17626s;
            if (bundle != null) {
                qVar.f17617j.P(bundle);
                qVar.f17626s = null;
            }
            if (!callbackA0.onPreparePanel(0, qVar.f17616i, qVar.f17617j)) {
                if (z6 && (i10 = this.f17552S) != null) {
                    i10.a(null, this.f17553T);
                }
                qVar.f17617j.c0();
                return false;
            }
            boolean z10 = android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f17623p = z10;
            qVar.f17617j.setQwertyMode(z10);
            qVar.f17617j.c0();
        }
        qVar.f17620m = true;
        qVar.f17621n = false;
        this.f17574o0 = qVar;
        return true;
    }

    private void v0(boolean z6) {
        androidx.appcompat.widget.I i6 = this.f17552S;
        if (i6 == null || !i6.d() || (android.view.ViewConfiguration.get(this.f17546M).hasPermanentMenuKey() && !this.f17552S.e())) {
            androidx.appcompat.app.f.q qVarX = X(0, true);
            qVarX.f17624q = true;
            H(qVarX, false);
            r0(qVarX, null);
            return;
        }
        android.view.Window.Callback callbackA0 = a0();
        if (this.f17552S.b() && z6) {
            this.f17552S.f();
            if (this.f17578s0) {
                return;
            }
            callbackA0.onPanelClosed(108, X(0, true).f17617j);
            return;
        }
        if (callbackA0 == null || this.f17578s0) {
            return;
        }
        if (this.f17535A0 && (this.f17536B0 & 1) != 0) {
            this.f17547N.getDecorView().removeCallbacks(this.f17537C0);
            this.f17537C0.run();
        }
        androidx.appcompat.app.f.q qVarX2 = X(0, true);
        androidx.appcompat.view.menu.g gVar = qVarX2.f17617j;
        if (gVar == null || qVarX2.f17625r || !callbackA0.onPreparePanel(0, qVarX2.f17616i, gVar)) {
            return;
        }
        callbackA0.onMenuOpened(108, qVarX2.f17617j);
        this.f17552S.g();
    }

    private boolean w(boolean z6) {
        return x(z6, true);
    }

    private int w0(int i6) {
        if (i6 == 8) {
            return 108;
        }
        if (i6 == 9) {
            return 109;
        }
        return i6;
    }

    private boolean x(boolean z6, boolean z10) {
        if (this.f17578s0) {
            return false;
        }
        int iC = C();
        int iH0 = h0(this.f17546M, iC);
        androidx.core.os.i iVarB = android.os.Build.VERSION.SDK_INT < 33 ? B(this.f17546M) : null;
        if (!z10 && iVarB != null) {
            iVarB = W(this.f17546M.getResources().getConfiguration());
        }
        boolean zH0 = H0(iH0, iVarB, z6);
        if (iC == 0) {
            V(this.f17546M).e();
        } else {
            androidx.appcompat.app.f.n nVar = this.f17584y0;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (iC == 3) {
            U(this.f17546M).e();
        } else {
            androidx.appcompat.app.f.n nVar2 = this.f17585z0;
            if (nVar2 != null) {
                nVar2.a();
            }
        }
        return zH0;
    }

    private void z() {
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) this.f17562c0.findViewById(android.R.id.content);
        android.view.View decorView = this.f17547N.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.f17546M.obtainStyledAttributes(p090j.j.f49022y0);
        typedArrayObtainStyledAttributes.getValue(p090j.j.f48838K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(p090j.j.f48842L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(p090j.j.f48830I0)) {
            typedArrayObtainStyledAttributes.getValue(p090j.j.f48830I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(p090j.j.f48834J0)) {
            typedArrayObtainStyledAttributes.getValue(p090j.j.f48834J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(p090j.j.f48822G0)) {
            typedArrayObtainStyledAttributes.getValue(p090j.j.f48822G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(p090j.j.f48826H0)) {
            typedArrayObtainStyledAttributes.getValue(p090j.j.f48826H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    androidx.core.os.i B(android.content.Context context) {
        androidx.core.os.i iVarH;
        androidx.core.os.i iVarE;
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 33 || (iVarH = androidx.appcompat.app.AbstractC1894e.h()) == null) {
            return null;
        }
        androidx.core.os.i iVarW = W(context.getApplicationContext().getResources().getConfiguration());
        if (i6 >= 24) {
            iVarE = androidx.appcompat.app.z.b(iVarH, iVarW);
        } else {
            iVarE = iVarH.f() ? androidx.core.os.i.e() : androidx.core.os.i.c(iVarH.d(0).toString());
        }
        return iVarE.f() ? iVarW : iVarE;
    }

    boolean B0() {
        if (this.f17543I0 == null) {
            return false;
        }
        androidx.appcompat.app.f.q qVarX = X(0, false);
        return (qVarX != null && qVarX.f17622o) || this.f17555V != null;
    }

    public androidx.appcompat.view.b C0(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.InterfaceC1893d interfaceC1893d;
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f17555V;
        if (bVar != null) {
            bVar.c();
        }
        androidx.appcompat.app.f.g gVar = new androidx.appcompat.app.f.g(aVar);
        androidx.appcompat.app.AbstractC1890a abstractC1890aY = Y();
        if (abstractC1890aY != null) {
            androidx.appcompat.view.b bVarO = abstractC1890aY.o(gVar);
            this.f17555V = bVarO;
            if (bVarO != null && (interfaceC1893d = this.f17549P) != null) {
                interfaceC1893d.g(bVarO);
            }
        }
        if (this.f17555V == null) {
            this.f17555V = D0(gVar);
        }
        I0();
        return this.f17555V;
    }

    void D(int i6, androidx.appcompat.app.f.q qVar, android.view.Menu menu) {
        if (menu == null) {
            if (qVar == null && i6 >= 0) {
                androidx.appcompat.app.f.q[] qVarArr = this.f17573n0;
                if (i6 < qVarArr.length) {
                    qVar = qVarArr[i6];
                }
            }
            if (qVar != null) {
                menu = qVar.f17617j;
            }
        }
        if ((qVar == null || qVar.f17622o) && !this.f17578s0) {
            this.f17548O.d(this.f17547N.getCallback(), i6, menu);
        }
    }

    androidx.appcompat.view.b D0(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.view.b bVarO;
        android.content.Context dVar;
        androidx.appcompat.app.InterfaceC1893d interfaceC1893d;
        O();
        androidx.appcompat.view.b bVar = this.f17555V;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof androidx.appcompat.app.f.g)) {
            aVar = new androidx.appcompat.app.f.g(aVar);
        }
        androidx.appcompat.app.InterfaceC1893d interfaceC1893d2 = this.f17549P;
        if (interfaceC1893d2 == null || this.f17578s0) {
            bVarO = null;
        } else {
            try {
                bVarO = interfaceC1893d2.o(aVar);
            } catch (java.lang.AbstractMethodError unused) {
                bVarO = null;
            }
        }
        if (bVarO != null) {
            this.f17555V = bVarO;
        } else {
            if (this.f17556W == null) {
                if (this.f17570k0) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    android.content.res.Resources.Theme theme = this.f17546M.getTheme();
                    theme.resolveAttribute(p090j.a.f48627d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        android.content.res.Resources.Theme themeNewTheme = this.f17546M.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f17546M, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f17546M;
                    }
                    this.f17556W = new androidx.appcompat.widget.ActionBarContextView(dVar);
                    android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(dVar, (android.util.AttributeSet) null, p090j.a.f48629f);
                    this.f17557X = popupWindow;
                    androidx.core.widget.g.b(popupWindow, 2);
                    this.f17557X.setContentView(this.f17556W);
                    this.f17557X.setWidth(-1);
                    dVar.getTheme().resolveAttribute(p090j.a.f48625b, typedValue, true);
                    this.f17556W.setContentHeight(android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f17557X.setHeight(-2);
                    this.f17558Y = new androidx.appcompat.app.f.d();
                } else {
                    androidx.appcompat.widget.ViewStubCompat viewStubCompat = (androidx.appcompat.widget.ViewStubCompat) this.f17562c0.findViewById(p090j.f.f48740h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(android.view.LayoutInflater.from(S()));
                        this.f17556W = (androidx.appcompat.widget.ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f17556W != null) {
                O();
                this.f17556W.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f17556W.getContext(), this.f17556W, aVar, this.f17557X == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f17556W.h(eVar);
                    this.f17555V = eVar;
                    if (z0()) {
                        this.f17556W.setAlpha(0.0f);
                        androidx.core.view.C2003g0 c2003g0B = androidx.core.view.X.e(this.f17556W).b(1.0f);
                        this.f17559Z = c2003g0B;
                        c2003g0B.h(new androidx.appcompat.app.f.e());
                    } else {
                        this.f17556W.setAlpha(1.0f);
                        this.f17556W.setVisibility(0);
                        if (this.f17556W.getParent() instanceof android.view.View) {
                            androidx.core.view.X.k0((android.view.View) this.f17556W.getParent());
                        }
                    }
                    if (this.f17557X != null) {
                        this.f17547N.getDecorView().post(this.f17558Y);
                    }
                } else {
                    this.f17555V = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f17555V;
        if (bVar2 != null && (interfaceC1893d = this.f17549P) != null) {
            interfaceC1893d.g(bVar2);
        }
        I0();
        return this.f17555V;
    }

    void E(androidx.appcompat.view.menu.g gVar) {
        if (this.f17572m0) {
            return;
        }
        this.f17572m0 = true;
        this.f17552S.i();
        android.view.Window.Callback callbackA0 = a0();
        if (callbackA0 != null && !this.f17578s0) {
            callbackA0.onPanelClosed(108, gVar);
        }
        this.f17572m0 = false;
    }

    void G(int i6) {
        H(X(i6, true), true);
    }

    void H(androidx.appcompat.app.f.q qVar, boolean z6) {
        android.view.ViewGroup viewGroup;
        androidx.appcompat.widget.I i6;
        if (z6 && qVar.f17608a == 0 && (i6 = this.f17552S) != null && i6.b()) {
            E(qVar.f17617j);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.f17546M.getSystemService("window");
        if (windowManager != null && qVar.f17622o && (viewGroup = qVar.f17614g) != null) {
            windowManager.removeView(viewGroup);
            if (z6) {
                D(qVar.f17608a, qVar, null);
            }
        }
        qVar.f17620m = false;
        qVar.f17621n = false;
        qVar.f17622o = false;
        qVar.f17615h = null;
        qVar.f17624q = true;
        if (this.f17574o0 == qVar) {
            this.f17574o0 = null;
        }
        if (qVar.f17608a == 0) {
            I0();
        }
    }

    void I0() {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            boolean zB0 = B0();
            if (zB0 && this.f17544J0 == null) {
                this.f17544J0 = androidx.appcompat.app.f.k.b(this.f17543I0, this);
            } else {
                if (zB0 || (onBackInvokedCallback = this.f17544J0) == null) {
                    return;
                }
                androidx.appcompat.app.f.k.c(this.f17543I0, onBackInvokedCallback);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.view.View K(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z6;
        androidx.appcompat.app.u uVar;
        if (this.f17541G0 == null) {
            java.lang.String string = this.f17546M.obtainStyledAttributes(p090j.j.f49022y0).getString(p090j.j.f48805C0);
            if (string == null) {
                uVar = new androidx.appcompat.app.u();
            } else {
                try {
                    this.f17541G0 = (androidx.appcompat.app.u) this.f17546M.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (java.lang.Throwable th) {
                    java.lang.String str2 = "Failed to instantiate custom view inflater " + string + ". Falling back to default.";
                    uVar = new androidx.appcompat.app.u();
                    this.f17541G0 = uVar;
                }
            }
            this.f17541G0 = uVar;
        }
        boolean z10 = f17531L0;
        boolean zA0 = false;
        if (z10) {
            if (this.f17542H0 == null) {
                this.f17542H0 = new androidx.appcompat.app.y();
            }
            if (this.f17542H0.a(attributeSet)) {
                z6 = true;
            } else {
                if (!(attributeSet instanceof org.xmlpull.v1.XmlPullParser)) {
                    zA0 = A0((android.view.ViewParent) view);
                } else if (((org.xmlpull.v1.XmlPullParser) attributeSet).getDepth() > 1) {
                    zA0 = true;
                }
                z6 = zA0;
            }
        } else {
            z6 = zA0;
        }
        return this.f17541G0.r(view, str, context, attributeSet, z6, z10, true, androidx.appcompat.widget.m0.c());
    }

    final int K0(androidx.core.view.C2038y0 c2038y0, android.graphics.Rect rect) {
        int iL;
        boolean z6;
        boolean z10;
        if (c2038y0 != null) {
            iL = c2038y0.l();
        } else {
            iL = rect != null ? rect.top : 0;
        }
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.f17556W;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            z6 = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f17556W.getLayoutParams();
            boolean z11 = true;
            if (this.f17556W.isShown()) {
                if (this.f17539E0 == null) {
                    this.f17539E0 = new android.graphics.Rect();
                    this.f17540F0 = new android.graphics.Rect();
                }
                android.graphics.Rect rect2 = this.f17539E0;
                android.graphics.Rect rect3 = this.f17540F0;
                if (c2038y0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c2038y0.j(), c2038y0.l(), c2038y0.k(), c2038y0.i());
                }
                androidx.appcompat.widget.n0.a(this.f17562c0, rect2, rect3);
                int i6 = rect2.top;
                int i10 = rect2.left;
                int i11 = rect2.right;
                androidx.core.view.C2038y0 c2038y0F = androidx.core.view.X.F(this.f17562c0);
                int iJ = c2038y0F == null ? 0 : c2038y0F.j();
                int iK = c2038y0F == null ? 0 : c2038y0F.k();
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                if (i6 <= 0 || this.f17564e0 != null) {
                    android.view.View view = this.f17564e0;
                    if (view != null) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.f17564e0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    android.view.View view2 = new android.view.View(this.f17546M);
                    this.f17564e0 = view2;
                    view2.setVisibility(8);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.f17562c0.addView(this.f17564e0, -1, layoutParams);
                }
                android.view.View view3 = this.f17564e0;
                z11 = view3 != null;
                if (z11 && view3.getVisibility() != 0) {
                    L0(this.f17564e0);
                }
                if (!this.f17569j0 && z11) {
                    iL = 0;
                }
                z6 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z6 = false;
            } else {
                z6 = false;
                z11 = false;
            }
            if (z11) {
                this.f17556W.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view4 = this.f17564e0;
        if (view4 != null) {
            view4.setVisibility(z6 ? 0 : 8);
        }
        return iL;
    }

    void L() {
        androidx.appcompat.view.menu.g gVar;
        androidx.appcompat.widget.I i6 = this.f17552S;
        if (i6 != null) {
            i6.i();
        }
        if (this.f17557X != null) {
            this.f17547N.getDecorView().removeCallbacks(this.f17558Y);
            if (this.f17557X.isShowing()) {
                try {
                    this.f17557X.dismiss();
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            this.f17557X = null;
        }
        O();
        androidx.appcompat.app.f.q qVarX = X(0, false);
        if (qVarX == null || (gVar = qVarX.f17617j) == null) {
            return;
        }
        gVar.close();
    }

    boolean M(android.view.KeyEvent keyEvent) {
        android.view.View decorView;
        java.lang.Object obj = this.f17545L;
        if (((obj instanceof androidx.core.view.AbstractC2027t.a) || (obj instanceof androidx.appcompat.app.t)) && (decorView = this.f17547N.getDecorView()) != null && androidx.core.view.AbstractC2027t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f17548O.b(this.f17547N.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? j0(keyCode, keyEvent) : m0(keyCode, keyEvent);
    }

    void N(int i6) {
        androidx.appcompat.app.f.q qVarX;
        androidx.appcompat.app.f.q qVarX2 = X(i6, true);
        if (qVarX2.f17617j != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            qVarX2.f17617j.Q(bundle);
            if (bundle.size() > 0) {
                qVarX2.f17626s = bundle;
            }
            qVarX2.f17617j.d0();
            qVarX2.f17617j.clear();
        }
        qVarX2.f17625r = true;
        qVarX2.f17624q = true;
        if ((i6 != 108 && i6 != 0) || this.f17552S == null || (qVarX = X(0, false)) == null) {
            return;
        }
        qVarX.f17620m = false;
        u0(qVarX, null);
    }

    void O() {
        androidx.core.view.C2003g0 c2003g0 = this.f17559Z;
        if (c2003g0 != null) {
            c2003g0.c();
        }
    }

    androidx.appcompat.app.f.q R(android.view.Menu menu) {
        androidx.appcompat.app.f.q[] qVarArr = this.f17573n0;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i6 = 0; i6 < length; i6++) {
            androidx.appcompat.app.f.q qVar = qVarArr[i6];
            if (qVar != null && qVar.f17617j == menu) {
                return qVar;
            }
        }
        return null;
    }

    final android.content.Context S() {
        androidx.appcompat.app.AbstractC1890a abstractC1890aY = Y();
        android.content.Context contextH = abstractC1890aY != null ? abstractC1890aY.h() : null;
        return contextH == null ? this.f17546M : contextH;
    }

    androidx.core.os.i W(android.content.res.Configuration configuration) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? androidx.appcompat.app.f.j.b(configuration) : androidx.core.os.i.c(androidx.appcompat.app.f.i.b(configuration.locale));
    }

    protected androidx.appcompat.app.f.q X(int i6, boolean z6) {
        androidx.appcompat.app.f.q[] qVarArr = this.f17573n0;
        if (qVarArr == null || qVarArr.length <= i6) {
            androidx.appcompat.app.f.q[] qVarArr2 = new androidx.appcompat.app.f.q[i6 + 1];
            if (qVarArr != null) {
                java.lang.System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f17573n0 = qVarArr2;
            qVarArr = qVarArr2;
        }
        androidx.appcompat.app.f.q qVar = qVarArr[i6];
        if (qVar != null) {
            return qVar;
        }
        androidx.appcompat.app.f.q qVar2 = new androidx.appcompat.app.f.q(i6);
        qVarArr[i6] = qVar2;
        return qVar2;
    }

    public androidx.appcompat.app.AbstractC1890a Y() {
        b0();
        return this.f17550Q;
    }

    final java.lang.CharSequence Z() {
        java.lang.Object obj = this.f17545L;
        return obj instanceof android.app.Activity ? ((android.app.Activity) obj).getTitle() : this.f17551R;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
        androidx.appcompat.app.f.q qVarR;
        android.view.Window.Callback callbackA0 = a0();
        if (callbackA0 == null || this.f17578s0 || (qVarR = R(gVar.D())) == null) {
            return false;
        }
        return callbackA0.onMenuItemSelected(qVarR.f17608a, menuItem);
    }

    final android.view.Window.Callback a0() {
        return this.f17547N.getCallback();
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        v0(true);
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void d(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        P();
        ((android.view.ViewGroup) this.f17562c0.findViewById(android.R.id.content)).addView(view, layoutParams);
        this.f17548O.c(this.f17547N.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public android.view.View f(int i6) {
        P();
        return this.f17547N.findViewById(i6);
    }

    public boolean g0() {
        return this.f17560a0;
    }

    int h0(android.content.Context context, int i6) {
        androidx.appcompat.app.f.n nVarV;
        if (i6 == -100) {
            return -1;
        }
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2) {
                    if (i6 != 3) {
                        throw new java.lang.IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    nVarV = U(context);
                }
            } else {
                if (((android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                nVarV = V(context);
            }
            return nVarV.c();
        }
        return i6;
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void i() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.f17546M);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.AbstractC2029u.a(layoutInflaterFrom, this);
        } else if (layoutInflaterFrom.getFactory2() instanceof androidx.appcompat.app.f) {
        }
    }

    boolean i0() {
        boolean z6 = this.f17575p0;
        this.f17575p0 = false;
        androidx.appcompat.app.f.q qVarX = X(0, false);
        if (qVarX != null && qVarX.f17622o) {
            if (!z6) {
                H(qVarX, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f17555V;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.AbstractC1890a abstractC1890aY = Y();
        return abstractC1890aY != null && abstractC1890aY.f();
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void j() {
        if (s0() == null || Y().i()) {
            return;
        }
        f0(0);
    }

    boolean j0(int i6, android.view.KeyEvent keyEvent) {
        if (i6 == 4) {
            this.f17575p0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i6 == 82) {
            k0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void k(android.os.Bundle bundle) {
        java.lang.String strA;
        this.f17576q0 = true;
        w(false);
        Q();
        java.lang.Object obj = this.f17545L;
        if (obj instanceof android.app.Activity) {
            try {
                strA = androidx.core.app.h.a((android.app.Activity) obj);
            } catch (java.lang.IllegalArgumentException unused) {
                strA = null;
            }
            if (strA != null) {
                androidx.appcompat.app.AbstractC1890a abstractC1890aS0 = s0();
                if (abstractC1890aS0 == null) {
                    this.f17538D0 = true;
                } else {
                    abstractC1890aS0.l(true);
                }
            }
            androidx.appcompat.app.AbstractC1894e.c(this);
        }
        this.f17579t0 = new android.content.res.Configuration(this.f17546M.getResources().getConfiguration());
        this.f17577r0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AbstractC1894e
    public void l() {
        if (this.f17545L instanceof android.app.Activity) {
            androidx.appcompat.app.AbstractC1894e.n(this);
        }
        if (this.f17535A0) {
            this.f17547N.getDecorView().removeCallbacks(this.f17537C0);
        }
        this.f17578s0 = true;
        if (this.f17580u0 != -100) {
            java.lang.Object obj = this.f17545L;
            if ((obj instanceof android.app.Activity) && ((android.app.Activity) obj).isChangingConfigurations()) {
                f17530K0.put(this.f17545L.getClass().getName(), java.lang.Integer.valueOf(this.f17580u0));
            } else {
                f17530K0.remove(this.f17545L.getClass().getName());
            }
        } else {
            f17530K0.remove(this.f17545L.getClass().getName());
        }
        androidx.appcompat.app.AbstractC1890a abstractC1890a = this.f17550Q;
        if (abstractC1890a != null) {
            abstractC1890a.j();
        }
        F();
    }

    boolean l0(int i6, android.view.KeyEvent keyEvent) {
        androidx.appcompat.app.AbstractC1890a abstractC1890aY = Y();
        if (abstractC1890aY != null && abstractC1890aY.k(i6, keyEvent)) {
            return true;
        }
        androidx.appcompat.app.f.q qVar = this.f17574o0;
        if (qVar != null && t0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            androidx.appcompat.app.f.q qVar2 = this.f17574o0;
            if (qVar2 != null) {
                qVar2.f17621n = true;
            }
            return true;
        }
        if (this.f17574o0 == null) {
            androidx.appcompat.app.f.q qVarX = X(0, true);
            u0(qVarX, keyEvent);
            boolean zT0 = t0(qVarX, keyEvent.getKeyCode(), keyEvent, 1);
            qVarX.f17620m = false;
            if (zT0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void m() {
        androidx.appcompat.app.AbstractC1890a abstractC1890aY = Y();
        if (abstractC1890aY != null) {
            abstractC1890aY.m(false);
        }
    }

    boolean m0(int i6, android.view.KeyEvent keyEvent) {
        if (i6 != 4) {
            if (i6 == 82) {
                n0(0, keyEvent);
                return true;
            }
        } else if (i0()) {
            return true;
        }
        return false;
    }

    void o0(int i6) {
        androidx.appcompat.app.AbstractC1890a abstractC1890aY;
        if (i6 != 108 || (abstractC1890aY = Y()) == null) {
            return;
        }
        abstractC1890aY.g(true);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return K(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public boolean p(int i6) {
        int iW0 = w0(i6);
        if (this.f17571l0 && iW0 == 108) {
            return false;
        }
        if (this.f17567h0 && iW0 == 1) {
            this.f17567h0 = false;
        }
        if (iW0 == 1) {
            E0();
            this.f17571l0 = true;
            return true;
        }
        if (iW0 == 2) {
            E0();
            this.f17565f0 = true;
            return true;
        }
        if (iW0 == 5) {
            E0();
            this.f17566g0 = true;
            return true;
        }
        if (iW0 == 10) {
            E0();
            this.f17569j0 = true;
            return true;
        }
        if (iW0 == 108) {
            E0();
            this.f17567h0 = true;
            return true;
        }
        if (iW0 != 109) {
            return this.f17547N.requestFeature(iW0);
        }
        E0();
        this.f17568i0 = true;
        return true;
    }

    void p0(int i6) {
        if (i6 == 108) {
            androidx.appcompat.app.AbstractC1890a abstractC1890aY = Y();
            if (abstractC1890aY != null) {
                abstractC1890aY.g(false);
                return;
            }
            return;
        }
        if (i6 == 0) {
            androidx.appcompat.app.f.q qVarX = X(i6, true);
            if (qVarX.f17622o) {
                H(qVarX, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void q(int i6) {
        P();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f17562c0.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.f17546M).inflate(i6, viewGroup);
        this.f17548O.c(this.f17547N.getCallback());
    }

    void q0(android.view.ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void r(android.view.View view) {
        P();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f17562c0.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f17548O.c(this.f17547N.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void s(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        P();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f17562c0.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f17548O.c(this.f17547N.getCallback());
    }

    final androidx.appcompat.app.AbstractC1890a s0() {
        return this.f17550Q;
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void t(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        super.t(onBackInvokedDispatcher);
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f17543I0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f17544J0) != null) {
            androidx.appcompat.app.f.k.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f17544J0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            java.lang.Object obj = this.f17545L;
            if ((obj instanceof android.app.Activity) && ((android.app.Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = androidx.appcompat.app.f.k.a((android.app.Activity) this.f17545L);
            }
        }
        this.f17543I0 = onBackInvokedDispatcher;
        I0();
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public void u(int i6) {
        this.f17581v0 = i6;
    }

    @Override // androidx.appcompat.app.AbstractC1894e
    public final void v(java.lang.CharSequence charSequence) {
        this.f17551R = charSequence;
        androidx.appcompat.widget.I i6 = this.f17552S;
        if (i6 != null) {
            i6.setWindowTitle(charSequence);
            return;
        }
        if (s0() != null) {
            s0().n(charSequence);
            return;
        }
        android.widget.TextView textView = this.f17563d0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void x0(android.content.res.Configuration configuration, androidx.core.os.i iVar) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.appcompat.app.f.j.d(configuration, iVar);
        } else {
            androidx.appcompat.app.f.h.b(configuration, iVar.d(0));
            androidx.appcompat.app.f.h.a(configuration, iVar.d(0));
        }
    }

    public boolean y() {
        return w(true);
    }

    void y0(androidx.core.os.i iVar) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.appcompat.app.f.j.c(iVar);
        } else {
            java.util.Locale.setDefault(iVar.d(0));
        }
    }

    final boolean z0() {
        android.view.ViewGroup viewGroup;
        return this.f17561b0 && (viewGroup = this.f17562c0) != null && androidx.core.view.X.R(viewGroup);
    }
}
