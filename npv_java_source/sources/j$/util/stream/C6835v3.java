package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6835v3 extends j$.util.stream.y3 implements j$.util.U {
    @Override // j$.util.stream.A3
    protected final j$.util.Spliterator a(j$.util.Spliterator spliterator, long j6, long j10, long j11, long j12) {
        return new j$.util.stream.C6835v3((j$.util.U) spliterator, j6, j10, j11, j12);
    }

    @Override // j$.util.stream.y3
    protected final java.lang.Object b() {
        return new j$.util.stream.D0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }
}
