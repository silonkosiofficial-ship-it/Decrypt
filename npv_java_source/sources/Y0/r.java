package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Y0.r.a f16224e = new Y0.r.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Y0.r f16225f = new Y0.r(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16229d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Y0.r a() {
            return Y0.r.f16225f;
        }
    }

    public r(int i6, int i10, int i11, int i12) {
        this.f16226a = i6;
        this.f16227b = i10;
        this.f16228c = i11;
        this.f16229d = i12;
    }

    public static /* synthetic */ Y0.r c(Y0.r rVar, int i6, int i10, int i11, int i12, int i13, java.lang.Object obj) {
        if ((i13 & 1) != 0) {
            i6 = rVar.f16226a;
        }
        if ((i13 & 2) != 0) {
            i10 = rVar.f16227b;
        }
        if ((i13 & 4) != 0) {
            i11 = rVar.f16228c;
        }
        if ((i13 & 8) != 0) {
            i12 = rVar.f16229d;
        }
        return rVar.b(i6, i10, i11, i12);
    }

    public final Y0.r b(int i6, int i10, int i11, int i12) {
        return new Y0.r(i6, i10, i11, i12);
    }

    public final int d() {
        return this.f16229d;
    }

    public final long e() {
        return Y0.q.a(this.f16226a + (k() / 2), this.f16227b + (f() / 2));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.r)) {
            return false;
        }
        Y0.r rVar = (Y0.r) obj;
        return this.f16226a == rVar.f16226a && this.f16227b == rVar.f16227b && this.f16228c == rVar.f16228c && this.f16229d == rVar.f16229d;
    }

    public final int f() {
        return this.f16229d - this.f16227b;
    }

    public final int g() {
        return this.f16226a;
    }

    public final int h() {
        return this.f16228c;
    }

    public int hashCode() {
        return (((((this.f16226a * 31) + this.f16227b) * 31) + this.f16228c) * 31) + this.f16229d;
    }

    public final int i() {
        return this.f16227b;
    }

    public final long j() {
        return Y0.q.a(this.f16226a, this.f16227b);
    }

    public final int k() {
        return this.f16228c - this.f16226a;
    }

    public final boolean l() {
        return this.f16226a >= this.f16228c || this.f16227b >= this.f16229d;
    }

    public final Y0.r m(int i6, int i10) {
        return new Y0.r(this.f16226a + i6, this.f16227b + i10, this.f16228c + i6, this.f16229d + i10);
    }

    public java.lang.String toString() {
        return "IntRect.fromLTRB(" + this.f16226a + ", " + this.f16227b + ", " + this.f16228c + ", " + this.f16229d + ')';
    }
}
