package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4661oA implements com.google.android.gms.internal.ads.UV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f37729a;

    public C4661oA(com.google.android.gms.internal.ads.AbstractC3673fA abstractC3673fA) {
        this.f37729a = java.util.Collections.singletonList(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(abstractC3673fA));
    }

    public C4661oA(java.util.List list) {
        this.f37729a = list;
    }

    @Override // com.google.android.gms.internal.ads.UV
    public final void t() {
        java.util.Iterator it = this.f37729a.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r((P4.d) it.next(), new com.google.android.gms.internal.ads.C4551nA(this), com.google.android.gms.internal.ads.AbstractC3733fl0.c());
        }
    }
}
