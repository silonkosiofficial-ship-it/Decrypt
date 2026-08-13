package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6834v2 extends j$.util.stream.AbstractC6785l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f48570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6839w2 f48571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6834v2(j$.util.stream.C6839w2 c6839w2, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48571d = c6839w2;
        this.f48569b = c6839w2.f48582m;
        long j6 = c6839w2.f48583n;
        this.f48570c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        long j10 = this.f48569b;
        if (j10 != 0) {
            this.f48569b = j10 - 1;
            return;
        }
        long j11 = this.f48570c;
        if (j11 > 0) {
            this.f48570c = j11 - 1;
            this.f48504a.accept(j6);
        }
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48504a.k(j$.util.stream.AbstractC6845y0.A(j6, this.f48571d.f48582m, this.f48570c));
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        return this.f48570c == 0 || this.f48504a.m();
    }
}
