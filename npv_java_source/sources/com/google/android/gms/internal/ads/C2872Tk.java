package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2872Tk implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2208Bk f31983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p214v3.C7235b0 f31984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3952hl f31985c;

    C2872Tk(com.google.android.gms.internal.ads.C3952hl c3952hl, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk, p214v3.C7235b0 c7235b0) {
        this.f31983a = interfaceC2208Bk;
        this.f31984b = c7235b0;
        this.f31985c = c3952hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        p214v3.AbstractC7265q0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f31985c.f36117a) {
            try {
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                p224w3.p.f("JS Engine is requesting an update");
                if (this.f31985c.f36125i == 0) {
                    p224w3.p.f("Starting reload.");
                    this.f31985c.f36125i = 2;
                    this.f31985c.d(null);
                }
                this.f31983a.q0("/requestReload", (com.google.android.gms.internal.ads.InterfaceC3838gj) this.f31984b.a());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p214v3.AbstractC7265q0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
