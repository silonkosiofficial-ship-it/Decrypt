package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Q1 implements j$.util.stream.U1, j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.util.function.IntBinaryOperator f48320c;

    Q1(java.util.function.IntBinaryOperator intBinaryOperator) {
        this.f48320c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        if (this.f48318a) {
            this.f48318a = false;
        } else {
            i6 = this.f48320c.applyAsInt(this.f48319b, i6);
        }
        this.f48319b = i6;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        j$.util.stream.Q1 q6 = (j$.util.stream.Q1) u6;
        if (q6.f48318a) {
            return;
        }
        accept(q6.f48319b);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return this.f48318a ? j$.util.A.a() : j$.util.A.d(this.f48319b);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48318a = true;
        this.f48319b = 0;
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
