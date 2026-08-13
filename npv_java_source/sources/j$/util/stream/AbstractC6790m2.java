package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6790m2 implements j$.util.stream.InterfaceC6810q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.stream.InterfaceC6810q2 f48510a;

    public AbstractC6790m2(j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        this.f48510a = (j$.util.stream.InterfaceC6810q2) j$.util.Objects.requireNonNull(interfaceC6810q2);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public void j() {
        this.f48510a.j();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        this.f48510a.k(j6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public boolean m() {
        return this.f48510a.m();
    }
}
