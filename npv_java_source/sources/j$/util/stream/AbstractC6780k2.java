package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6780k2 implements j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.stream.InterfaceC6810q2 f48500a;

    public AbstractC6780k2(j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        this.f48500a = (j$.util.stream.InterfaceC6810q2) j$.util.Objects.requireNonNull(interfaceC6810q2);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public void j() {
        this.f48500a.j();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        this.f48500a.k(j6);
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public boolean m() {
        return this.f48500a.m();
    }
}
