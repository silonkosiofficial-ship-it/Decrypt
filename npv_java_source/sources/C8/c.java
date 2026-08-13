package C8;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends B8.p implements L7.b {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final C8.c.a f1377Q = new C8.c.a(null);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f1378P;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final C8.c a(p138n8.c cVar, E8.n nVar, O7.G g6, java.io.InputStream inputStream, boolean z6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(cVar, "fqName");
            p247y7.AbstractC7350t.f(nVar, "storageManager");
            p247y7.AbstractC7350t.f(g6, "module");
            p247y7.AbstractC7350t.f(inputStream, "inputStream");
            p087i7.u uVarA = p098j8.c.a(inputStream);
            p088i8.m mVar = (p088i8.m) uVarA.a();
            p098j8.a aVar = (p098j8.a) uVarA.b();
            if (mVar != null) {
                return new C8.c(cVar, nVar, g6, mVar, aVar, z6, null);
            }
            throw new java.lang.UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + p098j8.a.f49320h + ", actual " + aVar + ". Please update Kotlin");
        }
    }

    private c(p138n8.c cVar, E8.n nVar, O7.G g6, p088i8.m mVar, p098j8.a aVar, boolean z6) {
        super(cVar, nVar, g6, mVar, aVar, null);
        this.f1378P = z6;
    }

    public /* synthetic */ c(p138n8.c cVar, E8.n nVar, O7.G g6, p088i8.m mVar, p098j8.a aVar, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, nVar, g6, mVar, aVar, z6);
    }

    @Override // R7.z, R7.AbstractC1504j
    public java.lang.String toString() {
        return "builtins package fragment for " + e() + " from " + p218v8.c.p(this);
    }
}
