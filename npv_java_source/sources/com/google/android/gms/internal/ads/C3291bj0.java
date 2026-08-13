package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3291bj0 extends com.google.android.gms.internal.ads.C3181aj0 implements java.util.SortedSet {
    C3291bj0(java.util.SortedSet sortedSet, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0) {
        super(sortedSet, interfaceC2201Bg0);
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.f40365C).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.util.Iterator it = this.f40365C.iterator();
        it.getClass();
        com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0 = this.f40366D;
        interfaceC2201Bg0.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (interfaceC2201Bg0.b(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C3291bj0(((java.util.SortedSet) this.f40365C).headSet(obj), this.f40366D);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.util.SortedSet sortedSetHeadSet = (java.util.SortedSet) this.f40365C;
        while (true) {
            com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0 = this.f40366D;
            java.lang.Object objLast = sortedSetHeadSet.last();
            if (interfaceC2201Bg0.b(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.C3291bj0(((java.util.SortedSet) this.f40365C).subSet(obj, obj2), this.f40366D);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C3291bj0(((java.util.SortedSet) this.f40365C).tailSet(obj), this.f40366D);
    }
}
