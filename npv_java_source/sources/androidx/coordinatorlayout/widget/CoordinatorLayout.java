package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements androidx.core.view.D, androidx.core.view.E {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final java.lang.String f21313W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final java.lang.Class[] f21314a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final java.lang.ThreadLocal f21315b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final java.util.Comparator f21316c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final B1.f f21317d0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f21318C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b f21319D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.List f21320E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.List f21321F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.graphics.Paint f21322G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int[] f21323H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int[] f21324I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f21325J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f21326K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int[] f21327L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private android.view.View f21328M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.view.View f21329N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private androidx.coordinatorlayout.widget.CoordinatorLayout.g f21330O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f21331P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private androidx.core.view.C2038y0 f21332Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f21333R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private android.graphics.drawable.Drawable f21334S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    android.view.ViewGroup.OnHierarchyChangeListener f21335T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private androidx.core.view.G f21336U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final androidx.core.view.F f21337V;

    class a implements androidx.core.view.G {
        a() {
        }

        @Override // androidx.core.view.G
        public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
            return androidx.coordinatorlayout.widget.CoordinatorLayout.this.W(c2038y0);
        }
    }

    public interface b {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public c(android.content.Context context, android.util.AttributeSet attributeSet) {
        }

        public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6, int i10) {
            if (i10 == 0) {
                return z(coordinatorLayout, view, view2, view3, i6);
            }
            return false;
        }

        public void B(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        }

        public void C(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6) {
            if (i6 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            return false;
        }

        public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect) {
            return false;
        }

        public int c(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            return -16777216;
        }

        public float d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            return 0.0f;
        }

        public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            return false;
        }

        public androidx.core.view.C2038y0 f(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, androidx.core.view.C2038y0 c2038y0) {
            return c2038y0;
        }

        public void g(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
        }

        public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            return false;
        }

        public void i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        }

        public void j() {
        }

        public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            return false;
        }

        public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
            return false;
        }

        public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11, int i12) {
            return false;
        }

        public boolean n(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f6, float f10, boolean z6) {
            return false;
        }

        public boolean o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f6, float f10) {
            return false;
        }

        public void p(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int[] iArr) {
        }

        public void q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int[] iArr, int i11) {
            if (i11 == 0) {
                p(coordinatorLayout, view, view2, i6, i10, iArr);
            }
        }

        public void r(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int i11, int i12) {
        }

        public void s(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int i11, int i12, int i13) {
            if (i13 == 0) {
                r(coordinatorLayout, view, view2, i6, i10, i11, i12);
            }
        }

        public void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
            s(coordinatorLayout, view, view2, i6, i10, i11, i12, i13);
        }

        public void u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6) {
        }

        public void v(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6, int i10) {
            if (i10 == 0) {
                u(coordinatorLayout, view, view2, view3, i6);
            }
        }

        public boolean w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z6) {
            return false;
        }

        public void x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        }

        public android.os.Parcelable y(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6) {
            return false;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.napsternetlabs.napsternetv.ProtectedMyApplication$VpnPermissionActivity$a
    public @interface d {
        java.lang.Class value();
    }

    private class e implements android.view.ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View view, android.view.View view2) {
            android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = androidx.coordinatorlayout.widget.CoordinatorLayout.this.f21335T;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.this.H(2);
            android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = androidx.coordinatorlayout.widget.CoordinatorLayout.this.f21335T;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.coordinatorlayout.widget.CoordinatorLayout.c f21340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f21341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f21345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21347h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f21348i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f21349j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        android.view.View f21350k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        android.view.View f21351l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f21352m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f21353n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f21354o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f21355p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final android.graphics.Rect f21356q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        java.lang.Object f21357r;

        public f(int i6, int i10) {
            super(i6, i10);
            this.f21341b = false;
            this.f21342c = 0;
            this.f21343d = 0;
            this.f21344e = -1;
            this.f21345f = -1;
            this.f21346g = 0;
            this.f21347h = 0;
            this.f21356q = new android.graphics.Rect();
        }

        f(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21341b = false;
            this.f21342c = 0;
            this.f21343d = 0;
            this.f21344e = -1;
            this.f21345f = -1;
            this.f21346g = 0;
            this.f21347h = 0;
            this.f21356q = new android.graphics.Rect();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p192t1.c.f54571e);
            this.f21342c = typedArrayObtainStyledAttributes.getInteger(p192t1.c.f54572f, 0);
            this.f21345f = typedArrayObtainStyledAttributes.getResourceId(p192t1.c.f54573g, -1);
            this.f21343d = typedArrayObtainStyledAttributes.getInteger(p192t1.c.f54574h, 0);
            this.f21344e = typedArrayObtainStyledAttributes.getInteger(p192t1.c.f54578l, -1);
            this.f21346g = typedArrayObtainStyledAttributes.getInt(p192t1.c.f54577k, 0);
            this.f21347h = typedArrayObtainStyledAttributes.getInt(p192t1.c.f54576j, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(p192t1.c.f54575i);
            this.f21341b = zHasValue;
            if (zHasValue) {
                this.f21340a = androidx.coordinatorlayout.widget.CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(p192t1.c.f54575i));
            }
            typedArrayObtainStyledAttributes.recycle();
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVar = this.f21340a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21341b = false;
            this.f21342c = 0;
            this.f21343d = 0;
            this.f21344e = -1;
            this.f21345f = -1;
            this.f21346g = 0;
            this.f21347h = 0;
            this.f21356q = new android.graphics.Rect();
        }

        public f(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21341b = false;
            this.f21342c = 0;
            this.f21343d = 0;
            this.f21344e = -1;
            this.f21345f = -1;
            this.f21346g = 0;
            this.f21347h = 0;
            this.f21356q = new android.graphics.Rect();
        }

        public f(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
            super((android.view.ViewGroup.MarginLayoutParams) fVar);
            this.f21341b = false;
            this.f21342c = 0;
            this.f21343d = 0;
            this.f21344e = -1;
            this.f21345f = -1;
            this.f21346g = 0;
            this.f21347h = 0;
            this.f21356q = new android.graphics.Rect();
        }

        private void m(android.view.View view, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            android.view.View viewFindViewById = coordinatorLayout.findViewById(this.f21345f);
            this.f21350k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (android.view.ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof android.view.View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new java.lang.IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f21351l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new java.lang.IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new java.lang.IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f21345f) + " to anchor view " + view);
            }
            this.f21351l = null;
            this.f21350k = null;
        }

        private boolean r(android.view.View view, int i6) {
            int iB = androidx.core.view.AbstractC2025s.b(((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).f21346g, i6);
            return iB != 0 && (androidx.core.view.AbstractC2025s.b(this.f21347h, i6) & iB) == iB;
        }

        private boolean s(android.view.View view, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            if (this.f21350k.getId() != this.f21345f) {
                return false;
            }
            android.view.View view2 = this.f21350k;
            for (android.view.ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f21351l = null;
                    this.f21350k = null;
                    return false;
                }
                if (parent instanceof android.view.View) {
                    view2 = parent;
                }
            }
            this.f21351l = view2;
            return true;
        }

        boolean a() {
            return this.f21350k == null && this.f21345f != -1;
        }

        boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVar;
            return view2 == this.f21351l || r(view2, androidx.core.view.X.z(coordinatorLayout)) || ((cVar = this.f21340a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f21340a == null) {
                this.f21352m = false;
            }
            return this.f21352m;
        }

        android.view.View d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            if (this.f21345f == -1) {
                this.f21351l = null;
                this.f21350k = null;
                return null;
            }
            if (this.f21350k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f21350k;
        }

        public androidx.coordinatorlayout.widget.CoordinatorLayout.c e() {
            return this.f21340a;
        }

        boolean f() {
            return this.f21355p;
        }

        android.graphics.Rect g() {
            return this.f21356q;
        }

        boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            boolean z6 = this.f21352m;
            if (z6) {
                return true;
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVar = this.f21340a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z6;
            this.f21352m = zA;
            return zA;
        }

        boolean i(int i6) {
            if (i6 == 0) {
                return this.f21353n;
            }
            if (i6 != 1) {
                return false;
            }
            return this.f21354o;
        }

        void j() {
            this.f21355p = false;
        }

        void k(int i6) {
            q(i6, false);
        }

        void l() {
            this.f21352m = false;
        }

        public void n(androidx.coordinatorlayout.widget.CoordinatorLayout.c cVar) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVar2 = this.f21340a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f21340a = cVar;
                this.f21357r = null;
                this.f21341b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z6) {
            this.f21355p = z6;
        }

        void p(android.graphics.Rect rect) {
            this.f21356q.set(rect);
        }

        void q(int i6, boolean z6) {
            if (i6 == 0) {
                this.f21353n = z6;
            } else {
                if (i6 != 1) {
                    return;
                }
                this.f21354o = z6;
            }
        }
    }

    class g implements android.view.ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            androidx.coordinatorlayout.widget.CoordinatorLayout.this.H(0);
            return true;
        }
    }

    protected static class h extends I1.a {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.h> CREATOR = new androidx.coordinatorlayout.widget.CoordinatorLayout.h.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        android.util.SparseArray f21359E;

        static class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.coordinatorlayout.widget.CoordinatorLayout.h createFromParcel(android.os.Parcel parcel) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.coordinatorlayout.widget.CoordinatorLayout.h createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public androidx.coordinatorlayout.widget.CoordinatorLayout.h[] newArray(int i6) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.h[i6];
            }
        }

        public h(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            int i6 = parcel.readInt();
            int[] iArr = new int[i6];
            parcel.readIntArray(iArr);
            android.os.Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f21359E = new android.util.SparseArray(i6);
            for (int i10 = 0; i10 < i6; i10++) {
                this.f21359E.append(iArr[i10], parcelableArray[i10]);
            }
        }

        public h(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            android.util.SparseArray sparseArray = this.f21359E;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f21359E.keyAt(i10);
                parcelableArr[i10] = (android.os.Parcelable) this.f21359E.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i6);
        }
    }

    static class i implements java.util.Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(android.view.View view, android.view.View view2) {
            float fL = androidx.core.view.X.L(view);
            float fL2 = androidx.core.view.X.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        java.lang.Package r6 = androidx.coordinatorlayout.widget.CoordinatorLayout.class.getPackage();
        f21313W = r6 != null ? r6.getName() : null;
        f21316c0 = new androidx.coordinatorlayout.widget.CoordinatorLayout.i();
        f21314a0 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class};
        f21315b0 = new java.lang.ThreadLocal();
        f21317d0 = new B1.h(12);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p192t1.a.f54565a);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f21318C = new java.util.ArrayList();
        this.f21319D = new androidx.coordinatorlayout.widget.b();
        this.f21320E = new java.util.ArrayList();
        this.f21321F = new java.util.ArrayList();
        this.f21323H = new int[2];
        this.f21324I = new int[2];
        this.f21337V = new androidx.core.view.F(this);
        int[] iArr = p192t1.c.f54568b;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = i6 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, p192t1.b.f54566a) : context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = p192t1.c.f54568b;
            if (i6 == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, p192t1.b.f54566a);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i6, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p192t1.c.f54569c, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context.getResources();
            this.f21327L = resources.getIntArray(resourceId);
            float f6 = resources.getDisplayMetrics().density;
            int length = this.f21327L.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr3 = this.f21327L;
                iArr3[i10] = (int) (iArr3[i10] * f6);
            }
        }
        this.f21334S = typedArrayObtainStyledAttributes.getDrawable(p192t1.c.f54570d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new androidx.coordinatorlayout.widget.CoordinatorLayout.e());
        if (androidx.core.view.X.x(this) == 0) {
            androidx.core.view.X.w0(this, 1);
        }
    }

    private boolean A(android.view.View view) {
        return this.f21319D.j(view);
    }

    private void C(android.view.View view, int i6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        android.graphics.Rect rectA = a();
        rectA.set(getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((android.view.ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f21332Q != null && androidx.core.view.X.w(this) && !androidx.core.view.X.w(view)) {
            rectA.left += this.f21332Q.j();
            rectA.top += this.f21332Q.l();
            rectA.right -= this.f21332Q.k();
            rectA.bottom -= this.f21332Q.i();
        }
        android.graphics.Rect rectA2 = a();
        androidx.core.view.AbstractC2025s.a(S(fVar.f21342c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i6);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    private void D(android.view.View view, android.view.View view2, int i6) {
        android.graphics.Rect rectA = a();
        android.graphics.Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i6, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    private void E(android.view.View view, int i6, int i10) {
        int i11;
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        int iB = androidx.core.view.AbstractC2025s.b(T(fVar.f21342c), i10);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 == 1) {
            i6 = width - i6;
        }
        int iW = w(i6) - measuredWidth;
        if (i12 == 1) {
            iW += measuredWidth / 2;
        } else if (i12 == 5) {
            iW += measuredWidth;
        }
        if (i13 != 16) {
            i11 = i13 != 80 ? 0 : measuredHeight;
        } else {
            i11 = measuredHeight / 2;
        }
        int iMax = java.lang.Math.max(getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) fVar).leftMargin, java.lang.Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((android.view.ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) fVar).topMargin, java.lang.Math.min(i11, ((height - getPaddingBottom()) - measuredHeight) - ((android.view.ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void F(android.view.View view, android.graphics.Rect rect, int i6) {
        boolean z6;
        boolean z10;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        if (androidx.core.view.X.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = fVar.e();
            android.graphics.Rect rectA = a();
            android.graphics.Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new java.lang.IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = androidx.core.view.AbstractC2025s.b(fVar.f21347h, i6);
            boolean z11 = true;
            if ((iB & 48) != 48 || (i14 = (rectA.top - ((android.view.ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f21349j) >= (i15 = rect.top)) {
                z6 = false;
            } else {
                V(view, i15 - i14);
                z6 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((android.view.ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f21349j) < (i13 = rect.bottom)) {
                V(view, height - i13);
                z6 = true;
            }
            if (!z6) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i11 = (rectA.left - ((android.view.ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f21348i) >= (i12 = rect.left)) {
                z10 = false;
            } else {
                U(view, i12 - i11);
                z10 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((android.view.ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f21348i) >= (i10 = rect.right)) {
                z11 = z10;
            } else {
                U(view, width - i10);
            }
            if (!z11) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    static androidx.coordinatorlayout.widget.CoordinatorLayout.c K(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            java.lang.String str2 = f21313W;
            if (!android.text.TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            java.lang.ThreadLocal threadLocal = f21315b0;
            java.util.Map map = (java.util.Map) threadLocal.get();
            if (map == null) {
                map = new java.util.HashMap();
                threadLocal.set(map);
            }
            java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) map.get(str);
            if (constructor == null) {
                constructor = java.lang.Class.forName(str, false, context.getClassLoader()).getConstructor(f21314a0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (androidx.coordinatorlayout.widget.CoordinatorLayout.c) constructor.newInstance(context, attributeSet);
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException("Could not inflate Behavior subclass " + str, e6);
        }
    }

    private boolean L(android.view.MotionEvent motionEvent, int i6) {
        int actionMasked = motionEvent.getActionMasked();
        java.util.List list = this.f21320E;
        z(list);
        int size = list.size();
        android.view.MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            android.view.View view = (android.view.View) list.get(i10);
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = fVar.e();
            if (!(zK || z6) || actionMasked == 0) {
                if (!zK && cVarE != null) {
                    if (i6 == 0) {
                        zK = cVarE.k(this, view, motionEvent);
                    } else if (i6 == 1) {
                        zK = cVarE.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f21328M = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z6 = zH && !zC;
                if (zH && !z6) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i6 == 0) {
                    cVarE.k(this, view, motionEventObtain);
                } else if (i6 == 1) {
                    cVarE.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    private void M() {
        this.f21318C.clear();
        this.f21319D.c();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.f21319D.b(childAt);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (i10 != i6) {
                    android.view.View childAt2 = getChildAt(i10);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.f21319D.d(childAt2)) {
                            this.f21319D.b(childAt2);
                        }
                        this.f21319D.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f21318C.addAll(this.f21319D.i());
        java.util.Collections.reverse(this.f21318C);
    }

    private static void O(android.graphics.Rect rect) {
        rect.setEmpty();
        f21317d0.a(rect);
    }

    private void Q(boolean z6) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    cVarE.k(this, childAt, motionEventObtain);
                } else {
                    cVarE.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) getChildAt(i10).getLayoutParams()).l();
        }
        this.f21328M = null;
        this.f21325J = false;
    }

    private static int R(int i6) {
        if (i6 == 0) {
            return 17;
        }
        return i6;
    }

    private static int S(int i6) {
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        return (i6 & 112) == 0 ? i6 | 48 : i6;
    }

    private static int T(int i6) {
        if (i6 == 0) {
            return 8388661;
        }
        return i6;
    }

    private void U(android.view.View view, int i6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        int i10 = fVar.f21348i;
        if (i10 != i6) {
            androidx.core.view.X.X(view, i6 - i10);
            fVar.f21348i = i6;
        }
    }

    private void V(android.view.View view, int i6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        int i10 = fVar.f21349j;
        if (i10 != i6) {
            androidx.core.view.X.Y(view, i6 - i10);
            fVar.f21349j = i6;
        }
    }

    private void X() {
        if (!androidx.core.view.X.w(this)) {
            androidx.core.view.X.A0(this, null);
            return;
        }
        if (this.f21336U == null) {
            this.f21336U = new androidx.coordinatorlayout.widget.CoordinatorLayout.a();
        }
        androidx.core.view.X.A0(this, this.f21336U);
        setSystemUiVisibility(1280);
    }

    private static android.graphics.Rect a() {
        android.graphics.Rect rect = (android.graphics.Rect) f21317d0.b();
        return rect == null ? new android.graphics.Rect() : rect;
    }

    private static int c(int i6, int i10, int i11) {
        if (i6 < i10) {
            return i10;
        }
        return i6 > i11 ? i11 : i6;
    }

    private void d(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar, android.graphics.Rect rect, int i6, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = java.lang.Math.max(getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) fVar).leftMargin, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((android.view.ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) fVar).topMargin, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((android.view.ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i6 + iMax, i10 + iMax2);
    }

    private androidx.core.view.C2038y0 e(androidx.core.view.C2038y0 c2038y0) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        if (c2038y0.o()) {
            return c2038y0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (androidx.core.view.X.w(childAt) && (cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams()).e()) != null) {
                c2038y0 = cVarE.f(this, childAt, c2038y0);
                if (c2038y0.o()) {
                    break;
                }
            }
        }
        return c2038y0;
    }

    private void v(android.view.View view, int i6, android.graphics.Rect rect, android.graphics.Rect rect2, androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar, int i10, int i11) {
        int iWidth;
        int iHeight;
        int iB = androidx.core.view.AbstractC2025s.b(R(fVar.f21342c), i6);
        int iB2 = androidx.core.view.AbstractC2025s.b(S(fVar.f21343d), i6);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int i14 = iB2 & 7;
        int i15 = iB2 & 112;
        if (i14 != 1) {
            iWidth = i14 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i15 != 16) {
            iHeight = i15 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i12 == 1) {
            iWidth -= i10 / 2;
        } else if (i12 != 5) {
            iWidth -= i10;
        }
        if (i13 == 16) {
            iHeight -= i11 / 2;
        } else if (i13 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    private int w(int i6) {
        java.lang.StringBuilder sb;
        int[] iArr = this.f21327L;
        if (iArr == null) {
            sb = new java.lang.StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i6);
        } else {
            if (i6 >= 0 && i6 < iArr.length) {
                return iArr[i6];
            }
            sb = new java.lang.StringBuilder();
            sb.append("Keyline index ");
            sb.append(i6);
            sb.append(" out of range for ");
            sb.append(this);
        }
        sb.toString();
        return 0;
    }

    private void z(java.util.List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i6) : i6));
        }
        java.util.Comparator comparator = f21316c0;
        if (comparator != null) {
            java.util.Collections.sort(list, comparator);
        }
    }

    public boolean B(android.view.View view, int i6, int i10) {
        android.graphics.Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i6, i10);
        } finally {
            O(rectA);
        }
    }

    void G(android.view.View view, int i6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        if (fVar.f21350k != null) {
            android.graphics.Rect rectA = a();
            android.graphics.Rect rectA2 = a();
            android.graphics.Rect rectA3 = a();
            t(fVar.f21350k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i6, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z6 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i10 = rectA3.left - rectA2.left;
            int i11 = rectA3.top - rectA2.top;
            if (i10 != 0) {
                androidx.core.view.X.X(view, i10);
            }
            if (i11 != 0) {
                androidx.core.view.X.Y(view, i11);
            }
            if (z6 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f21350k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void H(int i6) {
        int i10;
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        boolean zH;
        int iZ = androidx.core.view.X.z(this);
        int size = this.f21318C.size();
        android.graphics.Rect rectA = a();
        android.graphics.Rect rectA2 = a();
        android.graphics.Rect rectA3 = a();
        for (int i11 = 0; i11 < size; i11++) {
            android.view.View view = (android.view.View) this.f21318C.get(i11);
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
            if (i6 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f21351l == ((android.view.View) this.f21318C.get(i12))) {
                        G(view, iZ);
                    }
                }
                q(view, true, rectA2);
                if (fVar.f21346g != 0 && !rectA2.isEmpty()) {
                    int iB = androidx.core.view.AbstractC2025s.b(fVar.f21346g, iZ);
                    int i13 = iB & 112;
                    if (i13 == 48) {
                        rectA.top = java.lang.Math.max(rectA.top, rectA2.bottom);
                    } else if (i13 == 80) {
                        rectA.bottom = java.lang.Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i14 = iB & 7;
                    if (i14 == 3) {
                        rectA.left = java.lang.Math.max(rectA.left, rectA2.right);
                    } else if (i14 == 5) {
                        rectA.right = java.lang.Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f21347h != 0 && view.getVisibility() == 0) {
                    F(view, rectA, iZ);
                }
                if (i6 != 2) {
                    x(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        N(view, rectA2);
                        for (i10 = i11 + 1; i10 < size; i10++) {
                            android.view.View view2 = (android.view.View) this.f21318C.get(i10);
                            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view2.getLayoutParams();
                            cVarE = fVar2.e();
                            if (cVarE == null && cVarE.e(this, view2, view)) {
                                if (i6 == 0 && fVar2.f()) {
                                    fVar2.j();
                                } else {
                                    if (i6 != 2) {
                                        zH = cVarE.h(this, view2, view);
                                    } else {
                                        cVarE.i(this, view2, view);
                                        zH = true;
                                    }
                                    if (i6 == 1) {
                                        fVar2.o(zH);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i10 < size) {
                        android.view.View view3 = (android.view.View) this.f21318C.get(i10);
                        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view3.getLayoutParams();
                        cVarE = fVar3.e();
                        if (cVarE == null) {
                        }
                    }
                }
            }
        }
        O(rectA);
        O(rectA2);
        O(rectA3);
    }

    public void I(android.view.View view, int i6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        if (fVar.a()) {
            throw new java.lang.IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        android.view.View view2 = fVar.f21350k;
        if (view2 != null) {
            D(view, view2, i6);
            return;
        }
        int i10 = fVar.f21344e;
        if (i10 >= 0) {
            E(view, i10, i6);
        } else {
            C(view, i6);
        }
    }

    public void J(android.view.View view, int i6, int i10, int i11, int i12) {
        measureChildWithMargins(view, i6, i10, i11, i12);
    }

    void N(android.view.View view, android.graphics.Rect rect) {
        ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).p(rect);
    }

    void P() {
        if (this.f21326K && this.f21330O != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f21330O);
        }
        this.f21331P = false;
    }

    final androidx.core.view.C2038y0 W(androidx.core.view.C2038y0 c2038y0) {
        if (B1.c.a(this.f21332Q, c2038y0)) {
            return c2038y0;
        }
        this.f21332Q = c2038y0;
        boolean z6 = false;
        boolean z10 = c2038y0 != null && c2038y0.l() > 0;
        this.f21333R = z10;
        if (!z10 && getBackground() == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        androidx.core.view.C2038y0 c2038y0E = e(c2038y0);
        requestLayout();
        return c2038y0E;
    }

    void b() {
        if (this.f21326K) {
            if (this.f21330O == null) {
                this.f21330O = new androidx.coordinatorlayout.widget.CoordinatorLayout.g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f21330O);
        }
        this.f21331P = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVar = fVar.f21340a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f21322G == null) {
                    this.f21322G = new android.graphics.Paint();
                }
                this.f21322G.setColor(fVar.f21340a.c(this, view));
                this.f21322G.setAlpha(c(java.lang.Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f21322G);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f21334S;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(android.view.View view) {
        java.util.List listG = this.f21319D.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < listG.size(); i6++) {
            android.view.View view2 = (android.view.View) listG.get(i6);
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            if (A(getChildAt(i6))) {
                z6 = true;
                break;
            }
        }
        if (z6 != this.f21331P) {
            if (z6) {
                b();
            } else {
                P();
            }
        }
    }

    final java.util.List<android.view.View> getDependencySortedChildren() {
        M();
        return j$.util.DesugarCollections.unmodifiableList(this.f21318C);
    }

    public final androidx.core.view.C2038y0 getLastWindowInsets() {
        return this.f21332Q;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f21337V.a();
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
        return this.f21334S;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.coordinatorlayout.widget.CoordinatorLayout.f generateDefaultLayoutParams() {
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public androidx.coordinatorlayout.widget.CoordinatorLayout.f generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.E
    public void j(android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        boolean z6;
        int iMin;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            android.view.View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
                if (fVar.i(i13) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f21323H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i6, i10, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f21323H;
                    iMax = i11 > 0 ? java.lang.Math.max(iMax, iArr3[0]) : java.lang.Math.min(iMax, iArr3[0]);
                    if (i12 > 0) {
                        z6 = true;
                        iMin = java.lang.Math.max(i14, this.f21323H[1]);
                    } else {
                        z6 = true;
                        iMin = java.lang.Math.min(i14, this.f21323H[1]);
                    }
                    i14 = iMin;
                    z10 = z6;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i14;
        if (z10) {
            H(1);
        }
    }

    @Override // androidx.core.view.D
    public void k(android.view.View view, int i6, int i10, int i11, int i12, int i13) {
        j(view, i6, i10, i11, i12, 0, this.f21324I);
    }

    @Override // androidx.core.view.D
    public boolean l(android.view.View view, android.view.View view2, int i6, int i10) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
                androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i6, i10);
                    z6 |= zA;
                    fVar.q(i10, zA);
                } else {
                    fVar.q(i10, false);
                }
            }
        }
        return z6;
    }

    @Override // androidx.core.view.D
    public void m(android.view.View view, android.view.View view2, int i6, int i10) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        this.f21337V.c(view, view2, i6, i10);
        this.f21329N = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
            if (fVar.i(i10) && (cVarE = fVar.e()) != null) {
                cVarE.v(this, childAt, view, view2, i6, i10);
            }
        }
    }

    @Override // androidx.core.view.D
    public void n(android.view.View view, int i6) {
        this.f21337V.d(view, i6);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
            if (fVar.i(i6)) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i6);
                }
                fVar.k(i6);
                fVar.j();
            }
        }
        this.f21329N = null;
    }

    @Override // androidx.core.view.D
    public void o(android.view.View view, int i6, int i10, int[] iArr, int i11) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            android.view.View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
                if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f21323H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i6, i10, iArr2, i11);
                    int[] iArr3 = this.f21323H;
                    iMax = i6 > 0 ? java.lang.Math.max(iMax, iArr3[0]) : java.lang.Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f21323H;
                    iMax2 = i10 > 0 ? java.lang.Math.max(iMax2, iArr4[1]) : java.lang.Math.min(iMax2, iArr4[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f21331P) {
            if (this.f21330O == null) {
                this.f21330O = new androidx.coordinatorlayout.widget.CoordinatorLayout.g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f21330O);
        }
        if (this.f21332Q == null && androidx.core.view.X.w(this)) {
            androidx.core.view.X.k0(this);
        }
        this.f21326K = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f21331P && this.f21330O != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f21330O);
        }
        android.view.View view = this.f21329N;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f21326K = false;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f21333R || this.f21334S == null) {
            return;
        }
        androidx.core.view.C2038y0 c2038y0 = this.f21332Q;
        int iL = c2038y0 != null ? c2038y0.l() : 0;
        if (iL > 0) {
            this.f21334S.setBounds(0, 0, getWidth(), iL);
            this.f21334S.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        int iZ = androidx.core.view.X.z(this);
        int size = this.f21318C.size();
        for (int i13 = 0; i13 < size; i13++) {
            android.view.View view = (android.view.View) this.f21318C.get(i13);
            if (view.getVisibility() != 8 && ((cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iZ))) {
                I(view, iZ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        int i11;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        M();
        g();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iZ = androidx.core.view.X.z(this);
        boolean z6 = iZ == 1;
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int size = android.view.View.MeasureSpec.getSize(i6);
        int mode2 = android.view.View.MeasureSpec.getMode(i10);
        int size2 = android.view.View.MeasureSpec.getSize(i10);
        int i18 = paddingLeft + paddingRight;
        int i19 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z10 = this.f21332Q != null && androidx.core.view.X.w(this);
        int size3 = this.f21318C.size();
        int i20 = suggestedMinimumWidth;
        int i21 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i22 = 0;
        while (i22 < size3) {
            android.view.View view = (android.view.View) this.f21318C.get(i22);
            if (view.getVisibility() == 8) {
                i16 = i22;
                i13 = size3;
                i14 = paddingLeft;
            } else {
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
                int i23 = fVar2.f21344e;
                if (i23 < 0 || mode == 0) {
                    i11 = iCombineMeasuredStates;
                } else {
                    int iW = w(i23);
                    int iB = androidx.core.view.AbstractC2025s.b(T(fVar2.f21342c), iZ) & 7;
                    i11 = iCombineMeasuredStates;
                    if ((iB == 3 && !z6) || (iB == 5 && z6)) {
                        iMax = java.lang.Math.max(0, (size - paddingRight) - iW);
                    } else if ((iB == 5 && !z6) || (iB == 3 && z6)) {
                        iMax = java.lang.Math.max(0, iW - paddingLeft);
                    }
                    if (z10 || androidx.core.view.X.w(view)) {
                        iMakeMeasureSpec = i6;
                        iMakeMeasureSpec2 = i10;
                    } else {
                        int iJ = this.f21332Q.j() + this.f21332Q.k();
                        int iL = this.f21332Q.l() + this.f21332Q.i();
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size - iJ, mode);
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(size2 - iL, mode2);
                    }
                    cVarE = fVar2.e();
                    if (cVarE != null) {
                        fVar = fVar2;
                        i15 = i11;
                        i16 = i22;
                        i12 = i21;
                        i14 = paddingLeft;
                        i17 = i20;
                        i13 = size3;
                        if (!cVarE.m(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar3 = fVar;
                        int iMax2 = java.lang.Math.max(i17, i18 + view.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) fVar3).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar3).rightMargin);
                        int iMax3 = java.lang.Math.max(i12, i19 + view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) fVar3).topMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
                        iCombineMeasuredStates = android.view.View.combineMeasuredStates(i15, view.getMeasuredState());
                        i20 = iMax2;
                        i21 = iMax3;
                    } else {
                        fVar = fVar2;
                        i12 = i21;
                        i13 = size3;
                        i14 = paddingLeft;
                        i15 = i11;
                        i16 = i22;
                        i17 = i20;
                    }
                    J(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar4 = fVar;
                    int iMax4 = java.lang.Math.max(i17, i18 + view.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) fVar4).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar4).rightMargin);
                    int iMax5 = java.lang.Math.max(i12, i19 + view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) fVar4).topMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(i15, view.getMeasuredState());
                    i20 = iMax4;
                    i21 = iMax5;
                }
                iMax = 0;
                if (z10) {
                    iMakeMeasureSpec = i6;
                    iMakeMeasureSpec2 = i10;
                } else {
                    iMakeMeasureSpec = i6;
                    iMakeMeasureSpec2 = i10;
                }
                cVarE = fVar2.e();
                if (cVarE != null) {
                    fVar = fVar2;
                    i15 = i11;
                    i16 = i22;
                    i12 = i21;
                    i14 = paddingLeft;
                    i17 = i20;
                    i13 = size3;
                    if (!cVarE.m(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar5 = fVar;
                    int iMax6 = java.lang.Math.max(i17, i18 + view.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) fVar5).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar5).rightMargin);
                    int iMax7 = java.lang.Math.max(i12, i19 + view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) fVar5).topMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar5).bottomMargin);
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(i15, view.getMeasuredState());
                    i20 = iMax6;
                    i21 = iMax7;
                } else {
                    fVar = fVar2;
                    i12 = i21;
                    i13 = size3;
                    i14 = paddingLeft;
                    i15 = i11;
                    i16 = i22;
                    i17 = i20;
                }
                J(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar6 = fVar;
                int iMax8 = java.lang.Math.max(i17, i18 + view.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) fVar6).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar6).rightMargin);
                int iMax9 = java.lang.Math.max(i12, i19 + view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) fVar6).topMargin + ((android.view.ViewGroup.MarginLayoutParams) fVar6).bottomMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(i15, view.getMeasuredState());
                i20 = iMax8;
                i21 = iMax9;
            }
            i22 = i16 + 1;
            paddingLeft = i14;
            size3 = i13;
        }
        int i24 = iCombineMeasuredStates;
        setMeasuredDimension(android.view.View.resolveSizeAndState(i20, i6, (-16777216) & i24), android.view.View.resolveSizeAndState(i21, i10, i24 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f6, float f10, boolean z6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zN |= cVarE.n(this, childAt, view, f6, f10, z6);
                }
            }
        }
        if (zN) {
            H(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f6, float f10) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zO |= cVarE.o(this, childAt, view, f6, f10);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i6, int i10, int[] iArr) {
        o(view, i6, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i6, int i10, int i11, int i12) {
        k(view, i6, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i6) {
        m(view, view2, i6, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.h hVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        android.util.SparseArray sparseArray = hVar.f21359E;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            int id = childAt.getId();
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = y(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = (android.os.Parcelable) sparseArray.get(id)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableY;
        androidx.coordinatorlayout.widget.CoordinatorLayout.h hVar = new androidx.coordinatorlayout.widget.CoordinatorLayout.h(super.onSaveInstanceState());
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            int id = childAt.getId();
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f21359E = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i6) {
        return l(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        n(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zL;
        boolean zD;
        android.view.MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f21328M == null) {
            zL = L(motionEvent, 1);
            if (!zL) {
                zD = false;
            }
            motionEventObtain = null;
            if (this.f21328M == null) {
                zD |= super.onTouchEvent(motionEvent);
            } else if (zL) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                Q(false);
            }
            return zD;
        }
        zL = false;
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) this.f21328M.getLayoutParams()).e();
        if (cVarE != null) {
            zD = cVarE.D(this, this.f21328M, motionEvent);
        } else {
            zD = false;
        }
        motionEventObtain = null;
        if (this.f21328M == null) {
            zD |= super.onTouchEvent(motionEvent);
        } else if (zL) {
            long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
            motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            Q(false);
        } else {
            Q(false);
        }
        return zD;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public androidx.coordinatorlayout.widget.CoordinatorLayout.f generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f) {
            return new androidx.coordinatorlayout.widget.CoordinatorLayout.f((androidx.coordinatorlayout.widget.CoordinatorLayout.f) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.coordinatorlayout.widget.CoordinatorLayout.f((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.coordinatorlayout.widget.CoordinatorLayout.f(layoutParams);
    }

    void q(android.view.View view, boolean z6, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public java.util.List r(android.view.View view) {
        java.util.List listH = this.f21319D.h(view);
        this.f21321F.clear();
        if (listH != null) {
            this.f21321F.addAll(listH);
        }
        return this.f21321F;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z6) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f21325J) {
            return;
        }
        Q(false);
        this.f21325J = true;
    }

    public java.util.List s(android.view.View view) {
        java.util.List listG = this.f21319D.g(view);
        this.f21321F.clear();
        if (listG != null) {
            this.f21321F.addAll(listG);
        }
        return this.f21321F;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f21335T = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f21334S;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f21334S = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f21334S.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f21334S, androidx.core.view.X.z(this));
                this.f21334S.setVisible(getVisibility() == 0, false);
                this.f21334S.setCallback(this);
            }
            androidx.core.view.X.e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new android.graphics.drawable.ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        setStatusBarBackground(i6 != 0 ? androidx.core.content.a.e(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        android.graphics.drawable.Drawable drawable = this.f21334S;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f21334S.setVisible(z6, false);
    }

    void t(android.view.View view, android.graphics.Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    void u(android.view.View view, int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i6, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21334S;
    }

    void x(android.view.View view, android.graphics.Rect rect) {
        rect.set(((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    androidx.coordinatorlayout.widget.CoordinatorLayout.f y(android.view.View view) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
        if (!fVar.f21341b) {
            if (view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.b) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.c behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.b) view).getBehavior();
                if (behavior == null) {
                }
                fVar.n(behavior);
            } else {
                androidx.coordinatorlayout.widget.CoordinatorLayout.d dVar = null;
                for (java.lang.Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a.wuzl(superclass, androidx.coordinatorlayout.widget.CoordinatorLayout.d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.n((androidx.coordinatorlayout.widget.CoordinatorLayout.c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (java.lang.Exception e6) {
                        java.lang.String str = "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?";
                    }
                }
            }
            fVar.f21341b = true;
        }
        return fVar;
    }
}
