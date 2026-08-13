package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f43557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E4.g f43559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.content.res.ColorStateList f43560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private E4.k f43561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.sidesheet.SideSheetBehavior.c f43562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f43564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private J1.c f43567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f43568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f43571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f43572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f43573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private java.lang.ref.WeakReference f43574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private java.lang.ref.WeakReference f43575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private android.view.VelocityTracker f43577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p245y4.c f43578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f43579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final java.util.Set f43580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final J1.c.AbstractC0133c f43581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f43556z = p125m4.h.f50693w;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f43555A = p125m4.i.f50701h;

    class a extends J1.c.AbstractC0133c {
        a() {
        }

        @Override // J1.c.AbstractC0133c
        public int a(android.view.View view, int i6, int i10) {
            return p222w1.a.b(i6, com.google.android.material.sidesheet.SideSheetBehavior.this.f43557a.f(), com.google.android.material.sidesheet.SideSheetBehavior.this.f43557a.e());
        }

        @Override // J1.c.AbstractC0133c
        public int b(android.view.View view, int i6, int i10) {
            return view.getTop();
        }

        @Override // J1.c.AbstractC0133c
        public int d(android.view.View view) {
            return com.google.android.material.sidesheet.SideSheetBehavior.this.f43570n + com.google.android.material.sidesheet.SideSheetBehavior.this.d0();
        }

        @Override // J1.c.AbstractC0133c
        public void j(int i6) {
            if (i6 == 1 && com.google.android.material.sidesheet.SideSheetBehavior.this.f43564h) {
                com.google.android.material.sidesheet.SideSheetBehavior.this.B0(1);
            }
        }

        @Override // J1.c.AbstractC0133c
        public void k(android.view.View view, int i6, int i10, int i11, int i12) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
            android.view.View viewZ = com.google.android.material.sidesheet.SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                com.google.android.material.sidesheet.SideSheetBehavior.this.f43557a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            com.google.android.material.sidesheet.SideSheetBehavior.this.V(view, i6);
        }

        @Override // J1.c.AbstractC0133c
        public void l(android.view.View view, float f6, float f10) {
            int iR = com.google.android.material.sidesheet.SideSheetBehavior.this.R(view, f6, f10);
            com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = com.google.android.material.sidesheet.SideSheetBehavior.this;
            sideSheetBehavior.G0(view, iR, sideSheetBehavior.F0());
        }

        @Override // J1.c.AbstractC0133c
        public boolean m(android.view.View view, int i6) {
            return (com.google.android.material.sidesheet.SideSheetBehavior.this.f43565i == 1 || com.google.android.material.sidesheet.SideSheetBehavior.this.f43574r == null || com.google.android.material.sidesheet.SideSheetBehavior.this.f43574r.get() != view) ? false : true;
        }
    }

    protected static class b extends I1.a {
        public static final android.os.Parcelable.Creator<com.google.android.material.sidesheet.SideSheetBehavior.b> CREATOR = new com.google.android.material.sidesheet.SideSheetBehavior.b.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final int f43583E;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.sidesheet.SideSheetBehavior.b createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.sidesheet.SideSheetBehavior.b(parcel, (java.lang.ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.sidesheet.SideSheetBehavior.b createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.sidesheet.SideSheetBehavior.b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.sidesheet.SideSheetBehavior.b[] newArray(int i6) {
                return new com.google.android.material.sidesheet.SideSheetBehavior.b[i6];
            }
        }

        public b(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f43583E = parcel.readInt();
        }

        public b(android.os.Parcelable parcelable, com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f43583E = sideSheetBehavior.f43565i;
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f43583E);
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f43584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.Runnable f43586c = new java.lang.Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f43590C.c();
            }
        };

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f43585b = false;
            if (com.google.android.material.sidesheet.SideSheetBehavior.this.f43567k != null && com.google.android.material.sidesheet.SideSheetBehavior.this.f43567k.k(true)) {
                b(this.f43584a);
            } else if (com.google.android.material.sidesheet.SideSheetBehavior.this.f43565i == 2) {
                com.google.android.material.sidesheet.SideSheetBehavior.this.B0(this.f43584a);
            }
        }

        void b(int i6) {
            if (com.google.android.material.sidesheet.SideSheetBehavior.this.f43574r == null || com.google.android.material.sidesheet.SideSheetBehavior.this.f43574r.get() == null) {
                return;
            }
            this.f43584a = i6;
            if (this.f43585b) {
                return;
            }
            androidx.core.view.X.f0((android.view.View) com.google.android.material.sidesheet.SideSheetBehavior.this.f43574r.get(), this.f43586c);
            this.f43585b = true;
        }
    }

    public SideSheetBehavior() {
        this.f43562f = new com.google.android.material.sidesheet.SideSheetBehavior.c();
        this.f43564h = true;
        this.f43565i = 5;
        this.f43566j = 5;
        this.f43569m = 0.1f;
        this.f43576t = -1;
        this.f43580x = new java.util.LinkedHashSet();
        this.f43581y = new com.google.android.material.sidesheet.SideSheetBehavior.a();
    }

    public SideSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43562f = new com.google.android.material.sidesheet.SideSheetBehavior.c();
        this.f43564h = true;
        this.f43565i = 5;
        this.f43566j = 5;
        this.f43569m = 0.1f;
        this.f43576t = -1;
        this.f43580x = new java.util.LinkedHashSet();
        this.f43581y = new com.google.android.material.sidesheet.SideSheetBehavior.a();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50901X4);
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f50917Z4)) {
            this.f43560d = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50917Z4);
        }
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f50941c5)) {
            this.f43561e = E4.k.e(context, attributeSet, 0, f43555A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f50933b5)) {
            w0(typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50933b5, -1));
        }
        U(context);
        this.f43563g = typedArrayObtainStyledAttributes.getDimension(p125m4.j.f50909Y4, -1.0f);
        x0(typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50925a5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f43558b = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private boolean C0() {
        return this.f43567k != null && (this.f43564h || this.f43565i == 1);
    }

    private boolean E0(android.view.View view) {
        return (view.isShown() || androidx.core.view.X.o(view) != null) && this.f43564h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(android.view.View view, int i6, boolean z6) {
        if (!p0(view, i6, z6)) {
            B0(i6);
        } else {
            B0(2);
            this.f43562f.b(i6);
        }
    }

    private void H0() {
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.f43574r;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        androidx.core.view.X.h0(view, 262144);
        androidx.core.view.X.h0(view, 1048576);
        if (this.f43565i != 5) {
            t0(view, C1.B.a.f1259y, 5);
        }
        if (this.f43565i != 3) {
            t0(view, C1.B.a.f1257w, 3);
        }
    }

    private void I0(E4.k kVar) {
        E4.g gVar = this.f43559c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void J0(android.view.View view) {
        int i6 = this.f43565i == 5 ? 4 : 0;
        if (view.getVisibility() != i6) {
            view.setVisibility(i6);
        }
    }

    private int P(int i6, android.view.View view) {
        int i10 = this.f43565i;
        if (i10 == 1 || i10 == 2) {
            return i6 - this.f43557a.g(view);
        }
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 5) {
            return this.f43557a.d();
        }
        throw new java.lang.IllegalStateException("Unexpected value: " + this.f43565i);
    }

    private float Q(float f6, float f10) {
        return java.lang.Math.abs(f6 - f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(android.view.View view, float f6, float f10) {
        if (n0(f6)) {
            return 3;
        }
        if (D0(view, f6)) {
            if (!this.f43557a.l(f6, f10) && !this.f43557a.k(view)) {
                return 3;
            }
        } else if (f6 == 0.0f || !com.google.android.material.sidesheet.d.a(f6, f10)) {
            int left = view.getLeft();
            if (java.lang.Math.abs(left - a0()) < java.lang.Math.abs(left - this.f43557a.d())) {
                return 3;
            }
        }
        return 5;
    }

    private void S() {
        java.lang.ref.WeakReference weakReference = this.f43575s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f43575s = null;
    }

    private C1.G T(final int i6) {
        return new C1.G() { // from class: F4.a
            @Override // C1.G
            public final boolean a(android.view.View view, C1.G.a aVar) {
                return this.f2746a.q0(i6, view, aVar);
            }
        };
    }

    private void U(android.content.Context context) {
        if (this.f43561e == null) {
            return;
        }
        E4.g gVar = new E4.g(this.f43561e);
        this.f43559c = gVar;
        gVar.K(context);
        android.content.res.ColorStateList colorStateList = this.f43560d;
        if (colorStateList != null) {
            this.f43559c.V(colorStateList);
            return;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f43559c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(android.view.View view, int i6) {
        if (this.f43580x.isEmpty()) {
            return;
        }
        this.f43557a.b(i6);
        java.util.Iterator it = this.f43580x.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
    }

    private void W(android.view.View view) {
        if (androidx.core.view.X.o(view) == null) {
            androidx.core.view.X.q0(view, view.getResources().getString(f43556z));
        }
    }

    private int X(int i6, int i10, int i11, int i12) {
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i6, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = java.lang.Math.min(size, i11);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    private androidx.coordinatorlayout.widget.CoordinatorLayout.f j0() {
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.f43574r;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null || !(view.getLayoutParams() instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f)) {
            return null;
        }
        return (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((android.view.ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((android.view.ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(android.view.MotionEvent motionEvent) {
        return C0() && Q((float) this.f43579w, motionEvent.getX()) > ((float) this.f43567k.u());
    }

    private boolean n0(float f6) {
        return this.f43557a.j(f6);
    }

    private boolean o0(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.X.Q(view);
    }

    private boolean p0(android.view.View view, int i6, boolean z6) {
        int iE0 = e0(i6);
        J1.c cVarI0 = i0();
        return cVarI0 != null && (!z6 ? !cVarI0.H(view, iE0, view.getTop()) : !cVarI0.F(iE0, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean q0(int i6, android.view.View view, C1.G.a aVar) {
        A0(i6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(int i6) {
        android.view.View view = (android.view.View) this.f43574r.get();
        if (view != null) {
            G0(view, i6, false);
        }
    }

    private void s0(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        int i6;
        android.view.View viewFindViewById;
        if (this.f43575s != null || (i6 = this.f43576t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i6)) == null) {
            return;
        }
        this.f43575s = new java.lang.ref.WeakReference(viewFindViewById);
    }

    private void t0(android.view.View view, C1.B.a aVar, int i6) {
        androidx.core.view.X.j0(view, aVar, null, T(i6));
    }

    private void u0() {
        android.view.VelocityTracker velocityTracker = this.f43577u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f43577u = null;
        }
    }

    private void v0(android.view.View view, java.lang.Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void y0(int i6) {
        com.google.android.material.sidesheet.c cVar = this.f43557a;
        if (cVar == null || cVar.i() != i6) {
            if (i6 == 0) {
                this.f43557a = new com.google.android.material.sidesheet.b(this);
                if (this.f43561e == null || l0()) {
                    return;
                }
                E4.k.b bVarV = this.f43561e.v();
                bVarV.E(0.0f).w(0.0f);
                I0(bVarV.m());
                return;
            }
            if (i6 == 1) {
                this.f43557a = new com.google.android.material.sidesheet.a(this);
                if (this.f43561e == null || k0()) {
                    return;
                }
                E4.k.b bVarV2 = this.f43561e.v();
                bVarV2.A(0.0f).s(0.0f);
                I0(bVarV2.m());
                return;
            }
            throw new java.lang.IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
        }
    }

    private void z0(android.view.View view, int i6) {
        y0(androidx.core.view.AbstractC2025s.b(((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).f21342c, i6) == 3 ? 1 : 0);
    }

    public void A0(final int i6) {
        if (i6 == 1 || i6 == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("STATE_");
            sb.append(i6 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.ref.WeakReference weakReference = this.f43574r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i6);
        } else {
            v0((android.view.View) this.f43574r.get(), new java.lang.Runnable() { // from class: F4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2748C.r0(i6);
                }
            });
        }
    }

    void B0(int i6) {
        android.view.View view;
        if (this.f43565i == i6) {
            return;
        }
        this.f43565i = i6;
        if (i6 == 3 || i6 == 5) {
            this.f43566j = i6;
        }
        java.lang.ref.WeakReference weakReference = this.f43574r;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        J0(view);
        java.util.Iterator it = this.f43580x.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
        H0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f43565i == 1 && actionMasked == 0) {
            return true;
        }
        if (C0()) {
            this.f43567k.z(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f43577u == null) {
            this.f43577u = android.view.VelocityTracker.obtain();
        }
        this.f43577u.addMovement(motionEvent);
        if (C0() && actionMasked == 2 && !this.f43568l && m0(motionEvent)) {
            this.f43567k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f43568l;
    }

    boolean D0(android.view.View view, float f6) {
        return this.f43557a.m(view, f6);
    }

    public boolean F0() {
        return true;
    }

    int Y() {
        return this.f43570n;
    }

    public android.view.View Z() {
        java.lang.ref.WeakReference weakReference = this.f43575s;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f43557a.c();
    }

    public float b0() {
        return this.f43569m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f43573q;
    }

    int e0(int i6) {
        if (i6 == 3) {
            return a0();
        }
        if (i6 == 5) {
            return this.f43557a.d();
        }
        throw new java.lang.IllegalArgumentException("Invalid state to get outer edge offset: " + i6);
    }

    int f0() {
        return this.f43572p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f43574r = null;
        this.f43567k = null;
        this.f43578v = null;
    }

    int g0() {
        return this.f43571o;
    }

    int h0() {
        return 500;
    }

    J1.c i0() {
        return this.f43567k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f43574r = null;
        this.f43567k = null;
        this.f43578v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        J1.c cVar;
        if (!E0(view)) {
            this.f43568l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f43577u == null) {
            this.f43577u = android.view.VelocityTracker.obtain();
        }
        this.f43577u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f43579w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f43568l) {
            this.f43568l = false;
            return false;
        }
        return (this.f43568l || (cVar = this.f43567k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        if (androidx.core.view.X.w(coordinatorLayout) && !androidx.core.view.X.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f43574r == null) {
            this.f43574r = new java.lang.ref.WeakReference(view);
            this.f43578v = new p245y4.c(view);
            E4.g gVar = this.f43559c;
            if (gVar != null) {
                androidx.core.view.X.r0(view, gVar);
                E4.g gVar2 = this.f43559c;
                float fU = this.f43563g;
                if (fU == -1.0f) {
                    fU = androidx.core.view.X.u(view);
                }
                gVar2.U(fU);
            } else {
                android.content.res.ColorStateList colorStateList = this.f43560d;
                if (colorStateList != null) {
                    androidx.core.view.X.s0(view, colorStateList);
                }
            }
            J0(view);
            H0();
            if (androidx.core.view.X.x(view) == 0) {
                androidx.core.view.X.w0(view, 1);
            }
            W(view);
        }
        z0(view, i6);
        if (this.f43567k == null) {
            this.f43567k = J1.c.m(coordinatorLayout, this.f43581y);
        }
        int iG = this.f43557a.g(view);
        coordinatorLayout.I(view, i6);
        this.f43571o = coordinatorLayout.getWidth();
        this.f43572p = this.f43557a.h(coordinatorLayout);
        this.f43570n = view.getWidth();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f43573q = marginLayoutParams != null ? this.f43557a.a(marginLayoutParams) : 0;
        androidx.core.view.X.X(view, P(iG, view));
        s0(coordinatorLayout);
        java.util.Iterator it = this.f43580x.iterator();
        while (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11, int i12) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i6, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, -1, marginLayoutParams.width), X(i11, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, -1, marginLayoutParams.height));
        return true;
    }

    public void w0(int i6) {
        this.f43576t = i6;
        S();
        java.lang.ref.WeakReference weakReference = this.f43574r;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            if (i6 == -1 || !androidx.core.view.X.R(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        com.google.android.material.sidesheet.SideSheetBehavior.b bVar = (com.google.android.material.sidesheet.SideSheetBehavior.b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i6 = bVar.f43583E;
        if (i6 == 1 || i6 == 2) {
            i6 = 5;
        }
        this.f43565i = i6;
        this.f43566j = i6;
    }

    public void x0(boolean z6) {
        this.f43564h = z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public android.os.Parcelable y(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return new com.google.android.material.sidesheet.SideSheetBehavior.b(super.y(coordinatorLayout, view), this);
    }
}
