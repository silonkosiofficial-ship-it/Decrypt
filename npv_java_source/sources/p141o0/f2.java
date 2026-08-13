package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends p141o0.AbstractC6984n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f52223c;

    private f2(long j6) {
        super(null);
        this.f52223c = j6;
    }

    public /* synthetic */ f2(long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6);
    }

    @Override // p141o0.AbstractC6984n0
    public void a(long j6, p141o0.N1 n6, float f6) {
        long jM;
        n6.b(1.0f);
        if (f6 == 1.0f) {
            jM = this.f52223c;
        } else {
            long j10 = this.f52223c;
            jM = p141o0.C7016y0.m(j10, p141o0.C7016y0.p(j10) * f6, 0.0f, 0.0f, 0.0f, 14, null);
        }
        n6.G(jM);
        if (n6.y() != null) {
            n6.x(null);
        }
    }

    public final long b() {
        return this.f52223c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p141o0.f2) && p141o0.C7016y0.o(this.f52223c, ((p141o0.f2) obj).f52223c);
    }

    public int hashCode() {
        return p141o0.C7016y0.u(this.f52223c);
    }

    public java.lang.String toString() {
        return "SolidColor(value=" + ((java.lang.Object) p141o0.C7016y0.v(this.f52223c)) + ')';
    }
}
