package Q4;

/* JADX INFO: loaded from: classes3.dex */
final class a extends Q4.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f9031c;

    a(long j6, long j10, long j11) {
        this.f9029a = j6;
        this.f9030b = j10;
        this.f9031c = j11;
    }

    @Override // Q4.p
    public long b() {
        return this.f9030b;
    }

    @Override // Q4.p
    public long c() {
        return this.f9029a;
    }

    @Override // Q4.p
    public long d() {
        return this.f9031c;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q4.p)) {
            return false;
        }
        Q4.p pVar = (Q4.p) obj;
        return this.f9029a == pVar.c() && this.f9030b == pVar.b() && this.f9031c == pVar.d();
    }

    public int hashCode() {
        long j6 = this.f9029a;
        long j10 = this.f9030b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f9031c;
        return i6 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public java.lang.String toString() {
        return "StartupTime{epochMillis=" + this.f9029a + ", elapsedRealtime=" + this.f9030b + ", uptimeMillis=" + this.f9031c + "}";
    }
}
