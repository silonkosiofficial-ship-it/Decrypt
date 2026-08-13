package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class A3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f48200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f48201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.util.Spliterator f48202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f48203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f48204e;

    A3(j$.util.Spliterator spliterator, long j6, long j10, long j11, long j12) {
        this.f48202c = spliterator;
        this.f48200a = j6;
        this.f48201b = j10;
        this.f48203d = j11;
        this.f48204e = j12;
    }

    protected abstract j$.util.Spliterator a(j$.util.Spliterator spliterator, long j6, long j10, long j11, long j12);

    public final int characteristics() {
        return this.f48202c.characteristics();
    }

    public final long estimateSize() {
        long j6 = this.f48204e;
        long j10 = this.f48200a;
        if (j10 < j6) {
            return j6 - java.lang.Math.max(j10, this.f48203d);
        }
        return 0L;
    }

    public final j$.util.Spliterator trySplit() {
        long j6 = this.f48204e;
        if (this.f48200a >= j6 || this.f48203d >= j6) {
            return null;
        }
        while (true) {
            j$.util.Spliterator spliteratorTrySplit = this.f48202c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f48203d;
            long jMin = java.lang.Math.min(jEstimateSize, this.f48201b);
            long j10 = this.f48200a;
            if (j10 >= jMin) {
                this.f48203d = jMin;
            } else {
                long j11 = this.f48201b;
                if (jMin < j11) {
                    long j12 = this.f48203d;
                    if (j12 < j10 || jEstimateSize > j11) {
                        this.f48203d = jMin;
                        return a(spliteratorTrySplit, j10, j11, j12, jMin);
                    }
                    this.f48203d = jMin;
                    return spliteratorTrySplit;
                }
                this.f48202c = spliteratorTrySplit;
                this.f48204e = jMin;
            }
        }
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.U m160trySplit() {
        return (j$.util.U) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.X m161trySplit() {
        return (j$.util.X) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a0 m162trySplit() {
        return (j$.util.a0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d0 m163trySplit() {
        return (j$.util.d0) trySplit();
    }
}
