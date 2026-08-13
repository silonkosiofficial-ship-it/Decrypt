package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2388Gh0 extends java.util.AbstractSet {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2536Kh0 f27866C;

    C2388Gh0(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0) {
        this.f27866C = c2536Kh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f27866C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f27866C.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0 = this.f27866C;
        java.util.Map mapQ = c2536Kh0.q();
        return mapQ != null ? mapQ.keySet().iterator() : new com.google.android.gms.internal.ads.C2203Bh0(c2536Kh0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Map mapQ = this.f27866C.q();
        if (mapQ != null) {
            return mapQ.keySet().remove(obj);
        }
        return this.f27866C.E(obj) != com.google.android.gms.internal.ads.C2536Kh0.f28995L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27866C.size();
    }
}
