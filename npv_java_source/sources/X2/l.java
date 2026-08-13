package X2;

/* JADX INFO: loaded from: classes.dex */
final class l extends X2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15794a;

    l(long j6) {
        this.f15794a = j6;
    }

    @Override // X2.v
    public long c() {
        return this.f15794a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof X2.v) && this.f15794a == ((X2.v) obj).c();
    }

    public int hashCode() {
        long j6 = this.f15794a;
        return ((int) (j6 ^ (j6 >>> 32))) ^ 1000003;
    }

    public java.lang.String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f15794a + "}";
    }
}
