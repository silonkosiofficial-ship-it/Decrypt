package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2555Kx implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2559La0 f29160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f29161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p224w3.w f29162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2591Lx f29163d;

    C2555Kx(com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.C2559La0 c2559La0, java.lang.String str, p224w3.w wVar) {
        this.f29160a = c2559La0;
        this.f29161b = str;
        this.f29162c = wVar;
        this.f29163d = c2591Lx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(final java.lang.Throwable th) {
        com.google.android.gms.internal.ads.Yk0 yk0 = this.f29163d.f29601e;
        final com.google.android.gms.internal.ads.C2559La0 c2559La0 = this.f29160a;
        final java.lang.String str = this.f29161b;
        final p224w3.w wVar = this.f29162c;
        yk0.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ix
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.InterfaceC4616no interfaceC4616no;
                java.lang.String str2;
                boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25589ia)).booleanValue();
                com.google.android.gms.internal.ads.C2555Kx c2555Kx = this.f28546C;
                java.lang.Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.internal.ads.C2591Lx c2591Lx = c2555Kx.f29163d;
                    c2591Lx.f29605i = com.google.android.gms.internal.ads.C4396lo.e(c2591Lx.f29597a);
                    interfaceC4616no = c2555Kx.f29163d.f29605i;
                    str2 = "AttributionReporting.registerSourceAndPingClickUrl";
                } else {
                    com.google.android.gms.internal.ads.C2591Lx c2591Lx2 = c2555Kx.f29163d;
                    c2591Lx2.f29604h = com.google.android.gms.internal.ads.C4396lo.c(c2591Lx2.f29597a);
                    interfaceC4616no = c2555Kx.f29163d.f29604h;
                    str2 = "AttributionReportingSampled.registerSourceAndPingClickUrl";
                }
                interfaceC4616no.a(th2, str2);
                p224w3.w wVar2 = wVar;
                c2559La0.d(str, wVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        final com.google.android.gms.internal.ads.C2559La0 c2559La0 = this.f29160a;
        final java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.internal.ads.Yk0 yk0 = this.f29163d.f29601e;
        final p224w3.w wVar = this.f29162c;
        yk0.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Jx
            @Override // java.lang.Runnable
            public final void run() {
                c2559La0.d(str, wVar, null);
            }
        });
    }
}
