package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3095Zr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33663b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33662a = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25382Q)).longValue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33664c = true;

    C3095Zr() {
    }

    public final void a(android.graphics.SurfaceTexture surfaceTexture, final com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr) {
        if (interfaceC2512Jr == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f33664c) {
            long j6 = timestamp - this.f33663b;
            if (java.lang.Math.abs(j6) < this.f33662a) {
                return;
            }
        }
        this.f33664c = false;
        this.f33663b = timestamp;
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Yr
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2512Jr.k();
            }
        });
    }

    public final void b() {
        this.f33664c = true;
    }
}
