package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I6.G.a f5124d = new I6.G.a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final W6.C1767a f5125e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Long f5126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Long f5127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Long f5128c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        F7.o oVarP = null;
        F7.c cVarB = p247y7.P.b(I6.G.class);
        try {
            oVarP = p247y7.P.p(I6.G.class);
        } catch (java.lang.Throwable unused) {
        }
        f5125e = new W6.C1767a("TimeoutConfiguration", new p017b7.a(cVarB, oVarP));
    }

    public G(java.lang.Long l6, java.lang.Long l10, java.lang.Long l11) {
        this.f5126a = 0L;
        this.f5127b = 0L;
        this.f5128c = 0L;
        f(l6);
        e(l10);
        g(l11);
    }

    public /* synthetic */ G(java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : l6, (i6 & 2) != 0 ? null : l10, (i6 & 4) != 0 ? null : l11);
    }

    private final java.lang.Long a(java.lang.Long l6) {
        if (l6 == null || l6.longValue() > 0) {
            return l6;
        }
        throw new java.lang.IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS".toString());
    }

    public final java.lang.Long b() {
        return this.f5127b;
    }

    public final java.lang.Long c() {
        return this.f5126a;
    }

    public final java.lang.Long d() {
        return this.f5128c;
    }

    public final void e(java.lang.Long l6) {
        this.f5127b = a(l6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I6.G.class != obj.getClass()) {
            return false;
        }
        I6.G g6 = (I6.G) obj;
        return p247y7.AbstractC7350t.b(this.f5126a, g6.f5126a) && p247y7.AbstractC7350t.b(this.f5127b, g6.f5127b) && p247y7.AbstractC7350t.b(this.f5128c, g6.f5128c);
    }

    public final void f(java.lang.Long l6) {
        this.f5126a = a(l6);
    }

    public final void g(java.lang.Long l6) {
        this.f5128c = a(l6);
    }

    public int hashCode() {
        java.lang.Long l6 = this.f5126a;
        int iHashCode = (l6 != null ? l6.hashCode() : 0) * 31;
        java.lang.Long l10 = this.f5127b;
        int iHashCode2 = (iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31;
        java.lang.Long l11 = this.f5128c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }
}
