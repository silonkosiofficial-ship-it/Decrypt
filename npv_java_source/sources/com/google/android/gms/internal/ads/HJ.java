package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class HJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f28008a;

    HJ(com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f28008a = c3588eO;
    }

    public final void a(android.view.View view, com.google.android.gms.internal.ads.R60 r60) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Lc)).booleanValue() || view == null) {
            return;
        }
        java.lang.String str = true != p214v3.AbstractC7238d.a(view) ? "0" : "1";
        com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f28008a.a();
        c3479dOA.b("action", "hcp");
        c3479dOA.b("hcp", str);
        c3479dOA.c(r60);
        c3479dOA.g();
    }
}
