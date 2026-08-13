package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.ViewParent f21646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.ViewParent f21647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.View f21648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f21650e;

    public C(android.view.View view) {
        this.f21648c = view;
    }

    private boolean g(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        android.view.ViewParent viewParentH;
        int i14;
        int i15;
        int[] iArr3;
        if (!l() || (viewParentH = h(i13)) == null) {
            return false;
        }
        if (i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f21648c.getLocationInWindow(iArr);
            i14 = iArr[0];
            i15 = iArr[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        androidx.core.view.AbstractC1999e0.d(viewParentH, this.f21648c, i6, i10, i11, i12, i13, iArr3);
        if (iArr != null) {
            this.f21648c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i14;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    private android.view.ViewParent h(int i6) {
        if (i6 == 0) {
            return this.f21646a;
        }
        if (i6 != 1) {
            return null;
        }
        return this.f21647b;
    }

    private int[] i() {
        if (this.f21650e == null) {
            this.f21650e = new int[2];
        }
        return this.f21650e;
    }

    private void n(int i6, android.view.ViewParent viewParent) {
        if (i6 == 0) {
            this.f21646a = viewParent;
        } else {
            if (i6 != 1) {
                return;
            }
            this.f21647b = viewParent;
        }
    }

    public boolean a(float f6, float f10, boolean z6) {
        android.view.ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return androidx.core.view.AbstractC1999e0.a(viewParentH, this.f21648c, f6, f10, z6);
    }

    public boolean b(float f6, float f10) {
        android.view.ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return androidx.core.view.AbstractC1999e0.b(viewParentH, this.f21648c, f6, f10);
    }

    public boolean c(int i6, int i10, int[] iArr, int[] iArr2) {
        return d(i6, i10, iArr, iArr2, 0);
    }

    public boolean d(int i6, int i10, int[] iArr, int[] iArr2, int i11) {
        android.view.ViewParent viewParentH;
        int i12;
        int i13;
        if (!l() || (viewParentH = h(i11)) == null) {
            return false;
        }
        if (i6 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f21648c.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        androidx.core.view.AbstractC1999e0.c(viewParentH, this.f21648c, i6, i10, iArr, i11);
        if (iArr2 != null) {
            this.f21648c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        g(i6, i10, i11, i12, iArr, i13, iArr2);
    }

    public boolean f(int i6, int i10, int i11, int i12, int[] iArr) {
        return g(i6, i10, i11, i12, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i6) {
        return h(i6) != null;
    }

    public boolean l() {
        return this.f21649d;
    }

    public void m(boolean z6) {
        if (this.f21649d) {
            androidx.core.view.X.J0(this.f21648c);
        }
        this.f21649d = z6;
    }

    public boolean o(int i6) {
        return p(i6, 0);
    }

    public boolean p(int i6, int i10) {
        if (k(i10)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        android.view.View view = this.f21648c;
        for (android.view.ViewParent parent = this.f21648c.getParent(); parent != null; parent = parent.getParent()) {
            if (androidx.core.view.AbstractC1999e0.f(parent, view, this.f21648c, i6, i10)) {
                n(i10, parent);
                androidx.core.view.AbstractC1999e0.e(parent, view, this.f21648c, i6, i10);
                return true;
            }
            if (parent instanceof android.view.View) {
                view = (android.view.View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i6) {
        android.view.ViewParent viewParentH = h(i6);
        if (viewParentH != null) {
            androidx.core.view.AbstractC1999e0.g(viewParentH, this.f21648c, i6);
            n(i6, null);
        }
    }
}
