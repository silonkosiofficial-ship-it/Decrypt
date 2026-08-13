package S;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R.g f9995b;

    private G0(long j6, R.g gVar) {
        this.f9994a = j6;
        this.f9995b = gVar;
    }

    public /* synthetic */ G0(long j6, R.g gVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p141o0.C7016y0.f52264b.g() : j6, (i6 & 2) != 0 ? null : gVar, null);
    }

    public /* synthetic */ G0(long j6, R.g gVar, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, gVar);
    }

    public final long a() {
        return this.f9994a;
    }

    public final R.g b() {
        return this.f9995b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S.G0)) {
            return false;
        }
        S.G0 g6 = (S.G0) obj;
        return p141o0.C7016y0.o(this.f9994a, g6.f9994a) && p247y7.AbstractC7350t.b(this.f9995b, g6.f9995b);
    }

    public int hashCode() {
        int iU = p141o0.C7016y0.u(this.f9994a) * 31;
        R.g gVar = this.f9995b;
        return iU + (gVar != null ? gVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RippleConfiguration(color=" + ((java.lang.Object) p141o0.C7016y0.v(this.f9994a)) + ", rippleAlpha=" + this.f9995b + ')';
    }
}
