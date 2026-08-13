package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5922zh0 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Collection f40365C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC2201Bg0 f40366D;

    AbstractC5922zh0(java.util.Collection collection, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0) {
        this.f40365C = collection;
        this.f40366D = interfaceC2201Bg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.e(this.f40366D.b(obj));
        return this.f40365C.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.AbstractC2164Ag0.e(this.f40366D.b(it.next()));
        }
        return this.f40365C.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        com.google.android.gms.internal.ads.AbstractC4056ii0.b(this.f40365C, this.f40366D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (com.google.android.gms.internal.ads.AbstractC2166Ah0.a(this.f40365C, obj)) {
            return this.f40366D.b(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0 = this.f40366D;
        java.util.Iterator it = this.f40365C.iterator();
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(interfaceC2201Bg0, "predicate");
        int i6 = 0;
        while (it.hasNext()) {
            if (interfaceC2201Bg0.b(it.next())) {
                return i6 == -1;
            }
            i6++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.f40365C.iterator();
        it.getClass();
        com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0 = this.f40366D;
        interfaceC2201Bg0.getClass();
        return new com.google.android.gms.internal.ads.C4165ji0(it, interfaceC2201Bg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return contains(obj) && this.f40365C.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = this.f40365C.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.f40366D.b(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        java.util.Iterator it = this.f40365C.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.f40366D.b(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        java.util.Iterator it = this.f40365C.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (this.f40366D.b(it.next())) {
                i6++;
            }
        }
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.AbstractC4495mi0.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.AbstractC4495mi0.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
