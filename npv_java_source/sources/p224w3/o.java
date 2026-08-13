package p224w3;

/* JADX INFO: loaded from: classes.dex */
final class o extends p224w3.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f56256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f56257d;

    o(int i6, int i10, double d6, boolean z6) {
        this.f56254a = i6;
        this.f56255b = i10;
        this.f56256c = d6;
        this.f56257d = z6;
    }

    @Override // p224w3.y
    public final double a() {
        return this.f56256c;
    }

    @Override // p224w3.y
    public final int b() {
        return this.f56255b;
    }

    @Override // p224w3.y
    public final int c() {
        return this.f56254a;
    }

    @Override // p224w3.y
    public final boolean d() {
        return this.f56257d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p224w3.y) {
            p224w3.y yVar = (p224w3.y) obj;
            if (this.f56254a == yVar.c() && this.f56255b == yVar.b() && java.lang.Double.doubleToLongBits(this.f56256c) == java.lang.Double.doubleToLongBits(yVar.a()) && this.f56257d == yVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((int) ((java.lang.Double.doubleToLongBits(this.f56256c) >>> 32) ^ java.lang.Double.doubleToLongBits(this.f56256c))) ^ ((((this.f56254a ^ 1000003) * 1000003) ^ this.f56255b) * 1000003)) * 1000003) ^ (true != this.f56257d ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "PingStrategy{maxAttempts=" + this.f56254a + ", initialBackoffMs=" + this.f56255b + ", backoffMultiplier=" + this.f56256c + ", bufferAfterMaxAttempts=" + this.f56257d + "}";
    }
}
