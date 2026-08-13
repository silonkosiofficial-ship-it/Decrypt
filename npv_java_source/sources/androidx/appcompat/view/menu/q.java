package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class q extends androidx.appcompat.view.menu.k implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.m, android.view.View.OnKeyListener {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final int f17932X = p090j.g.f48771m;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f17933D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f17934E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.appcompat.view.menu.f f17935F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f17936G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f17937H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f17938I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f17939J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final androidx.appcompat.widget.S f17940K;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.widget.PopupWindow.OnDismissListener f17943N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private android.view.View f17944O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    android.view.View f17945P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f17946Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    android.view.ViewTreeObserver f17947R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f17948S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f17949T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f17950U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f17952W;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final android.view.ViewTreeObserver.OnGlobalLayoutListener f17941L = new androidx.appcompat.view.menu.q.a();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final android.view.View.OnAttachStateChangeListener f17942M = new androidx.appcompat.view.menu.q.b();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f17951V = 0;

    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.view.menu.q.this.a() || androidx.appcompat.view.menu.q.this.f17940K.B()) {
                return;
            }
            android.view.View view = androidx.appcompat.view.menu.q.this.f17945P;
            if (view == null || !view.isShown()) {
                androidx.appcompat.view.menu.q.this.dismiss();
            } else {
                androidx.appcompat.view.menu.q.this.f17940K.b();
            }
        }
    }

    class b implements android.view.View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            android.view.ViewTreeObserver viewTreeObserver = androidx.appcompat.view.menu.q.this.f17947R;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    androidx.appcompat.view.menu.q.this.f17947R = view.getViewTreeObserver();
                }
                androidx.appcompat.view.menu.q qVar = androidx.appcompat.view.menu.q.this;
                qVar.f17947R.removeGlobalOnLayoutListener(qVar.f17941L);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(android.content.Context context, androidx.appcompat.view.menu.g gVar, android.view.View view, int i6, int i10, boolean z6) {
        this.f17933D = context;
        this.f17934E = gVar;
        this.f17936G = z6;
        this.f17935F = new androidx.appcompat.view.menu.f(gVar, android.view.LayoutInflater.from(context), z6, f17932X);
        this.f17938I = i6;
        this.f17939J = i10;
        android.content.res.Resources resources = context.getResources();
        this.f17937H = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p090j.d.f48660b));
        this.f17944O = view;
        this.f17940K = new androidx.appcompat.widget.S(context, null, i6, i10);
        gVar.c(this, context);
    }

    private boolean z() {
        android.view.View view;
        if (a()) {
            return true;
        }
        if (this.f17948S || (view = this.f17944O) == null) {
            return false;
        }
        this.f17945P = view;
        this.f17940K.K(this);
        this.f17940K.L(this);
        this.f17940K.J(true);
        android.view.View view2 = this.f17945P;
        boolean z6 = this.f17947R == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f17947R = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f17941L);
        }
        view2.addOnAttachStateChangeListener(this.f17942M);
        this.f17940K.D(view2);
        this.f17940K.G(this.f17951V);
        if (!this.f17949T) {
            this.f17950U = androidx.appcompat.view.menu.k.o(this.f17935F, null, this.f17933D, this.f17937H);
            this.f17949T = true;
        }
        this.f17940K.F(this.f17950U);
        this.f17940K.I(2);
        this.f17940K.H(n());
        this.f17940K.b();
        android.widget.ListView listViewJ = this.f17940K.j();
        listViewJ.setOnKeyListener(this);
        if (this.f17952W && this.f17934E.x() != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(this.f17933D).inflate(p090j.g.f48770l, (android.view.ViewGroup) listViewJ, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f17934E.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f17940K.p(this.f17935F);
        this.f17940K.b();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return !this.f17948S && this.f17940K.a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        if (!z()) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        if (gVar != this.f17934E) {
            return;
        }
        dismiss();
        androidx.appcompat.view.menu.m.a aVar = this.f17946Q;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        this.f17949T = false;
        androidx.appcompat.view.menu.f fVar = this.f17935F;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (a()) {
            this.f17940K.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(androidx.appcompat.view.menu.m.a aVar) {
        this.f17946Q = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public android.widget.ListView j() {
        return this.f17940K.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        if (rVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(this.f17933D, rVar, this.f17945P, this.f17936G, this.f17938I, this.f17939J);
            lVar.j(this.f17946Q);
            lVar.g(androidx.appcompat.view.menu.k.x(rVar));
            lVar.i(this.f17943N);
            this.f17943N = null;
            this.f17934E.e(false);
            int iC = this.f17940K.c();
            int iO = this.f17940K.o();
            if ((android.view.Gravity.getAbsoluteGravity(this.f17951V, androidx.core.view.X.z(this.f17944O)) & 7) == 5) {
                iC += this.f17944O.getWidth();
            }
            if (lVar.n(iC, iO)) {
                androidx.appcompat.view.menu.m.a aVar = this.f17946Q;
                if (aVar == null) {
                    return true;
                }
                aVar.d(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(androidx.appcompat.view.menu.g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f17948S = true;
        this.f17934E.close();
        android.view.ViewTreeObserver viewTreeObserver = this.f17947R;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f17947R = this.f17945P.getViewTreeObserver();
            }
            this.f17947R.removeGlobalOnLayoutListener(this.f17941L);
            this.f17947R = null;
        }
        this.f17945P.removeOnAttachStateChangeListener(this.f17942M);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f17943N;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i6, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i6 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(android.view.View view) {
        this.f17944O = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z6) {
        this.f17935F.d(z6);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i6) {
        this.f17951V = i6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i6) {
        this.f17940K.e(i6);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f17943N = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z6) {
        this.f17952W = z6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i6) {
        this.f17940K.l(i6);
    }
}
