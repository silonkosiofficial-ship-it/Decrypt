package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ih0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2462Ih0 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2536Kh0 f28494C;

    C2462Ih0(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0) {
        this.f28494C = c2536Kh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f28494C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0 = this.f28494C;
        java.util.Map mapQ = c2536Kh0.q();
        return mapQ != null ? mapQ.values().iterator() : new com.google.android.gms.internal.ads.C2277Dh0(c2536Kh0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f28494C.size();
    }
}
