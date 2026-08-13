package S;

/* JADX INFO: renamed from: S.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1582u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f11810g;

    private C1582u0(long j6, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f11804a = j6;
        this.f11805b = j10;
        this.f11806c = j11;
        this.f11807d = j12;
        this.f11808e = j13;
        this.f11809f = j14;
        this.f11810g = j15;
    }

    public /* synthetic */ C1582u0(long j6, long j10, long j11, long j12, long j13, long j14, long j15, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12, j13, j14, j15);
    }

    public final long a() {
        return this.f11806c;
    }

    public final long b(boolean z6, boolean z10) {
        if (z10) {
            return z6 ? this.f11804a : this.f11807d;
        }
        return this.f11809f;
    }

    public final long c(boolean z6, boolean z10) {
        if (z10) {
            return z6 ? this.f11805b : this.f11808e;
        }
        return this.f11810g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1582u0)) {
            return false;
        }
        S.C1582u0 c1582u0 = (S.C1582u0) obj;
        return p141o0.C7016y0.o(this.f11804a, c1582u0.f11804a) && p141o0.C7016y0.o(this.f11807d, c1582u0.f11807d) && p141o0.C7016y0.o(this.f11805b, c1582u0.f11805b) && p141o0.C7016y0.o(this.f11808e, c1582u0.f11808e) && p141o0.C7016y0.o(this.f11806c, c1582u0.f11806c) && p141o0.C7016y0.o(this.f11809f, c1582u0.f11809f) && p141o0.C7016y0.o(this.f11810g, c1582u0.f11810g);
    }

    public int hashCode() {
        return (((((((((((p141o0.C7016y0.u(this.f11804a) * 31) + p141o0.C7016y0.u(this.f11807d)) * 31) + p141o0.C7016y0.u(this.f11805b)) * 31) + p141o0.C7016y0.u(this.f11808e)) * 31) + p141o0.C7016y0.u(this.f11806c)) * 31) + p141o0.C7016y0.u(this.f11809f)) * 31) + p141o0.C7016y0.u(this.f11810g);
    }
}
