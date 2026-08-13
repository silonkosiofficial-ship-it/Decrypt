package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1926c extends androidx.compose.ui.platform.AbstractC1923b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1926c.a f20084d = new androidx.compose.ui.platform.C1926c.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20085e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static androidx.compose.ui.platform.C1926c f20086f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.text.BreakIterator f20087c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.ui.platform.C1926c a(java.util.Locale locale) {
            if (androidx.compose.ui.platform.C1926c.f20086f == null) {
                androidx.compose.ui.platform.C1926c.f20086f = new androidx.compose.ui.platform.C1926c(locale, null);
            }
            androidx.compose.ui.platform.C1926c c1926c = androidx.compose.ui.platform.C1926c.f20086f;
            p247y7.AbstractC7350t.d(c1926c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c1926c;
        }
    }

    private C1926c(java.util.Locale locale) {
        i(locale);
    }

    public /* synthetic */ C1926c(java.util.Locale locale, p247y7.AbstractC7342k abstractC7342k) {
        this(locale);
    }

    private final void i(java.util.Locale locale) {
        this.f20087c = java.text.BreakIterator.getCharacterInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] a(int i6) {
        int length = d().length();
        if (length <= 0 || i6 >= length) {
            return null;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        do {
            java.text.BreakIterator breakIterator = this.f20087c;
            if (breakIterator == null) {
                p247y7.AbstractC7350t.p("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i6)) {
                java.text.BreakIterator breakIterator2 = this.f20087c;
                if (breakIterator2 == null) {
                    p247y7.AbstractC7350t.p("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i6);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i6, iFollowing);
            }
            java.text.BreakIterator breakIterator3 = this.f20087c;
            if (breakIterator3 == null) {
                p247y7.AbstractC7350t.p("impl");
                breakIterator3 = null;
            }
            i6 = breakIterator3.following(i6);
        } while (i6 != -1);
        return null;
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
        do {
            java.text.BreakIterator breakIterator = this.f20087c;
            if (breakIterator == null) {
                p247y7.AbstractC7350t.p("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i6)) {
                java.text.BreakIterator breakIterator2 = this.f20087c;
                if (breakIterator2 == null) {
                    p247y7.AbstractC7350t.p("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i6);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i6);
            }
            java.text.BreakIterator breakIterator3 = this.f20087c;
            if (breakIterator3 == null) {
                p247y7.AbstractC7350t.p("impl");
                breakIterator3 = null;
            }
            i6 = breakIterator3.preceding(i6);
        } while (i6 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC1923b
    public void e(java.lang.String str) {
        super.e(str);
        java.text.BreakIterator breakIterator = this.f20087c;
        if (breakIterator == null) {
            p247y7.AbstractC7350t.p("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
