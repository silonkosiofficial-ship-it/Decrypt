package D0;

/* JADX INFO: renamed from: D0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892k implements D0.InterfaceC0889h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1876b;

    public C0892k(float f6) {
        this.f1876b = f6;
    }

    @Override // D0.InterfaceC0889h
    public long a(long j6, long j10) {
        float f6 = this.f1876b;
        return D0.f0.a(f6, f6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0.C0892k) && java.lang.Float.compare(this.f1876b, ((D0.C0892k) obj).f1876b) == 0;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.f1876b);
    }

    public java.lang.String toString() {
        return "FixedScale(value=" + this.f1876b + ')';
    }
}
