package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ih0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4054ih0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    java.util.Map.Entry f36336C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.util.Iterator f36337D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4163jh0 f36338E;

    C4054ih0(com.google.android.gms.internal.ads.C4163jh0 c4163jh0, java.util.Iterator it) {
        this.f36337D = it;
        this.f36338E = c4163jh0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36337D.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f36337D.next();
        this.f36336C = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.m(this.f36336C != null, "no calls to next() since the last call to remove()");
        java.util.Collection collection = (java.util.Collection) this.f36336C.getValue();
        this.f36337D.remove();
        this.f36338E.f36717D.f39208G -= collection.size();
        collection.clear();
        this.f36336C = null;
    }
}
