package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X7.w.a f16048d = new X7.w.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X7.w f16049e = new X7.w(X7.G.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.G f16050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.C6666l f16051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7.G f16052c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X7.w a() {
            return X7.w.f16049e;
        }
    }

    public w(X7.G g6, p087i7.C6666l c6666l, X7.G g10) {
        p247y7.AbstractC7350t.f(g6, "reportLevelBefore");
        p247y7.AbstractC7350t.f(g10, "reportLevelAfter");
        this.f16050a = g6;
        this.f16051b = c6666l;
        this.f16052c = g10;
    }

    public /* synthetic */ w(X7.G g6, p087i7.C6666l c6666l, X7.G g10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(g6, (i6 & 2) != 0 ? new p087i7.C6666l(1, 0) : c6666l, (i6 & 4) != 0 ? g6 : g10);
    }

    public final X7.G b() {
        return this.f16052c;
    }

    public final X7.G c() {
        return this.f16050a;
    }

    public final p087i7.C6666l d() {
        return this.f16051b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X7.w)) {
            return false;
        }
        X7.w wVar = (X7.w) obj;
        return this.f16050a == wVar.f16050a && p247y7.AbstractC7350t.b(this.f16051b, wVar.f16051b) && this.f16052c == wVar.f16052c;
    }

    public int hashCode() {
        int iHashCode = this.f16050a.hashCode() * 31;
        p087i7.C6666l c6666l = this.f16051b;
        return ((iHashCode + (c6666l == null ? 0 : c6666l.hashCode())) * 31) + this.f16052c.hashCode();
    }

    public java.lang.String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f16050a + ", sinceVersion=" + this.f16051b + ", reportLevelAfter=" + this.f16052c + ')';
    }
}
