package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.focus.d.a f19669b = new androidx.compose.ui.focus.d.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f19670c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f19671d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f19672e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f19673f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f19674g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f19675h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f19676i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f19677j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19678a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return androidx.compose.ui.focus.d.f19675h;
        }

        public final int b() {
            return androidx.compose.ui.focus.d.f19676i;
        }

        public final int c() {
            return androidx.compose.ui.focus.d.f19677j;
        }

        public final int d() {
            return androidx.compose.ui.focus.d.f19672e;
        }

        public final int e() {
            return androidx.compose.ui.focus.d.f19670c;
        }

        public final int f() {
            return androidx.compose.ui.focus.d.f19671d;
        }

        public final int g() {
            return androidx.compose.ui.focus.d.f19673f;
        }

        public final int h() {
            return androidx.compose.ui.focus.d.f19674g;
        }
    }

    private /* synthetic */ d(int i6) {
        this.f19678a = i6;
    }

    public static final /* synthetic */ androidx.compose.ui.focus.d i(int i6) {
        return new androidx.compose.ui.focus.d(i6);
    }

    public static int j(int i6) {
        return i6;
    }

    public static boolean k(int i6, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.focus.d) && i6 == ((androidx.compose.ui.focus.d) obj).o();
    }

    public static final boolean l(int i6, int i10) {
        return i6 == i10;
    }

    public static int m(int i6) {
        return i6;
    }

    public static java.lang.String n(int i6) {
        if (l(i6, f19670c)) {
            return "Next";
        }
        if (l(i6, f19671d)) {
            return "Previous";
        }
        if (l(i6, f19672e)) {
            return "Left";
        }
        if (l(i6, f19673f)) {
            return "Right";
        }
        if (l(i6, f19674g)) {
            return "Up";
        }
        if (l(i6, f19675h)) {
            return "Down";
        }
        if (l(i6, f19676i)) {
            return "Enter";
        }
        return l(i6, f19677j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(java.lang.Object obj) {
        return k(this.f19678a, obj);
    }

    public int hashCode() {
        return m(this.f19678a);
    }

    public final /* synthetic */ int o() {
        return this.f19678a;
    }

    public java.lang.String toString() {
        return n(this.f19678a);
    }
}
