package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class P implements androidx.appcompat.view.menu.p {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static java.lang.reflect.Method f18176i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static java.lang.reflect.Method f18177j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static java.lang.reflect.Method f18178k0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.content.Context f18179C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.widget.ListAdapter f18180D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.appcompat.widget.L f18181E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f18182F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f18183G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f18184H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f18185I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f18186J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f18187K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f18188L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f18189M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f18190N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f18191O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f18192P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    int f18193Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private android.view.View f18194R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18195S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private android.database.DataSetObserver f18196T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private android.view.View f18197U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18198V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private android.widget.AdapterView.OnItemClickListener f18199W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private android.widget.AdapterView.OnItemSelectedListener f18200X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    final androidx.appcompat.widget.P.i f18201Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final androidx.appcompat.widget.P.h f18202Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final androidx.appcompat.widget.P.g f18203a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final androidx.appcompat.widget.P.e f18204b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private java.lang.Runnable f18205c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    final android.os.Handler f18206d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final android.graphics.Rect f18207e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private android.graphics.Rect f18208f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f18209g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    android.widget.PopupWindow f18210h0;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.View viewT = androidx.appcompat.widget.P.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            androidx.appcompat.widget.P.this.b();
        }
    }

    class b implements android.widget.AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
            androidx.appcompat.widget.L l6;
            if (i6 == -1 || (l6 = androidx.appcompat.widget.P.this.f18181E) == null) {
                return;
            }
            l6.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView adapterView) {
        }
    }

    static class c {
        static int a(android.widget.PopupWindow popupWindow, android.view.View view, int i6, boolean z6) {
            return popupWindow.getMaxAvailableHeight(view, i6, z6);
        }
    }

    static class d {
        static void a(android.widget.PopupWindow popupWindow, android.graphics.Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(android.widget.PopupWindow popupWindow, boolean z6) {
            popupWindow.setIsClippedToScreen(z6);
        }
    }

    private class e implements java.lang.Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.P.this.r();
        }
    }

    private class f extends android.database.DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (androidx.appcompat.widget.P.this.a()) {
                androidx.appcompat.widget.P.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            androidx.appcompat.widget.P.this.dismiss();
        }
    }

    private class g implements android.widget.AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView absListView, int i6, int i10, int i11) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView absListView, int i6) {
            if (i6 != 1 || androidx.appcompat.widget.P.this.A() || androidx.appcompat.widget.P.this.f18210h0.getContentView() == null) {
                return;
            }
            androidx.appcompat.widget.P p6 = androidx.appcompat.widget.P.this;
            p6.f18206d0.removeCallbacks(p6.f18201Y);
            androidx.appcompat.widget.P.this.f18201Y.run();
        }
    }

    private class h implements android.view.View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            android.widget.PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = androidx.appcompat.widget.P.this.f18210h0) != null && popupWindow.isShowing() && x6 >= 0 && x6 < androidx.appcompat.widget.P.this.f18210h0.getWidth() && y6 >= 0 && y6 < androidx.appcompat.widget.P.this.f18210h0.getHeight()) {
                androidx.appcompat.widget.P p6 = androidx.appcompat.widget.P.this;
                p6.f18206d0.postDelayed(p6.f18201Y, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            androidx.appcompat.widget.P p10 = androidx.appcompat.widget.P.this;
            p10.f18206d0.removeCallbacks(p10.f18201Y);
            return false;
        }
    }

    private class i implements java.lang.Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.L l6 = androidx.appcompat.widget.P.this.f18181E;
            if (l6 == null || !androidx.core.view.X.Q(l6) || androidx.appcompat.widget.P.this.f18181E.getCount() <= androidx.appcompat.widget.P.this.f18181E.getChildCount()) {
                return;
            }
            int childCount = androidx.appcompat.widget.P.this.f18181E.getChildCount();
            androidx.appcompat.widget.P p6 = androidx.appcompat.widget.P.this;
            if (childCount <= p6.f18193Q) {
                p6.f18210h0.setInputMethodMode(2);
                androidx.appcompat.widget.P.this.b();
            }
        }
    }

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                f18176i0 = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            try {
                f18178k0 = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
        }
        if (android.os.Build.VERSION.SDK_INT <= 23) {
            try {
                f18177j0 = android.widget.PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", android.view.View.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused3) {
            }
        }
    }

    public P(android.content.Context context) {
        this(context, null, p090j.a.f48614B);
    }

    public P(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public P(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        this.f18182F = -2;
        this.f18183G = -2;
        this.f18186J = 1002;
        this.f18190N = 0;
        this.f18191O = false;
        this.f18192P = false;
        this.f18193Q = Integer.MAX_VALUE;
        this.f18195S = 0;
        this.f18201Y = new androidx.appcompat.widget.P.i();
        this.f18202Z = new androidx.appcompat.widget.P.h();
        this.f18203a0 = new androidx.appcompat.widget.P.g();
        this.f18204b0 = new androidx.appcompat.widget.P.e();
        this.f18207e0 = new android.graphics.Rect();
        this.f18179C = context;
        this.f18206d0 = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f48958l1, i6, i10);
        this.f18184H = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p090j.j.f48963m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p090j.j.f48968n1, 0);
        this.f18185I = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f18187K = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.C1913t c1913t = new androidx.appcompat.widget.C1913t(context, attributeSet, i6, i10);
        this.f18210h0 = c1913t;
        c1913t.setInputMethodMode(1);
    }

    private void C() {
        android.view.View view = this.f18194R;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f18194R);
            }
        }
    }

    private void O(boolean z6) {
        if (android.os.Build.VERSION.SDK_INT > 28) {
            androidx.appcompat.widget.P.d.b(this.f18210h0, z6);
            return;
        }
        java.lang.reflect.Method method = f18176i0;
        if (method != null) {
            try {
                method.invoke(this.f18210h0, java.lang.Boolean.valueOf(z6));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0129 A[PHI: r1
  0x0129: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011d, B:47:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    private int q() {
        int measuredHeight;
        int i6;
        int iMakeMeasureSpec;
        android.view.View view;
        int i10;
        int i11 = Integer.MIN_VALUE;
        if (this.f18181E == null) {
            android.content.Context context = this.f18179C;
            this.f18205c0 = new androidx.appcompat.widget.P.a();
            androidx.appcompat.widget.L lS = s(context, !this.f18209g0);
            this.f18181E = lS;
            android.graphics.drawable.Drawable drawable = this.f18198V;
            if (drawable != null) {
                lS.setSelector(drawable);
            }
            this.f18181E.setAdapter(this.f18180D);
            this.f18181E.setOnItemClickListener(this.f18199W);
            this.f18181E.setFocusable(true);
            this.f18181E.setFocusableInTouchMode(true);
            this.f18181E.setOnItemSelectedListener(new androidx.appcompat.widget.P.b());
            this.f18181E.setOnScrollListener(this.f18203a0);
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f18200X;
            if (onItemSelectedListener != null) {
                this.f18181E.setOnItemSelectedListener(onItemSelectedListener);
            }
            androidx.appcompat.widget.L l6 = this.f18181E;
            android.view.View view2 = this.f18194R;
            if (view2 != null) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                linearLayout.setOrientation(1);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f18195S;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(l6, layoutParams);
                } else if (i12 != 1) {
                    java.lang.String str = "Invalid hint position " + this.f18195S;
                } else {
                    linearLayout.addView(l6, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f18183G;
                if (i13 >= 0) {
                    i10 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i10 = 0;
                }
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i13, i10), 0);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = l6;
            }
            this.f18210h0.setContentView(view);
        } else {
            android.view.View view3 = this.f18194R;
            if (view3 != null) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        android.graphics.drawable.Drawable background = this.f18210h0.getBackground();
        if (background != null) {
            background.getPadding(this.f18207e0);
            android.graphics.Rect rect = this.f18207e0;
            int i14 = rect.top;
            i6 = rect.bottom + i14;
            if (!this.f18187K) {
                this.f18185I = -i14;
            }
        } else {
            this.f18207e0.setEmpty();
            i6 = 0;
        }
        int iU = u(t(), this.f18185I, this.f18210h0.getInputMethodMode() == 2);
        if (this.f18191O || this.f18182F == -1) {
            return iU + i6;
        }
        int i15 = this.f18183G;
        if (i15 != -2) {
            i11 = 1073741824;
            if (i15 != -1) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                int i16 = this.f18179C.getResources().getDisplayMetrics().widthPixels;
                android.graphics.Rect rect2 = this.f18207e0;
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), i11);
            }
        } else {
            int i17 = this.f18179C.getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = this.f18207e0;
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), i11);
        }
        int iD = this.f18181E.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i6 + this.f18181E.getPaddingTop() + this.f18181E.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(android.view.View view, int i6, boolean z6) {
        if (android.os.Build.VERSION.SDK_INT > 23) {
            return androidx.appcompat.widget.P.c.a(this.f18210h0, view, i6, z6);
        }
        java.lang.reflect.Method method = f18177j0;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(this.f18210h0, view, java.lang.Integer.valueOf(i6), java.lang.Boolean.valueOf(z6))).intValue();
            } catch (java.lang.Exception unused) {
            }
        }
        return this.f18210h0.getMaxAvailableHeight(view, i6);
    }

    public boolean A() {
        return this.f18210h0.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f18209g0;
    }

    public void D(android.view.View view) {
        this.f18197U = view;
    }

    public void E(int i6) {
        this.f18210h0.setAnimationStyle(i6);
    }

    public void F(int i6) {
        android.graphics.drawable.Drawable background = this.f18210h0.getBackground();
        if (background == null) {
            R(i6);
            return;
        }
        background.getPadding(this.f18207e0);
        android.graphics.Rect rect = this.f18207e0;
        this.f18183G = rect.left + rect.right + i6;
    }

    public void G(int i6) {
        this.f18190N = i6;
    }

    public void H(android.graphics.Rect rect) {
        this.f18208f0 = rect != null ? new android.graphics.Rect(rect) : null;
    }

    public void I(int i6) {
        this.f18210h0.setInputMethodMode(i6);
    }

    public void J(boolean z6) {
        this.f18209g0 = z6;
        this.f18210h0.setFocusable(z6);
    }

    public void K(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f18210h0.setOnDismissListener(onDismissListener);
    }

    public void L(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f18199W = onItemClickListener;
    }

    public void M(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f18200X = onItemSelectedListener;
    }

    public void N(boolean z6) {
        this.f18189M = true;
        this.f18188L = z6;
    }

    public void P(int i6) {
        this.f18195S = i6;
    }

    public void Q(int i6) {
        androidx.appcompat.widget.L l6 = this.f18181E;
        if (!a() || l6 == null) {
            return;
        }
        l6.setListSelectionHidden(false);
        l6.setSelection(i6);
        if (l6.getChoiceMode() != 0) {
            l6.setItemChecked(i6, true);
        }
    }

    public void R(int i6) {
        this.f18183G = i6;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.f18210h0.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.g.b(this.f18210h0, this.f18186J);
        if (this.f18210h0.isShowing()) {
            if (androidx.core.view.X.Q(t())) {
                int width = this.f18183G;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i6 = this.f18182F;
                if (i6 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f18210h0.setWidth(this.f18183G == -1 ? -1 : 0);
                        this.f18210h0.setHeight(0);
                    } else {
                        this.f18210h0.setWidth(this.f18183G == -1 ? -1 : 0);
                        this.f18210h0.setHeight(-1);
                    }
                } else if (i6 != -2) {
                    iQ = i6;
                }
                this.f18210h0.setOutsideTouchable((this.f18192P || this.f18191O) ? false : true);
                this.f18210h0.update(t(), this.f18184H, this.f18185I, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f18183G;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i10 = this.f18182F;
        if (i10 == -1) {
            iQ = -1;
        } else if (i10 != -2) {
            iQ = i10;
        }
        this.f18210h0.setWidth(width2);
        this.f18210h0.setHeight(iQ);
        O(true);
        this.f18210h0.setOutsideTouchable((this.f18192P || this.f18191O) ? false : true);
        this.f18210h0.setTouchInterceptor(this.f18202Z);
        if (this.f18189M) {
            androidx.core.widget.g.a(this.f18210h0, this.f18188L);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = f18178k0;
            if (method != null) {
                try {
                    method.invoke(this.f18210h0, this.f18208f0);
                } catch (java.lang.Exception e6) {
                }
            }
        } else {
            androidx.appcompat.widget.P.d.a(this.f18210h0, this.f18208f0);
        }
        androidx.core.widget.g.c(this.f18210h0, t(), this.f18184H, this.f18185I, this.f18190N);
        this.f18181E.setSelection(-1);
        if (!this.f18209g0 || this.f18181E.isInTouchMode()) {
            r();
        }
        if (this.f18209g0) {
            return;
        }
        this.f18206d0.post(this.f18204b0);
    }

    public int c() {
        return this.f18184H;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.f18210h0.dismiss();
        C();
        this.f18210h0.setContentView(null);
        this.f18181E = null;
        this.f18206d0.removeCallbacks(this.f18201Y);
    }

    public void e(int i6) {
        this.f18184H = i6;
    }

    public android.graphics.drawable.Drawable h() {
        return this.f18210h0.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public android.widget.ListView j() {
        return this.f18181E;
    }

    public void k(android.graphics.drawable.Drawable drawable) {
        this.f18210h0.setBackgroundDrawable(drawable);
    }

    public void l(int i6) {
        this.f18185I = i6;
        this.f18187K = true;
    }

    public int o() {
        if (this.f18187K) {
            return this.f18185I;
        }
        return 0;
    }

    public void p(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.f18196T;
        if (dataSetObserver == null) {
            this.f18196T = new androidx.appcompat.widget.P.f();
        } else {
            android.widget.ListAdapter listAdapter2 = this.f18180D;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f18180D = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f18196T);
        }
        androidx.appcompat.widget.L l6 = this.f18181E;
        if (l6 != null) {
            l6.setAdapter(this.f18180D);
        }
    }

    public void r() {
        androidx.appcompat.widget.L l6 = this.f18181E;
        if (l6 != null) {
            l6.setListSelectionHidden(true);
            l6.requestLayout();
        }
    }

    androidx.appcompat.widget.L s(android.content.Context context, boolean z6) {
        return new androidx.appcompat.widget.L(context, z6);
    }

    public android.view.View t() {
        return this.f18197U;
    }

    public java.lang.Object v() {
        if (a()) {
            return this.f18181E.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f18181E.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f18181E.getSelectedItemPosition();
        }
        return -1;
    }

    public android.view.View y() {
        if (a()) {
            return this.f18181E.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f18183G;
    }
}
