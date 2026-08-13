package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6785l2 implements j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.stream.InterfaceC6810q2 f48504a;

    public AbstractC6785l2(j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        this.f48504a = (j$.util.stream.InterfaceC6810q2) j$.util.Objects.requireNonNull(interfaceC6810q2);
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public void j() {
        this.f48504a.j();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        this.f48504a.k(j6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public boolean m() {
        return this.f48504a.m();
    }
}
