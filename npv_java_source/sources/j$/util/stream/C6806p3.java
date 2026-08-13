package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6806p3 implements j$.util.stream.InterfaceC6795n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.DoubleConsumer f48533b;

    public /* synthetic */ C6806p3(java.util.function.DoubleConsumer doubleConsumer, int i6) {
        this.f48532a = i6;
        this.f48533b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j6) {
    }

    private final /* synthetic */ void c(long j6) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC6795n2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        switch (this.f48532a) {
            case 0:
                ((j$.util.stream.T2) this.f48533b).accept(d6);
                break;
            default:
                this.f48533b.accept(d6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(int i6) {
        switch (this.f48532a) {
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
        switch (this.f48532a) {
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
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        switch (this.f48532a) {
            case 0:
                o((java.lang.Double) obj);
                break;
            default:
                o((java.lang.Double) obj);
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48532a) {
            case 0:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        switch (this.f48532a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
        int i6 = this.f48532a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void k(long j6) {
        int i6 = this.f48532a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        switch (this.f48532a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        switch (this.f48532a) {
            case 0:
                j$.util.stream.AbstractC6845y0.e(this, d6);
                break;
            default:
                j$.util.stream.AbstractC6845y0.e(this, d6);
                break;
        }
    }
}
