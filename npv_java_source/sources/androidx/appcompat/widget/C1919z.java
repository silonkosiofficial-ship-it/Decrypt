package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1919z extends androidx.appcompat.widget.C1914u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.widget.SeekBar f18586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.content.res.ColorStateList f18588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f18589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18591i;

    C1919z(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.f18588f = null;
        this.f18589g = null;
        this.f18590h = false;
        this.f18591i = false;
        this.f18586d = seekBar;
    }

    private void f() {
        android.graphics.drawable.Drawable drawable = this.f18587e;
        if (drawable != null) {
            if (this.f18590h || this.f18591i) {
                android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f18587e = drawableR;
                if (this.f18590h) {
                    androidx.core.graphics.drawable.a.o(drawableR, this.f18588f);
                }
                if (this.f18591i) {
                    androidx.core.graphics.drawable.a.p(this.f18587e, this.f18589g);
                }
                if (this.f18587e.isStateful()) {
                    this.f18587e.setState(this.f18586d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1914u
    void c(android.util.AttributeSet attributeSet, int i6) {
        super.c(attributeSet, i6);
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(this.f18586d.getContext(), attributeSet, p090j.j.f48873T, i6, 0);
        android.widget.SeekBar seekBar = this.f18586d;
        androidx.core.view.X.l0(seekBar, seekBar.getContext(), p090j.j.f48873T, attributeSet, c0VarV.r(), i6, 0);
        android.graphics.drawable.Drawable drawableH = c0VarV.h(p090j.j.f48877U);
        if (drawableH != null) {
            this.f18586d.setThumb(drawableH);
        }
        j(c0VarV.g(p090j.j.f48881V));
        if (c0VarV.s(p090j.j.f48889X)) {
            this.f18589g = androidx.appcompat.widget.K.d(c0VarV.k(p090j.j.f48889X, -1), this.f18589g);
            this.f18591i = true;
        }
        if (c0VarV.s(p090j.j.f48885W)) {
            this.f18588f = c0VarV.c(p090j.j.f48885W);
            this.f18590h = true;
        }
        c0VarV.w();
        f();
    }

    void g(android.graphics.Canvas canvas) {
        if (this.f18587e != null) {
            int max = this.f18586d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f18587e.getIntrinsicWidth();
                int intrinsicHeight = this.f18587e.getIntrinsicHeight();
                int i6 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f18587e.setBounds(-i6, -i10, i6, i10);
                float width = ((this.f18586d.getWidth() - this.f18586d.getPaddingLeft()) - this.f18586d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f18586d.getPaddingLeft(), this.f18586d.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f18587e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        android.graphics.drawable.Drawable drawable = this.f18587e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f18586d.getDrawableState())) {
            this.f18586d.invalidateDrawable(drawable);
        }
    }

    void i() {
        android.graphics.drawable.Drawable drawable = this.f18587e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f18587e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18587e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f18586d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.X.z(this.f18586d));
            if (drawable.isStateful()) {
                drawable.setState(this.f18586d.getDrawableState());
            }
            f();
        }
        this.f18586d.invalidate();
    }
}
