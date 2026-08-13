package T;

/* JADX INFO: renamed from: T.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1646e implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f12810C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f12811D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f12812E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f12813F;

    public C1646e(int i6, int i10, int i11, long j6) {
        this.f12810C = i6;
        this.f12811D = i10;
        this.f12812E = i11;
        this.f12813F = j6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(T.C1646e c1646e) {
        return p247y7.AbstractC7350t.h(this.f12813F, c1646e.f12813F);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.C1646e)) {
            return false;
        }
        T.C1646e c1646e = (T.C1646e) obj;
        return this.f12810C == c1646e.f12810C && this.f12811D == c1646e.f12811D && this.f12812E == c1646e.f12812E && this.f12813F == c1646e.f12813F;
    }

    public final int g() {
        return this.f12811D;
    }

    public int hashCode() {
        return (((((this.f12810C * 31) + this.f12811D) * 31) + this.f12812E) * 31) + p170r.r.a(this.f12813F);
    }

    public final long i() {
        return this.f12813F;
    }

    public final int m() {
        return this.f12810C;
    }

    public java.lang.String toString() {
        return "CalendarDate(year=" + this.f12810C + ", month=" + this.f12811D + ", dayOfMonth=" + this.f12812E + ", utcTimeMillis=" + this.f12813F + ')';
    }
}
