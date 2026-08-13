package S0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements S0.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f12272b;

    public N(char c6) {
        this.f12272b = c6;
    }

    public /* synthetic */ N(char c6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? (char) 8226 : c6);
    }

    @Override // S0.g0
    public S0.e0 a(M0.C1332d c1332d) {
        return new S0.e0(new M0.C1332d(S8.r.N(java.lang.String.valueOf(this.f12272b), c1332d.i().length()), null, null, 6, null), S0.L.f12263a.a());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S0.N) && this.f12272b == ((S0.N) obj).f12272b;
    }

    public int hashCode() {
        return this.f12272b;
    }
}
