package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1904j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.CompoundButton f18510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.ColorStateList f18511b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f18512c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18513d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18514e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18515f;

    C1904j(android.widget.CompoundButton compoundButton) {
        this.f18510a = compoundButton;
    }

    void a() {
        android.graphics.drawable.Drawable drawableA = androidx.core.widget.c.a(this.f18510a);
        if (drawableA != null) {
            if (this.f18513d || this.f18514e) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f18513d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f18511b);
                }
                if (this.f18514e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f18512c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f18510a.getDrawableState());
                }
                this.f18510a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i6) {
        return i6;
    }

    android.content.res.ColorStateList c() {
        return this.f18511b;
    }

    android.graphics.PorterDuff.Mode d() {
        return this.f18512c;
    }

    void e(android.util.AttributeSet attributeSet, int i6) {
        int iN;
        int iN2;
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(this.f18510a.getContext(), attributeSet, p090j.j.f48878U0, i6, 0);
        android.widget.CompoundButton compoundButton = this.f18510a;
        androidx.core.view.X.l0(compoundButton, compoundButton.getContext(), p090j.j.f48878U0, attributeSet, c0VarV.r(), i6, 0);
        try {
            if (c0VarV.s(p090j.j.f48886W0) && (iN2 = c0VarV.n(p090j.j.f48886W0, 0)) != 0) {
                try {
                    android.widget.CompoundButton compoundButton2 = this.f18510a;
                    compoundButton2.setButtonDrawable(p100k.a.b(compoundButton2.getContext(), iN2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    if (c0VarV.s(p090j.j.f48882V0)) {
                        android.widget.CompoundButton compoundButton3 = this.f18510a;
                        compoundButton3.setButtonDrawable(p100k.a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (c0VarV.s(p090j.j.f48882V0) && (iN = c0VarV.n(p090j.j.f48882V0, 0)) != 0) {
                android.widget.CompoundButton compoundButton4 = this.f18510a;
                compoundButton4.setButtonDrawable(p100k.a.b(compoundButton4.getContext(), iN));
            }
            if (c0VarV.s(p090j.j.f48890X0)) {
                androidx.core.widget.c.d(this.f18510a, c0VarV.c(p090j.j.f48890X0));
            }
            if (c0VarV.s(p090j.j.f48894Y0)) {
                androidx.core.widget.c.e(this.f18510a, androidx.appcompat.widget.K.d(c0VarV.k(p090j.j.f48894Y0, -1), null));
            }
        } finally {
            c0VarV.w();
        }
    }

    void f() {
        if (this.f18515f) {
            this.f18515f = false;
        } else {
            this.f18515f = true;
            a();
        }
    }

    void g(android.content.res.ColorStateList colorStateList) {
        this.f18511b = colorStateList;
        this.f18513d = true;
        a();
    }

    void h(android.graphics.PorterDuff.Mode mode) {
        this.f18512c = mode;
        this.f18514e = true;
        a();
    }
}
