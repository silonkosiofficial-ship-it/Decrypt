package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f19979a = V.AbstractC1756y.d(null, androidx.compose.ui.platform.T.a.f19985D, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.O0 f19980b = V.AbstractC1756y.f(androidx.compose.ui.platform.T.b.f19986D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final V.O0 f19981c = V.AbstractC1756y.f(androidx.compose.ui.platform.T.c.f19987D);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final V.O0 f19982d = V.AbstractC1756y.f(androidx.compose.ui.platform.T.d.f19988D);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final V.O0 f19983e = V.AbstractC1756y.f(androidx.compose.ui.platform.T.e.f19989D);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final V.O0 f19984f = V.AbstractC1756y.f(androidx.compose.ui.platform.T.f.f19990D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.T.a f19985D = new androidx.compose.ui.platform.T.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.content.res.Configuration b() {
            androidx.compose.ui.platform.T.j("LocalConfiguration");
            throw new p087i7.C6665k();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.T.b f19986D = new androidx.compose.ui.platform.T.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.content.Context b() {
            androidx.compose.ui.platform.T.j("LocalContext");
            throw new p087i7.C6665k();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.T.c f19987D = new androidx.compose.ui.platform.T.c();

        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0.a b() {
            androidx.compose.ui.platform.T.j("LocalImageVectorCache");
            throw new p087i7.C6665k();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.T.d f19988D = new androidx.compose.ui.platform.T.d();

        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0.b b() {
            androidx.compose.ui.platform.T.j("LocalResourceIdCache");
            throw new p087i7.C6665k();
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.T.e f19989D = new androidx.compose.ui.platform.T.e();

        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p233x2.f b() {
            androidx.compose.ui.platform.T.j("LocalSavedStateRegistryOwner");
            throw new p087i7.C6665k();
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.T.f f19990D = new androidx.compose.ui.platform.T.f();

        f() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View b() {
            androidx.compose.ui.platform.T.j("LocalView");
            throw new p087i7.C6665k();
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f19991D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(V.InterfaceC1753w0 interfaceC1753w0) {
            super(1);
            this.f19991D = interfaceC1753w0;
        }

        public final void a(android.content.res.Configuration configuration) {
            androidx.compose.ui.platform.T.c(this.f19991D, new android.content.res.Configuration(configuration));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((android.content.res.Configuration) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.C1977t0 f19992D;

        public static final class a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.C1977t0 f19993a;

            public a(androidx.compose.ui.platform.C1977t0 c1977t0) {
                this.f19993a = c1977t0;
            }

            @Override // V.M
            public void e() {
                this.f19993a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.platform.C1977t0 c1977t0) {
            super(1);
            this.f19992D = c1977t0;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            return new androidx.compose.ui.platform.T.h.a(this.f19992D);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.r f19994D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.C1921a0 f19995E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f19996F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.platform.r rVar, androidx.compose.ui.platform.C1921a0 c1921a0, p237x7.p pVar) {
            super(2);
            this.f19994D = rVar;
            this.f19995E = c1921a0;
            this.f19996F = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1471621628, i6, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
            }
            androidx.compose.ui.platform.AbstractC1966p0.a(this.f19994D, this.f19995E, this.f19996F, interfaceC1734n, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.r f19997D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f19998E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f19999F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.platform.r rVar, p237x7.p pVar, int i6) {
            super(2);
            this.f19997D = rVar;
            this.f19998E = pVar;
            this.f19999F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.ui.platform.T.a(this.f19997D, this.f19998E, interfaceC1734n, V.S0.a(this.f19999F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.content.Context f20000D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.T.l f20001E;

        public static final class a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.content.Context f20002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.T.l f20003b;

            public a(android.content.Context context, androidx.compose.ui.platform.T.l lVar) {
                this.f20002a = context;
                this.f20003b = lVar;
            }

            @Override // V.M
            public void e() {
                this.f20002a.getApplicationContext().unregisterComponentCallbacks(this.f20003b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(android.content.Context context, androidx.compose.ui.platform.T.l lVar) {
            super(1);
            this.f20000D = context;
            this.f20001E = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            this.f20000D.getApplicationContext().registerComponentCallbacks(this.f20001E);
            return new androidx.compose.ui.platform.T.k.a(this.f20000D, this.f20001E);
        }
    }

    public static final class l implements android.content.ComponentCallbacks2 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.content.res.Configuration f20004C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ I0.a f20005D;

        l(android.content.res.Configuration configuration, I0.a aVar) {
            this.f20004C = configuration;
            this.f20005D = aVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
            this.f20005D.b(this.f20004C.updateFrom(configuration));
            this.f20004C.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f20005D.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i6) {
            this.f20005D.a();
        }
    }

    static final class m extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.content.Context f20006D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.T.n f20007E;

        public static final class a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.content.Context f20008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.T.n f20009b;

            public a(android.content.Context context, androidx.compose.ui.platform.T.n nVar) {
                this.f20008a = context;
                this.f20009b = nVar;
            }

            @Override // V.M
            public void e() {
                this.f20008a.getApplicationContext().unregisterComponentCallbacks(this.f20009b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(android.content.Context context, androidx.compose.ui.platform.T.n nVar) {
            super(1);
            this.f20006D = context;
            this.f20007E = nVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            this.f20006D.getApplicationContext().registerComponentCallbacks(this.f20007E);
            return new androidx.compose.ui.platform.T.m.a(this.f20006D, this.f20007E);
        }
    }

    public static final class n implements android.content.ComponentCallbacks2 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ I0.b f20010C;

        n(I0.b bVar) {
            this.f20010C = bVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
            this.f20010C.a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f20010C.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i6) {
            this.f20010C.a();
        }
    }

    public static final void a(androidx.compose.ui.platform.r rVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1396852028);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(rVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1396852028, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            android.content.Context context = rVar.getContext();
            java.lang.Object objG = interfaceC1734nR.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                objG = V.A1.d(new android.content.res.Configuration(context.getResources().getConfiguration()), null, 2, null);
                interfaceC1734nR.K(objG);
            }
            V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (objG2 == aVar.a()) {
                objG2 = new androidx.compose.ui.platform.T.g(interfaceC1753w0);
                interfaceC1734nR.K(objG2);
            }
            rVar.setConfigurationChangeObserver((p237x7.l) objG2);
            java.lang.Object objG3 = interfaceC1734nR.g();
            if (objG3 == aVar.a()) {
                objG3 = new androidx.compose.ui.platform.C1921a0(context);
                interfaceC1734nR.K(objG3);
            }
            androidx.compose.ui.platform.C1921a0 c1921a0 = (androidx.compose.ui.platform.C1921a0) objG3;
            androidx.compose.ui.platform.r.b viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new java.lang.IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            java.lang.Object objG4 = interfaceC1734nR.g();
            if (objG4 == aVar.a()) {
                objG4 = androidx.compose.ui.platform.AbstractC1981v0.b(rVar, viewTreeOwners.b());
                interfaceC1734nR.K(objG4);
            }
            androidx.compose.ui.platform.C1977t0 c1977t0 = (androidx.compose.ui.platform.C1977t0) objG4;
            p087i7.M m6 = p087i7.M.f46721a;
            boolean zL = interfaceC1734nR.l(c1977t0);
            java.lang.Object objG5 = interfaceC1734nR.g();
            if (zL || objG5 == aVar.a()) {
                objG5 = new androidx.compose.ui.platform.T.h(c1977t0);
                interfaceC1734nR.K(objG5);
            }
            V.Q.b(m6, (p237x7.l) objG5, interfaceC1734nR, 6);
            V.AbstractC1756y.b(new V.P0[]{f19979a.d(b(interfaceC1753w0)), f19980b.d(context), p003a2.a.a().d(viewTreeOwners.a()), f19983e.d(viewTreeOwners.b()), p041e0.i.d().d(c1977t0), f19984f.d(rVar.getView()), f19981c.d(k(context, b(interfaceC1753w0), interfaceC1734nR, 0)), f19982d.d(l(context, interfaceC1734nR, 0)), androidx.compose.ui.platform.AbstractC1966p0.m().d(java.lang.Boolean.valueOf(((java.lang.Boolean) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.n())).booleanValue() | rVar.getScrollCaptureInProgress$ui_release()))}, p031d0.c.e(1471621628, true, new androidx.compose.ui.platform.T.i(rVar, c1921a0, pVar), interfaceC1734nR, 54), interfaceC1734nR, V.P0.f14698i | 48);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.ui.platform.T.j(rVar, pVar, i6));
        }
    }

    private static final android.content.res.Configuration b(V.InterfaceC1753w0 interfaceC1753w0) {
        return (android.content.res.Configuration) interfaceC1753w0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(V.InterfaceC1753w0 interfaceC1753w0, android.content.res.Configuration configuration) {
        interfaceC1753w0.setValue(configuration);
    }

    public static final V.O0 f() {
        return f19979a;
    }

    public static final V.O0 g() {
        return f19980b;
    }

    public static final V.O0 h() {
        return f19983e;
    }

    public static final V.O0 i() {
        return f19984f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void j(java.lang.String str) {
        throw new java.lang.IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final I0.a k(android.content.Context context, android.content.res.Configuration configuration, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-485908294, i6, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = new I0.a();
            interfaceC1734n.K(objG);
        }
        I0.a aVar2 = (I0.a) objG;
        java.lang.Object objG2 = interfaceC1734n.g();
        java.lang.Object obj = objG2;
        if (objG2 == aVar.a()) {
            android.content.res.Configuration configuration2 = new android.content.res.Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC1734n.K(configuration2);
            obj = configuration2;
        }
        android.content.res.Configuration configuration3 = (android.content.res.Configuration) obj;
        java.lang.Object objG3 = interfaceC1734n.g();
        if (objG3 == aVar.a()) {
            objG3 = new androidx.compose.ui.platform.T.l(configuration3, aVar2);
            interfaceC1734n.K(objG3);
        }
        androidx.compose.ui.platform.T.l lVar = (androidx.compose.ui.platform.T.l) objG3;
        boolean zL = interfaceC1734n.l(context);
        java.lang.Object objG4 = interfaceC1734n.g();
        if (zL || objG4 == aVar.a()) {
            objG4 = new androidx.compose.ui.platform.T.k(context, lVar);
            interfaceC1734n.K(objG4);
        }
        V.Q.b(aVar2, (p237x7.l) objG4, interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return aVar2;
    }

    private static final I0.b l(android.content.Context context, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1348507246, i6, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = new I0.b();
            interfaceC1734n.K(objG);
        }
        I0.b bVar = (I0.b) objG;
        java.lang.Object objG2 = interfaceC1734n.g();
        if (objG2 == aVar.a()) {
            objG2 = new androidx.compose.ui.platform.T.n(bVar);
            interfaceC1734n.K(objG2);
        }
        androidx.compose.ui.platform.T.n nVar = (androidx.compose.ui.platform.T.n) objG2;
        boolean zL = interfaceC1734n.l(context);
        java.lang.Object objG3 = interfaceC1734n.g();
        if (zL || objG3 == aVar.a()) {
            objG3 = new androidx.compose.ui.platform.T.m(context, nVar);
            interfaceC1734n.K(objG3);
        }
        V.Q.b(bVar, (p237x7.l) objG3, interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return bVar;
    }
}
