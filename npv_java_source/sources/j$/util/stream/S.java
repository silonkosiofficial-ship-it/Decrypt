package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class S implements j$.util.stream.L3, j$.util.stream.M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48340a;

    protected S(boolean z6) {
        this.f48340a = z6;
    }

    public /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.L3
    public final int d() {
        if (this.f48340a) {
            return 0;
        }
        return j$.util.stream.EnumC6756f3.f48460r;
    }

    public final void e(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        (this.f48340a ? new j$.util.stream.T(abstractC6732b, spliterator, this) : new j$.util.stream.U(abstractC6732b, spliterator, abstractC6732b.S(this))).invoke();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void k(long j6) {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
