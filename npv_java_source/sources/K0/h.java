package K0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K0.h.a f5956b = new K0.h.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f5957c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5958d = i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f5959e = i(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f5960f = i(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f5961g = i(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f5962h = i(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f5963i = i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5964a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return K0.h.f5957c;
        }

        public final int b() {
            return K0.h.f5958d;
        }

        public final int c() {
            return K0.h.f5963i;
        }

        public final int d() {
            return K0.h.f5962h;
        }

        public final int e() {
            return K0.h.f5960f;
        }

        public final int f() {
            return K0.h.f5959e;
        }

        public final int g() {
            return K0.h.f5961g;
        }
    }

    private /* synthetic */ h(int i6) {
        this.f5964a = i6;
    }

    public static final /* synthetic */ K0.h h(int i6) {
        return new K0.h(i6);
    }

    private static int i(int i6) {
        return i6;
    }

    public static boolean j(int i6, java.lang.Object obj) {
        return (obj instanceof K0.h) && i6 == ((K0.h) obj).n();
    }

    public static final boolean k(int i6, int i10) {
        return i6 == i10;
    }

    public static int l(int i6) {
        return i6;
    }

    public static java.lang.String m(int i6) {
        if (k(i6, f5957c)) {
            return "Button";
        }
        if (k(i6, f5958d)) {
            return "Checkbox";
        }
        if (k(i6, f5959e)) {
            return "Switch";
        }
        if (k(i6, f5960f)) {
            return "RadioButton";
        }
        if (k(i6, f5961g)) {
            return "Tab";
        }
        if (k(i6, f5962h)) {
            return "Image";
        }
        return k(i6, f5963i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(java.lang.Object obj) {
        return j(this.f5964a, obj);
    }

    public int hashCode() {
        return l(this.f5964a);
    }

    public final /* synthetic */ int n() {
        return this.f5964a;
    }

    public java.lang.String toString() {
        return m(this.f5964a);
    }
}
