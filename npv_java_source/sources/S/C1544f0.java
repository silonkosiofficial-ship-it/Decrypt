package S;

/* JADX INFO: renamed from: S.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1544f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11078d;

    private C1544f0(long j6, long j10, long j11, long j12) {
        this.f11075a = j6;
        this.f11076b = j10;
        this.f11077c = j11;
        this.f11078d = j12;
    }

    public /* synthetic */ C1544f0(long j6, long j10, long j11, long j12, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12);
    }

    public final long a(boolean z6) {
        return z6 ? this.f11075a : this.f11077c;
    }

    public final long b(boolean z6) {
        return z6 ? this.f11076b : this.f11078d;
    }

    public final S.C1544f0 c(long j6, long j10, long j11, long j12) {
        return new S.C1544f0(j6 != 16 ? j6 : this.f11075a, j10 != 16 ? j10 : this.f11076b, j11 != 16 ? j11 : this.f11077c, j12 != 16 ? j12 : this.f11078d, null);
    }

    public final long e() {
        return this.f11076b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1544f0)) {
            return false;
        }
        S.C1544f0 c1544f0 = (S.C1544f0) obj;
        return p141o0.C7016y0.o(this.f11075a, c1544f0.f11075a) && p141o0.C7016y0.o(this.f11076b, c1544f0.f11076b) && p141o0.C7016y0.o(this.f11077c, c1544f0.f11077c) && p141o0.C7016y0.o(this.f11078d, c1544f0.f11078d);
    }

    public int hashCode() {
        return (((((p141o0.C7016y0.u(this.f11075a) * 31) + p141o0.C7016y0.u(this.f11076b)) * 31) + p141o0.C7016y0.u(this.f11077c)) * 31) + p141o0.C7016y0.u(this.f11078d);
    }
}
