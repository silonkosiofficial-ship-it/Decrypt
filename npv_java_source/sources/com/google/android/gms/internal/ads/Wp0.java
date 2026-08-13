package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Wp0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Wp0 f32807b = new com.google.android.gms.internal.ads.Wp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32808a = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.internal.ads.C5060rq0(new com.google.android.gms.internal.ads.C4621nq0(null), null));

    Wp0() {
    }

    public static com.google.android.gms.internal.ads.Wp0 a() {
        return f32807b;
    }

    public final java.lang.Class b(java.lang.Class cls) {
        return ((com.google.android.gms.internal.ads.C5060rq0) this.f32808a.get()).a(cls);
    }

    public final java.lang.Object c(com.google.android.gms.internal.ads.El0 el0, java.lang.Class cls) {
        return ((com.google.android.gms.internal.ads.C5060rq0) this.f32808a.get()).b(el0, cls);
    }

    public final java.lang.Object d(com.google.android.gms.internal.ads.C5500vq0 c5500vq0, java.lang.Class cls) {
        return ((com.google.android.gms.internal.ads.C5060rq0) this.f32808a.get()).c(c5500vq0, cls);
    }

    public final synchronized void e(com.google.android.gms.internal.ads.AbstractC4511mq0 abstractC4511mq0) {
        com.google.android.gms.internal.ads.C4621nq0 c4621nq0 = new com.google.android.gms.internal.ads.C4621nq0((com.google.android.gms.internal.ads.C5060rq0) this.f32808a.get(), null);
        c4621nq0.a(abstractC4511mq0);
        this.f32808a.set(new com.google.android.gms.internal.ads.C5060rq0(c4621nq0, null));
    }

    public final synchronized void f(com.google.android.gms.internal.ads.InterfaceC5610wq0 interfaceC5610wq0) {
        com.google.android.gms.internal.ads.C4621nq0 c4621nq0 = new com.google.android.gms.internal.ads.C4621nq0((com.google.android.gms.internal.ads.C5060rq0) this.f32808a.get(), null);
        c4621nq0.b(interfaceC5610wq0);
        this.f32808a.set(new com.google.android.gms.internal.ads.C5060rq0(c4621nq0, null));
    }
}
