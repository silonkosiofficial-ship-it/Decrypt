package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3400cj0 extends java.util.AbstractSet {
    AbstractC3400cj0() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        return com.google.android.gms.internal.ads.AbstractC3729fj0.e(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
