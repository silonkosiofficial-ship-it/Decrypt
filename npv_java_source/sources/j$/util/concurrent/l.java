package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
class l implements java.util.Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f48083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object f48084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile java.lang.Object f48085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile j$.util.concurrent.l f48086d;

    l(int i6, java.lang.Object obj, java.lang.Object obj2) {
        this.f48083a = i6;
        this.f48084b = obj;
        this.f48085c = obj2;
    }

    l(int i6, java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.l lVar) {
        this(i6, obj, obj2);
        this.f48086d = lVar;
    }

    j$.util.concurrent.l a(int i6, java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            return null;
        }
        j$.util.concurrent.l lVar = this;
        do {
            if (lVar.f48083a == i6 && ((obj2 = lVar.f48084b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f48086d;
        } while (lVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        java.lang.Object obj2;
        java.lang.Object obj3;
        return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f48084b) || key.equals(obj2)) && (value == (obj3 = this.f48085c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f48084b;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f48085c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f48084b.hashCode() ^ this.f48085c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return j$.util.concurrent.u.b(this.f48084b, this.f48085c);
    }
}
