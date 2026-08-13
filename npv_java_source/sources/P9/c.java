package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P9.c.a f8517d = new P9.c.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final X9.C1839g f8518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final X9.C1839g f8519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final X9.C1839g f8520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final X9.C1839g f8521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final X9.C1839g f8522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final X9.C1839g f8523j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X9.C1839g f8524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X9.C1839g f8525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8526c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        X9.C1839g.a aVar = X9.C1839g.f16149F;
        f8518e = aVar.c(":");
        f8519f = aVar.c(":status");
        f8520g = aVar.c(":method");
        f8521h = aVar.c(":path");
        f8522i = aVar.c(":scheme");
        f8523j = aVar.c(":authority");
    }

    public c(X9.C1839g c1839g, X9.C1839g c1839g2) {
        p247y7.AbstractC7350t.f(c1839g, "name");
        p247y7.AbstractC7350t.f(c1839g2, "value");
        this.f8524a = c1839g;
        this.f8525b = c1839g2;
        this.f8526c = c1839g.I() + 32 + c1839g2.I();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(X9.C1839g c1839g, java.lang.String str) {
        this(c1839g, X9.C1839g.f16149F.c(str));
        p247y7.AbstractC7350t.f(c1839g, "name");
        p247y7.AbstractC7350t.f(str, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
        X9.C1839g.a aVar = X9.C1839g.f16149F;
        this(aVar.c(str), aVar.c(str2));
    }

    public final X9.C1839g a() {
        return this.f8524a;
    }

    public final X9.C1839g b() {
        return this.f8525b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P9.c)) {
            return false;
        }
        P9.c cVar = (P9.c) obj;
        return p247y7.AbstractC7350t.b(this.f8524a, cVar.f8524a) && p247y7.AbstractC7350t.b(this.f8525b, cVar.f8525b);
    }

    public int hashCode() {
        return (this.f8524a.hashCode() * 31) + this.f8525b.hashCode();
    }

    public java.lang.String toString() {
        return this.f8524a.O() + ": " + this.f8525b.O();
    }
}
