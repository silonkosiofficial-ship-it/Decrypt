package K4;

/* JADX INFO: loaded from: classes3.dex */
final class q extends K4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6129b;

    q(int i6, long j6) {
        this.f6128a = i6;
        this.f6129b = j6;
    }

    @Override // K4.r
    public final int a() {
        return this.f6128a;
    }

    @Override // K4.r
    public final long b() {
        return this.f6129b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K4.r) {
            K4.r rVar = (K4.r) obj;
            if (this.f6128a == rVar.a() && this.f6129b == rVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f6128a ^ 1000003;
        long j6 = this.f6129b;
        return (i6 * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final java.lang.String toString() {
        return "EventRecord{eventType=" + this.f6128a + ", eventTimestamp=" + this.f6129b + "}";
    }
}
