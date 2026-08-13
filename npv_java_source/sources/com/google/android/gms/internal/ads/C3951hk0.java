package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3951hk0 extends com.google.android.gms.internal.ads.AbstractRunnableC4169jk0 {
    C3951hk0(P4.d dVar, com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0) {
        super(dVar, interfaceC5268tk0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4169jk0
    final /* bridge */ /* synthetic */ java.lang.Object E(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = (com.google.android.gms.internal.ads.InterfaceC5268tk0) obj;
        P4.d dVarB = interfaceC5268tk0.b(obj2);
        com.google.android.gms.internal.ads.AbstractC2164Ag0.d(dVarB, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5268tk0);
        return dVarB;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4169jk0
    final /* synthetic */ void F(java.lang.Object obj) {
        v((P4.d) obj);
    }
}
