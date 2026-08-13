package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private W2.h f24484b;

    B(android.content.Context context) {
        try {
            Y2.u.f(context);
            this.f24484b = Y2.u.c().g(com.google.android.datatransport.cct.a.f24686g).a("PLAY_BILLING_LIBRARY", com.google.android.gms.internal.play_billing.A4.class, W2.b.b("proto"), new W2.g() { // from class: T2.t
                @Override // W2.g
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((com.google.android.gms.internal.play_billing.A4) obj).d();
                }
            });
        } catch (java.lang.Throwable unused) {
            this.f24483a = true;
        }
    }

    public final void a(com.google.android.gms.internal.play_billing.A4 a6) {
        java.lang.String str;
        if (this.f24483a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f24484b.a(W2.c.f(a6));
                return;
            } catch (java.lang.Throwable unused) {
                str = "logging failed.";
            }
        }
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingLogger", str);
    }
}
