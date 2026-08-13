package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class OT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f30500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p224w3.a f30501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f30502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f30503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f30504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2634Nb0 f30505f;

    OT(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f30500a = context;
        this.f30501b = aVar;
        this.f30502c = r60;
        this.f30503d = interfaceC2698Ot;
        this.f30504e = c3588eO;
    }

    public final synchronized void a(android.view.View view) {
        com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0 = this.f30505f;
        if (c2634Nb0 != null) {
            p174r3.v.b().b(c2634Nb0, view);
        }
    }

    public final synchronized void b() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        if (this.f30505f == null || (interfaceC2698Ot = this.f30503d) == null) {
            return;
        }
        interfaceC2698Ot.O("onSdkImpression", com.google.android.gms.internal.ads.AbstractC3727fi0.d());
    }

    public final synchronized void c() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        try {
            com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0 = this.f30505f;
            if (c2634Nb0 == null || (interfaceC2698Ot = this.f30503d) == null) {
                return;
            }
            java.util.Iterator it = interfaceC2698Ot.X0().iterator();
            while (it.hasNext()) {
                p174r3.v.b().b(c2634Nb0, (android.view.View) it.next());
            }
            this.f30503d.O("onSdkLoaded", com.google.android.gms.internal.ads.AbstractC3727fi0.d());
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d() {
        return this.f30505f != null;
    }

    public final synchronized boolean e(boolean z6) {
        if (this.f30502c.f31153T) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && this.f30503d != null) {
                    if (this.f30505f != null) {
                        p224w3.p.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!p174r3.v.b().f(this.f30500a)) {
                        p224w3.p.g("Unable to initialize omid.");
                        return false;
                    }
                    if (this.f30502c.f31155V.b()) {
                        com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0J = p174r3.v.b().j(this.f30501b, this.f30503d.i0(), true);
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25563g5)).booleanValue()) {
                            com.google.android.gms.internal.ads.C3588eO c3588eO = this.f30504e;
                            java.lang.String str = c2634Nb0J != null ? "1" : "0";
                            com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
                            c3479dOA.b("omid_js_session_success", str);
                            c3479dOA.g();
                        }
                        if (c2634Nb0J == null) {
                            p224w3.p.g("Unable to create javascript session service.");
                            return false;
                        }
                        p224w3.p.f("Created omid javascript session service.");
                        this.f30505f = c2634Nb0J;
                        this.f30503d.c1(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void f(com.google.android.gms.internal.ads.C4078iu c4078iu) {
        com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0 = this.f30505f;
        if (c2634Nb0 == null || this.f30503d == null) {
            return;
        }
        p174r3.v.b().i(c2634Nb0, c4078iu);
        this.f30505f = null;
        this.f30503d.c1(null);
    }
}
