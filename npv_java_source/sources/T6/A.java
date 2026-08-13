package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T6.A.a f12975b = new T6.A.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final T6.A f12976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final T6.A f12977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final T6.A f12978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final T6.A f12979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final T6.A f12980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final T6.A f12981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final T6.A f12982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.List f12983j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12984a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T6.A a() {
            return T6.A.f12976c;
        }

        public final T6.A b() {
            return T6.A.f12981h;
        }

        public final T6.A c() {
            return T6.A.f12977d;
        }
    }

    static {
        T6.A a6 = new T6.A("GET");
        f12976c = a6;
        T6.A a10 = new T6.A("POST");
        f12977d = a10;
        T6.A a11 = new T6.A("PUT");
        f12978e = a11;
        T6.A a12 = new T6.A("PATCH");
        f12979f = a12;
        T6.A a13 = new T6.A("DELETE");
        f12980g = a13;
        T6.A a14 = new T6.A("HEAD");
        f12981h = a14;
        T6.A a15 = new T6.A("OPTIONS");
        f12982i = a15;
        f12983j = p097j7.AbstractC6879v.p(a6, a10, a11, a12, a13, a14, a15);
    }

    public A(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f12984a = str;
    }

    public final java.lang.String d() {
        return this.f12984a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T6.A) && p247y7.AbstractC7350t.b(this.f12984a, ((T6.A) obj).f12984a);
    }

    public int hashCode() {
        return this.f12984a.hashCode();
    }

    public java.lang.String toString() {
        return "HttpMethod(value=" + this.f12984a + ')';
    }
}
