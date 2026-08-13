package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class U6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f32112a;

    public U6(android.os.Handler handler) {
        this.f32112a = new com.google.android.gms.internal.ads.S6(this, handler);
    }

    public final void a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, com.google.android.gms.internal.ads.C4215k7 c4215k7) {
        abstractC3448d7.v("post-error");
        ((com.google.android.gms.internal.ads.S6) this.f32112a).f31553C.post(new com.google.android.gms.internal.ads.T6(abstractC3448d7, com.google.android.gms.internal.ads.C3887h7.a(c4215k7), null));
    }

    public final void b(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, com.google.android.gms.internal.ads.C3887h7 c3887h7, java.lang.Runnable runnable) {
        abstractC3448d7.z();
        abstractC3448d7.v("post-response");
        ((com.google.android.gms.internal.ads.S6) this.f32112a).f31553C.post(new com.google.android.gms.internal.ads.T6(abstractC3448d7, c3887h7, runnable));
    }
}
