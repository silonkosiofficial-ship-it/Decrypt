package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2314Eh0 extends java.util.AbstractSet {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2536Kh0 f27099C;

    C2314Eh0(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0) {
        this.f27099C = c2536Kh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f27099C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map mapQ = this.f27099C.q();
        if (mapQ != null) {
            return mapQ.entrySet().contains(obj);
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iC = this.f27099C.C(entry.getKey());
            if (iC != -1 && com.google.android.gms.internal.ads.AbstractC5700xg0.a(com.google.android.gms.internal.ads.C2536Kh0.o(this.f27099C, iC), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0 = this.f27099C;
        java.util.Map mapQ = c2536Kh0.q();
        return mapQ != null ? mapQ.entrySet().iterator() : new com.google.android.gms.internal.ads.C2240Ch0(c2536Kh0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Map mapQ = this.f27099C.q();
        if (mapQ != null) {
            return mapQ.entrySet().remove(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0 = this.f27099C;
        if (c2536Kh0.x()) {
            return false;
        }
        int iB = c2536Kh0.B();
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh1 = this.f27099C;
        int iB2 = com.google.android.gms.internal.ads.AbstractC2573Lh0.b(key, value, iB, com.google.android.gms.internal.ads.C2536Kh0.m(c2536Kh1), c2536Kh1.a(), c2536Kh1.b(), c2536Kh1.c());
        if (iB2 == -1) {
            return false;
        }
        this.f27099C.v(iB2, iB);
        this.f27099C.f29001H--;
        this.f27099C.t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27099C.size();
    }
}
