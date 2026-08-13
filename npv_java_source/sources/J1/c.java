package J1;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final android.view.animation.Interpolator f5621x = new J1.c.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5623b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f5625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f5626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f5627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f5628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f5629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f5630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f5631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.view.VelocityTracker f5633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f5634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f5635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f5637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private android.widget.OverScroller f5639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final J1.c.AbstractC0133c f5640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private android.view.View f5641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final android.view.ViewGroup f5643v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5624c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final java.lang.Runnable f5644w = new J1.c.b();

    class a implements android.view.animation.Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f10 = f6 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            J1.c.this.E(0);
        }
    }

    /* JADX INFO: renamed from: J1.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0133c {
        public abstract int a(android.view.View view, int i6, int i10);

        public abstract int b(android.view.View view, int i6, int i10);

        public int c(int i6) {
            return i6;
        }

        public int d(android.view.View view) {
            return 0;
        }

        public int e(android.view.View view) {
            return 0;
        }

        public void f(int i6, int i10) {
        }

        public boolean g(int i6) {
            return false;
        }

        public void h(int i6, int i10) {
        }

        public void i(android.view.View view, int i6) {
        }

        public abstract void j(int i6);

        public abstract void k(android.view.View view, int i6, int i10, int i11, int i12);

        public abstract void l(android.view.View view, float f6, float f10);

        public abstract boolean m(android.view.View view, int i6);
    }

    private c(android.content.Context context, android.view.ViewGroup viewGroup, J1.c.AbstractC0133c abstractC0133c) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0133c == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f5643v = viewGroup;
        this.f5640s = abstractC0133c;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int i6 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5637p = i6;
        this.f5636o = i6;
        this.f5623b = viewConfiguration.getScaledTouchSlop();
        this.f5634m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5635n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5639r = new android.widget.OverScroller(context, f5621x);
    }

    private void A() {
        this.f5633l.computeCurrentVelocity(1000, this.f5634m);
        n(e(this.f5633l.getXVelocity(this.f5624c), this.f5635n, this.f5634m), e(this.f5633l.getYVelocity(this.f5624c), this.f5635n, this.f5634m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [J1.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void B(float f6, float f10, int i6) {
        int i10;
        boolean zC = c(f6, f10, i6, 1);
        ?? r6 = zC;
        if (c(f10, f6, i6, 4)) {
            r6 = (zC ? 1 : 0) | 4;
        }
        ?? r10 = r6;
        if (c(f6, f10, i6, 2)) {
            r10 = (r6 == true ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (c(f10, f6, i6, 8)) {
            i10 = (r10 == true ? 1 : 0) | 8;
        }
        if (r11 == 0) {
            r11 = i10;
            return;
        }
        r11 = i10;
        int[] iArr = this.f5630i;
        iArr[i6] = (iArr[i6] | r11) == true ? 1 : 0;
        this.f5640s.f(r11, i6);
    }

    private void C(float f6, float f10, int i6) {
        q(i6);
        float[] fArr = this.f5625d;
        this.f5627f[i6] = f6;
        fArr[i6] = f6;
        float[] fArr2 = this.f5626e;
        this.f5628g[i6] = f10;
        fArr2[i6] = f10;
        this.f5629h[i6] = t((int) f6, (int) f10);
        this.f5632k |= 1 << i6;
    }

    private void D(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (x(pointerId)) {
                float x6 = motionEvent.getX(i6);
                float y6 = motionEvent.getY(i6);
                this.f5627f[pointerId] = x6;
                this.f5628g[pointerId] = y6;
            }
        }
    }

    private boolean c(float f6, float f10, int i6, int i10) {
        float fAbs = java.lang.Math.abs(f6);
        float fAbs2 = java.lang.Math.abs(f10);
        if ((this.f5629h[i6] & i10) != i10 || (this.f5638q & i10) == 0 || (this.f5631j[i6] & i10) == i10 || (this.f5630i[i6] & i10) == i10) {
            return false;
        }
        int i11 = this.f5623b;
        if (fAbs <= i11 && fAbs2 <= i11) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f5640s.g(i10)) {
            return (this.f5630i[i6] & i10) == 0 && fAbs > ((float) this.f5623b);
        }
        int[] iArr = this.f5631j;
        iArr[i6] = iArr[i6] | i10;
        return false;
    }

    private boolean d(android.view.View view, float f6, float f10) {
        if (view == null) {
            return false;
        }
        boolean z6 = this.f5640s.d(view) > 0;
        boolean z10 = this.f5640s.e(view) > 0;
        if (z6 && z10) {
            float f11 = (f6 * f6) + (f10 * f10);
            int i6 = this.f5623b;
            return f11 > ((float) (i6 * i6));
        }
        if (z6) {
            return java.lang.Math.abs(f6) > ((float) this.f5623b);
        }
        return z10 && java.lang.Math.abs(f10) > ((float) this.f5623b);
    }

    private float e(float f6, float f10, float f11) {
        float fAbs = java.lang.Math.abs(f6);
        if (fAbs < f10) {
            return 0.0f;
        }
        if (fAbs > f11) {
            return f6 > 0.0f ? f11 : -f11;
        }
        return f6;
    }

    private int f(int i6, int i10, int i11) {
        int iAbs = java.lang.Math.abs(i6);
        if (iAbs < i10) {
            return 0;
        }
        if (iAbs > i11) {
            return i6 > 0 ? i11 : -i11;
        }
        return i6;
    }

    private void g() {
        float[] fArr = this.f5625d;
        if (fArr == null) {
            return;
        }
        java.util.Arrays.fill(fArr, 0.0f);
        java.util.Arrays.fill(this.f5626e, 0.0f);
        java.util.Arrays.fill(this.f5627f, 0.0f);
        java.util.Arrays.fill(this.f5628g, 0.0f);
        java.util.Arrays.fill(this.f5629h, 0);
        java.util.Arrays.fill(this.f5630i, 0);
        java.util.Arrays.fill(this.f5631j, 0);
        this.f5632k = 0;
    }

    private void h(int i6) {
        if (this.f5625d == null || !w(i6)) {
            return;
        }
        this.f5625d[i6] = 0.0f;
        this.f5626e[i6] = 0.0f;
        this.f5627f[i6] = 0.0f;
        this.f5628g[i6] = 0.0f;
        this.f5629h[i6] = 0;
        this.f5630i[i6] = 0;
        this.f5631j[i6] = 0;
        this.f5632k = (~(1 << i6)) & this.f5632k;
    }

    private int i(int i6, int i10, int i11) {
        if (i6 == 0) {
            return 0;
        }
        int width = this.f5643v.getWidth();
        float f6 = width / 2;
        float fO = f6 + (o(java.lang.Math.min(1.0f, java.lang.Math.abs(i6) / width)) * f6);
        int iAbs = java.lang.Math.abs(i10);
        return java.lang.Math.min(iAbs > 0 ? java.lang.Math.round(java.lang.Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i6) / i11) + 1.0f) * 256.0f), 600);
    }

    private int j(android.view.View view, int i6, int i10, int i11, int i12) {
        float f6;
        float f10;
        float f11;
        float f12;
        int iF = f(i11, (int) this.f5635n, (int) this.f5634m);
        int iF2 = f(i12, (int) this.f5635n, (int) this.f5634m);
        int iAbs = java.lang.Math.abs(i6);
        int iAbs2 = java.lang.Math.abs(i10);
        int iAbs3 = java.lang.Math.abs(iF);
        int iAbs4 = java.lang.Math.abs(iF2);
        int i13 = iAbs3 + iAbs4;
        int i14 = iAbs + iAbs2;
        if (iF != 0) {
            f6 = iAbs3;
            f10 = i13;
        } else {
            f6 = iAbs;
            f10 = i14;
        }
        float f13 = f6 / f10;
        if (iF2 != 0) {
            f11 = iAbs4;
            f12 = i13;
        } else {
            f11 = iAbs2;
            f12 = i14;
        }
        return (int) ((i(i6, iF, this.f5640s.d(view)) * f13) + (i(i10, iF2, this.f5640s.e(view)) * (f11 / f12)));
    }

    public static J1.c l(android.view.ViewGroup viewGroup, float f6, J1.c.AbstractC0133c abstractC0133c) {
        J1.c cVarM = m(viewGroup, abstractC0133c);
        cVarM.f5623b = (int) (cVarM.f5623b * (1.0f / f6));
        return cVarM;
    }

    public static J1.c m(android.view.ViewGroup viewGroup, J1.c.AbstractC0133c abstractC0133c) {
        return new J1.c(viewGroup.getContext(), viewGroup, abstractC0133c);
    }

    private void n(float f6, float f10) {
        this.f5642u = true;
        this.f5640s.l(this.f5641t, f6, f10);
        this.f5642u = false;
        if (this.f5622a == 1) {
            E(0);
        }
    }

    private float o(float f6) {
        return (float) java.lang.Math.sin((f6 - 0.5f) * 0.47123894f);
    }

    private void p(int i6, int i10, int i11, int i12) {
        int left = this.f5641t.getLeft();
        int top = this.f5641t.getTop();
        if (i11 != 0) {
            i6 = this.f5640s.a(this.f5641t, i6, i11);
            androidx.core.view.X.X(this.f5641t, i6 - left);
        }
        int i13 = i6;
        if (i12 != 0) {
            i10 = this.f5640s.b(this.f5641t, i10, i12);
            androidx.core.view.X.Y(this.f5641t, i10 - top);
        }
        int i14 = i10;
        if (i11 == 0 && i12 == 0) {
            return;
        }
        this.f5640s.k(this.f5641t, i13, i14, i13 - left, i14 - top);
    }

    private void q(int i6) {
        float[] fArr = this.f5625d;
        if (fArr == null || fArr.length <= i6) {
            int i10 = i6 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5626e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5627f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5628g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5629h;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5630i;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5631j;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5625d = fArr2;
            this.f5626e = fArr3;
            this.f5627f = fArr4;
            this.f5628g = fArr5;
            this.f5629h = iArr;
            this.f5630i = iArr2;
            this.f5631j = iArr3;
        }
    }

    private boolean s(int i6, int i10, int i11, int i12) {
        int left = this.f5641t.getLeft();
        int top = this.f5641t.getTop();
        int i13 = i6 - left;
        int i14 = i10 - top;
        if (i13 == 0 && i14 == 0) {
            this.f5639r.abortAnimation();
            E(0);
            return false;
        }
        this.f5639r.startScroll(left, top, i13, i14, j(this.f5641t, i13, i14, i11, i12));
        E(2);
        return true;
    }

    private int t(int i6, int i10) {
        int i11 = i6 < this.f5643v.getLeft() + this.f5636o ? 1 : 0;
        if (i10 < this.f5643v.getTop() + this.f5636o) {
            i11 |= 4;
        }
        if (i6 > this.f5643v.getRight() - this.f5636o) {
            i11 |= 2;
        }
        return i10 > this.f5643v.getBottom() - this.f5636o ? i11 | 8 : i11;
    }

    private boolean x(int i6) {
        if (w(i6)) {
            return true;
        }
        java.lang.String str = "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.";
        return false;
    }

    void E(int i6) {
        this.f5643v.removeCallbacks(this.f5644w);
        if (this.f5622a != i6) {
            this.f5622a = i6;
            this.f5640s.j(i6);
            if (this.f5622a == 0) {
                this.f5641t = null;
            }
        }
    }

    public boolean F(int i6, int i10) {
        if (this.f5642u) {
            return s(i6, i10, (int) this.f5633l.getXVelocity(this.f5624c), (int) this.f5633l.getYVelocity(this.f5624c));
        }
        throw new java.lang.IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    public boolean G(android.view.MotionEvent motionEvent) {
        boolean z6;
        android.view.View viewR;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f5633l == null) {
            this.f5633l = android.view.VelocityTracker.obtain();
        }
        this.f5633l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                a();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    a();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x6 = motionEvent.getX(actionIndex);
                    float y6 = motionEvent.getY(actionIndex);
                    C(x6, y6, pointerId);
                    int i6 = this.f5622a;
                    if (i6 == 0) {
                        int i10 = this.f5629h[pointerId];
                        int i11 = this.f5638q;
                        if ((i10 & i11) != 0) {
                            this.f5640s.h(i10 & i11, pointerId);
                        }
                    } else if (i6 == 2 && (viewR = r((int) x6, (int) y6)) == this.f5641t) {
                        I(viewR, pointerId);
                    }
                } else if (actionMasked == 6) {
                    h(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f5625d != null && this.f5626e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    int pointerId2 = motionEvent.getPointerId(i12);
                    if (x(pointerId2)) {
                        float x10 = motionEvent.getX(i12);
                        float y10 = motionEvent.getY(i12);
                        float f6 = x10 - this.f5625d[pointerId2];
                        float f10 = y10 - this.f5626e[pointerId2];
                        android.view.View viewR2 = r((int) x10, (int) y10);
                        boolean z10 = viewR2 != null && d(viewR2, f6, f10);
                        if (!z10) {
                            B(f6, f10, pointerId2);
                            if (this.f5622a != 1) {
                                break;
                            }
                        } else {
                            int left = viewR2.getLeft();
                            int i13 = (int) f6;
                            int iA = this.f5640s.a(viewR2, left + i13, i13);
                            int top = viewR2.getTop();
                            int i14 = (int) f10;
                            int iB = this.f5640s.b(viewR2, top + i14, i14);
                            int iD = this.f5640s.d(viewR2);
                            int iE = this.f5640s.e(viewR2);
                            if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                                break;
                            }
                            B(f6, f10, pointerId2);
                            if (this.f5622a != 1 || (z10 && I(viewR2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                D(motionEvent);
            }
            z6 = false;
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            z6 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            C(x11, y11, pointerId3);
            android.view.View viewR3 = r((int) x11, (int) y11);
            if (viewR3 == this.f5641t && this.f5622a == 2) {
                I(viewR3, pointerId3);
            }
            int i15 = this.f5629h[pointerId3];
            int i16 = this.f5638q;
            if ((i15 & i16) != 0) {
                this.f5640s.h(i15 & i16, pointerId3);
            }
        }
        if (this.f5622a == 1) {
            return true;
        }
        return z6;
    }

    public boolean H(android.view.View view, int i6, int i10) {
        this.f5641t = view;
        this.f5624c = -1;
        boolean zS = s(i6, i10, 0, 0);
        if (!zS && this.f5622a == 0 && this.f5641t != null) {
            this.f5641t = null;
        }
        return zS;
    }

    boolean I(android.view.View view, int i6) {
        if (view == this.f5641t && this.f5624c == i6) {
            return true;
        }
        if (view == null || !this.f5640s.m(view, i6)) {
            return false;
        }
        this.f5624c = i6;
        b(view, i6);
        return true;
    }

    public void a() {
        this.f5624c = -1;
        g();
        android.view.VelocityTracker velocityTracker = this.f5633l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5633l = null;
        }
    }

    public void b(android.view.View view, int i6) {
        if (view.getParent() == this.f5643v) {
            this.f5641t = view;
            this.f5624c = i6;
            this.f5640s.i(view, i6);
            E(1);
            return;
        }
        throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5643v + ")");
    }

    public boolean k(boolean z6) {
        if (this.f5622a == 2) {
            boolean zComputeScrollOffset = this.f5639r.computeScrollOffset();
            int currX = this.f5639r.getCurrX();
            int currY = this.f5639r.getCurrY();
            int left = currX - this.f5641t.getLeft();
            int top = currY - this.f5641t.getTop();
            if (left != 0) {
                androidx.core.view.X.X(this.f5641t, left);
            }
            if (top != 0) {
                androidx.core.view.X.Y(this.f5641t, top);
            }
            if (left != 0 || top != 0) {
                this.f5640s.k(this.f5641t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f5639r.getFinalX() && currY == this.f5639r.getFinalY()) {
                this.f5639r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z6) {
                    this.f5643v.post(this.f5644w);
                } else {
                    E(0);
                }
            }
        }
        return this.f5622a == 2;
    }

    public android.view.View r(int i6, int i10) {
        for (int childCount = this.f5643v.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = this.f5643v.getChildAt(this.f5640s.c(childCount));
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f5623b;
    }

    public boolean v(int i6, int i10) {
        return y(this.f5641t, i6, i10);
    }

    public boolean w(int i6) {
        return ((1 << i6) & this.f5632k) != 0;
    }

    public boolean y(android.view.View view, int i6, int i10) {
        return view != null && i6 >= view.getLeft() && i6 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom();
    }

    public void z(android.view.MotionEvent motionEvent) {
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f5633l == null) {
            this.f5633l = android.view.VelocityTracker.obtain();
        }
        this.f5633l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View viewR = r((int) x6, (int) y6);
            C(x6, y6, pointerId);
            I(viewR, pointerId);
            int i11 = this.f5629h[pointerId];
            int i12 = this.f5638q;
            if ((i11 & i12) != 0) {
                this.f5640s.h(i11 & i12, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f5622a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i10 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i10);
                        if (x(pointerId2)) {
                            float x10 = motionEvent.getX(i10);
                            float y10 = motionEvent.getY(i10);
                            float f6 = x10 - this.f5625d[pointerId2];
                            float f10 = y10 - this.f5626e[pointerId2];
                            B(f6, f10, pointerId2);
                            if (this.f5622a != 1) {
                                android.view.View viewR2 = r((int) x10, (int) y10);
                                if (d(viewR2, f6, f10) && I(viewR2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                } else {
                    if (!x(this.f5624c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5624c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f5627f;
                    int i13 = this.f5624c;
                    int i14 = (int) (x11 - fArr[i13]);
                    int i15 = (int) (y11 - this.f5628g[i13]);
                    p(this.f5641t.getLeft() + i14, this.f5641t.getTop() + i15, i14, i15);
                }
                D(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x12 = motionEvent.getX(actionIndex);
                    float y12 = motionEvent.getY(actionIndex);
                    C(x12, y12, pointerId3);
                    if (this.f5622a != 0) {
                        if (v((int) x12, (int) y12)) {
                            I(this.f5641t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        I(r((int) x12, (int) y12), pointerId3);
                        int i16 = this.f5629h[pointerId3];
                        int i17 = this.f5638q;
                        if ((i16 & i17) != 0) {
                            this.f5640s.h(i16 & i17, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f5622a == 1 && pointerId4 == this.f5624c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i10 >= pointerCount2) {
                            i6 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i10);
                        if (pointerId5 != this.f5624c) {
                            android.view.View viewR3 = r((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                            android.view.View view = this.f5641t;
                            if (viewR3 == view && I(view, pointerId5)) {
                                i6 = this.f5624c;
                                break;
                            }
                        }
                        i10++;
                    }
                    if (i6 == -1) {
                        A();
                    }
                }
                h(pointerId4);
                return;
            }
            if (this.f5622a == 1) {
                n(0.0f, 0.0f);
            }
        } else if (this.f5622a == 1) {
            A();
        }
        a();
    }
}
