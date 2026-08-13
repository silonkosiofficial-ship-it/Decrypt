package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class t implements android.text.Spannable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f22344C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.text.Spannable f22345D;

    private static class a {
        static j$.util.stream.IntStream a(java.lang.CharSequence charSequence) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert(charSequence.chars());
        }

        static j$.util.stream.IntStream b(java.lang.CharSequence charSequence) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        }
    }

    static class b {
        b() {
        }

        boolean a(java.lang.CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.o;
        }
    }

    static class c extends androidx.emoji2.text.t.b {
        c() {
        }

        @Override // androidx.emoji2.text.t.b
        boolean a(java.lang.CharSequence charSequence) {
            return androidx.emoji2.text.u.a(charSequence) || (charSequence instanceof androidx.core.text.o);
        }
    }

    t(android.text.Spannable spannable) {
        this.f22345D = spannable;
    }

    t(java.lang.CharSequence charSequence) {
        this.f22345D = new android.text.SpannableString(charSequence);
    }

    private void a() {
        android.text.Spannable spannable = this.f22345D;
        if (!this.f22344C && c().a(spannable)) {
            this.f22345D = new android.text.SpannableString(spannable);
        }
        this.f22344C = true;
    }

    static androidx.emoji2.text.t.b c() {
        return android.os.Build.VERSION.SDK_INT < 28 ? new androidx.emoji2.text.t.b() : new androidx.emoji2.text.t.c();
    }

    android.text.Spannable b() {
        return this.f22345D;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        return this.f22345D.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public j$.util.stream.IntStream chars() {
        return androidx.emoji2.text.t.a.a(this.f22345D);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return j$.util.stream.IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public j$.util.stream.IntStream codePoints() {
        return androidx.emoji2.text.t.a.b(this.f22345D);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return j$.util.stream.IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        return this.f22345D.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        return this.f22345D.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        return this.f22345D.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public java.lang.Object[] getSpans(int i6, int i10, java.lang.Class cls) {
        return this.f22345D.getSpans(i6, i10, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f22345D.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i6, int i10, java.lang.Class cls) {
        return this.f22345D.nextSpanTransition(i6, i10, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        a();
        this.f22345D.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object obj, int i6, int i10, int i11) {
        a();
        this.f22345D.setSpan(obj, i6, i10, i11);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i6, int i10) {
        return this.f22345D.subSequence(i6, i10);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.f22345D.toString();
    }
}
