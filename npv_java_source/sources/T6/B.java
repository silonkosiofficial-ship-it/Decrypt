package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T6.B.a f12985d = new T6.B.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final T6.B f12986e = new T6.B("HTTP", 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final T6.B f12987f = new T6.B("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final T6.B f12988g = new T6.B("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final T6.B f12989h = new T6.B("SPDY", 3, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final T6.B f12990i = new T6.B("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12993c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T6.B a() {
            return T6.B.f12988g;
        }

        public final T6.B b() {
            return T6.B.f12987f;
        }

        public final T6.B c() {
            return T6.B.f12986e;
        }

        public final T6.B d() {
            return T6.B.f12990i;
        }

        public final T6.B e() {
            return T6.B.f12989h;
        }
    }

    public B(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f12991a = str;
        this.f12992b = i6;
        this.f12993c = i10;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T6.B)) {
            return false;
        }
        T6.B b6 = (T6.B) obj;
        return p247y7.AbstractC7350t.b(this.f12991a, b6.f12991a) && this.f12992b == b6.f12992b && this.f12993c == b6.f12993c;
    }

    public int hashCode() {
        return (((this.f12991a.hashCode() * 31) + this.f12992b) * 31) + this.f12993c;
    }

    public java.lang.String toString() {
        return this.f12991a + '/' + this.f12992b + '.' + this.f12993c;
    }
}
