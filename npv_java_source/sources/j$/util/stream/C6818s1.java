package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6818s1 extends j$.util.stream.AbstractC6838w1 implements j$.util.stream.InterfaceC6795n2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double[] f48545h;

    C6818s1(j$.util.Spliterator spliterator, j$.util.stream.AbstractC6732b abstractC6732b, double[] dArr) {
        super(spliterator, abstractC6732b, dArr.length);
        this.f48545h = dArr;
    }

    C6818s1(j$.util.stream.C6818s1 c6818s1, j$.util.Spliterator spliterator, long j6, long j10) {
        super(c6818s1, spliterator, j6, j10, c6818s1.f48545h.length);
        this.f48545h = c6818s1.f48545h;
    }

    @Override // j$.util.stream.AbstractC6838w1, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        int i6 = this.f48580f;
        if (i6 >= this.f48581g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(this.f48580f));
        }
        double[] dArr = this.f48545h;
        this.f48580f = i6 + 1;
        dArr[i6] = d6;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC6838w1
    final j$.util.stream.AbstractC6838w1 b(j$.util.Spliterator spliterator, long j6, long j10) {
        return new j$.util.stream.C6818s1(this, spliterator, j6, j10);
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }
}
