package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Z0 extends j$.util.stream.T2 implements j$.util.stream.E0, j$.util.stream.InterfaceC6849z0 {
    @Override // j$.util.stream.InterfaceC6849z0, j$.util.stream.C0
    public final j$.util.stream.E0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final j$.util.stream.K0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.stream.J0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ j$.util.stream.K0 b(int i6) {
        b(i6);
        throw null;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final java.lang.Object d() {
        return (double[]) super.d();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final void e(java.lang.Object obj) {
        super.e((java.util.function.DoubleConsumer) obj);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        clear();
        u(j6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final void q(int i6, java.lang.Object obj) {
        super.q(i6, (double[]) obj);
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.d0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Double[] dArr, int i6) {
        j$.util.stream.AbstractC6845y0.n(this, dArr, i6);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.E0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.t(this, j6, j10);
    }
}
