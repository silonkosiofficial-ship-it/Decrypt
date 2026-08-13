package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1900f extends android.widget.Button implements androidx.core.widget.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18469C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C f18470D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.appcompat.widget.C1908n f18471E;

    public C1900f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48637n);
    }

    public C1900f(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18469C = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C c6 = new androidx.appcompat.widget.C(this);
        this.f18470D = c6;
        c6.m(attributeSet, i6);
        c6.b();
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    private androidx.appcompat.widget.C1908n getEmojiTextViewHelper() {
        if (this.f18471E == null) {
            this.f18471E = new androidx.appcompat.widget.C1908n(this);
        }
        return this.f18471E;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return super.getAutoSizeMaxTextSize();
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            return c6.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return super.getAutoSizeMinTextSize();
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            return c6.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return super.getAutoSizeStepGranularity();
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            return c6.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        return c6 != null ? c6.h() : new int[0];
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            return c6.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.p(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18470D.j();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18470D.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.o(z6, i6, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 == null || androidx.appcompat.widget.n0.f18559b || !c6.l()) {
            return;
        }
        this.f18470D.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i10, int i11, int i12) {
        if (androidx.appcompat.widget.n0.f18559b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i10, i11, i12);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.t(i6, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (androidx.appcompat.widget.n0.f18559b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.u(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (androidx.appcompat.widget.n0.f18559b) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.v(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.s(z6);
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18469C;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.f18470D.w(colorStateList);
        this.f18470D.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f18470D.x(mode);
        this.f18470D.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.q(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        if (androidx.appcompat.widget.n0.f18559b) {
            super.setTextSize(i6, f6);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18470D;
        if (c6 != null) {
            c6.A(i6, f6);
        }
    }
}
