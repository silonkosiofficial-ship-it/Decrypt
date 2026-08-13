package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ja0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2485Ja0 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f28708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f28709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2559La0 f28710c;

    C2485Ja0(com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.Q90 q90) {
        this.f28708a = e90;
        this.f28709b = q90;
        this.f28710c = c2559La0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        this.f28708a.K0(false);
        com.google.android.gms.internal.ads.Q90 q90 = this.f28709b;
        if (q90 != null) {
            q90.a(this.f28708a);
            q90.h();
        } else {
            this.f28710c.f29526f.b(this.f28708a.m());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        this.f28708a.K0(((p224w3.u) obj) == p224w3.u.SUCCESS);
        com.google.android.gms.internal.ads.Q90 q90 = this.f28709b;
        if (q90 == null) {
            this.f28710c.f29526f.b(this.f28708a.m());
        } else {
            q90.a(this.f28708a);
            q90.h();
        }
    }
}
