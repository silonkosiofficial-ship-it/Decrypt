package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1906l extends android.widget.EditText implements androidx.core.view.I, androidx.core.widget.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18538C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C f18539D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.appcompat.widget.B f18540E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.core.widget.i f18541F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final androidx.appcompat.widget.C1907m f18542G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.appcompat.widget.C1906l.a f18543H;

    /* JADX INFO: renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public android.view.textclassifier.TextClassifier a() {
            return androidx.appcompat.widget.C1906l.super.getTextClassifier();
        }

        public void b(android.view.textclassifier.TextClassifier textClassifier) {
            androidx.appcompat.widget.C1906l.super.setTextClassifier(textClassifier);
        }
    }

    public C1906l(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48648y);
    }

    public C1906l(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18538C = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C c6 = new androidx.appcompat.widget.C(this);
        this.f18539D = c6;
        c6.m(attributeSet, i6);
        c6.b();
        this.f18540E = new androidx.appcompat.widget.B(this);
        this.f18541F = new androidx.core.widget.i();
        androidx.appcompat.widget.C1907m c1907m = new androidx.appcompat.widget.C1907m(this);
        this.f18542G = c1907m;
        c1907m.c(attributeSet, i6);
        d(c1907m);
    }

    private androidx.appcompat.widget.C1906l.a getSuperCaller() {
        if (this.f18543H == null) {
            this.f18543H = new androidx.appcompat.widget.C1906l.a();
        }
        return this.f18543H;
    }

    @Override // androidx.core.view.I
    public androidx.core.view.C1996d a(androidx.core.view.C1996d c1996d) {
        return this.f18541F.a(this, c1996d);
    }

    void d(androidx.appcompat.widget.C1907m c1907m) {
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
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C c6 = this.f18539D;
        if (c6 != null) {
            c6.b();
        }
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.p(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18539D.j();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18539D.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        androidx.appcompat.widget.B b6;
        return (android.os.Build.VERSION.SDK_INT >= 28 || (b6 = this.f18540E) == null) ? getSuperCaller().a() : b6.a();
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] strArrC;
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f18539D.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        android.view.inputmethod.InputConnection inputConnectionA = androidx.appcompat.widget.AbstractC1909o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && android.os.Build.VERSION.SDK_INT <= 30 && (strArrC = androidx.core.view.X.C(this)) != null) {
            F1.c.d(editorInfo, strArrC);
            inputConnectionA = F1.e.c(this, inputConnectionA, editorInfo);
        }
        return this.f18542G.d(inputConnectionA, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        if (androidx.appcompat.widget.AbstractC1917x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i6) {
        if (androidx.appcompat.widget.AbstractC1917x.b(this, i6)) {
            return true;
        }
        return super.onTextContextMenuItem(i6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18539D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.C c6 = this.f18539D;
        if (c6 != null) {
            c6.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f18542G.e(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.f18542G.a(keyListener));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18538C;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.f18539D.w(colorStateList);
        this.f18539D.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f18539D.x(mode);
        this.f18539D.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        androidx.appcompat.widget.C c6 = this.f18539D;
        if (c6 != null) {
            c6.q(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        androidx.appcompat.widget.B b6;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (b6 = this.f18540E) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b6.b(textClassifier);
        }
    }
}
