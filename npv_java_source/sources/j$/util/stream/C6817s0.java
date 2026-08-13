package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6817s0 extends j$.util.stream.AbstractC6827u0 implements j$.util.stream.InterfaceC6805p2 {
    @Override // j$.util.stream.AbstractC6827u0, j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        if (this.f48558a) {
            return;
        }
        java.util.function.LongPredicate longPredicate = null;
        longPredicate.test(j6);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }
}
