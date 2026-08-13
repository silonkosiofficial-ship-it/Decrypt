package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6813r1 extends j$.util.stream.X2 implements j$.util.stream.I0, j$.util.stream.B0 {
    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final j$.util.stream.I0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final j$.util.stream.K0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
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
        return (long[]) super.d();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final void e(java.lang.Object obj) {
        super.e((java.util.function.LongConsumer) obj);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
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

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final void q(int i6, java.lang.Object obj) {
        super.q(i6, (long[]) obj);
    }

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.d0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Long[] lArr, int i6) {
        j$.util.stream.AbstractC6845y0.p(this, lArr, i6);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.I0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.v(this, j6, j10);
    }
}
