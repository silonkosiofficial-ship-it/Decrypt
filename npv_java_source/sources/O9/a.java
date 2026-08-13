package O9;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O9.a.C0197a f8204c = new O9.a.C0197a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9.InterfaceC1838f f8205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8206b;

    /* JADX INFO: renamed from: O9.a$a, reason: collision with other inner class name */
    public static final class C0197a {
        private C0197a() {
        }

        public /* synthetic */ C0197a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(X9.InterfaceC1838f interfaceC1838f) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        this.f8205a = interfaceC1838f;
        this.f8206b = 262144L;
    }

    public final H9.t a() {
        H9.t.a aVar = new H9.t.a();
        while (true) {
            java.lang.String strB = b();
            if (strB.length() == 0) {
                return aVar.d();
            }
            aVar.b(strB);
        }
    }

    public final java.lang.String b() {
        java.lang.String strF0 = this.f8205a.f0(this.f8206b);
        this.f8206b -= (long) strF0.length();
        return strF0;
    }
}
