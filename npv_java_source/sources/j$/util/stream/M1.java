package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class M1 extends j$.util.stream.V1 implements j$.util.stream.U1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.util.function.Supplier f48289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.BiConsumer f48290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.util.function.BinaryOperator f48291d;

    M1(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BinaryOperator binaryOperator) {
        this.f48289b = supplier;
        this.f48290c = biConsumer;
        this.f48291d = binaryOperator;
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

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(java.lang.Object obj) {
        this.f48290c.accept(this.f48381a, obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        this.f48381a = this.f48291d.apply(this.f48381a, ((j$.util.stream.M1) u6).f48381a);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48381a = this.f48289b.get();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
