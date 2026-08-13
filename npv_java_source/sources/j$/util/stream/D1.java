package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class D1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6795n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f48218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ double f48219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.DoubleBinaryOperator f48220c;

    D1(double d6, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        this.f48219b = d6;
        this.f48220c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        this.f48218a = this.f48220c.applyAsDouble(this.f48218a, d6);
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

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        accept(((j$.util.stream.D1) u6).f48218a);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Double.valueOf(this.f48218a);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48218a = this.f48219b;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }
}
