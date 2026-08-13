package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5484vi0 extends com.google.android.gms.internal.ads.AbstractC3400cj0 {
    AbstractC5484vi0() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        d().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(java.lang.Object obj);

    abstract java.util.Map d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400cj0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        try {
            if (collection != null) {
                return com.google.android.gms.internal.ads.AbstractC3729fj0.e(this, collection);
            }
            throw null;
        } catch (java.lang.UnsupportedOperationException unused) {
            return com.google.android.gms.internal.ads.AbstractC3729fj0.f(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3400cj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        int iCeil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (java.lang.UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                com.google.android.gms.internal.ads.AbstractC5812yh0.a(size, "expectedSize");
                iCeil = size + 1;
            } else {
                iCeil = size < 1073741824 ? (int) java.lang.Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            }
            java.util.HashSet hashSet = new java.util.HashSet(iCeil);
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return d().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d().size();
    }
}
