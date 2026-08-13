package p055f4;

/* JADX INFO: renamed from: f4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6565l implements p055f4.InterfaceC6586w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p055f4.C6557h f45176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p055f4.S f45177b;

    @Override // p055f4.InterfaceC6586w
    public final /* bridge */ /* synthetic */ p055f4.InterfaceC6586w a(p055f4.S s6) {
        this.f45177b = s6;
        return this;
    }

    @Override // p055f4.InterfaceC6586w
    public final p055f4.InterfaceC6588x b() {
        p055f4.U0.b(this.f45177b, p055f4.S.class);
        return new p055f4.C6569n(this.f45176a, this.f45177b, null);
    }
}
