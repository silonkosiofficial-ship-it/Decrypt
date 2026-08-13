package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4935qi0 extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.List f38303C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC4821pg0 f38304D;

    C4935qi0(java.util.List list, com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0) {
        list.getClass();
        this.f38303C = list;
        this.f38304D = interfaceC4821pg0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i6) {
        return this.f38304D.apply(this.f38303C.get(i6));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f38303C.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i6) {
        return new com.google.android.gms.internal.ads.C4715oi0(this, this.f38303C.listIterator(i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i6) {
        return this.f38304D.apply(this.f38303C.remove(i6));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        this.f38303C.subList(i6, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38303C.size();
    }
}
