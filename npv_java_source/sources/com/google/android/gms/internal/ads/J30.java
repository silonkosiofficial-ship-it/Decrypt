package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class J30 implements com.google.android.gms.internal.ads.L20 {
    public J30(com.google.android.gms.internal.ads.C2474Iq c2474Iq, com.google.android.gms.internal.ads.Yk0 yk0, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        final P4.d dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25311J5)).booleanValue()) {
            dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        }
        final P4.d dVarH2 = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.c(dVarH, dVarH2).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.I30
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.K30((java.lang.String) dVarH.get(), (java.lang.String) dVarH2.get());
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34795a);
    }
}
