package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2751Qe0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C2751Qe0 f31023b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C2603Me0 f31024a;

    private C2751Qe0(android.content.Context context) {
        this.f31024a = com.google.android.gms.internal.ads.C2603Me0.b(context);
        com.google.android.gms.internal.ads.C2567Le0.a(context);
    }

    public static final com.google.android.gms.internal.ads.C2751Qe0 a(android.content.Context context) {
        com.google.android.gms.internal.ads.C2751Qe0 c2751Qe0;
        synchronized (com.google.android.gms.internal.ads.C2751Qe0.class) {
            try {
                if (f31023b == null) {
                    f31023b = new com.google.android.gms.internal.ads.C2751Qe0(context);
                }
                c2751Qe0 = f31023b;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2751Qe0;
    }

    public final void b(com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0) {
        synchronized (com.google.android.gms.internal.ads.C2751Qe0.class) {
            this.f31024a.e("vendor_scoped_gpid_v2_id");
            this.f31024a.e("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
