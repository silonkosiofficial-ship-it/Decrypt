package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4829pk0 extends com.google.android.gms.internal.ads.AbstractC4609nk0 {
    /* synthetic */ C4829pk0(com.google.android.gms.internal.ads.AbstractC4939qk0 abstractC4939qk0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4609nk0
    final int a(com.google.android.gms.internal.ads.AbstractC5048rk0 abstractC5048rk0) {
        int i6;
        synchronized (abstractC5048rk0) {
            i6 = abstractC5048rk0.f38550K - 1;
            abstractC5048rk0.f38550K = i6;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4609nk0
    final void b(com.google.android.gms.internal.ads.AbstractC5048rk0 abstractC5048rk0, java.util.Set set, java.util.Set set2) {
        synchronized (abstractC5048rk0) {
            try {
                if (abstractC5048rk0.f38549J == null) {
                    abstractC5048rk0.f38549J = set2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
