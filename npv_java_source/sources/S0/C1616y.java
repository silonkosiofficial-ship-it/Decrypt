package S0;

/* JADX INFO: renamed from: S0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1616y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S0.C1616y.a f12405b = new S0.C1616y.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12406c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f12407d = l(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f12408e = l(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f12409f = l(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f12410g = l(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f12411h = l(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f12412i = l(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f12413j = l(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f12414k = l(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f12415l = l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12416a;

    /* JADX INFO: renamed from: S0.y$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return S0.C1616y.f12408e;
        }

        public final int b() {
            return S0.C1616y.f12415l;
        }

        public final int c() {
            return S0.C1616y.f12412i;
        }

        public final int d() {
            return S0.C1616y.f12409f;
        }

        public final int e() {
            return S0.C1616y.f12414k;
        }

        public final int f() {
            return S0.C1616y.f12413j;
        }

        public final int g() {
            return S0.C1616y.f12410g;
        }

        public final int h() {
            return S0.C1616y.f12407d;
        }

        public final int i() {
            return S0.C1616y.f12406c;
        }

        public final int j() {
            return S0.C1616y.f12411h;
        }
    }

    private /* synthetic */ C1616y(int i6) {
        this.f12416a = i6;
    }

    public static final /* synthetic */ S0.C1616y k(int i6) {
        return new S0.C1616y(i6);
    }

    private static int l(int i6) {
        return i6;
    }

    public static boolean m(int i6, java.lang.Object obj) {
        return (obj instanceof S0.C1616y) && i6 == ((S0.C1616y) obj).q();
    }

    public static final boolean n(int i6, int i10) {
        return i6 == i10;
    }

    public static int o(int i6) {
        return i6;
    }

    public static java.lang.String p(int i6) {
        if (n(i6, f12406c)) {
            return "Unspecified";
        }
        if (n(i6, f12407d)) {
            return "Text";
        }
        if (n(i6, f12408e)) {
            return "Ascii";
        }
        if (n(i6, f12409f)) {
            return "Number";
        }
        if (n(i6, f12410g)) {
            return "Phone";
        }
        if (n(i6, f12411h)) {
            return "Uri";
        }
        if (n(i6, f12412i)) {
            return "Email";
        }
        if (n(i6, f12413j)) {
            return "Password";
        }
        if (n(i6, f12414k)) {
            return "NumberPassword";
        }
        return n(i6, f12415l) ? "Decimal" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return m(this.f12416a, obj);
    }

    public int hashCode() {
        return o(this.f12416a);
    }

    public final /* synthetic */ int q() {
        return this.f12416a;
    }

    public java.lang.String toString() {
        return p(this.f12416a);
    }
}
