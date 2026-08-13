package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5413v10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Intent f39310b;

    C5413v10(android.content.Context context, android.content.Intent intent) {
        this.f39309a = context;
        this.f39310b = intent;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        com.google.android.gms.internal.ads.C5523w10 c5523w10;
        p214v3.AbstractC7265q0.k("HsdpMigrationSignal.produce");
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Hc)).booleanValue()) {
            boolean z6 = false;
            try {
                if (this.f39310b.resolveActivity(this.f39309a.getPackageManager()) != null) {
                    p214v3.AbstractC7265q0.k("HSDP intent is supported");
                    z6 = true;
                }
            } catch (java.lang.Exception e6) {
                p174r3.v.s().x(e6, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            c5523w10 = new com.google.android.gms.internal.ads.C5523w10(java.lang.Boolean.valueOf(z6));
        } else {
            c5523w10 = new com.google.android.gms.internal.ads.C5523w10(null);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c5523w10);
    }
}
