package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements p200u.B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.F0 f54684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.EnumC7168f0 f54685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f54687d;

    private K0(p200u.F0 f6, p200u.EnumC7168f0 enumC7168f0, long j6) {
        this.f54684a = f6;
        this.f54685b = enumC7168f0;
        this.f54686c = ((long) (f6.d() + f6.f())) * 1000000;
        this.f54687d = j6 * 1000000;
    }

    public /* synthetic */ K0(p200u.F0 f6, p200u.EnumC7168f0 enumC7168f0, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, enumC7168f0, j6);
    }

    private final long h(long j6) {
        long j10 = this.f54687d;
        if (j6 + j10 <= 0) {
            return 0L;
        }
        long j11 = j6 + j10;
        long j12 = this.f54686c;
        long j13 = j11 / j12;
        if (this.f54685b != p200u.EnumC7168f0.Restart && j13 % ((long) 2) != 0) {
            return ((j13 + 1) * j12) - j11;
        }
        java.lang.Long.signum(j13);
        return j11 - (j13 * j12);
    }

    private final p200u.r i(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        long j10 = this.f54687d;
        long j11 = j6 + j10;
        long j12 = this.f54686c;
        return j11 > j12 ? this.f54684a.b(j12 - j10, rVar, rVar3, rVar2) : rVar2;
    }

    @Override // p200u.B0
    public boolean a() {
        return true;
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54684a.b(h(j6), rVar, rVar2, i(j6, rVar, rVar3, rVar2));
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54684a.c(h(j6), rVar, rVar2, i(j6, rVar, rVar3, rVar2));
    }

    @Override // p200u.B0
    public long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return Long.MAX_VALUE;
    }

    @Override // p200u.B0
    public /* synthetic */ p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.A0.a(this, rVar, rVar2, rVar3);
    }
}
