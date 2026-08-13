package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3016Xk implements com.google.android.gms.internal.ads.InterfaceC4732or {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3842gl f33164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f33165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3952hl f33166c;

    C3016Xk(com.google.android.gms.internal.ads.C3952hl c3952hl, com.google.android.gms.internal.ads.C3842gl c3842gl, com.google.android.gms.internal.ads.E90 e90) {
        this.f33164a = c3842gl;
        this.f33165b = e90;
        this.f33166c = c3952hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732or
    public final void a() {
        p214v3.AbstractC7265q0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f33166c.f36117a) {
            try {
                p214v3.AbstractC7265q0.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.f33166c.f36125i = 1;
                p214v3.AbstractC7265q0.k("Failed loading new engine. Marking new engine destroyable.");
                this.f33164a.h();
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39433d.e()).booleanValue()) {
                    com.google.android.gms.internal.ads.C3952hl c3952hl = this.f33166c;
                    if (c3952hl.f36121e != null) {
                        com.google.android.gms.internal.ads.T90 t90 = c3952hl.f36121e;
                        com.google.android.gms.internal.ads.E90 e90 = this.f33165b;
                        e90.E("Failed loading new engine");
                        e90.K0(false);
                        t90.b(e90.m());
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p214v3.AbstractC7265q0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
