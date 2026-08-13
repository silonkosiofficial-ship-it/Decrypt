package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1911q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.ImageView f18563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.widget.a0 f18566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18567e = 0;

    public C1911q(android.widget.ImageView imageView) {
        this.f18563a = imageView;
    }

    private boolean a(android.graphics.drawable.Drawable drawable) {
        if (this.f18566d == null) {
            this.f18566d = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18566d;
        a0Var.a();
        android.content.res.ColorStateList colorStateListA = androidx.core.widget.e.a(this.f18563a);
        if (colorStateListA != null) {
            a0Var.f18422d = true;
            a0Var.f18419a = colorStateListA;
        }
        android.graphics.PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f18563a);
        if (modeB != null) {
            a0Var.f18421c = true;
            a0Var.f18420b = modeB;
        }
        if (!a0Var.f18422d && !a0Var.f18421c) {
            return false;
        }
        androidx.appcompat.widget.C1905k.h(drawable, a0Var, this.f18563a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f18564b != null;
    }

    void b() {
        if (this.f18563a.getDrawable() != null) {
            this.f18563a.getDrawable().setLevel(this.f18567e);
        }
    }

    void c() {
        android.graphics.drawable.Drawable drawable = this.f18563a.getDrawable();
        if (drawable != null) {
            androidx.appcompat.widget.K.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            androidx.appcompat.widget.a0 a0Var = this.f18565c;
            if (a0Var != null) {
                androidx.appcompat.widget.C1905k.h(drawable, a0Var, this.f18563a.getDrawableState());
                return;
            }
            androidx.appcompat.widget.a0 a0Var2 = this.f18564b;
            if (a0Var2 != null) {
                androidx.appcompat.widget.C1905k.h(drawable, a0Var2, this.f18563a.getDrawableState());
            }
        }
    }

    android.content.res.ColorStateList d() {
        androidx.appcompat.widget.a0 a0Var = this.f18565c;
        if (a0Var != null) {
            return a0Var.f18419a;
        }
        return null;
    }

    android.graphics.PorterDuff.Mode e() {
        androidx.appcompat.widget.a0 a0Var = this.f18565c;
        if (a0Var != null) {
            return a0Var.f18420b;
        }
        return null;
    }

    boolean f() {
        return !(this.f18563a.getBackground() instanceof android.graphics.drawable.RippleDrawable);
    }

    public void g(android.util.AttributeSet attributeSet, int i6) {
        int iN;
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(this.f18563a.getContext(), attributeSet, p090j.j.f48857P, i6, 0);
        android.widget.ImageView imageView = this.f18563a;
        androidx.core.view.X.l0(imageView, imageView.getContext(), p090j.j.f48857P, attributeSet, c0VarV.r(), i6, 0);
        try {
            android.graphics.drawable.Drawable drawable = this.f18563a.getDrawable();
            if (drawable == null && (iN = c0VarV.n(p090j.j.f48861Q, -1)) != -1 && (drawable = p100k.a.b(this.f18563a.getContext(), iN)) != null) {
                this.f18563a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                androidx.appcompat.widget.K.b(drawable);
            }
            if (c0VarV.s(p090j.j.f48865R)) {
                androidx.core.widget.e.c(this.f18563a, c0VarV.c(p090j.j.f48865R));
            }
            if (c0VarV.s(p090j.j.f48869S)) {
                androidx.core.widget.e.d(this.f18563a, androidx.appcompat.widget.K.d(c0VarV.k(p090j.j.f48869S, -1), null));
            }
        } finally {
            c0VarV.w();
        }
    }

    void h(android.graphics.drawable.Drawable drawable) {
        this.f18567e = drawable.getLevel();
    }

    public void i(int i6) {
        if (i6 != 0) {
            android.graphics.drawable.Drawable drawableB = p100k.a.b(this.f18563a.getContext(), i6);
            if (drawableB != null) {
                androidx.appcompat.widget.K.b(drawableB);
            }
            this.f18563a.setImageDrawable(drawableB);
        } else {
            this.f18563a.setImageDrawable(null);
        }
        c();
    }

    void j(android.content.res.ColorStateList colorStateList) {
        if (this.f18565c == null) {
            this.f18565c = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18565c;
        a0Var.f18419a = colorStateList;
        a0Var.f18422d = true;
        c();
    }

    void k(android.graphics.PorterDuff.Mode mode) {
        if (this.f18565c == null) {
            this.f18565c = new androidx.appcompat.widget.a0();
        }
        androidx.appcompat.widget.a0 a0Var = this.f18565c;
        a0Var.f18420b = mode;
        a0Var.f18421c = true;
        c();
    }
}
