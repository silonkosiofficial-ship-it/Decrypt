package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1908n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.TextView f18556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T1.f f18557b;

    C1908n(android.widget.TextView textView) {
        this.f18556a = textView;
        this.f18557b = new T1.f(textView, false);
    }

    android.text.InputFilter[] a(android.text.InputFilter[] inputFilterArr) {
        return this.f18557b.a(inputFilterArr);
    }

    void b(android.util.AttributeSet attributeSet, int i6) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.f18556a.getContext().obtainStyledAttributes(attributeSet, p090j.j.f48932g0, i6, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(p090j.j.f49002u0) ? typedArrayObtainStyledAttributes.getBoolean(p090j.j.f49002u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z6);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void c(boolean z6) {
        this.f18557b.b(z6);
    }

    void d(boolean z6) {
        this.f18557b.c(z6);
    }
}
