package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class D extends android.widget.TextView implements androidx.core.widget.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C f18100D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.appcompat.widget.B f18101E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.widget.C1908n f18102F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f18103G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.appcompat.widget.D.a f18104H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.concurrent.Future f18105I;

    private interface a {
        void a(int[] iArr, int i6);

        int[] b();

        android.view.textclassifier.TextClassifier c();

        int d();

        void e(android.view.textclassifier.TextClassifier textClassifier);

        void f(int i6);

        void g(int i6, int i10, int i11, int i12);

        int h();

        int i();

        void j(int i6);

        int k();

        void l(int i6);
    }

    class b implements androidx.appcompat.widget.D.a {
        b() {
        }

        @Override // androidx.appcompat.widget.D.a
        public void a(int[] iArr, int i6) {
            androidx.appcompat.widget.D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        @Override // androidx.appcompat.widget.D.a
        public int[] b() {
            return androidx.appcompat.widget.D.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.D.a
        public android.view.textclassifier.TextClassifier c() {
            return androidx.appcompat.widget.D.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.D.a
        public int d() {
            return androidx.appcompat.widget.D.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void e(android.view.textclassifier.TextClassifier textClassifier) {
            androidx.appcompat.widget.D.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.D.a
        public void f(int i6) {
        }

        @Override // androidx.appcompat.widget.D.a
        public void g(int i6, int i10, int i11, int i12) {
            androidx.appcompat.widget.D.super.setAutoSizeTextTypeUniformWithConfiguration(i6, i10, i11, i12);
        }

        @Override // androidx.appcompat.widget.D.a
        public int h() {
            return androidx.appcompat.widget.D.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.D.a
        public int i() {
            return androidx.appcompat.widget.D.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void j(int i6) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int k() {
            return androidx.appcompat.widget.D.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.D.a
        public void l(int i6) {
            androidx.appcompat.widget.D.super.setAutoSizeTextTypeWithDefaults(i6);
        }
    }

    class c extends androidx.appcompat.widget.D.b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void f(int i6) {
            androidx.appcompat.widget.D.super.setLastBaselineToBottomHeight(i6);
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void j(int i6) {
            androidx.appcompat.widget.D.super.setFirstBaselineToTopHeight(i6);
        }
    }

    public D(android.content.Context context) {
        this(context, null);
    }

    public D(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public D(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        this.f18103G = false;
        this.f18104H = null;
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18099C = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C c6 = new androidx.appcompat.widget.C(this);
        this.f18100D = c6;
        c6.m(attributeSet, i6);
        c6.b();
        this.f18101E = new androidx.appcompat.widget.B(this);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    private void A() {
        java.util.concurrent.Future future = this.f18105I;
        if (future != null) {
            try {
                this.f18105I = null;
                androidx.appcompat.app.D.a(future.get());
                androidx.core.widget.h.m(this, null);
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
        }
    }

    private androidx.appcompat.widget.C1908n getEmojiTextViewHelper() {
        if (this.f18102F == null) {
            this.f18102F = new androidx.appcompat.widget.C1908n(this);
        }
        return this.f18102F;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return getSuperCaller().d();
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            return c6.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return getSuperCaller().i();
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            return c6.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return getSuperCaller().k();
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            return c6.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return getSuperCaller().b();
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        return c6 != null ? c6.h() : new int[0];
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.appcompat.widget.n0.f18559b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            return c6.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.h.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.h.c(this);
    }

    androidx.appcompat.widget.D.a getSuperCaller() {
        androidx.appcompat.widget.D.a bVar;
        if (this.f18104H == null) {
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                bVar = new androidx.appcompat.widget.D.c();
            } else if (i6 >= 26) {
                bVar = new androidx.appcompat.widget.D.b();
            }
            this.f18104H = bVar;
        }
        return this.f18104H;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18100D.j();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18100D.k();
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        A();
        return super.getText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        androidx.appcompat.widget.B b6;
        return (android.os.Build.VERSION.SDK_INT >= 28 || (b6 = this.f18101E) == null) ? getSuperCaller().c() : b6.a();
    }

    public androidx.core.text.o.a getTextMetricsParamsCompat() {
        return androidx.core.widget.h.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f18100D.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return androidx.appcompat.widget.AbstractC1909o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.o(z6, i6, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i6, int i10) {
        A();
        super.onMeasure(i6, i10);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 == null || androidx.appcompat.widget.n0.f18559b || !c6.l()) {
            return;
        }
        this.f18100D.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i10, int i11, int i12) {
        if (androidx.appcompat.widget.n0.f18559b) {
            getSuperCaller().g(i6, i10, i11, i12);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.t(i6, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (androidx.appcompat.widget.n0.f18559b) {
            getSuperCaller().a(iArr, i6);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.u(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (androidx.appcompat.widget.n0.f18559b) {
            getSuperCaller().l(i6);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.v(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? p100k.a.b(context, i6) : null, i10 != 0 ? p100k.a.b(context, i10) : null, i11 != 0 ? p100k.a.b(context, i11) : null, i12 != 0 ? p100k.a.b(context, i12) : null);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? p100k.a.b(context, i6) : null, i10 != 0 ? p100k.a.b(context, i10) : null, i11 != 0 ? p100k.a.b(context, i11) : null, i12 != 0 ? p100k.a.b(context, i12) : null);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18100D;
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

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i6);
        } else {
            androidx.core.widget.h.j(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i6);
        } else {
            androidx.core.widget.h.k(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        androidx.core.widget.h.l(this, i6);
    }

    public void setPrecomputedText(androidx.core.text.o oVar) {
        androidx.core.widget.h.m(this, oVar);
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18099C;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.f18100D.w(colorStateList);
        this.f18100D.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f18100D.x(mode);
        this.f18100D.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.q(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        androidx.appcompat.widget.B b6;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (b6 = this.f18101E) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            b6.b(textClassifier);
        }
    }

    public void setTextFuture(java.util.concurrent.Future<androidx.core.text.o> future) {
        this.f18105I = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(androidx.core.text.o.a aVar) {
        androidx.core.widget.h.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        if (androidx.appcompat.widget.n0.f18559b) {
            super.setTextSize(i6, f6);
            return;
        }
        androidx.appcompat.widget.C c6 = this.f18100D;
        if (c6 != null) {
            c6.A(i6, f6);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface, int i6) {
        if (this.f18103G) {
            return;
        }
        android.graphics.Typeface typefaceA = (typeface == null || i6 <= 0) ? null : androidx.core.graphics.i.a(getContext(), typeface, i6);
        this.f18103G = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.f18103G = false;
        }
    }
}
