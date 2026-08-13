package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6822t0 extends j$.util.stream.AbstractC6827u0 implements j$.util.stream.InterfaceC6795n2 {
    @Override // j$.util.stream.AbstractC6827u0, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        if (this.f48558a) {
            return;
        }
        java.util.function.DoublePredicate doublePredicate = null;
        doublePredicate.test(d6);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }
}
