package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5704xi0 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Map f39902C;

    C5704xi0(java.util.Map map) {
        this.f39902C = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f39902C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f39902C.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f39902C.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.C5374ui0(this.f39902C.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        try {
            return super.remove(obj);
        } catch (java.lang.UnsupportedOperationException unused) {
            for (java.util.Map.Entry entry : this.f39902C.entrySet()) {
                if (com.google.android.gms.internal.ads.AbstractC5700xg0.a(obj, entry.getValue())) {
                    this.f39902C.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        try {
            if (collection != null) {
                return super.removeAll(collection);
            }
            throw null;
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.util.Map.Entry entry : this.f39902C.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f39902C.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.util.Map.Entry entry : this.f39902C.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f39902C.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f39902C.size();
    }
}
