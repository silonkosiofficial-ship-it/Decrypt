package j$.util;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6854v implements java.util.function.DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f48608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f48609b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void c(double d6) {
        double d10 = d6 - this.f48608a;
        double d11 = this.sum;
        double d12 = d11 + d10;
        this.f48608a = (d12 - d11) - d10;
        this.sum = d12;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.count++;
        this.f48609b += d6;
        c(d6);
        this.min = java.lang.Math.min(this.min, d6);
        this.max = java.lang.Math.max(this.max, d6);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    public final void b(j$.util.C6854v c6854v) {
        this.count += c6854v.count;
        this.f48609b += c6854v.f48609b;
        c(c6854v.sum);
        c(c6854v.f48608a);
        this.min = java.lang.Math.min(this.min, c6854v.min);
        this.max = java.lang.Math.max(this.max, c6854v.max);
    }

    public final java.lang.String toString() {
        double d6;
        java.lang.String simpleName = j$.util.C6854v.class.getSimpleName();
        java.lang.Long lValueOf = java.lang.Long.valueOf(this.count);
        double d10 = this.sum + this.f48608a;
        if (java.lang.Double.isNaN(d10) && java.lang.Double.isInfinite(this.f48609b)) {
            d10 = this.f48609b;
        }
        java.lang.Double dValueOf = java.lang.Double.valueOf(d10);
        java.lang.Double dValueOf2 = java.lang.Double.valueOf(this.min);
        if (this.count > 0) {
            double d11 = this.sum + this.f48608a;
            if (java.lang.Double.isNaN(d11) && java.lang.Double.isInfinite(this.f48609b)) {
                d11 = this.f48609b;
            }
            d6 = d11 / this.count;
        } else {
            d6 = 0.0d;
        }
        return java.lang.String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, java.lang.Double.valueOf(d6), java.lang.Double.valueOf(this.max));
    }
}
