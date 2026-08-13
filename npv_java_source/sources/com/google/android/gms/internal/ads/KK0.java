package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KK0 extends android.view.Surface {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static int f28895F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static boolean f28896G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f28897C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.IK0 f28898D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f28899E;

    /* synthetic */ KK0(com.google.android.gms.internal.ads.IK0 ik0, android.graphics.SurfaceTexture surfaceTexture, boolean z6, com.google.android.gms.internal.ads.JK0 jk0) {
        super(surfaceTexture);
        this.f28898D = ik0;
        this.f28897C = z6;
    }

    public static com.google.android.gms.internal.ads.KK0 a(android.content.Context context, boolean z6) {
        boolean z10 = true;
        if (z6 && !b(context)) {
            z10 = false;
        }
        com.google.android.gms.internal.ads.LC.f(z10);
        return new com.google.android.gms.internal.ads.IK0().a(z6 ? f28895F : 0);
    }

    public static synchronized boolean b(android.content.Context context) {
        int i6;
        try {
            if (!f28896G) {
                if (com.google.android.gms.internal.ads.AbstractC5444vH.b(context)) {
                    i6 = com.google.android.gms.internal.ads.AbstractC5444vH.c() ? 1 : 2;
                } else {
                    i6 = 0;
                }
                f28895F = i6;
                f28896G = true;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f28895F != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f28898D) {
            try {
                if (!this.f28899E) {
                    this.f28898D.b();
                    this.f28899E = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
