package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class T6 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3448d7 f31871C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3887h7 f31872D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Runnable f31873E;

    public T6(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, com.google.android.gms.internal.ads.C3887h7 c3887h7, java.lang.Runnable runnable) {
        this.f31871C = abstractC3448d7;
        this.f31872D = c3887h7;
        this.f31873E = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31871C.F();
        com.google.android.gms.internal.ads.C3887h7 c3887h7 = this.f31872D;
        if (c3887h7.c()) {
            this.f31871C.x(c3887h7.f36006a);
        } else {
            this.f31871C.w(c3887h7.f36008c);
        }
        if (this.f31872D.f36009d) {
            this.f31871C.v("intermediate-response");
        } else {
            this.f31871C.y("done");
        }
        java.lang.Runnable runnable = this.f31873E;
        if (runnable != null) {
            runnable.run();
        }
    }
}
