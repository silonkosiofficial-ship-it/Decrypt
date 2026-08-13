package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6843x2 extends j$.util.stream.AbstractC6775j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f48587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6847y2 f48588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6843x2(j$.util.stream.C6847y2 c6847y2, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48588d = c6847y2;
        this.f48586b = c6847y2.f48599m;
        long j6 = c6847y2.f48600n;
        this.f48587c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.InterfaceC6795n2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        long j6 = this.f48586b;
        if (j6 != 0) {
            this.f48586b = j6 - 1;
            return;
        }
        long j10 = this.f48587c;
        if (j10 > 0) {
            this.f48587c = j10 - 1;
            this.f48493a.accept(d6);
        }
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48493a.k(j$.util.stream.AbstractC6845y0.A(j6, this.f48588d.f48599m, this.f48587c));
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        return this.f48587c == 0 || this.f48493a.m();
    }
}
