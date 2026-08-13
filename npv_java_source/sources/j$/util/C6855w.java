package j$.util;

/* JADX INFO: renamed from: j$.util.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6855w implements java.util.function.IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.count++;
        this.sum += (long) i6;
        this.min = java.lang.Math.min(this.min, i6);
        this.max = java.lang.Math.max(this.max, i6);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    public final void b(j$.util.C6855w c6855w) {
        this.count += c6855w.count;
        this.sum += c6855w.sum;
        this.min = java.lang.Math.min(this.min, c6855w.min);
        this.max = java.lang.Math.max(this.max, c6855w.max);
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = j$.util.C6855w.class.getSimpleName();
        java.lang.Long lValueOf = java.lang.Long.valueOf(this.count);
        java.lang.Long lValueOf2 = java.lang.Long.valueOf(this.sum);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.min);
        long j6 = this.count;
        return java.lang.String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, java.lang.Double.valueOf(j6 > 0 ? this.sum / j6 : 0.0d), java.lang.Integer.valueOf(this.max));
    }
}
