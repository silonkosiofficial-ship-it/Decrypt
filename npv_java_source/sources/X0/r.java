package X0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0.r.a f15653c = new X0.r.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X0.r f15654d = new X0.r(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15656b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X0.r a() {
            return X0.r.f15654d;
        }
    }

    private r(long j6, long j10) {
        this.f15655a = j6;
        this.f15656b = j10;
    }

    public /* synthetic */ r(long j6, long j10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? Y0.y.f(0) : j6, (i6 & 2) != 0 ? Y0.y.f(0) : j10, null);
    }

    public /* synthetic */ r(long j6, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10);
    }

    public final long b() {
        return this.f15655a;
    }

    public final long c() {
        return this.f15656b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0.r)) {
            return false;
        }
        X0.r rVar = (X0.r) obj;
        return Y0.x.e(this.f15655a, rVar.f15655a) && Y0.x.e(this.f15656b, rVar.f15656b);
    }

    public int hashCode() {
        return (Y0.x.i(this.f15655a) * 31) + Y0.x.i(this.f15656b);
    }

    public java.lang.String toString() {
        return "TextIndent(firstLine=" + ((java.lang.Object) Y0.x.j(this.f15655a)) + ", restLine=" + ((java.lang.Object) Y0.x.j(this.f15656b)) + ')';
    }
}
