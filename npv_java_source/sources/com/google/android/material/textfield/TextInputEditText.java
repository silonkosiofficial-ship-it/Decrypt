package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputEditText extends androidx.appcompat.widget.C1906l {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.graphics.Rect f43619I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f43620J;

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50521o);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(H4.a.c(context, attributeSet, i6, 0), attributeSet, i6);
        this.f43619I = new android.graphics.Rect();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, attributeSet, p125m4.j.f50822N5, i6, p125m4.i.f50699f, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayI.getBoolean(p125m4.j.f50830O5, false));
        typedArrayI.recycle();
    }

    private boolean e(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f43620J;
    }

    private java.lang.CharSequence getHintFromLayout() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        super.getFocusedRect(rect);
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f43619I);
        rect.bottom = this.f43619I.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(android.graphics.Rect rect, android.graphics.Point point) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.R()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C1906l, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(android.graphics.Rect rect) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f43619I.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f43619I);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z6) {
        this.f43620J = z6;
    }
}
