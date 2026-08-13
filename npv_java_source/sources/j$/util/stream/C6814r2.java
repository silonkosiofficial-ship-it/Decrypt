package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6814r2 extends j$.util.stream.AbstractC6790m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f48540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6819s2 f48541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6814r2(j$.util.stream.C6819s2 c6819s2, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48541d = c6819s2;
        this.f48539b = c6819s2.f48546m;
        long j6 = c6819s2.f48547n;
        this.f48540c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(java.lang.Object obj) {
        long j6 = this.f48539b;
        if (j6 != 0) {
            this.f48539b = j6 - 1;
            return;
        }
        long j10 = this.f48540c;
        if (j10 > 0) {
            this.f48540c = j10 - 1;
            this.f48510a.o(obj);
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48510a.k(j$.util.stream.AbstractC6845y0.A(j6, this.f48541d.f48546m, this.f48540c));
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        return this.f48540c == 0 || this.f48510a.m();
    }
}
