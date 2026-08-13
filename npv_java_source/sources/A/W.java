package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A.W.a f63a = new A.W.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f64b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f65c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f66d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f69g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f70h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f71i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f72j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f73k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f74l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f75m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return A.W.f64b;
        }

        public final int b() {
            return A.W.f66d;
        }

        public final int c() {
            return A.W.f65c;
        }

        public final int d() {
            return A.W.f67e;
        }

        public final int e() {
            return A.W.f71i;
        }

        public final int f() {
            return A.W.f74l;
        }

        public final int g() {
            return A.W.f70h;
        }
    }

    static {
        int iH = h(8);
        f64b = iH;
        int iH2 = h(4);
        f65c = iH2;
        int iH3 = h(2);
        f66d = iH3;
        int iH4 = h(1);
        f67e = iH4;
        f68f = l(iH, iH4);
        f69g = l(iH2, iH3);
        int iH5 = h(16);
        f70h = iH5;
        int iH6 = h(32);
        f71i = iH6;
        int iL = l(iH, iH3);
        f72j = iL;
        int iL2 = l(iH2, iH4);
        f73k = iL2;
        f74l = l(iL, iL2);
        f75m = l(iH5, iH6);
    }

    private static int h(int i6) {
        return i6;
    }

    public static final boolean i(int i6, int i10) {
        return i6 == i10;
    }

    public static final boolean j(int i6, int i10) {
        return (i6 & i10) != 0;
    }

    public static int k(int i6) {
        return i6;
    }

    public static final int l(int i6, int i10) {
        return h(i6 | i10);
    }

    public static java.lang.String m(int i6) {
        return "WindowInsetsSides(" + n(i6) + ')';
    }

    private static final java.lang.String n(int i6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i10 = f68f;
        if ((i6 & i10) == i10) {
            o(sb, "Start");
        }
        int i11 = f72j;
        if ((i6 & i11) == i11) {
            o(sb, "Left");
        }
        int i12 = f70h;
        if ((i6 & i12) == i12) {
            o(sb, "Top");
        }
        int i13 = f69g;
        if ((i6 & i13) == i13) {
            o(sb, "End");
        }
        int i14 = f73k;
        if ((i6 & i14) == i14) {
            o(sb, "Right");
        }
        int i15 = f71i;
        if ((i6 & i15) == i15) {
            o(sb, "Bottom");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void o(java.lang.StringBuilder sb, java.lang.String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
