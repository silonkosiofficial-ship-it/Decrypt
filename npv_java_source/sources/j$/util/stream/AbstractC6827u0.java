package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6827u0 implements j$.util.stream.InterfaceC6810q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f48558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f48559b;

    AbstractC6827u0(j$.util.stream.EnumC6832v0 enumC6832v0) {
        this.f48559b = !enumC6832v0.f48567b;
    }

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
        return this.f48558a;
    }
}
