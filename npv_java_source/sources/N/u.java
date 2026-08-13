package N;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H.EnumC1219k f7491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N.t f7493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7494d;

    private u(H.EnumC1219k enumC1219k, long j6, N.t tVar, boolean z6) {
        this.f7491a = enumC1219k;
        this.f7492b = j6;
        this.f7493c = tVar;
        this.f7494d = z6;
    }

    public /* synthetic */ u(H.EnumC1219k enumC1219k, long j6, N.t tVar, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(enumC1219k, j6, tVar, z6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N.u)) {
            return false;
        }
        N.u uVar = (N.u) obj;
        return this.f7491a == uVar.f7491a && p131n0.g.j(this.f7492b, uVar.f7492b) && this.f7493c == uVar.f7493c && this.f7494d == uVar.f7494d;
    }

    public int hashCode() {
        return (((((this.f7491a.hashCode() * 31) + p131n0.g.o(this.f7492b)) * 31) + this.f7493c.hashCode()) * 31) + p190t.h.a(this.f7494d);
    }

    public java.lang.String toString() {
        return "SelectionHandleInfo(handle=" + this.f7491a + ", position=" + ((java.lang.Object) p131n0.g.t(this.f7492b)) + ", anchor=" + this.f7493c + ", visible=" + this.f7494d + ')';
    }
}
