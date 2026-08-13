package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5378uk0 extends com.google.android.gms.internal.ads.AbstractC5598wk0 {
    C5378uk0(com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0, boolean z6) {
        super(abstractC3011Xh0, z6);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5598wk0
    public final /* bridge */ /* synthetic */ java.lang.Object X(java.util.List list) {
        java.util.ArrayList arrayListA = com.google.android.gms.internal.ads.AbstractC5264ti0.a(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C5488vk0 c5488vk0 = (com.google.android.gms.internal.ads.C5488vk0) it.next();
            arrayListA.add(c5488vk0 != null ? c5488vk0.f39436a : null);
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayListA);
    }
}
