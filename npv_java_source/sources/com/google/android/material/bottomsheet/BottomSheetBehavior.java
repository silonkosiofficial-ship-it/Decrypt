package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f42881i0 = p125m4.i.f50698e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f42882A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.g f42883B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.animation.ValueAnimator f42884C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f42885D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f42886E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f42887F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    float f42888G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f42889H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    float f42890I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f42891J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f42892K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f42893L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f42894M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f42895N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    J1.c f42896O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f42897P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f42898Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f42899R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f42900S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f42901T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f42902U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f42903V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    java.lang.ref.WeakReference f42904W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    java.lang.ref.WeakReference f42905X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    java.lang.ref.WeakReference f42906Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final java.util.ArrayList f42907Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42908a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private android.view.VelocityTracker f42909a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42910b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    p245y4.b f42911b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42912c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f42913c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42914d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f42915d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42916e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    boolean f42917e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42918f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private java.util.Map f42919f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42920g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final android.util.SparseIntArray f42921g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42922h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final J1.c.AbstractC0133c f42923h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E4.g f42925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.content.res.ColorStateList f42926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f42931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f42934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f42936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f42937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f42940y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private E4.k f42941z;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.view.View f42942C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f42943D;

        a(android.view.View view, int i6) {
            this.f42942C = view;
            this.f42943D = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.material.bottomsheet.BottomSheetBehavior.this.V0(this.f42942C, this.f42943D, false);
        }
    }

    class b implements android.animation.ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42925j != null) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42925j.W(fFloatValue);
            }
        }
    }

    class c implements com.google.android.material.internal.n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42946a;

        c(boolean z6) {
            this.f42946a = z6;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.n.c
        public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0, com.google.android.material.internal.n.d dVar) {
            boolean z6;
            androidx.core.graphics.f fVarF = c2038y0.f(androidx.core.view.C2038y0.m.h());
            androidx.core.graphics.f fVarF2 = c2038y0.f(androidx.core.view.C2038y0.m.e());
            com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42939x = fVarF.f21551b;
            boolean zG = com.google.android.material.internal.n.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42931p) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42938w = c2038y0.i();
                paddingBottom = dVar.f43470d + com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42938w;
            }
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42932q) {
                paddingLeft = (zG ? dVar.f43469c : dVar.f43467a) + fVarF.f21550a;
            }
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42933r) {
                paddingRight = (zG ? dVar.f43467a : dVar.f43469c) + fVarF.f21552c;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z10 = true;
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42935t) {
                int i6 = marginLayoutParams.leftMargin;
                int i10 = fVarF.f21550a;
                if (i6 != i10) {
                    marginLayoutParams.leftMargin = i10;
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42936u) {
                int i11 = marginLayoutParams.rightMargin;
                int i12 = fVarF.f21552c;
                if (i11 != i12) {
                    marginLayoutParams.rightMargin = i12;
                    z6 = true;
                }
            }
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42937v) {
                int i13 = marginLayoutParams.topMargin;
                int i14 = fVarF.f21551b;
                if (i13 != i14) {
                    marginLayoutParams.topMargin = i14;
                } else {
                    z10 = z6;
                }
            } else {
                z10 = z6;
            }
            if (z10) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f42946a) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42929n = fVarF2.f21553d;
            }
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42931p || this.f42946a) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.a1(false);
            }
            return c2038y0;
        }
    }

    class d extends J1.c.AbstractC0133c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f42948a;

        d() {
        }

        private boolean n(android.view.View view) {
            int top = view.getTop();
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f42903V + bottomSheetBehavior.m0()) / 2;
        }

        @Override // J1.c.AbstractC0133c
        public int a(android.view.View view, int i6, int i10) {
            return view.getLeft();
        }

        @Override // J1.c.AbstractC0133c
        public int b(android.view.View view, int i6, int i10) {
            return p222w1.a.b(i6, com.google.android.material.bottomsheet.BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // J1.c.AbstractC0133c
        public int e(android.view.View view) {
            return com.google.android.material.bottomsheet.BottomSheetBehavior.this.e0() ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42903V : com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42889H;
        }

        @Override // J1.c.AbstractC0133c
        public void j(int i6) {
            if (i6 == 1 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42893L) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.O0(1);
            }
        }

        @Override // J1.c.AbstractC0133c
        public void k(android.view.View view, int i6, int i10, int i11, int i12) {
            com.google.android.material.bottomsheet.BottomSheetBehavior.this.j0(i10);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // J1.c.AbstractC0133c
        public void l(android.view.View view, float f6, float f10) {
            int i6 = 6;
            if (f10 >= 0.0f) {
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
                if (bottomSheetBehavior.f42891J && bottomSheetBehavior.S0(view, f10)) {
                    if ((java.lang.Math.abs(f6) < java.lang.Math.abs(f10) && f10 > com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42916e) || n(view)) {
                        i6 = 5;
                    } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42910b || java.lang.Math.abs(view.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.m0()) < java.lang.Math.abs(view.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42887F)) {
                        i6 = 3;
                    }
                } else if (f10 == 0.0f || java.lang.Math.abs(f6) > java.lang.Math.abs(f10)) {
                    int top = view.getTop();
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42910b) {
                        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
                        int i10 = bottomSheetBehavior2.f42887F;
                        if (top < i10) {
                            if (top < java.lang.Math.abs(top - bottomSheetBehavior2.f42889H)) {
                                i6 = 3;
                            } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.T0()) {
                                i6 = 4;
                            }
                        } else if (java.lang.Math.abs(top - i10) >= java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42889H) || com.google.android.material.bottomsheet.BottomSheetBehavior.this.T0()) {
                            i6 = 4;
                        }
                    } else if (java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42886E) < java.lang.Math.abs(top - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42889H)) {
                        i6 = 3;
                    } else {
                        i6 = 4;
                    }
                } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42910b) {
                    i6 = 4;
                } else {
                    int top2 = view.getTop();
                    if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42887F) >= java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42889H) || com.google.android.material.bottomsheet.BottomSheetBehavior.this.T0()) {
                        i6 = 4;
                    }
                }
            } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42910b) {
                i6 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.f42948a;
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.T0()) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.Q0(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f42903V)) {
                        i6 = 4;
                    }
                } else if (top3 <= com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42887F) {
                }
                i6 = 3;
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            bottomSheetBehavior4.V0(view, i6, bottomSheetBehavior4.U0());
        }

        @Override // J1.c.AbstractC0133c
        public boolean m(android.view.View view, int i6) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            int i10 = bottomSheetBehavior.f42894M;
            if (i10 == 1 || bottomSheetBehavior.f42917e0) {
                return false;
            }
            if (i10 == 3 && bottomSheetBehavior.f42913c0 == i6) {
                java.lang.ref.WeakReference weakReference = bottomSheetBehavior.f42906Y;
                android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f42948a = java.lang.System.currentTimeMillis();
            java.lang.ref.WeakReference weakReference2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42904W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements C1.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42950a;

        e(int i6) {
            this.f42950a = i6;
        }

        @Override // C1.G
        public boolean a(android.view.View view, C1.G.a aVar) {
            com.google.android.material.bottomsheet.BottomSheetBehavior.this.N0(this.f42950a);
            return true;
        }
    }

    protected static class f extends I1.a {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.f> CREATOR = new com.google.android.material.bottomsheet.BottomSheetBehavior.f.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final int f42952E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f42953F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        boolean f42954G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        boolean f42955H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        boolean f42956I;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.bottomsheet.BottomSheetBehavior.f createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.f(parcel, (java.lang.ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.bottomsheet.BottomSheetBehavior.f createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.bottomsheet.BottomSheetBehavior.f[] newArray(int i6) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.f[i6];
            }
        }

        public f(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f42952E = parcel.readInt();
            this.f42953F = parcel.readInt();
            this.f42954G = parcel.readInt() == 1;
            this.f42955H = parcel.readInt() == 1;
            this.f42956I = parcel.readInt() == 1;
        }

        public f(android.os.Parcelable parcelable, com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f42952E = bottomSheetBehavior.f42894M;
            this.f42953F = bottomSheetBehavior.f42918f;
            this.f42954G = bottomSheetBehavior.f42910b;
            this.f42955H = bottomSheetBehavior.f42891J;
            this.f42956I = bottomSheetBehavior.f42892K;
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f42952E);
            parcel.writeInt(this.f42953F);
            parcel.writeInt(this.f42954G ? 1 : 0);
            parcel.writeInt(this.f42955H ? 1 : 0);
            parcel.writeInt(this.f42956I ? 1 : 0);
        }
    }

    private class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.Runnable f42959c;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.android.material.bottomsheet.BottomSheetBehavior.g.this.f42958b = false;
                J1.c cVar = com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42896O;
                if (cVar != null && cVar.k(true)) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.g gVar = com.google.android.material.bottomsheet.BottomSheetBehavior.g.this;
                    gVar.c(gVar.f42957a);
                    return;
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior.g gVar2 = com.google.android.material.bottomsheet.BottomSheetBehavior.g.this;
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
                if (bottomSheetBehavior.f42894M == 2) {
                    bottomSheetBehavior.O0(gVar2.f42957a);
                }
            }
        }

        private g() {
            this.f42959c = new com.google.android.material.bottomsheet.BottomSheetBehavior.g.a();
        }

        /* synthetic */ g(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior.a aVar) {
            this();
        }

        void c(int i6) {
            java.lang.ref.WeakReference weakReference = com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42904W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f42957a = i6;
            if (this.f42958b) {
                return;
            }
            androidx.core.view.X.f0((android.view.View) com.google.android.material.bottomsheet.BottomSheetBehavior.this.f42904W.get(), this.f42959c);
            this.f42958b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f42908a = 0;
        this.f42910b = true;
        this.f42912c = false;
        this.f42927l = -1;
        this.f42928m = -1;
        this.f42883B = new com.google.android.material.bottomsheet.BottomSheetBehavior.g(this, null);
        this.f42888G = 0.5f;
        this.f42890I = -1.0f;
        this.f42893L = true;
        this.f42894M = 4;
        this.f42895N = 4;
        this.f42900S = 0.1f;
        this.f42907Z = new java.util.ArrayList();
        this.f42915d0 = -1;
        this.f42921g0 = new android.util.SparseIntArray();
        this.f42923h0 = new com.google.android.material.bottomsheet.BottomSheetBehavior.d();
    }

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        int i6;
        super(context, attributeSet);
        this.f42908a = 0;
        this.f42910b = true;
        this.f42912c = false;
        this.f42927l = -1;
        this.f42928m = -1;
        this.f42883B = new com.google.android.material.bottomsheet.BottomSheetBehavior.g(this, null);
        this.f42888G = 0.5f;
        this.f42890I = -1.0f;
        this.f42893L = true;
        this.f42894M = 4;
        this.f42895N = 4;
        this.f42900S = 0.1f;
        this.f42907Z = new java.util.ArrayList();
        this.f42915d0 = -1;
        this.f42921g0 = new android.util.SparseIntArray();
        this.f42923h0 = new com.google.android.material.bottomsheet.BottomSheetBehavior.d();
        this.f42924i = context.getResources().getDimensionPixelSize(p125m4.c.f50562X);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50856S);
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f50888W)) {
            this.f42926k = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50888W);
        }
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f51032o0)) {
            this.f42941z = E4.k.e(context, attributeSet, p125m4.a.f50510d, f42881i0).m();
        }
        h0(context);
        i0();
        this.f42890I = typedArrayObtainStyledAttributes.getDimension(p125m4.j.f50880V, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f50864T)) {
            H0(typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f50864T, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f50872U)) {
            G0(typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f50872U, -1));
        }
        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(p125m4.j.f50936c0);
        I0((typedValuePeekValue == null || (i6 = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f50936c0, -1) : i6);
        F0(typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50928b0, false));
        D0(typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50968g0, false));
        C0(typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50912Z, true));
        M0(typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50960f0, false));
        A0(typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50896X, true));
        K0(typedArrayObtainStyledAttributes.getInt(p125m4.j.f50944d0, 0));
        E0(typedArrayObtainStyledAttributes.getFloat(p125m4.j.f50920a0, 0.5f));
        android.util.TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(p125m4.j.f50904Y);
        B0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(p125m4.j.f50904Y, 0) : typedValuePeekValue2.data);
        L0(typedArrayObtainStyledAttributes.getInt(p125m4.j.f50952e0, 500));
        this.f42931p = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51000k0, false);
        this.f42932q = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51008l0, false);
        this.f42933r = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51016m0, false);
        this.f42934s = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51024n0, true);
        this.f42935t = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50976h0, false);
        this.f42936u = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50984i0, false);
        this.f42937v = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50992j0, false);
        this.f42940y = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51040p0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f42914d = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void P0(android.view.View view) {
        boolean z6 = (android.os.Build.VERSION.SDK_INT < 29 || r0() || this.f42920g) ? false : true;
        if (this.f42931p || this.f42932q || this.f42933r || this.f42935t || this.f42936u || this.f42937v || z6) {
            com.google.android.material.internal.n.b(view, new com.google.android.material.bottomsheet.BottomSheetBehavior.c(z6));
        }
    }

    private boolean R0() {
        return this.f42896O != null && (this.f42893L || this.f42894M == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(android.view.View view, int i6, boolean z6) {
        int iN0 = n0(i6);
        J1.c cVar = this.f42896O;
        if (cVar == null || (!z6 ? cVar.H(view, view.getLeft(), iN0) : cVar.F(view.getLeft(), iN0))) {
            O0(i6);
            return;
        }
        O0(2);
        Y0(i6, true);
        this.f42883B.c(i6);
    }

    private void W0() {
        java.lang.ref.WeakReference weakReference = this.f42904W;
        if (weakReference != null) {
            X0((android.view.View) weakReference.get(), 0);
        }
        java.lang.ref.WeakReference weakReference2 = this.f42905X;
        if (weakReference2 != null) {
            X0((android.view.View) weakReference2.get(), 1);
        }
    }

    private int X(android.view.View view, int i6, int i10) {
        return androidx.core.view.X.c(view, view.getResources().getString(i6), g0(i10));
    }

    private void X0(android.view.View view, int i6) {
        int i10;
        C1.B.a aVar;
        if (view == null) {
            return;
        }
        f0(view, i6);
        if (!this.f42910b && this.f42894M != 6) {
            this.f42921g0.put(i6, X(view, p125m4.h.f50671a, 6));
        }
        if (this.f42891J && t0() && this.f42894M != 5) {
            w0(view, C1.B.a.f1259y, 5);
        }
        int i11 = this.f42894M;
        if (i11 == 3) {
            i10 = this.f42910b ? 4 : 6;
            aVar = C1.B.a.f1258x;
        } else {
            if (i11 != 4) {
                if (i11 != 6) {
                    return;
                }
                w0(view, C1.B.a.f1258x, 4);
                w0(view, C1.B.a.f1257w, 3);
                return;
            }
            i10 = this.f42910b ? 3 : 6;
            aVar = C1.B.a.f1257w;
        }
        w0(view, aVar, i10);
    }

    private void Y() {
        int iC0 = c0();
        if (this.f42910b) {
            this.f42889H = java.lang.Math.max(this.f42903V - iC0, this.f42886E);
        } else {
            this.f42889H = this.f42903V - iC0;
        }
    }

    private void Y0(int i6, boolean z6) {
        boolean zQ0;
        android.animation.ValueAnimator valueAnimator;
        if (i6 == 2 || this.f42882A == (zQ0 = q0()) || this.f42925j == null) {
            return;
        }
        this.f42882A = zQ0;
        if (!z6 || (valueAnimator = this.f42884C) == null) {
            android.animation.ValueAnimator valueAnimator2 = this.f42884C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f42884C.cancel();
            }
            this.f42925j.W(this.f42882A ? b0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f42884C.reverse();
        } else {
            this.f42884C.setFloatValues(this.f42925j.w(), zQ0 ? b0() : 1.0f);
            this.f42884C.start();
        }
    }

    private float Z(float f6, android.view.RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f6 > 0.0f) {
                return radius / f6;
            }
        }
        return 0.0f;
    }

    private void Z0(boolean z6) {
        java.util.Map map;
        int iIntValue;
        java.lang.ref.WeakReference weakReference = this.f42904W;
        if (weakReference == null) {
            return;
        }
        android.view.ViewParent parent = ((android.view.View) weakReference.get()).getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f42919f0 != null) {
                    return;
                } else {
                    this.f42919f0 = new java.util.HashMap(childCount);
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i6);
                if (childAt != this.f42904W.get()) {
                    if (z6) {
                        this.f42919f0.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f42912c) {
                            iIntValue = 4;
                            androidx.core.view.X.w0(childAt, iIntValue);
                        }
                    } else if (this.f42912c && (map = this.f42919f0) != null && map.containsKey(childAt)) {
                        iIntValue = ((java.lang.Integer) this.f42919f0.get(childAt)).intValue();
                        androidx.core.view.X.w0(childAt, iIntValue);
                    }
                }
            }
            if (!z6) {
                this.f42919f0 = null;
            } else if (this.f42912c) {
                ((android.view.View) this.f42904W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void a0() {
        this.f42887F = (int) (this.f42903V * (1.0f - this.f42888G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(boolean z6) {
        android.view.View view;
        if (this.f42904W != null) {
            Y();
            if (this.f42894M != 4 || (view = (android.view.View) this.f42904W.get()) == null) {
                return;
            }
            if (z6) {
                N0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private float b0() {
        java.lang.ref.WeakReference weakReference;
        android.view.WindowInsets rootWindowInsets;
        if (this.f42925j == null || (weakReference = this.f42904W) == null || weakReference.get() == null || android.os.Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        android.view.View view = (android.view.View) this.f42904W.get();
        if (!p0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return java.lang.Math.max(Z(this.f42925j.D(), rootWindowInsets.getRoundedCorner(0)), Z(this.f42925j.E(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int c0() {
        int i6;
        if (this.f42920g) {
            return java.lang.Math.min(java.lang.Math.max(this.f42922h, this.f42903V - ((this.f42902U * 9) / 16)), this.f42901T) + this.f42938w;
        }
        return (this.f42930o || this.f42931p || (i6 = this.f42929n) <= 0) ? this.f42918f + this.f42938w : java.lang.Math.max(this.f42918f, i6 + this.f42924i);
    }

    private float d0(int i6) {
        float f6;
        float fM0;
        int i10 = this.f42889H;
        if (i6 > i10 || i10 == m0()) {
            int i11 = this.f42889H;
            f6 = i11 - i6;
            fM0 = this.f42903V - i11;
        } else {
            int i12 = this.f42889H;
            f6 = i12 - i6;
            fM0 = i12 - m0();
        }
        return f6 / fM0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0() {
        return s0() && t0();
    }

    private void f0(android.view.View view, int i6) {
        if (view == null) {
            return;
        }
        androidx.core.view.X.h0(view, 524288);
        androidx.core.view.X.h0(view, 262144);
        androidx.core.view.X.h0(view, 1048576);
        int i10 = this.f42921g0.get(i6, -1);
        if (i10 != -1) {
            androidx.core.view.X.h0(view, i10);
            this.f42921g0.delete(i6);
        }
    }

    private C1.G g0(int i6) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.e(i6);
    }

    private void h0(android.content.Context context) {
        if (this.f42941z == null) {
            return;
        }
        E4.g gVar = new E4.g(this.f42941z);
        this.f42925j = gVar;
        gVar.K(context);
        android.content.res.ColorStateList colorStateList = this.f42926k;
        if (colorStateList != null) {
            this.f42925j.V(colorStateList);
            return;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f42925j.setTint(typedValue.data);
    }

    private void i0() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(b0(), 1.0f);
        this.f42884C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f42884C.addUpdateListener(new com.google.android.material.bottomsheet.BottomSheetBehavior.b());
    }

    private int l0(int i6, int i10, int i11, int i12) {
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

    private int n0(int i6) {
        if (i6 == 3) {
            return m0();
        }
        if (i6 == 4) {
            return this.f42889H;
        }
        if (i6 == 5) {
            return this.f42903V;
        }
        if (i6 == 6) {
            return this.f42887F;
        }
        throw new java.lang.IllegalArgumentException("Invalid state to get top offset: " + i6);
    }

    private float o0() {
        android.view.VelocityTracker velocityTracker = this.f42909a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f42914d);
        return this.f42909a0.getYVelocity(this.f42913c0);
    }

    private boolean p0() {
        java.lang.ref.WeakReference weakReference = this.f42904W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((android.view.View) this.f42904W.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean q0() {
        return this.f42894M == 3 && (this.f42940y || p0());
    }

    private boolean u0(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.X.Q(view);
    }

    private void w0(android.view.View view, C1.B.a aVar, int i6) {
        androidx.core.view.X.j0(view, aVar, null, g0(i6));
    }

    private void x0() {
        this.f42913c0 = -1;
        this.f42915d0 = -1;
        android.view.VelocityTracker velocityTracker = this.f42909a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42909a0 = null;
        }
    }

    private void y0(com.google.android.material.bottomsheet.BottomSheetBehavior.f fVar) {
        int i6 = this.f42908a;
        if (i6 == 0) {
            return;
        }
        if (i6 == -1 || (i6 & 1) == 1) {
            this.f42918f = fVar.f42953F;
        }
        if (i6 == -1 || (i6 & 2) == 2) {
            this.f42910b = fVar.f42954G;
        }
        if (i6 == -1 || (i6 & 4) == 4) {
            this.f42891J = fVar.f42955H;
        }
        if (i6 == -1 || (i6 & 8) == 8) {
            this.f42892K = fVar.f42956I;
        }
    }

    private void z0(android.view.View view, java.lang.Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6, int i10) {
        this.f42898Q = 0;
        this.f42899R = false;
        return (i6 & 2) != 0;
    }

    public void A0(boolean z6) {
        this.f42893L = z6;
    }

    public void B0(int i6) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f42885D = i6;
        Y0(this.f42894M, true);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6) {
        java.lang.ref.WeakReference weakReference;
        int i10 = 3;
        if (view.getTop() == m0()) {
            O0(3);
            return;
        }
        if (!v0() || ((weakReference = this.f42906Y) != null && view2 == weakReference.get() && this.f42899R)) {
            if (this.f42898Q > 0) {
                if (!this.f42910b && view.getTop() > this.f42887F) {
                    i10 = 6;
                }
            } else if (this.f42891J && S0(view, o0())) {
                i10 = 5;
            } else if (this.f42898Q == 0) {
                int top = view.getTop();
                if (!this.f42910b) {
                    int i11 = this.f42887F;
                    if (top < i11) {
                        if (top >= java.lang.Math.abs(top - this.f42889H)) {
                            if (T0()) {
                                i10 = 4;
                            } else {
                                i10 = 6;
                            }
                        }
                    } else if (java.lang.Math.abs(top - i11) < java.lang.Math.abs(top - this.f42889H)) {
                        i10 = 6;
                    } else {
                        i10 = 4;
                    }
                } else if (java.lang.Math.abs(top - this.f42886E) >= java.lang.Math.abs(top - this.f42889H)) {
                    i10 = 4;
                }
            } else {
                if (!this.f42910b) {
                    int top2 = view.getTop();
                    if (java.lang.Math.abs(top2 - this.f42887F) < java.lang.Math.abs(top2 - this.f42889H)) {
                        i10 = 6;
                    }
                }
                i10 = 4;
            }
            V0(view, i10, false);
            this.f42899R = false;
        }
    }

    public void C0(boolean z6) {
        if (this.f42910b == z6) {
            return;
        }
        this.f42910b = z6;
        if (this.f42904W != null) {
            Y();
        }
        O0((this.f42910b && this.f42894M == 6) ? 3 : this.f42894M);
        Y0(this.f42894M, true);
        W0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f42894M == 1 && actionMasked == 0) {
            return true;
        }
        if (R0()) {
            this.f42896O.z(motionEvent);
        }
        if (actionMasked == 0) {
            x0();
        }
        if (this.f42909a0 == null) {
            this.f42909a0 = android.view.VelocityTracker.obtain();
        }
        this.f42909a0.addMovement(motionEvent);
        if (R0() && actionMasked == 2 && !this.f42897P && java.lang.Math.abs(this.f42915d0 - motionEvent.getY()) > this.f42896O.u()) {
            this.f42896O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f42897P;
    }

    public void D0(boolean z6) {
        this.f42930o = z6;
    }

    public void E0(float f6) {
        if (f6 <= 0.0f || f6 >= 1.0f) {
            throw new java.lang.IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f42888G = f6;
        if (this.f42904W != null) {
            a0();
        }
    }

    public void F0(boolean z6) {
        if (this.f42891J != z6) {
            this.f42891J = z6;
            if (!z6 && this.f42894M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i6) {
        this.f42928m = i6;
    }

    public void H0(int i6) {
        this.f42927l = i6;
    }

    public void I0(int i6) {
        J0(i6, false);
    }

    public final void J0(int i6, boolean z6) {
        if (i6 == -1) {
            if (this.f42920g) {
                return;
            } else {
                this.f42920g = true;
            }
        } else {
            if (!this.f42920g && this.f42918f == i6) {
                return;
            }
            this.f42920g = false;
            this.f42918f = java.lang.Math.max(0, i6);
        }
        a1(z6);
    }

    public void K0(int i6) {
        this.f42908a = i6;
    }

    public void L0(int i6) {
        this.f42916e = i6;
    }

    public void M0(boolean z6) {
        this.f42892K = z6;
    }

    public void N0(int i6) {
        if (i6 == 1 || i6 == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("STATE_");
            sb.append(i6 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!this.f42891J && i6 == 5) {
            java.lang.String str = "Cannot set state: " + i6;
            return;
        }
        int i10 = (i6 == 6 && this.f42910b && n0(i6) <= this.f42886E) ? 3 : i6;
        java.lang.ref.WeakReference weakReference = this.f42904W;
        if (weakReference == null || weakReference.get() == null) {
            O0(i6);
        } else {
            android.view.View view = (android.view.View) this.f42904W.get();
            z0(view, new com.google.android.material.bottomsheet.BottomSheetBehavior.a(view, i10));
        }
    }

    void O0(int i6) {
        if (this.f42894M == i6) {
            return;
        }
        this.f42894M = i6;
        if (i6 == 4 || i6 == 3 || i6 == 6 || (this.f42891J && i6 == 5)) {
            this.f42895N = i6;
        }
        java.lang.ref.WeakReference weakReference = this.f42904W;
        if (weakReference == null || ((android.view.View) weakReference.get()) == null) {
            return;
        }
        if (i6 == 3) {
            Z0(true);
        } else if (i6 == 6 || i6 == 5 || i6 == 4) {
            Z0(false);
        }
        Y0(i6, true);
        if (this.f42907Z.size() <= 0) {
            W0();
        } else {
            androidx.appcompat.app.D.a(this.f42907Z.get(0));
            throw null;
        }
    }

    public boolean Q0(long j6, float f6) {
        return false;
    }

    boolean S0(android.view.View view, float f6) {
        if (this.f42892K) {
            return true;
        }
        if (t0() && view.getTop() >= this.f42889H) {
            return java.lang.Math.abs((((float) view.getTop()) + (f6 * this.f42900S)) - ((float) this.f42889H)) / ((float) c0()) > 0.5f;
        }
        return false;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f42904W = null;
        this.f42896O = null;
        this.f42911b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f42904W = null;
        this.f42896O = null;
        this.f42911b0 = null;
    }

    void j0(int i6) {
        if (((android.view.View) this.f42904W.get()) == null || this.f42907Z.isEmpty()) {
            return;
        }
        d0(i6);
        if (this.f42907Z.size() <= 0) {
            return;
        }
        androidx.appcompat.app.D.a(this.f42907Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        int i6;
        J1.c cVar;
        if (!view.isShown() || !this.f42893L) {
            this.f42897P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x0();
        }
        if (this.f42909a0 == null) {
            this.f42909a0 = android.view.VelocityTracker.obtain();
        }
        this.f42909a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f42915d0 = (int) motionEvent.getY();
            if (this.f42894M != 2) {
                java.lang.ref.WeakReference weakReference = this.f42906Y;
                android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.B(view2, x6, this.f42915d0)) {
                    this.f42913c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f42917e0 = true;
                }
            }
            this.f42897P = this.f42913c0 == -1 && !coordinatorLayout.B(view, x6, this.f42915d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f42917e0 = false;
            this.f42913c0 = -1;
            if (this.f42897P) {
                this.f42897P = false;
                return false;
            }
        }
        if (!this.f42897P && (cVar = this.f42896O) != null && cVar.G(motionEvent)) {
            return true;
        }
        java.lang.ref.WeakReference weakReference2 = this.f42906Y;
        android.view.View view3 = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f42897P || this.f42894M == 1 || coordinatorLayout.B(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f42896O == null || (i6 = this.f42915d0) == -1 || java.lang.Math.abs(((float) i6) - motionEvent.getY()) <= ((float) this.f42896O.u())) ? false : true;
    }

    android.view.View k0(android.view.View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (androidx.core.view.X.S(view)) {
            return view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View viewK0 = k0(viewGroup.getChildAt(i6));
                if (viewK0 != null) {
                    return viewK0;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c A[PHI: r5 r7
  0x009c: PHI (r5v23 int) = (r5v22 int), (r5v24 int) binds: [B:34:0x00a6, B:29:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r7v7 int) = (r7v5 int), (r7v2 int) binds: [B:34:0x00a6, B:29:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        int iM0;
        int i10;
        if (androidx.core.view.X.w(coordinatorLayout) && !androidx.core.view.X.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f42904W == null) {
            this.f42922h = coordinatorLayout.getResources().getDimensionPixelSize(p125m4.c.f50567b);
            P0(view);
            androidx.core.view.X.G0(view, new com.google.android.material.bottomsheet.a(view));
            this.f42904W = new java.lang.ref.WeakReference(view);
            this.f42911b0 = new p245y4.b(view);
            E4.g gVar = this.f42925j;
            if (gVar != null) {
                androidx.core.view.X.r0(view, gVar);
                E4.g gVar2 = this.f42925j;
                float fU = this.f42890I;
                if (fU == -1.0f) {
                    fU = androidx.core.view.X.u(view);
                }
                gVar2.U(fU);
            } else {
                android.content.res.ColorStateList colorStateList = this.f42926k;
                if (colorStateList != null) {
                    androidx.core.view.X.s0(view, colorStateList);
                }
            }
            W0();
            if (androidx.core.view.X.x(view) == 0) {
                androidx.core.view.X.w0(view, 1);
            }
        }
        if (this.f42896O == null) {
            this.f42896O = J1.c.m(coordinatorLayout, this.f42923h0);
        }
        int top = view.getTop();
        coordinatorLayout.I(view, i6);
        this.f42902U = coordinatorLayout.getWidth();
        this.f42903V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f42901T = height;
        int iMin = this.f42903V;
        int i11 = iMin - height;
        int i12 = this.f42939x;
        if (i11 < i12) {
            if (this.f42934s) {
                i10 = this.f42928m;
                if (i10 != -1) {
                    iMin = java.lang.Math.min(iMin, i10);
                }
            } else {
                iMin -= i12;
                i10 = this.f42928m;
                if (i10 != -1) {
                    iMin = java.lang.Math.min(iMin, i10);
                }
            }
            this.f42901T = iMin;
        }
        this.f42886E = java.lang.Math.max(0, this.f42903V - this.f42901T);
        a0();
        Y();
        int i13 = this.f42894M;
        if (i13 == 3) {
            iM0 = m0();
        } else if (i13 == 6) {
            iM0 = this.f42887F;
        } else {
            if (!this.f42891J || i13 != 5) {
                if (i13 == 4) {
                    iM0 = this.f42889H;
                } else if (i13 == 1 || i13 == 2) {
                    androidx.core.view.X.Y(view, top - view.getTop());
                }
                Y0(this.f42894M, false);
                this.f42906Y = new java.lang.ref.WeakReference(k0(view));
                if (this.f42907Z.size() <= 0) {
                    return true;
                }
                androidx.appcompat.app.D.a(this.f42907Z.get(0));
                throw null;
            }
            iM0 = this.f42903V;
        }
        androidx.core.view.X.Y(view, iM0);
        Y0(this.f42894M, false);
        this.f42906Y = new java.lang.ref.WeakReference(k0(view));
        if (this.f42907Z.size() <= 0) {
            return true;
        }
        androidx.appcompat.app.D.a(this.f42907Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11, int i12) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i6, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f42927l, marginLayoutParams.width), l0(i11, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, this.f42928m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f42910b) {
            return this.f42886E;
        }
        return java.lang.Math.max(this.f42885D, this.f42934s ? 0 : this.f42939x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f6, float f10) {
        java.lang.ref.WeakReference weakReference;
        if (v0() && (weakReference = this.f42906Y) != null && view2 == weakReference.get()) {
            return this.f42894M != 3 || super.o(coordinatorLayout, view, view2, f6, f10);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int[] iArr, int i11) {
        int i12;
        if (i11 == 1) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f42906Y;
        android.view.View view3 = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (!v0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i10;
            if (i10 > 0) {
                if (i13 < m0()) {
                    int iM0 = top - m0();
                    iArr[1] = iM0;
                    androidx.core.view.X.Y(view, -iM0);
                    i12 = 3;
                    O0(i12);
                } else {
                    if (!this.f42893L) {
                        return;
                    }
                    iArr[1] = i10;
                    androidx.core.view.X.Y(view, -i10);
                    O0(1);
                }
            } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
                if (i13 > this.f42889H && !e0()) {
                    int i14 = top - this.f42889H;
                    iArr[1] = i14;
                    androidx.core.view.X.Y(view, -i14);
                    i12 = 4;
                    O0(i12);
                } else {
                    if (!this.f42893L) {
                        return;
                    }
                    iArr[1] = i10;
                    androidx.core.view.X.Y(view, -i10);
                    O0(1);
                }
            }
            j0(view.getTop());
            this.f42898Q = i10;
            this.f42899R = true;
        }
    }

    public boolean r0() {
        return this.f42930o;
    }

    public boolean s0() {
        return this.f42891J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public boolean v0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        com.google.android.material.bottomsheet.BottomSheetBehavior.f fVar = (com.google.android.material.bottomsheet.BottomSheetBehavior.f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        y0(fVar);
        int i6 = fVar.f42952E;
        if (i6 == 1 || i6 == 2) {
            i6 = 4;
        }
        this.f42894M = i6;
        this.f42895N = i6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public android.os.Parcelable y(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.f(super.y(coordinatorLayout, view), this);
    }
}
