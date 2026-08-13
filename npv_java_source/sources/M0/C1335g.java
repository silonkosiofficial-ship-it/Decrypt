package M0;

/* JADX INFO: renamed from: M0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1335g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M0.C1335g.a f6714b = new M0.C1335g.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6715c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6716d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6717e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6718a;

    /* JADX INFO: renamed from: M0.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return M0.C1335g.f6717e;
        }

        public final int b() {
            return M0.C1335g.f6715c;
        }

        public final int c() {
            return M0.C1335g.f6716d;
        }
    }

    private /* synthetic */ C1335g(int i6) {
        this.f6718a = i6;
    }

    public static final /* synthetic */ M0.C1335g d(int i6) {
        return new M0.C1335g(i6);
    }

    private static int e(int i6) {
        return i6;
    }

    public static boolean f(int i6, java.lang.Object obj) {
        return (obj instanceof M0.C1335g) && i6 == ((M0.C1335g) obj).j();
    }

    public static final boolean g(int i6, int i10) {
        return i6 == i10;
    }

    public static int h(int i6) {
        return i6;
    }

    public static java.lang.String i(int i6) {
        if (i6 == f6715c) {
            return "EmojiSupportMatch.Default";
        }
        if (i6 == f6716d) {
            return "EmojiSupportMatch.None";
        }
        if (i6 == f6717e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return f(this.f6718a, obj);
    }

    public int hashCode() {
        return h(this.f6718a);
    }

    public final /* synthetic */ int j() {
        return this.f6718a;
    }

    public java.lang.String toString() {
        return i(this.f6718a);
    }
}
