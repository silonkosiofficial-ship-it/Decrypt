package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3588eO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f34976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f34977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f34978c;

    public C3588eO(com.google.android.gms.internal.ads.C4246kO c4246kO, java.util.concurrent.Executor executor) {
        this.f34976a = c4246kO;
        this.f34978c = c4246kO.i();
        this.f34977b = executor;
    }

    public final com.google.android.gms.internal.ads.C3479dO a() {
        com.google.android.gms.internal.ads.C3479dO c3479dO = new com.google.android.gms.internal.ads.C3479dO(this);
        com.google.android.gms.internal.ads.C3479dO.a(c3479dO);
        return c3479dO;
    }

    public final void e() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.xb)).booleanValue()) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = a();
            c3479dOA.b("action", "pecr");
            c3479dOA.g();
        }
    }
}
