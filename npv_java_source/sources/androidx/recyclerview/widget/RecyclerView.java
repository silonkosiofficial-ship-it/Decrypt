package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup implements androidx.core.view.B {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int[] f23021c1 = {android.R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    static final boolean f23022d1 = false;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    static final boolean f23023e1 = true;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    static final boolean f23024f1 = true;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    static final boolean f23025g1 = true;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final boolean f23026h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final boolean f23027i1 = false;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final java.lang.Class[] f23028j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    static final android.view.animation.Interpolator f23029k1;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView.r f23030A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final int f23031B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.recyclerview.widget.RecyclerView.x f23032C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final int f23033C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final androidx.recyclerview.widget.RecyclerView.v f23034D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private float f23035D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.recyclerview.widget.RecyclerView.y f23036E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private float f23037E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    androidx.recyclerview.widget.a f23038F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private boolean f23039F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    androidx.recyclerview.widget.b f23040G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    final androidx.recyclerview.widget.RecyclerView.C f23041G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final androidx.recyclerview.widget.p f23042H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    androidx.recyclerview.widget.e f23043H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f23044I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    androidx.recyclerview.widget.e.b f23045I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final java.lang.Runnable f23046J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    final androidx.recyclerview.widget.RecyclerView.A f23047J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final android.graphics.Rect f23048K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView.t f23049K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final android.graphics.Rect f23050L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private java.util.List f23051L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final android.graphics.RectF f23052M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    boolean f23053M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    androidx.recyclerview.widget.RecyclerView.h f23054N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    boolean f23055N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    androidx.recyclerview.widget.RecyclerView.p f23056O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView.m.a f23057O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final java.util.List f23058P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    boolean f23059P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    final java.util.ArrayList f23060Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    androidx.recyclerview.widget.k f23061Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final java.util.ArrayList f23062R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private final int[] f23063R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView.s f23064S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private androidx.core.view.C f23065S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    boolean f23066T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private final int[] f23067T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    boolean f23068U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private final int[] f23069U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f23070V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    final int[] f23071V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f23072W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    final java.util.List f23073W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private java.lang.Runnable f23074X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private boolean f23075Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f23076Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f23077a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f23078a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    boolean f23079b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private final androidx.recyclerview.widget.p.b f23080b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f23081c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f23082d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f23083e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    boolean f23084f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager f23085g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private java.util.List f23086h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f23087i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    boolean f23088j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f23089k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f23090l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView.l f23091m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private android.widget.EdgeEffect f23092n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private android.widget.EdgeEffect f23093o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private android.widget.EdgeEffect f23094p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private android.widget.EdgeEffect f23095q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    androidx.recyclerview.widget.RecyclerView.m f23096r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f23097s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f23098t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private android.view.VelocityTracker f23099u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f23100v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f23101w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f23102x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f23103y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f23104z0;

    public static class A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.util.SparseArray f23106b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f23117m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f23118n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f23119o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f23120p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23121q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23105a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23107c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23108d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23109e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23110f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f23111g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f23112h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f23113i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f23114j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f23115k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f23116l = false;

        void a(int i6) {
            if ((this.f23109e & i6) != 0) {
                return;
            }
            throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i6) + " but it is " + java.lang.Integer.toBinaryString(this.f23109e));
        }

        public int b() {
            return this.f23112h ? this.f23107c - this.f23108d : this.f23110f;
        }

        public int c() {
            return this.f23105a;
        }

        public boolean d() {
            return this.f23105a != -1;
        }

        public boolean e() {
            return this.f23112h;
        }

        void f(androidx.recyclerview.widget.RecyclerView.h hVar) {
            this.f23109e = 1;
            this.f23110f = hVar.d();
            this.f23112h = false;
            this.f23113i = false;
            this.f23114j = false;
        }

        public boolean g() {
            return this.f23116l;
        }

        public java.lang.String toString() {
            return "State{mTargetPosition=" + this.f23105a + ", mData=" + this.f23106b + ", mItemCount=" + this.f23110f + ", mIsMeasuring=" + this.f23114j + ", mPreviousLayoutItemCount=" + this.f23107c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f23108d + ", mStructureChanged=" + this.f23111g + ", mInPreLayout=" + this.f23112h + ", mRunSimpleAnimations=" + this.f23115k + ", mRunPredictiveAnimations=" + this.f23116l + '}';
        }
    }

    public static abstract class B {
    }

    class C implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f23122C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f23123D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        android.widget.OverScroller f23124E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        android.view.animation.Interpolator f23125F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f23126G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f23127H;

        C() {
            android.view.animation.Interpolator interpolator = androidx.recyclerview.widget.RecyclerView.f23029k1;
            this.f23125F = interpolator;
            this.f23126G = false;
            this.f23127H = false;
            this.f23124E = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i6, int i10) {
            int iAbs = java.lang.Math.abs(i6);
            int iAbs2 = java.lang.Math.abs(i10);
            boolean z6 = iAbs > iAbs2;
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z6) {
                iAbs = iAbs2;
            }
            return java.lang.Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            androidx.recyclerview.widget.RecyclerView.this.removeCallbacks(this);
            androidx.core.view.X.f0(androidx.recyclerview.widget.RecyclerView.this, this);
        }

        public void b(int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.this.setScrollState(2);
            this.f23123D = 0;
            this.f23122C = 0;
            android.view.animation.Interpolator interpolator = this.f23125F;
            android.view.animation.Interpolator interpolator2 = androidx.recyclerview.widget.RecyclerView.f23029k1;
            if (interpolator != interpolator2) {
                this.f23125F = interpolator2;
                this.f23124E = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), interpolator2);
            }
            this.f23124E.fling(0, 0, i6, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f23126G) {
                this.f23127H = true;
            } else {
                c();
            }
        }

        public void e(int i6, int i10, int i11, android.view.animation.Interpolator interpolator) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = a(i6, i10);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = androidx.recyclerview.widget.RecyclerView.f23029k1;
            }
            if (this.f23125F != interpolator) {
                this.f23125F = interpolator;
                this.f23124E = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), interpolator);
            }
            this.f23123D = 0;
            this.f23122C = 0;
            androidx.recyclerview.widget.RecyclerView.this.setScrollState(2);
            this.f23124E.startScroll(0, 0, i6, i10, i12);
            d();
        }

        public void f() {
            androidx.recyclerview.widget.RecyclerView.this.removeCallbacks(this);
            this.f23124E.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i6;
            int i10;
            int i11;
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            if (recyclerView.f23056O == null) {
                f();
                return;
            }
            this.f23127H = false;
            this.f23126G = true;
            recyclerView.u();
            android.widget.OverScroller overScroller = this.f23124E;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f23122C;
                int i13 = currY - this.f23123D;
                this.f23122C = currX;
                this.f23123D = currY;
                androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
                int[] iArr = recyclerView2.f23071V0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = androidx.recyclerview.widget.RecyclerView.this.f23071V0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (androidx.recyclerview.widget.RecyclerView.this.getOverScrollMode() != 2) {
                    androidx.recyclerview.widget.RecyclerView.this.t(i12, i13);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView3 = androidx.recyclerview.widget.RecyclerView.this;
                if (recyclerView3.f23054N != null) {
                    int[] iArr3 = recyclerView3.f23071V0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.g1(i12, i13, iArr3);
                    androidx.recyclerview.widget.RecyclerView recyclerView4 = androidx.recyclerview.widget.RecyclerView.this;
                    int[] iArr4 = recyclerView4.f23071V0;
                    i10 = iArr4[0];
                    i6 = iArr4[1];
                    i12 -= i10;
                    i13 -= i6;
                    androidx.recyclerview.widget.RecyclerView.z zVar = recyclerView4.f23056O.f23179g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = androidx.recyclerview.widget.RecyclerView.this.f23047J0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else {
                            if (zVar.f() >= iB) {
                                zVar.p(iB - 1);
                            }
                            zVar.j(i10, i6);
                        }
                    }
                } else {
                    i6 = 0;
                    i10 = 0;
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.f23060Q.isEmpty()) {
                    androidx.recyclerview.widget.RecyclerView.this.invalidate();
                }
                androidx.recyclerview.widget.RecyclerView recyclerView5 = androidx.recyclerview.widget.RecyclerView.this;
                int[] iArr5 = recyclerView5.f23071V0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i10, i6, i12, i13, null, 1, iArr5);
                androidx.recyclerview.widget.RecyclerView recyclerView6 = androidx.recyclerview.widget.RecyclerView.this;
                int[] iArr6 = recyclerView6.f23071V0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i10 != 0 || i6 != 0) {
                    recyclerView6.I(i10, i6);
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.awakenScrollBars()) {
                    androidx.recyclerview.widget.RecyclerView.this.invalidate();
                }
                boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                androidx.recyclerview.widget.RecyclerView.z zVar2 = androidx.recyclerview.widget.RecyclerView.this.f23056O.f23179g;
                if ((zVar2 == null || !zVar2.g()) && z6) {
                    if (androidx.recyclerview.widget.RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i14 < 0) {
                            i11 = -currVelocity;
                        } else {
                            i11 = i14 > 0 ? currVelocity : 0;
                        }
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        androidx.recyclerview.widget.RecyclerView.this.a(i11, currVelocity);
                    }
                    if (androidx.recyclerview.widget.RecyclerView.f23025g1) {
                        androidx.recyclerview.widget.RecyclerView.this.f23045I0.b();
                    }
                } else {
                    d();
                    androidx.recyclerview.widget.RecyclerView recyclerView7 = androidx.recyclerview.widget.RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f23043H0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i6);
                    }
                }
            }
            androidx.recyclerview.widget.RecyclerView.z zVar3 = androidx.recyclerview.widget.RecyclerView.this.f23056O.f23179g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f23126G = false;
            if (this.f23127H) {
                c();
            } else {
                androidx.recyclerview.widget.RecyclerView.this.setScrollState(0);
                androidx.recyclerview.widget.RecyclerView.this.t1(1);
            }
        }
    }

    public static abstract class D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final java.util.List f23129t = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f23130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.ref.WeakReference f23131b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f23139j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView f23147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.h f23148s;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23132c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23133d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f23134e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23135f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23136g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.D f23137h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.D f23138i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        java.util.List f23140k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        java.util.List f23141l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f23142m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.v f23143n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f23144o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f23145p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23146q = -1;

        public D(android.view.View view) {
            if (view == null) {
                throw new java.lang.IllegalArgumentException("itemView may not be null");
            }
            this.f23130a = view;
        }

        private void g() {
            if (this.f23140k == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.f23140k = arrayList;
                this.f23141l = j$.util.DesugarCollections.unmodifiableList(arrayList);
            }
        }

        void A(int i6, boolean z6) {
            if (this.f23133d == -1) {
                this.f23133d = this.f23132c;
            }
            if (this.f23136g == -1) {
                this.f23136g = this.f23132c;
            }
            if (z6) {
                this.f23136g += i6;
            }
            this.f23132c += i6;
            if (this.f23130a.getLayoutParams() != null) {
                ((androidx.recyclerview.widget.RecyclerView.q) this.f23130a.getLayoutParams()).f23199c = true;
            }
        }

        void B(androidx.recyclerview.widget.RecyclerView recyclerView) {
            int iX = this.f23146q;
            if (iX == -1) {
                iX = androidx.core.view.X.x(this.f23130a);
            }
            this.f23145p = iX;
            recyclerView.j1(this, 4);
        }

        void C(androidx.recyclerview.widget.RecyclerView recyclerView) {
            recyclerView.j1(this, this.f23145p);
            this.f23145p = 0;
        }

        void D() {
            this.f23139j = 0;
            this.f23132c = -1;
            this.f23133d = -1;
            this.f23134e = -1L;
            this.f23136g = -1;
            this.f23142m = 0;
            this.f23137h = null;
            this.f23138i = null;
            d();
            this.f23145p = 0;
            this.f23146q = -1;
            androidx.recyclerview.widget.RecyclerView.r(this);
        }

        void E() {
            if (this.f23133d == -1) {
                this.f23133d = this.f23132c;
            }
        }

        void F(int i6, int i10) {
            this.f23139j = (i6 & i10) | (this.f23139j & (~i10));
        }

        public final void G(boolean z6) {
            int i6;
            int i10 = this.f23142m;
            int i11 = z6 ? i10 - 1 : i10 + 1;
            this.f23142m = i11;
            if (i11 < 0) {
                this.f23142m = 0;
                java.lang.String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
                return;
            }
            if (!z6 && i11 == 1) {
                i6 = this.f23139j | 16;
            } else if (!z6 || i11 != 0) {
                return;
            } else {
                i6 = this.f23139j & (-17);
            }
            this.f23139j = i6;
        }

        void H(androidx.recyclerview.widget.RecyclerView.v vVar, boolean z6) {
            this.f23143n = vVar;
            this.f23144o = z6;
        }

        boolean I() {
            return (this.f23139j & 16) != 0;
        }

        boolean J() {
            return (this.f23139j & 128) != 0;
        }

        void K() {
            this.f23143n.J(this);
        }

        boolean L() {
            return (this.f23139j & 32) != 0;
        }

        void a(java.lang.Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f23139j) == 0) {
                g();
                this.f23140k.add(obj);
            }
        }

        void b(int i6) {
            this.f23139j = i6 | this.f23139j;
        }

        void c() {
            this.f23133d = -1;
            this.f23136g = -1;
        }

        void d() {
            java.util.List list = this.f23140k;
            if (list != null) {
                list.clear();
            }
            this.f23139j &= -1025;
        }

        void e() {
            this.f23139j &= -33;
        }

        void f() {
            this.f23139j &= -257;
        }

        boolean h() {
            return (this.f23139j & 16) == 0 && androidx.core.view.X.O(this.f23130a);
        }

        void i(int i6, int i10, boolean z6) {
            b(8);
            A(i10, z6);
            this.f23132c = i6;
        }

        public final int j() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23147r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f23134e;
        }

        public final int l() {
            return this.f23135f;
        }

        public final int m() {
            int i6 = this.f23136g;
            return i6 == -1 ? this.f23132c : i6;
        }

        public final int n() {
            return this.f23133d;
        }

        java.util.List o() {
            if ((this.f23139j & 1024) != 0) {
                return f23129t;
            }
            java.util.List list = this.f23140k;
            return (list == null || list.size() == 0) ? f23129t : this.f23141l;
        }

        boolean p(int i6) {
            return (i6 & this.f23139j) != 0;
        }

        boolean q() {
            return (this.f23139j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f23130a.getParent() == null || this.f23130a.getParent() == this.f23147r) ? false : true;
        }

        boolean s() {
            return (this.f23139j & 1) != 0;
        }

        boolean t() {
            return (this.f23139j & 4) != 0;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.f23132c + " id=" + this.f23134e + ", oldPos=" + this.f23133d + ", pLpos:" + this.f23136g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f23144o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f23142m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f23130a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f23139j & 16) == 0 && !androidx.core.view.X.O(this.f23130a);
        }

        boolean v() {
            return (this.f23139j & 8) != 0;
        }

        boolean w() {
            return this.f23143n != null;
        }

        boolean x() {
            return (this.f23139j & 256) != 0;
        }

        boolean y() {
            return (this.f23139j & 2) != 0;
        }

        boolean z() {
            return (this.f23139j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC2094a implements java.lang.Runnable {
        RunnableC2094a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            if (!recyclerView.f23072W || recyclerView.isLayoutRequested()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
            if (!recyclerView2.f23066T) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f23081c0) {
                recyclerView2.f23079b0 = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC2095b implements java.lang.Runnable {
        RunnableC2095b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.recyclerview.widget.RecyclerView.m mVar = androidx.recyclerview.widget.RecyclerView.this.f23096r0;
            if (mVar != null) {
                mVar.u();
            }
            androidx.recyclerview.widget.RecyclerView.this.f23059P0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC2096c implements android.view.animation.Interpolator {
        InterpolatorC2096c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f10 = f6 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C2097d implements androidx.recyclerview.widget.p.b {
        C2097d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(androidx.recyclerview.widget.RecyclerView.D d6) {
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            recyclerView.f23056O.q1(d6.f23130a, recyclerView.f23034D);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
            androidx.recyclerview.widget.RecyclerView.this.l(d6, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
            androidx.recyclerview.widget.RecyclerView.this.f23034D.J(d6);
            androidx.recyclerview.widget.RecyclerView.this.n(d6, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
            d6.G(false);
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            boolean z6 = recyclerView.f23087i0;
            androidx.recyclerview.widget.RecyclerView.m mVar = recyclerView.f23096r0;
            if (z6) {
                if (!mVar.b(d6, d6, bVar, bVar2)) {
                    return;
                }
            } else if (!mVar.d(d6, bVar, bVar2)) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.M0();
        }
    }

    class e implements androidx.recyclerview.widget.b.InterfaceC0437b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public android.view.View a(int i6) {
            return androidx.recyclerview.widget.RecyclerView.this.getChildAt(i6);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void b(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0 != null) {
                dF0.B(androidx.recyclerview.widget.RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public int c() {
            return androidx.recyclerview.widget.RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void d() {
            int iC = c();
            for (int i6 = 0; i6 < iC; i6++) {
                android.view.View viewA = a(i6);
                androidx.recyclerview.widget.RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            androidx.recyclerview.widget.RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public int e(android.view.View view) {
            return androidx.recyclerview.widget.RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public androidx.recyclerview.widget.RecyclerView.D f(android.view.View view) {
            return androidx.recyclerview.widget.RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void g(int i6) {
            androidx.recyclerview.widget.RecyclerView.D dF0;
            android.view.View viewA = a(i6);
            if (viewA != null && (dF0 = androidx.recyclerview.widget.RecyclerView.f0(viewA)) != null) {
                if (dF0.x() && !dF0.J()) {
                    throw new java.lang.IllegalArgumentException("called detach on an already detached child " + dF0 + androidx.recyclerview.widget.RecyclerView.this.P());
                }
                dF0.b(256);
            }
            androidx.recyclerview.widget.RecyclerView.this.detachViewFromParent(i6);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void h(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0 != null) {
                dF0.C(androidx.recyclerview.widget.RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void i(android.view.View view, int i6) {
            androidx.recyclerview.widget.RecyclerView.this.addView(view, i6);
            androidx.recyclerview.widget.RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void j(int i6) {
            android.view.View childAt = androidx.recyclerview.widget.RecyclerView.this.getChildAt(i6);
            if (childAt != null) {
                androidx.recyclerview.widget.RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            androidx.recyclerview.widget.RecyclerView.this.removeViewAt(i6);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0437b
        public void k(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0 != null) {
                if (!dF0.x() && !dF0.J()) {
                    throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + dF0 + androidx.recyclerview.widget.RecyclerView.this.P());
                }
                dF0.f();
            }
            androidx.recyclerview.widget.RecyclerView.this.attachViewToParent(view, i6, layoutParams);
        }
    }

    class f implements androidx.recyclerview.widget.a.InterfaceC0436a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void a(int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.this.C0(i6, i10);
            androidx.recyclerview.widget.RecyclerView.this.f23053M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void c(int i6, int i10, java.lang.Object obj) {
            androidx.recyclerview.widget.RecyclerView.this.w1(i6, i10, obj);
            androidx.recyclerview.widget.RecyclerView.this.f23055N0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void d(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public androidx.recyclerview.widget.RecyclerView.D e(int i6) {
            androidx.recyclerview.widget.RecyclerView.D dZ = androidx.recyclerview.widget.RecyclerView.this.Z(i6, true);
            if (dZ == null || androidx.recyclerview.widget.RecyclerView.this.f23040G.n(dZ.f23130a)) {
                return null;
            }
            return dZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void f(int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.this.D0(i6, i10, false);
            androidx.recyclerview.widget.RecyclerView.this.f23053M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void g(int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.this.B0(i6, i10);
            androidx.recyclerview.widget.RecyclerView.this.f23053M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0436a
        public void h(int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.this.D0(i6, i10, true);
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            recyclerView.f23053M0 = true;
            recyclerView.f23047J0.f23108d += i10;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i6 = bVar.f23296a;
            if (i6 == 1) {
                androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView.f23056O.V0(recyclerView, bVar.f23297b, bVar.f23299d);
                return;
            }
            if (i6 == 2) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView2.f23056O.Y0(recyclerView2, bVar.f23297b, bVar.f23299d);
            } else if (i6 == 4) {
                androidx.recyclerview.widget.RecyclerView recyclerView3 = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView3.f23056O.a1(recyclerView3, bVar.f23297b, bVar.f23299d, bVar.f23298c);
            } else {
                if (i6 != 8) {
                    return;
                }
                androidx.recyclerview.widget.RecyclerView recyclerView4 = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView4.f23056O.X0(recyclerView4, bVar.f23297b, bVar.f23299d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23154a;

        static {
            int[] iArr = new int[androidx.recyclerview.widget.RecyclerView.h.a.values().length];
            f23154a = iArr;
            try {
                iArr[androidx.recyclerview.widget.RecyclerView.h.a.PREVENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f23154a[androidx.recyclerview.widget.RecyclerView.h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.recyclerview.widget.RecyclerView.i f23155a = new androidx.recyclerview.widget.RecyclerView.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23156b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.recyclerview.widget.RecyclerView.h.a f23157c = androidx.recyclerview.widget.RecyclerView.h.a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(androidx.recyclerview.widget.RecyclerView.D d6, int i6) {
            boolean z6 = d6.f23148s == null;
            if (z6) {
                d6.f23132c = i6;
                if (h()) {
                    d6.f23134e = e(i6);
                }
                d6.F(1, 519);
                androidx.core.os.s.a("RV OnBindView");
            }
            d6.f23148s = this;
            k(d6, i6, d6.o());
            if (z6) {
                d6.d();
                android.view.ViewGroup.LayoutParams layoutParams = d6.f23130a.getLayoutParams();
                if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.q) {
                    ((androidx.recyclerview.widget.RecyclerView.q) layoutParams).f23199c = true;
                }
                androidx.core.os.s.b();
            }
        }

        boolean b() {
            int i6 = androidx.recyclerview.widget.RecyclerView.g.f23154a[this.f23157c.ordinal()];
            if (i6 != 1) {
                return i6 != 2 || d() > 0;
            }
            return false;
        }

        public final androidx.recyclerview.widget.RecyclerView.D c(android.view.ViewGroup viewGroup, int i6) {
            try {
                androidx.core.os.s.a("RV CreateView");
                androidx.recyclerview.widget.RecyclerView.D dL = l(viewGroup, i6);
                if (dL.f23130a.getParent() != null) {
                    throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                dL.f23135f = i6;
                androidx.core.os.s.b();
                return dL;
            } catch (java.lang.Throwable th) {
                androidx.core.os.s.b();
                throw th;
            }
        }

        public abstract int d();

        public long e(int i6) {
            return -1L;
        }

        public int f(int i6) {
            return 0;
        }

        public final boolean g() {
            return this.f23155a.a();
        }

        public final boolean h() {
            return this.f23156b;
        }

        public void i(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public abstract void j(androidx.recyclerview.widget.RecyclerView.D d6, int i6);

        public void k(androidx.recyclerview.widget.RecyclerView.D d6, int i6, java.util.List list) {
            j(d6, i6);
        }

        public abstract androidx.recyclerview.widget.RecyclerView.D l(android.view.ViewGroup viewGroup, int i6);

        public void m(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public boolean n(androidx.recyclerview.widget.RecyclerView.D d6) {
            return false;
        }

        public void o(androidx.recyclerview.widget.RecyclerView.D d6) {
        }

        public void p(androidx.recyclerview.widget.RecyclerView.D d6) {
        }

        public void q(androidx.recyclerview.widget.RecyclerView.D d6) {
        }

        public void r(androidx.recyclerview.widget.RecyclerView.j jVar) {
            this.f23155a.registerObserver(jVar);
        }

        public void s(boolean z6) {
            if (g()) {
                throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f23156b = z6;
        }

        public void t(androidx.recyclerview.widget.RecyclerView.j jVar) {
            this.f23155a.unregisterObserver(jVar);
        }
    }

    static class i extends android.database.Observable {
        i() {
        }

        public boolean a() {
            return !((android.database.Observable) this).mObservers.isEmpty();
        }
    }

    public static abstract class j {
    }

    public interface k {
    }

    public static class l {
        protected android.widget.EdgeEffect a(androidx.recyclerview.widget.RecyclerView recyclerView, int i6) {
            return new android.widget.EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.recyclerview.widget.RecyclerView.m.a f23162a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.ArrayList f23163b = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f23164c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f23165d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f23166e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f23167f = 250;

        interface a {
            void a(androidx.recyclerview.widget.RecyclerView.D d6);
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f23168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f23169b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f23170c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f23171d;

            public androidx.recyclerview.widget.RecyclerView.m.b a(androidx.recyclerview.widget.RecyclerView.D d6) {
                return b(d6, 0);
            }

            public androidx.recyclerview.widget.RecyclerView.m.b b(androidx.recyclerview.widget.RecyclerView.D d6, int i6) {
                android.view.View view = d6.f23130a;
                this.f23168a = view.getLeft();
                this.f23169b = view.getTop();
                this.f23170c = view.getRight();
                this.f23171d = view.getBottom();
                return this;
            }
        }

        static int e(androidx.recyclerview.widget.RecyclerView.D d6) {
            int i6 = d6.f23139j;
            int i10 = i6 & 14;
            if (d6.t()) {
                return 4;
            }
            if ((i6 & 4) != 0) {
                return i10;
            }
            int iN = d6.n();
            int iJ = d6.j();
            return (iN == -1 || iJ == -1 || iN == iJ) ? i10 : i10 | 2048;
        }

        public abstract boolean a(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);

        public abstract boolean b(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);

        public abstract boolean c(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);

        public abstract boolean d(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);

        public abstract boolean f(androidx.recyclerview.widget.RecyclerView.D d6);

        public boolean g(androidx.recyclerview.widget.RecyclerView.D d6, java.util.List list) {
            return f(d6);
        }

        public final void h(androidx.recyclerview.widget.RecyclerView.D d6) {
            r(d6);
            androidx.recyclerview.widget.RecyclerView.m.a aVar = this.f23162a;
            if (aVar != null) {
                aVar.a(d6);
            }
        }

        public final void i() {
            if (this.f23163b.size() <= 0) {
                this.f23163b.clear();
            } else {
                androidx.appcompat.app.D.a(this.f23163b.get(0));
                throw null;
            }
        }

        public abstract void j(androidx.recyclerview.widget.RecyclerView.D d6);

        public abstract void k();

        public long l() {
            return this.f23164c;
        }

        public long m() {
            return this.f23167f;
        }

        public long n() {
            return this.f23166e;
        }

        public long o() {
            return this.f23165d;
        }

        public abstract boolean p();

        public androidx.recyclerview.widget.RecyclerView.m.b q() {
            return new androidx.recyclerview.widget.RecyclerView.m.b();
        }

        public void r(androidx.recyclerview.widget.RecyclerView.D d6) {
        }

        public androidx.recyclerview.widget.RecyclerView.m.b s(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.D d6) {
            return q().a(d6);
        }

        public androidx.recyclerview.widget.RecyclerView.m.b t(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.D d6, int i6, java.util.List list) {
            return q().a(d6);
        }

        public abstract void u();

        void v(androidx.recyclerview.widget.RecyclerView.m.a aVar) {
            this.f23162a = aVar;
        }
    }

    private class n implements androidx.recyclerview.widget.RecyclerView.m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(androidx.recyclerview.widget.RecyclerView.D d6) {
            d6.G(true);
            if (d6.f23137h != null && d6.f23138i == null) {
                d6.f23137h = null;
            }
            d6.f23138i = null;
            if (d6.I() || androidx.recyclerview.widget.RecyclerView.this.V0(d6.f23130a) || !d6.x()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(d6.f23130a, false);
        }
    }

    public static abstract class o {
        public void d(android.graphics.Rect rect, int i6, androidx.recyclerview.widget.RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6) {
            d(rect, ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void g(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6) {
            f(canvas, recyclerView);
        }

        public void h(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void i(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f23173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView f23174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.recyclerview.widget.o.b f23175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.recyclerview.widget.o.b f23176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.o f23177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.o f23178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.z f23179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f23180h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f23181i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f23182j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f23183k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f23184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f23185m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f23186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f23187o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f23188p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f23189q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f23190r;

        class a implements androidx.recyclerview.widget.o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public android.view.View a(int i6) {
                return androidx.recyclerview.widget.RecyclerView.p.this.N(i6);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.p.this.V(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return androidx.recyclerview.widget.RecyclerView.p.this.i0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return androidx.recyclerview.widget.RecyclerView.p.this.s0() - androidx.recyclerview.widget.RecyclerView.p.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.p.this.Y(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements androidx.recyclerview.widget.o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public android.view.View a(int i6) {
                return androidx.recyclerview.widget.RecyclerView.p.this.N(i6);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.p.this.Z(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return androidx.recyclerview.widget.RecyclerView.p.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return androidx.recyclerview.widget.RecyclerView.p.this.b0() - androidx.recyclerview.widget.RecyclerView.p.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.p.this.T(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i6, int i10);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f23193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f23194b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f23195c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f23196d;
        }

        public p() {
            androidx.recyclerview.widget.RecyclerView.p.a aVar = new androidx.recyclerview.widget.RecyclerView.p.a();
            this.f23175c = aVar;
            androidx.recyclerview.widget.RecyclerView.p.b bVar = new androidx.recyclerview.widget.RecyclerView.p.b();
            this.f23176d = bVar;
            this.f23177e = new androidx.recyclerview.widget.o(aVar);
            this.f23178f = new androidx.recyclerview.widget.o(bVar);
            this.f23180h = false;
            this.f23181i = false;
            this.f23182j = false;
            this.f23183k = true;
            this.f23184l = true;
        }

        private static boolean A0(int i6, int i10, int i11) {
            int mode = android.view.View.MeasureSpec.getMode(i10);
            int size = android.view.View.MeasureSpec.getSize(i10);
            if (i11 > 0 && i6 != i11) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i6;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i6;
            }
            return true;
        }

        private void D(int i6, android.view.View view) {
            this.f23173a.d(i6);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int P(int i6, int i10, int i11, int i12, boolean z6) {
            int iMax = java.lang.Math.max(0, i6 - i11);
            if (z6) {
                if (i12 >= 0) {
                    i10 = 1073741824;
                } else if (i12 != -1 || (i10 != Integer.MIN_VALUE && (i10 == 0 || i10 != 1073741824))) {
                    i10 = 0;
                    i12 = 0;
                } else {
                    i12 = iMax;
                }
            } else if (i12 >= 0) {
                i10 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
            } else if (i12 != -2) {
                i10 = 0;
                i12 = 0;
            } else if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                i12 = iMax;
                i10 = Integer.MIN_VALUE;
            } else {
                i12 = iMax;
                i10 = 0;
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(i12, i10);
        }

        private int[] Q(android.view.View view, android.graphics.Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i6 = left - iI0;
            int iMin = java.lang.Math.min(0, i6);
            int i10 = top - iK0;
            int iMin2 = java.lang.Math.min(0, i10);
            int i11 = iWidth - iS0;
            int iMax = java.lang.Math.max(0, i11);
            int iMax2 = java.lang.Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = java.lang.Math.min(i6, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = java.lang.Math.max(iMin, i11);
            }
            if (iMin2 == 0) {
                iMin2 = java.lang.Math.min(i10, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(android.view.View view, int i6, boolean z6) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (z6 || dF0.v()) {
                this.f23174b.f23042H.b(dF0);
            } else {
                this.f23174b.f23042H.p(dF0);
            }
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            if (dF0.L() || dF0.w()) {
                if (dF0.w()) {
                    dF0.K();
                } else {
                    dF0.e();
                }
                this.f23173a.c(view, i6, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f23174b) {
                int iM = this.f23173a.m(view);
                if (i6 == -1) {
                    i6 = this.f23173a.g();
                }
                if (iM == -1) {
                    throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f23174b.indexOfChild(view) + this.f23174b.P());
                }
                if (iM != i6) {
                    this.f23174b.f23056O.F0(iM, i6);
                }
            } else {
                this.f23173a.a(view, i6, false);
                qVar.f23199c = true;
                androidx.recyclerview.widget.RecyclerView.z zVar = this.f23179g;
                if (zVar != null && zVar.h()) {
                    this.f23179g.k(view);
                }
            }
            if (qVar.f23200d) {
                dF0.f23130a.invalidate();
                qVar.f23200d = false;
            }
        }

        public static androidx.recyclerview.widget.RecyclerView.p.d m0(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.p.d dVar = new androidx.recyclerview.widget.RecyclerView.p.d();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p133n2.c.f51457f, i6, i10);
            dVar.f23193a = typedArrayObtainStyledAttributes.getInt(p133n2.c.f51458g, 1);
            dVar.f23194b = typedArrayObtainStyledAttributes.getInt(p133n2.c.f51468q, 1);
            dVar.f23195c = typedArrayObtainStyledAttributes.getBoolean(p133n2.c.f51467p, false);
            dVar.f23196d = typedArrayObtainStyledAttributes.getBoolean(p133n2.c.f51469r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i6, int i10, int i11) {
            int mode = android.view.View.MeasureSpec.getMode(i6);
            int size = android.view.View.MeasureSpec.getSize(i6);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? java.lang.Math.max(i10, i11) : size;
            }
            return java.lang.Math.min(size, java.lang.Math.max(i10, i11));
        }

        private boolean x0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            android.graphics.Rect rect = this.f23174b.f23048K;
            U(focusedChild, rect);
            return rect.left - i6 < iS0 && rect.right - i6 > iI0 && rect.top - i10 < iB0 && rect.bottom - i10 > iK0;
        }

        private void z1(androidx.recyclerview.widget.RecyclerView.v vVar, int i6, android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0.J()) {
                return;
            }
            if (dF0.t() && !dF0.v() && !this.f23174b.f23054N.h()) {
                u1(i6);
                vVar.C(dF0);
            } else {
                C(i6);
                vVar.D(view);
                this.f23174b.f23042H.k(dF0);
            }
        }

        public abstract int A(androidx.recyclerview.widget.RecyclerView.A a6);

        public abstract int A1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6);

        public void B(androidx.recyclerview.widget.RecyclerView.v vVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(vVar, iO, N(iO));
            }
        }

        public boolean B0() {
            androidx.recyclerview.widget.RecyclerView.z zVar = this.f23179g;
            return zVar != null && zVar.h();
        }

        public abstract void B1(int i6);

        public void C(int i6) {
            D(i6, N(i6));
        }

        public boolean C0(android.view.View view, boolean z6, boolean z10) {
            boolean z11 = this.f23177e.b(view, 24579) && this.f23178f.b(view, 24579);
            return z6 ? z11 : !z11;
        }

        public abstract int C1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6);

        public void D0(android.view.View view, int i6, int i10, int i11, int i12) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            android.graphics.Rect rect = qVar.f23198b;
            view.layout(i6 + rect.left + ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin, i10 + rect.top + ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin, (i11 - rect.right) - ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin, (i12 - rect.bottom) - ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void D1(androidx.recyclerview.widget.RecyclerView recyclerView) {
            E1(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.f23181i = true;
            K0(recyclerView);
        }

        public void E0(android.view.View view, int i6, int i10) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            android.graphics.Rect rectJ0 = this.f23174b.j0(view);
            int i11 = i6 + rectJ0.left + rectJ0.right;
            int i12 = i10 + rectJ0.top + rectJ0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin + i11, ((android.view.ViewGroup.MarginLayoutParams) qVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin + i12, ((android.view.ViewGroup.MarginLayoutParams) qVar).height, q());
            if (J1(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i6, int i10) {
            this.f23189q = android.view.View.MeasureSpec.getSize(i6);
            int mode = android.view.View.MeasureSpec.getMode(i6);
            this.f23187o = mode;
            if (mode == 0 && !androidx.recyclerview.widget.RecyclerView.f23023e1) {
                this.f23189q = 0;
            }
            this.f23190r = android.view.View.MeasureSpec.getSize(i10);
            int mode2 = android.view.View.MeasureSpec.getMode(i10);
            this.f23188p = mode2;
            if (mode2 != 0 || androidx.recyclerview.widget.RecyclerView.f23023e1) {
                return;
            }
            this.f23190r = 0;
        }

        void F(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.v vVar) {
            this.f23181i = false;
            M0(recyclerView, vVar);
        }

        public void F0(int i6, int i10) {
            android.view.View viewN = N(i6);
            if (viewN != null) {
                C(i6);
                m(viewN, i10);
            } else {
                throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + i6 + this.f23174b.toString());
            }
        }

        public void F1(int i6, int i10) {
            this.f23174b.setMeasuredDimension(i6, i10);
        }

        public android.view.View G(android.view.View view) {
            android.view.View viewR;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f23173a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void G0(int i6) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                recyclerView.z0(i6);
            }
        }

        public void G1(android.graphics.Rect rect, int i6, int i10) {
            F1(s(i6, rect.width() + i0() + j0(), g0()), s(i10, rect.height() + k0() + h0(), f0()));
        }

        public android.view.View H(int i6) {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                android.view.View viewN = N(i10);
                androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(viewN);
                if (dF0 != null && dF0.m() == i6 && !dF0.J() && (this.f23174b.f23047J0.e() || !dF0.v())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i6) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                recyclerView.A0(i6);
            }
        }

        void H1(int i6, int i10) {
            int iO = O();
            if (iO == 0) {
                this.f23174b.w(i6, i10);
                return;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < iO; i15++) {
                android.view.View viewN = N(i15);
                android.graphics.Rect rect = this.f23174b.f23048K;
                U(viewN, rect);
                int i16 = rect.left;
                if (i16 < i14) {
                    i14 = i16;
                }
                int i17 = rect.right;
                if (i17 > i11) {
                    i11 = i17;
                }
                int i18 = rect.top;
                if (i18 < i12) {
                    i12 = i18;
                }
                int i19 = rect.bottom;
                if (i19 > i13) {
                    i13 = i19;
                }
            }
            this.f23174b.f23048K.set(i14, i12, i11, i13);
            G1(this.f23174b.f23048K, i6, i10);
        }

        public abstract androidx.recyclerview.widget.RecyclerView.q I();

        public void I0(androidx.recyclerview.widget.RecyclerView.h hVar, androidx.recyclerview.widget.RecyclerView.h hVar2) {
        }

        void I1(androidx.recyclerview.widget.RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f23174b = null;
                this.f23173a = null;
                height = 0;
                this.f23189q = 0;
            } else {
                this.f23174b = recyclerView;
                this.f23173a = recyclerView.f23040G;
                this.f23189q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f23190r = height;
            this.f23187o = 1073741824;
            this.f23188p = 1073741824;
        }

        public androidx.recyclerview.widget.RecyclerView.q J(android.content.Context context, android.util.AttributeSet attributeSet) {
            return new androidx.recyclerview.widget.RecyclerView.q(context, attributeSet);
        }

        public boolean J0(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.ArrayList arrayList, int i6, int i10) {
            return false;
        }

        boolean J1(android.view.View view, int i6, int i10, androidx.recyclerview.widget.RecyclerView.q qVar) {
            return (!view.isLayoutRequested() && this.f23183k && A0(view.getWidth(), i6, ((android.view.ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getHeight(), i10, ((android.view.ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public androidx.recyclerview.widget.RecyclerView.q K(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.q) {
                return new androidx.recyclerview.widget.RecyclerView.q((androidx.recyclerview.widget.RecyclerView.q) layoutParams);
            }
            return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.recyclerview.widget.RecyclerView.q((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.recyclerview.widget.RecyclerView.q(layoutParams);
        }

        public void K0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        public void L0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        boolean L1(android.view.View view, int i6, int i10, androidx.recyclerview.widget.RecyclerView.q qVar) {
            return (this.f23183k && A0(view.getMeasuredWidth(), i6, ((android.view.ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getMeasuredHeight(), i10, ((android.view.ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b.bottom;
        }

        public void M0(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.v vVar) {
            L0(recyclerView);
        }

        public abstract void M1(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6, int i6);

        public android.view.View N(int i6) {
            androidx.recyclerview.widget.b bVar = this.f23173a;
            if (bVar != null) {
                return bVar.f(i6);
            }
            return null;
        }

        public abstract android.view.View N0(android.view.View view, int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6);

        public void N1(androidx.recyclerview.widget.RecyclerView.z zVar) {
            androidx.recyclerview.widget.RecyclerView.z zVar2 = this.f23179g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f23179g.r();
            }
            this.f23179g = zVar;
            zVar.q(this.f23174b, this);
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f23173a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            P0(recyclerView.f23034D, recyclerView.f23047J0, accessibilityEvent);
        }

        void O1() {
            androidx.recyclerview.widget.RecyclerView.z zVar = this.f23179g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void P0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f23174b.canScrollVertically(-1) && !this.f23174b.canScrollHorizontally(-1) && !this.f23174b.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            androidx.recyclerview.widget.RecyclerView.h hVar = this.f23174b.f23054N;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.d());
            }
        }

        public boolean P1() {
            return false;
        }

        void Q0(C1.B b6) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            R0(recyclerView.f23034D, recyclerView.f23047J0, b6);
        }

        public boolean R() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            return recyclerView != null && recyclerView.f23044I;
        }

        public void R0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, C1.B b6) {
            if (this.f23174b.canScrollVertically(-1) || this.f23174b.canScrollHorizontally(-1)) {
                b6.a(8192);
                b6.N0(true);
            }
            if (this.f23174b.canScrollVertically(1) || this.f23174b.canScrollHorizontally(1)) {
                b6.a(4096);
                b6.N0(true);
            }
            b6.o0(C1.B.e.a(o0(vVar, a6), S(vVar, a6), z0(vVar, a6), p0(vVar, a6)));
        }

        public int S(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
            return -1;
        }

        void S0(android.view.View view, C1.B b6) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0 == null || dF0.v() || this.f23173a.n(dF0.f23130a)) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            T0(recyclerView.f23034D, recyclerView.f23047J0, view, b6);
        }

        public int T(android.view.View view) {
            return view.getBottom() + M(view);
        }

        public void T0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, android.view.View view, C1.B b6) {
        }

        public void U(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView.g0(view, rect);
        }

        public android.view.View U0(android.view.View view, int i6) {
            return null;
        }

        public int V(android.view.View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        }

        public int W(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public int X(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10, int i11) {
        }

        public int Y(android.view.View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        }

        public int Z(android.view.View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        }

        public int a() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            androidx.recyclerview.widget.RecyclerView.h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.d();
            }
            return 0;
        }

        public android.view.View a0() {
            android.view.View focusedChild;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f23173a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10, java.lang.Object obj) {
            Z0(recyclerView, i6, i10);
        }

        public int b0() {
            return this.f23190r;
        }

        public abstract void b1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6);

        public int c0() {
            return this.f23188p;
        }

        public void c1(androidx.recyclerview.widget.RecyclerView.A a6) {
        }

        public int d0() {
            return androidx.core.view.X.z(this.f23174b);
        }

        public void d1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6, int i10) {
            this.f23174b.w(i6, i10);
        }

        public int e0(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b.left;
        }

        public boolean e1(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.view.View view2) {
            return B0() || recyclerView.t0();
        }

        public int f0() {
            return androidx.core.view.X.A(this.f23174b);
        }

        public boolean f1(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6, android.view.View view, android.view.View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(android.view.View view) {
            h(view, -1);
        }

        public int g0() {
            return androidx.core.view.X.B(this.f23174b);
        }

        public void g1(android.os.Parcelable parcelable) {
        }

        public void h(android.view.View view, int i6) {
            k(view, i6, true);
        }

        public int h0() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public android.os.Parcelable h1() {
            return null;
        }

        public void i(android.view.View view) {
            j(view, -1);
        }

        public int i0() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i6) {
        }

        public void j(android.view.View view, int i6) {
            k(view, i6, false);
        }

        public int j0() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(androidx.recyclerview.widget.RecyclerView.z zVar) {
            if (this.f23179g == zVar) {
                this.f23179g = null;
            }
        }

        public int k0() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i6, android.os.Bundle bundle) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            return l1(recyclerView.f23034D, recyclerView.f23047J0, i6, bundle);
        }

        public void l(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int l0(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).a();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0044 A[PHI: r8
  0x0044: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:24:0x0063, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean l1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6, android.os.Bundle bundle) {
            int iB0;
            int iS0;
            int i10;
            int i11;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView == null) {
                return false;
            }
            if (i6 == 4096) {
                iB0 = recyclerView.canScrollVertically(1) ? (b0() - k0()) - h0() : 0;
                if (this.f23174b.canScrollHorizontally(1)) {
                    iS0 = (s0() - i0()) - j0();
                    i10 = iB0;
                    i11 = iS0;
                } else {
                    i10 = iB0;
                    i11 = 0;
                }
            } else if (i6 != 8192) {
                i11 = 0;
                i10 = 0;
            } else {
                iB0 = recyclerView.canScrollVertically(-1) ? -((b0() - k0()) - h0()) : 0;
                if (this.f23174b.canScrollHorizontally(-1)) {
                    iS0 = -((s0() - i0()) - j0());
                    i10 = iB0;
                    i11 = iS0;
                } else {
                    i10 = iB0;
                    i11 = 0;
                }
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            this.f23174b.o1(i11, i10, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void m(android.view.View view, int i6) {
            n(view, i6, (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams());
        }

        boolean m1(android.view.View view, int i6, android.os.Bundle bundle) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            return n1(recyclerView.f23034D, recyclerView.f23047J0, view, i6, bundle);
        }

        public void n(android.view.View view, int i6, androidx.recyclerview.widget.RecyclerView.q qVar) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0.v()) {
                this.f23174b.f23042H.b(dF0);
            } else {
                this.f23174b.f23042H.p(dF0);
            }
            this.f23173a.c(view, i6, qVar, dF0.v());
        }

        public int n0(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b.right;
        }

        public boolean n1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, android.view.View view, int i6, android.os.Bundle bundle) {
            return false;
        }

        public void o(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int o0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
            return -1;
        }

        public void o1(androidx.recyclerview.widget.RecyclerView.v vVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!androidx.recyclerview.widget.RecyclerView.f0(N(iO)).J()) {
                    r1(iO, vVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
            return 0;
        }

        void p1(androidx.recyclerview.widget.RecyclerView.v vVar) {
            int iJ = vVar.j();
            for (int i6 = iJ - 1; i6 >= 0; i6--) {
                android.view.View viewN = vVar.n(i6);
                androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(viewN);
                if (!dF0.J()) {
                    dF0.G(false);
                    if (dF0.x()) {
                        this.f23174b.removeDetachedView(viewN, false);
                    }
                    androidx.recyclerview.widget.RecyclerView.m mVar = this.f23174b.f23096r0;
                    if (mVar != null) {
                        mVar.j(dF0);
                    }
                    dF0.G(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.f23174b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b.top;
        }

        public void q1(android.view.View view, androidx.recyclerview.widget.RecyclerView.v vVar) {
            t1(view);
            vVar.B(view);
        }

        public boolean r(androidx.recyclerview.widget.RecyclerView.q qVar) {
            return qVar != null;
        }

        public void r0(android.view.View view, boolean z6, android.graphics.Rect rect) {
            android.graphics.Matrix matrix;
            if (z6) {
                android.graphics.Rect rect2 = ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23198b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f23174b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                android.graphics.RectF rectF = this.f23174b.f23052M;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar) {
            android.view.View viewN = N(i6);
            u1(i6);
            vVar.B(viewN);
        }

        public int s0() {
            return this.f23189q;
        }

        public boolean s1(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void t(int i6, int i10, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.p.c cVar) {
        }

        public int t0() {
            return this.f23187o;
        }

        public void t1(android.view.View view) {
            this.f23173a.p(view);
        }

        public void u(int i6, androidx.recyclerview.widget.RecyclerView.p.c cVar) {
        }

        boolean u0() {
            int iO = O();
            for (int i6 = 0; i6 < iO; i6++) {
                android.view.ViewGroup.LayoutParams layoutParams = N(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i6) {
            if (N(i6) != null) {
                this.f23173a.q(i6);
            }
        }

        public abstract int v(androidx.recyclerview.widget.RecyclerView.A a6);

        public boolean v0() {
            return this.f23181i;
        }

        public boolean v1(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z6) {
            return w1(recyclerView, view, rect, z6, false);
        }

        public abstract int w(androidx.recyclerview.widget.RecyclerView.A a6);

        public abstract boolean w0();

        public boolean w1(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z6, boolean z10) {
            int[] iArrQ = Q(view, rect);
            int i6 = iArrQ[0];
            int i10 = iArrQ[1];
            if ((z10 && !x0(recyclerView, i6, i10)) || (i6 == 0 && i10 == 0)) {
                return false;
            }
            if (z6) {
                recyclerView.scrollBy(i6, i10);
            } else {
                recyclerView.l1(i6, i10);
            }
            return true;
        }

        public abstract int x(androidx.recyclerview.widget.RecyclerView.A a6);

        public void x1() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23174b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(androidx.recyclerview.widget.RecyclerView.A a6);

        public final boolean y0() {
            return this.f23184l;
        }

        public void y1() {
            this.f23180h = true;
        }

        public abstract int z(androidx.recyclerview.widget.RecyclerView.A a6);

        public boolean z0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
            return false;
        }
    }

    public static class q extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.D f23197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.graphics.Rect f23198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f23200d;

        public q(int i6, int i10) {
            super(i6, i10);
            this.f23198b = new android.graphics.Rect();
            this.f23199c = true;
            this.f23200d = false;
        }

        public q(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23198b = new android.graphics.Rect();
            this.f23199c = true;
            this.f23200d = false;
        }

        public q(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23198b = new android.graphics.Rect();
            this.f23199c = true;
            this.f23200d = false;
        }

        public q(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f23198b = new android.graphics.Rect();
            this.f23199c = true;
            this.f23200d = false;
        }

        public q(androidx.recyclerview.widget.RecyclerView.q qVar) {
            super((android.view.ViewGroup.LayoutParams) qVar);
            this.f23198b = new android.graphics.Rect();
            this.f23199c = true;
            this.f23200d = false;
        }

        public int a() {
            return this.f23197a.m();
        }

        public boolean b() {
            return this.f23197a.y();
        }

        public boolean c() {
            return this.f23197a.v();
        }

        public boolean d() {
            return this.f23197a.t();
        }
    }

    public static abstract class r {
        public abstract boolean a(int i6, int i10);
    }

    public interface s {
        void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent);

        boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent);

        void c(boolean z6);
    }

    public static abstract class t {
        public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i6) {
        }

        public abstract void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10);
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.util.SparseArray f23201a = new android.util.SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23202b = 0;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final java.util.ArrayList f23203a = new java.util.ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f23204b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f23205c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f23206d = 0;

            a() {
            }
        }

        private androidx.recyclerview.widget.RecyclerView.u.a g(int i6) {
            androidx.recyclerview.widget.RecyclerView.u.a aVar = (androidx.recyclerview.widget.RecyclerView.u.a) this.f23201a.get(i6);
            if (aVar != null) {
                return aVar;
            }
            androidx.recyclerview.widget.RecyclerView.u.a aVar2 = new androidx.recyclerview.widget.RecyclerView.u.a();
            this.f23201a.put(i6, aVar2);
            return aVar2;
        }

        void a() {
            this.f23202b++;
        }

        public void b() {
            for (int i6 = 0; i6 < this.f23201a.size(); i6++) {
                ((androidx.recyclerview.widget.RecyclerView.u.a) this.f23201a.valueAt(i6)).f23203a.clear();
            }
        }

        void c() {
            this.f23202b--;
        }

        void d(int i6, long j6) {
            androidx.recyclerview.widget.RecyclerView.u.a aVarG = g(i6);
            aVarG.f23206d = j(aVarG.f23206d, j6);
        }

        void e(int i6, long j6) {
            androidx.recyclerview.widget.RecyclerView.u.a aVarG = g(i6);
            aVarG.f23205c = j(aVarG.f23205c, j6);
        }

        public androidx.recyclerview.widget.RecyclerView.D f(int i6) {
            androidx.recyclerview.widget.RecyclerView.u.a aVar = (androidx.recyclerview.widget.RecyclerView.u.a) this.f23201a.get(i6);
            if (aVar == null || aVar.f23203a.isEmpty()) {
                return null;
            }
            java.util.ArrayList arrayList = aVar.f23203a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((androidx.recyclerview.widget.RecyclerView.D) arrayList.get(size)).r()) {
                    return (androidx.recyclerview.widget.RecyclerView.D) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(androidx.recyclerview.widget.RecyclerView.h hVar, androidx.recyclerview.widget.RecyclerView.h hVar2, boolean z6) {
            if (hVar != null) {
                c();
            }
            if (!z6 && this.f23202b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(androidx.recyclerview.widget.RecyclerView.D d6) {
            int iL = d6.l();
            java.util.ArrayList arrayList = g(iL).f23203a;
            if (((androidx.recyclerview.widget.RecyclerView.u.a) this.f23201a.get(iL)).f23204b <= arrayList.size()) {
                return;
            }
            d6.D();
            arrayList.add(d6);
        }

        long j(long j6, long j10) {
            return j6 == 0 ? j10 : ((j6 / 4) * 3) + (j10 / 4);
        }

        boolean k(int i6, long j6, long j10) {
            long j11 = g(i6).f23206d;
            return j11 == 0 || j6 + j11 < j10;
        }

        boolean l(int i6, long j6, long j10) {
            long j11 = g(i6).f23205c;
            return j11 == 0 || j6 + j11 < j10;
        }
    }

    public final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.ArrayList f23207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.util.ArrayList f23208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.util.ArrayList f23209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f23210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.u f23213g;

        public v() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f23207a = arrayList;
            this.f23208b = null;
            this.f23209c = new java.util.ArrayList();
            this.f23210d = j$.util.DesugarCollections.unmodifiableList(arrayList);
            this.f23211e = 2;
            this.f23212f = 2;
        }

        private boolean H(androidx.recyclerview.widget.RecyclerView.D d6, int i6, int i10, long j6) {
            d6.f23148s = null;
            d6.f23147r = androidx.recyclerview.widget.RecyclerView.this;
            int iL = d6.l();
            long nanoTime = androidx.recyclerview.widget.RecyclerView.this.getNanoTime();
            if (j6 != Long.MAX_VALUE && !this.f23213g.k(iL, nanoTime, j6)) {
                return false;
            }
            androidx.recyclerview.widget.RecyclerView.this.f23054N.a(d6, i6);
            this.f23213g.d(d6.l(), androidx.recyclerview.widget.RecyclerView.this.getNanoTime() - nanoTime);
            b(d6);
            if (!androidx.recyclerview.widget.RecyclerView.this.f23047J0.e()) {
                return true;
            }
            d6.f23136g = i10;
            return true;
        }

        private void b(androidx.recyclerview.widget.RecyclerView.D d6) {
            if (androidx.recyclerview.widget.RecyclerView.this.s0()) {
                android.view.View view = d6.f23130a;
                if (androidx.core.view.X.x(view) == 0) {
                    androidx.core.view.X.w0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = androidx.recyclerview.widget.RecyclerView.this.f23061Q0;
                if (kVar == null) {
                    return;
                }
                androidx.core.view.C1990a c1990aN = kVar.n();
                if (c1990aN instanceof androidx.recyclerview.widget.k.a) {
                    ((androidx.recyclerview.widget.k.a) c1990aN).o(view);
                }
                androidx.core.view.X.n0(view, c1990aN);
            }
        }

        private void q(android.view.ViewGroup viewGroup, boolean z6) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof android.view.ViewGroup) {
                    q((android.view.ViewGroup) childAt, true);
                }
            }
            if (z6) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(androidx.recyclerview.widget.RecyclerView.D d6) {
            android.view.View view = d6.f23130a;
            if (view instanceof android.view.ViewGroup) {
                q((android.view.ViewGroup) view, false);
            }
        }

        void A(int i6) {
            a((androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i6), true);
            this.f23209c.remove(i6);
        }

        public void B(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (dF0.x()) {
                androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(view, false);
            }
            if (dF0.w()) {
                dF0.K();
            } else if (dF0.L()) {
                dF0.e();
            }
            C(dF0);
            if (androidx.recyclerview.widget.RecyclerView.this.f23096r0 == null || dF0.u()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.f23096r0.j(dF0);
        }

        void C(androidx.recyclerview.widget.RecyclerView.D d6) {
            boolean z6;
            boolean z10 = false;
            boolean z11 = true;
            if (d6.w() || d6.f23130a.getParent() != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d6.w());
                sb.append(" isAttached:");
                sb.append(d6.f23130a.getParent() != null);
                sb.append(androidx.recyclerview.widget.RecyclerView.this.P());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (d6.x()) {
                throw new java.lang.IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d6 + androidx.recyclerview.widget.RecyclerView.this.P());
            }
            if (d6.J()) {
                throw new java.lang.IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + androidx.recyclerview.widget.RecyclerView.this.P());
            }
            boolean zH = d6.h();
            androidx.recyclerview.widget.RecyclerView.h hVar = androidx.recyclerview.widget.RecyclerView.this.f23054N;
            if ((hVar != null && zH && hVar.n(d6)) || d6.u()) {
                if (this.f23212f <= 0 || d6.p(526)) {
                    z6 = false;
                } else {
                    int size = this.f23209c.size();
                    if (size >= this.f23212f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (androidx.recyclerview.widget.RecyclerView.f23025g1 && size > 0 && !androidx.recyclerview.widget.RecyclerView.this.f23045I0.d(d6.f23132c)) {
                        int i6 = size - 1;
                        while (i6 >= 0) {
                            if (!androidx.recyclerview.widget.RecyclerView.this.f23045I0.d(((androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i6)).f23132c)) {
                                break;
                            } else {
                                i6--;
                            }
                        }
                        size = i6 + 1;
                    }
                    this.f23209c.add(size, d6);
                    z6 = true;
                }
                if (z6) {
                    z11 = false;
                } else {
                    a(d6, true);
                }
                z10 = z6;
            } else {
                z11 = false;
            }
            androidx.recyclerview.widget.RecyclerView.this.f23042H.q(d6);
            if (z10 || z11 || !zH) {
                return;
            }
            d6.f23148s = null;
            d6.f23147r = null;
        }

        void D(android.view.View view) {
            java.util.ArrayList arrayList;
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            if (!dF0.p(12) && dF0.y() && !androidx.recyclerview.widget.RecyclerView.this.p(dF0)) {
                if (this.f23208b == null) {
                    this.f23208b = new java.util.ArrayList();
                }
                dF0.H(this, true);
                arrayList = this.f23208b;
            } else {
                if (dF0.t() && !dF0.v() && !androidx.recyclerview.widget.RecyclerView.this.f23054N.h()) {
                    throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + androidx.recyclerview.widget.RecyclerView.this.P());
                }
                dF0.H(this, false);
                arrayList = this.f23207a;
            }
            arrayList.add(dF0);
        }

        void E(androidx.recyclerview.widget.RecyclerView.u uVar) {
            androidx.recyclerview.widget.RecyclerView.u uVar2 = this.f23213g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f23213g = uVar;
            if (uVar == null || androidx.recyclerview.widget.RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f23213g.a();
        }

        void F(androidx.recyclerview.widget.RecyclerView.B b6) {
        }

        public void G(int i6) {
            this.f23211e = i6;
            K();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:58:0x00f5 A[PHI: r1 r4
  0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$D) = (r1v11 androidx.recyclerview.widget.RecyclerView$D), (r1v30 androidx.recyclerview.widget.RecyclerView$D) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:68:0x014e  */
        /* JADX WARN: Code duplicated, block: B:74:0x017a  */
        /* JADX WARN: Code duplicated, block: B:76:0x0180  */
        /* JADX WARN: Code duplicated, block: B:85:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:93:0x01cd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
        androidx.recyclerview.widget.RecyclerView.D I(int i6, boolean z6, long j6) {
            androidx.recyclerview.widget.RecyclerView.D dL;
            boolean z10;
            androidx.recyclerview.widget.RecyclerView.D d6;
            boolean z11;
            boolean zH;
            android.view.ViewGroup.LayoutParams layoutParams;
            androidx.recyclerview.widget.RecyclerView.q qVar;
            android.view.ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
            int iM;
            androidx.recyclerview.widget.RecyclerView recyclerViewV;
            if (i6 < 0 || i6 >= androidx.recyclerview.widget.RecyclerView.this.f23047J0.b()) {
                throw new java.lang.IndexOutOfBoundsException("Invalid item position " + i6 + "(" + i6 + "). Item count:" + androidx.recyclerview.widget.RecyclerView.this.f23047J0.b() + androidx.recyclerview.widget.RecyclerView.this.P());
            }
            if (androidx.recyclerview.widget.RecyclerView.this.f23047J0.e()) {
                dL = h(i6);
                if (dL != null) {
                    z10 = true;
                }
                if (dL == null && (dL = m(i6, z6)) != null) {
                    if (L(dL)) {
                        z10 = true;
                    } else {
                        if (!z6) {
                            dL.b(4);
                            if (dL.w()) {
                                androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(dL.f23130a, false);
                                dL.K();
                            } else if (dL.L()) {
                                dL.e();
                            }
                            C(dL);
                        }
                        dL = null;
                    }
                }
                if (dL == null) {
                    d6 = dL;
                } else {
                    iM = androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6);
                    if (iM >= 0 || iM >= androidx.recyclerview.widget.RecyclerView.this.f23054N.d()) {
                        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i6 + "(offset:" + iM + ").state:" + androidx.recyclerview.widget.RecyclerView.this.f23047J0.b() + androidx.recyclerview.widget.RecyclerView.this.P());
                    }
                    int iF = androidx.recyclerview.widget.RecyclerView.this.f23054N.f(iM);
                    if (androidx.recyclerview.widget.RecyclerView.this.f23054N.h() && (dL = l(androidx.recyclerview.widget.RecyclerView.this.f23054N.e(iM), iF, z6)) != null) {
                        dL.f23132c = iM;
                        z10 = true;
                    }
                    if (dL == null) {
                        androidx.recyclerview.widget.RecyclerView.D dF = i().f(iF);
                        if (dF != null) {
                            dF.D();
                            if (androidx.recyclerview.widget.RecyclerView.f23022d1) {
                                r(dF);
                            }
                        }
                        dL = dF;
                    }
                    if (dL == null) {
                        long nanoTime = androidx.recyclerview.widget.RecyclerView.this.getNanoTime();
                        if (j6 != Long.MAX_VALUE && !this.f23213g.l(iF, nanoTime, j6)) {
                            return null;
                        }
                        androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                        androidx.recyclerview.widget.RecyclerView.D dC = recyclerView.f23054N.c(recyclerView, iF);
                        if (androidx.recyclerview.widget.RecyclerView.f23025g1 && (recyclerViewV = androidx.recyclerview.widget.RecyclerView.V(dC.f23130a)) != null) {
                            dC.f23131b = new java.lang.ref.WeakReference(recyclerViewV);
                        }
                        this.f23213g.e(iF, androidx.recyclerview.widget.RecyclerView.this.getNanoTime() - nanoTime);
                        d6 = dC;
                    } else {
                        d6 = dL;
                    }
                }
                z11 = z10;
                if (z11 && !androidx.recyclerview.widget.RecyclerView.this.f23047J0.e() && d6.p(8192)) {
                    d6.F(0, 8192);
                    if (androidx.recyclerview.widget.RecyclerView.this.f23047J0.f23115k) {
                        int iE = androidx.recyclerview.widget.RecyclerView.m.e(d6) | 4096;
                        androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
                        androidx.recyclerview.widget.RecyclerView.this.R0(d6, recyclerView2.f23096r0.t(recyclerView2.f23047J0, d6, iE, d6.o()));
                    }
                }
                if (androidx.recyclerview.widget.RecyclerView.this.f23047J0.e() || !d6.s()) {
                    if (d6.s() || d6.z() || d6.t()) {
                        zH = H(d6, androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6), i6, j6);
                    }
                    layoutParams = d6.f23130a.getLayoutParams();
                    if (layoutParams != null) {
                        if (androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                            qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParams;
                        } else {
                            layoutParamsGenerateLayoutParams = androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                        }
                        qVar.f23197a = d6;
                        qVar.f23200d = !z11 && zH;
                        return d6;
                    }
                    layoutParamsGenerateLayoutParams = androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                    qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParamsGenerateLayoutParams;
                    d6.f23130a.setLayoutParams(qVar);
                    qVar.f23197a = d6;
                    qVar.f23200d = !z11 && zH;
                    return d6;
                }
                d6.f23136g = i6;
                zH = false;
                layoutParams = d6.f23130a.getLayoutParams();
                if (layoutParams != null) {
                    if (androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                    } else {
                        qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParams;
                    }
                    qVar.f23197a = d6;
                    qVar.f23200d = !z11 && zH;
                    return d6;
                }
                layoutParamsGenerateLayoutParams = androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParamsGenerateLayoutParams;
                d6.f23130a.setLayoutParams(qVar);
                qVar.f23197a = d6;
                qVar.f23200d = !z11 && zH;
                return d6;
            }
            dL = null;
            z10 = false;
            if (dL == null) {
                if (L(dL)) {
                    if (!z6) {
                        dL.b(4);
                        if (dL.w()) {
                            androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(dL.f23130a, false);
                            dL.K();
                        } else if (dL.L()) {
                            dL.e();
                        }
                        C(dL);
                    }
                    dL = null;
                } else {
                    z10 = true;
                }
            }
            if (dL == null) {
                iM = androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6);
                if (iM >= 0) {
                }
                throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i6 + "(offset:" + iM + ").state:" + androidx.recyclerview.widget.RecyclerView.this.f23047J0.b() + androidx.recyclerview.widget.RecyclerView.this.P());
            }
            d6 = dL;
            z11 = z10;
            if (z11) {
                d6.F(0, 8192);
                if (androidx.recyclerview.widget.RecyclerView.this.f23047J0.f23115k) {
                    int iE2 = androidx.recyclerview.widget.RecyclerView.m.e(d6) | 4096;
                    androidx.recyclerview.widget.RecyclerView recyclerView3 = androidx.recyclerview.widget.RecyclerView.this;
                    androidx.recyclerview.widget.RecyclerView.this.R0(d6, recyclerView3.f23096r0.t(recyclerView3.f23047J0, d6, iE2, d6.o()));
                }
            }
            if (androidx.recyclerview.widget.RecyclerView.this.f23047J0.e()) {
                if (d6.s()) {
                }
                zH = H(d6, androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6), i6, j6);
            } else {
                if (d6.s()) {
                }
                zH = H(d6, androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6), i6, j6);
            }
            layoutParams = d6.f23130a.getLayoutParams();
            if (layoutParams != null) {
                if (androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParamsGenerateLayoutParams = androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                } else {
                    qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParams;
                }
                qVar.f23197a = d6;
                qVar.f23200d = !z11 && zH;
                return d6;
            }
            layoutParamsGenerateLayoutParams = androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
            qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParamsGenerateLayoutParams;
            d6.f23130a.setLayoutParams(qVar);
            qVar.f23197a = d6;
            qVar.f23200d = !z11 && zH;
            return d6;
        }

        void J(androidx.recyclerview.widget.RecyclerView.D d6) {
            (d6.f23144o ? this.f23208b : this.f23207a).remove(d6);
            d6.f23143n = null;
            d6.f23144o = false;
            d6.e();
        }

        void K() {
            androidx.recyclerview.widget.RecyclerView.p pVar = androidx.recyclerview.widget.RecyclerView.this.f23056O;
            this.f23212f = this.f23211e + (pVar != null ? pVar.f23185m : 0);
            for (int size = this.f23209c.size() - 1; size >= 0 && this.f23209c.size() > this.f23212f; size--) {
                A(size);
            }
        }

        boolean L(androidx.recyclerview.widget.RecyclerView.D d6) {
            if (d6.v()) {
                return androidx.recyclerview.widget.RecyclerView.this.f23047J0.e();
            }
            int i6 = d6.f23132c;
            if (i6 >= 0 && i6 < androidx.recyclerview.widget.RecyclerView.this.f23054N.d()) {
                if (androidx.recyclerview.widget.RecyclerView.this.f23047J0.e() || androidx.recyclerview.widget.RecyclerView.this.f23054N.f(d6.f23132c) == d6.l()) {
                    return !androidx.recyclerview.widget.RecyclerView.this.f23054N.h() || d6.k() == androidx.recyclerview.widget.RecyclerView.this.f23054N.e(d6.f23132c);
                }
                return false;
            }
            throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d6 + androidx.recyclerview.widget.RecyclerView.this.P());
        }

        void M(int i6, int i10) {
            int i11;
            int i12 = i10 + i6;
            for (int size = this.f23209c.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(size);
                if (d6 != null && (i11 = d6.f23132c) >= i6 && i11 < i12) {
                    d6.b(2);
                    A(size);
                }
            }
        }

        void a(androidx.recyclerview.widget.RecyclerView.D d6, boolean z6) {
            androidx.recyclerview.widget.RecyclerView.r(d6);
            android.view.View view = d6.f23130a;
            androidx.recyclerview.widget.k kVar = androidx.recyclerview.widget.RecyclerView.this.f23061Q0;
            if (kVar != null) {
                androidx.core.view.C1990a c1990aN = kVar.n();
                androidx.core.view.X.n0(view, c1990aN instanceof androidx.recyclerview.widget.k.a ? ((androidx.recyclerview.widget.k.a) c1990aN).n(view) : null);
            }
            if (z6) {
                g(d6);
            }
            d6.f23148s = null;
            d6.f23147r = null;
            i().i(d6);
        }

        public void c() {
            this.f23207a.clear();
            z();
        }

        void d() {
            int size = this.f23209c.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i6)).c();
            }
            int size2 = this.f23207a.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((androidx.recyclerview.widget.RecyclerView.D) this.f23207a.get(i10)).c();
            }
            java.util.ArrayList arrayList = this.f23208b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((androidx.recyclerview.widget.RecyclerView.D) this.f23208b.get(i11)).c();
                }
            }
        }

        void e() {
            this.f23207a.clear();
            java.util.ArrayList arrayList = this.f23208b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i6) {
            if (i6 >= 0 && i6 < androidx.recyclerview.widget.RecyclerView.this.f23047J0.b()) {
                return !androidx.recyclerview.widget.RecyclerView.this.f23047J0.e() ? i6 : androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6);
            }
            throw new java.lang.IndexOutOfBoundsException("invalid position " + i6 + ". State item count is " + androidx.recyclerview.widget.RecyclerView.this.f23047J0.b() + androidx.recyclerview.widget.RecyclerView.this.P());
        }

        void g(androidx.recyclerview.widget.RecyclerView.D d6) {
            androidx.recyclerview.widget.RecyclerView.this.getClass();
            if (androidx.recyclerview.widget.RecyclerView.this.f23058P.size() > 0) {
                androidx.appcompat.app.D.a(androidx.recyclerview.widget.RecyclerView.this.f23058P.get(0));
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.h hVar = androidx.recyclerview.widget.RecyclerView.this.f23054N;
            if (hVar != null) {
                hVar.q(d6);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            if (recyclerView.f23047J0 != null) {
                recyclerView.f23042H.q(d6);
            }
        }

        androidx.recyclerview.widget.RecyclerView.D h(int i6) {
            int size;
            int iM;
            java.util.ArrayList arrayList = this.f23208b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23208b.get(i10);
                    if (!d6.L() && d6.m() == i6) {
                        d6.b(32);
                        return d6;
                    }
                }
                if (androidx.recyclerview.widget.RecyclerView.this.f23054N.h() && (iM = androidx.recyclerview.widget.RecyclerView.this.f23038F.m(i6)) > 0 && iM < androidx.recyclerview.widget.RecyclerView.this.f23054N.d()) {
                    long jE = androidx.recyclerview.widget.RecyclerView.this.f23054N.e(iM);
                    for (int i11 = 0; i11 < size; i11++) {
                        androidx.recyclerview.widget.RecyclerView.D d10 = (androidx.recyclerview.widget.RecyclerView.D) this.f23208b.get(i11);
                        if (!d10.L() && d10.k() == jE) {
                            d10.b(32);
                            return d10;
                        }
                    }
                }
            }
            return null;
        }

        androidx.recyclerview.widget.RecyclerView.u i() {
            if (this.f23213g == null) {
                this.f23213g = new androidx.recyclerview.widget.RecyclerView.u();
            }
            return this.f23213g;
        }

        int j() {
            return this.f23207a.size();
        }

        public java.util.List k() {
            return this.f23210d;
        }

        androidx.recyclerview.widget.RecyclerView.D l(long j6, int i6, boolean z6) {
            for (int size = this.f23207a.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23207a.get(size);
                if (d6.k() == j6 && !d6.L()) {
                    if (i6 == d6.l()) {
                        d6.b(32);
                        if (d6.v() && !androidx.recyclerview.widget.RecyclerView.this.f23047J0.e()) {
                            d6.F(2, 14);
                        }
                        return d6;
                    }
                    if (!z6) {
                        this.f23207a.remove(size);
                        androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(d6.f23130a, false);
                        y(d6.f23130a);
                    }
                }
            }
            int size2 = this.f23209c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                androidx.recyclerview.widget.RecyclerView.D d10 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(size2);
                if (d10.k() == j6 && !d10.r()) {
                    if (i6 == d10.l()) {
                        if (!z6) {
                            this.f23209c.remove(size2);
                        }
                        return d10;
                    }
                    if (!z6) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        androidx.recyclerview.widget.RecyclerView.D m(int i6, boolean z6) {
            android.view.View viewE;
            int size = this.f23207a.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23207a.get(i10);
                if (!d6.L() && d6.m() == i6 && !d6.t() && (androidx.recyclerview.widget.RecyclerView.this.f23047J0.f23112h || !d6.v())) {
                    d6.b(32);
                    return d6;
                }
            }
            if (z6 || (viewE = androidx.recyclerview.widget.RecyclerView.this.f23040G.e(i6)) == null) {
                int size2 = this.f23209c.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    androidx.recyclerview.widget.RecyclerView.D d10 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i11);
                    if (!d10.t() && d10.m() == i6 && !d10.r()) {
                        if (!z6) {
                            this.f23209c.remove(i11);
                        }
                        return d10;
                    }
                }
                return null;
            }
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(viewE);
            androidx.recyclerview.widget.RecyclerView.this.f23040G.s(viewE);
            int iM = androidx.recyclerview.widget.RecyclerView.this.f23040G.m(viewE);
            if (iM != -1) {
                androidx.recyclerview.widget.RecyclerView.this.f23040G.d(iM);
                D(viewE);
                dF0.b(8224);
                return dF0;
            }
            throw new java.lang.IllegalStateException("layout index should not be -1 after unhiding a view:" + dF0 + androidx.recyclerview.widget.RecyclerView.this.P());
        }

        android.view.View n(int i6) {
            return ((androidx.recyclerview.widget.RecyclerView.D) this.f23207a.get(i6)).f23130a;
        }

        public android.view.View o(int i6) {
            return p(i6, false);
        }

        android.view.View p(int i6, boolean z6) {
            return I(i6, z6, Long.MAX_VALUE).f23130a;
        }

        void s() {
            int size = this.f23209c.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) ((androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i6)).f23130a.getLayoutParams();
                if (qVar != null) {
                    qVar.f23199c = true;
                }
            }
        }

        void t() {
            int size = this.f23209c.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i6);
                if (d6 != null) {
                    d6.b(6);
                    d6.a(null);
                }
            }
            androidx.recyclerview.widget.RecyclerView.h hVar = androidx.recyclerview.widget.RecyclerView.this.f23054N;
            if (hVar == null || !hVar.h()) {
                z();
            }
        }

        void u(int i6, int i10) {
            int size = this.f23209c.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i11);
                if (d6 != null && d6.f23132c >= i6) {
                    d6.A(i10, false);
                }
            }
        }

        void v(int i6, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (i6 < i10) {
                i11 = -1;
                i13 = i6;
                i12 = i10;
            } else {
                i11 = 1;
                i12 = i6;
                i13 = i10;
            }
            int size = this.f23209c.size();
            for (int i15 = 0; i15 < size; i15++) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(i15);
                if (d6 != null && (i14 = d6.f23132c) >= i13 && i14 <= i12) {
                    if (i14 == i6) {
                        d6.A(i10 - i6, false);
                    } else {
                        d6.A(i11, false);
                    }
                }
            }
        }

        void w(int i6, int i10, boolean z6) {
            int i11 = i6 + i10;
            for (int size = this.f23209c.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23209c.get(size);
                if (d6 != null) {
                    int i12 = d6.f23132c;
                    if (i12 >= i11) {
                        d6.A(-i10, z6);
                    } else if (i12 >= i6) {
                        d6.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(androidx.recyclerview.widget.RecyclerView.h hVar, androidx.recyclerview.widget.RecyclerView.h hVar2, boolean z6) {
            c();
            i().h(hVar, hVar2, z6);
        }

        void y(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(view);
            dF0.f23143n = null;
            dF0.f23144o = false;
            dF0.e();
            C(dF0);
        }

        void z() {
            for (int size = this.f23209c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f23209c.clear();
            if (androidx.recyclerview.widget.RecyclerView.f23025g1) {
                androidx.recyclerview.widget.RecyclerView.this.f23045I0.b();
            }
        }
    }

    public interface w {
    }

    private class x extends androidx.recyclerview.widget.RecyclerView.j {
        x() {
        }
    }

    public static class y extends I1.a {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.y> CREATOR = new androidx.recyclerview.widget.RecyclerView.y.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        android.os.Parcelable f23216E;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.RecyclerView.y createFromParcel(android.os.Parcel parcel) {
                return new androidx.recyclerview.widget.RecyclerView.y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.RecyclerView.y createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.recyclerview.widget.RecyclerView.y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.RecyclerView.y[] newArray(int i6) {
                return new androidx.recyclerview.widget.RecyclerView.y[i6];
            }
        }

        y(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23216E = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.RecyclerView.p.class.getClassLoader() : classLoader);
        }

        y(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        void b(androidx.recyclerview.widget.RecyclerView.y yVar) {
            this.f23216E = yVar.f23216E;
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeParcelable(this.f23216E, 0);
        }
    }

    public static abstract class z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.recyclerview.widget.RecyclerView f23218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.recyclerview.widget.RecyclerView.p f23219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.view.View f23222f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f23224h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23217a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final androidx.recyclerview.widget.RecyclerView.z.a f23223g = new androidx.recyclerview.widget.RecyclerView.z.a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f23225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f23226b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f23227c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f23228d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private android.view.animation.Interpolator f23229e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f23230f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f23231g;

            public a(int i6, int i10) {
                this(i6, i10, Integer.MIN_VALUE, null);
            }

            public a(int i6, int i10, int i11, android.view.animation.Interpolator interpolator) {
                this.f23228d = -1;
                this.f23230f = false;
                this.f23231g = 0;
                this.f23225a = i6;
                this.f23226b = i10;
                this.f23227c = i11;
                this.f23229e = interpolator;
            }

            private void e() {
                if (this.f23229e != null && this.f23227c < 1) {
                    throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f23227c < 1) {
                    throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f23228d >= 0;
            }

            public void b(int i6) {
                this.f23228d = i6;
            }

            void c(androidx.recyclerview.widget.RecyclerView recyclerView) {
                int i6 = this.f23228d;
                if (i6 >= 0) {
                    this.f23228d = -1;
                    recyclerView.v0(i6);
                    this.f23230f = false;
                } else {
                    if (!this.f23230f) {
                        this.f23231g = 0;
                        return;
                    }
                    e();
                    recyclerView.f23041G0.e(this.f23225a, this.f23226b, this.f23227c, this.f23229e);
                    int i10 = this.f23231g + 1;
                    this.f23231g = i10;
                    if (i10 > 10) {
                    }
                    this.f23230f = false;
                }
            }

            public void d(int i6, int i10, int i11, android.view.animation.Interpolator interpolator) {
                this.f23225a = i6;
                this.f23226b = i10;
                this.f23227c = i11;
                this.f23229e = interpolator;
                this.f23230f = true;
            }
        }

        public interface b {
            android.graphics.PointF d(int i6);
        }

        public android.graphics.PointF a(int i6) {
            java.lang.Object objE = e();
            if (objE instanceof androidx.recyclerview.widget.RecyclerView.z.b) {
                return ((androidx.recyclerview.widget.RecyclerView.z.b) objE).d(i6);
            }
            java.lang.String str = "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + androidx.recyclerview.widget.RecyclerView.z.b.class.getCanonicalName();
            return null;
        }

        public android.view.View b(int i6) {
            return this.f23218b.f23056O.H(i6);
        }

        public int c() {
            return this.f23218b.f23056O.O();
        }

        public int d(android.view.View view) {
            return this.f23218b.d0(view);
        }

        public androidx.recyclerview.widget.RecyclerView.p e() {
            return this.f23219c;
        }

        public int f() {
            return this.f23217a;
        }

        public boolean g() {
            return this.f23220d;
        }

        public boolean h() {
            return this.f23221e;
        }

        protected void i(android.graphics.PointF pointF) {
            float f6 = pointF.x;
            float f10 = pointF.y;
            float fSqrt = (float) java.lang.Math.sqrt((f6 * f6) + (f10 * f10));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i6, int i10) {
            android.graphics.PointF pointFA;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f23218b;
            if (this.f23217a == -1 || recyclerView == null) {
                r();
            }
            if (this.f23220d && this.f23222f == null && this.f23219c != null && (pointFA = a(this.f23217a)) != null) {
                float f6 = pointFA.x;
                if (f6 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.g1((int) java.lang.Math.signum(f6), (int) java.lang.Math.signum(pointFA.y), null);
                }
            }
            this.f23220d = false;
            android.view.View view = this.f23222f;
            if (view != null) {
                if (d(view) == this.f23217a) {
                    o(this.f23222f, recyclerView.f23047J0, this.f23223g);
                    this.f23223g.c(recyclerView);
                    r();
                } else {
                    this.f23222f = null;
                }
            }
            if (this.f23221e) {
                l(i6, i10, recyclerView.f23047J0, this.f23223g);
                boolean zA = this.f23223g.a();
                this.f23223g.c(recyclerView);
                if (zA && this.f23221e) {
                    this.f23220d = true;
                    recyclerView.f23041G0.d();
                }
            }
        }

        protected void k(android.view.View view) {
            if (d(view) == f()) {
                this.f23222f = view;
            }
        }

        protected abstract void l(int i6, int i10, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.z.a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(android.view.View view, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.z.a aVar);

        public void p(int i6) {
            this.f23217a = i6;
        }

        void q(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.p pVar) {
            recyclerView.f23041G0.f();
            if (this.f23224h) {
                java.lang.String str = "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.";
            }
            this.f23218b = recyclerView;
            this.f23219c = pVar;
            int i6 = this.f23217a;
            if (i6 == -1) {
                throw new java.lang.IllegalArgumentException("Invalid target position");
            }
            recyclerView.f23047J0.f23105a = i6;
            this.f23221e = true;
            this.f23220d = true;
            this.f23222f = b(f());
            m();
            this.f23218b.f23041G0.d();
            this.f23224h = true;
        }

        protected final void r() {
            if (this.f23221e) {
                this.f23221e = false;
                n();
                this.f23218b.f23047J0.f23105a = -1;
                this.f23222f = null;
                this.f23217a = -1;
                this.f23220d = false;
                this.f23219c.j1(this);
                this.f23219c = null;
                this.f23218b = null;
            }
        }
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f23028j1 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        f23029k1 = new androidx.recyclerview.widget.RecyclerView.InterpolatorC2096c();
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p133n2.a.f51448a);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f23032C = new androidx.recyclerview.widget.RecyclerView.x();
        this.f23034D = new androidx.recyclerview.widget.RecyclerView.v();
        this.f23042H = new androidx.recyclerview.widget.p();
        this.f23046J = new androidx.recyclerview.widget.RecyclerView.RunnableC2094a();
        this.f23048K = new android.graphics.Rect();
        this.f23050L = new android.graphics.Rect();
        this.f23052M = new android.graphics.RectF();
        this.f23058P = new java.util.ArrayList();
        this.f23060Q = new java.util.ArrayList();
        this.f23062R = new java.util.ArrayList();
        this.f23077a0 = 0;
        this.f23087i0 = false;
        this.f23088j0 = false;
        this.f23089k0 = 0;
        this.f23090l0 = 0;
        this.f23091m0 = new androidx.recyclerview.widget.RecyclerView.l();
        this.f23096r0 = new androidx.recyclerview.widget.c();
        this.f23097s0 = 0;
        this.f23098t0 = -1;
        this.f23035D0 = Float.MIN_VALUE;
        this.f23037E0 = Float.MIN_VALUE;
        this.f23039F0 = true;
        this.f23041G0 = new androidx.recyclerview.widget.RecyclerView.C();
        this.f23045I0 = f23025g1 ? new androidx.recyclerview.widget.e.b() : null;
        this.f23047J0 = new androidx.recyclerview.widget.RecyclerView.A();
        this.f23053M0 = false;
        this.f23055N0 = false;
        this.f23057O0 = new androidx.recyclerview.widget.RecyclerView.n();
        this.f23059P0 = false;
        this.f23063R0 = new int[2];
        this.f23067T0 = new int[2];
        this.f23069U0 = new int[2];
        this.f23071V0 = new int[2];
        this.f23073W0 = new java.util.ArrayList();
        this.f23074X0 = new androidx.recyclerview.widget.RecyclerView.RunnableC2095b();
        this.f23076Z0 = 0;
        this.f23078a1 = 0;
        this.f23080b1 = new androidx.recyclerview.widget.RecyclerView.C2097d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f23104z0 = viewConfiguration.getScaledTouchSlop();
        this.f23035D0 = androidx.core.view.AbstractC1993b0.f(viewConfiguration, context);
        this.f23037E0 = androidx.core.view.AbstractC1993b0.j(viewConfiguration, context);
        this.f23031B0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23033C0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f23096r0.v(this.f23057O0);
        n0();
        p0();
        o0();
        if (androidx.core.view.X.x(this) == 0) {
            androidx.core.view.X.w0(this, 1);
        }
        this.f23085g0 = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p133n2.c.f51457f, i6, 0);
        androidx.core.view.X.l0(this, context, p133n2.c.f51457f, attributeSet, typedArrayObtainStyledAttributes, i6, 0);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(p133n2.c.f51466o);
        if (typedArrayObtainStyledAttributes.getInt(p133n2.c.f51460i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f23044I = typedArrayObtainStyledAttributes.getBoolean(p133n2.c.f51459h, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(p133n2.c.f51461j, false);
        this.f23070V = z6;
        if (z6) {
            q0((android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p133n2.c.f51464m), typedArrayObtainStyledAttributes.getDrawable(p133n2.c.f51465n), (android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p133n2.c.f51462k), typedArrayObtainStyledAttributes.getDrawable(p133n2.c.f51463l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i6, 0);
        int[] iArr = f23021c1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        androidx.core.view.X.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i6, 0);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    private void A() {
        int i6 = this.f23083e0;
        this.f23083e0 = 0;
        if (i6 == 0 || !s0()) {
            return;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C1.AbstractC0841b.b(accessibilityEventObtain, i6);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.f23047J0.a(1);
        Q(this.f23047J0);
        this.f23047J0.f23114j = false;
        q1();
        this.f23042H.f();
        G0();
        O0();
        d1();
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        a6.f23113i = a6.f23115k && this.f23055N0;
        this.f23055N0 = false;
        this.f23053M0 = false;
        a6.f23112h = a6.f23116l;
        a6.f23110f = this.f23054N.d();
        U(this.f23063R0);
        if (this.f23047J0.f23115k) {
            int iG = this.f23040G.g();
            for (int i6 = 0; i6 < iG; i6++) {
                androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.f(i6));
                if (!dF0.J() && (!dF0.t() || this.f23054N.h())) {
                    this.f23042H.e(dF0, this.f23096r0.t(this.f23047J0, dF0, androidx.recyclerview.widget.RecyclerView.m.e(dF0), dF0.o()));
                    if (this.f23047J0.f23113i && dF0.y() && !dF0.v() && !dF0.J() && !dF0.t()) {
                        this.f23042H.c(c0(dF0), dF0);
                    }
                }
            }
        }
        if (this.f23047J0.f23116l) {
            e1();
            androidx.recyclerview.widget.RecyclerView.A a10 = this.f23047J0;
            boolean z6 = a10.f23111g;
            a10.f23111g = false;
            this.f23056O.b1(this.f23034D, a10);
            this.f23047J0.f23111g = z6;
            for (int i10 = 0; i10 < this.f23040G.g(); i10++) {
                androidx.recyclerview.widget.RecyclerView.D dF1 = f0(this.f23040G.f(i10));
                if (!dF1.J() && !this.f23042H.i(dF1)) {
                    int iE = androidx.recyclerview.widget.RecyclerView.m.e(dF1);
                    boolean zP = dF1.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    androidx.recyclerview.widget.RecyclerView.m.b bVarT = this.f23096r0.t(this.f23047J0, dF1, iE, dF1.o());
                    if (zP) {
                        R0(dF1, bVarT);
                    } else {
                        this.f23042H.a(dF1, bVarT);
                    }
                }
            }
        }
        s();
        H0();
        s1(false);
        this.f23047J0.f23109e = 2;
    }

    private void D() {
        q1();
        G0();
        this.f23047J0.a(6);
        this.f23038F.j();
        this.f23047J0.f23110f = this.f23054N.d();
        this.f23047J0.f23108d = 0;
        if (this.f23036E != null && this.f23054N.b()) {
            android.os.Parcelable parcelable = this.f23036E.f23216E;
            if (parcelable != null) {
                this.f23056O.g1(parcelable);
            }
            this.f23036E = null;
        }
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        a6.f23112h = false;
        this.f23056O.b1(this.f23034D, a6);
        androidx.recyclerview.widget.RecyclerView.A a10 = this.f23047J0;
        a10.f23111g = false;
        a10.f23115k = a10.f23115k && this.f23096r0 != null;
        a10.f23109e = 4;
        H0();
        s1(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    private void E() {
        this.f23047J0.a(4);
        q1();
        G0();
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        a6.f23109e = 1;
        if (a6.f23115k) {
            for (int iG = this.f23040G.g() - 1; iG >= 0; iG--) {
                androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.f(iG));
                if (!dF0.J()) {
                    long jC0 = c0(dF0);
                    androidx.recyclerview.widget.RecyclerView.m.b bVarS = this.f23096r0.s(this.f23047J0, dF0);
                    androidx.recyclerview.widget.RecyclerView.D dG = this.f23042H.g(jC0);
                    if (dG == null || dG.J()) {
                        this.f23042H.d(dF0, bVarS);
                    } else {
                        boolean zH = this.f23042H.h(dG);
                        boolean zH2 = this.f23042H.h(dF0);
                        if (zH && dG == dF0) {
                            this.f23042H.d(dF0, bVarS);
                        } else {
                            androidx.recyclerview.widget.RecyclerView.m.b bVarN = this.f23042H.n(dG);
                            this.f23042H.d(dF0, bVarS);
                            androidx.recyclerview.widget.RecyclerView.m.b bVarM = this.f23042H.m(dF0);
                            if (bVarN == null) {
                                k0(jC0, dF0, dG);
                            } else {
                                m(dG, dF0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f23042H.o(this.f23080b1);
        }
        this.f23056O.p1(this.f23034D);
        androidx.recyclerview.widget.RecyclerView.A a10 = this.f23047J0;
        a10.f23107c = a10.f23110f;
        this.f23087i0 = false;
        this.f23088j0 = false;
        a10.f23115k = false;
        a10.f23116l = false;
        this.f23056O.f23180h = false;
        java.util.ArrayList arrayList = this.f23034D.f23208b;
        if (arrayList != null) {
            arrayList.clear();
        }
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar.f23186n) {
            pVar.f23185m = 0;
            pVar.f23186n = false;
            this.f23034D.K();
        }
        this.f23056O.c1(this.f23047J0);
        H0();
        s1(false);
        this.f23042H.f();
        int[] iArr = this.f23063R0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        S0();
        b1();
    }

    private void J0(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f23098t0) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f23098t0 = motionEvent.getPointerId(i6);
            int x6 = (int) (motionEvent.getX(i6) + 0.5f);
            this.f23102x0 = x6;
            this.f23100v0 = x6;
            int y6 = (int) (motionEvent.getY(i6) + 0.5f);
            this.f23103y0 = y6;
            this.f23101w0 = y6;
        }
    }

    private boolean K(android.view.MotionEvent motionEvent) {
        androidx.recyclerview.widget.RecyclerView.s sVar = this.f23064S;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f23064S = null;
        }
        return true;
    }

    private boolean N0() {
        return this.f23096r0 != null && this.f23056O.P1();
    }

    private void O0() {
        boolean z6;
        if (this.f23087i0) {
            this.f23038F.u();
            if (this.f23088j0) {
                this.f23056O.W0(this);
            }
        }
        if (N0()) {
            this.f23038F.s();
        } else {
            this.f23038F.j();
        }
        boolean z10 = this.f23053M0 || this.f23055N0;
        this.f23047J0.f23115k = this.f23072W && this.f23096r0 != null && ((z6 = this.f23087i0) || z10 || this.f23056O.f23180h) && (!z6 || this.f23054N.h());
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        a6.f23116l = a6.f23115k && z10 && !this.f23087i0 && N0();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    private void Q0(float f6, float f10, float f11, float f12) {
        boolean z6;
        android.widget.EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z10 = true;
        if (f10 >= 0.0f) {
            if (f10 > 0.0f) {
                N();
                edgeEffect = this.f23094p0;
                width = f10 / getWidth();
                height = f11 / getHeight();
            } else {
                z6 = false;
            }
            if (f12 < 0.0f) {
                O();
                androidx.core.widget.d.c(this.f23093o0, (-f12) / getHeight(), f6 / getWidth());
            } else if (f12 > 0.0f) {
                L();
                androidx.core.widget.d.c(this.f23095q0, f12 / getHeight(), 1.0f - (f6 / getWidth()));
            } else {
                z10 = z6;
            }
            if (z10 && f10 == 0.0f && f12 == 0.0f) {
                return;
            }
            androidx.core.view.X.e0(this);
        }
        M();
        edgeEffect = this.f23092n0;
        width = (-f10) / getWidth();
        height = 1.0f - (f11 / getHeight());
        androidx.core.widget.d.c(edgeEffect, width, height);
        z6 = true;
        if (f12 < 0.0f) {
            O();
            androidx.core.widget.d.c(this.f23093o0, (-f12) / getHeight(), f6 / getWidth());
        } else if (f12 > 0.0f) {
            L();
            androidx.core.widget.d.c(this.f23095q0, f12 / getHeight(), 1.0f - (f6 / getWidth()));
        } else {
            z10 = z6;
        }
        if (z10) {
        }
        androidx.core.view.X.e0(this);
    }

    private void S0() {
        android.view.View viewFindViewById;
        if (!this.f23039F0 || this.f23054N == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            android.view.View focusedChild = getFocusedChild();
            if (!f23027i1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f23040G.n(focusedChild)) {
                    return;
                }
            } else if (this.f23040G.g() == 0) {
                requestFocus();
                return;
            }
        }
        android.view.View viewW = null;
        androidx.recyclerview.widget.RecyclerView.D dY = (this.f23047J0.f23118n == -1 || !this.f23054N.h()) ? null : Y(this.f23047J0.f23118n);
        if (dY != null && !this.f23040G.n(dY.f23130a) && dY.f23130a.hasFocusable()) {
            viewW = dY.f23130a;
        } else if (this.f23040G.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i6 = this.f23047J0.f23119o;
            if (i6 != -1 && (viewFindViewById = viewW.findViewById(i6)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private boolean T(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f23062R.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.recyclerview.widget.RecyclerView.s sVar = (androidx.recyclerview.widget.RecyclerView.s) this.f23062R.get(i6);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.f23064S = sVar;
                return true;
            }
        }
        return false;
    }

    private void T0() {
        boolean zIsFinished;
        android.widget.EdgeEffect edgeEffect = this.f23092n0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f23092n0.isFinished();
        } else {
            zIsFinished = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.f23093o0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f23093o0.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f23094p0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f23094p0.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f23095q0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f23095q0.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.X.e0(this);
        }
    }

    private void U(int[] iArr) {
        int iG = this.f23040G.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iG; i11++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.f(i11));
            if (!dF0.J()) {
                int iM = dF0.m();
                if (iM < i6) {
                    i6 = iM;
                }
                if (iM > i10) {
                    i10 = iM;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i10;
    }

    static androidx.recyclerview.widget.RecyclerView V(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            return (androidx.recyclerview.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            androidx.recyclerview.widget.RecyclerView recyclerViewV = V(viewGroup.getChildAt(i6));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private android.view.View W() {
        androidx.recyclerview.widget.RecyclerView.D dX;
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        int i6 = a6.f23117m;
        if (i6 == -1) {
            i6 = 0;
        }
        int iB = a6.b();
        for (int i10 = i6; i10 < iB; i10++) {
            androidx.recyclerview.widget.RecyclerView.D dX2 = X(i10);
            if (dX2 == null) {
                break;
            }
            if (dX2.f23130a.hasFocusable()) {
                return dX2.f23130a;
            }
        }
        int iMin = java.lang.Math.min(iB, i6);
        do {
            iMin--;
            if (iMin < 0 || (dX = X(iMin)) == null) {
                return null;
            }
        } while (!dX.f23130a.hasFocusable());
        return dX.f23130a;
    }

    private void a1(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        this.f23048K.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.q) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) layoutParams;
            if (!qVar.f23199c) {
                android.graphics.Rect rect = qVar.f23198b;
                android.graphics.Rect rect2 = this.f23048K;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f23048K);
            offsetRectIntoDescendantCoords(view, this.f23048K);
        }
        this.f23056O.w1(this, view, this.f23048K, !this.f23072W, view2 == null);
    }

    private void b1() {
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        a6.f23118n = -1L;
        a6.f23117m = -1;
        a6.f23119o = -1;
    }

    private void c1() {
        android.view.VelocityTracker velocityTracker = this.f23099u0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        t1(0);
        T0();
    }

    private void d1() {
        int iJ;
        android.view.View focusedChild = (this.f23039F0 && hasFocus() && this.f23054N != null) ? getFocusedChild() : null;
        androidx.recyclerview.widget.RecyclerView.D dS = focusedChild != null ? S(focusedChild) : null;
        if (dS == null) {
            b1();
            return;
        }
        this.f23047J0.f23118n = this.f23054N.h() ? dS.k() : -1L;
        androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
        if (this.f23087i0) {
            iJ = -1;
        } else {
            iJ = dS.v() ? dS.f23133d : dS.j();
        }
        a6.f23117m = iJ;
        this.f23047J0.f23119o = h0(dS.f23130a);
    }

    static androidx.recyclerview.widget.RecyclerView.D f0(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()).f23197a;
    }

    private void g(androidx.recyclerview.widget.RecyclerView.D d6) {
        android.view.View view = d6.f23130a;
        boolean z6 = view.getParent() == this;
        this.f23034D.J(e0(view));
        if (d6.x()) {
            this.f23040G.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f23040G;
        if (z6) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    static void g0(android.view.View view, android.graphics.Rect rect) {
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
        android.graphics.Rect rect2 = qVar.f23198b;
        rect.set((view.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private androidx.core.view.C getScrollingChildHelper() {
        if (this.f23065S0 == null) {
            this.f23065S0 = new androidx.core.view.C(this);
        }
        return this.f23065S0;
    }

    private int h0(android.view.View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof android.view.ViewGroup) && view.hasFocus()) {
                view = ((android.view.ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
            break loop0;
        }
        return id;
    }

    private java.lang.String i0(android.content.Context context, java.lang.String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return androidx.recyclerview.widget.RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void i1(androidx.recyclerview.widget.RecyclerView.h hVar, boolean z6, boolean z10) {
        androidx.recyclerview.widget.RecyclerView.h hVar2 = this.f23054N;
        if (hVar2 != null) {
            hVar2.t(this.f23032C);
            this.f23054N.m(this);
        }
        if (!z6 || z10) {
            U0();
        }
        this.f23038F.u();
        androidx.recyclerview.widget.RecyclerView.h hVar3 = this.f23054N;
        this.f23054N = hVar;
        if (hVar != null) {
            hVar.r(this.f23032C);
            hVar.i(this);
        }
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.I0(hVar3, this.f23054N);
        }
        this.f23034D.x(hVar3, this.f23054N, z6);
        this.f23047J0.f23111g = true;
    }

    private void k0(long j6, androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10) {
        int iG = this.f23040G.g();
        for (int i6 = 0; i6 < iG; i6++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.f(i6));
            if (dF0 != d6 && c0(dF0) == j6) {
                androidx.recyclerview.widget.RecyclerView.h hVar = this.f23054N;
                if (hVar == null || !hVar.h()) {
                    throw new java.lang.IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + dF0 + " \n View Holder 2:" + d6 + P());
                }
                throw new java.lang.IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + dF0 + " \n View Holder 2:" + d6 + P());
            }
        }
        java.lang.String str = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d10 + " cannot be found but it is necessary for " + d6 + P();
    }

    private void m(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2, boolean z6, boolean z10) {
        d6.G(false);
        if (z6) {
            g(d6);
        }
        if (d6 != d10) {
            if (z10) {
                g(d10);
            }
            d6.f23137h = d10;
            g(d6);
            this.f23034D.J(d6);
            d10.G(false);
            d10.f23138i = d6;
        }
        if (this.f23096r0.b(d6, d10, bVar, bVar2)) {
            M0();
        }
    }

    private boolean m0() {
        int iG = this.f23040G.g();
        for (int i6 = 0; i6 < iG; i6++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.f(i6));
            if (dF0 != null && !dF0.J() && dF0.y()) {
                return true;
            }
        }
        return false;
    }

    private void o0() {
        if (androidx.core.view.X.y(this) == 0) {
            androidx.core.view.X.y0(this, 8);
        }
    }

    private void p0() {
        this.f23040G = new androidx.recyclerview.widget.b(new androidx.recyclerview.widget.RecyclerView.e());
    }

    private void q() {
        c1();
        setScrollState(0);
    }

    static void r(androidx.recyclerview.widget.RecyclerView.D d6) {
        java.lang.ref.WeakReference weakReference = d6.f23131b;
        if (weakReference == null) {
            return;
        }
        java.lang.Object parent = weakReference.get();
        while (true) {
            android.view.View view = (android.view.View) parent;
            while (true) {
                if (view == null) {
                    d6.f23131b = null;
                    return;
                } else {
                    if (view == d6.f23130a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof android.view.View) {
                        break;
                    } else {
                        view = null;
                    }
                }
            }
        }
    }

    private boolean u0(android.view.View view, android.view.View view2, int i6) {
        int i10;
        if (view2 == null || view2 == this || view2 == view || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f23048K.set(0, 0, view.getWidth(), view.getHeight());
        this.f23050L.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f23048K);
        offsetDescendantRectToMyCoords(view2, this.f23050L);
        byte b6 = -1;
        int i11 = this.f23056O.d0() == 1 ? -1 : 1;
        android.graphics.Rect rect = this.f23048K;
        int i12 = rect.left;
        android.graphics.Rect rect2 = this.f23050L;
        int i13 = rect2.left;
        if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
            i10 = 1;
        } else {
            int i14 = rect.right;
            int i15 = rect2.right;
            i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
            b6 = 1;
        } else {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                b6 = 0;
            }
        }
        if (i6 == 1) {
            return b6 < 0 || (b6 == 0 && i10 * i11 < 0);
        }
        if (i6 == 2) {
            return b6 > 0 || (b6 == 0 && i10 * i11 > 0);
        }
        if (i6 == 17) {
            return i10 < 0;
        }
        if (i6 == 33) {
            return b6 < 0;
        }
        if (i6 == 66) {
            return i10 > 0;
        }
        if (i6 == 130) {
            return b6 > 0;
        }
        throw new java.lang.IllegalArgumentException("Invalid direction: " + i6 + P());
    }

    private void v(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet, int i6, int i10) {
        java.lang.Object[] objArr;
        java.lang.reflect.Constructor constructor;
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            java.lang.String strI0 = i0(context, strTrim);
            try {
                java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(androidx.recyclerview.widget.RecyclerView.p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f23028j1);
                    objArr = new java.lang.Object[]{context, attributeSet, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)};
                } catch (java.lang.NoSuchMethodException e6) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (java.lang.NoSuchMethodException e10) {
                        e10.initCause(e6);
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e10);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((androidx.recyclerview.widget.RecyclerView.p) constructor.newInstance(objArr));
            } catch (java.lang.ClassCastException e11) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e11);
            } catch (java.lang.ClassNotFoundException e12) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e12);
            } catch (java.lang.IllegalAccessException e13) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e13);
            } catch (java.lang.InstantiationException e14) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e14);
            } catch (java.lang.reflect.InvocationTargetException e15) {
                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e15);
            }
        }
    }

    private void v1() {
        this.f23041G0.f();
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.O1();
        }
    }

    private boolean x(int i6, int i10) {
        U(this.f23063R0);
        int[] iArr = this.f23063R0;
        return (iArr[0] == i6 && iArr[1] == i10) ? false : true;
    }

    private void y0(int i6, int i10, android.view.MotionEvent motionEvent, int i11) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null || this.f23081c0) {
            return;
        }
        int[] iArr = this.f23071V0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = pVar.p();
        boolean zQ = this.f23056O.q();
        r1(zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0, i11);
        if (F(zP ? i6 : 0, zQ ? i10 : 0, this.f23071V0, this.f23067T0, i11)) {
            int[] iArr2 = this.f23071V0;
            i6 -= iArr2[0];
            i10 -= iArr2[1];
        }
        f1(zP ? i6 : 0, zQ ? i10 : 0, motionEvent, i11);
        androidx.recyclerview.widget.e eVar = this.f23043H0;
        if (eVar != null && (i6 != 0 || i10 != 0)) {
            eVar.f(this, i6, i10);
        }
        t1(i11);
    }

    public void A0(int i6) {
        int iG = this.f23040G.g();
        for (int i10 = 0; i10 < iG; i10++) {
            this.f23040G.f(i10).offsetTopAndBottom(i6);
        }
    }

    void B() {
        if (this.f23054N != null && this.f23056O != null) {
            this.f23047J0.f23114j = false;
            boolean z6 = this.f23075Y0 && !(this.f23076Z0 == getWidth() && this.f23078a1 == getHeight());
            this.f23076Z0 = 0;
            this.f23078a1 = 0;
            this.f23075Y0 = false;
            if (this.f23047J0.f23109e != 1) {
                if (!this.f23038F.q() && !z6 && this.f23056O.s0() == getWidth() && this.f23056O.b0() == getHeight()) {
                    this.f23056O.D1(this);
                }
                E();
            }
            C();
            this.f23056O.D1(this);
            D();
            E();
        }
    }

    void B0(int i6, int i10) {
        int iJ = this.f23040G.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i11));
            if (dF0 != null && !dF0.J() && dF0.f23132c >= i6) {
                dF0.A(i10, false);
                this.f23047J0.f23111g = true;
            }
        }
        this.f23034D.u(i6, i10);
        requestLayout();
    }

    void C0(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iJ = this.f23040G.j();
        if (i6 < i10) {
            i13 = -1;
            i12 = i6;
            i11 = i10;
        } else {
            i11 = i6;
            i12 = i10;
            i13 = 1;
        }
        for (int i15 = 0; i15 < iJ; i15++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i15));
            if (dF0 != null && (i14 = dF0.f23132c) >= i12 && i14 <= i11) {
                if (i14 == i6) {
                    dF0.A(i10 - i6, false);
                } else {
                    dF0.A(i13, false);
                }
                this.f23047J0.f23111g = true;
            }
        }
        this.f23034D.v(i6, i10);
        requestLayout();
    }

    void D0(int i6, int i10, boolean z6) {
        int i11 = i6 + i10;
        int iJ = this.f23040G.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i12));
            if (dF0 != null && !dF0.J()) {
                int i13 = dF0.f23132c;
                if (i13 >= i11) {
                    dF0.A(-i10, z6);
                } else if (i13 >= i6) {
                    dF0.i(i6 - 1, -i10, z6);
                }
                this.f23047J0.f23111g = true;
            }
        }
        this.f23034D.w(i6, i10, z6);
        requestLayout();
    }

    public void E0(android.view.View view) {
    }

    public boolean F(int i6, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().d(i6, i10, iArr, iArr2, i11);
    }

    public void F0(android.view.View view) {
    }

    public final void G(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().e(i6, i10, i11, i12, iArr, i13, iArr2);
    }

    void G0() {
        this.f23089k0++;
    }

    void H(int i6) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.i1(i6);
        }
        K0(i6);
        androidx.recyclerview.widget.RecyclerView.t tVar = this.f23049K0;
        if (tVar != null) {
            tVar.a(this, i6);
        }
        java.util.List list = this.f23051L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.t) this.f23051L0.get(size)).a(this, i6);
            }
        }
    }

    void H0() {
        I0(true);
    }

    void I(int i6, int i10) {
        this.f23090l0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i10);
        L0(i6, i10);
        androidx.recyclerview.widget.RecyclerView.t tVar = this.f23049K0;
        if (tVar != null) {
            tVar.b(this, i6, i10);
        }
        java.util.List list = this.f23051L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.t) this.f23051L0.get(size)).b(this, i6, i10);
            }
        }
        this.f23090l0--;
    }

    void I0(boolean z6) {
        int i6 = this.f23089k0 - 1;
        this.f23089k0 = i6;
        if (i6 < 1) {
            this.f23089k0 = 0;
            if (z6) {
                A();
                J();
            }
        }
    }

    void J() {
        int i6;
        for (int size = this.f23073W0.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23073W0.get(size);
            if (d6.f23130a.getParent() == this && !d6.J() && (i6 = d6.f23146q) != -1) {
                androidx.core.view.X.w0(d6.f23130a, i6);
                d6.f23146q = -1;
            }
        }
        this.f23073W0.clear();
    }

    public void K0(int i6) {
    }

    void L() {
        int measuredWidth;
        int measuredHeight;
        if (this.f23095q0 != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectA = this.f23091m0.a(this, 3);
        this.f23095q0 = edgeEffectA;
        if (this.f23044I) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void L0(int i6, int i10) {
    }

    void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.f23092n0 != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectA = this.f23091m0.a(this, 0);
        this.f23092n0 = edgeEffectA;
        if (this.f23044I) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void M0() {
        if (this.f23059P0 || !this.f23066T) {
            return;
        }
        androidx.core.view.X.f0(this, this.f23074X0);
        this.f23059P0 = true;
    }

    void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.f23094p0 != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectA = this.f23091m0.a(this, 2);
        this.f23094p0 = edgeEffectA;
        if (this.f23044I) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void O() {
        int measuredWidth;
        int measuredHeight;
        if (this.f23093o0 != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectA = this.f23091m0.a(this, 1);
        this.f23093o0 = edgeEffectA;
        if (this.f23044I) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    java.lang.String P() {
        return " " + super.toString() + ", adapter:" + this.f23054N + ", layout:" + this.f23056O + ", context:" + getContext();
    }

    void P0(boolean z6) {
        this.f23088j0 = z6 | this.f23088j0;
        this.f23087i0 = true;
        x0();
    }

    final void Q(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (getScrollState() != 2) {
            a6.f23120p = 0;
            a6.f23121q = 0;
        } else {
            android.widget.OverScroller overScroller = this.f23041G0.f23124E;
            a6.f23120p = overScroller.getFinalX() - overScroller.getCurrX();
            a6.f23121q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public android.view.View R(android.view.View view) {
        java.lang.Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof android.view.View)) {
                break;
            }
            view = (android.view.View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void R0(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar) {
        d6.F(0, 8192);
        if (this.f23047J0.f23113i && d6.y() && !d6.v() && !d6.J()) {
            this.f23042H.c(c0(d6), d6);
        }
        this.f23042H.e(d6, bVar);
    }

    public androidx.recyclerview.widget.RecyclerView.D S(android.view.View view) {
        android.view.View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return e0(viewR);
    }

    void U0() {
        androidx.recyclerview.widget.RecyclerView.m mVar = this.f23096r0;
        if (mVar != null) {
            mVar.k();
        }
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.o1(this.f23034D);
            this.f23056O.p1(this.f23034D);
        }
        this.f23034D.c();
    }

    boolean V0(android.view.View view) {
        q1();
        boolean zR = this.f23040G.r(view);
        if (zR) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(view);
            this.f23034D.J(dF0);
            this.f23034D.C(dF0);
        }
        s1(!zR);
        return zR;
    }

    public void W0(androidx.recyclerview.widget.RecyclerView.o oVar) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f23060Q.remove(oVar);
        if (this.f23060Q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public androidx.recyclerview.widget.RecyclerView.D X(int i6) {
        androidx.recyclerview.widget.RecyclerView.D d6 = null;
        if (this.f23087i0) {
            return null;
        }
        int iJ = this.f23040G.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i10));
            if (dF0 != null && !dF0.v() && b0(dF0) == i6) {
                if (!this.f23040G.n(dF0.f23130a)) {
                    return dF0;
                }
                d6 = dF0;
            }
        }
        return d6;
    }

    public void X0(androidx.recyclerview.widget.RecyclerView.s sVar) {
        this.f23062R.remove(sVar);
        if (this.f23064S == sVar) {
            this.f23064S = null;
        }
    }

    public androidx.recyclerview.widget.RecyclerView.D Y(long j6) {
        androidx.recyclerview.widget.RecyclerView.h hVar = this.f23054N;
        androidx.recyclerview.widget.RecyclerView.D d6 = null;
        if (hVar != null && hVar.h()) {
            int iJ = this.f23040G.j();
            for (int i6 = 0; i6 < iJ; i6++) {
                androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i6));
                if (dF0 != null && !dF0.v() && dF0.k() == j6) {
                    if (!this.f23040G.n(dF0.f23130a)) {
                        return dF0;
                    }
                    d6 = dF0;
                }
            }
        }
        return d6;
    }

    public void Y0(androidx.recyclerview.widget.RecyclerView.t tVar) {
        java.util.List list = this.f23051L0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    androidx.recyclerview.widget.RecyclerView.D Z(int i6, boolean z6) {
        int iJ = this.f23040G.j();
        androidx.recyclerview.widget.RecyclerView.D d6 = null;
        for (int i10 = 0; i10 < iJ; i10++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i10));
            if (dF0 != null && !dF0.v()) {
                if (z6) {
                    if (dF0.f23132c != i6) {
                        continue;
                    } else {
                        if (this.f23040G.n(dF0.f23130a)) {
                            return dF0;
                        }
                        d6 = dF0;
                    }
                } else if (dF0.m() != i6) {
                    continue;
                } else {
                    if (this.f23040G.n(dF0.f23130a)) {
                        return dF0;
                    }
                    d6 = dF0;
                }
            }
        }
        return d6;
    }

    void Z0() {
        androidx.recyclerview.widget.RecyclerView.D d6;
        int iG = this.f23040G.g();
        for (int i6 = 0; i6 < iG; i6++) {
            android.view.View viewF = this.f23040G.f(i6);
            androidx.recyclerview.widget.RecyclerView.D dE0 = e0(viewF);
            if (dE0 != null && (d6 = dE0.f23138i) != null) {
                android.view.View view = d6.f23130a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void a(int i6, int i10) {
        if (i6 < 0) {
            M();
            if (this.f23092n0.isFinished()) {
                this.f23092n0.onAbsorb(-i6);
            }
        } else if (i6 > 0) {
            N();
            if (this.f23094p0.isFinished()) {
                this.f23094p0.onAbsorb(i6);
            }
        }
        if (i10 < 0) {
            O();
            if (this.f23093o0.isFinished()) {
                this.f23093o0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            L();
            if (this.f23095q0.isFinished()) {
                this.f23095q0.onAbsorb(i10);
            }
        }
        if (i6 == 0 && i10 == 0) {
            return;
        }
        androidx.core.view.X.e0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null || this.f23081c0) {
            return false;
        }
        int iP = pVar.p();
        boolean zQ = this.f23056O.q();
        if (iP == 0 || java.lang.Math.abs(i6) < this.f23031B0) {
            i6 = 0;
        }
        if (!zQ || java.lang.Math.abs(i10) < this.f23031B0) {
            i10 = 0;
        }
        if (i6 == 0 && i10 == 0) {
            return false;
        }
        float f6 = i6;
        float f10 = i10;
        if (!dispatchNestedPreFling(f6, f10)) {
            boolean z6 = iP != 0 || zQ;
            dispatchNestedFling(f6, f10, z6);
            androidx.recyclerview.widget.RecyclerView.r rVar = this.f23030A0;
            if (rVar != null && rVar.a(i6, i10)) {
                return true;
            }
            if (z6) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                r1(iP, 1);
                int i11 = this.f23033C0;
                int iMax = java.lang.Math.max(-i11, java.lang.Math.min(i6, i11));
                int i12 = this.f23033C0;
                this.f23041G0.b(iMax, java.lang.Math.max(-i12, java.lang.Math.min(i10, i12)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList arrayList, int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null || !pVar.J0(this, arrayList, i6, i10)) {
            super.addFocusables(arrayList, i6, i10);
        }
    }

    int b0(androidx.recyclerview.widget.RecyclerView.D d6) {
        if (d6.p(524) || !d6.s()) {
            return -1;
        }
        return this.f23038F.e(d6.f23132c);
    }

    long c0(androidx.recyclerview.widget.RecyclerView.D d6) {
        return this.f23054N.h() ? d6.k() : d6.f23132c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.q) && this.f23056O.r((androidx.recyclerview.widget.RecyclerView.q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null && pVar.p()) {
            return this.f23056O.v(this.f23047J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null && pVar.p()) {
            return this.f23056O.w(this.f23047J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null && pVar.p()) {
            return this.f23056O.x(this.f23047J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null && pVar.q()) {
            return this.f23056O.y(this.f23047J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null && pVar.q()) {
            return this.f23056O.z(this.f23047J0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null && pVar.q()) {
            return this.f23056O.A(this.f23047J0);
        }
        return 0;
    }

    public int d0(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.D dF0 = f0(view);
        if (dF0 != null) {
            return dF0.m();
        }
        return -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f10, boolean z6) {
        return getScrollingChildHelper().a(f6, f10, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f10) {
        return getScrollingChildHelper().b(f6, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i10, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().f(i6, i10, i11, i12, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z6;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.f23060Q.size();
        boolean z10 = false;
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.recyclerview.widget.RecyclerView.o) this.f23060Q.get(i6)).i(canvas, this, this.f23047J0);
        }
        android.widget.EdgeEffect edgeEffect = this.f23092n0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f23044I ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.f23092n0;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        android.widget.EdgeEffect edgeEffect3 = this.f23093o0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f23044I) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.f23093o0;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.f23094p0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f23044I ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.f23094p0;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.f23095q0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f23044I) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            android.widget.EdgeEffect edgeEffect8 = this.f23095q0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z6 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f23096r0 == null || this.f23060Q.size() <= 0 || !this.f23096r0.p()) ? z6 : true) {
            androidx.core.view.X.e0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public androidx.recyclerview.widget.RecyclerView.D e0(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void e1() {
        int iJ = this.f23040G.j();
        for (int i6 = 0; i6 < iJ; i6++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i6));
            if (!dF0.J()) {
                dF0.E();
            }
        }
    }

    boolean f1(int i6, int i10, android.view.MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u();
        if (this.f23054N != null) {
            int[] iArr = this.f23071V0;
            iArr[0] = 0;
            iArr[1] = 0;
            g1(i6, i10, iArr);
            int[] iArr2 = this.f23071V0;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i12 = i17;
            i13 = i16;
            i14 = i6 - i16;
            i15 = i10 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.f23060Q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f23071V0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i13, i12, i14, i15, this.f23067T0, i11, iArr3);
        int[] iArr4 = this.f23071V0;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z6 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.f23102x0;
        int[] iArr5 = this.f23067T0;
        int i23 = iArr5[0];
        this.f23102x0 = i22 - i23;
        int i24 = this.f23103y0;
        int i25 = iArr5[1];
        this.f23103y0 = i24 - i25;
        int[] iArr6 = this.f23069U0;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.A.a(motionEvent, 8194)) {
                Q0(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            t(i6, i10);
        }
        if (i13 != 0 || i12 != 0) {
            I(i13, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z6 && i13 == 0 && i12 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View view, int i6) {
        android.view.View viewN0;
        boolean z6;
        android.view.View viewU0 = this.f23056O.U0(view, i6);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z10 = (this.f23054N == null || this.f23056O == null || t0() || this.f23081c0) ? false : true;
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        if (z10 && (i6 == 2 || i6 == 1)) {
            if (this.f23056O.q()) {
                int i10 = i6 == 2 ? 130 : 33;
                z6 = focusFinder.findNextFocus(this, view, i10) == null;
                if (f23026h1) {
                    i6 = i10;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.f23056O.p()) {
                int i11 = (this.f23056O.d0() == 1) ^ (i6 == 2) ? 66 : 17;
                boolean z11 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f23026h1) {
                    i6 = i11;
                }
                z6 = z11;
            }
            if (z6) {
                u();
                if (R(view) == null) {
                    return null;
                }
                q1();
                this.f23056O.N0(view, i6, this.f23034D, this.f23047J0);
                s1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i6);
        } else {
            android.view.View viewFindNextFocus = focusFinder.findNextFocus(this, view, i6);
            if (viewFindNextFocus == null && z10) {
                u();
                if (R(view) == null) {
                    return null;
                }
                q1();
                viewN0 = this.f23056O.N0(view, i6, this.f23034D, this.f23047J0);
                s1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return u0(view, viewN0, i6) ? viewN0 : super.focusSearch(view, i6);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i6);
        }
        a1(viewN0, null);
        return view;
    }

    void g1(int i6, int i10, int[] iArr) {
        q1();
        G0();
        androidx.core.os.s.a("RV Scroll");
        Q(this.f23047J0);
        int iA1 = i6 != 0 ? this.f23056O.A1(i6, this.f23034D, this.f23047J0) : 0;
        int iC1 = i10 != 0 ? this.f23056O.C1(i10, this.f23034D, this.f23047J0) : 0;
        androidx.core.os.s.b();
        Z0();
        H0();
        s1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            return pVar.I();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public androidx.recyclerview.widget.RecyclerView.h getAdapter() {
        return this.f23054N;
    }

    @Override // android.view.View
    public int getBaseline() {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i6, int i10) {
        return super.getChildDrawingOrder(i6, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f23044I;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f23061Q0;
    }

    public androidx.recyclerview.widget.RecyclerView.l getEdgeEffectFactory() {
        return this.f23091m0;
    }

    public androidx.recyclerview.widget.RecyclerView.m getItemAnimator() {
        return this.f23096r0;
    }

    public int getItemDecorationCount() {
        return this.f23060Q.size();
    }

    public androidx.recyclerview.widget.RecyclerView.p getLayoutManager() {
        return this.f23056O;
    }

    public int getMaxFlingVelocity() {
        return this.f23033C0;
    }

    public int getMinFlingVelocity() {
        return this.f23031B0;
    }

    long getNanoTime() {
        if (f23025g1) {
            return java.lang.System.nanoTime();
        }
        return 0L;
    }

    public androidx.recyclerview.widget.RecyclerView.r getOnFlingListener() {
        return this.f23030A0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f23039F0;
    }

    public androidx.recyclerview.widget.RecyclerView.u getRecycledViewPool() {
        return this.f23034D.i();
    }

    public int getScrollState() {
        return this.f23097s0;
    }

    public void h(androidx.recyclerview.widget.RecyclerView.o oVar) {
        i(oVar, -1);
    }

    public void h1(int i6) {
        if (this.f23081c0) {
            return;
        }
        u1();
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null) {
            return;
        }
        pVar.B1(i6);
        awakenScrollBars();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(androidx.recyclerview.widget.RecyclerView.o oVar, int i6) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f23060Q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i6 < 0) {
            this.f23060Q.add(oVar);
        } else {
            this.f23060Q.add(i6, oVar);
        }
        w0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f23066T;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f23081c0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(androidx.recyclerview.widget.RecyclerView.s sVar) {
        this.f23062R.add(sVar);
    }

    android.graphics.Rect j0(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
        if (!qVar.f23199c) {
            return qVar.f23198b;
        }
        if (this.f23047J0.e() && (qVar.b() || qVar.d())) {
            return qVar.f23198b;
        }
        android.graphics.Rect rect = qVar.f23198b;
        rect.set(0, 0, 0, 0);
        int size = this.f23060Q.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f23048K.set(0, 0, 0, 0);
            ((androidx.recyclerview.widget.RecyclerView.o) this.f23060Q.get(i6)).e(this.f23048K, view, this, this.f23047J0);
            int i10 = rect.left;
            android.graphics.Rect rect2 = this.f23048K;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f23199c = false;
        return rect;
    }

    boolean j1(androidx.recyclerview.widget.RecyclerView.D d6, int i6) {
        if (!t0()) {
            androidx.core.view.X.w0(d6.f23130a, i6);
            return true;
        }
        d6.f23146q = i6;
        this.f23073W0.add(d6);
        return false;
    }

    public void k(androidx.recyclerview.widget.RecyclerView.t tVar) {
        if (this.f23051L0 == null) {
            this.f23051L0 = new java.util.ArrayList();
        }
        this.f23051L0.add(tVar);
    }

    boolean k1(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? C1.AbstractC0841b.a(accessibilityEvent) : 0;
        this.f23083e0 |= iA != 0 ? iA : 0;
        return true;
    }

    void l(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
        d6.G(false);
        if (this.f23096r0.a(d6, bVar, bVar2)) {
            M0();
        }
    }

    public boolean l0() {
        return !this.f23072W || this.f23087i0 || this.f23038F.p();
    }

    public void l1(int i6, int i10) {
        m1(i6, i10, null);
    }

    public void m1(int i6, int i10, android.view.animation.Interpolator interpolator) {
        n1(i6, i10, interpolator, Integer.MIN_VALUE);
    }

    void n(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
        g(d6);
        d6.G(false);
        if (this.f23096r0.c(d6, bVar, bVar2)) {
            M0();
        }
    }

    void n0() {
        this.f23038F = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.RecyclerView.f());
    }

    public void n1(int i6, int i10, android.view.animation.Interpolator interpolator, int i11) {
        o1(i6, i10, interpolator, i11, false);
    }

    void o(java.lang.String str) {
        if (t0()) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.f23090l0 > 0) {
            new java.lang.IllegalStateException("" + P());
        }
    }

    void o1(int i6, int i10, android.view.animation.Interpolator interpolator, int i11, boolean z6) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null || this.f23081c0) {
            return;
        }
        if (!pVar.p()) {
            i6 = 0;
        }
        if (!this.f23056O.q()) {
            i10 = 0;
        }
        if (i6 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i6, i10);
            return;
        }
        if (z6) {
            int i12 = i6 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            r1(i12, 1);
        }
        this.f23041G0.e(i6, i10, i11, interpolator);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f23089k0 = 0;
        this.f23066T = true;
        this.f23072W = this.f23072W && !isLayoutRequested();
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.E(this);
        }
        this.f23059P0 = false;
        if (f23025g1) {
            java.lang.ThreadLocal threadLocal = androidx.recyclerview.widget.e.f23392G;
            androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) threadLocal.get();
            this.f23043H0 = eVar;
            if (eVar == null) {
                this.f23043H0 = new androidx.recyclerview.widget.e();
                android.view.Display displayT = androidx.core.view.X.t(this);
                if (isInEditMode() || displayT == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayT.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.f23043H0;
                eVar2.f23396E = (long) (1.0E9f / refreshRate);
                threadLocal.set(eVar2);
            }
            this.f23043H0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        androidx.recyclerview.widget.RecyclerView.m mVar = this.f23096r0;
        if (mVar != null) {
            mVar.k();
        }
        u1();
        this.f23066T = false;
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar != null) {
            pVar.F(this, this.f23034D);
        }
        this.f23073W0.clear();
        removeCallbacks(this.f23074X0);
        this.f23042H.j();
        if (!f23025g1 || (eVar = this.f23043H0) == null) {
            return;
        }
        eVar.j(this);
        this.f23043H0 = null;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f23060Q.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.recyclerview.widget.RecyclerView.o) this.f23060Q.get(i6)).g(canvas, this, this.f23047J0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f6;
        float axisValue;
        if (this.f23056O != null && !this.f23081c0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f6 = this.f23056O.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f23056O.p() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f23056O.q()) {
                    f6 = -axisValue2;
                } else if (this.f23056O.p()) {
                    axisValue = axisValue2;
                    f6 = 0.0f;
                } else {
                    f6 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f6 = 0.0f;
                axisValue = 0.0f;
            }
            if (f6 != 0.0f || axisValue != 0.0f) {
                y0((int) (axisValue * this.f23035D0), (int) (f6 * this.f23037E0), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z6;
        if (this.f23081c0) {
            return false;
        }
        this.f23064S = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f23056O.q();
        if (this.f23099u0 == null) {
            this.f23099u0 = android.view.VelocityTracker.obtain();
        }
        this.f23099u0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f23082d0) {
                this.f23082d0 = false;
            }
            this.f23098t0 = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f23102x0 = x6;
            this.f23100v0 = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f23103y0 = y6;
            this.f23101w0 = y6;
            if (this.f23097s0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t1(1);
            }
            int[] iArr = this.f23069U0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i6 = zP;
            if (zQ) {
                i6 = (zP ? 1 : 0) | 2;
            }
            r1(i6, 0);
        } else if (actionMasked == 1) {
            this.f23099u0.clear();
            t1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f23098t0);
            if (iFindPointerIndex < 0) {
                java.lang.String str = "Error processing scroll; pointer index for id " + this.f23098t0 + " not found. Did any MotionEvents get skipped?";
                return false;
            }
            int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f23097s0 != 1) {
                int i10 = x10 - this.f23100v0;
                int i11 = y10 - this.f23101w0;
                if (!zP || java.lang.Math.abs(i10) <= this.f23104z0) {
                    z6 = false;
                } else {
                    this.f23102x0 = x10;
                    z6 = true;
                }
                if (zQ && java.lang.Math.abs(i11) > this.f23104z0) {
                    this.f23103y0 = y10;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f23098t0 = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f23102x0 = x11;
            this.f23100v0 = x11;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f23103y0 = y11;
            this.f23101w0 = y11;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        return this.f23097s0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        androidx.core.os.s.a("RV OnLayout");
        B();
        androidx.core.os.s.b();
        this.f23072W = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null) {
            w(i6, i10);
            return;
        }
        boolean z6 = false;
        if (pVar.w0()) {
            int mode = android.view.View.MeasureSpec.getMode(i6);
            int mode2 = android.view.View.MeasureSpec.getMode(i10);
            this.f23056O.d1(this.f23034D, this.f23047J0, i6, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.f23075Y0 = z6;
            if (z6 || this.f23054N == null) {
                return;
            }
            if (this.f23047J0.f23109e == 1) {
                C();
            }
            this.f23056O.E1(i6, i10);
            this.f23047J0.f23114j = true;
            D();
            this.f23056O.H1(i6, i10);
            if (this.f23056O.K1()) {
                this.f23056O.E1(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f23047J0.f23114j = true;
                D();
                this.f23056O.H1(i6, i10);
            }
            this.f23076Z0 = getMeasuredWidth();
            this.f23078a1 = getMeasuredHeight();
            return;
        }
        if (this.f23068U) {
            this.f23056O.d1(this.f23034D, this.f23047J0, i6, i10);
            return;
        }
        if (this.f23084f0) {
            q1();
            G0();
            O0();
            H0();
            androidx.recyclerview.widget.RecyclerView.A a6 = this.f23047J0;
            if (a6.f23116l) {
                a6.f23112h = true;
            } else {
                this.f23038F.j();
                this.f23047J0.f23112h = false;
            }
            this.f23084f0 = false;
            s1(false);
        } else if (this.f23047J0.f23116l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        androidx.recyclerview.widget.RecyclerView.h hVar = this.f23054N;
        if (hVar != null) {
            this.f23047J0.f23110f = hVar.d();
        } else {
            this.f23047J0.f23110f = 0;
        }
        q1();
        this.f23056O.d1(this.f23034D, this.f23047J0, i6, i10);
        s1(false);
        this.f23047J0.f23112h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i6, android.graphics.Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.recyclerview.widget.RecyclerView.y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.recyclerview.widget.RecyclerView.y yVar = (androidx.recyclerview.widget.RecyclerView.y) parcelable;
        this.f23036E = yVar;
        super.onRestoreInstanceState(yVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.recyclerview.widget.RecyclerView.y yVar = new androidx.recyclerview.widget.RecyclerView.y(super.onSaveInstanceState());
        androidx.recyclerview.widget.RecyclerView.y yVar2 = this.f23036E;
        if (yVar2 != null) {
            yVar.b(yVar2);
        } else {
            androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
            yVar.f23216E = pVar != null ? pVar.h1() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i6 == i11 && i10 == i12) {
            return;
        }
        r0();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00db A[PHI: r0
  0x00db: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c6, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int i6;
        boolean z6;
        if (this.f23081c0 || this.f23082d0) {
            return false;
        }
        if (K(motionEvent)) {
            q();
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f23056O.q();
        if (this.f23099u0 == null) {
            this.f23099u0 = android.view.VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f23069U0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f23069U0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f23099u0.addMovement(motionEventObtain);
                this.f23099u0.computeCurrentVelocity(1000, this.f23033C0);
                float f6 = zP ? -this.f23099u0.getXVelocity(this.f23098t0) : 0.0f;
                float f10 = zQ ? -this.f23099u0.getYVelocity(this.f23098t0) : 0.0f;
                if ((f6 == 0.0f && f10 == 0.0f) || !a0((int) f6, (int) f10)) {
                    setScrollState(0);
                }
                c1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f23098t0);
                if (iFindPointerIndex < 0) {
                    java.lang.String str = "Error processing scroll; pointer index for id " + this.f23098t0 + " not found. Did any MotionEvents get skipped?";
                    return false;
                }
                int x6 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f23102x0 - x6;
                int iMax2 = this.f23103y0 - y6;
                if (this.f23097s0 != 1) {
                    if (zP) {
                        int i10 = this.f23104z0;
                        iMax = iMax > 0 ? java.lang.Math.max(0, iMax - i10) : java.lang.Math.min(0, iMax + i10);
                        if (iMax != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    if (zQ) {
                        int i11 = this.f23104z0;
                        iMax2 = iMax2 > 0 ? java.lang.Math.max(0, iMax2 - i11) : java.lang.Math.min(0, iMax2 + i11);
                        if (iMax2 != 0) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        setScrollState(1);
                    }
                }
                int i12 = iMax;
                int i13 = iMax2;
                if (this.f23097s0 == 1) {
                    int[] iArr3 = this.f23071V0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (F(zP ? i12 : 0, zQ ? i13 : 0, iArr3, this.f23067T0, 0)) {
                        int[] iArr4 = this.f23071V0;
                        i12 -= iArr4[0];
                        i13 -= iArr4[1];
                        int[] iArr5 = this.f23069U0;
                        int i14 = iArr5[0];
                        int[] iArr6 = this.f23067T0;
                        iArr5[0] = i14 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i15 = i13;
                    int[] iArr7 = this.f23067T0;
                    this.f23102x0 = x6 - iArr7[0];
                    this.f23103y0 = y6 - iArr7[1];
                    if (f1(zP ? i12 : 0, zQ ? i15 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.e eVar = this.f23043H0;
                    if (eVar != null && (i12 != 0 || i15 != 0)) {
                        eVar.f(this, i12, i15);
                    }
                }
            } else if (actionMasked == 3) {
                q();
            } else if (actionMasked == 5) {
                this.f23098t0 = motionEvent.getPointerId(actionIndex);
                int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f23102x0 = x10;
                this.f23100v0 = x10;
                int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f23103y0 = y10;
                this.f23101w0 = y10;
            } else if (actionMasked == 6) {
                J0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f23098t0 = motionEvent.getPointerId(0);
        int x11 = (int) (motionEvent.getX() + 0.5f);
        this.f23102x0 = x11;
        this.f23100v0 = x11;
        int y11 = (int) (motionEvent.getY() + 0.5f);
        this.f23103y0 = y11;
        this.f23101w0 = y11;
        if (zQ) {
            i6 = zP;
            i6 = (zP ? 1 : 0) | 2;
        }
        i6 = zP;
        r1(i6, 0);
        this.f23099u0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    boolean p(androidx.recyclerview.widget.RecyclerView.D d6) {
        androidx.recyclerview.widget.RecyclerView.m mVar = this.f23096r0;
        return mVar == null || mVar.g(d6, d6.o());
    }

    public void p1(int i6) {
        androidx.recyclerview.widget.RecyclerView.p pVar;
        if (!this.f23081c0 && (pVar = this.f23056O) != null) {
            pVar.M1(this, this.f23047J0, i6);
        }
    }

    void q0(android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            android.content.res.Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(p133n2.b.f51449a), resources.getDimensionPixelSize(p133n2.b.f51451c), resources.getDimensionPixelOffset(p133n2.b.f51450b));
        } else {
            throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    void q1() {
        int i6 = this.f23077a0 + 1;
        this.f23077a0 = i6;
        if (i6 != 1 || this.f23081c0) {
            return;
        }
        this.f23079b0 = false;
    }

    void r0() {
        this.f23095q0 = null;
        this.f23093o0 = null;
        this.f23094p0 = null;
        this.f23092n0 = null;
    }

    public boolean r1(int i6, int i10) {
        return getScrollingChildHelper().p(i6, i10);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View view, boolean z6) {
        androidx.recyclerview.widget.RecyclerView.D dF0 = f0(view);
        if (dF0 != null) {
            if (dF0.x()) {
                dF0.f();
            } else if (!dF0.J()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + dF0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.f23056O.f1(this, this.f23047J0, view, view2) && view2 != null) {
            a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z6) {
        return this.f23056O.v1(this, view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        int size = this.f23062R.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.recyclerview.widget.RecyclerView.s) this.f23062R.get(i6)).c(z6);
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f23077a0 != 0 || this.f23081c0) {
            this.f23079b0 = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.f23040G.j();
        for (int i6 = 0; i6 < iJ; i6++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i6));
            if (!dF0.J()) {
                dF0.c();
            }
        }
        this.f23034D.d();
    }

    boolean s0() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f23085g0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void s1(boolean z6) {
        if (this.f23077a0 < 1) {
            this.f23077a0 = 1;
        }
        if (!z6 && !this.f23081c0) {
            this.f23079b0 = false;
        }
        if (this.f23077a0 == 1) {
            if (z6 && this.f23079b0 && !this.f23081c0 && this.f23056O != null && this.f23054N != null) {
                B();
            }
            if (!this.f23081c0) {
                this.f23079b0 = false;
            }
        }
        this.f23077a0--;
    }

    @Override // android.view.View
    public void scrollBy(int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.p pVar = this.f23056O;
        if (pVar == null || this.f23081c0) {
            return;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f23056O.q();
        if (zP || zQ) {
            if (!zP) {
                i6 = 0;
            }
            if (!zQ) {
                i10 = 0;
            }
            f1(i6, i10, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i6, int i10) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (k1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f23061Q0 = kVar;
        androidx.core.view.X.n0(this, kVar);
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.h hVar) {
        setLayoutFrozen(false);
        i1(hVar, false, true);
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(androidx.recyclerview.widget.RecyclerView.k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f23044I) {
            r0();
        }
        this.f23044I = z6;
        super.setClipToPadding(z6);
        if (this.f23072W) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(androidx.recyclerview.widget.RecyclerView.l lVar) {
        B1.i.g(lVar);
        this.f23091m0 = lVar;
        r0();
    }

    public void setHasFixedSize(boolean z6) {
        this.f23068U = z6;
    }

    public void setItemAnimator(androidx.recyclerview.widget.RecyclerView.m mVar) {
        androidx.recyclerview.widget.RecyclerView.m mVar2 = this.f23096r0;
        if (mVar2 != null) {
            mVar2.k();
            this.f23096r0.v(null);
        }
        this.f23096r0 = mVar;
        if (mVar != null) {
            mVar.v(this.f23057O0);
        }
    }

    public void setItemViewCacheSize(int i6) {
        this.f23034D.G(i6);
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.p pVar) {
        if (pVar == this.f23056O) {
            return;
        }
        u1();
        if (this.f23056O != null) {
            androidx.recyclerview.widget.RecyclerView.m mVar = this.f23096r0;
            if (mVar != null) {
                mVar.k();
            }
            this.f23056O.o1(this.f23034D);
            this.f23056O.p1(this.f23034D);
            this.f23034D.c();
            if (this.f23066T) {
                this.f23056O.F(this, this.f23034D);
            }
            this.f23056O.I1(null);
            this.f23056O = null;
        } else {
            this.f23034D.c();
        }
        this.f23040G.o();
        this.f23056O = pVar;
        if (pVar != null) {
            if (pVar.f23174b != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f23174b.P());
            }
            pVar.I1(this);
            if (this.f23066T) {
                this.f23056O.E(this);
            }
        }
        this.f23034D.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new java.lang.IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        getScrollingChildHelper().m(z6);
    }

    public void setOnFlingListener(androidx.recyclerview.widget.RecyclerView.r rVar) {
        this.f23030A0 = rVar;
    }

    @java.lang.Deprecated
    public void setOnScrollListener(androidx.recyclerview.widget.RecyclerView.t tVar) {
        this.f23049K0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f23039F0 = z6;
    }

    public void setRecycledViewPool(androidx.recyclerview.widget.RecyclerView.u uVar) {
        this.f23034D.E(uVar);
    }

    @java.lang.Deprecated
    public void setRecyclerListener(androidx.recyclerview.widget.RecyclerView.w wVar) {
    }

    void setScrollState(int i6) {
        if (i6 == this.f23097s0) {
            return;
        }
        this.f23097s0 = i6;
        if (i6 != 2) {
            v1();
        }
        H(i6);
    }

    public void setScrollingTouchSlop(int i6) {
        int scaledTouchSlop;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i6 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i6 != 1) {
            java.lang.String str = "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value";
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f23104z0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.B b6) {
        this.f23034D.F(b6);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().o(i6);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        if (z6 != this.f23081c0) {
            o("Do not suppressLayout in layout or scroll");
            if (z6) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f23081c0 = true;
                this.f23082d0 = true;
                u1();
                return;
            }
            this.f23081c0 = false;
            if (this.f23079b0 && this.f23056O != null && this.f23054N != null) {
                requestLayout();
            }
            this.f23079b0 = false;
        }
    }

    void t(int i6, int i10) {
        boolean zIsFinished;
        android.widget.EdgeEffect edgeEffect = this.f23092n0;
        if (edgeEffect == null || edgeEffect.isFinished() || i6 <= 0) {
            zIsFinished = false;
        } else {
            this.f23092n0.onRelease();
            zIsFinished = this.f23092n0.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f23094p0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.f23094p0.onRelease();
            zIsFinished |= this.f23094p0.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f23093o0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f23093o0.onRelease();
            zIsFinished |= this.f23093o0.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f23095q0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f23095q0.onRelease();
            zIsFinished |= this.f23095q0.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.X.e0(this);
        }
    }

    public boolean t0() {
        return this.f23089k0 > 0;
    }

    public void t1(int i6) {
        getScrollingChildHelper().r(i6);
    }

    void u() {
        if (!this.f23072W || this.f23087i0) {
            androidx.core.os.s.a("RV FullInvalidate");
            B();
            androidx.core.os.s.b();
            return;
        }
        if (this.f23038F.p()) {
            if (this.f23038F.o(4) && !this.f23038F.o(11)) {
                androidx.core.os.s.a("RV PartialInvalidate");
                q1();
                G0();
                this.f23038F.s();
                if (!this.f23079b0) {
                    if (m0()) {
                        B();
                    } else {
                        this.f23038F.i();
                    }
                }
                s1(true);
                H0();
            } else {
                if (!this.f23038F.p()) {
                    return;
                }
                androidx.core.os.s.a("RV FullInvalidate");
                B();
            }
            androidx.core.os.s.b();
        }
    }

    public void u1() {
        setScrollState(0);
        v1();
    }

    void v0(int i6) {
        if (this.f23056O == null) {
            return;
        }
        setScrollState(2);
        this.f23056O.B1(i6);
        awakenScrollBars();
    }

    void w(int i6, int i10) {
        setMeasuredDimension(androidx.recyclerview.widget.RecyclerView.p.s(i6, getPaddingLeft() + getPaddingRight(), androidx.core.view.X.B(this)), androidx.recyclerview.widget.RecyclerView.p.s(i10, getPaddingTop() + getPaddingBottom(), androidx.core.view.X.A(this)));
    }

    void w0() {
        int iJ = this.f23040G.j();
        for (int i6 = 0; i6 < iJ; i6++) {
            ((androidx.recyclerview.widget.RecyclerView.q) this.f23040G.i(i6).getLayoutParams()).f23199c = true;
        }
        this.f23034D.s();
    }

    void w1(int i6, int i10, java.lang.Object obj) {
        int i11;
        int iJ = this.f23040G.j();
        int i12 = i6 + i10;
        for (int i13 = 0; i13 < iJ; i13++) {
            android.view.View viewI = this.f23040G.i(i13);
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(viewI);
            if (dF0 != null && !dF0.J() && (i11 = dF0.f23132c) >= i6 && i11 < i12) {
                dF0.b(2);
                dF0.a(obj);
                ((androidx.recyclerview.widget.RecyclerView.q) viewI.getLayoutParams()).f23199c = true;
            }
        }
        this.f23034D.M(i6, i10);
    }

    void x0() {
        int iJ = this.f23040G.j();
        for (int i6 = 0; i6 < iJ; i6++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = f0(this.f23040G.i(i6));
            if (dF0 != null && !dF0.J()) {
                dF0.b(6);
            }
        }
        w0();
        this.f23034D.t();
    }

    void y(android.view.View view) {
        int size;
        androidx.recyclerview.widget.RecyclerView.D dF0 = f0(view);
        E0(view);
        androidx.recyclerview.widget.RecyclerView.h hVar = this.f23054N;
        if (hVar != null && dF0 != null) {
            hVar.o(dF0);
        }
        java.util.List list = this.f23086h0;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        androidx.appcompat.app.D.a(this.f23086h0.get(size));
        throw null;
    }

    void z(android.view.View view) {
        int size;
        androidx.recyclerview.widget.RecyclerView.D dF0 = f0(view);
        F0(view);
        androidx.recyclerview.widget.RecyclerView.h hVar = this.f23054N;
        if (hVar != null && dF0 != null) {
            hVar.p(dF0);
        }
        java.util.List list = this.f23086h0;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        androidx.appcompat.app.D.a(this.f23086h0.get(size));
        throw null;
    }

    public void z0(int i6) {
        int iG = this.f23040G.g();
        for (int i10 = 0; i10 < iG; i10++) {
            this.f23040G.f(i10).offsetLeftAndRight(i6);
        }
    }
}
