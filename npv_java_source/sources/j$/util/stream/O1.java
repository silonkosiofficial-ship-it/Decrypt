package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class O1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f48304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.IntBinaryOperator f48305c;

    O1(int i6, java.util.function.IntBinaryOperator intBinaryOperator) {
        this.f48304b = i6;
        this.f48305c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        this.f48303a = this.f48305c.applyAsInt(this.f48303a, i6);
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        accept(((j$.util.stream.O1) u6).f48303a);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Integer.valueOf(this.f48303a);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48303a = this.f48304b;
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
