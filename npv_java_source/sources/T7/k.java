package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T7.k.a f13306c = new T7.k.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.k f13307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T7.a f13308b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T7.k a(java.lang.ClassLoader classLoader) {
            p247y7.AbstractC7350t.f(classLoader, "classLoader");
            T7.g gVar = new T7.g(classLoader);
            g8.h.a aVar = p068g8.h.f45665b;
            java.lang.ClassLoader classLoader2 = p087i7.M.class.getClassLoader();
            p247y7.AbstractC7350t.e(classLoader2, "getClassLoader(...)");
            g8.h.a.C0521a c0521aA = aVar.a(gVar, new T7.g(classLoader2), new T7.d(classLoader), "runtime module for " + classLoader, T7.j.f13305b, T7.l.f13309a);
            return new T7.k(c0521aA.a().a(), new T7.a(c0521aA.b(), gVar), null);
        }
    }

    private k(B8.k kVar, T7.a aVar) {
        this.f13307a = kVar;
        this.f13308b = aVar;
    }

    public /* synthetic */ k(B8.k kVar, T7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(kVar, aVar);
    }

    public final B8.k a() {
        return this.f13307a;
    }

    public final O7.G b() {
        return this.f13307a.q();
    }

    public final T7.a c() {
        return this.f13308b;
    }
}
