package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2677Oe0 extends com.google.android.gms.internal.ads.AbstractC2640Ne0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C2677Oe0 f30544i;

    private C2677Oe0(android.content.Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final com.google.android.gms.internal.ads.C2677Oe0 k(android.content.Context context) {
        com.google.android.gms.internal.ads.C2677Oe0 c2677Oe0;
        synchronized (com.google.android.gms.internal.ads.C2677Oe0.class) {
            try {
                if (f30544i == null) {
                    f30544i = new com.google.android.gms.internal.ads.C2677Oe0(context);
                }
                c2677Oe0 = f30544i;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2677Oe0;
    }

    public final com.google.android.gms.internal.ads.C2530Ke0 i(long j6, boolean z6) {
        com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0B;
        synchronized (com.google.android.gms.internal.ads.C2677Oe0.class) {
            c2530Ke0B = b(null, null, j6, z6);
        }
        return c2530Ke0B;
    }

    public final com.google.android.gms.internal.ads.C2530Ke0 j(java.lang.String str, java.lang.String str2, long j6, boolean z6) {
        com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0B;
        synchronized (com.google.android.gms.internal.ads.C2677Oe0.class) {
            c2530Ke0B = b(str, str2, j6, z6);
        }
        return c2530Ke0B;
    }

    public final void l() {
        synchronized (com.google.android.gms.internal.ads.C2677Oe0.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (com.google.android.gms.internal.ads.C2677Oe0.class) {
            f(true);
        }
    }
}
