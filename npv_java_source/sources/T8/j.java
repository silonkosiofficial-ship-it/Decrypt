package T8;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f13332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13333b;

    private j(java.lang.Object obj, long j6) {
        this.f13332a = obj;
        this.f13333b = j6;
    }

    public /* synthetic */ j(java.lang.Object obj, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(obj, j6);
    }

    public final long a() {
        return this.f13333b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T8.j)) {
            return false;
        }
        T8.j jVar = (T8.j) obj;
        return p247y7.AbstractC7350t.b(this.f13332a, jVar.f13332a) && T8.a.u(this.f13333b, jVar.f13333b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f13332a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + T8.a.H(this.f13333b);
    }

    public java.lang.String toString() {
        return "TimedValue(value=" + this.f13332a + ", duration=" + ((java.lang.Object) T8.a.R(this.f13333b)) + ')';
    }
}
