package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1903i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.CheckedTextView f18503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.ColorStateList f18504b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f18505c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18506d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18507e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18508f;

    C1903i(android.widget.CheckedTextView checkedTextView) {
        this.f18503a = checkedTextView;
    }

    void a() {
        android.graphics.drawable.Drawable drawableA = androidx.core.widget.b.a(this.f18503a);
        if (drawableA != null) {
            if (this.f18506d || this.f18507e) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f18506d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f18504b);
                }
                if (this.f18507e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f18505c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f18503a.getDrawableState());
                }
                this.f18503a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    android.content.res.ColorStateList b() {
        return this.f18504b;
    }

    android.graphics.PorterDuff.Mode c() {
        return this.f18505c;
    }

    void d(android.util.AttributeSet attributeSet, int i6) {
        int iN;
        int iN2;
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(this.f18503a.getContext(), attributeSet, p090j.j.f48858P0, i6, 0);
        android.widget.CheckedTextView checkedTextView = this.f18503a;
        androidx.core.view.X.l0(checkedTextView, checkedTextView.getContext(), p090j.j.f48858P0, attributeSet, c0VarV.r(), i6, 0);
        try {
            if (c0VarV.s(p090j.j.f48866R0) && (iN2 = c0VarV.n(p090j.j.f48866R0, 0)) != 0) {
                try {
                    android.widget.CheckedTextView checkedTextView2 = this.f18503a;
                    checkedTextView2.setCheckMarkDrawable(p100k.a.b(checkedTextView2.getContext(), iN2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    if (c0VarV.s(p090j.j.f48862Q0)) {
                        android.widget.CheckedTextView checkedTextView3 = this.f18503a;
                        checkedTextView3.setCheckMarkDrawable(p100k.a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (c0VarV.s(p090j.j.f48862Q0) && (iN = c0VarV.n(p090j.j.f48862Q0, 0)) != 0) {
                android.widget.CheckedTextView checkedTextView4 = this.f18503a;
                checkedTextView4.setCheckMarkDrawable(p100k.a.b(checkedTextView4.getContext(), iN));
            }
            if (c0VarV.s(p090j.j.f48870S0)) {
                androidx.core.widget.b.b(this.f18503a, c0VarV.c(p090j.j.f48870S0));
            }
            if (c0VarV.s(p090j.j.f48874T0)) {
                androidx.core.widget.b.c(this.f18503a, androidx.appcompat.widget.K.d(c0VarV.k(p090j.j.f48874T0, -1), null));
            }
        } finally {
            c0VarV.w();
        }
    }

    void e() {
        if (this.f18508f) {
            this.f18508f = false;
        } else {
            this.f18508f = true;
            a();
        }
    }

    void f(android.content.res.ColorStateList colorStateList) {
        this.f18504b = colorStateList;
        this.f18506d = true;
        a();
    }

    void g(android.graphics.PorterDuff.Mode mode) {
        this.f18505c = mode;
        this.f18507e = true;
        a();
    }
}
