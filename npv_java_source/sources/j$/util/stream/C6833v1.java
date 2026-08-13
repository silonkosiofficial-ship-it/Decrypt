package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6833v1 extends j$.util.stream.AbstractC6838w1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Object[] f48568h;

    C6833v1(j$.util.Spliterator spliterator, j$.util.stream.AbstractC6732b abstractC6732b, java.lang.Object[] objArr) {
        super(spliterator, abstractC6732b, objArr.length);
        this.f48568h = objArr;
    }

    C6833v1(j$.util.stream.C6833v1 c6833v1, j$.util.Spliterator spliterator, long j6, long j10) {
        super(c6833v1, spliterator, j6, j10, c6833v1.f48568h.length);
        this.f48568h = c6833v1.f48568h;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i6 = this.f48580f;
        if (i6 >= this.f48581g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(this.f48580f));
        }
        java.lang.Object[] objArr = this.f48568h;
        this.f48580f = i6 + 1;
        objArr[i6] = obj;
    }

    @Override // j$.util.stream.AbstractC6838w1
    final j$.util.stream.AbstractC6838w1 b(j$.util.Spliterator spliterator, long j6, long j10) {
        return new j$.util.stream.C6833v1(this, spliterator, j6, j10);
    }
}
