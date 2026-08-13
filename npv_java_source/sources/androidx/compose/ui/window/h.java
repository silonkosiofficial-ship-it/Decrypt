package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
final class h extends androidx.compose.ui.platform.AbstractC1920a implements androidx.compose.ui.window.j {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final android.view.Window f20636K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final V.InterfaceC1753w0 f20637L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f20638M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f20639N;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f20641E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6) {
            super(2);
            this.f20641E = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            androidx.compose.ui.window.h.this.b(interfaceC1734n, V.S0.a(this.f20641E | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public h(android.content.Context context, android.view.Window window) {
        super(context, null, 0, 6, null);
        this.f20636K = window;
        this.f20637L = V.A1.d(androidx.compose.ui.window.f.f20630a.a(), null, 2, null);
    }

    private final p237x7.p getContent() {
        return (p237x7.p) this.f20637L.getValue();
    }

    private final int getDisplayHeight() {
        return java.lang.Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return java.lang.Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(p237x7.p pVar) {
        this.f20637L.setValue(pVar);
    }

    @Override // androidx.compose.ui.window.j
    public android.view.Window a() {
        return this.f20636K;
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void b(V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1735448596);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(this) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i10 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1735448596, i10, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().u(interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new androidx.compose.ui.window.h.a(i6));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f20639N;
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void h(boolean z6, int i6, int i10, int i11, int i12) {
        android.view.View childAt;
        super.h(z6, i6, i10, i11, i12);
        if (this.f20638M || (childAt = getChildAt(0)) == null) {
            return;
        }
        a().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractC1920a
    public void i(int i6, int i10) {
        if (!this.f20638M) {
            i6 = android.view.View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE);
            i10 = android.view.View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE);
        }
        super.i(i6, i10);
    }

    public final boolean l() {
        return this.f20638M;
    }

    public final void m(V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        setParentCompositionContext(abstractC1744s);
        setContent(pVar);
        this.f20639N = true;
        e();
    }

    public final void n(boolean z6) {
        this.f20638M = z6;
    }
}
