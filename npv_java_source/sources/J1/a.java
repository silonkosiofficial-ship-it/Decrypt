package J1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.C1990a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final android.graphics.Rect f5603n = new android.graphics.Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final J1.b.a f5604o = new J1.a.C0131a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final J1.b.InterfaceC0132b f5605p = new J1.a.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager f5610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.view.View f5611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private J1.a.c f5612j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.graphics.Rect f5606d = new android.graphics.Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.graphics.Rect f5607e = new android.graphics.Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.graphics.Rect f5608f = new android.graphics.Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f5609g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f5613k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f5614l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5615m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: J1.a$a, reason: collision with other inner class name */
    class C0131a implements J1.b.a {
        C0131a() {
        }

        @Override // J1.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1.B b6, android.graphics.Rect rect) {
            b6.m(rect);
        }
    }

    class b implements J1.b.InterfaceC0132b {
        b() {
        }

        @Override // J1.b.InterfaceC0132b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1.B a(p170r.Z z6, int i6) {
            return (C1.B) z6.p(i6);
        }

        @Override // J1.b.InterfaceC0132b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(p170r.Z z6) {
            return z6.n();
        }
    }

    private class c extends C1.E {
        c() {
        }

        @Override // C1.E
        public C1.B b(int i6) {
            return C1.B.a0(J1.a.this.H(i6));
        }

        @Override // C1.E
        public C1.B d(int i6) {
            int i10 = i6 == 2 ? J1.a.this.f5613k : J1.a.this.f5614l;
            if (i10 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i10);
        }

        @Override // C1.E
        public boolean f(int i6, int i10, android.os.Bundle bundle) {
            return J1.a.this.P(i6, i10, bundle);
        }
    }

    public a(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.f5611i = view;
        this.f5610h = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (androidx.core.view.X.x(view) == 0) {
            androidx.core.view.X.w0(view, 1);
        }
    }

    private static android.graphics.Rect D(android.view.View view, int i6, android.graphics.Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i6 == 17) {
            rect.set(width, 0, width, height);
        } else if (i6 == 33) {
            rect.set(0, height, width, height);
        } else if (i6 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i6 != 130) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(android.graphics.Rect rect) {
        if (rect == null || rect.isEmpty() || this.f5611i.getWindowVisibility() != 0) {
            return false;
        }
        android.view.View view = this.f5611i;
        do {
            java.lang.Object parent = view.getParent();
            if (!(parent instanceof android.view.View)) {
                return parent != null;
            }
            view = (android.view.View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int F(int i6) {
        if (i6 == 19) {
            return 33;
        }
        if (i6 != 21) {
            return i6 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i6, android.graphics.Rect rect) {
        java.lang.Object objD;
        p170r.Z zY = y();
        int i10 = this.f5614l;
        C1.B b6 = i10 == Integer.MIN_VALUE ? null : (C1.B) zY.e(i10);
        if (i6 == 1 || i6 == 2) {
            objD = J1.b.d(zY, f5605p, f5604o, b6, i6, androidx.core.view.X.z(this.f5611i) == 1, false);
        } else {
            if (i6 != 17 && i6 != 33 && i6 != 66 && i6 != 130) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            android.graphics.Rect rect2 = new android.graphics.Rect();
            int i11 = this.f5614l;
            if (i11 != Integer.MIN_VALUE) {
                z(i11, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f5611i, i6, rect2);
            }
            objD = J1.b.c(zY, f5605p, f5604o, b6, rect2, i6);
        }
        C1.B b10 = (C1.B) objD;
        return T(b10 != null ? zY.l(zY.k(b10)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i6, int i10, android.os.Bundle bundle) {
        if (i10 == 1) {
            return T(i6);
        }
        if (i10 == 2) {
            return o(i6);
        }
        if (i10 != 64) {
            return i10 != 128 ? J(i6, i10, bundle) : n(i6);
        }
        return S(i6);
    }

    private boolean R(int i6, android.os.Bundle bundle) {
        return androidx.core.view.X.c0(this.f5611i, i6, bundle);
    }

    private boolean S(int i6) {
        int i10;
        if (!this.f5610h.isEnabled() || !this.f5610h.isTouchExplorationEnabled() || (i10 = this.f5613k) == i6) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            n(i10);
        }
        this.f5613k = i6;
        this.f5611i.invalidate();
        U(i6, 32768);
        return true;
    }

    private void V(int i6) {
        int i10 = this.f5615m;
        if (i10 == i6) {
            return;
        }
        this.f5615m = i6;
        U(i6, 128);
        U(i10, 256);
    }

    private boolean n(int i6) {
        if (this.f5613k != i6) {
            return false;
        }
        this.f5613k = Integer.MIN_VALUE;
        this.f5611i.invalidate();
        U(i6, 65536);
        return true;
    }

    private boolean p() {
        int i6 = this.f5614l;
        return i6 != Integer.MIN_VALUE && J(i6, 16, null);
    }

    private android.view.accessibility.AccessibilityEvent q(int i6, int i10) {
        return i6 != -1 ? r(i6, i10) : s(i10);
    }

    private android.view.accessibility.AccessibilityEvent r(int i6, int i10) {
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i10);
        C1.B bH = H(i6);
        accessibilityEventObtain.getText().add(bH.C());
        accessibilityEventObtain.setContentDescription(bH.t());
        accessibilityEventObtain.setScrollable(bH.U());
        accessibilityEventObtain.setPassword(bH.T());
        accessibilityEventObtain.setEnabled(bH.N());
        accessibilityEventObtain.setChecked(bH.K());
        L(i6, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(bH.q());
        C1.F.c(accessibilityEventObtain, this.f5611i, i6);
        accessibilityEventObtain.setPackageName(this.f5611i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private android.view.accessibility.AccessibilityEvent s(int i6) {
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i6);
        this.f5611i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private C1.B t(int i6) {
        C1.B bZ = C1.B.Z();
        bZ.t0(true);
        bZ.v0(true);
        bZ.m0("android.view.View");
        android.graphics.Rect rect = f5603n;
        bZ.i0(rect);
        bZ.j0(rect);
        bZ.H0(this.f5611i);
        N(i6, bZ);
        if (bZ.C() == null && bZ.t() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bZ.m(this.f5607e);
        if (this.f5607e.equals(rect)) {
            throw new java.lang.RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = bZ.k();
        if ((iK & 64) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        bZ.F0(this.f5611i.getContext().getPackageName());
        bZ.Q0(this.f5611i, i6);
        if (this.f5613k == i6) {
            bZ.f0(true);
            bZ.a(128);
        } else {
            bZ.f0(false);
            bZ.a(64);
        }
        boolean z6 = this.f5614l == i6;
        if (z6) {
            bZ.a(2);
        } else if (bZ.O()) {
            bZ.a(1);
        }
        bZ.w0(z6);
        this.f5611i.getLocationOnScreen(this.f5609g);
        bZ.n(this.f5606d);
        if (this.f5606d.equals(rect)) {
            bZ.m(this.f5606d);
            if (bZ.f1215b != -1) {
                C1.B bZ2 = C1.B.Z();
                for (int i10 = bZ.f1215b; i10 != -1; i10 = bZ2.f1215b) {
                    bZ2.I0(this.f5611i, -1);
                    bZ2.i0(f5603n);
                    N(i10, bZ2);
                    bZ2.m(this.f5607e);
                    android.graphics.Rect rect2 = this.f5606d;
                    android.graphics.Rect rect3 = this.f5607e;
                    rect2.offset(rect3.left, rect3.top);
                }
                bZ2.d0();
            }
            this.f5606d.offset(this.f5609g[0] - this.f5611i.getScrollX(), this.f5609g[1] - this.f5611i.getScrollY());
        }
        if (this.f5611i.getLocalVisibleRect(this.f5608f)) {
            this.f5608f.offset(this.f5609g[0] - this.f5611i.getScrollX(), this.f5609g[1] - this.f5611i.getScrollY());
            if (this.f5606d.intersect(this.f5608f)) {
                bZ.j0(this.f5606d);
                if (E(this.f5606d)) {
                    bZ.Z0(true);
                }
            }
        }
        return bZ;
    }

    private C1.B u() {
        C1.B bB0 = C1.B.b0(this.f5611i);
        androidx.core.view.X.a0(this.f5611i, bB0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C(arrayList);
        if (bB0.p() > 0 && arrayList.size() > 0) {
            throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            bB0.d(this.f5611i, ((java.lang.Integer) arrayList.get(i6)).intValue());
        }
        return bB0;
    }

    private p170r.Z y() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C(arrayList);
        p170r.Z z6 = new p170r.Z();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            z6.m(((java.lang.Integer) arrayList.get(i6)).intValue(), t(((java.lang.Integer) arrayList.get(i6)).intValue()));
        }
        return z6;
    }

    private void z(int i6, android.graphics.Rect rect) {
        H(i6).m(rect);
    }

    public final int A() {
        return this.f5614l;
    }

    protected abstract int B(float f6, float f10);

    protected abstract void C(java.util.List list);

    C1.B H(int i6) {
        return i6 == -1 ? u() : t(i6);
    }

    public final void I(boolean z6, int i6, android.graphics.Rect rect) {
        int i10 = this.f5614l;
        if (i10 != Integer.MIN_VALUE) {
            o(i10);
        }
        if (z6) {
            G(i6, rect);
        }
    }

    protected abstract boolean J(int i6, int i10, android.os.Bundle bundle);

    protected void K(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i6, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(C1.B b6);

    protected abstract void N(int i6, C1.B b6);

    protected abstract void O(int i6, boolean z6);

    boolean P(int i6, int i10, android.os.Bundle bundle) {
        return i6 != -1 ? Q(i6, i10, bundle) : R(i10, bundle);
    }

    public final boolean T(int i6) {
        int i10;
        if ((!this.f5611i.isFocused() && !this.f5611i.requestFocus()) || (i10 = this.f5614l) == i6) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            o(i10);
        }
        if (i6 == Integer.MIN_VALUE) {
            return false;
        }
        this.f5614l = i6;
        O(i6, true);
        U(i6, 8);
        return true;
    }

    public final boolean U(int i6, int i10) {
        android.view.ViewParent parent;
        if (i6 == Integer.MIN_VALUE || !this.f5610h.isEnabled() || (parent = this.f5611i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f5611i, q(i6, i10));
    }

    @Override // androidx.core.view.C1990a
    public C1.E b(android.view.View view) {
        if (this.f5612j == null) {
            this.f5612j = new J1.a.c();
        }
        return this.f5612j;
    }

    @Override // androidx.core.view.C1990a
    public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.C1990a
    public void g(android.view.View view, C1.B b6) {
        super.g(view, b6);
        M(b6);
    }

    public final boolean o(int i6) {
        if (this.f5614l != i6) {
            return false;
        }
        this.f5614l = Integer.MIN_VALUE;
        O(i6, false);
        U(i6, 8);
        return true;
    }

    public final boolean v(android.view.MotionEvent motionEvent) {
        if (!this.f5610h.isEnabled() || !this.f5610h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f5615m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(android.view.KeyEvent keyEvent) {
        int i6 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z6 = false;
                    while (i6 < repeatCount && G(iF, null)) {
                        i6++;
                        z6 = true;
                    }
                    return z6;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f5613k;
    }
}
