package Q2;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f8775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Long f8776b;

    public d(java.lang.String str, long j6) {
        this.f8775a = str;
        this.f8776b = java.lang.Long.valueOf(j6);
    }

    public d(java.lang.String str, boolean z6) {
        this(str, z6 ? 1L : 0L);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q2.d)) {
            return false;
        }
        Q2.d dVar = (Q2.d) obj;
        if (!this.f8775a.equals(dVar.f8775a)) {
            return false;
        }
        java.lang.Long l6 = this.f8776b;
        java.lang.Long l10 = dVar.f8776b;
        if (l6 != null) {
            return l6.equals(l10);
        }
        return l10 == null;
    }

    public int hashCode() {
        int iHashCode = this.f8775a.hashCode() * 31;
        java.lang.Long l6 = this.f8776b;
        return iHashCode + (l6 != null ? l6.hashCode() : 0);
    }
}
