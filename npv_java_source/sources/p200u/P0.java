package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements p200u.F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.F f54723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p200u.I0 f54724d;

    public P0(int i6, int i10, p200u.F f6) {
        this.f54721a = i6;
        this.f54722b = i10;
        this.f54723c = f6;
        this.f54724d = new p200u.I0(new p200u.O(f(), d(), f6));
    }

    @Override // p200u.B0
    public /* synthetic */ boolean a() {
        return p200u.G0.a(this);
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54724d.b(j6, rVar, rVar2, rVar3);
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54724d.c(j6, rVar, rVar2, rVar3);
    }

    @Override // p200u.F0
    public int d() {
        return this.f54722b;
    }

    @Override // p200u.B0
    public /* synthetic */ long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.E0.a(this, rVar, rVar2, rVar3);
    }

    @Override // p200u.F0
    public int f() {
        return this.f54721a;
    }

    @Override // p200u.B0
    public /* synthetic */ p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.A0.a(this, rVar, rVar2, rVar3);
    }
}
