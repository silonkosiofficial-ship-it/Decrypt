package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4163jh0 extends com.google.android.gms.internal.ads.AbstractC5594wi0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f36717D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4163jh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.util.Map map) {
        super(map);
        this.f36717D = abstractC5372uh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        com.google.android.gms.internal.ads.AbstractC4495mi0.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.f39662C.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.f39662C.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f39662C.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5594wi0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.C4054ih0(this, this.f39662C.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.f39662C.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f36717D.f39208G -= size;
        return size > 0;
    }
}
