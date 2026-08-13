package O0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O0.i.a f7947e = new O0.i.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7948f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f7949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.text.BreakIterator f7952d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean a(int i6) {
            int type = java.lang.Character.getType(i6);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public i(java.lang.CharSequence charSequence, int i6, int i10, java.util.Locale locale) {
        this.f7949a = charSequence;
        if (i6 < 0 || i6 > charSequence.length()) {
            throw new java.lang.IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new java.lang.IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        this.f7952d = wordInstance;
        this.f7950b = java.lang.Math.max(0, i6 - 50);
        this.f7951c = java.lang.Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new N0.H(charSequence, i6, i10));
    }

    private final void a(int i6) {
        int i10 = this.f7950b;
        if (i6 > this.f7951c || i10 > i6) {
            throw new java.lang.IllegalArgumentException(("Invalid offset: " + i6 + ". Valid range is [" + this.f7950b + " , " + this.f7951c + ']').toString());
        }
    }

    private final int b(int i6, boolean z6) {
        a(i6);
        if (j(i6)) {
            return (!this.f7952d.isBoundary(i6) || (h(i6) && z6)) ? this.f7952d.preceding(i6) : i6;
        }
        if (h(i6)) {
            return this.f7952d.preceding(i6);
        }
        return -1;
    }

    private final int c(int i6, boolean z6) {
        a(i6);
        if (h(i6)) {
            return (!this.f7952d.isBoundary(i6) || (j(i6) && z6)) ? this.f7952d.following(i6) : i6;
        }
        if (j(i6)) {
            return this.f7952d.following(i6);
        }
        return -1;
    }

    private final boolean h(int i6) {
        return i6 <= this.f7951c && this.f7950b + 1 <= i6 && java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(this.f7949a, i6));
    }

    private final boolean j(int i6) {
        return i6 < this.f7951c && this.f7950b <= i6 && java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(this.f7949a, i6));
    }

    private final boolean l(int i6) {
        return !k(i6) && i(i6);
    }

    private final boolean m(int i6) {
        return k(i6) && !i(i6);
    }

    public final int d(int i6) {
        return c(i6, true);
    }

    public final int e(int i6) {
        return b(i6, true);
    }

    public final int f(int i6) {
        a(i6);
        while (i6 != -1 && !m(i6)) {
            i6 = o(i6);
        }
        return i6;
    }

    public final int g(int i6) {
        a(i6);
        while (i6 != -1 && !l(i6)) {
            i6 = n(i6);
        }
        return i6;
    }

    public final boolean i(int i6) {
        int i10 = this.f7950b + 1;
        if (i6 > this.f7951c || i10 > i6) {
            return false;
        }
        return f7947e.a(java.lang.Character.codePointBefore(this.f7949a, i6));
    }

    public final boolean k(int i6) {
        int i10 = this.f7950b;
        if (i6 >= this.f7951c || i10 > i6) {
            return false;
        }
        return f7947e.a(java.lang.Character.codePointAt(this.f7949a, i6));
    }

    public final int n(int i6) {
        a(i6);
        return this.f7952d.following(i6);
    }

    public final int o(int i6) {
        a(i6);
        return this.f7952d.preceding(i6);
    }
}
