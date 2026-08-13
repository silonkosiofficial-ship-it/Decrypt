package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T6.U.a f13073c = new T6.U.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final T6.U f13074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final T6.U f13075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final T6.U f13076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final T6.U f13077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final T6.U f13078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.util.Map f13079i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f13080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13081b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T6.U a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            java.lang.String strC = W6.E.c(str);
            T6.U u6 = (T6.U) T6.U.f13073c.b().get(strC);
            return u6 == null ? new T6.U(strC, 0) : u6;
        }

        public final java.util.Map b() {
            return T6.U.f13079i;
        }

        public final T6.U c() {
            return T6.U.f13074d;
        }
    }

    static {
        T6.U u6 = new T6.U("http", 80);
        f13074d = u6;
        T6.U u10 = new T6.U("https", 443);
        f13075e = u10;
        T6.U u11 = new T6.U("ws", 80);
        f13076f = u11;
        T6.U u12 = new T6.U("wss", 443);
        f13077g = u12;
        T6.U u13 = new T6.U("socks", 1080);
        f13078h = u13;
        java.util.List listP = p097j7.AbstractC6879v.p(u6, u10, u11, u12, u13);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(listP, 10)), 16));
        for (java.lang.Object obj : listP) {
            linkedHashMap.put(((T6.U) obj).f13080a, obj);
        }
        f13079i = linkedHashMap;
    }

    public U(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f13080a = str;
        this.f13081b = i6;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!W6.m.a(str.charAt(i10))) {
                throw new java.lang.IllegalArgumentException("All characters should be lower case".toString());
            }
        }
    }

    public final int c() {
        return this.f13081b;
    }

    public final java.lang.String d() {
        return this.f13080a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T6.U)) {
            return false;
        }
        T6.U u6 = (T6.U) obj;
        return p247y7.AbstractC7350t.b(this.f13080a, u6.f13080a) && this.f13081b == u6.f13081b;
    }

    public int hashCode() {
        return (this.f13080a.hashCode() * 31) + this.f13081b;
    }

    public java.lang.String toString() {
        return "URLProtocol(name=" + this.f13080a + ", defaultPort=" + this.f13081b + ')';
    }
}
