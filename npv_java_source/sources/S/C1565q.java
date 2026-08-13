package S;

/* JADX INFO: renamed from: S.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1565q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11509d;

    private C1565q(long j6, long j10, long j11, long j12) {
        this.f11506a = j6;
        this.f11507b = j10;
        this.f11508c = j11;
        this.f11509d = j12;
    }

    public /* synthetic */ C1565q(long j6, long j10, long j11, long j12, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12);
    }

    public final long a(boolean z6) {
        return z6 ? this.f11506a : this.f11508c;
    }

    public final long b(boolean z6) {
        return z6 ? this.f11507b : this.f11509d;
    }

    public final S.C1565q c(long j6, long j10, long j11, long j12) {
        return new S.C1565q(j6 != 16 ? j6 : this.f11506a, j10 != 16 ? j10 : this.f11507b, j11 != 16 ? j11 : this.f11508c, j12 != 16 ? j12 : this.f11509d, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1565q)) {
            return false;
        }
        S.C1565q c1565q = (S.C1565q) obj;
        return p141o0.C7016y0.o(this.f11506a, c1565q.f11506a) && p141o0.C7016y0.o(this.f11507b, c1565q.f11507b) && p141o0.C7016y0.o(this.f11508c, c1565q.f11508c) && p141o0.C7016y0.o(this.f11509d, c1565q.f11509d);
    }

    public int hashCode() {
        return (((((p141o0.C7016y0.u(this.f11506a) * 31) + p141o0.C7016y0.u(this.f11507b)) * 31) + p141o0.C7016y0.u(this.f11508c)) * 31) + p141o0.C7016y0.u(this.f11509d);
    }
}
