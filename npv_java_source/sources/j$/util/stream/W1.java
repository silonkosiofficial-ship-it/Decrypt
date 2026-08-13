package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class W1 extends j$.util.stream.AbstractC6730a2 implements j$.util.stream.InterfaceC6795n2 {
    @Override // j$.util.stream.AbstractC6730a2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        this.f48405b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        this.f48405b += ((j$.util.stream.AbstractC6730a2) u6).f48405b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Long.valueOf(this.f48405b);
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }
}
