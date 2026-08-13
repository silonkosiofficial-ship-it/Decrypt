package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6771i3 extends j$.util.stream.AbstractC6786l3 implements java.util.function.DoubleConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double[] f48490c;

    C6771i3(int i6) {
        this.f48490c = new double[i6];
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        int i6 = this.f48505b;
        this.f48505b = i6 + 1;
        this.f48490c[i6] = d6;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC6786l3
    final void b(java.lang.Object obj, long j6) {
        java.util.function.DoubleConsumer doubleConsumer = (java.util.function.DoubleConsumer) obj;
        for (int i6 = 0; i6 < j6; i6++) {
            doubleConsumer.accept(this.f48490c[i6]);
        }
    }
}
