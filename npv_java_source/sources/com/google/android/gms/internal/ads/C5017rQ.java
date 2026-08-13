package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5017rQ implements com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.ZG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f38490C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f38491D;

    C5017rQ(android.content.Context context, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f38490C = context;
        this.f38491D = c3588eO;
    }

    private final void c(final android.content.Context context) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25277G4)).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pQ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38003C.b(context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        c(this.f38490C);
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void G(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void a(B3.N n6) {
        c(this.f38490C);
    }

    final /* synthetic */ void b(android.content.Context context) {
        p174r3.v.i().d(context, this.f38491D);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
    }
}
