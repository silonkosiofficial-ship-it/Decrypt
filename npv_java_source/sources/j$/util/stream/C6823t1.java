package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6823t1 extends j$.util.stream.AbstractC6838w1 implements j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f48550h;

    C6823t1(j$.util.Spliterator spliterator, j$.util.stream.AbstractC6732b abstractC6732b, int[] iArr) {
        super(spliterator, abstractC6732b, iArr.length);
        this.f48550h = iArr;
    }

    C6823t1(j$.util.stream.C6823t1 c6823t1, j$.util.Spliterator spliterator, long j6, long j10) {
        super(c6823t1, spliterator, j6, j10, c6823t1.f48550h.length);
        this.f48550h = c6823t1.f48550h;
    }

    @Override // j$.util.stream.AbstractC6838w1, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        int i10 = this.f48580f;
        if (i10 >= this.f48581g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(this.f48580f));
        }
        int[] iArr = this.f48550h;
        this.f48580f = i10 + 1;
        iArr[i10] = i6;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC6838w1
    final j$.util.stream.AbstractC6838w1 b(j$.util.Spliterator spliterator, long j6, long j10) {
        return new j$.util.stream.C6823t1(this, spliterator, j6, j10);
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }
}
