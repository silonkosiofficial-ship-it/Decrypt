package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f17320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f17321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f17323d;

    public q(java.util.Set set, java.lang.String str, long j6, long j10) {
        p247y7.AbstractC7350t.f(set, "qualifiers");
        p247y7.AbstractC7350t.f(str, "path");
        this.f17320a = set;
        this.f17321b = str;
        this.f17322c = j6;
        this.f17323d = j10;
    }

    public final long a() {
        return this.f17322c;
    }

    public final java.lang.String b() {
        return this.f17321b;
    }

    public final java.util.Set c() {
        return this.f17320a;
    }

    public final long d() {
        return this.f17323d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa.q)) {
            return false;
        }
        aa.q qVar = (aa.q) obj;
        return p247y7.AbstractC7350t.b(this.f17320a, qVar.f17320a) && p247y7.AbstractC7350t.b(this.f17321b, qVar.f17321b) && this.f17322c == qVar.f17322c && this.f17323d == qVar.f17323d;
    }

    public int hashCode() {
        return (((((this.f17320a.hashCode() * 31) + this.f17321b.hashCode()) * 31) + p170r.r.a(this.f17322c)) * 31) + p170r.r.a(this.f17323d);
    }

    public java.lang.String toString() {
        return "ResourceItem(qualifiers=" + this.f17320a + ", path=" + this.f17321b + ", offset=" + this.f17322c + ", size=" + this.f17323d + ")";
    }
}
