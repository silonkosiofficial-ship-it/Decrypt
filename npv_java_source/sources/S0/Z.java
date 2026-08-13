package S0;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements S0.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f12297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.InterfaceC1612u f12298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f12299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p237x7.l f12301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p237x7.l f12302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private S0.V f12303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S0.C1610s f12304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.List f12305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f12306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.graphics.Rect f12307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final S0.C1597e f12308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final X.b f12309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.lang.Runnable f12310n;

    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12316a;

        static {
            int[] iArr = new int[S0.Z.a.values().length];
            try {
                iArr[S0.Z.a.StartInput.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[S0.Z.a.StopInput.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[S0.Z.a.ShowKeyboard.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[S0.Z.a.HideKeyboard.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f12316a = iArr;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.inputmethod.BaseInputConnection b() {
            return new android.view.inputmethod.BaseInputConnection(S0.Z.this.q(), false);
        }
    }

    public static final class d implements S0.InterfaceC1611t {
        d() {
        }

        @Override // S0.InterfaceC1611t
        public void a(android.view.KeyEvent keyEvent) {
            S0.Z.this.p().sendKeyEvent(keyEvent);
        }

        @Override // S0.InterfaceC1611t
        public void b(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            S0.Z.this.f12308l.b(z6, z10, z11, z12, z13, z14);
        }

        @Override // S0.InterfaceC1611t
        public void c(int i6) {
            S0.Z.this.f12302f.l(S0.r.j(i6));
        }

        @Override // S0.InterfaceC1611t
        public void d(java.util.List list) {
            S0.Z.this.f12301e.l(list);
        }

        @Override // S0.InterfaceC1611t
        public void e(S0.Q q6) {
            int size = S0.Z.this.f12305i.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (p247y7.AbstractC7350t.b(((java.lang.ref.WeakReference) S0.Z.this.f12305i.get(i6)).get(), q6)) {
                    S0.Z.this.f12305i.remove(i6);
                    return;
                }
            }
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.Z.e f12319D = new S0.Z.e();

        e() {
            super(1);
        }

        public final void a(java.util.List list) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.util.List) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.Z.f f12320D = new S0.Z.f();

        f() {
            super(1);
        }

        public final void a(int i6) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((S0.r) obj).p());
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.Z.g f12321D = new S0.Z.g();

        g() {
            super(1);
        }

        public final void a(java.util.List list) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.util.List) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.Z.h f12322D = new S0.Z.h();

        h() {
            super(1);
        }

        public final void a(int i6) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((S0.r) obj).p());
            return p087i7.M.f46721a;
        }
    }

    public Z(android.view.View view, p251z0.Q q6) {
        this(view, q6, new S0.C1613v(view), null, 8, null);
    }

    public Z(android.view.View view, p251z0.Q q6, S0.InterfaceC1612u interfaceC1612u, java.util.concurrent.Executor executor) {
        this.f12297a = view;
        this.f12298b = interfaceC1612u;
        this.f12299c = executor;
        this.f12301e = S0.Z.e.f12319D;
        this.f12302f = S0.Z.f.f12320D;
        this.f12303g = new S0.V("", M0.N.f6666b.a(), (M0.N) null, 4, (p247y7.AbstractC7342k) null);
        this.f12304h = S0.C1610s.f12386g.a();
        this.f12305i = new java.util.ArrayList();
        this.f12306j = p087i7.AbstractC6669o.a(p087i7.r.NONE, new S0.Z.c());
        this.f12308l = new S0.C1597e(q6, interfaceC1612u);
        this.f12309m = new X.b(new S0.Z.a[16], 0);
    }

    public /* synthetic */ Z(android.view.View view, p251z0.Q q6, S0.InterfaceC1612u interfaceC1612u, java.util.concurrent.Executor executor, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(view, q6, interfaceC1612u, (i6 & 8) != 0 ? S0.c0.d(android.view.Choreographer.getInstance()) : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.inputmethod.BaseInputConnection p() {
        return (android.view.inputmethod.BaseInputConnection) this.f12306j.getValue();
    }

    private final void s() {
        p247y7.O o6 = new p247y7.O();
        p247y7.O o10 = new p247y7.O();
        X.b bVar = this.f12309m;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i6 = 0;
            do {
                t((S0.Z.a) objArrS[i6], o6, o10);
                i6++;
            } while (i6 < iT);
        }
        this.f12309m.j();
        if (p247y7.AbstractC7350t.b(o6.f57254C, java.lang.Boolean.TRUE)) {
            u();
        }
        java.lang.Boolean bool = (java.lang.Boolean) o10.f57254C;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (p247y7.AbstractC7350t.b(o6.f57254C, java.lang.Boolean.FALSE)) {
            u();
        }
    }

    private static final void t(S0.Z.a aVar, p247y7.O o6, p247y7.O o10) {
        java.lang.Boolean boolValueOf;
        int i6 = S0.Z.b.f12316a[aVar.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                boolValueOf = java.lang.Boolean.FALSE;
            } else if ((i6 != 3 && i6 != 4) || p247y7.AbstractC7350t.b(o6.f57254C, java.lang.Boolean.FALSE)) {
                return;
            } else {
                boolValueOf = java.lang.Boolean.valueOf(aVar == S0.Z.a.ShowKeyboard);
            }
            o10.f57254C = boolValueOf;
        }
        boolValueOf = java.lang.Boolean.TRUE;
        o6.f57254C = boolValueOf;
        o10.f57254C = boolValueOf;
    }

    private final void u() {
        this.f12298b.i();
    }

    private final void v(S0.Z.a aVar) {
        this.f12309m.d(aVar);
        if (this.f12310n == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: S0.Y
                @Override // java.lang.Runnable
                public final void run() {
                    S0.Z.w(this.f12296C);
                }
            };
            this.f12299c.execute(runnable);
            this.f12310n = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(S0.Z z6) {
        z6.f12310n = null;
        z6.s();
    }

    private final void x(boolean z6) {
        if (z6) {
            this.f12298b.b();
        } else {
            this.f12298b.a();
        }
    }

    @Override // S0.P
    public void a() {
        v(S0.Z.a.StartInput);
    }

    @Override // S0.P
    public void b(S0.V v6, S0.V v10) {
        boolean z6 = (M0.N.g(this.f12303g.h(), v10.h()) && p247y7.AbstractC7350t.b(this.f12303g.g(), v10.g())) ? false : true;
        this.f12303g = v10;
        int size = this.f12305i.size();
        for (int i6 = 0; i6 < size; i6++) {
            S0.Q q6 = (S0.Q) ((java.lang.ref.WeakReference) this.f12305i.get(i6)).get();
            if (q6 != null) {
                q6.f(v10);
            }
        }
        this.f12308l.a();
        if (p247y7.AbstractC7350t.b(v6, v10)) {
            if (z6) {
                S0.InterfaceC1612u interfaceC1612u = this.f12298b;
                int iL = M0.N.l(v10.h());
                int iK = M0.N.k(v10.h());
                M0.N nG = this.f12303g.g();
                int iL2 = nG != null ? M0.N.l(nG.r()) : -1;
                M0.N nG2 = this.f12303g.g();
                interfaceC1612u.h(iL, iK, iL2, nG2 != null ? M0.N.k(nG2.r()) : -1);
                return;
            }
            return;
        }
        if (v6 != null && (!p247y7.AbstractC7350t.b(v6.i(), v10.i()) || (M0.N.g(v6.h(), v10.h()) && !p247y7.AbstractC7350t.b(v6.g(), v10.g())))) {
            u();
            return;
        }
        int size2 = this.f12305i.size();
        for (int i10 = 0; i10 < size2; i10++) {
            S0.Q q10 = (S0.Q) ((java.lang.ref.WeakReference) this.f12305i.get(i10)).get();
            if (q10 != null) {
                q10.g(this.f12303g, this.f12298b);
            }
        }
    }

    @Override // S0.P
    public void c() {
        v(S0.Z.a.ShowKeyboard);
    }

    @Override // S0.P
    public void d(S0.V v6, S0.L l6, M0.K k6, p237x7.l lVar, p131n0.i iVar, p131n0.i iVar2) {
        this.f12308l.d(v6, l6, k6, lVar, iVar, iVar2);
    }

    @Override // S0.P
    public void e() {
        this.f12300d = false;
        this.f12301e = S0.Z.g.f12321D;
        this.f12302f = S0.Z.h.f12322D;
        this.f12307k = null;
        v(S0.Z.a.StopInput);
    }

    @Override // S0.P
    public void f(p131n0.i iVar) {
        android.graphics.Rect rect;
        this.f12307k = new android.graphics.Rect(A7.a.d(iVar.i()), A7.a.d(iVar.l()), A7.a.d(iVar.j()), A7.a.d(iVar.e()));
        if (!this.f12305i.isEmpty() || (rect = this.f12307k) == null) {
            return;
        }
        this.f12297a.requestRectangleOnScreen(new android.graphics.Rect(rect));
    }

    @Override // S0.P
    public void g(S0.V v6, S0.C1610s c1610s, p237x7.l lVar, p237x7.l lVar2) {
        this.f12300d = true;
        this.f12303g = v6;
        this.f12304h = c1610s;
        this.f12301e = lVar;
        this.f12302f = lVar2;
        v(S0.Z.a.StartInput);
    }

    @Override // S0.P
    public void h() {
        v(S0.Z.a.HideKeyboard);
    }

    public final android.view.inputmethod.InputConnection o(android.view.inputmethod.EditorInfo editorInfo) {
        if (!this.f12300d) {
            return null;
        }
        S0.c0.h(editorInfo, this.f12304h, this.f12303g);
        S0.c0.i(editorInfo);
        S0.Q q6 = new S0.Q(this.f12303g, new S0.Z.d(), this.f12304h.b());
        this.f12305i.add(new java.lang.ref.WeakReference(q6));
        return q6;
    }

    public final android.view.View q() {
        return this.f12297a;
    }

    public final boolean r() {
        return this.f12300d;
    }
}
