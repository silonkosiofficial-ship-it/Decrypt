package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class d extends androidx.appcompat.view.menu.k implements androidx.appcompat.view.menu.m, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f17789d0 = p090j.g.f48763e;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f17790D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f17791E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f17792F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f17793G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f17794H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final android.os.Handler f17795I;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private android.view.View f17803Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    android.view.View f17804R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f17806T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f17807U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f17808V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f17809W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f17811Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f17812Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    android.view.ViewTreeObserver f17813a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private android.widget.PopupWindow.OnDismissListener f17814b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f17815c0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.util.List f17796J = new java.util.ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final java.util.List f17797K = new java.util.ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final android.view.ViewTreeObserver.OnGlobalLayoutListener f17798L = new androidx.appcompat.view.menu.d.a();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final android.view.View.OnAttachStateChangeListener f17799M = new androidx.appcompat.view.menu.d.b();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final androidx.appcompat.widget.Q f17800N = new androidx.appcompat.view.menu.d.c();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f17801O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f17802P = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f17810X = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f17805S = D();

    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.view.menu.d.this.a() || androidx.appcompat.view.menu.d.this.f17797K.size() <= 0 || ((androidx.appcompat.view.menu.d.C0340d) androidx.appcompat.view.menu.d.this.f17797K.get(0)).f17823a.B()) {
                return;
            }
            android.view.View view = androidx.appcompat.view.menu.d.this.f17804R;
            if (view == null || !view.isShown()) {
                androidx.appcompat.view.menu.d.this.dismiss();
                return;
            }
            java.util.Iterator it = androidx.appcompat.view.menu.d.this.f17797K.iterator();
            while (it.hasNext()) {
                ((androidx.appcompat.view.menu.d.C0340d) it.next()).f17823a.b();
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
            android.view.ViewTreeObserver viewTreeObserver = androidx.appcompat.view.menu.d.this.f17813a0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    androidx.appcompat.view.menu.d.this.f17813a0 = view.getViewTreeObserver();
                }
                androidx.appcompat.view.menu.d dVar = androidx.appcompat.view.menu.d.this;
                dVar.f17813a0.removeGlobalOnLayoutListener(dVar.f17798L);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements androidx.appcompat.widget.Q {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.view.menu.d.C0340d f17819C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ android.view.MenuItem f17820D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.view.menu.g f17821E;

            a(androidx.appcompat.view.menu.d.C0340d c0340d, android.view.MenuItem menuItem, androidx.appcompat.view.menu.g gVar) {
                this.f17819C = c0340d;
                this.f17820D = menuItem;
                this.f17821E = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.view.menu.d.C0340d c0340d = this.f17819C;
                if (c0340d != null) {
                    androidx.appcompat.view.menu.d.this.f17815c0 = true;
                    c0340d.f17824b.e(false);
                    androidx.appcompat.view.menu.d.this.f17815c0 = false;
                }
                if (this.f17820D.isEnabled() && this.f17820D.hasSubMenu()) {
                    this.f17821E.L(this.f17820D, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.Q
        public void d(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.d.this.f17795I.removeCallbacksAndMessages(null);
            int size = androidx.appcompat.view.menu.d.this.f17797K.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                } else if (gVar == ((androidx.appcompat.view.menu.d.C0340d) androidx.appcompat.view.menu.d.this.f17797K.get(i6)).f17824b) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 == -1) {
                return;
            }
            int i10 = i6 + 1;
            androidx.appcompat.view.menu.d.this.f17795I.postAtTime(new androidx.appcompat.view.menu.d.c.a(i10 < androidx.appcompat.view.menu.d.this.f17797K.size() ? (androidx.appcompat.view.menu.d.C0340d) androidx.appcompat.view.menu.d.this.f17797K.get(i10) : null, menuItem, gVar), gVar, android.os.SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.Q
        public void g(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.d.this.f17795I.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0340d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.widget.S f17823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.g f17824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17825c;

        public C0340d(androidx.appcompat.widget.S s6, androidx.appcompat.view.menu.g gVar, int i6) {
            this.f17823a = s6;
            this.f17824b = gVar;
            this.f17825c = i6;
        }

        public android.widget.ListView a() {
            return this.f17823a.j();
        }
    }

    public d(android.content.Context context, android.view.View view, int i6, int i10, boolean z6) {
        this.f17790D = context;
        this.f17803Q = view;
        this.f17792F = i6;
        this.f17793G = i10;
        this.f17794H = z6;
        android.content.res.Resources resources = context.getResources();
        this.f17791E = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p090j.d.f48660b));
        this.f17795I = new android.os.Handler();
    }

    private int A(androidx.appcompat.view.menu.g gVar) {
        int size = this.f17797K.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (gVar == ((androidx.appcompat.view.menu.d.C0340d) this.f17797K.get(i6)).f17824b) {
                return i6;
            }
        }
        return -1;
    }

    private android.view.MenuItem B(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.g gVar2) {
        int size = gVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.MenuItem item = gVar.getItem(i6);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private android.view.View C(androidx.appcompat.view.menu.d.C0340d c0340d, androidx.appcompat.view.menu.g gVar) {
        androidx.appcompat.view.menu.f fVar;
        int headersCount;
        int firstVisiblePosition;
        android.view.MenuItem menuItemB = B(c0340d.f17824b, gVar);
        if (menuItemB == null) {
            return null;
        }
        android.widget.ListView listViewA = c0340d.a();
        android.widget.ListAdapter adapter = listViewA.getAdapter();
        int i6 = 0;
        if (adapter instanceof android.widget.HeaderViewListAdapter) {
            android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (androidx.appcompat.view.menu.f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i6 >= count) {
                i6 = -1;
                break;
            }
            if (menuItemB == fVar.getItem(i6)) {
                break;
            }
            i6++;
        }
        if (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return androidx.core.view.X.z(this.f17803Q) == 1 ? 0 : 1;
    }

    private int E(int i6) {
        java.util.List list = this.f17797K;
        android.widget.ListView listViewA = ((androidx.appcompat.view.menu.d.C0340d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f17804R.getWindowVisibleDisplayFrame(rect);
        if (this.f17805S == 1) {
            return (iArr[0] + listViewA.getWidth()) + i6 > rect.right ? 0 : 1;
        }
        return iArr[0] - i6 < 0 ? 1 : 0;
    }

    private void F(androidx.appcompat.view.menu.g gVar) {
        androidx.appcompat.view.menu.d.C0340d c0340d;
        android.view.View viewC;
        int i6;
        int i10;
        int i11;
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.f17790D);
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(gVar, layoutInflaterFrom, this.f17794H, f17789d0);
        if (!a() && this.f17810X) {
            fVar.d(true);
        } else if (a()) {
            fVar.d(androidx.appcompat.view.menu.k.x(gVar));
        }
        int iO = androidx.appcompat.view.menu.k.o(fVar, null, this.f17790D, this.f17791E);
        androidx.appcompat.widget.S sZ = z();
        sZ.p(fVar);
        sZ.F(iO);
        sZ.G(this.f17802P);
        if (this.f17797K.size() > 0) {
            java.util.List list = this.f17797K;
            c0340d = (androidx.appcompat.view.menu.d.C0340d) list.get(list.size() - 1);
            viewC = C(c0340d, gVar);
        } else {
            c0340d = null;
            viewC = null;
        }
        if (viewC != null) {
            sZ.V(false);
            sZ.S(null);
            int iE = E(iO);
            boolean z6 = iE == 1;
            this.f17805S = iE;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                sZ.D(viewC);
                i10 = 0;
                i6 = 0;
            } else {
                int[] iArr = new int[2];
                this.f17803Q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f17802P & 7) == 5) {
                    iArr[0] = iArr[0] + this.f17803Q.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i6 = iArr2[0] - iArr[0];
                i10 = iArr2[1] - iArr[1];
            }
            if ((this.f17802P & 5) == 5) {
                if (z6) {
                    i11 = i6 + iO;
                } else {
                    iO = viewC.getWidth();
                    i11 = i6 - iO;
                }
            } else if (z6) {
                iO = viewC.getWidth();
                i11 = i6 + iO;
            } else {
                i11 = i6 - iO;
            }
            sZ.e(i11);
            sZ.N(true);
            sZ.l(i10);
        } else {
            if (this.f17806T) {
                sZ.e(this.f17808V);
            }
            if (this.f17807U) {
                sZ.l(this.f17809W);
            }
            sZ.H(n());
        }
        this.f17797K.add(new androidx.appcompat.view.menu.d.C0340d(sZ, gVar, this.f17805S));
        sZ.b();
        android.widget.ListView listViewJ = sZ.j();
        listViewJ.setOnKeyListener(this);
        if (c0340d == null && this.f17811Y && gVar.x() != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) layoutInflaterFrom.inflate(p090j.g.f48770l, (android.view.ViewGroup) listViewJ, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            sZ.b();
        }
    }

    private androidx.appcompat.widget.S z() {
        androidx.appcompat.widget.S s6 = new androidx.appcompat.widget.S(this.f17790D, null, this.f17792F, this.f17793G);
        s6.U(this.f17800N);
        s6.L(this);
        s6.K(this);
        s6.D(this.f17803Q);
        s6.G(this.f17802P);
        s6.J(true);
        s6.I(2);
        return s6;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.f17797K.size() > 0 && ((androidx.appcompat.view.menu.d.C0340d) this.f17797K.get(0)).f17823a.a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        if (a()) {
            return;
        }
        java.util.Iterator it = this.f17796J.iterator();
        while (it.hasNext()) {
            F((androidx.appcompat.view.menu.g) it.next());
        }
        this.f17796J.clear();
        android.view.View view = this.f17803Q;
        this.f17804R = view;
        if (view != null) {
            boolean z6 = this.f17813a0 == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f17813a0 = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17798L);
            }
            this.f17804R.addOnAttachStateChangeListener(this.f17799M);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        int iA = A(gVar);
        if (iA < 0) {
            return;
        }
        int i6 = iA + 1;
        if (i6 < this.f17797K.size()) {
            ((androidx.appcompat.view.menu.d.C0340d) this.f17797K.get(i6)).f17824b.e(false);
        }
        androidx.appcompat.view.menu.d.C0340d c0340d = (androidx.appcompat.view.menu.d.C0340d) this.f17797K.remove(iA);
        c0340d.f17824b.O(this);
        if (this.f17815c0) {
            c0340d.f17823a.T(null);
            c0340d.f17823a.E(0);
        }
        c0340d.f17823a.dismiss();
        int size = this.f17797K.size();
        this.f17805S = size > 0 ? ((androidx.appcompat.view.menu.d.C0340d) this.f17797K.get(size - 1)).f17825c : D();
        if (size != 0) {
            if (z6) {
                ((androidx.appcompat.view.menu.d.C0340d) this.f17797K.get(0)).f17824b.e(false);
                return;
            }
            return;
        }
        dismiss();
        androidx.appcompat.view.menu.m.a aVar = this.f17812Z;
        if (aVar != null) {
            aVar.c(gVar, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f17813a0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f17813a0.removeGlobalOnLayoutListener(this.f17798L);
            }
            this.f17813a0 = null;
        }
        this.f17804R.removeOnAttachStateChangeListener(this.f17799M);
        this.f17814b0.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        java.util.Iterator it = this.f17797K.iterator();
        while (it.hasNext()) {
            androidx.appcompat.view.menu.k.y(((androidx.appcompat.view.menu.d.C0340d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f17797K.size();
        if (size > 0) {
            androidx.appcompat.view.menu.d.C0340d[] c0340dArr = (androidx.appcompat.view.menu.d.C0340d[]) this.f17797K.toArray(new androidx.appcompat.view.menu.d.C0340d[size]);
            for (int i6 = size - 1; i6 >= 0; i6--) {
                androidx.appcompat.view.menu.d.C0340d c0340d = c0340dArr[i6];
                if (c0340d.f17823a.a()) {
                    c0340d.f17823a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(androidx.appcompat.view.menu.m.a aVar) {
        this.f17812Z = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public android.widget.ListView j() {
        if (this.f17797K.isEmpty()) {
            return null;
        }
        java.util.List list = this.f17797K;
        return ((androidx.appcompat.view.menu.d.C0340d) list.get(list.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        for (androidx.appcompat.view.menu.d.C0340d c0340d : this.f17797K) {
            if (rVar == c0340d.f17824b) {
                c0340d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        androidx.appcompat.view.menu.m.a aVar = this.f17812Z;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(androidx.appcompat.view.menu.g gVar) {
        gVar.c(this, this.f17790D);
        if (a()) {
            F(gVar);
        } else {
            this.f17796J.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        androidx.appcompat.view.menu.d.C0340d c0340d;
        int size = this.f17797K.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                c0340d = null;
                break;
            }
            c0340d = (androidx.appcompat.view.menu.d.C0340d) this.f17797K.get(i6);
            if (!c0340d.f17823a.a()) {
                break;
            } else {
                i6++;
            }
        }
        if (c0340d != null) {
            c0340d.f17824b.e(false);
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
        if (this.f17803Q != view) {
            this.f17803Q = view;
            this.f17802P = androidx.core.view.AbstractC2025s.b(this.f17801O, androidx.core.view.X.z(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z6) {
        this.f17810X = z6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i6) {
        if (this.f17801O != i6) {
            this.f17801O = i6;
            this.f17802P = androidx.core.view.AbstractC2025s.b(i6, androidx.core.view.X.z(this.f17803Q));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i6) {
        this.f17806T = true;
        this.f17808V = i6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f17814b0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z6) {
        this.f17811Y = z6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i6) {
        this.f17807U = true;
        this.f17809W = i6;
    }
}
