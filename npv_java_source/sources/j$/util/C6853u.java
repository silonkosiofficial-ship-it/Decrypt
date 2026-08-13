package j$.util;

/* JADX INFO: renamed from: j$.util.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6853u extends j$.util.C6720l implements java.util.Set, j$.util.Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        return obj == this || this.f48169a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f48169a.hashCode();
    }
}
