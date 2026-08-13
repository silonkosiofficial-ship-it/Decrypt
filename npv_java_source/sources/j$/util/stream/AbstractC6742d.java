package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6742d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f48425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f48426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f48427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long[] f48428d;

    protected AbstractC6742d() {
        this.f48425a = 4;
    }

    protected AbstractC6742d(int i6) {
        if (i6 >= 0) {
            this.f48425a = java.lang.Math.max(4, 32 - java.lang.Integer.numberOfLeadingZeros(i6 - 1));
        } else {
            throw new java.lang.IllegalArgumentException("Illegal Capacity: " + i6);
        }
    }

    public abstract void clear();

    public final long count() {
        int i6 = this.f48427c;
        return i6 == 0 ? this.f48426b : this.f48428d[i6] + ((long) this.f48426b);
    }
}
