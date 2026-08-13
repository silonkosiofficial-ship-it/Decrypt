package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class e implements androidx.emoji2.text.f.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.ThreadLocal f22250b = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.text.TextPaint f22251a;

    e() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f22251a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static java.lang.StringBuilder b() {
        java.lang.ThreadLocal threadLocal = f22250b;
        if (threadLocal.get() == null) {
            threadLocal.set(new java.lang.StringBuilder());
        }
        return (java.lang.StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        java.lang.StringBuilder sbB = b();
        sbB.setLength(0);
        while (i6 < i10) {
            sbB.append(charSequence.charAt(i6));
            i6++;
        }
        return androidx.core.graphics.g.a(this.f22251a, sbB.toString());
    }
}
