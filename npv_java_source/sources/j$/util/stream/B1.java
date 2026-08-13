package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class B1 extends j$.util.stream.V1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.util.function.Supplier f48206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.ObjLongConsumer f48207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.util.function.BinaryOperator f48208d;

    B1(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BinaryOperator binaryOperator) {
        this.f48206b = supplier;
        this.f48207c = objLongConsumer;
        this.f48208d = binaryOperator;
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
    public final void accept(long j6) {
        this.f48207c.accept(this.f48381a, j6);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        this.f48381a = this.f48208d.apply(this.f48381a, ((j$.util.stream.B1) u6).f48381a);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48381a = this.f48206b.get();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
