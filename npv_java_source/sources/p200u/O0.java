package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements p200u.H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p200u.I0 f54720c;

    public O0(float f6, float f10, p200u.r rVar) {
        this(f6, f10, p200u.C0.c(rVar, f6, f10));
    }

    private O0(float f6, float f10, p200u.InterfaceC7192t interfaceC7192t) {
        this.f54718a = f6;
        this.f54719b = f10;
        this.f54720c = new p200u.I0(interfaceC7192t);
    }

    @Override // p200u.B0
    public boolean a() {
        return this.f54720c.a();
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54720c.b(j6, rVar, rVar2, rVar3);
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54720c.c(j6, rVar, rVar2, rVar3);
    }

    @Override // p200u.B0
    public long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54720c.e(rVar, rVar2, rVar3);
    }

    @Override // p200u.B0
    public p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return this.f54720c.g(rVar, rVar2, rVar3);
    }
}
