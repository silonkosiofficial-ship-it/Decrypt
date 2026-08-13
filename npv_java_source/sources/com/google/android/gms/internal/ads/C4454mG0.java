package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4454mG0 extends android.media.MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.HandlerThread f37307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Handler f37308c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.media.MediaFormat f37313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.media.MediaFormat f37314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.media.MediaCodec.CodecException f37315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.media.MediaCodec.CryptoException f37316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.lang.IllegalStateException f37319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5553wG0 f37320o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f37306a = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p170r.C7030e f37309d = new p170r.C7030e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p170r.C7030e f37310e = new p170r.C7030e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.ArrayDeque f37311f = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayDeque f37312g = new java.util.ArrayDeque();

    C4454mG0(android.os.HandlerThread handlerThread) {
        this.f37307b = handlerThread;
    }

    public static /* synthetic */ void d(com.google.android.gms.internal.ads.C4454mG0 c4454mG0) {
        synchronized (c4454mG0.f37306a) {
            try {
                if (c4454mG0.f37318m) {
                    return;
                }
                long j6 = c4454mG0.f37317l - 1;
                c4454mG0.f37317l = j6;
                if (j6 > 0) {
                    return;
                }
                if (j6 >= 0) {
                    c4454mG0.j();
                    return;
                }
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException();
                synchronized (c4454mG0.f37306a) {
                    c4454mG0.f37319n = illegalStateException;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final void i(android.media.MediaFormat mediaFormat) {
        this.f37310e.a(-2);
        this.f37312g.add(mediaFormat);
    }

    private final void j() {
        if (!this.f37312g.isEmpty()) {
            this.f37314i = (android.media.MediaFormat) this.f37312g.getLast();
        }
        this.f37309d.b();
        this.f37310e.b();
        this.f37311f.clear();
        this.f37312g.clear();
    }

    private final void k() {
        java.lang.IllegalStateException illegalStateException = this.f37319n;
        if (illegalStateException != null) {
            this.f37319n = null;
            throw illegalStateException;
        }
        android.media.MediaCodec.CodecException codecException = this.f37315j;
        if (codecException != null) {
            this.f37315j = null;
            throw codecException;
        }
        android.media.MediaCodec.CryptoException cryptoException = this.f37316k;
        if (cryptoException == null) {
            return;
        }
        this.f37316k = null;
        throw cryptoException;
    }

    private final boolean l() {
        return this.f37317l > 0 || this.f37318m;
    }

    public final int a() {
        synchronized (this.f37306a) {
            try {
                k();
                int iE = -1;
                if (l()) {
                    return -1;
                }
                if (!this.f37309d.d()) {
                    iE = this.f37309d.e();
                }
                return iE;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final int b(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f37306a) {
            try {
                k();
                if (l()) {
                    return -1;
                }
                if (this.f37310e.d()) {
                    return -1;
                }
                int iE = this.f37310e.e();
                if (iE >= 0) {
                    com.google.android.gms.internal.ads.LC.b(this.f37313h);
                    android.media.MediaCodec.BufferInfo bufferInfo2 = (android.media.MediaCodec.BufferInfo) this.f37311f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f37313h = (android.media.MediaFormat) this.f37312g.remove();
                    iE = -2;
                }
                return iE;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final android.media.MediaFormat c() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.f37306a) {
            try {
                mediaFormat = this.f37313h;
                if (mediaFormat == null) {
                    throw new java.lang.IllegalStateException();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f37306a) {
            this.f37317l++;
            android.os.Handler handler = this.f37308c;
            int i6 = com.google.android.gms.internal.ads.EW.f27061a;
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.lG0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.C4454mG0.d(this.f37131C);
                }
            });
        }
    }

    public final void f(android.media.MediaCodec mediaCodec) {
        com.google.android.gms.internal.ads.LC.f(this.f37308c == null);
        this.f37307b.start();
        android.os.Handler handler = new android.os.Handler(this.f37307b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f37308c = handler;
    }

    public final void g(com.google.android.gms.internal.ads.InterfaceC5553wG0 interfaceC5553wG0) {
        synchronized (this.f37306a) {
            this.f37320o = interfaceC5553wG0;
        }
    }

    public final void h() {
        synchronized (this.f37306a) {
            this.f37318m = true;
            this.f37307b.quit();
            j();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.f37306a) {
            this.f37316k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.f37306a) {
            this.f37315j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i6) {
        synchronized (this.f37306a) {
            try {
                this.f37309d.a(i6);
                com.google.android.gms.internal.ads.InterfaceC5553wG0 interfaceC5553wG0 = this.f37320o;
                if (interfaceC5553wG0 != null) {
                    com.google.android.gms.internal.ads.NG0 ng0 = ((com.google.android.gms.internal.ads.JG0) interfaceC5553wG0).f28655a;
                    if (ng0.f30211D != null) {
                        ng0.f30211D.a();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i6, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f37306a) {
            try {
                android.media.MediaFormat mediaFormat = this.f37314i;
                if (mediaFormat != null) {
                    i(mediaFormat);
                    this.f37314i = null;
                }
                this.f37310e.a(i6);
                this.f37311f.add(bufferInfo);
                com.google.android.gms.internal.ads.InterfaceC5553wG0 interfaceC5553wG0 = this.f37320o;
                if (interfaceC5553wG0 != null) {
                    com.google.android.gms.internal.ads.NG0 ng0 = ((com.google.android.gms.internal.ads.JG0) interfaceC5553wG0).f28655a;
                    if (ng0.f30211D != null) {
                        ng0.f30211D.a();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.f37306a) {
            i(mediaFormat);
            this.f37314i = null;
        }
    }
}
