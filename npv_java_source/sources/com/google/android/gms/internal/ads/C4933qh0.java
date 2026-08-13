package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4933qh0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Iterator f38300C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.Collection f38301D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5042rh0 f38302E;

    C4933qh0(com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0) {
        this.f38302E = abstractC5042rh0;
        java.util.Collection collection = abstractC5042rh0.f38533D;
        this.f38301D = collection;
        this.f38300C = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    C4933qh0(com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0, java.util.Iterator it) {
        this.f38302E = abstractC5042rh0;
        this.f38301D = abstractC5042rh0.f38533D;
        this.f38300C = it;
    }

    final void b() {
        this.f38302E.b();
        if (this.f38302E.f38533D != this.f38301D) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.f38300C.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        b();
        return this.f38300C.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f38300C.remove();
        this.f38302E.f38536G.f39208G--;
        this.f38302E.e();
    }
}
