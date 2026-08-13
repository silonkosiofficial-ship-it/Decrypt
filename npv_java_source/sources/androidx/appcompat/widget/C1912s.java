package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1912s extends android.widget.MultiAutoCompleteTextView implements androidx.core.widget.k {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f18571F = {android.R.attr.popupBackground};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18572C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C f18573D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.appcompat.widget.C1907m f18574E;

    public C1912s(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48636m);
    }

    public C1912s(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(getContext(), attributeSet, f18571F, i6, 0);
        if (c0VarV.s(0)) {
            setDropDownBackgroundDrawable(c0VarV.g(0));
        }
        c0VarV.w();
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18572C = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C c6 = new androidx.appcompat.widget.C(this);
        this.f18573D = c6;
        c6.m(attributeSet, i6);
        c6.b();
        androidx.appcompat.widget.C1907m c1907m = new androidx.appcompat.widget.C1907m(this);
        this.f18574E = c1907m;
        c1907m.c(attributeSet, i6);
        a(c1907m);
    }

    void a(androidx.appcompat.widget.C1907m c1907m) {
        android.text.method.KeyListener keyListener = getKeyListener();
        if (c1907m.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener keyListenerA = c1907m.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C c6 = this.f18573D;
        if (c6 != null) {
            c6.b();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18573D.j();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18573D.k();
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return this.f18574E.d(androidx.appcompat.widget.AbstractC1909o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18573D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18573D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i6) {
        setDropDownBackgroundDrawable(p100k.a.b(getContext(), i6));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f18574E.e(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.f18574E.a(keyListener));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18572C;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.f18573D.w(colorStateList);
        this.f18573D.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f18573D.x(mode);
        this.f18573D.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        androidx.appcompat.widget.C c6 = this.f18573D;
        if (c6 != null) {
            c6.q(context, i6);
        }
    }
}
