package M0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X0.r f6758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M0.y f6759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X0.h f6760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final X0.t f6763i;

    private v(int i6, int i10, long j6, X0.r rVar, M0.y yVar, X0.h hVar, int i11, int i12, X0.t tVar) {
        this.f6755a = i6;
        this.f6756b = i10;
        this.f6757c = j6;
        this.f6758d = rVar;
        this.f6759e = yVar;
        this.f6760f = hVar;
        this.f6761g = i11;
        this.f6762h = i12;
        this.f6763i = tVar;
        if (Y0.x.e(j6, Y0.x.f16237b.a()) || Y0.x.h(j6) >= 0.0f) {
            return;
        }
        throw new java.lang.IllegalStateException(("lineHeight can't be negative (" + Y0.x.h(j6) + ')').toString());
    }

    public /* synthetic */ v(int i6, int i10, long j6, X0.r rVar, M0.y yVar, X0.h hVar, int i11, int i12, X0.t tVar, int i13, p247y7.AbstractC7342k abstractC7342k) {
        this((i13 & 1) != 0 ? X0.j.f15622b.g() : i6, (i13 & 2) != 0 ? X0.l.f15636b.f() : i10, (i13 & 4) != 0 ? Y0.x.f16237b.a() : j6, (i13 & 8) != 0 ? null : rVar, (i13 & 16) != 0 ? null : yVar, (i13 & 32) != 0 ? null : hVar, (i13 & 64) != 0 ? X0.f.f15584b.b() : i11, (i13 & 128) != 0 ? X0.e.f15579b.c() : i12, (i13 & 256) == 0 ? tVar : null, null);
    }

    public /* synthetic */ v(int i6, int i10, long j6, X0.r rVar, M0.y yVar, X0.h hVar, int i11, int i12, X0.t tVar, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, i10, j6, rVar, yVar, hVar, i11, i12, tVar);
    }

    public final M0.v a(int i6, int i10, long j6, X0.r rVar, M0.y yVar, X0.h hVar, int i11, int i12, X0.t tVar) {
        return new M0.v(i6, i10, j6, rVar, yVar, hVar, i11, i12, tVar, null);
    }

    public final int c() {
        return this.f6762h;
    }

    public final int d() {
        return this.f6761g;
    }

    public final long e() {
        return this.f6757c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.v)) {
            return false;
        }
        M0.v vVar = (M0.v) obj;
        return X0.j.k(this.f6755a, vVar.f6755a) && X0.l.j(this.f6756b, vVar.f6756b) && Y0.x.e(this.f6757c, vVar.f6757c) && p247y7.AbstractC7350t.b(this.f6758d, vVar.f6758d) && p247y7.AbstractC7350t.b(this.f6759e, vVar.f6759e) && p247y7.AbstractC7350t.b(this.f6760f, vVar.f6760f) && X0.f.f(this.f6761g, vVar.f6761g) && X0.e.g(this.f6762h, vVar.f6762h) && p247y7.AbstractC7350t.b(this.f6763i, vVar.f6763i);
    }

    public final X0.h f() {
        return this.f6760f;
    }

    public final M0.y g() {
        return this.f6759e;
    }

    public final int h() {
        return this.f6755a;
    }

    public int hashCode() {
        int iL = ((((X0.j.l(this.f6755a) * 31) + X0.l.k(this.f6756b)) * 31) + Y0.x.i(this.f6757c)) * 31;
        X0.r rVar = this.f6758d;
        int iHashCode = (iL + (rVar != null ? rVar.hashCode() : 0)) * 31;
        M0.y yVar = this.f6759e;
        int iHashCode2 = (iHashCode + (yVar != null ? yVar.hashCode() : 0)) * 31;
        X0.h hVar = this.f6760f;
        int iHashCode3 = (((((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + X0.f.j(this.f6761g)) * 31) + X0.e.h(this.f6762h)) * 31;
        X0.t tVar = this.f6763i;
        return iHashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final int i() {
        return this.f6756b;
    }

    public final X0.r j() {
        return this.f6758d;
    }

    public final X0.t k() {
        return this.f6763i;
    }

    public final M0.v l(M0.v vVar) {
        return vVar == null ? this : M0.w.a(this, vVar.f6755a, vVar.f6756b, vVar.f6757c, vVar.f6758d, vVar.f6759e, vVar.f6760f, vVar.f6761g, vVar.f6762h, vVar.f6763i);
    }

    public java.lang.String toString() {
        return "ParagraphStyle(textAlign=" + ((java.lang.Object) X0.j.m(this.f6755a)) + ", textDirection=" + ((java.lang.Object) X0.l.l(this.f6756b)) + ", lineHeight=" + ((java.lang.Object) Y0.x.j(this.f6757c)) + ", textIndent=" + this.f6758d + ", platformStyle=" + this.f6759e + ", lineHeightStyle=" + this.f6760f + ", lineBreak=" + ((java.lang.Object) X0.f.k(this.f6761g)) + ", hyphens=" + ((java.lang.Object) X0.e.i(this.f6762h)) + ", textMotion=" + this.f6763i + ')';
    }
}
