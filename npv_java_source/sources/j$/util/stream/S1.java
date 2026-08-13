package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class S1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f48341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f48342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.LongBinaryOperator f48343c;

    S1(long j6, java.util.function.LongBinaryOperator longBinaryOperator) {
        this.f48342b = j6;
        this.f48343c = longBinaryOperator;
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
        this.f48341a = this.f48343c.applyAsLong(this.f48341a, j6);
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
        accept(((j$.util.stream.S1) u6).f48341a);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Long.valueOf(this.f48341a);
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
        this.f48341a = this.f48342b;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
