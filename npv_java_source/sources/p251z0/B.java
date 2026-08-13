package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f57459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f57460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f57461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f57462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f57463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f57464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f57465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f57466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f57467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f57468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.util.List f57469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f57470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p251z0.C7369e f57471m;

    private B(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, boolean z11, int i6, long j14) {
        this.f57459a = j6;
        this.f57460b = j10;
        this.f57461c = j11;
        this.f57462d = z6;
        this.f57463e = f6;
        this.f57464f = j12;
        this.f57465g = j13;
        this.f57466h = z10;
        this.f57467i = i6;
        this.f57468j = j14;
        this.f57470l = p131n0.g.f51312b.c();
        this.f57471m = new p251z0.C7369e(z11, z11);
    }

    public /* synthetic */ B(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, boolean z11, int i6, long j14, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, z6, f6, j12, j13, z10, z11, (i10 & 512) != 0 ? p251z0.P.f57513a.d() : i6, (i10 & 1024) != 0 ? p131n0.g.f51312b.c() : j14, null);
    }

    public /* synthetic */ B(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, boolean z11, int i6, long j14, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, z6, f6, j12, j13, z10, z11, i6, j14);
    }

    private B(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, boolean z11, int i6, java.util.List list, long j14, long j15) {
        this(j6, j10, j11, z6, f6, j12, j13, z10, z11, i6, j14, null);
        this.f57469k = list;
        this.f57470l = j15;
    }

    public /* synthetic */ B(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, boolean z11, int i6, java.util.List list, long j14, long j15, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, z6, f6, j12, j13, z10, z11, i6, list, j14, j15);
    }

    public final void a() {
        this.f57471m.c(true);
        this.f57471m.d(true);
    }

    public final p251z0.B b(long j6, long j10, long j11, boolean z6, long j12, long j13, boolean z10, int i6, java.util.List list, long j14) {
        return d(j6, j10, j11, z6, this.f57463e, j12, j13, z10, i6, list, j14);
    }

    public final p251z0.B d(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, int i6, java.util.List list, long j14) {
        p251z0.B b6 = new p251z0.B(j6, j10, j11, z6, f6, j12, j13, z10, false, i6, list, j14, this.f57470l, null);
        b6.f57471m = this.f57471m;
        return b6;
    }

    public final java.util.List e() {
        java.util.List list = this.f57469k;
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    public final long f() {
        return this.f57459a;
    }

    public final long g() {
        return this.f57470l;
    }

    public final long h() {
        return this.f57461c;
    }

    public final boolean i() {
        return this.f57462d;
    }

    public final float j() {
        return this.f57463e;
    }

    public final long k() {
        return this.f57465g;
    }

    public final boolean l() {
        return this.f57466h;
    }

    public final long m() {
        return this.f57468j;
    }

    public final int n() {
        return this.f57467i;
    }

    public final long o() {
        return this.f57460b;
    }

    public final boolean p() {
        return this.f57471m.a() || this.f57471m.b();
    }

    public java.lang.String toString() {
        return "PointerInputChange(id=" + ((java.lang.Object) p251z0.A.f(this.f57459a)) + ", uptimeMillis=" + this.f57460b + ", position=" + ((java.lang.Object) p131n0.g.t(this.f57461c)) + ", pressed=" + this.f57462d + ", pressure=" + this.f57463e + ", previousUptimeMillis=" + this.f57464f + ", previousPosition=" + ((java.lang.Object) p131n0.g.t(this.f57465g)) + ", previousPressed=" + this.f57466h + ", isConsumed=" + p() + ", type=" + ((java.lang.Object) p251z0.P.i(this.f57467i)) + ", historical=" + e() + ",scrollDelta=" + ((java.lang.Object) p131n0.g.t(this.f57468j)) + ')';
    }
}
