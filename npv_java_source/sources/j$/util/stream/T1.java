package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class T1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f48359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.LongBinaryOperator f48360c;

    T1(java.util.function.LongBinaryOperator longBinaryOperator) {
        this.f48360c = longBinaryOperator;
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
    public final void accept(long j6) {
        if (this.f48358a) {
            this.f48358a = false;
        } else {
            j6 = this.f48360c.applyAsLong(this.f48359b, j6);
        }
        this.f48359b = j6;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        j$.util.stream.T1 t6 = (j$.util.stream.T1) u6;
        if (t6.f48358a) {
            return;
        }
        accept(t6.f48359b);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return this.f48358a ? j$.util.B.a() : j$.util.B.d(this.f48359b);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48358a = true;
        this.f48359b = 0L;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
