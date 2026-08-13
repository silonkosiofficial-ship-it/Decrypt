package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Y1 extends j$.util.stream.AbstractC6730a2 implements j$.util.stream.InterfaceC6805p2 {
    @Override // j$.util.stream.AbstractC6730a2, j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48405b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        this.f48405b += ((j$.util.stream.AbstractC6730a2) u6).f48405b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Long.valueOf(this.f48405b);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }
}
