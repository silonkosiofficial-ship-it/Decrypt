package A0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f172b;

    public a(long j6, float f6) {
        this.f171a = j6;
        this.f172b = f6;
    }

    public final float a() {
        return this.f172b;
    }

    public final long b() {
        return this.f171a;
    }

    public final void c(float f6) {
        this.f172b = f6;
    }

    public final void d(long j6) {
        this.f171a = j6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0.a)) {
            return false;
        }
        A0.a aVar = (A0.a) obj;
        return this.f171a == aVar.f171a && java.lang.Float.compare(this.f172b, aVar.f172b) == 0;
    }

    public int hashCode() {
        return (p170r.r.a(this.f171a) * 31) + java.lang.Float.floatToIntBits(this.f172b);
    }

    public java.lang.String toString() {
        return "DataPointAtTime(time=" + this.f171a + ", dataPoint=" + this.f172b + ')';
    }
}
