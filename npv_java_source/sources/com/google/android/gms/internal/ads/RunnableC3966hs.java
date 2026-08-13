package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3966hs implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2879Tr f36142C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f36143D = false;

    RunnableC3966hs(com.google.android.gms.internal.ads.C2879Tr c2879Tr) {
        this.f36142C = c2879Tr;
    }

    private final void c() {
        com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
        handlerC2345Fe0.removeCallbacks(this);
        handlerC2345Fe0.postDelayed(this, 250L);
    }

    public final void a() {
        this.f36143D = true;
        this.f36142C.D();
    }

    public final void b() {
        this.f36143D = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f36143D) {
            return;
        }
        this.f36142C.D();
        c();
    }
}
