package j$.util;

/* JADX INFO: renamed from: j$.util.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6718j extends j$.util.C6714f implements java.util.Set, j$.util.Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f48123b) {
            zEquals = this.f48122a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f48123b) {
            iHashCode = this.f48122a.hashCode();
        }
        return iHashCode;
    }
}
