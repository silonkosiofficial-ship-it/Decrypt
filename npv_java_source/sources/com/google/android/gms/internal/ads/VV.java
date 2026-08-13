package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class VV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.G70 f32508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PM f32509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f32510c;

    public VV(com.google.android.gms.internal.ads.G70 g70, com.google.android.gms.internal.ads.PM pm, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f32508a = g70;
        this.f32509b = pm;
        this.f32510c = c3588eO;
    }

    public final void a(com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.R60 r60, int i6, com.google.android.gms.internal.ads.C3156aU c3156aU, long j6) {
        com.google.android.gms.internal.ads.OM omA;
        com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f32510c.a();
        c3479dOA.d(u60);
        c3479dOA.c(r60);
        c3479dOA.b("action", "adapter_status");
        c3479dOA.b("adapter_l", java.lang.String.valueOf(j6));
        c3479dOA.b("sc", java.lang.Integer.toString(i6));
        if (c3156aU != null) {
            c3479dOA.b("arec", java.lang.Integer.toString(c3156aU.b().f54145C));
            java.lang.String strA = this.f32508a.a(c3156aU.getMessage());
            if (strA != null) {
                c3479dOA.b("areec", strA);
            }
        }
        com.google.android.gms.internal.ads.PM pm = this.f32509b;
        java.util.Iterator it = r60.f31198t.iterator();
        do {
            if (!it.hasNext()) {
                omA = null;
                break;
            }
            omA = pm.a((java.lang.String) it.next());
        } while (omA == null);
        if (omA != null) {
            c3479dOA.b("ancn", omA.f30489a);
            com.google.android.gms.internal.ads.C3956hn c3956hn = omA.f30490b;
            if (c3956hn != null) {
                c3479dOA.b("adapter_v", c3956hn.toString());
            }
            com.google.android.gms.internal.ads.C3956hn c3956hn2 = omA.f30491c;
            if (c3956hn2 != null) {
                c3479dOA.b("adapter_sv", c3956hn2.toString());
            }
        }
        c3479dOA.g();
    }
}
