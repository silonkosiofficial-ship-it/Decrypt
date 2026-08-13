package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ry0 extends java.util.AbstractList {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Sy0 f31501E = com.google.android.gms.internal.ads.Sy0.b(com.google.android.gms.internal.ads.Ry0.class);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.List f31502C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.Iterator f31503D;

    public Ry0(java.util.List list, java.util.Iterator it) {
        this.f31502C = list;
        this.f31503D = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i6) {
        if (this.f31502C.size() > i6) {
            return this.f31502C.get(i6);
        }
        if (!this.f31503D.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f31502C.add(this.f31503D.next());
        return get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.Qy0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        com.google.android.gms.internal.ads.Sy0 sy0 = f31501E;
        sy0.a("potentially expensive size() call");
        sy0.a("blowup running");
        while (this.f31503D.hasNext()) {
            this.f31502C.add(this.f31503D.next());
        }
        return this.f31502C.size();
    }
}
