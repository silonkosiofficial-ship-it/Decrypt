package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6825t3 implements j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.LongConsumer f48555b;

    public /* synthetic */ C6825t3(java.util.function.LongConsumer longConsumer, int i6) {
        this.f48554a = i6;
        this.f48555b = longConsumer;
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
        switch (this.f48554a) {
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
        switch (this.f48554a) {
            case 0:
                j$.util.stream.AbstractC6845y0.k();
                throw null;
            default:
                j$.util.stream.AbstractC6845y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        switch (this.f48554a) {
            case 0:
                ((j$.util.stream.X2) this.f48555b).accept(j6);
                break;
            default:
                this.f48555b.accept(j6);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        switch (this.f48554a) {
            case 0:
                i((java.lang.Long) obj);
                break;
            default:
                i((java.lang.Long) obj);
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48554a) {
            case 0:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        switch (this.f48554a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        switch (this.f48554a) {
            case 0:
                j$.util.stream.AbstractC6845y0.i(this, l6);
                break;
            default:
                j$.util.stream.AbstractC6845y0.i(this, l6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
        int i6 = this.f48554a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void k(long j6) {
        int i6 = this.f48554a;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        switch (this.f48554a) {
        }
        return false;
    }
}
