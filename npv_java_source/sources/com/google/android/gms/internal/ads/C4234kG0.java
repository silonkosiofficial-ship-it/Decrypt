package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4234kG0 implements com.google.android.gms.internal.ads.InterfaceC5773yG0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.ArrayDeque f36915g = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.Object f36916h = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f36917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.HandlerThread f36918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Handler f36919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f36920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QE f36921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36922f;

    public C4234kG0(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread) {
        com.google.android.gms.internal.ads.QE qe = new com.google.android.gms.internal.ads.QE(com.google.android.gms.internal.ads.InterfaceC4447mD.f37298a);
        this.f36917a = mediaCodec;
        this.f36918b = handlerThread;
        this.f36921e = qe;
        this.f36920d = new java.util.concurrent.atomic.AtomicReference();
    }

    static /* bridge */ /* synthetic */ void f(com.google.android.gms.internal.ads.C4234kG0 c4234kG0, android.os.Message message) {
        com.google.android.gms.internal.ads.C4016iG0 c4016iG0;
        int i6 = message.what;
        com.google.android.gms.internal.ads.C4016iG0 c4016iG1 = null;
        if (i6 == 1) {
            c4016iG0 = (com.google.android.gms.internal.ads.C4016iG0) message.obj;
            try {
                c4234kG0.f36917a.queueInputBuffer(c4016iG0.f36252a, 0, c4016iG0.f36254c, c4016iG0.f36256e, c4016iG0.f36257f);
            } catch (java.lang.RuntimeException e6) {
                e = e6;
                com.google.android.gms.internal.ads.AbstractC3796gG0.a(c4234kG0.f36920d, null, e);
            }
            c4016iG1 = c4016iG0;
        } else if (i6 == 2) {
            c4016iG0 = (com.google.android.gms.internal.ads.C4016iG0) message.obj;
            int i10 = c4016iG0.f36252a;
            android.media.MediaCodec.CryptoInfo cryptoInfo = c4016iG0.f36255d;
            long j6 = c4016iG0.f36256e;
            int i11 = c4016iG0.f36257f;
            try {
                synchronized (f36916h) {
                    c4234kG0.f36917a.queueSecureInputBuffer(i10, 0, cryptoInfo, j6, i11);
                }
            } catch (java.lang.RuntimeException e10) {
                e = e10;
                com.google.android.gms.internal.ads.AbstractC3796gG0.a(c4234kG0.f36920d, null, e);
            }
            c4016iG1 = c4016iG0;
        } else if (i6 == 3) {
            c4234kG0.f36921e.e();
        } else if (i6 != 4) {
            com.google.android.gms.internal.ads.AbstractC3796gG0.a(c4234kG0.f36920d, null, new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)));
        } else {
            try {
                c4234kG0.f36917a.setParameters((android.os.Bundle) message.obj);
            } catch (java.lang.RuntimeException e11) {
                com.google.android.gms.internal.ads.AbstractC3796gG0.a(c4234kG0.f36920d, null, e11);
            }
        }
        if (c4016iG1 != null) {
            java.util.ArrayDeque arrayDeque = f36915g;
            synchronized (arrayDeque) {
                arrayDeque.add(c4016iG1);
            }
        }
    }

    private static com.google.android.gms.internal.ads.C4016iG0 h() {
        java.util.ArrayDeque arrayDeque = f36915g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new com.google.android.gms.internal.ads.C4016iG0();
                }
                return (com.google.android.gms.internal.ads.C4016iG0) arrayDeque.removeFirst();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] j(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return java.util.Arrays.copyOf(bArr, bArr.length);
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] k(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return java.util.Arrays.copyOf(iArr, iArr.length);
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void a(android.os.Bundle bundle) {
        c();
        android.os.Handler handler = this.f36919c;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void b() {
        if (this.f36922f) {
            try {
                android.os.Handler handler = this.f36919c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f36921e.c();
                android.os.Handler handler2 = this.f36919c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                this.f36921e.a();
            } catch (java.lang.InterruptedException e6) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void c() {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.f36920d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void d(int i6, int i10, int i11, long j6, int i12) {
        c();
        com.google.android.gms.internal.ads.C4016iG0 c4016iG0H = h();
        c4016iG0H.a(i6, 0, i11, j6, i12);
        android.os.Handler handler = this.f36919c;
        int i13 = com.google.android.gms.internal.ads.EW.f27061a;
        handler.obtainMessage(1, c4016iG0H).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void e(int i6, int i10, com.google.android.gms.internal.ads.Iy0 iy0, long j6, int i11) {
        c();
        com.google.android.gms.internal.ads.C4016iG0 c4016iG0H = h();
        c4016iG0H.a(i6, 0, 0, j6, 0);
        android.media.MediaCodec.CryptoInfo cryptoInfo = c4016iG0H.f36255d;
        cryptoInfo.numSubSamples = iy0.f28556f;
        cryptoInfo.numBytesOfClearData = k(iy0.f28554d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = k(iy0.f28555e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrJ = j(iy0.f28552b, cryptoInfo.key);
        bArrJ.getClass();
        cryptoInfo.key = bArrJ;
        byte[] bArrJ2 = j(iy0.f28551a, cryptoInfo.iv);
        bArrJ2.getClass();
        cryptoInfo.iv = bArrJ2;
        cryptoInfo.mode = iy0.f28553c;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 24) {
            com.google.android.gms.internal.ads.AbstractC4124jG0.a();
            cryptoInfo.setPattern(com.google.android.gms.internal.ads.Fx0.a(iy0.f28557g, iy0.f28558h));
        }
        this.f36919c.obtainMessage(2, c4016iG0H).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void g() {
        if (this.f36922f) {
            return;
        }
        this.f36918b.start();
        this.f36919c = new com.google.android.gms.internal.ads.HandlerC3906hG0(this, this.f36918b.getLooper());
        this.f36922f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void i() {
        if (this.f36922f) {
            b();
            this.f36918b.quit();
        }
        this.f36922f = false;
    }
}
