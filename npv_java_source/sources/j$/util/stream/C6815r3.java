package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6815r3 implements j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.IntConsumer f48543b;

    public /* synthetic */ C6815r3(java.util.function.IntConsumer intConsumer, int i6) {
        this.f48542a = i6;
        this.f48543b = intConsumer;
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
        switch (this.f48542a) {
            case 0:
                j$.util.stream.AbstractC6845y0.a();
                throw null;
            default:
                j$.util.stream.AbstractC6845y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        switch (this.f48542a) {
            case 0:
                ((j$.util.stream.V2) this.f48543b).accept(i6);
                break;
            default:
                this.f48543b.accept(i6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        switch (this.f48542a) {
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
        switch (this.f48542a) {
            case 0:
                l((java.lang.Integer) obj);
                break;
            default:
                l((java.lang.Integer) obj);
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48542a) {
            case 0:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        switch (this.f48542a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
        int i6 = this.f48542a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void k(long j6) {
        int i6 = this.f48542a;
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        switch (this.f48542a) {
            case 0:
                j$.util.stream.AbstractC6845y0.g(this, num);
                break;
            default:
                j$.util.stream.AbstractC6845y0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        switch (this.f48542a) {
        }
        return false;
    }
}
