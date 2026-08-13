package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class K1 implements j$.util.stream.U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f48271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.BinaryOperator f48272c;

    K1(java.util.function.BinaryOperator binaryOperator) {
        this.f48272c = binaryOperator;
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
        if (this.f48270a) {
            this.f48270a = false;
        } else {
            obj = this.f48272c.apply(this.f48271b, obj);
        }
        this.f48271b = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        j$.util.stream.K1 k6 = (j$.util.stream.K1) u6;
        if (k6.f48270a) {
            return;
        }
        o(k6.f48271b);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return this.f48270a ? j$.util.Optional.empty() : j$.util.Optional.of(this.f48271b);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48270a = true;
        this.f48271b = null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
