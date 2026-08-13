package p200u;

/* JADX INFO: renamed from: u.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7184n0 implements p200u.B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.B0 f54964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54965b;

    public C7184n0(p200u.B0 b6, long j6) {
        this.f54964a = b6;
        this.f54965b = j6;
    }

    @Override // p200u.B0
    public boolean a() {
        return this.f54964a.a();
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        long j10 = this.f54965b;
        return j6 < j10 ? rVar3 : this.f54964a.b(j6 - j10, rVar, rVar2, rVar3);
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        long j10 = this.f54965b;
        return j6 < j10 ? rVar : this.f54964a.c(j6 - j10, rVar, rVar2, rVar3);
    }

    @Override // p200u.B0
    public long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54964a.e(rVar, rVar2, rVar3) + this.f54965b;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p200u.C7184n0)) {
            return false;
        }
        p200u.C7184n0 c7184n0 = (p200u.C7184n0) obj;
        return c7184n0.f54965b == this.f54965b && p247y7.AbstractC7350t.b(c7184n0.f54964a, this.f54964a);
    }

    @Override // p200u.B0
    public /* synthetic */ p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.A0.a(this, rVar, rVar2, rVar3);
    }

    public int hashCode() {
        return (this.f54964a.hashCode() * 31) + p170r.r.a(this.f54965b);
    }
}
