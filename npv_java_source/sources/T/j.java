package T;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f12826f;

    public j(int i6, int i10, int i11, int i12, long j6) {
        this.f12821a = i6;
        this.f12822b = i10;
        this.f12823c = i11;
        this.f12824d = i12;
        this.f12825e = j6;
        this.f12826f = (j6 + (((long) i11) * 86400000)) - 1;
    }

    public final int a() {
        return this.f12824d;
    }

    public final int b() {
        return this.f12822b;
    }

    public final int c() {
        return this.f12823c;
    }

    public final long d() {
        return this.f12825e;
    }

    public final int e() {
        return this.f12821a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.j)) {
            return false;
        }
        T.j jVar = (T.j) obj;
        return this.f12821a == jVar.f12821a && this.f12822b == jVar.f12822b && this.f12823c == jVar.f12823c && this.f12824d == jVar.f12824d && this.f12825e == jVar.f12825e;
    }

    public final int f(E7.i iVar) {
        return (((this.f12821a - iVar.f()) * 12) + this.f12822b) - 1;
    }

    public int hashCode() {
        return (((((((this.f12821a * 31) + this.f12822b) * 31) + this.f12823c) * 31) + this.f12824d) * 31) + p170r.r.a(this.f12825e);
    }

    public java.lang.String toString() {
        return "CalendarMonth(year=" + this.f12821a + ", month=" + this.f12822b + ", numberOfDays=" + this.f12823c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f12824d + ", startUtcTimeMillis=" + this.f12825e + ')';
    }
}
