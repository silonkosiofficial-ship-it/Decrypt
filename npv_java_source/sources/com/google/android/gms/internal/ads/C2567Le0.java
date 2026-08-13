package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Le0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2567Le0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C2567Le0 f29534b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C2603Me0 f29535a;

    private C2567Le0(android.content.Context context) {
        this.f29535a = com.google.android.gms.internal.ads.C2603Me0.b(context);
    }

    public static final com.google.android.gms.internal.ads.C2567Le0 a(android.content.Context context) {
        com.google.android.gms.internal.ads.C2567Le0 c2567Le0;
        synchronized (com.google.android.gms.internal.ads.C2567Le0.class) {
            try {
                if (f29534b == null) {
                    f29534b = new com.google.android.gms.internal.ads.C2567Le0(context);
                }
                c2567Le0 = f29534b;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2567Le0;
    }

    public final void b(boolean z6) {
        synchronized (com.google.android.gms.internal.ads.C2567Le0.class) {
            this.f29535a.d("paidv2_user_option", java.lang.Boolean.valueOf(z6));
        }
    }

    public final void c(boolean z6) {
        synchronized (com.google.android.gms.internal.ads.C2567Le0.class) {
            try {
                this.f29535a.d("paidv2_publisher_option", java.lang.Boolean.valueOf(z6));
                if (!z6) {
                    this.f29535a.e("paidv2_creation_time");
                    this.f29535a.e("paidv2_id");
                    this.f29535a.e("vendor_scoped_gpid_v2_id");
                    this.f29535a.e("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean zF;
        synchronized (com.google.android.gms.internal.ads.C2567Le0.class) {
            zF = this.f29535a.f("paidv2_publisher_option", true);
        }
        return zF;
    }

    public final boolean e() {
        boolean zF;
        synchronized (com.google.android.gms.internal.ads.C2567Le0.class) {
            zF = this.f29535a.f("paidv2_user_option", true);
        }
        return zF;
    }
}
