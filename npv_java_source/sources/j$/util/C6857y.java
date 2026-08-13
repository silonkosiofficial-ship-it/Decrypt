package j$.util;

/* JADX INFO: renamed from: j$.util.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6857y implements java.util.function.LongConsumer, java.util.function.IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        accept(i6);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.count++;
        this.sum += j6;
        this.min = java.lang.Math.min(this.min, j6);
        this.max = java.lang.Math.max(this.max, j6);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    public final void b(j$.util.C6857y c6857y) {
        this.count += c6857y.count;
        this.sum += c6857y.sum;
        this.min = java.lang.Math.min(this.min, c6857y.min);
        this.max = java.lang.Math.max(this.max, c6857y.max);
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = j$.util.C6857y.class.getSimpleName();
        java.lang.Long lValueOf = java.lang.Long.valueOf(this.count);
        java.lang.Long lValueOf2 = java.lang.Long.valueOf(this.sum);
        java.lang.Long lValueOf3 = java.lang.Long.valueOf(this.min);
        long j6 = this.count;
        return java.lang.String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, lValueOf3, java.lang.Double.valueOf(j6 > 0 ? this.sum / j6 : 0.0d), java.lang.Long.valueOf(this.max));
    }
}
