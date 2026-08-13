package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class BV implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.R60 f25971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.DV f25972b;

    BV(com.google.android.gms.internal.ads.DV dv, com.google.android.gms.internal.ads.R60 r60) {
        this.f25971a = r60;
        this.f25972b = dv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        synchronized (this.f25972b) {
            try {
                this.f25972b.f26715h.b(th, this.f25971a);
                com.google.android.gms.internal.ads.R60 r60A = this.f25972b.f26715h.a();
                if (this.f25971a.f31203v0) {
                    while (r60A != null) {
                        this.f25972b.e(r60A);
                        r60A = this.f25972b.f26715h.a();
                    }
                } else if (r60A != null) {
                    this.f25972b.e(r60A);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.UV uv = (com.google.android.gms.internal.ads.UV) obj;
        synchronized (this.f25972b) {
            try {
                this.f25972b.f26715h.c(uv, this.f25971a);
                com.google.android.gms.internal.ads.R60 r60A = this.f25972b.f26715h.a();
                if (r60A != null) {
                    this.f25972b.e(r60A);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
