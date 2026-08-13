package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2980Wk implements com.google.android.gms.internal.ads.InterfaceC4952qr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3842gl f32785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f32786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3952hl f32787c;

    C2980Wk(com.google.android.gms.internal.ads.C3952hl c3952hl, com.google.android.gms.internal.ads.C3842gl c3842gl, com.google.android.gms.internal.ads.E90 e90) {
        this.f32785a = c3842gl;
        this.f32786b = e90;
        this.f32787c = c3952hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4952qr
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        p214v3.AbstractC7265q0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f32787c.f36117a) {
            try {
                p214v3.AbstractC7265q0.k("loadNewJavascriptEngine (success): Lock acquired");
                this.f32787c.f36125i = 0;
                com.google.android.gms.internal.ads.C3952hl c3952hl = this.f32787c;
                if (c3952hl.f36124h != null && this.f32785a != c3952hl.f36124h) {
                    p214v3.AbstractC7265q0.k("New JS engine is loaded, marking previous one as destroyable.");
                    this.f32787c.f36124h.h();
                }
                this.f32787c.f36124h = this.f32785a;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39433d.e()).booleanValue()) {
                    com.google.android.gms.internal.ads.C3952hl c3952hl2 = this.f32787c;
                    if (c3952hl2.f36121e != null) {
                        com.google.android.gms.internal.ads.T90 t90 = c3952hl2.f36121e;
                        com.google.android.gms.internal.ads.E90 e90 = this.f32786b;
                        e90.K0(true);
                        t90.b(e90.m());
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p214v3.AbstractC7265q0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
