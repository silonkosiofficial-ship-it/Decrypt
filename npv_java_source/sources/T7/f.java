package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p068g8.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T7.f.a f13299c = new T7.f.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f13300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p078h8.a f13301b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T7.f a(java.lang.Class cls) throws java.lang.reflect.InvocationTargetException {
            p247y7.AbstractC7350t.f(cls, "klass");
            p078h8.b bVar = new p078h8.b();
            T7.c.f13297a.b(cls, bVar);
            p078h8.a aVarN = bVar.n();
            p247y7.AbstractC7342k abstractC7342k = null;
            if (aVarN == null) {
                return null;
            }
            return new T7.f(cls, aVarN, abstractC7342k);
        }
    }

    private f(java.lang.Class cls, p078h8.a aVar) {
        this.f13300a = cls;
        this.f13301b = aVar;
    }

    public /* synthetic */ f(java.lang.Class cls, p078h8.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(cls, aVar);
    }

    @Override // p068g8.t
    public void a(g8.t.d dVar, byte[] bArr) throws java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(dVar, "visitor");
        T7.c.f13297a.i(this.f13300a, dVar);
    }

    @Override // p068g8.t
    public p078h8.a b() {
        return this.f13301b;
    }

    @Override // p068g8.t
    public p138n8.b c() {
        return U7.d.a(this.f13300a);
    }

    @Override // p068g8.t
    public void d(g8.t.c cVar, byte[] bArr) throws java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cVar, "visitor");
        T7.c.f13297a.b(this.f13300a, cVar);
    }

    @Override // p068g8.t
    public java.lang.String e() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = this.f13300a.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        sb.append(S8.r.Q(name, '.', '/', false, 4, null));
        sb.append(".class");
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof T7.f) && p247y7.AbstractC7350t.b(this.f13300a, ((T7.f) obj).f13300a);
    }

    public final java.lang.Class f() {
        return this.f13300a;
    }

    public int hashCode() {
        return this.f13300a.hashCode();
    }

    public java.lang.String toString() {
        return T7.f.class.getName() + ": " + this.f13300a;
    }
}
