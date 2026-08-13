package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3604ec implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3714fc f35010C;

    RunnableC3604ec(com.google.android.gms.internal.ads.C3714fc c3714fc) {
        this.f35010C = c3714fc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35010C.f35365E) {
            com.google.android.gms.internal.ads.C3714fc c3714fc = this.f35010C;
            if (c3714fc.f35366F && c3714fc.f35367G) {
                c3714fc.f35366F = false;
                p224w3.p.b("App went background");
                java.util.Iterator it = this.f35010C.f35368H.iterator();
                while (it.hasNext()) {
                    try {
                        ((com.google.android.gms.internal.ads.InterfaceC3824gc) it.next()).a(false);
                    } catch (java.lang.Exception e6) {
                        p224w3.p.e("", e6);
                    }
                }
            } else {
                p224w3.p.b("App is still foreground");
            }
        }
    }
}
