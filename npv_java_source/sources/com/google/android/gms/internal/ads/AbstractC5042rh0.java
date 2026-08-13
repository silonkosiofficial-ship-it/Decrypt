package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5042rh0 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.lang.Object f38532C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    java.util.Collection f38533D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final com.google.android.gms.internal.ads.AbstractC5042rh0 f38534E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final java.util.Collection f38535F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f38536G;

    AbstractC5042rh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.lang.Object obj, java.util.Collection collection, com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0) {
        this.f38536G = abstractC5372uh0;
        this.f38532C = obj;
        this.f38533D = collection;
        this.f38534E = abstractC5042rh0;
        this.f38535F = abstractC5042rh0 == null ? null : abstractC5042rh0.f38533D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        b();
        boolean zIsEmpty = this.f38533D.isEmpty();
        boolean zAdd = this.f38533D.add(obj);
        if (zAdd) {
            this.f38536G.f39208G++;
            if (zIsEmpty) {
                d();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f38533D.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f38533D.size();
        this.f38536G.f39208G += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    final void b() {
        com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0 = this.f38534E;
        if (abstractC5042rh0 != null) {
            abstractC5042rh0.b();
            com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh1 = this.f38534E;
            if (abstractC5042rh1.f38533D != this.f38535F) {
                throw new java.util.ConcurrentModificationException();
            }
            return;
        }
        if (this.f38533D.isEmpty()) {
            com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0 = this.f38536G;
            java.util.Collection collection = (java.util.Collection) abstractC5372uh0.f39207F.get(this.f38532C);
            if (collection != null) {
                this.f38533D = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f38533D.clear();
        this.f38536G.f39208G -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        b();
        return this.f38533D.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        b();
        return this.f38533D.containsAll(collection);
    }

    final void d() {
        com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0 = this.f38534E;
        if (abstractC5042rh0 != null) {
            abstractC5042rh0.d();
            return;
        }
        com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0 = this.f38536G;
        abstractC5372uh0.f39207F.put(this.f38532C, this.f38533D);
    }

    final void e() {
        com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0 = this.f38534E;
        if (abstractC5042rh0 != null) {
            abstractC5042rh0.e();
        } else if (this.f38533D.isEmpty()) {
            com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0 = this.f38536G;
            abstractC5372uh0.f39207F.remove(this.f38532C);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f38533D.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f38533D.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        b();
        return new com.google.android.gms.internal.ads.C4933qh0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        b();
        boolean zRemove = this.f38533D.remove(obj);
        if (zRemove) {
            this.f38536G.f39208G--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f38533D.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f38533D.size();
            this.f38536G.f39208G += size2 - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f38533D.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f38533D.size();
            this.f38536G.f39208G += size2 - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f38533D.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        b();
        return this.f38533D.toString();
    }
}
