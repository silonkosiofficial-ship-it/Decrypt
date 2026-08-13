package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5592wh0 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5702xh0 f39660C;

    C5592wh0(com.google.android.gms.internal.ads.AbstractC5702xh0 abstractC5702xh0) {
        this.f39660C = abstractC5702xh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f39660C.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        java.util.Iterator it = this.f39660C.u().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.f39660C.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f39660C.d();
    }
}
