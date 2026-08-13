package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Q30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.ScheduledExecutorService f30873a;

    public Q30(com.google.android.gms.internal.ads.C2766Qn c2766Qn, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.content.Context context) {
        this.f30873a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new android.os.Bundle()), ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25606k4)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f30873a), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.P30
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.R30((android.os.Bundle) obj);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34795a);
    }
}
