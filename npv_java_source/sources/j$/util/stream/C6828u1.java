package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6828u1 extends j$.util.stream.AbstractC6838w1 implements j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long[] f48560h;

    C6828u1(j$.util.Spliterator spliterator, j$.util.stream.AbstractC6732b abstractC6732b, long[] jArr) {
        super(spliterator, abstractC6732b, jArr.length);
        this.f48560h = jArr;
    }

    C6828u1(j$.util.stream.C6828u1 c6828u1, j$.util.Spliterator spliterator, long j6, long j10) {
        super(c6828u1, spliterator, j6, j10, c6828u1.f48560h.length);
        this.f48560h = c6828u1.f48560h;
    }

    @Override // j$.util.stream.AbstractC6838w1, j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        int i6 = this.f48580f;
        if (i6 >= this.f48581g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(this.f48580f));
        }
        long[] jArr = this.f48560h;
        this.f48580f = i6 + 1;
        jArr[i6] = j6;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC6838w1
    final j$.util.stream.AbstractC6838w1 b(j$.util.Spliterator spliterator, long j6, long j10) {
        return new j$.util.stream.C6828u1(this, spliterator, j6, j10);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }
}
