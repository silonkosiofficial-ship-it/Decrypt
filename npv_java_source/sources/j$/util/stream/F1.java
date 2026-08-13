package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class F1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6795n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f48232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.DoubleBinaryOperator f48233c;

    F1(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        this.f48233c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        if (this.f48231a) {
            this.f48231a = false;
        } else {
            d6 = this.f48233c.applyAsDouble(this.f48232b, d6);
        }
        this.f48232b = d6;
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        j$.util.stream.F1 f6 = (j$.util.stream.F1) u6;
        if (f6.f48231a) {
            return;
        }
        accept(f6.f48232b);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return this.f48231a ? j$.util.C6858z.a() : j$.util.C6858z.d(this.f48232b);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48231a = true;
        this.f48232b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }
}
