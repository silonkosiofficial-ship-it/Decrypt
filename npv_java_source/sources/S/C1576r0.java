package S;

/* JADX INFO: renamed from: S.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1576r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11679f;

    private C1576r0(long j6, long j10, long j11, long j12, long j13, long j14) {
        this.f11674a = j6;
        this.f11675b = j10;
        this.f11676c = j11;
        this.f11677d = j12;
        this.f11678e = j13;
        this.f11679f = j14;
    }

    public /* synthetic */ C1576r0(long j6, long j10, long j11, long j12, long j13, long j14, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12, j13, j14);
    }

    public final long a(boolean z6) {
        return z6 ? this.f11675b : this.f11678e;
    }

    public final long b(boolean z6) {
        return z6 ? this.f11674a : this.f11677d;
    }

    public final long c(boolean z6) {
        return z6 ? this.f11676c : this.f11679f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1576r0)) {
            return false;
        }
        S.C1576r0 c1576r0 = (S.C1576r0) obj;
        return p141o0.C7016y0.o(this.f11674a, c1576r0.f11674a) && p141o0.C7016y0.o(this.f11675b, c1576r0.f11675b) && p141o0.C7016y0.o(this.f11676c, c1576r0.f11676c) && p141o0.C7016y0.o(this.f11677d, c1576r0.f11677d) && p141o0.C7016y0.o(this.f11678e, c1576r0.f11678e) && p141o0.C7016y0.o(this.f11679f, c1576r0.f11679f);
    }

    public int hashCode() {
        return (((((((((p141o0.C7016y0.u(this.f11674a) * 31) + p141o0.C7016y0.u(this.f11675b)) * 31) + p141o0.C7016y0.u(this.f11676c)) * 31) + p141o0.C7016y0.u(this.f11677d)) * 31) + p141o0.C7016y0.u(this.f11678e)) * 31) + p141o0.C7016y0.u(this.f11679f);
    }
}
