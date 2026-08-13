package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6776j3 extends j$.util.stream.AbstractC6786l3 implements java.util.function.IntConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f48494c;

    C6776j3(int i6) {
        this.f48494c = new int[i6];
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        int i10 = this.f48505b;
        this.f48505b = i10 + 1;
        this.f48494c[i10] = i6;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC6786l3
    public final void b(java.lang.Object obj, long j6) {
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj;
        for (int i6 = 0; i6 < j6; i6++) {
            intConsumer.accept(this.f48494c[i6]);
        }
    }
}
