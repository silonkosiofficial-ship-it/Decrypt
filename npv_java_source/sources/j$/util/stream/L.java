package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class L implements j$.util.stream.M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f48275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Object f48276b;

    @Override // j$.util.stream.InterfaceC6810q2
    public /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(java.lang.Object obj) {
        if (this.f48275a) {
            return;
        }
        this.f48275a = true;
        this.f48276b = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void k(long j6) {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        return this.f48275a;
    }
}
