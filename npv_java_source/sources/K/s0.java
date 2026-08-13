package K;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements androidx.compose.ui.platform.Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f5906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K.l0 f5907b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private H.C1230w f5910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private N.F f5911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.compose.ui.platform.A1 f5912g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.graphics.Rect f5917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final K.p0 f5918m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p237x7.l f5908c = K.s0.c.f5921D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p237x7.l f5909d = K.s0.d.f5922D;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S0.V f5913h = new S0.V("", M0.N.f6666b.a(), (M0.N) null, 4, (p247y7.AbstractC7342k) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private S0.C1610s f5914i = S0.C1610s.f12386g.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.util.List f5915j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5916k = p087i7.AbstractC6669o.a(p087i7.r.NONE, new K.s0.a());

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.inputmethod.BaseInputConnection b() {
            return new android.view.inputmethod.BaseInputConnection(K.s0.this.i(), false);
        }
    }

    public static final class b implements K.k0 {
        b() {
        }

        @Override // K.k0
        public void a(android.view.KeyEvent keyEvent) {
            K.s0.this.h().sendKeyEvent(keyEvent);
        }

        @Override // K.k0
        public void b(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            K.s0.this.f5918m.b(z6, z10, z11, z12, z13, z14);
        }

        @Override // K.k0
        public void c(int i6) {
            K.s0.this.f5909d.l(S0.r.j(i6));
        }

        @Override // K.k0
        public void d(java.util.List list) {
            K.s0.this.f5908c.l(list);
        }

        @Override // K.k0
        public void e(K.w0 w0Var) {
            int size = K.s0.this.f5915j.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (p247y7.AbstractC7350t.b(((java.lang.ref.WeakReference) K.s0.this.f5915j.get(i6)).get(), w0Var)) {
                    K.s0.this.f5915j.remove(i6);
                    return;
                }
            }
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K.s0.c f5921D = new K.s0.c();

        c() {
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

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K.s0.d f5922D = new K.s0.d();

        d() {
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

    public s0(android.view.View view, p237x7.l lVar, K.l0 l0Var) {
        this.f5906a = view;
        this.f5907b = l0Var;
        this.f5918m = new K.p0(lVar, l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.inputmethod.BaseInputConnection h() {
        return (android.view.inputmethod.BaseInputConnection) this.f5916k.getValue();
    }

    private final void k() {
        this.f5907b.i();
    }

    @Override // androidx.compose.ui.platform.Q0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public K.w0 a(android.view.inputmethod.EditorInfo editorInfo) {
        K.AbstractC1303z.c(editorInfo, this.f5913h.i(), this.f5913h.h(), this.f5914i, null, 8, null);
        K.r0.d(editorInfo);
        K.w0 w0Var = new K.w0(this.f5913h, new K.s0.b(), this.f5914i.b(), this.f5910e, this.f5911f, this.f5912g);
        this.f5915j.add(new java.lang.ref.WeakReference(w0Var));
        return w0Var;
    }

    public final android.view.View i() {
        return this.f5906a;
    }

    public final void j(p131n0.i iVar) {
        android.graphics.Rect rect;
        this.f5917l = new android.graphics.Rect(A7.a.d(iVar.i()), A7.a.d(iVar.l()), A7.a.d(iVar.j()), A7.a.d(iVar.e()));
        if (!this.f5915j.isEmpty() || (rect = this.f5917l) == null) {
            return;
        }
        this.f5906a.requestRectangleOnScreen(new android.graphics.Rect(rect));
    }

    public final void l(S0.V v6, K.q0.a aVar, S0.C1610s c1610s, p237x7.l lVar, p237x7.l lVar2) {
        this.f5913h = v6;
        this.f5914i = c1610s;
        this.f5908c = lVar;
        this.f5909d = lVar2;
        this.f5910e = aVar != null ? aVar.i1() : null;
        this.f5911f = aVar != null ? aVar.d0() : null;
        this.f5912g = aVar != null ? aVar.getViewConfiguration() : null;
    }

    public final void m(S0.V v6, S0.V v10) {
        boolean z6 = (M0.N.g(this.f5913h.h(), v10.h()) && p247y7.AbstractC7350t.b(this.f5913h.g(), v10.g())) ? false : true;
        this.f5913h = v10;
        int size = this.f5915j.size();
        for (int i6 = 0; i6 < size; i6++) {
            K.w0 w0Var = (K.w0) ((java.lang.ref.WeakReference) this.f5915j.get(i6)).get();
            if (w0Var != null) {
                w0Var.g(v10);
            }
        }
        this.f5918m.a();
        if (p247y7.AbstractC7350t.b(v6, v10)) {
            if (z6) {
                K.l0 l0Var = this.f5907b;
                int iL = M0.N.l(v10.h());
                int iK = M0.N.k(v10.h());
                M0.N nG = this.f5913h.g();
                int iL2 = nG != null ? M0.N.l(nG.r()) : -1;
                M0.N nG2 = this.f5913h.g();
                l0Var.h(iL, iK, iL2, nG2 != null ? M0.N.k(nG2.r()) : -1);
                return;
            }
            return;
        }
        if (v6 != null && (!p247y7.AbstractC7350t.b(v6.i(), v10.i()) || (M0.N.g(v6.h(), v10.h()) && !p247y7.AbstractC7350t.b(v6.g(), v10.g())))) {
            k();
            return;
        }
        int size2 = this.f5915j.size();
        for (int i10 = 0; i10 < size2; i10++) {
            K.w0 w0Var2 = (K.w0) ((java.lang.ref.WeakReference) this.f5915j.get(i10)).get();
            if (w0Var2 != null) {
                w0Var2.h(this.f5913h, this.f5907b);
            }
        }
    }

    public final void n(S0.V v6, S0.L l6, M0.K k6, p131n0.i iVar, p131n0.i iVar2) {
        this.f5918m.d(v6, l6, k6, iVar, iVar2);
    }
}
