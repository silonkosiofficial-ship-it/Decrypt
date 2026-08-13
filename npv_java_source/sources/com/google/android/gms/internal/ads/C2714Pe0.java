package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2714Pe0 extends com.google.android.gms.internal.ads.AbstractC2640Ne0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C2714Pe0 f30762i;

    private C2714Pe0(android.content.Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final com.google.android.gms.internal.ads.C2714Pe0 j(android.content.Context context) {
        com.google.android.gms.internal.ads.C2714Pe0 c2714Pe0;
        synchronized (com.google.android.gms.internal.ads.C2714Pe0.class) {
            try {
                if (f30762i == null) {
                    f30762i = new com.google.android.gms.internal.ads.C2714Pe0(context);
                }
                c2714Pe0 = f30762i;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2714Pe0;
    }

    public final com.google.android.gms.internal.ads.C2530Ke0 i(long j6, boolean z6) {
        synchronized (com.google.android.gms.internal.ads.C2714Pe0.class) {
            try {
                if (this.f30351g.d()) {
                    return b(null, null, j6, z6);
                }
                return new com.google.android.gms.internal.ads.C2530Ke0();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (com.google.android.gms.internal.ads.C2714Pe0.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
