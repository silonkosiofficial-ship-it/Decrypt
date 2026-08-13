package p191t0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p191t0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p141o0.E1 f54551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f54552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f54553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f54555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f54556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f54557m;

    private a(p141o0.E1 e6, long j6, long j10) {
        this.f54551g = e6;
        this.f54552h = j6;
        this.f54553i = j10;
        this.f54554j = p141o0.AbstractC7020z1.f52282a.a();
        this.f54555k = k(j6, j10);
        this.f54556l = 1.0f;
    }

    public /* synthetic */ a(p141o0.E1 e6, long j6, long j10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(e6, (i6 & 2) != 0 ? Y0.p.f16221b.a() : j6, (i6 & 4) != 0 ? Y0.u.a(e6.getWidth(), e6.getHeight()) : j10, null);
    }

    public /* synthetic */ a(p141o0.E1 e6, long j6, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(e6, j6, j10);
    }

    private final long k(long j6, long j10) {
        if (Y0.p.h(j6) < 0 || Y0.p.i(j6) < 0 || Y0.t.g(j10) < 0 || Y0.t.f(j10) < 0 || Y0.t.g(j10) > this.f54551g.getWidth() || Y0.t.f(j10) > this.f54551g.getHeight()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return j10;
    }

    @Override // p191t0.b
    protected boolean a(float f6) {
        this.f54556l = f6;
        return true;
    }

    @Override // p191t0.b
    protected boolean b(p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f54557m = abstractC7019z0;
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p191t0.a)) {
            return false;
        }
        p191t0.a aVar = (p191t0.a) obj;
        return p247y7.AbstractC7350t.b(this.f54551g, aVar.f54551g) && Y0.p.g(this.f54552h, aVar.f54552h) && Y0.t.e(this.f54553i, aVar.f54553i) && p141o0.AbstractC7020z1.d(this.f54554j, aVar.f54554j);
    }

    @Override // p191t0.b
    public long h() {
        return Y0.u.d(this.f54555k);
    }

    public int hashCode() {
        return (((((this.f54551g.hashCode() * 31) + Y0.p.j(this.f54552h)) * 31) + Y0.t.h(this.f54553i)) * 31) + p141o0.AbstractC7020z1.e(this.f54554j);
    }

    @Override // p191t0.b
    protected void j(p161q0.g gVar) {
        p161q0.f.f(gVar, this.f54551g, this.f54552h, this.f54553i, 0L, Y0.u.a(java.lang.Math.round(p131n0.m.i(gVar.i())), java.lang.Math.round(p131n0.m.g(gVar.i()))), this.f54556l, null, this.f54557m, 0, this.f54554j, 328, null);
    }

    public java.lang.String toString() {
        return "BitmapPainter(image=" + this.f54551g + ", srcOffset=" + ((java.lang.Object) Y0.p.m(this.f54552h)) + ", srcSize=" + ((java.lang.Object) Y0.t.i(this.f54553i)) + ", filterQuality=" + ((java.lang.Object) p141o0.AbstractC7020z1.f(this.f54554j)) + ')';
    }
}
