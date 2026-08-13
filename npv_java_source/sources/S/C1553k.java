package S;

/* JADX INFO: renamed from: S.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1553k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11269d;

    private C1553k(long j6, long j10, long j11, long j12) {
        this.f11266a = j6;
        this.f11267b = j10;
        this.f11268c = j11;
        this.f11269d = j12;
    }

    public /* synthetic */ C1553k(long j6, long j10, long j11, long j12, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12);
    }

    public final long a(boolean z6) {
        return z6 ? this.f11266a : this.f11268c;
    }

    public final long b(boolean z6) {
        return z6 ? this.f11267b : this.f11269d;
    }

    public final S.C1553k c(long j6, long j10, long j11, long j12) {
        return new S.C1553k(j6 != 16 ? j6 : this.f11266a, j10 != 16 ? j10 : this.f11267b, j11 != 16 ? j11 : this.f11268c, j12 != 16 ? j12 : this.f11269d, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1553k)) {
            return false;
        }
        S.C1553k c1553k = (S.C1553k) obj;
        return p141o0.C7016y0.o(this.f11266a, c1553k.f11266a) && p141o0.C7016y0.o(this.f11267b, c1553k.f11267b) && p141o0.C7016y0.o(this.f11268c, c1553k.f11268c) && p141o0.C7016y0.o(this.f11269d, c1553k.f11269d);
    }

    public int hashCode() {
        return (((((p141o0.C7016y0.u(this.f11266a) * 31) + p141o0.C7016y0.u(this.f11267b)) * 31) + p141o0.C7016y0.u(this.f11268c)) * 31) + p141o0.C7016y0.u(this.f11269d);
    }
}
