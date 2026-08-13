package B0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f497d;

    public b(float f6, float f10, long j6, int i6) {
        this.f494a = f6;
        this.f495b = f10;
        this.f496c = j6;
        this.f497d = i6;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof B0.b) {
            B0.b bVar = (B0.b) obj;
            if (bVar.f494a == this.f494a && bVar.f495b == this.f495b && bVar.f496c == this.f496c && bVar.f497d == this.f497d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.f494a) * 31) + java.lang.Float.floatToIntBits(this.f495b)) * 31) + p170r.r.a(this.f496c)) * 31) + this.f497d;
    }

    public java.lang.String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f494a + ",horizontalScrollPixels=" + this.f495b + ",uptimeMillis=" + this.f496c + ",deviceId=" + this.f497d + ')';
    }
}
