package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1901g extends android.widget.CheckBox implements androidx.core.widget.j, androidx.core.widget.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1904j f18473C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18474D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.appcompat.widget.C f18475E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.widget.C1908n f18476F;

    public C1901g(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48638o);
    }

    public C1901g(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C1904j c1904j = new androidx.appcompat.widget.C1904j(this);
        this.f18473C = c1904j;
        c1904j.e(attributeSet, i6);
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18474D = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C c6 = new androidx.appcompat.widget.C(this);
        this.f18475E = c6;
        c6.m(attributeSet, i6);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    private androidx.appcompat.widget.C1908n getEmojiTextViewHelper() {
        if (this.f18476F == null) {
            this.f18476F = new androidx.appcompat.widget.C1908n(this);
        }
        return this.f18476F;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C c6 = this.f18475E;
        if (c6 != null) {
            c6.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        androidx.appcompat.widget.C1904j c1904j = this.f18473C;
        return c1904j != null ? c1904j.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public android.content.res.ColorStateList getSupportButtonTintList() {
        androidx.appcompat.widget.C1904j c1904j = this.f18473C;
        if (c1904j != null) {
            return c1904j.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        androidx.appcompat.widget.C1904j c1904j = this.f18473C;
        if (c1904j != null) {
            return c1904j.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18475E.j();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18475E.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(p100k.a.b(getContext(), i6));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        androidx.appcompat.widget.C1904j c1904j = this.f18473C;
        if (c1904j != null) {
            c1904j.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18475E;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18475E;
        if (c6 != null) {
            c6.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18474D;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1904j c1904j = this.f18473C;
        if (c1904j != null) {
            c1904j.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1904j c1904j = this.f18473C;
        if (c1904j != null) {
            c1904j.h(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.f18475E.w(colorStateList);
        this.f18475E.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f18475E.x(mode);
        this.f18475E.b();
    }
}
