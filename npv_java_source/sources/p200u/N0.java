package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements p200u.F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54712a;

    public N0(int i6) {
        this.f54712a = i6;
    }

    @Override // p200u.B0
    public /* synthetic */ boolean a() {
        return p200u.G0.a(this);
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return rVar3;
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return j6 < ((long) d()) * 1000000 ? rVar : rVar2;
    }

    @Override // p200u.F0
    public int d() {
        return this.f54712a;
    }

    @Override // p200u.B0
    public /* synthetic */ long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.E0.a(this, rVar, rVar2, rVar3);
    }

    @Override // p200u.F0
    public int f() {
        return 0;
    }

    @Override // p200u.B0
    public /* synthetic */ p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.A0.a(this, rVar, rVar2, rVar3);
    }
}
