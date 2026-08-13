package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5372uh0 extends com.google.android.gms.internal.ads.AbstractC5702xh0 implements java.io.Serializable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient java.util.Map f39207F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private transient int f39208G;

    protected AbstractC5372uh0(java.util.Map map) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.e(map.isEmpty());
        this.f39207F = map;
    }

    static /* bridge */ /* synthetic */ void r(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.lang.Object obj) {
        java.lang.Object objRemove;
        try {
            objRemove = abstractC5372uh0.f39207F.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            objRemove = null;
        }
        java.util.Collection collection = (java.util.Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC5372uh0.f39208G -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Ai0
    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.f39207F.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f39208G++;
            return true;
        }
        java.util.Collection collectionH = h();
        if (!collectionH.add(obj2)) {
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        this.f39208G++;
        this.f39207F.put(obj, collectionH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5702xh0
    final java.util.Collection b() {
        return new com.google.android.gms.internal.ads.C5592wh0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5702xh0
    final java.util.Iterator c() {
        return new com.google.android.gms.internal.ads.C3506dh0(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Ai0
    public final int d() {
        return this.f39208G;
    }

    abstract java.util.Collection h();

    abstract java.util.Collection i(java.util.Collection collection);

    abstract java.util.Collection j(java.lang.Object obj, java.util.Collection collection);

    final java.util.List l(java.lang.Object obj, java.util.List list, com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.ads.C4493mh0(this, obj, list, abstractC5042rh0) : new com.google.android.gms.internal.ads.C5262th0(this, obj, list, abstractC5042rh0);
    }

    final java.util.Map n() {
        java.util.Map map = this.f39207F;
        if (map instanceof java.util.NavigableMap) {
            return new com.google.android.gms.internal.ads.C4273kh0(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new com.google.android.gms.internal.ads.C4713oh0(this, (java.util.SortedMap) map) : new com.google.android.gms.internal.ads.C3835gh0(this, map);
    }

    final java.util.Set o() {
        java.util.Map map = this.f39207F;
        if (map instanceof java.util.NavigableMap) {
            return new com.google.android.gms.internal.ads.C4383lh0(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new com.google.android.gms.internal.ads.C4823ph0(this, (java.util.SortedMap) map) : new com.google.android.gms.internal.ads.C4163jh0(this, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Ai0
    public final void q() {
        java.util.Iterator it = this.f39207F.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        this.f39207F.clear();
        this.f39208G = 0;
    }
}
