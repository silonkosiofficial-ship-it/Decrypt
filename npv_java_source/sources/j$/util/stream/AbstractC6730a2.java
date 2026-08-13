package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6730a2 extends j$.util.stream.V1 implements j$.util.stream.U1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48405b;

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

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48405b = 0L;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
