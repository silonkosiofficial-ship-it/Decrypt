package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C3835gh0 extends com.google.android.gms.internal.ads.AbstractC5814yi0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.util.Map f35665E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f35666F;

    C3835gh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.util.Map map) {
        this.f35666F = abstractC5372uh0;
        this.f35665E = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5814yi0
    protected final java.util.Set a() {
        return new com.google.android.gms.internal.ads.C3615eh0(this);
    }

    final java.util.Map.Entry b(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        return new com.google.android.gms.internal.ads.C3047Yh0(key, this.f35666F.j(key, (java.util.Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0 = this.f35666F;
        if (this.f35665E == abstractC5372uh0.f39207F) {
            abstractC5372uh0.q();
        } else {
            com.google.android.gms.internal.ads.AbstractC4495mi0.b(new com.google.android.gms.internal.ads.C3725fh0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map map = this.f35665E;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.f35665E.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) com.google.android.gms.internal.ads.AbstractC5924zi0.a(this.f35665E, obj);
        if (collection == null) {
            return null;
        }
        return this.f35666F.j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f35665E.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.f35666F.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.f35665E.remove(obj);
        if (collection == null) {
            return null;
        }
        java.util.Collection collectionH = this.f35666F.h();
        collectionH.addAll(collection);
        this.f35666F.f39208G -= collection.size();
        collection.clear();
        return collectionH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35665E.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.f35665E.toString();
    }
}
