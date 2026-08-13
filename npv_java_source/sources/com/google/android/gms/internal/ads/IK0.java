package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class IK0 extends android.os.HandlerThread implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.RunnableC5222tG f28448C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.os.Handler f28449D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Error f28450E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.RuntimeException f28451F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.KK0 f28452G;

    public IK0() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final com.google.android.gms.internal.ads.KK0 a(int i6) {
        boolean z6;
        start();
        this.f28449D = new android.os.Handler(getLooper(), this);
        this.f28448C = new com.google.android.gms.internal.ads.RunnableC5222tG(this.f28449D, null);
        synchronized (this) {
            z6 = false;
            this.f28449D.obtainMessage(1, i6, 0).sendToTarget();
            while (this.f28452G == null && this.f28451F == null && this.f28450E == null) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
        java.lang.RuntimeException runtimeException = this.f28451F;
        if (runtimeException != null) {
            throw runtimeException;
        }
        java.lang.Error error = this.f28450E;
        if (error != null) {
            throw error;
        }
        com.google.android.gms.internal.ads.KK0 kk0 = this.f28452G;
        kk0.getClass();
        return kk0;
    }

    public final void b() {
        android.os.Handler handler = this.f28449D;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i6 = message.what;
        try {
            if (i6 == 1) {
                try {
                    int i10 = message.arg1;
                    com.google.android.gms.internal.ads.RunnableC5222tG runnableC5222tG = this.f28448C;
                    if (runnableC5222tG == null) {
                        throw null;
                    }
                    runnableC5222tG.b(i10);
                    this.f28452G = new com.google.android.gms.internal.ads.KK0(this, this.f28448C.a(), i10 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (com.google.android.gms.internal.ads.UG e6) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.d("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f28451F = new java.lang.IllegalStateException(e6);
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.Error e10) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f28450E = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.RuntimeException e11) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f28451F = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i6 == 2) {
                try {
                    com.google.android.gms.internal.ads.RunnableC5222tG runnableC5222tG2 = this.f28448C;
                    if (runnableC5222tG2 == null) {
                        throw null;
                    }
                    runnableC5222tG2.c();
                    return true;
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.android.gms.internal.ads.AbstractC3586eM.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (java.lang.Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
