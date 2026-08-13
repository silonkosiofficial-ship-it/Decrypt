package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1907m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.EditText f18552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T1.a f18553b;

    C1907m(android.widget.EditText editText) {
        this.f18552a = editText;
        this.f18553b = new T1.a(editText, false);
    }

    android.text.method.KeyListener a(android.text.method.KeyListener keyListener) {
        return b(keyListener) ? this.f18553b.a(keyListener) : keyListener;
    }

    boolean b(android.text.method.KeyListener keyListener) {
        return !(keyListener instanceof android.text.method.NumberKeyListener);
    }

    void c(android.util.AttributeSet attributeSet, int i6) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.f18552a.getContext().obtainStyledAttributes(attributeSet, p090j.j.f48932g0, i6, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(p090j.j.f49002u0) ? typedArrayObtainStyledAttributes.getBoolean(p090j.j.f49002u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z6);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    android.view.inputmethod.InputConnection d(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return this.f18553b.b(inputConnection, editorInfo);
    }

    void e(boolean z6) {
        this.f18553b.c(z6);
    }
}
