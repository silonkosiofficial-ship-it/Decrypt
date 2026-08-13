package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements androidx.core.view.InterfaceC2033w {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    androidx.appcompat.widget.ActionMenuView f18307C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.widget.TextView f18308D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.widget.TextView f18309E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.widget.ImageButton f18310F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.widget.ImageView f18311G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18312H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.CharSequence f18313I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    android.widget.ImageButton f18314J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    android.view.View f18315K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.content.Context f18316L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f18317M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f18318N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f18319O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f18320P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f18321Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f18322R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18323S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18324T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f18325U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private androidx.appcompat.widget.V f18326V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18327W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f18328a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f18329b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private java.lang.CharSequence f18330c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private java.lang.CharSequence f18331d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private android.content.res.ColorStateList f18332e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private android.content.res.ColorStateList f18333f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f18334g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f18335h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final java.util.ArrayList f18336i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final java.util.ArrayList f18337j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final int[] f18338k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    final androidx.core.view.C2035x f18339l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private java.util.ArrayList f18340m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final androidx.appcompat.widget.ActionMenuView.e f18341n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private androidx.appcompat.widget.g0 f18342o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private androidx.appcompat.widget.C1897c f18343p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private androidx.appcompat.widget.Toolbar.f f18344q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f18345r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    androidx.appcompat.view.menu.g.a f18346s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f18347t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private android.window.OnBackInvokedCallback f18348u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private android.window.OnBackInvokedDispatcher f18349v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f18350w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final java.lang.Runnable f18351x0;

    class a implements androidx.appcompat.widget.ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            if (androidx.appcompat.widget.Toolbar.this.f18339l0.d(menuItem)) {
                return true;
            }
            androidx.appcompat.widget.Toolbar.this.getClass();
            return false;
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.Toolbar.this.R();
        }
    }

    class c implements androidx.appcompat.view.menu.g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.g.a aVar = androidx.appcompat.widget.Toolbar.this.f18346s0;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!androidx.appcompat.widget.Toolbar.this.f18307C.J()) {
                androidx.appcompat.widget.Toolbar.this.f18339l0.e(gVar);
            }
            androidx.appcompat.view.menu.g.a aVar = androidx.appcompat.widget.Toolbar.this.f18346s0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements android.view.View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.appcompat.widget.Toolbar.this.f();
        }
    }

    static class e {
        static android.window.OnBackInvokedDispatcher a(android.view.View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static android.window.OnBackInvokedCallback b(final java.lang.Runnable runnable) {
            j$.util.Objects.requireNonNull(runnable);
            return new android.window.OnBackInvokedCallback() { // from class: androidx.appcompat.widget.f0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) obj2);
        }

        static void d(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.m {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        androidx.appcompat.view.menu.g f18356C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        androidx.appcompat.view.menu.i f18357D;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(boolean z6) {
            if (this.f18357D != null) {
                androidx.appcompat.view.menu.g gVar = this.f18356C;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (this.f18356C.getItem(i6) == this.f18357D) {
                            return;
                        }
                    }
                }
                f(this.f18356C, this.f18357D);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            android.view.KeyEvent.Callback callback = androidx.appcompat.widget.Toolbar.this.f18315K;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).e();
            }
            androidx.appcompat.widget.Toolbar toolbar = androidx.appcompat.widget.Toolbar.this;
            toolbar.removeView(toolbar.f18315K);
            androidx.appcompat.widget.Toolbar toolbar2 = androidx.appcompat.widget.Toolbar.this;
            toolbar2.removeView(toolbar2.f18314J);
            androidx.appcompat.widget.Toolbar toolbar3 = androidx.appcompat.widget.Toolbar.this;
            toolbar3.f18315K = null;
            toolbar3.a();
            this.f18357D = null;
            androidx.appcompat.widget.Toolbar.this.requestLayout();
            iVar.r(false);
            androidx.appcompat.widget.Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            androidx.appcompat.widget.Toolbar.this.h();
            android.view.ViewParent parent = androidx.appcompat.widget.Toolbar.this.f18314J.getParent();
            androidx.appcompat.widget.Toolbar toolbar = androidx.appcompat.widget.Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(toolbar.f18314J);
                }
                androidx.appcompat.widget.Toolbar toolbar2 = androidx.appcompat.widget.Toolbar.this;
                toolbar2.addView(toolbar2.f18314J);
            }
            androidx.appcompat.widget.Toolbar.this.f18315K = iVar.getActionView();
            this.f18357D = iVar;
            android.view.ViewParent parent2 = androidx.appcompat.widget.Toolbar.this.f18315K.getParent();
            androidx.appcompat.widget.Toolbar toolbar3 = androidx.appcompat.widget.Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent2).removeView(toolbar3.f18315K);
                }
                androidx.appcompat.widget.Toolbar.g gVarGenerateDefaultLayoutParams = androidx.appcompat.widget.Toolbar.this.generateDefaultLayoutParams();
                androidx.appcompat.widget.Toolbar toolbar4 = androidx.appcompat.widget.Toolbar.this;
                gVarGenerateDefaultLayoutParams.f17517a = (toolbar4.f18320P & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f18359b = 2;
                toolbar4.f18315K.setLayoutParams(gVarGenerateDefaultLayoutParams);
                androidx.appcompat.widget.Toolbar toolbar5 = androidx.appcompat.widget.Toolbar.this;
                toolbar5.addView(toolbar5.f18315K);
            }
            androidx.appcompat.widget.Toolbar.this.K();
            androidx.appcompat.widget.Toolbar.this.requestLayout();
            iVar.r(true);
            android.view.KeyEvent.Callback callback = androidx.appcompat.widget.Toolbar.this.f18315K;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            androidx.appcompat.widget.Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(android.content.Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f18356C;
            if (gVar2 != null && (iVar = this.f18357D) != null) {
                gVar2.f(iVar);
            }
            this.f18356C = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k(androidx.appcompat.view.menu.r rVar) {
            return false;
        }
    }

    public static class g extends androidx.appcompat.app.AbstractC1890a.C0338a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18359b;

        public g(int i6, int i10) {
            super(i6, i10);
            this.f18359b = 0;
            this.f17517a = 8388627;
        }

        public g(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18359b = 0;
        }

        public g(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f18359b = 0;
        }

        public g(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f18359b = 0;
            a(marginLayoutParams);
        }

        public g(androidx.appcompat.app.AbstractC1890a.C0338a c0338a) {
            super(c0338a);
            this.f18359b = 0;
        }

        public g(androidx.appcompat.widget.Toolbar.g gVar) {
            super((androidx.appcompat.app.AbstractC1890a.C0338a) gVar);
            this.f18359b = 0;
            this.f18359b = gVar.f18359b;
        }

        void a(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface h {
    }

    public static class i extends I1.a {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.i> CREATOR = new androidx.appcompat.widget.Toolbar.i.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f18360E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        boolean f18361F;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.Toolbar.i createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.Toolbar.i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.Toolbar.i createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.appcompat.widget.Toolbar.i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.Toolbar.i[] newArray(int i6) {
                return new androidx.appcompat.widget.Toolbar.i[i6];
            }
        }

        public i(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18360E = parcel.readInt();
            this.f18361F = parcel.readInt() != 0;
        }

        public i(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f18360E);
            parcel.writeInt(this.f18361F ? 1 : 0);
        }
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48623K);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18329b0 = 8388627;
        this.f18336i0 = new java.util.ArrayList();
        this.f18337j0 = new java.util.ArrayList();
        this.f18338k0 = new int[2];
        this.f18339l0 = new androidx.core.view.C2035x(new java.lang.Runnable() { // from class: androidx.appcompat.widget.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18468C.A();
            }
        });
        this.f18340m0 = new java.util.ArrayList();
        this.f18341n0 = new androidx.appcompat.widget.Toolbar.a();
        this.f18351x0 = new androidx.appcompat.widget.Toolbar.b();
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(getContext(), attributeSet, p090j.j.f48856O2, i6, 0);
        androidx.core.view.X.l0(this, context, p090j.j.f48856O2, attributeSet, c0VarV.r(), i6, 0);
        this.f18318N = c0VarV.n(p090j.j.f48985q3, 0);
        this.f18319O = c0VarV.n(p090j.j.f48940h3, 0);
        this.f18329b0 = c0VarV.l(p090j.j.f48860P2, this.f18329b0);
        this.f18320P = c0VarV.l(p090j.j.f48864Q2, 48);
        int iE = c0VarV.e(p090j.j.f48955k3, 0);
        iE = c0VarV.s(p090j.j.f48980p3) ? c0VarV.e(p090j.j.f48980p3, iE) : iE;
        this.f18325U = iE;
        this.f18324T = iE;
        this.f18323S = iE;
        this.f18322R = iE;
        int iE2 = c0VarV.e(p090j.j.f48970n3, -1);
        if (iE2 >= 0) {
            this.f18322R = iE2;
        }
        int iE3 = c0VarV.e(p090j.j.f48965m3, -1);
        if (iE3 >= 0) {
            this.f18323S = iE3;
        }
        int iE4 = c0VarV.e(p090j.j.f48975o3, -1);
        if (iE4 >= 0) {
            this.f18324T = iE4;
        }
        int iE5 = c0VarV.e(p090j.j.f48960l3, -1);
        if (iE5 >= 0) {
            this.f18325U = iE5;
        }
        this.f18321Q = c0VarV.f(p090j.j.f48910b3, -1);
        int iE6 = c0VarV.e(p090j.j.f48892X2, Integer.MIN_VALUE);
        int iE7 = c0VarV.e(p090j.j.f48876T2, Integer.MIN_VALUE);
        int iF = c0VarV.f(p090j.j.f48884V2, 0);
        int iF2 = c0VarV.f(p090j.j.f48888W2, 0);
        i();
        this.f18326V.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f18326V.g(iE6, iE7);
        }
        this.f18327W = c0VarV.e(p090j.j.f48896Y2, Integer.MIN_VALUE);
        this.f18328a0 = c0VarV.e(p090j.j.f48880U2, Integer.MIN_VALUE);
        this.f18312H = c0VarV.g(p090j.j.f48872S2);
        this.f18313I = c0VarV.p(p090j.j.f48868R2);
        java.lang.CharSequence charSequenceP = c0VarV.p(p090j.j.f48950j3);
        if (!android.text.TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        java.lang.CharSequence charSequenceP2 = c0VarV.p(p090j.j.f48935g3);
        if (!android.text.TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f18316L = getContext();
        setPopupTheme(c0VarV.n(p090j.j.f48930f3, 0));
        android.graphics.drawable.Drawable drawableG = c0VarV.g(p090j.j.f48925e3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        java.lang.CharSequence charSequenceP3 = c0VarV.p(p090j.j.f48920d3);
        if (!android.text.TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        android.graphics.drawable.Drawable drawableG2 = c0VarV.g(p090j.j.f48900Z2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        java.lang.CharSequence charSequenceP4 = c0VarV.p(p090j.j.f48905a3);
        if (!android.text.TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (c0VarV.s(p090j.j.f48990r3)) {
            setTitleTextColor(c0VarV.c(p090j.j.f48990r3));
        }
        if (c0VarV.s(p090j.j.f48945i3)) {
            setSubtitleTextColor(c0VarV.c(p090j.j.f48945i3));
        }
        if (c0VarV.s(p090j.j.f48915c3)) {
            z(c0VarV.n(p090j.j.f48915c3, 0));
        }
        c0VarV.w();
    }

    private boolean B(android.view.View view) {
        return view.getParent() == this || this.f18337j0.contains(view);
    }

    private int E(android.view.View view, int i6, int[] iArr, int i10) {
        androidx.appcompat.widget.Toolbar.g gVar = (androidx.appcompat.widget.Toolbar.g) view.getLayoutParams();
        int i11 = ((android.view.ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i6 + java.lang.Math.max(0, i11);
        iArr[0] = java.lang.Math.max(0, -i11);
        int iR = r(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(android.view.View view, int i6, int[] iArr, int i10) {
        androidx.appcompat.widget.Toolbar.g gVar = (androidx.appcompat.widget.Toolbar.g) view.getLayoutParams();
        int i11 = ((android.view.ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i6 - java.lang.Math.max(0, i11);
        iArr[1] = java.lang.Math.max(0, -i11);
        int iR = r(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(android.view.View view, int i6, int i10, int i11, int i12, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = java.lang.Math.max(0, i13) + java.lang.Math.max(0, i14);
        iArr[0] = java.lang.Math.max(0, -i13);
        iArr[1] = java.lang.Math.max(0, -i14);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + iMax + i10, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(android.view.View view, int i6, int i10, int i11, int i12, int i13) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        android.view.Menu menu = getMenu();
        java.util.ArrayList<android.view.MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f18339l0.b(menu, getMenuInflater());
        java.util.ArrayList<android.view.MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f18340m0 = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.f18351x0);
        post(this.f18351x0);
    }

    private boolean P() {
        if (!this.f18347t0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean Q(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(java.util.List list, int i6) {
        boolean z6 = androidx.core.view.X.z(this) == 1;
        int childCount = getChildCount();
        int iB = androidx.core.view.AbstractC2025s.b(i6, androidx.core.view.X.z(this));
        list.clear();
        if (!z6) {
            for (int i10 = 0; i10 < childCount; i10++) {
                android.view.View childAt = getChildAt(i10);
                androidx.appcompat.widget.Toolbar.g gVar = (androidx.appcompat.widget.Toolbar.g) childAt.getLayoutParams();
                if (gVar.f18359b == 0 && Q(childAt) && q(gVar.f17517a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            android.view.View childAt2 = getChildAt(i11);
            androidx.appcompat.widget.Toolbar.g gVar2 = (androidx.appcompat.widget.Toolbar.g) childAt2.getLayoutParams();
            if (gVar2.f18359b == 0 && Q(childAt2) && q(gVar2.f17517a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(android.view.View view, boolean z6) {
        androidx.appcompat.widget.Toolbar.g gVarGenerateLayoutParams;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (androidx.appcompat.widget.Toolbar.g) layoutParams;
        }
        gVarGenerateLayoutParams.f18359b = 1;
        if (!z6 || this.f18315K == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f18337j0.add(view);
        }
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
        java.util.ArrayList<android.view.MenuItem> arrayList = new java.util.ArrayList<>();
        android.view.Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void i() {
        if (this.f18326V == null) {
            this.f18326V = new androidx.appcompat.widget.V();
        }
    }

    private void j() {
        if (this.f18311G == null) {
            this.f18311G = new androidx.appcompat.widget.r(getContext());
        }
    }

    private void k() {
        l();
        if (this.f18307C.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f18307C.getMenu();
            if (this.f18344q0 == null) {
                this.f18344q0 = new androidx.appcompat.widget.Toolbar.f();
            }
            this.f18307C.setExpandedActionViewsExclusive(true);
            gVar.c(this.f18344q0, this.f18316L);
            S();
        }
    }

    private void l() {
        if (this.f18307C == null) {
            androidx.appcompat.widget.ActionMenuView actionMenuView = new androidx.appcompat.widget.ActionMenuView(getContext());
            this.f18307C = actionMenuView;
            actionMenuView.setPopupTheme(this.f18317M);
            this.f18307C.setOnMenuItemClickListener(this.f18341n0);
            this.f18307C.O(this.f18345r0, new androidx.appcompat.widget.Toolbar.c());
            androidx.appcompat.widget.Toolbar.g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f17517a = (this.f18320P & 112) | 8388613;
            this.f18307C.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f18307C, false);
        }
    }

    private void m() {
        if (this.f18310F == null) {
            this.f18310F = new androidx.appcompat.widget.C1910p(getContext(), null, p090j.a.f48622J);
            androidx.appcompat.widget.Toolbar.g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f17517a = (this.f18320P & 112) | 8388611;
            this.f18310F.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int q(int i6) {
        int iZ = androidx.core.view.X.z(this);
        int iB = androidx.core.view.AbstractC2025s.b(i6, iZ) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return iZ == 1 ? 5 : 3;
    }

    private int r(android.view.View view, int i6) {
        androidx.appcompat.widget.Toolbar.g gVar = (androidx.appcompat.widget.Toolbar.g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i6 > 0 ? (measuredHeight - i6) / 2 : 0;
        int iT = t(gVar.f17517a);
        if (iT == 48) {
            return getPaddingTop() - i10;
        }
        if (iT == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((android.view.ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i11) {
            iMax = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i13 = ((android.view.ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i12 < i13) {
                iMax = java.lang.Math.max(0, iMax - (i13 - i12));
            }
        }
        return paddingTop + iMax;
    }

    private int t(int i6) {
        int i10 = i6 & 112;
        return (i10 == 16 || i10 == 48 || i10 == 80) ? i10 : this.f18329b0 & 112;
    }

    private int u(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.AbstractC2031v.b(marginLayoutParams) + androidx.core.view.AbstractC2031v.a(marginLayoutParams);
    }

    private int v(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int w(java.util.List list, int[] iArr) {
        int i6 = iArr[0];
        int i10 = iArr[1];
        int size = list.size();
        int i11 = 0;
        int measuredWidth = 0;
        while (i11 < size) {
            android.view.View view = (android.view.View) list.get(i11);
            androidx.appcompat.widget.Toolbar.g gVar = (androidx.appcompat.widget.Toolbar.g) view.getLayoutParams();
            int i12 = ((android.view.ViewGroup.MarginLayoutParams) gVar).leftMargin - i6;
            int i13 = ((android.view.ViewGroup.MarginLayoutParams) gVar).rightMargin - i10;
            int iMax = java.lang.Math.max(0, i12);
            int iMax2 = java.lang.Math.max(0, i13);
            int iMax3 = java.lang.Math.max(0, -i12);
            int iMax4 = java.lang.Math.max(0, -i13);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i11++;
            i10 = iMax4;
            i6 = iMax3;
        }
        return measuredWidth;
    }

    public void A() {
        java.util.Iterator it = this.f18340m0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((android.view.MenuItem) it.next()).getItemId());
        }
        I();
    }

    public boolean C() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean D() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        return actionMenuView != null && actionMenuView.J();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (((androidx.appcompat.widget.Toolbar.g) childAt.getLayoutParams()).f18359b != 2 && childAt != this.f18307C) {
                removeViewAt(childCount);
                this.f18337j0.add(childAt);
            }
        }
    }

    public void L(int i6, int i10) {
        i();
        this.f18326V.g(i6, i10);
    }

    public void M(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.C1897c c1897c) {
        if (gVar == null && this.f18307C == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.g gVarN = this.f18307C.N();
        if (gVarN == gVar) {
            return;
        }
        if (gVarN != null) {
            gVarN.O(this.f18343p0);
            gVarN.O(this.f18344q0);
        }
        if (this.f18344q0 == null) {
            this.f18344q0 = new androidx.appcompat.widget.Toolbar.f();
        }
        c1897c.G(true);
        if (gVar != null) {
            gVar.c(c1897c, this.f18316L);
            gVar.c(this.f18344q0, this.f18316L);
        } else {
            c1897c.i(this.f18316L, null);
            this.f18344q0.i(this.f18316L, null);
            c1897c.d(true);
            this.f18344q0.d(true);
        }
        this.f18307C.setPopupTheme(this.f18317M);
        this.f18307C.setPresenter(c1897c);
        this.f18343p0 = c1897c;
        S();
    }

    public void N(android.content.Context context, int i6) {
        this.f18319O = i6;
        android.widget.TextView textView = this.f18309E;
        if (textView != null) {
            textView.setTextAppearance(context, i6);
        }
    }

    public void O(android.content.Context context, int i6) {
        this.f18318N = i6;
        android.widget.TextView textView = this.f18308D;
        if (textView != null) {
            textView.setTextAppearance(context, i6);
        }
    }

    public boolean R() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        return actionMenuView != null && actionMenuView.P();
    }

    void S() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherA = androidx.appcompat.widget.Toolbar.e.a(this);
            boolean z6 = x() && onBackInvokedDispatcherA != null && androidx.core.view.X.Q(this) && this.f18350w0;
            if (z6 && this.f18349v0 == null) {
                if (this.f18348u0 == null) {
                    this.f18348u0 = androidx.appcompat.widget.Toolbar.e.b(new java.lang.Runnable() { // from class: androidx.appcompat.widget.d0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f18461C.f();
                        }
                    });
                }
                androidx.appcompat.widget.Toolbar.e.c(onBackInvokedDispatcherA, this.f18348u0);
            } else {
                if (z6 || (onBackInvokedDispatcher = this.f18349v0) == null) {
                    return;
                }
                androidx.appcompat.widget.Toolbar.e.d(onBackInvokedDispatcher, this.f18348u0);
                onBackInvokedDispatcherA = null;
            }
            this.f18349v0 = onBackInvokedDispatcherA;
        }
    }

    void a() {
        for (int size = this.f18337j0.size() - 1; size >= 0; size--) {
            addView((android.view.View) this.f18337j0.get(size));
        }
        this.f18337j0.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof androidx.appcompat.widget.Toolbar.g);
    }

    @Override // androidx.core.view.InterfaceC2033w
    public void d(androidx.core.view.InterfaceC2039z interfaceC2039z) {
        this.f18339l0.f(interfaceC2039z);
    }

    public boolean e() {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f18307C) != null && actionMenuView.K();
    }

    public void f() {
        androidx.appcompat.widget.Toolbar.f fVar = this.f18344q0;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f18357D;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void g() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public java.lang.CharSequence getCollapseContentDescription() {
        android.widget.ImageButton imageButton = this.f18314J;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
        android.widget.ImageButton imageButton = this.f18314J;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        androidx.appcompat.widget.V v6 = this.f18326V;
        if (v6 != null) {
            return v6.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.f18328a0;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        androidx.appcompat.widget.V v6 = this.f18326V;
        if (v6 != null) {
            return v6.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        androidx.appcompat.widget.V v6 = this.f18326V;
        if (v6 != null) {
            return v6.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        androidx.appcompat.widget.V v6 = this.f18326V;
        if (v6 != null) {
            return v6.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.f18327W;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarN;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        return (actionMenuView == null || (gVarN = actionMenuView.N()) == null || !gVarN.hasVisibleItems()) ? getContentInsetEnd() : java.lang.Math.max(getContentInsetEnd(), java.lang.Math.max(this.f18328a0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.X.z(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.X.z(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? java.lang.Math.max(getContentInsetStart(), java.lang.Math.max(this.f18327W, 0)) : getContentInsetStart();
    }

    public android.graphics.drawable.Drawable getLogo() {
        android.widget.ImageView imageView = this.f18311G;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public java.lang.CharSequence getLogoDescription() {
        android.widget.ImageView imageView = this.f18311G;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public android.view.Menu getMenu() {
        k();
        return this.f18307C.getMenu();
    }

    android.view.View getNavButtonView() {
        return this.f18310F;
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        android.widget.ImageButton imageButton = this.f18310F;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
        android.widget.ImageButton imageButton = this.f18310F;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.C1897c getOuterActionMenuPresenter() {
        return this.f18343p0;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        k();
        return this.f18307C.getOverflowIcon();
    }

    android.content.Context getPopupContext() {
        return this.f18316L;
    }

    public int getPopupTheme() {
        return this.f18317M;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f18331d0;
    }

    final android.widget.TextView getSubtitleTextView() {
        return this.f18309E;
    }

    public java.lang.CharSequence getTitle() {
        return this.f18330c0;
    }

    public int getTitleMarginBottom() {
        return this.f18325U;
    }

    public int getTitleMarginEnd() {
        return this.f18323S;
    }

    public int getTitleMarginStart() {
        return this.f18322R;
    }

    public int getTitleMarginTop() {
        return this.f18324T;
    }

    final android.widget.TextView getTitleTextView() {
        return this.f18308D;
    }

    public androidx.appcompat.widget.J getWrapper() {
        if (this.f18342o0 == null) {
            this.f18342o0 = new androidx.appcompat.widget.g0(this, true);
        }
        return this.f18342o0;
    }

    void h() {
        if (this.f18314J == null) {
            androidx.appcompat.widget.C1910p c1910p = new androidx.appcompat.widget.C1910p(getContext(), null, p090j.a.f48622J);
            this.f18314J = c1910p;
            c1910p.setImageDrawable(this.f18312H);
            this.f18314J.setContentDescription(this.f18313I);
            androidx.appcompat.widget.Toolbar.g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f17517a = (this.f18320P & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f18359b = 2;
            this.f18314J.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f18314J.setOnClickListener(new androidx.appcompat.widget.Toolbar.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.Toolbar.g generateDefaultLayoutParams() {
        return new androidx.appcompat.widget.Toolbar.g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.Toolbar.g generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.Toolbar.g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f18351x0);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f18335h0 = false;
        }
        if (!this.f18335h0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f18335h0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f18335h0 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0224  */
    /* JADX WARN: Code duplicated, block: B:103:0x0238  */
    /* JADX WARN: Code duplicated, block: B:104:0x025b  */
    /* JADX WARN: Code duplicated, block: B:106:0x025e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0280  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:112:0x0297 A[LOOP:0: B:111:0x0295->B:112:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b9 A[LOOP:1: B:114:0x02b7->B:115:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f2 A[LOOP:2: B:123:0x02f0->B:124:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:81:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211  */
    /* JADX WARN: Code duplicated, block: B:95:0x0214  */
    /* JADX WARN: Code duplicated, block: B:97:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        int iE;
        int iF;
        int iMax;
        int iMin;
        boolean zQ;
        boolean zQ2;
        int measuredHeight;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        androidx.appcompat.widget.Toolbar.g gVar;
        androidx.appcompat.widget.Toolbar.g gVar2;
        boolean z10;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int size;
        int iE2;
        int i27;
        int i28;
        int size2;
        int i29;
        int i30;
        int i31;
        int size3;
        android.widget.ImageView imageView;
        android.view.View view;
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        android.widget.ImageButton imageButton;
        boolean z11 = androidx.core.view.X.z(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i32 = width - paddingRight;
        int[] iArr = this.f18338k0;
        iArr[1] = 0;
        iArr[0] = 0;
        int iA = androidx.core.view.X.A(this);
        int iMin2 = iA >= 0 ? java.lang.Math.min(iA, i12 - i10) : 0;
        if (Q(this.f18310F)) {
            android.widget.ImageButton imageButton2 = this.f18310F;
            if (z11) {
                iF = F(imageButton2, i32, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (Q(this.f18314J)) {
                imageButton = this.f18314J;
                if (z11) {
                    iF = F(imageButton, iF, iArr, iMin2);
                } else {
                    iE = E(imageButton, iE, iArr, iMin2);
                }
            }
            if (Q(this.f18307C)) {
                actionMenuView = this.f18307C;
                if (z11) {
                    iE = E(actionMenuView, iE, iArr, iMin2);
                } else {
                    iF = F(actionMenuView, iF, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = java.lang.Math.max(0, currentContentInsetLeft - iE);
            iArr[1] = java.lang.Math.max(0, currentContentInsetRight - (i32 - iF));
            iMax = java.lang.Math.max(iE, currentContentInsetLeft);
            iMin = java.lang.Math.min(iF, i32 - currentContentInsetRight);
            if (Q(this.f18315K)) {
                view = this.f18315K;
                if (z11) {
                    iMin = F(view, iMin, iArr, iMin2);
                } else {
                    iMax = E(view, iMax, iArr, iMin2);
                }
            }
            if (Q(this.f18311G)) {
                imageView = this.f18311G;
                if (z11) {
                    iMin = F(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = E(imageView, iMax, iArr, iMin2);
                }
            }
            zQ = Q(this.f18308D);
            zQ2 = Q(this.f18309E);
            if (zQ) {
                androidx.appcompat.widget.Toolbar.g gVar3 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                measuredHeight = ((android.view.ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f18308D.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zQ2) {
                androidx.appcompat.widget.Toolbar.g gVar4 = (androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams();
                measuredHeight += ((android.view.ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f18309E.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zQ || zQ2) {
                if (zQ) {
                    textView = this.f18308D;
                } else {
                    textView = this.f18309E;
                }
                if (zQ2) {
                    textView2 = this.f18309E;
                } else {
                    textView2 = this.f18308D;
                }
                gVar = (androidx.appcompat.widget.Toolbar.g) textView.getLayoutParams();
                gVar2 = (androidx.appcompat.widget.Toolbar.g) textView2.getLayoutParams();
                z10 = (!zQ && this.f18308D.getMeasuredWidth() > 0) || (zQ2 && this.f18309E.getMeasuredWidth() > 0);
                i13 = this.f18329b0 & 112;
                i14 = paddingLeft;
                if (i13 == 48) {
                    paddingTop = getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin + this.f18324T;
                } else if (i13 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i22 = ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i23 = this.f18324T;
                    if (iMax2 < i22 + i23) {
                        iMax2 = i22 + i23;
                    } else {
                        i24 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i25 = ((android.view.ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i26 = this.f18325U;
                        if (i24 < i25 + i26) {
                            iMax2 = java.lang.Math.max(0, iMax2 - ((((android.view.ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((android.view.ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f18325U) - measuredHeight;
                }
                if (z11) {
                    if (z10) {
                        i19 = this.f18322R;
                    } else {
                        i19 = 0;
                    }
                    int i33 = i19 - iArr[1];
                    iMin -= java.lang.Math.max(0, i33);
                    iArr[1] = java.lang.Math.max(0, -i33);
                    if (zQ) {
                        androidx.appcompat.widget.Toolbar.g gVar5 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                        int measuredWidth = iMin - this.f18308D.getMeasuredWidth();
                        int measuredHeight2 = this.f18308D.getMeasuredHeight() + paddingTop;
                        this.f18308D.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth - this.f18323S;
                        paddingTop = measuredHeight2 + ((android.view.ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zQ2) {
                        int i34 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams())).topMargin;
                        this.f18309E.layout(iMin - this.f18309E.getMeasuredWidth(), i34, iMin, this.f18309E.getMeasuredHeight() + i34);
                        i21 = iMin - this.f18323S;
                    } else {
                        i21 = iMin;
                    }
                    if (z10) {
                        iMin = java.lang.Math.min(i20, i21);
                    }
                    iMax = iMax;
                } else {
                    if (z10) {
                        i15 = this.f18322R;
                    } else {
                        i15 = 0;
                    }
                    i16 = 0;
                    int i35 = i15 - iArr[0];
                    iMax += java.lang.Math.max(0, i35);
                    iArr[0] = java.lang.Math.max(0, -i35);
                    if (zQ) {
                        androidx.appcompat.widget.Toolbar.g gVar6 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                        int measuredWidth2 = this.f18308D.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f18308D.getMeasuredHeight() + paddingTop;
                        this.f18308D.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i17 = measuredWidth2 + this.f18323S;
                        paddingTop = measuredHeight3 + ((android.view.ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zQ2) {
                        int i36 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f18309E.getMeasuredWidth() + iMax;
                        this.f18309E.layout(iMax, i36, measuredWidth3, this.f18309E.getMeasuredHeight() + i36);
                        i18 = measuredWidth3 + this.f18323S;
                    } else {
                        i18 = iMax;
                    }
                    if (z10) {
                        iMax = java.lang.Math.max(i17, i18);
                    }
                }
                b(this.f18336i0, 3);
                size = this.f18336i0.size();
                iE2 = iMax;
                for (i27 = i16; i27 < size; i27++) {
                    iE2 = E((android.view.View) this.f18336i0.get(i27), iE2, iArr, iMin2);
                }
                i28 = iMin2;
                b(this.f18336i0, 5);
                size2 = this.f18336i0.size();
                for (i29 = i16; i29 < size2; i29++) {
                    iMin = F((android.view.View) this.f18336i0.get(i29), iMin, iArr, i28);
                }
                b(this.f18336i0, 1);
                int iW = w(this.f18336i0, iArr);
                i30 = (i14 + (((width - i14) - paddingRight) / 2)) - (iW / 2);
                i31 = iW + i30;
                if (i30 >= iE2) {
                    if (i31 > iMin) {
                        iE2 = i30 - (i31 - iMin);
                    } else {
                        iE2 = i30;
                    }
                }
                size3 = this.f18336i0.size();
                while (i16 < size3) {
                    iE2 = E((android.view.View) this.f18336i0.get(i16), iE2, iArr, i28);
                    i16++;
                }
                this.f18336i0.clear();
            }
            i14 = paddingLeft;
            iMin2 = iMin2;
            i16 = 0;
            b(this.f18336i0, 3);
            size = this.f18336i0.size();
            iE2 = iMax;
            while (i27 < size) {
                iE2 = E((android.view.View) this.f18336i0.get(i27), iE2, iArr, iMin2);
            }
            i28 = iMin2;
            b(this.f18336i0, 5);
            size2 = this.f18336i0.size();
            while (i29 < size2) {
                iMin = F((android.view.View) this.f18336i0.get(i29), iMin, iArr, i28);
            }
            b(this.f18336i0, 1);
            int iW2 = w(this.f18336i0, iArr);
            i30 = (i14 + (((width - i14) - paddingRight) / 2)) - (iW2 / 2);
            i31 = iW2 + i30;
            if (i30 >= iE2) {
                if (i31 > iMin) {
                    iE2 = i30 - (i31 - iMin);
                } else {
                    iE2 = i30;
                }
            }
            size3 = this.f18336i0.size();
            while (i16 < size3) {
                iE2 = E((android.view.View) this.f18336i0.get(i16), iE2, iArr, i28);
                i16++;
            }
            this.f18336i0.clear();
        }
        iE = paddingLeft;
        iF = i32;
        if (Q(this.f18314J)) {
            imageButton = this.f18314J;
            if (z11) {
                iF = F(imageButton, iF, iArr, iMin2);
            } else {
                iE = E(imageButton, iE, iArr, iMin2);
            }
        }
        if (Q(this.f18307C)) {
            actionMenuView = this.f18307C;
            if (z11) {
                iE = E(actionMenuView, iE, iArr, iMin2);
            } else {
                iF = F(actionMenuView, iF, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = java.lang.Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = java.lang.Math.max(0, currentContentInsetRight2 - (i32 - iF));
        iMax = java.lang.Math.max(iE, currentContentInsetLeft2);
        iMin = java.lang.Math.min(iF, i32 - currentContentInsetRight2);
        if (Q(this.f18315K)) {
            view = this.f18315K;
            if (z11) {
                iMin = F(view, iMin, iArr, iMin2);
            } else {
                iMax = E(view, iMax, iArr, iMin2);
            }
        }
        if (Q(this.f18311G)) {
            imageView = this.f18311G;
            if (z11) {
                iMin = F(imageView, iMin, iArr, iMin2);
            } else {
                iMax = E(imageView, iMax, iArr, iMin2);
            }
        }
        zQ = Q(this.f18308D);
        zQ2 = Q(this.f18309E);
        if (zQ) {
            androidx.appcompat.widget.Toolbar.g gVar7 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
            measuredHeight = ((android.view.ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f18308D.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) gVar7).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zQ2) {
            androidx.appcompat.widget.Toolbar.g gVar8 = (androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams();
            measuredHeight += ((android.view.ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f18309E.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zQ) {
            if (zQ) {
                textView = this.f18308D;
            } else {
                textView = this.f18309E;
            }
            if (zQ2) {
                textView2 = this.f18309E;
            } else {
                textView2 = this.f18308D;
            }
            gVar = (androidx.appcompat.widget.Toolbar.g) textView.getLayoutParams();
            gVar2 = (androidx.appcompat.widget.Toolbar.g) textView2.getLayoutParams();
            if (zQ) {
            }
            i13 = this.f18329b0 & 112;
            i14 = paddingLeft;
            if (i13 == 48) {
                paddingTop = getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin + this.f18324T;
            } else if (i13 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin;
                i23 = this.f18324T;
                if (iMax2 < i22 + i23) {
                    iMax2 = i22 + i23;
                } else {
                    i24 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i25 = ((android.view.ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i26 = this.f18325U;
                    if (i24 < i25 + i26) {
                        iMax2 = java.lang.Math.max(0, iMax2 - ((((android.view.ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((android.view.ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f18325U) - measuredHeight;
            }
            if (z11) {
                if (z10) {
                    i19 = this.f18322R;
                } else {
                    i19 = 0;
                }
                int i37 = i19 - iArr[1];
                iMin -= java.lang.Math.max(0, i37);
                iArr[1] = java.lang.Math.max(0, -i37);
                if (zQ) {
                    androidx.appcompat.widget.Toolbar.g gVar9 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                    int measuredWidth4 = iMin - this.f18308D.getMeasuredWidth();
                    int measuredHeight4 = this.f18308D.getMeasuredHeight() + paddingTop;
                    this.f18308D.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth4 - this.f18323S;
                    paddingTop = measuredHeight4 + ((android.view.ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zQ2) {
                    int i38 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams())).topMargin;
                    this.f18309E.layout(iMin - this.f18309E.getMeasuredWidth(), i38, iMin, this.f18309E.getMeasuredHeight() + i38);
                    i21 = iMin - this.f18323S;
                } else {
                    i21 = iMin;
                }
                if (z10) {
                    iMin = java.lang.Math.min(i20, i21);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z10) {
                    i15 = this.f18322R;
                } else {
                    i15 = 0;
                }
                i16 = 0;
                int i39 = i15 - iArr[0];
                iMax += java.lang.Math.max(0, i39);
                iArr[0] = java.lang.Math.max(0, -i39);
                if (zQ) {
                    androidx.appcompat.widget.Toolbar.g gVar10 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                    int measuredWidth5 = this.f18308D.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f18308D.getMeasuredHeight() + paddingTop;
                    this.f18308D.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i17 = measuredWidth5 + this.f18323S;
                    paddingTop = measuredHeight5 + ((android.view.ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zQ2) {
                    int i310 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f18309E.getMeasuredWidth() + iMax;
                    this.f18309E.layout(iMax, i310, measuredWidth6, this.f18309E.getMeasuredHeight() + i310);
                    i18 = measuredWidth6 + this.f18323S;
                } else {
                    i18 = iMax;
                }
                if (z10) {
                    iMax = java.lang.Math.max(i17, i18);
                }
            }
        } else {
            if (zQ) {
                textView = this.f18308D;
            } else {
                textView = this.f18309E;
            }
            if (zQ2) {
                textView2 = this.f18309E;
            } else {
                textView2 = this.f18308D;
            }
            gVar = (androidx.appcompat.widget.Toolbar.g) textView.getLayoutParams();
            gVar2 = (androidx.appcompat.widget.Toolbar.g) textView2.getLayoutParams();
            if (zQ) {
            }
            i13 = this.f18329b0 & 112;
            i14 = paddingLeft;
            if (i13 == 48) {
                paddingTop = getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin + this.f18324T;
            } else if (i13 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((android.view.ViewGroup.MarginLayoutParams) gVar).topMargin;
                i23 = this.f18324T;
                if (iMax2 < i22 + i23) {
                    iMax2 = i22 + i23;
                } else {
                    i24 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i25 = ((android.view.ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i26 = this.f18325U;
                    if (i24 < i25 + i26) {
                        iMax2 = java.lang.Math.max(0, iMax2 - ((((android.view.ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((android.view.ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f18325U) - measuredHeight;
            }
            if (z11) {
                if (z10) {
                    i19 = this.f18322R;
                } else {
                    i19 = 0;
                }
                int i311 = i19 - iArr[1];
                iMin -= java.lang.Math.max(0, i311);
                iArr[1] = java.lang.Math.max(0, -i311);
                if (zQ) {
                    androidx.appcompat.widget.Toolbar.g gVar11 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                    int measuredWidth7 = iMin - this.f18308D.getMeasuredWidth();
                    int measuredHeight6 = this.f18308D.getMeasuredHeight() + paddingTop;
                    this.f18308D.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth7 - this.f18323S;
                    paddingTop = measuredHeight6 + ((android.view.ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zQ2) {
                    int i312 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams())).topMargin;
                    this.f18309E.layout(iMin - this.f18309E.getMeasuredWidth(), i312, iMin, this.f18309E.getMeasuredHeight() + i312);
                    i21 = iMin - this.f18323S;
                } else {
                    i21 = iMin;
                }
                if (z10) {
                    iMin = java.lang.Math.min(i20, i21);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z10) {
                    i15 = this.f18322R;
                } else {
                    i15 = 0;
                }
                i16 = 0;
                int i313 = i15 - iArr[0];
                iMax += java.lang.Math.max(0, i313);
                iArr[0] = java.lang.Math.max(0, -i313);
                if (zQ) {
                    androidx.appcompat.widget.Toolbar.g gVar12 = (androidx.appcompat.widget.Toolbar.g) this.f18308D.getLayoutParams();
                    int measuredWidth8 = this.f18308D.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f18308D.getMeasuredHeight() + paddingTop;
                    this.f18308D.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i17 = measuredWidth8 + this.f18323S;
                    paddingTop = measuredHeight7 + ((android.view.ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zQ2) {
                    int i314 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.Toolbar.g) this.f18309E.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f18309E.getMeasuredWidth() + iMax;
                    this.f18309E.layout(iMax, i314, measuredWidth9, this.f18309E.getMeasuredHeight() + i314);
                    i18 = measuredWidth9 + this.f18323S;
                } else {
                    i18 = iMax;
                }
                if (z10) {
                    iMax = java.lang.Math.max(i17, i18);
                }
            }
        }
        b(this.f18336i0, 3);
        size = this.f18336i0.size();
        iE2 = iMax;
        while (i27 < size) {
            iE2 = E((android.view.View) this.f18336i0.get(i27), iE2, iArr, iMin2);
        }
        i28 = iMin2;
        b(this.f18336i0, 5);
        size2 = this.f18336i0.size();
        while (i29 < size2) {
            iMin = F((android.view.View) this.f18336i0.get(i29), iMin, iArr, i28);
        }
        b(this.f18336i0, 1);
        int iW3 = w(this.f18336i0, iArr);
        i30 = (i14 + (((width - i14) - paddingRight) / 2)) - (iW3 / 2);
        i31 = iW3 + i30;
        if (i30 >= iE2) {
            if (i31 > iMin) {
                iE2 = i30 - (i31 - iMin);
            } else {
                iE2 = i30;
            }
        }
        size3 = this.f18336i0.size();
        while (i16 < size3) {
            iE2 = E((android.view.View) this.f18336i0.get(i16), iE2, iArr, i28);
            i16++;
        }
        this.f18336i0.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f18338k0;
        boolean zB = androidx.appcompat.widget.n0.b(this);
        int i11 = !zB ? 1 : 0;
        if (Q(this.f18310F)) {
            H(this.f18310F, i6, 0, i10, 0, this.f18321Q);
            measuredWidth = this.f18310F.getMeasuredWidth() + u(this.f18310F);
            iMax = java.lang.Math.max(0, this.f18310F.getMeasuredHeight() + v(this.f18310F));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, this.f18310F.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.f18314J)) {
            H(this.f18314J, i6, 0, i10, 0, this.f18321Q);
            measuredWidth = this.f18314J.getMeasuredWidth() + u(this.f18314J);
            iMax = java.lang.Math.max(iMax, this.f18314J.getMeasuredHeight() + v(this.f18314J));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.f18314J.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = java.lang.Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = java.lang.Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f18307C)) {
            H(this.f18307C, i6, iMax3, i10, 0, this.f18321Q);
            measuredWidth2 = this.f18307C.getMeasuredWidth() + u(this.f18307C);
            iMax = java.lang.Math.max(iMax, this.f18307C.getMeasuredHeight() + v(this.f18307C));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.f18307C.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + java.lang.Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i11] = java.lang.Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.f18315K)) {
            iMax4 += G(this.f18315K, i6, iMax4, i10, 0, iArr);
            iMax = java.lang.Math.max(iMax, this.f18315K.getMeasuredHeight() + v(this.f18315K));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.f18315K.getMeasuredState());
        }
        if (Q(this.f18311G)) {
            iMax4 += G(this.f18311G, i6, iMax4, i10, 0, iArr);
            iMax = java.lang.Math.max(iMax, this.f18311G.getMeasuredHeight() + v(this.f18311G));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.f18311G.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            android.view.View childAt = getChildAt(i12);
            if (((androidx.appcompat.widget.Toolbar.g) childAt.getLayoutParams()).f18359b == 0 && Q(childAt)) {
                iMax4 += G(childAt, i6, iMax4, i10, 0, iArr);
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight() + v(childAt));
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i13 = this.f18324T + this.f18325U;
        int i14 = this.f18322R + this.f18323S;
        if (Q(this.f18308D)) {
            G(this.f18308D, i6, iMax4 + i14, i10, i13, iArr);
            int measuredWidth3 = this.f18308D.getMeasuredWidth() + u(this.f18308D);
            measuredHeight = this.f18308D.getMeasuredHeight() + v(this.f18308D);
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.f18308D.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (Q(this.f18309E)) {
            iMax2 = java.lang.Math.max(iMax2, G(this.f18309E, i6, iMax4 + i14, i10, measuredHeight + i13, iArr));
            measuredHeight += this.f18309E.getMeasuredHeight() + v(this.f18309E);
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, this.f18309E.getMeasuredState());
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, (-16777216) & iCombineMeasuredStates2), P() ? 0 : android.view.View.resolveSizeAndState(java.lang.Math.max(java.lang.Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem menuItemFindItem;
        if (!(parcelable instanceof androidx.appcompat.widget.Toolbar.i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.Toolbar.i iVar = (androidx.appcompat.widget.Toolbar.i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        androidx.appcompat.view.menu.g gVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i6 = iVar.f18360E;
        if (i6 != 0 && this.f18344q0 != null && gVarN != null && (menuItemFindItem = gVarN.findItem(i6)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f18361F) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        i();
        this.f18326V.f(i6 == 1);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        androidx.appcompat.widget.Toolbar.i iVar2 = new androidx.appcompat.widget.Toolbar.i(super.onSaveInstanceState());
        androidx.appcompat.widget.Toolbar.f fVar = this.f18344q0;
        if (fVar != null && (iVar = fVar.f18357D) != null) {
            iVar2.f18360E = iVar.getItemId();
        }
        iVar2.f18361F = D();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f18334g0 = false;
        }
        if (!this.f18334g0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f18334g0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f18334g0 = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.Toolbar.g generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.appcompat.widget.Toolbar.g) {
            return new androidx.appcompat.widget.Toolbar.g((androidx.appcompat.widget.Toolbar.g) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.AbstractC1890a.C0338a) {
            return new androidx.appcompat.widget.Toolbar.g((androidx.appcompat.app.AbstractC1890a.C0338a) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.appcompat.widget.Toolbar.g((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.appcompat.widget.Toolbar.g(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC2033w
    public void s(androidx.core.view.InterfaceC2039z interfaceC2039z) {
        this.f18339l0.a(interfaceC2039z);
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f18350w0 != z6) {
            this.f18350w0 = z6;
            S();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            h();
        }
        android.widget.ImageButton imageButton = this.f18314J;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(p100k.a.b(getContext(), i6));
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            h();
            this.f18314J.setImageDrawable(drawable);
        } else {
            android.widget.ImageButton imageButton = this.f18314J;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f18312H);
            }
        }
    }

    public void setCollapsible(boolean z6) {
        this.f18347t0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f18328a0) {
            this.f18328a0 = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f18327W) {
            this.f18327W = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(p100k.a.b(getContext(), i6));
    }

    public void setLogo(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            j();
            if (!B(this.f18311G)) {
                c(this.f18311G, true);
            }
        } else {
            android.widget.ImageView imageView = this.f18311G;
            if (imageView != null && B(imageView)) {
                removeView(this.f18311G);
                this.f18337j0.remove(this.f18311G);
            }
        }
        android.widget.ImageView imageView2 = this.f18311G;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setLogoDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            j();
        }
        android.widget.ImageView imageView = this.f18311G;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            m();
        }
        android.widget.ImageButton imageButton = this.f18310F;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            androidx.appcompat.widget.h0.a(this.f18310F, charSequence);
        }
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(p100k.a.b(getContext(), i6));
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            m();
            if (!B(this.f18310F)) {
                c(this.f18310F, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.f18310F;
            if (imageButton != null && B(imageButton)) {
                removeView(this.f18310F);
                this.f18337j0.remove(this.f18310F);
            }
        }
        android.widget.ImageButton imageButton2 = this.f18310F;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        m();
        this.f18310F.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.h hVar) {
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        k();
        this.f18307C.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.f18317M != i6) {
            this.f18317M = i6;
            if (i6 == 0) {
                this.f18316L = getContext();
            } else {
                this.f18316L = new android.view.ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            android.widget.TextView textView = this.f18309E;
            if (textView != null && B(textView)) {
                removeView(this.f18309E);
                this.f18337j0.remove(this.f18309E);
            }
        } else {
            if (this.f18309E == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(context);
                this.f18309E = d6;
                d6.setSingleLine();
                this.f18309E.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i6 = this.f18319O;
                if (i6 != 0) {
                    this.f18309E.setTextAppearance(context, i6);
                }
                android.content.res.ColorStateList colorStateList = this.f18333f0;
                if (colorStateList != null) {
                    this.f18309E.setTextColor(colorStateList);
                }
            }
            if (!B(this.f18309E)) {
                c(this.f18309E, true);
            }
        }
        android.widget.TextView textView2 = this.f18309E;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f18331d0 = charSequence;
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(android.content.res.ColorStateList.valueOf(i6));
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f18333f0 = colorStateList;
        android.widget.TextView textView = this.f18309E;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            android.widget.TextView textView = this.f18308D;
            if (textView != null && B(textView)) {
                removeView(this.f18308D);
                this.f18337j0.remove(this.f18308D);
            }
        } else {
            if (this.f18308D == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(context);
                this.f18308D = d6;
                d6.setSingleLine();
                this.f18308D.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i6 = this.f18318N;
                if (i6 != 0) {
                    this.f18308D.setTextAppearance(context, i6);
                }
                android.content.res.ColorStateList colorStateList = this.f18332e0;
                if (colorStateList != null) {
                    this.f18308D.setTextColor(colorStateList);
                }
            }
            if (!B(this.f18308D)) {
                c(this.f18308D, true);
            }
        }
        android.widget.TextView textView2 = this.f18308D;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f18330c0 = charSequence;
    }

    public void setTitleMarginBottom(int i6) {
        this.f18325U = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.f18323S = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.f18322R = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.f18324T = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(android.content.res.ColorStateList.valueOf(i6));
    }

    public void setTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f18332e0 = colorStateList;
        android.widget.TextView textView = this.f18308D;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean x() {
        androidx.appcompat.widget.Toolbar.f fVar = this.f18344q0;
        return (fVar == null || fVar.f18357D == null) ? false : true;
    }

    public boolean y() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18307C;
        return actionMenuView != null && actionMenuView.H();
    }

    public void z(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }
}
