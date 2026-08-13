package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2616Ml {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C2616Ml f29824b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f29825a = new java.util.concurrent.atomic.AtomicBoolean(false);

    C2616Ml() {
    }

    public static com.google.android.gms.internal.ads.C2616Ml a() {
        if (f29824b == null) {
            f29824b = new com.google.android.gms.internal.ads.C2616Ml();
        }
        return f29824b;
    }

    public final java.lang.Thread b(final android.content.Context context, final java.lang.String str) {
        if (!this.f29825a.compareAndSet(false, true)) {
            return null;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.Ll
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.AbstractC2161Af.a(context2);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25273G0)).booleanValue()) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("measurementEnabled", ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25712v0)).booleanValue());
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25229C0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((com.google.android.gms.internal.ads.InterfaceC2810Ru) p224w3.t.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new p224w3.r() { // from class: com.google.android.gms.internal.ads.Kl
                        @Override // p224w3.r
                        public final java.lang.Object b(java.lang.Object obj) {
                            return com.google.android.gms.internal.ads.AbstractBinderC2773Qu.o6((android.os.IBinder) obj);
                        }
                    })).w5(X3.b.c2(context2), new com.google.android.gms.internal.ads.BinderC2506Jl(p075h4.a.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (android.os.RemoteException | java.lang.NullPointerException | p224w3.s e6) {
                    p224w3.p.i("#007 Could not call remote method.", e6);
                }
            }
        });
        thread.start();
        return thread;
    }
}
