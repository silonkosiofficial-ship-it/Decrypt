package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1935f extends androidx.compose.ui.platform.AbstractC1923b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1935f.a f20107c = new androidx.compose.ui.platform.C1935f.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static androidx.compose.ui.platform.C1935f f20108d;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.ui.platform.C1935f a() {
            if (androidx.compose.ui.platform.C1935f.f20108d == null) {
                androidx.compose.ui.platform.C1935f.f20108d = new androidx.compose.ui.platform.C1935f(null);
            }
            androidx.compose.ui.platform.C1935f c1935f = androidx.compose.ui.platform.C1935f.f20108d;
            p247y7.AbstractC7350t.d(c1935f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c1935f;
        }
    }

    private C1935f() {
    }

    public /* synthetic */ C1935f(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    private final boolean i(int i6) {
        return i6 > 0 && d().charAt(i6 + (-1)) != '\n' && (i6 == d().length() || d().charAt(i6) == '\n');
    }

    private final boolean j(int i6) {
        return d().charAt(i6) != '\n' && (i6 == 0 || d().charAt(i6 - 1) == '\n');
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
        while (i6 < length && d().charAt(i6) == '\n' && !j(i6)) {
            i6++;
        }
        if (i6 >= length) {
            return null;
        }
        int i10 = i6 + 1;
        while (i10 < length && !i(i10)) {
            i10++;
        }
        return c(i6, i10);
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
        while (i6 > 0 && d().charAt(i6 - 1) == '\n' && !i(i6)) {
            i6--;
        }
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        while (i10 > 0 && !j(i10)) {
            i10--;
        }
        return c(i10, i6);
    }
}
