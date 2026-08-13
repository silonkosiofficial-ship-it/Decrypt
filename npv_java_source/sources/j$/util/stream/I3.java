package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I3 implements j$.util.stream.InterfaceC6810q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f48260b;

    public /* synthetic */ I3(java.util.function.Consumer consumer, int i6) {
        this.f48259a = i6;
        this.f48260b = consumer;
    }

    private final /* synthetic */ void b(long j6) {
    }

    private final /* synthetic */ void c(long j6) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        switch (this.f48259a) {
            case 0:
                j$.util.stream.AbstractC6845y0.a();
                throw null;
            default:
                j$.util.stream.AbstractC6845y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(int i6) {
        switch (this.f48259a) {
            case 0:
                j$.util.stream.AbstractC6845y0.k();
                throw null;
            default:
                j$.util.stream.AbstractC6845y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        switch (this.f48259a) {
            case 0:
                j$.util.stream.AbstractC6845y0.l();
                throw null;
            default:
                j$.util.stream.AbstractC6845y0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(java.lang.Object obj) {
        switch (this.f48259a) {
            case 0:
                ((j$.util.stream.C6731a3) this.f48260b).o(obj);
                break;
            default:
                this.f48260b.o(obj);
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48259a) {
            case 0:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
        int i6 = this.f48259a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void k(long j6) {
        int i6 = this.f48259a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        switch (this.f48259a) {
        }
        return false;
    }
}
