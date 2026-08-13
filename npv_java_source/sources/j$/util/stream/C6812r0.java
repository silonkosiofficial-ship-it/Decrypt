package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6812r0 extends j$.util.stream.AbstractC6827u0 implements j$.util.stream.InterfaceC6800o2 {
    @Override // j$.util.stream.AbstractC6827u0, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        if (this.f48558a) {
            return;
        }
        java.util.function.IntPredicate intPredicate = null;
        intPredicate.test(i6);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }
}
