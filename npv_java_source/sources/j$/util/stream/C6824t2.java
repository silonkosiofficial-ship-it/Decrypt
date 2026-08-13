package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6824t2 extends j$.util.stream.AbstractC6780k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f48552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6829u2 f48553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6824t2(j$.util.stream.C6829u2 c6829u2, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48553d = c6829u2;
        this.f48551b = c6829u2.f48561m;
        long j6 = c6829u2.f48562n;
        this.f48552c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        long j6 = this.f48551b;
        if (j6 != 0) {
            this.f48551b = j6 - 1;
            return;
        }
        long j10 = this.f48552c;
        if (j10 > 0) {
            this.f48552c = j10 - 1;
            this.f48500a.accept(i6);
        }
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48500a.k(j$.util.stream.AbstractC6845y0.A(j6, this.f48553d.f48561m, this.f48552c));
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        return this.f48552c == 0 || this.f48500a.m();
    }
}
