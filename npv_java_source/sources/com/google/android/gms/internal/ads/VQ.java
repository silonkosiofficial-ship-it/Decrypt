package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class VQ implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.WQ f32495a;

    VQ(com.google.android.gms.internal.ads.WQ wq) {
        this.f32495a = wq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue()) {
            java.util.regex.Matcher matcher = com.google.android.gms.internal.ads.WQ.f32740h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f32495a.f32745e.i(java.lang.Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3558e70 c3558e70 = (com.google.android.gms.internal.ads.C3558e70) obj;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue()) {
            this.f32495a.f32745e.i(c3558e70.f34899b.f34448b.f32118f);
            this.f32495a.f32745e.j(c3558e70.f34899b.f34448b.f32119g);
        }
    }
}
