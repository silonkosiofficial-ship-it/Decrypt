package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class YO implements com.google.android.gms.internal.ads.GO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.NO f33351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.I60 f33352c;

    YO(long j6, android.content.Context context, com.google.android.gms.internal.ads.NO no, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, java.lang.String str) {
        this.f33350a = j6;
        this.f33351b = no;
        com.google.android.gms.internal.ads.K60 k60C = abstractC2846Su.C();
        k60C.a(context);
        k60C.o(str);
        this.f33352c = k60C.c().a();
    }

    @Override // com.google.android.gms.internal.ads.GO
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.GO
    public final void b(p184s3.X1 x6) {
        try {
            this.f33352c.K4(x6, new com.google.android.gms.internal.ads.WO(this));
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.GO
    public final void c() {
        try {
            this.f33352c.d3(new com.google.android.gms.internal.ads.XO(this));
            this.f33352c.S2(X3.b.c2(null));
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }
}
