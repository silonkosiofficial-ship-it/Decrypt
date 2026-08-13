package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1941h extends androidx.compose.ui.platform.AbstractC1923b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1941h.a f20112d = new androidx.compose.ui.platform.C1941h.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20113e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static androidx.compose.ui.platform.C1941h f20114f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.text.BreakIterator f20115c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.ui.platform.C1941h a(java.util.Locale locale) {
            if (androidx.compose.ui.platform.C1941h.f20114f == null) {
                androidx.compose.ui.platform.C1941h.f20114f = new androidx.compose.ui.platform.C1941h(locale, null);
            }
            androidx.compose.ui.platform.C1941h c1941h = androidx.compose.ui.platform.C1941h.f20114f;
            p247y7.AbstractC7350t.d(c1941h, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c1941h;
        }
    }

    private C1941h(java.util.Locale locale) {
        l(locale);
    }

    public /* synthetic */ C1941h(java.util.Locale locale, p247y7.AbstractC7342k abstractC7342k) {
        this(locale);
    }

    private final boolean i(int i6) {
        return i6 > 0 && j(i6 + (-1)) && (i6 == d().length() || !j(i6));
    }

    private final boolean j(int i6) {
        if (i6 < 0 || i6 >= d().length()) {
            return false;
        }
        return java.lang.Character.isLetterOrDigit(d().codePointAt(i6));
    }

    private final boolean k(int i6) {
        return j(i6) && (i6 == 0 || !j(i6 - 1));
    }

    private final void l(java.util.Locale locale) {
        this.f20115c = java.text.BreakIterator.getWordInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] a(int i6) {
        if (d().length() <= 0 || i6 >= d().length()) {
            return null;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        while (!j(i6) && !k(i6)) {
            java.text.BreakIterator breakIterator = this.f20115c;
            if (breakIterator == null) {
                p247y7.AbstractC7350t.p("impl");
                breakIterator = null;
            }
            i6 = breakIterator.following(i6);
            if (i6 == -1) {
                return null;
            }
        }
        java.text.BreakIterator breakIterator2 = this.f20115c;
        if (breakIterator2 == null) {
            p247y7.AbstractC7350t.p("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i6);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i6, iFollowing);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] b(int i6) {
        int length = d().length();
        if (length <= 0 || i6 <= 0) {
            return null;
        }
        if (i6 > length) {
            i6 = length;
        }
        while (i6 > 0 && !j(i6 - 1) && !i(i6)) {
            java.text.BreakIterator breakIterator = this.f20115c;
            if (breakIterator == null) {
                p247y7.AbstractC7350t.p("impl");
                breakIterator = null;
            }
            i6 = breakIterator.preceding(i6);
            if (i6 == -1) {
                return null;
            }
        }
        java.text.BreakIterator breakIterator2 = this.f20115c;
        if (breakIterator2 == null) {
            p247y7.AbstractC7350t.p("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i6);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i6);
    }

    @Override // androidx.compose.ui.platform.AbstractC1923b
    public void e(java.lang.String str) {
        super.e(str);
        java.text.BreakIterator breakIterator = this.f20115c;
        if (breakIterator == null) {
            p247y7.AbstractC7350t.p("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
