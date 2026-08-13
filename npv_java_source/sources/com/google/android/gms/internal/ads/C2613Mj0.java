package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2613Mj0 extends com.google.android.gms.internal.ads.AbstractRunnableC2687Oj0 {
    C2613Mj0(P4.d dVar, java.lang.Class cls, com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0) {
        super(dVar, cls, interfaceC5268tk0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2687Oj0
    final /* bridge */ /* synthetic */ java.lang.Object E(java.lang.Object obj, java.lang.Throwable th) {
        com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = (com.google.android.gms.internal.ads.InterfaceC5268tk0) obj;
        P4.d dVarB = interfaceC5268tk0.b(th);
        com.google.android.gms.internal.ads.AbstractC2164Ag0.d(dVarB, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5268tk0);
        return dVarB;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2687Oj0
    final /* synthetic */ void F(java.lang.Object obj) {
        v((P4.d) obj);
    }
}
