package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.si0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5154si0 extends java.util.AbstractSequentialList implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.List f38792C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC4821pg0 f38793D;

    C5154si0(java.util.List list, com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0) {
        list.getClass();
        this.f38792C = list;
        this.f38793D = interfaceC4821pg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f38792C.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i6) {
        return new com.google.android.gms.internal.ads.C5044ri0(this, this.f38792C.listIterator(i6));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i6, int i10) {
        this.f38792C.subList(i6, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38792C.size();
    }
}
