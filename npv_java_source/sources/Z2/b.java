package Z2;

/* JADX INFO: loaded from: classes.dex */
final class b extends Z2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z2.g.a f16676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16677b;

    b(Z2.g.a aVar, long j6) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("Null status");
        }
        this.f16676a = aVar;
        this.f16677b = j6;
    }

    @Override // Z2.g
    public long b() {
        return this.f16677b;
    }

    @Override // Z2.g
    public Z2.g.a c() {
        return this.f16676a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z2.g)) {
            return false;
        }
        Z2.g gVar = (Z2.g) obj;
        return this.f16676a.equals(gVar.c()) && this.f16677b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f16676a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f16677b;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public java.lang.String toString() {
        return "BackendResponse{status=" + this.f16676a + ", nextRequestWaitMillis=" + this.f16677b + "}";
    }
}
