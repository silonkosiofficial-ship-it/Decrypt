package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1899e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f18462a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18467f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18464c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.widget.C1905k f18463b = androidx.appcompat.widget.C1905k.b();

    C1899e(android.view.View view) {
        this.f18462a = view;
    }

    private boolean a(android.graphics.drawable.Drawable drawable) {
        if (this.f18467f == null) {
            this.f18467f = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18467f;
        a0Var.a();
        android.content.res.ColorStateList colorStateListR = androidx.core.view.X.r(this.f18462a);
        if (colorStateListR != null) {
            a0Var.f18422d = true;
            a0Var.f18419a = colorStateListR;
        }
        android.graphics.PorterDuff.Mode modeS = androidx.core.view.X.s(this.f18462a);
        if (modeS != null) {
            a0Var.f18421c = true;
            a0Var.f18420b = modeS;
        }
        if (!a0Var.f18422d && !a0Var.f18421c) {
            return false;
        }
        androidx.appcompat.widget.C1905k.h(drawable, a0Var, this.f18462a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f18465d != null;
    }

    void b() {
        android.graphics.drawable.Drawable background = this.f18462a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            androidx.appcompat.widget.a0 a0Var = this.f18466e;
            if (a0Var != null) {
                androidx.appcompat.widget.C1905k.h(background, a0Var, this.f18462a.getDrawableState());
                return;
            }
            androidx.appcompat.widget.a0 a0Var2 = this.f18465d;
            if (a0Var2 != null) {
                androidx.appcompat.widget.C1905k.h(background, a0Var2, this.f18462a.getDrawableState());
            }
        }
    }

    android.content.res.ColorStateList c() {
        androidx.appcompat.widget.a0 a0Var = this.f18466e;
        if (a0Var != null) {
            return a0Var.f18419a;
        }
        return null;
    }

    android.graphics.PorterDuff.Mode d() {
        androidx.appcompat.widget.a0 a0Var = this.f18466e;
        if (a0Var != null) {
            return a0Var.f18420b;
        }
        return null;
    }

    void e(android.util.AttributeSet attributeSet, int i6) {
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(this.f18462a.getContext(), attributeSet, p090j.j.f49010v3, i6, 0);
        android.view.View view = this.f18462a;
        androidx.core.view.X.l0(view, view.getContext(), p090j.j.f49010v3, attributeSet, c0VarV.r(), i6, 0);
        try {
            if (c0VarV.s(p090j.j.f49015w3)) {
                this.f18464c = c0VarV.n(p090j.j.f49015w3, -1);
                android.content.res.ColorStateList colorStateListF = this.f18463b.f(this.f18462a.getContext(), this.f18464c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (c0VarV.s(p090j.j.f49020x3)) {
                androidx.core.view.X.s0(this.f18462a, c0VarV.c(p090j.j.f49020x3));
            }
            if (c0VarV.s(p090j.j.f49025y3)) {
                androidx.core.view.X.t0(this.f18462a, androidx.appcompat.widget.K.d(c0VarV.k(p090j.j.f49025y3, -1), null));
            }
        } finally {
            c0VarV.w();
        }
    }

    void f(android.graphics.drawable.Drawable drawable) {
        this.f18464c = -1;
        h(null);
        b();
    }

    void g(int i6) {
        this.f18464c = i6;
        androidx.appcompat.widget.C1905k c1905k = this.f18463b;
        h(c1905k != null ? c1905k.f(this.f18462a.getContext(), i6) : null);
        b();
    }

    void h(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f18465d == null) {
                this.f18465d = new androidx.appcompat.widget.a0();
            }
            androidx.appcompat.widget.a0 a0Var = this.f18465d;
            a0Var.f18419a = colorStateList;
            a0Var.f18422d = true;
        } else {
            this.f18465d = null;
        }
        b();
    }

    void i(android.content.res.ColorStateList colorStateList) {
        if (this.f18466e == null) {
            this.f18466e = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18466e;
        a0Var.f18419a = colorStateList;
        a0Var.f18422d = true;
        b();
    }

    void j(android.graphics.PorterDuff.Mode mode) {
        if (this.f18466e == null) {
            this.f18466e = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18466e;
        a0Var.f18420b = mode;
        a0Var.f18421c = true;
        b();
    }
}
