package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class HandlerC3804gK0 extends android.os.Handler implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3914hK0 f35584C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f35585D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3584eK0 f35586E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.io.IOException f35587F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f35588G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.lang.Thread f35589H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f35590I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private volatile boolean f35591J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4462mK0 f35592K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3804gK0(com.google.android.gms.internal.ads.C4462mK0 c4462mK0, android.os.Looper looper, com.google.android.gms.internal.ads.InterfaceC3914hK0 interfaceC3914hK0, com.google.android.gms.internal.ads.InterfaceC3584eK0 interfaceC3584eK0, int i6, long j6) {
        super(looper);
        this.f35592K = c4462mK0;
        this.f35584C = interfaceC3914hK0;
        this.f35586E = interfaceC3584eK0;
        this.f35585D = j6;
    }

    private final void d() {
        android.os.SystemClock.elapsedRealtime();
        this.f35586E.getClass();
        this.f35587F = null;
        com.google.android.gms.internal.ads.C4462mK0 c4462mK0 = this.f35592K;
        com.google.android.gms.internal.ads.InterfaceExecutorC5451vK0 interfaceExecutorC5451vK0 = c4462mK0.f37336a;
        com.google.android.gms.internal.ads.HandlerC3804gK0 handlerC3804gK0 = c4462mK0.f37337b;
        handlerC3804gK0.getClass();
        interfaceExecutorC5451vK0.execute(handlerC3804gK0);
    }

    public final void a(boolean z6) {
        this.f35591J = z6;
        this.f35587F = null;
        if (hasMessages(1)) {
            this.f35590I = true;
            removeMessages(1);
            if (!z6) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f35590I = true;
                    this.f35584C.i();
                    java.lang.Thread thread = this.f35589H;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (z6) {
            this.f35592K.f37337b = null;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.google.android.gms.internal.ads.InterfaceC3584eK0 interfaceC3584eK0 = this.f35586E;
            interfaceC3584eK0.getClass();
            interfaceC3584eK0.e(this.f35584C, jElapsedRealtime, jElapsedRealtime - this.f35585D, true);
            this.f35586E = null;
        }
    }

    public final void b(int i6) {
        java.io.IOException iOException = this.f35587F;
        if (iOException != null && this.f35588G > i6) {
            throw iOException;
        }
    }

    public final void c(long j6) {
        com.google.android.gms.internal.ads.LC.f(this.f35592K.f37337b == null);
        this.f35592K.f37337b = this;
        if (j6 > 0) {
            sendEmptyMessageDelayed(1, j6);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.f35591J) {
            return;
        }
        int i6 = message.what;
        if (i6 == 1) {
            d();
            return;
        }
        if (i6 == 4) {
            throw ((java.lang.Error) message.obj);
        }
        this.f35592K.f37337b = null;
        long j6 = this.f35585D;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - j6;
        com.google.android.gms.internal.ads.InterfaceC3584eK0 interfaceC3584eK0 = this.f35586E;
        interfaceC3584eK0.getClass();
        if (this.f35590I) {
            interfaceC3584eK0.e(this.f35584C, jElapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                interfaceC3584eK0.m(this.f35584C, jElapsedRealtime, j10);
                return;
            } catch (java.lang.RuntimeException e6) {
                com.google.android.gms.internal.ads.AbstractC3586eM.d("LoadTask", "Unexpected exception handling load completed", e6);
                this.f35592K.f37338c = new com.google.android.gms.internal.ads.C4242kK0(e6);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.f35587F = iOException;
        int i11 = this.f35588G + 1;
        this.f35588G = i11;
        com.google.android.gms.internal.ads.C3694fK0 c3694fK0L = interfaceC3584eK0.l(this.f35584C, jElapsedRealtime, j10, iOException, i11);
        if (c3694fK0L.f35324a == 3) {
            this.f35592K.f37338c = this.f35587F;
        } else if (c3694fK0L.f35324a != 2) {
            if (c3694fK0L.f35324a == 1) {
                this.f35588G = 1;
            }
            c(c3694fK0L.f35325b != -9223372036854775807L ? c3694fK0L.f35325b : java.lang.Math.min((this.f35588G - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object c4242kK0;
        android.os.Message messageObtainMessage;
        boolean z6;
        try {
            synchronized (this) {
                z6 = !this.f35590I;
                this.f35589H = java.lang.Thread.currentThread();
            }
            if (z6) {
                android.os.Trace.beginSection("load:" + this.f35584C.getClass().getSimpleName());
                try {
                    this.f35584C.g();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f35589H = null;
                java.lang.Thread.interrupted();
            }
            if (this.f35591J) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e6) {
            if (this.f35591J) {
                return;
            }
            messageObtainMessage = obtainMessage(3, e6);
            messageObtainMessage.sendToTarget();
        } catch (java.lang.Error e10) {
            if (!this.f35591J) {
                com.google.android.gms.internal.ads.AbstractC3586eM.d("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        } catch (java.lang.Exception e11) {
            if (this.f35591J) {
                return;
            }
            com.google.android.gms.internal.ads.AbstractC3586eM.d("LoadTask", "Unexpected exception loading stream", e11);
            c4242kK0 = new com.google.android.gms.internal.ads.C4242kK0(e11);
            messageObtainMessage = obtainMessage(3, c4242kK0);
            messageObtainMessage.sendToTarget();
        } catch (java.lang.OutOfMemoryError e12) {
            if (this.f35591J) {
                return;
            }
            com.google.android.gms.internal.ads.AbstractC3586eM.d("LoadTask", "OutOfMemory error loading stream", e12);
            c4242kK0 = new com.google.android.gms.internal.ads.C4242kK0(e12);
            messageObtainMessage = obtainMessage(3, c4242kK0);
            messageObtainMessage.sendToTarget();
        }
    }
}
