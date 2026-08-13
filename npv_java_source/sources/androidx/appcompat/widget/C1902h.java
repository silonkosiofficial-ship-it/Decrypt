package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1902h extends android.widget.CheckedTextView implements androidx.core.widget.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1903i f18499C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18500D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.appcompat.widget.C f18501E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.widget.C1908n f18502F;

    public C1902h(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48639p);
    }

    public C1902h(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C c6 = new androidx.appcompat.widget.C(this);
        this.f18501E = c6;
        c6.m(attributeSet, i6);
        c6.b();
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18500D = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C1903i c1903i = new androidx.appcompat.widget.C1903i(this);
        this.f18499C = c1903i;
        c1903i.d(attributeSet, i6);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    private androidx.appcompat.widget.C1908n getEmojiTextViewHelper() {
        if (this.f18502F == null) {
            this.f18502F = new androidx.appcompat.widget.C1908n(this);
        }
        return this.f18502F;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C c6 = this.f18501E;
        if (c6 != null) {
            c6.b();
        }
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C1903i c1903i = this.f18499C;
        if (c1903i != null) {
            c1903i.a();
        }
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.p(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
        androidx.appcompat.widget.C1903i c1903i = this.f18499C;
        if (c1903i != null) {
            return c1903i.b();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
        androidx.appcompat.widget.C1903i c1903i = this.f18499C;
        if (c1903i != null) {
            return c1903i.c();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18501E.j();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18501E.k();
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return androidx.appcompat.widget.AbstractC1909o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i6) {
        setCheckMarkDrawable(p100k.a.b(getContext(), i6));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        androidx.appcompat.widget.C1903i c1903i = this.f18499C;
        if (c1903i != null) {
            c1903i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18501E;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18501E;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18500D;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1903i c1903i = this.f18499C;
        if (c1903i != null) {
            c1903i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1903i c1903i = this.f18499C;
        if (c1903i != null) {
            c1903i.g(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.f18501E.w(colorStateList);
        this.f18501E.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f18501E.x(mode);
        this.f18501E.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        androidx.appcompat.widget.C c6 = this.f18501E;
        if (c6 != null) {
            c6.q(context, i6);
        }
    }
}
