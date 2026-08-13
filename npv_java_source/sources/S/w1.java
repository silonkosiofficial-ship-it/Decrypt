package S;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11909e;

    private w1(long j6, long j10, long j11, long j12, long j13) {
        this.f11905a = j6;
        this.f11906b = j10;
        this.f11907c = j11;
        this.f11908d = j12;
        this.f11909e = j13;
    }

    public /* synthetic */ w1(long j6, long j10, long j11, long j12, long j13, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12, j13);
    }

    public final long a(float f6) {
        return p141o0.A0.i(this.f11905a, this.f11906b, p200u.H.c().a(f6));
    }

    public final long b() {
        return this.f11909e;
    }

    public final long c() {
        return this.f11907c;
    }

    public final long d() {
        return this.f11908d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.w1)) {
            return false;
        }
        S.w1 w1Var = (S.w1) obj;
        return p141o0.C7016y0.o(this.f11905a, w1Var.f11905a) && p141o0.C7016y0.o(this.f11906b, w1Var.f11906b) && p141o0.C7016y0.o(this.f11907c, w1Var.f11907c) && p141o0.C7016y0.o(this.f11908d, w1Var.f11908d) && p141o0.C7016y0.o(this.f11909e, w1Var.f11909e);
    }

    public int hashCode() {
        return (((((((p141o0.C7016y0.u(this.f11905a) * 31) + p141o0.C7016y0.u(this.f11906b)) * 31) + p141o0.C7016y0.u(this.f11907c)) * 31) + p141o0.C7016y0.u(this.f11908d)) * 31) + p141o0.C7016y0.u(this.f11909e);
    }
}
