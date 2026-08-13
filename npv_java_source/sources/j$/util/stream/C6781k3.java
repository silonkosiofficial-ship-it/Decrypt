package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6781k3 extends j$.util.stream.AbstractC6786l3 implements java.util.function.LongConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f48501c;

    C6781k3(int i6) {
        this.f48501c = new long[i6];
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        int i6 = this.f48505b;
        this.f48505b = i6 + 1;
        this.f48501c[i6] = j6;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC6786l3
    public final void b(java.lang.Object obj, long j6) {
        java.util.function.LongConsumer longConsumer = (java.util.function.LongConsumer) obj;
        for (int i6 = 0; i6 < j6; i6++) {
            longConsumer.accept(this.f48501c[i6]);
        }
    }
}
