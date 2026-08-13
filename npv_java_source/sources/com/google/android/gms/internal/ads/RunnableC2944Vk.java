package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2944Vk implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3842gl f32562C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2208Bk f32563D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ java.util.ArrayList f32564E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ long f32565F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3952hl f32566G;

    RunnableC2944Vk(com.google.android.gms.internal.ads.C3952hl c3952hl, com.google.android.gms.internal.ads.C3842gl c3842gl, com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk, java.util.ArrayList arrayList, long j6) {
        this.f32562C = c3842gl;
        this.f32563D = interfaceC2208Bk;
        this.f32564E = arrayList;
        this.f32565F = j6;
        this.f32566G = c3952hl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        p214v3.AbstractC7265q0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f32566G.f36117a) {
            try {
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f32562C.a() != -1 && this.f32562C.a() != 1) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25225B7)).booleanValue()) {
                        this.f32562C.d(new java.util.concurrent.TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.f32562C.c();
                    }
                    com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;
                    final com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk = this.f32563D;
                    j$.util.Objects.requireNonNull(interfaceC2208Bk);
                    yk0.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Uk
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC2208Bk.c();
                        }
                    });
                    java.lang.String strValueOf = java.lang.String.valueOf(p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25513c));
                    int iA = this.f32562C.a();
                    int i6 = this.f32566G.f36125i;
                    if (this.f32564E.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + java.lang.String.valueOf(this.f32564E.get(0));
                    }
                    p214v3.AbstractC7265q0.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iA + ". Update status(fullLoadTimeout) is " + i6 + str + " ms. Total latency(fullLoadTimeout) is " + (p174r3.v.c().a() - this.f32565F) + " ms at timeout. Rejecting.");
                    p214v3.AbstractC7265q0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
