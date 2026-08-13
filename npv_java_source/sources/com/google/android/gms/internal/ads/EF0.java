package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class EF0 implements com.google.android.gms.internal.ads.RE0 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final java.lang.Object f26943b0 = new java.lang.Object();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static java.util.concurrent.ScheduledExecutorService f26944c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static int f26945d0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f26946A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f26947B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f26948C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f26949D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f26950E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f26951F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f26952G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f26953H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.nio.ByteBuffer f26954I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f26955J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.nio.ByteBuffer f26956K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f26957L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f26958M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f26959N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f26960O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f26961P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3118a60 f26962Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5109sE0 f26963R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f26964S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f26965T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f26966U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private android.os.Looper f26967V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private long f26968W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f26969X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private android.os.Handler f26970Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4232kF0 f26971Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f26972a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZE0 f26973a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.WE0 f26974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.OF0 f26975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f26976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f26977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VE0 f26978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayDeque f26979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5771yF0 f26980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5111sF0 f26981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5111sF0 f26982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3794gF0 f26983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3244bE0 f26984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.gms.internal.ads.OE0 f26985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4122jF0 f26986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4122jF0 f26987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4956qt f26988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.media.AudioTrack f26989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4450mE0 f26990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4999rE0 f26991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5001rF0 f26992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5459vS f26993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4342lF0 f26994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4342lF0 f26995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4930qg f26996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f26997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f26998z;

    /* synthetic */ EF0(com.google.android.gms.internal.ads.C4014iF0 c4014iF0, com.google.android.gms.internal.ads.AbstractC5881zF0 abstractC5881zF0) {
        com.google.android.gms.internal.ads.C4450mE0 c4450mE0C;
        android.content.Context context = c4014iF0.f36244a;
        this.f26972a = context;
        com.google.android.gms.internal.ads.C5459vS c5459vS = com.google.android.gms.internal.ads.C5459vS.f39390b;
        this.f26993u = c5459vS;
        com.google.android.gms.internal.ads.AbstractC5881zF0 abstractC5881zF1 = null;
        if (context != null) {
            com.google.android.gms.internal.ads.C4450mE0 c4450mE0 = com.google.android.gms.internal.ads.C4450mE0.f37299c;
            int i6 = com.google.android.gms.internal.ads.EW.f27061a;
            c4450mE0C = com.google.android.gms.internal.ads.C4450mE0.c(context, c5459vS, null);
        } else {
            c4450mE0C = c4014iF0.f36245b;
        }
        this.f26990r = c4450mE0C;
        this.f26971Z = c4014iF0.f36249f;
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        com.google.android.gms.internal.ads.ZE0 ze0 = c4014iF0.f36250g;
        ze0.getClass();
        this.f26973a0 = ze0;
        this.f26978f = new com.google.android.gms.internal.ads.VE0(new com.google.android.gms.internal.ads.C5221tF0(this, abstractC5881zF1));
        com.google.android.gms.internal.ads.WE0 we0 = new com.google.android.gms.internal.ads.WE0();
        this.f26974b = we0;
        com.google.android.gms.internal.ads.OF0 of0 = new com.google.android.gms.internal.ads.OF0();
        this.f26975c = of0;
        this.f26976d = com.google.android.gms.internal.ads.AbstractC3398ci0.R(new com.google.android.gms.internal.ads.C3100Zw(), we0, of0);
        this.f26977e = com.google.android.gms.internal.ads.AbstractC3398ci0.P(new com.google.android.gms.internal.ads.NF0());
        this.f26953H = 1.0f;
        this.f26961P = 0;
        this.f26962Q = new com.google.android.gms.internal.ads.C3118a60(0, 0.0f);
        com.google.android.gms.internal.ads.C4930qg c4930qg = com.google.android.gms.internal.ads.C4930qg.f38295d;
        this.f26995w = new com.google.android.gms.internal.ads.C4342lF0(c4930qg, 0L, 0L, null);
        this.f26996x = c4930qg;
        this.f26997y = false;
        this.f26979g = new java.util.ArrayDeque();
        this.f26981i = new com.google.android.gms.internal.ads.C5111sF0();
        this.f26982j = new com.google.android.gms.internal.ads.C5111sF0();
        this.f26983k = c4014iF0.f36248e;
    }

    public static /* synthetic */ void D(com.google.android.gms.internal.ads.EF0 ef0) {
        if (ef0.f26969X >= 300000) {
            ((com.google.android.gms.internal.ads.IF0) ef0.f26985m).f28431a.f28872L0 = true;
            ef0.f26969X = 0L;
        }
    }

    static /* synthetic */ void F(android.media.AudioTrack audioTrack, final com.google.android.gms.internal.ads.OE0 oe0, android.os.Handler handler, final com.google.android.gms.internal.ads.LE0 le0) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (oe0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.cF0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.gms.internal.ads.IF0) oe0).f28431a.f28861A0.d(le0);
                    }
                });
            }
            synchronized (f26943b0) {
                try {
                    int i6 = f26945d0 - 1;
                    f26945d0 = i6;
                    if (i6 == 0) {
                        f26944c0.shutdown();
                        f26944c0 = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            if (oe0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.cF0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.android.gms.internal.ads.IF0) oe0).f28431a.f28861A0.d(le0);
                    }
                });
            }
            synchronized (f26943b0) {
                try {
                    int i10 = f26945d0 - 1;
                    f26945d0 = i10;
                    if (i10 == 0) {
                        f26944c0.shutdown();
                        f26944c0 = null;
                    }
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean H() {
        boolean z6;
        synchronized (f26943b0) {
            z6 = f26945d0 > 0;
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long I() {
        com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = this.f26987o;
        return c4122jF0.f36616c == 0 ? this.f26998z / ((long) c4122jF0.f36615b) : this.f26946A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = this.f26987o;
        if (c4122jF0.f36616c != 0) {
            return this.f26948C;
        }
        long j6 = this.f26947B;
        long j10 = c4122jF0.f36617d;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return ((j6 + j10) - 1) / j10;
    }

    private final android.media.AudioTrack L(com.google.android.gms.internal.ads.C4122jF0 c4122jF0) throws com.google.android.gms.internal.ads.NE0 {
        try {
            return c0(c4122jF0.a(), this.f26993u, this.f26961P, c4122jF0.f36614a);
        } catch (com.google.android.gms.internal.ads.NE0 e6) {
            com.google.android.gms.internal.ads.OE0 oe0 = this.f26985m;
            if (oe0 != null) {
                oe0.a(e6);
            }
            throw e6;
        }
    }

    private final void M(long j6) {
        com.google.android.gms.internal.ads.C4930qg c4930qg;
        boolean z6;
        if (b0()) {
            com.google.android.gms.internal.ads.C4232kF0 c4232kF0 = this.f26971Z;
            c4930qg = this.f26996x;
            c4232kF0.c(c4930qg);
        } else {
            c4930qg = com.google.android.gms.internal.ads.C4930qg.f38295d;
        }
        com.google.android.gms.internal.ads.C4930qg c4930qg2 = c4930qg;
        this.f26996x = c4930qg2;
        if (b0()) {
            com.google.android.gms.internal.ads.C4232kF0 c4232kF1 = this.f26971Z;
            z6 = this.f26997y;
            c4232kF1.d(z6);
        } else {
            z6 = false;
        }
        this.f26997y = z6;
        this.f26979g.add(new com.google.android.gms.internal.ads.C4342lF0(c4930qg2, java.lang.Math.max(0L, j6), com.google.android.gms.internal.ads.EW.L(K(), this.f26987o.f36618e), null));
        X();
        com.google.android.gms.internal.ads.OE0 oe0 = this.f26985m;
        if (oe0 != null) {
            ((com.google.android.gms.internal.ads.IF0) oe0).f28431a.f28861A0.w(this.f26997y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    private final void N(long j6) throws com.google.android.gms.internal.ads.QE0 {
        com.google.android.gms.internal.ads.OE0 oe0;
        if (this.f26956K == null || this.f26982j.c()) {
            return;
        }
        int iRemaining = this.f26956K.remaining();
        boolean z6 = true;
        int iWrite = this.f26989q.write(this.f26956K, iRemaining, 1);
        this.f26964S = android.os.SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((com.google.android.gms.internal.ads.EW.f27061a < 24 || iWrite != -6) && iWrite != -32) {
                z6 = false;
            } else if (K() <= 0) {
                if (a0(this.f26989q)) {
                    O();
                } else {
                    z6 = false;
                }
            }
            com.google.android.gms.internal.ads.QE0 qe0 = new com.google.android.gms.internal.ads.QE0(iWrite, this.f26987o.f36614a, z6);
            com.google.android.gms.internal.ads.OE0 oe1 = this.f26985m;
            if (oe1 != null) {
                oe1.a(qe0);
            }
            if (qe0.f30949D) {
                this.f26990r = com.google.android.gms.internal.ads.C4450mE0.f37299c;
                throw qe0;
            }
            this.f26982j.b(qe0);
            return;
        }
        this.f26982j.a();
        if (a0(this.f26989q)) {
            if (this.f26948C > 0) {
                this.f26966U = false;
            }
            if (this.f26960O && (oe0 = this.f26985m) != null && iWrite < iRemaining) {
            }
        }
        int i6 = this.f26987o.f36616c;
        if (i6 == 0) {
            this.f26947B += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i6 != 0) {
                com.google.android.gms.internal.ads.LC.f(this.f26956K == this.f26954I);
                this.f26948C += ((long) this.f26949D) * ((long) this.f26955J);
            }
            this.f26956K = null;
        }
    }

    private final void O() {
        if (this.f26987o.f36616c == 1) {
            this.f26965T = true;
        }
    }

    private final void Q() {
        if (this.f26991s != null || this.f26972a == null) {
            return;
        }
        this.f26967V = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = new com.google.android.gms.internal.ads.C4999rE0(this.f26972a, new com.google.android.gms.internal.ads.C3465dF0(this), this.f26993u, this.f26963R);
        this.f26991s = c4999rE0;
        this.f26990r = c4999rE0.c();
    }

    private final void R() {
        if (this.f26958M) {
            return;
        }
        this.f26958M = true;
        this.f26978f.b(K());
        if (a0(this.f26989q)) {
            this.f26959N = false;
        }
        this.f26989q.stop();
    }

    private final void S(long j6) throws com.google.android.gms.internal.ads.QE0 {
        N(j6);
        if (this.f26956K != null) {
            return;
        }
        if (!this.f26988p.h()) {
            java.nio.ByteBuffer byteBuffer = this.f26954I;
            if (byteBuffer != null) {
                U(byteBuffer);
                N(j6);
                return;
            }
            return;
        }
        while (!this.f26988p.g()) {
            do {
                java.nio.ByteBuffer byteBufferB = this.f26988p.b();
                if (byteBufferB.hasRemaining()) {
                    U(byteBufferB);
                    N(j6);
                } else {
                    java.nio.ByteBuffer byteBuffer2 = this.f26954I;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f26988p.e(this.f26954I);
                    }
                }
            } while (this.f26956K == null);
            return;
        }
    }

    private final void T(com.google.android.gms.internal.ads.C4930qg c4930qg) {
        com.google.android.gms.internal.ads.C4342lF0 c4342lF0 = new com.google.android.gms.internal.ads.C4342lF0(c4930qg, -9223372036854775807L, -9223372036854775807L, null);
        if (Z()) {
            this.f26994v = c4342lF0;
        } else {
            this.f26995w = c4342lF0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004b A[SYNTHETIC] */
    private final void U(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBuffer2;
        int i6;
        int i10;
        int i11;
        int i12;
        byte b6;
        int i13;
        float f6;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        float f11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        com.google.android.gms.internal.ads.LC.f(this.f26956K == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f26987o.f36616c == 0) {
                int iH = (int) com.google.android.gms.internal.ads.EW.H(com.google.android.gms.internal.ads.EW.K(20L), this.f26987o.f36618e);
                long jK = K();
                long j6 = iH;
                if (jK < j6) {
                    com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = this.f26987o;
                    int i25 = c4122jF0.f36620g;
                    int i26 = c4122jF0.f36617d;
                    java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining()).order(java.nio.ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i27 = (int) jK;
                    while (byteBuffer.hasRemaining() && i27 < iH) {
                        if (i25 != 2) {
                            if (i25 == 3) {
                                i11 = (byteBuffer.get() & 255) << 24;
                            } else if (i25 != 4) {
                                if (i25 != 21) {
                                    if (i25 == 22) {
                                        i21 = byteBuffer.get() & 255;
                                        i22 = (byteBuffer.get() & 255) << 8;
                                        i23 = (byteBuffer.get() & 255) << 16;
                                        i24 = (byteBuffer.get() & 255) << 24;
                                    } else if (i25 == 268435456) {
                                        i6 = (byteBuffer.get() & 255) << 24;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                    } else if (i25 == 1342177280) {
                                        i18 = (byteBuffer.get() & 255) << 24;
                                        i19 = (byteBuffer.get() & 255) << 16;
                                        i20 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i25 != 1610612736) {
                                            throw new java.lang.IllegalStateException();
                                        }
                                        i21 = (byteBuffer.get() & 255) << 24;
                                        i22 = (byteBuffer.get() & 255) << 16;
                                        i23 = (byteBuffer.get() & 255) << 8;
                                        i24 = byteBuffer.get() & 255;
                                    }
                                    i11 = i21 | i22 | i23 | i24;
                                } else {
                                    i18 = (byteBuffer.get() & 255) << 8;
                                    i19 = (byteBuffer.get() & 255) << 16;
                                    i20 = (byteBuffer.get() & 255) << 24;
                                }
                                i11 = i18 | i19 | i20;
                            } else {
                                float fMax = java.lang.Math.max(-1.0f, java.lang.Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    fMax = -fMax;
                                    f11 = -2.14748365E9f;
                                } else {
                                    f11 = 2.14748365E9f;
                                }
                                i11 = (int) (fMax * f11);
                            }
                            i12 = (int) ((((long) i11) * ((long) i27)) / j6);
                            if (i25 != 2) {
                                if (i25 != 3) {
                                    if (i25 != 4) {
                                        if (i25 != 21) {
                                            i14 = i12 >> 8;
                                            i15 = i12 >> 16;
                                            i16 = i12 >> 24;
                                        } else if (i25 != 22) {
                                            if (i25 != 268435456) {
                                                i13 = i12 >> 16;
                                                i17 = i12 >> 24;
                                            } else if (i25 != 1342177280) {
                                                i13 = i12 >> 8;
                                                i17 = i12 >> 16;
                                                byteBufferOrder.put((byte) (i12 >> 24));
                                            } else {
                                                if (i25 == 1610612736) {
                                                    throw new java.lang.IllegalStateException();
                                                }
                                                byteBufferOrder.put((byte) (i12 >> 24));
                                                byteBufferOrder.put((byte) (i12 >> 16));
                                                byteBufferOrder.put((byte) (i12 >> 8));
                                                byteBufferOrder.put((byte) i12);
                                            }
                                            byteBufferOrder.put((byte) i17);
                                        } else {
                                            i14 = i12 >> 8;
                                            i15 = i12 >> 16;
                                            i16 = i12 >> 24;
                                            byteBufferOrder.put((byte) i12);
                                        }
                                        byteBufferOrder.put((byte) i14);
                                        byteBufferOrder.put((byte) i15);
                                        b6 = (byte) i16;
                                    } else {
                                        f6 = i12;
                                        if (i12 < 0) {
                                            f6 = -f6;
                                            f10 = -2.14748365E9f;
                                        } else {
                                            f10 = 2.14748365E9f;
                                        }
                                        byteBufferOrder.putFloat(f6 / f10);
                                    }
                                    if (byteBuffer.position() == iPosition + i26) {
                                        i27++;
                                        iPosition = byteBuffer.position();
                                    }
                                } else {
                                    i13 = i12 >> 24;
                                }
                                b6 = (byte) i13;
                            } else {
                                byteBufferOrder.put((byte) (i12 >> 16));
                                b6 = (byte) (i12 >> 24);
                            }
                            byteBufferOrder.put(b6);
                            if (byteBuffer.position() == iPosition + i26) {
                                i27++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i6 = (byteBuffer.get() & 255) << 16;
                            i10 = (byteBuffer.get() & 255) << 24;
                        }
                        i11 = i6 | i10;
                        i12 = (int) ((((long) i11) * ((long) i27)) / j6);
                        if (i25 != 2) {
                            if (i25 != 3) {
                                if (i25 != 4) {
                                    if (i25 != 21) {
                                        i14 = i12 >> 8;
                                        i15 = i12 >> 16;
                                        i16 = i12 >> 24;
                                    } else if (i25 != 22) {
                                        if (i25 != 268435456) {
                                            i13 = i12 >> 16;
                                            i17 = i12 >> 24;
                                        } else if (i25 != 1342177280) {
                                            i13 = i12 >> 8;
                                            i17 = i12 >> 16;
                                            byteBufferOrder.put((byte) (i12 >> 24));
                                        } else {
                                            if (i25 == 1610612736) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            byteBufferOrder.put((byte) (i12 >> 24));
                                            byteBufferOrder.put((byte) (i12 >> 16));
                                            byteBufferOrder.put((byte) (i12 >> 8));
                                            byteBufferOrder.put((byte) i12);
                                        }
                                        byteBufferOrder.put((byte) i17);
                                    } else {
                                        i14 = i12 >> 8;
                                        i15 = i12 >> 16;
                                        i16 = i12 >> 24;
                                        byteBufferOrder.put((byte) i12);
                                    }
                                    byteBufferOrder.put((byte) i14);
                                    byteBufferOrder.put((byte) i15);
                                    b6 = (byte) i16;
                                } else {
                                    f6 = i12;
                                    if (i12 < 0) {
                                        f6 = -f6;
                                        f10 = -2.14748365E9f;
                                    } else {
                                        f10 = 2.14748365E9f;
                                    }
                                    byteBufferOrder.putFloat(f6 / f10);
                                }
                                if (byteBuffer.position() == iPosition + i26) {
                                    i27++;
                                    iPosition = byteBuffer.position();
                                }
                            } else {
                                i13 = i12 >> 24;
                            }
                            b6 = (byte) i13;
                        } else {
                            byteBufferOrder.put((byte) (i12 >> 16));
                            b6 = (byte) (i12 >> 24);
                        }
                        byteBufferOrder.put(b6);
                        if (byteBuffer.position() == iPosition + i26) {
                            i27++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.f26956K = byteBuffer2;
        }
    }

    private final void W() {
        if (Z()) {
            this.f26989q.setVolume(this.f26953H);
        }
    }

    private final void X() {
        com.google.android.gms.internal.ads.C4956qt c4956qt = this.f26987o.f36622i;
        this.f26988p = c4956qt;
        c4956qt.c();
    }

    private final boolean Y() throws com.google.android.gms.internal.ads.QE0 {
        if (!this.f26988p.h()) {
            N(Long.MIN_VALUE);
            return this.f26956K == null;
        }
        this.f26988p.d();
        S(Long.MIN_VALUE);
        if (!this.f26988p.g()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer = this.f26956K;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean Z() {
        return this.f26989q != null;
    }

    private static boolean a0(android.media.AudioTrack audioTrack) {
        return com.google.android.gms.internal.ads.EW.f27061a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean b0() {
        com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = this.f26987o;
        if (c4122jF0.f36616c != 0) {
            return false;
        }
        int i6 = c4122jF0.f36614a.f26553F;
        return true;
    }

    private static final android.media.AudioTrack c0(com.google.android.gms.internal.ads.LE0 le0, com.google.android.gms.internal.ads.C5459vS c5459vS, int i6, com.google.android.gms.internal.ads.D d6) throws com.google.android.gms.internal.ads.NE0 {
        android.media.AudioTrack audioTrack;
        try {
            int i10 = com.google.android.gms.internal.ads.EW.f27061a;
            if (i10 >= 23) {
                android.media.AudioTrack.Builder sessionId = new android.media.AudioTrack.Builder().setAudioAttributes(c5459vS.a().f36750a).setAudioFormat(com.google.android.gms.internal.ads.EW.P(le0.f29442b, le0.f29443c, le0.f29441a)).setTransferMode(1).setBufferSizeInBytes(le0.f29445e).setSessionId(i6);
                if (i10 >= 29) {
                    sessionId.setOffloadedPlayback(le0.f29444d);
                }
                audioTrack = sessionId.build();
            } else {
                android.media.AudioAttributes audioAttributes = c5459vS.a().f36750a;
                int i11 = le0.f29442b;
                int i12 = le0.f29443c;
                int i13 = le0.f29441a;
                audioTrack = new android.media.AudioTrack(audioAttributes, com.google.android.gms.internal.ads.EW.P(i11, i12, i13), le0.f29445e, 1, i6);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (java.lang.Exception unused) {
            }
            throw new com.google.android.gms.internal.ads.NE0(state, le0.f29442b, le0.f29443c, le0.f29441a, d6, le0.f29444d, null);
        } catch (java.lang.IllegalArgumentException e6) {
            e = e6;
            throw new com.google.android.gms.internal.ads.NE0(0, le0.f29442b, le0.f29443c, le0.f29441a, d6, le0.f29444d, e);
        } catch (java.lang.UnsupportedOperationException e10) {
            e = e10;
            throw new com.google.android.gms.internal.ads.NE0(0, le0.f29442b, le0.f29443c, le0.f29441a, d6, le0.f29444d, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void A(int i6) {
        if (this.f26961P != i6) {
            this.f26961P = i6;
            e();
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void B(com.google.android.gms.internal.ads.C5459vS c5459vS) {
        if (this.f26993u.equals(c5459vS)) {
            return;
        }
        this.f26993u = c5459vS;
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f26991s;
        if (c4999rE0 != null) {
            c4999rE0.g(c5459vS);
        }
        e();
    }

    public final void G(com.google.android.gms.internal.ads.C4450mE0 c4450mE0) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.f26967V;
        if (looper == looperMyLooper) {
            if (c4450mE0.equals(this.f26990r)) {
                return;
            }
            this.f26990r = c4450mE0;
            com.google.android.gms.internal.ads.OE0 oe0 = this.f26985m;
            if (oe0 != null) {
                ((com.google.android.gms.internal.ads.IF0) oe0).f28431a.A();
                return;
            }
            return;
        }
        java.lang.String name = looper == null ? "null" : looper.getThread().getName();
        throw new java.lang.IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final boolean J() {
        if (Z()) {
            return this.f26957L && !V();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final long P(boolean z6) {
        long jI;
        if (!Z() || this.f26951F) {
            return Long.MIN_VALUE;
        }
        long jMin = java.lang.Math.min(this.f26978f.a(z6), com.google.android.gms.internal.ads.EW.L(K(), this.f26987o.f36618e));
        while (!this.f26979g.isEmpty() && jMin >= ((com.google.android.gms.internal.ads.C4342lF0) this.f26979g.getFirst()).f37129c) {
            this.f26995w = (com.google.android.gms.internal.ads.C4342lF0) this.f26979g.remove();
        }
        long j6 = jMin - this.f26995w.f37129c;
        if (this.f26979g.isEmpty()) {
            jI = this.f26995w.f37128b + this.f26971Z.a(j6);
        } else {
            com.google.android.gms.internal.ads.C4342lF0 c4342lF0 = (com.google.android.gms.internal.ads.C4342lF0) this.f26979g.getFirst();
            jI = c4342lF0.f37128b - com.google.android.gms.internal.ads.EW.I(c4342lF0.f37129c - jMin, this.f26995w.f37127a.f38296a);
        }
        long jB = this.f26971Z.b();
        long jL = jI + com.google.android.gms.internal.ads.EW.L(jB, this.f26987o.f36618e);
        long j10 = this.f26968W;
        if (jB > j10) {
            long jL2 = com.google.android.gms.internal.ads.EW.L(jB - j10, this.f26987o.f36618e);
            this.f26968W = jB;
            this.f26969X += jL2;
            if (this.f26970Y == null) {
                this.f26970Y = new android.os.Handler(android.os.Looper.myLooper());
            }
            this.f26970Y.removeCallbacksAndMessages(null);
            this.f26970Y.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.bF0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.EF0.D(this.f34259C);
                }
            }, 100L);
        }
        return jL;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final boolean V() {
        if (Z()) {
            return !(com.google.android.gms.internal.ads.EW.f27061a >= 29 && this.f26989q.isOffloadedPlayback() && this.f26959N) && this.f26978f.g(K());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final int a(com.google.android.gms.internal.ads.D d6) {
        Q();
        if (!"audio/raw".equals(d6.f26574o)) {
            return this.f26990r.b(d6, this.f26993u) != null ? 2 : 0;
        }
        boolean zJ = com.google.android.gms.internal.ads.EW.j(d6.f26553F);
        int i6 = d6.f26553F;
        if (zJ) {
            return i6 != 2 ? 1 : 2;
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultAudioSink", "Invalid PCM encoding: " + i6);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final com.google.android.gms.internal.ads.C4930qg c() {
        return this.f26996x;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void e() {
        com.google.android.gms.internal.ads.C5001rF0 c5001rF0;
        if (Z()) {
            this.f26998z = 0L;
            this.f26946A = 0L;
            this.f26947B = 0L;
            this.f26948C = 0L;
            this.f26966U = false;
            this.f26949D = 0;
            this.f26995w = new com.google.android.gms.internal.ads.C4342lF0(this.f26996x, 0L, 0L, null);
            this.f26952G = 0L;
            this.f26994v = null;
            this.f26979g.clear();
            this.f26954I = null;
            this.f26955J = 0;
            this.f26956K = null;
            this.f26958M = false;
            this.f26957L = false;
            this.f26959N = false;
            this.f26975c.p();
            X();
            if (this.f26978f.h()) {
                this.f26989q.pause();
            }
            if (a0(this.f26989q)) {
                com.google.android.gms.internal.ads.C5771yF0 c5771yF0 = this.f26980h;
                c5771yF0.getClass();
                c5771yF0.b(this.f26989q);
            }
            final com.google.android.gms.internal.ads.LE0 le0A = this.f26987o.a();
            com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = this.f26986n;
            if (c4122jF0 != null) {
                this.f26987o = c4122jF0;
                this.f26986n = null;
            }
            this.f26978f.c();
            if (com.google.android.gms.internal.ads.EW.f27061a >= 24 && (c5001rF0 = this.f26992t) != null) {
                c5001rF0.b();
                this.f26992t = null;
            }
            final android.media.AudioTrack audioTrack = this.f26989q;
            final com.google.android.gms.internal.ads.OE0 oe0 = this.f26985m;
            final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
            synchronized (f26943b0) {
                try {
                    if (f26944c0 == null) {
                        final java.lang.String str = "ExoPlayer:AudioTrackReleaseThread";
                        f26944c0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.dW

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ java.lang.String f34738a = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                                return new java.lang.Thread(runnable, this.f34738a);
                            }
                        });
                    }
                    f26945d0++;
                    f26944c0.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.aF0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.internal.ads.EF0.F(audioTrack, oe0, handler, le0A);
                        }
                    }, 20L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            this.f26989q = null;
        }
        this.f26982j.a();
        this.f26981i.a();
        this.f26968W = 0L;
        this.f26969X = 0L;
        android.os.Handler handler2 = this.f26970Y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void f(int i6, int i10) {
        android.media.AudioTrack audioTrack = this.f26989q;
        if (audioTrack != null) {
            a0(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void g() {
        this.f26960O = false;
        if (Z()) {
            if (this.f26978f.k() || a0(this.f26989q)) {
                this.f26989q.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void h() {
        this.f26960O = true;
        if (Z()) {
            this.f26978f.f();
            this.f26989q.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void i() {
        this.f26950E = true;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void j() {
        if (!this.f26957L && Z() && Y()) {
            R();
            this.f26957L = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void k() {
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f26991s;
        if (c4999rE0 != null) {
            c4999rE0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void l() {
        e();
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = this.f26976d;
        int size = abstractC3398ci0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((com.google.android.gms.internal.ads.InterfaceC2954Vu) abstractC3398ci0.get(i6)).e();
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci1 = this.f26977e;
        int size2 = abstractC3398ci1.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((com.google.android.gms.internal.ads.InterfaceC2954Vu) abstractC3398ci1.get(i10)).e();
        }
        com.google.android.gms.internal.ads.C4956qt c4956qt = this.f26988p;
        if (c4956qt != null) {
            c4956qt.f();
        }
        this.f26960O = false;
        this.f26965T = false;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void o(boolean z6) {
        this.f26997y = z6;
        T(this.f26996x);
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final boolean p(com.google.android.gms.internal.ads.D d6) {
        return a(d6) != 0;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void q(float f6) {
        if (this.f26953H != f6) {
            this.f26953H = f6;
            W();
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void r(com.google.android.gms.internal.ads.C4930qg c4930qg) {
        this.f26996x = new com.google.android.gms.internal.ads.C4930qg(java.lang.Math.max(0.1f, java.lang.Math.min(c4930qg.f38296a, 8.0f)), java.lang.Math.max(0.1f, java.lang.Math.min(c4930qg.f38297b, 8.0f)));
        T(c4930qg);
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void s(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.f26963R = audioDeviceInfo == null ? null : new com.google.android.gms.internal.ads.C5109sE0(audioDeviceInfo);
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f26991s;
        if (c4999rE0 != null) {
            c4999rE0.h(audioDeviceInfo);
        }
        android.media.AudioTrack audioTrack = this.f26989q;
        if (audioTrack != null) {
            com.google.android.gms.internal.ads.AbstractC3574eF0.a(audioTrack, this.f26963R);
        }
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void t(com.google.android.gms.internal.ads.C3118a60 c3118a60) {
        if (this.f26962Q.equals(c3118a60)) {
            return;
        }
        if (this.f26989q != null) {
            int i6 = this.f26962Q.f34011a;
        }
        this.f26962Q = c3118a60;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void u(com.google.android.gms.internal.ads.OE0 oe0) {
        this.f26985m = oe0;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final com.google.android.gms.internal.ads.C5439vE0 v(com.google.android.gms.internal.ads.D d6) {
        return this.f26965T ? com.google.android.gms.internal.ads.C5439vE0.f39363d : this.f26973a0.a(d6, this.f26993u);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x026d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0272  */
    /* JADX WARN: Code duplicated, block: B:141:0x027e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0289  */
    /* JADX WARN: Code duplicated, block: B:146:0x0292  */
    /* JADX WARN: Code duplicated, block: B:147:0x0296  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:156:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:219:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.RE0
    public final boolean w(java.nio.ByteBuffer byteBuffer, long j6, int i6) throws com.google.android.gms.internal.ads.QE0, com.google.android.gms.internal.ads.NE0 {
        android.media.AudioTrack audioTrackL;
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0;
        com.google.android.gms.internal.ads.C3244bE0 c3244bE0;
        boolean z6;
        int iB;
        int iPosition;
        byte b6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        java.nio.ByteBuffer byteBuffer2 = this.f26954I;
        com.google.android.gms.internal.ads.LC.d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f26986n != null) {
            if (!Y()) {
                return false;
            }
            com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = this.f26986n;
            com.google.android.gms.internal.ads.C4122jF0 c4122jF1 = this.f26987o;
            if (c4122jF1.f36616c == c4122jF0.f36616c && c4122jF1.f36620g == c4122jF0.f36620g && c4122jF1.f36618e == c4122jF0.f36618e && c4122jF1.f36619f == c4122jF0.f36619f && c4122jF1.f36617d == c4122jF0.f36617d) {
                this.f26987o = c4122jF0;
                this.f26986n = null;
                android.media.AudioTrack audioTrack = this.f26989q;
                if (audioTrack != null && a0(audioTrack)) {
                    boolean z10 = this.f26987o.f36624k;
                }
            } else {
                R();
                if (V()) {
                    return false;
                }
                e();
            }
            M(j6);
        }
        if (!Z()) {
            try {
                if (this.f26981i.c()) {
                    return false;
                }
                try {
                    com.google.android.gms.internal.ads.C4122jF0 c4122jF2 = this.f26987o;
                    if (c4122jF2 == null) {
                        throw null;
                    }
                    audioTrackL = L(c4122jF2);
                    this.f26989q = audioTrackL;
                    if (a0(audioTrackL)) {
                        android.media.AudioTrack audioTrack2 = this.f26989q;
                        if (this.f26980h == null) {
                            this.f26980h = new com.google.android.gms.internal.ads.C5771yF0(this);
                        }
                        this.f26980h.a(audioTrack2);
                        boolean z11 = this.f26987o.f36624k;
                    }
                    int i16 = com.google.android.gms.internal.ads.EW.f27061a;
                    if (i16 >= 31 && (c3244bE0 = this.f26984l) != null) {
                        android.media.AudioTrack audioTrack3 = this.f26989q;
                        android.media.metrics.LogSessionId logSessionIdA = c3244bE0.a();
                        if (!logSessionIdA.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                            audioTrack3.setLogSessionId(logSessionIdA);
                        }
                    }
                    this.f26961P = this.f26989q.getAudioSessionId();
                    com.google.android.gms.internal.ads.VE0 ve0 = this.f26978f;
                    android.media.AudioTrack audioTrack4 = this.f26989q;
                    com.google.android.gms.internal.ads.C4122jF0 c4122jF3 = this.f26987o;
                    ve0.d(audioTrack4, c4122jF3.f36616c == 2, c4122jF3.f36620g, c4122jF3.f36617d, c4122jF3.f36621h);
                    W();
                    int i17 = this.f26962Q.f34011a;
                    com.google.android.gms.internal.ads.C5109sE0 c5109sE0 = this.f26963R;
                    if (c5109sE0 != null && i16 >= 23) {
                        com.google.android.gms.internal.ads.AbstractC3574eF0.a(this.f26989q, c5109sE0);
                        com.google.android.gms.internal.ads.C4999rE0 c4999rE1 = this.f26991s;
                        if (c4999rE1 != null) {
                            c4999rE1.h(this.f26963R.f38705a);
                        }
                    }
                    if (i16 >= 24 && (c4999rE0 = this.f26991s) != null) {
                        this.f26992t = new com.google.android.gms.internal.ads.C5001rF0(this.f26989q, c4999rE0);
                    }
                    this.f26951F = true;
                    com.google.android.gms.internal.ads.OE0 oe0 = this.f26985m;
                    if (oe0 != null) {
                        ((com.google.android.gms.internal.ads.IF0) oe0).f28431a.f28861A0.c(this.f26987o.a());
                    }
                } catch (com.google.android.gms.internal.ads.NE0 e6) {
                    com.google.android.gms.internal.ads.C4122jF0 c4122jF4 = this.f26987o;
                    if (c4122jF4.f36621h > 1000000) {
                        com.google.android.gms.internal.ads.C4122jF0 c4122jF5 = new com.google.android.gms.internal.ads.C4122jF0(c4122jF4.f36614a, c4122jF4.f36615b, c4122jF4.f36616c, c4122jF4.f36617d, c4122jF4.f36618e, c4122jF4.f36619f, c4122jF4.f36620g, 1000000, c4122jF4.f36622i, false, false, false);
                        try {
                            audioTrackL = L(c4122jF5);
                            this.f26987o = c4122jF5;
                        } catch (com.google.android.gms.internal.ads.NE0 e10) {
                            e6.addSuppressed(e10);
                            O();
                            throw e6;
                        }
                    }
                    O();
                    throw e6;
                }
            } catch (com.google.android.gms.internal.ads.NE0 e11) {
                if (e11.f30204D) {
                    throw e11;
                }
                this.f26981i.b(e11);
                return false;
            }
        }
        this.f26981i.a();
        if (this.f26951F) {
            this.f26952G = java.lang.Math.max(0L, j6);
            this.f26950E = false;
            this.f26951F = false;
            M(j6);
            if (this.f26960O) {
                h();
            }
        }
        if (!this.f26978f.j(K())) {
            return false;
        }
        if (this.f26954I == null) {
            com.google.android.gms.internal.ads.LC.d(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            com.google.android.gms.internal.ads.C4122jF0 c4122jF6 = this.f26987o;
            if (c4122jF6.f36616c != 0 && this.f26949D == 0) {
                int i18 = c4122jF6.f36620g;
                if (i18 == 20) {
                    z6 = true;
                    iB = com.google.android.gms.internal.ads.P0.b(byteBuffer);
                } else if (i18 != 30) {
                    switch (i18) {
                        case 5:
                        case 6:
                            iB = com.google.android.gms.internal.ads.S.a(byteBuffer);
                            z6 = true;
                            break;
                        case 7:
                        case 8:
                            int i19 = com.google.android.gms.internal.ads.AbstractC5080s0.f38609j;
                            if (byteBuffer.getInt(0) == -233094848) {
                                z6 = true;
                                iB = 1024;
                            } else {
                                if (byteBuffer.getInt(0) == -398277519) {
                                    iB = 1024;
                                } else if (byteBuffer.getInt(0) != 622876772) {
                                    iPosition = byteBuffer.position();
                                    b6 = byteBuffer.get(iPosition);
                                    if (b6 != -2) {
                                        if (b6 != -1) {
                                            if (b6 != 31) {
                                                i12 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i14 = byteBuffer.get(iPosition + 5) & 252;
                                                i11 = 2;
                                            } else {
                                                i11 = 2;
                                                i12 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                i13 = iPosition + 6;
                                            }
                                            i10 = (i14 >> i11) | i12;
                                            z6 = true;
                                        } else {
                                            i11 = 2;
                                            i12 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            i13 = iPosition + 7;
                                        }
                                        i14 = byteBuffer.get(i13) & 60;
                                        i10 = (i14 >> i11) | i12;
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                        i10 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iB = (i10 + (z6 ? 1 : 0)) * 32;
                                } else {
                                    iB = 4096;
                                }
                                z6 = true;
                            }
                            break;
                        case 9:
                            iB = com.google.android.gms.internal.ads.N0.c(com.google.android.gms.internal.ads.EW.B(byteBuffer, byteBuffer.position()));
                            if (iB == -1) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            z6 = true;
                            break;
                        case 10:
                            iB = 1024;
                            z6 = true;
                            break;
                        case 11:
                        case 12:
                            iB = 2048;
                            z6 = true;
                            break;
                        default:
                            switch (i18) {
                                case 14:
                                    int i20 = com.google.android.gms.internal.ads.S.f31513g;
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i21 = iPosition2;
                                    while (true) {
                                        if (i21 > iLimit) {
                                            i15 = -1;
                                        } else if ((com.google.android.gms.internal.ads.EW.B(byteBuffer, i21 + 4) & (-2)) == -126718022) {
                                            i15 = i21 - iPosition2;
                                        } else {
                                            i21++;
                                        }
                                    }
                                    if (i15 != -1) {
                                        iB = (40 << ((byteBuffer.get((byteBuffer.position() + i15) + ((byteBuffer.get((byteBuffer.position() + i15) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    } else {
                                        iB = 0;
                                    }
                                    break;
                                case 15:
                                    iB = 512;
                                    break;
                                case 16:
                                    iB = 1024;
                                    break;
                                case 17:
                                    int i22 = com.google.android.gms.internal.ads.V.f32322b;
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iB = com.google.android.gms.internal.ads.V.a(new com.google.android.gms.internal.ads.RQ(bArr, 16)).f31829c;
                                    break;
                                case 18:
                                    iB = com.google.android.gms.internal.ads.S.a(byteBuffer);
                                    break;
                                default:
                                    throw new java.lang.IllegalStateException("Unexpected audio encoding: " + i18);
                            }
                            z6 = true;
                            break;
                    }
                } else {
                    int i110 = com.google.android.gms.internal.ads.AbstractC5080s0.f38609j;
                    if (byteBuffer.getInt(0) == -233094848) {
                        if (byteBuffer.getInt(0) == -398277519) {
                            iB = 1024;
                        } else if (byteBuffer.getInt(0) != 622876772) {
                            iB = 4096;
                        } else {
                            iPosition = byteBuffer.position();
                            b6 = byteBuffer.get(iPosition);
                            if (b6 != -2) {
                                if (b6 != -1) {
                                    if (b6 != 31) {
                                        i12 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                        i14 = byteBuffer.get(iPosition + 5) & 252;
                                        i11 = 2;
                                    } else {
                                        i11 = 2;
                                        i12 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                        i13 = iPosition + 6;
                                    }
                                    i10 = (i14 >> i11) | i12;
                                    z6 = true;
                                } else {
                                    i11 = 2;
                                    i12 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                    i13 = iPosition + 7;
                                }
                                i14 = byteBuffer.get(i13) & 60;
                                i10 = (i14 >> i11) | i12;
                                z6 = true;
                            } else {
                                z6 = true;
                                i10 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                            }
                            iB = (i10 + (z6 ? 1 : 0)) * 32;
                        }
                        z6 = true;
                    } else {
                        z6 = true;
                        iB = 1024;
                    }
                }
                this.f26949D = iB;
                if (iB == 0) {
                    return z6;
                }
            }
            if (this.f26994v != null) {
                if (!Y()) {
                    return false;
                }
                M(j6);
                this.f26994v = null;
            }
            long jL = this.f26952G + com.google.android.gms.internal.ads.EW.L(I() - this.f26975c.o(), this.f26987o.f36614a.f26552E);
            if (!this.f26950E && java.lang.Math.abs(jL - j6) > 200000) {
                com.google.android.gms.internal.ads.OE0 oe1 = this.f26985m;
                if (oe1 != null) {
                    oe1.a(new com.google.android.gms.internal.ads.PE0(j6, jL));
                }
                this.f26950E = true;
            }
            if (this.f26950E) {
                if (!Y()) {
                    return false;
                }
                long j10 = j6 - jL;
                this.f26952G += j10;
                this.f26950E = false;
                M(j6);
                com.google.android.gms.internal.ads.OE0 oe2 = this.f26985m;
                if (oe2 != null && j10 != 0) {
                    ((com.google.android.gms.internal.ads.IF0) oe2).f28431a.R0();
                }
            }
            if (this.f26987o.f36616c == 0) {
                this.f26998z += (long) byteBuffer.remaining();
            } else {
                this.f26946A += ((long) this.f26949D) * ((long) i6);
            }
            this.f26954I = byteBuffer;
            this.f26955J = i6;
        }
        S(j6);
        if (!this.f26954I.hasRemaining()) {
            this.f26954I = null;
            this.f26955J = 0;
            return true;
        }
        if (!this.f26978f.i(K())) {
            return false;
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultAudioSink", "Resetting stalled audio track");
        e();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void x(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        this.f26984l = c3244bE0;
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void y(com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        this.f26978f.e(interfaceC4447mD);
    }

    @Override // com.google.android.gms.internal.ads.RE0
    public final void z(com.google.android.gms.internal.ads.D d6, int i6, int[] iArr) throws com.google.android.gms.internal.ads.ME0 {
        int iIntValue;
        com.google.android.gms.internal.ads.C4956qt c4956qt;
        int iC;
        int iIntValue2;
        int iC2;
        int i10;
        int i11;
        int iMax;
        Q();
        if ("audio/raw".equals(d6.f26574o)) {
            com.google.android.gms.internal.ads.LC.d(com.google.android.gms.internal.ads.EW.j(d6.f26553F));
            iC = com.google.android.gms.internal.ads.EW.C(d6.f26553F) * d6.f26551D;
            com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
            c3083Zh0.i(this.f26976d);
            c3083Zh0.h(this.f26971Z.e());
            com.google.android.gms.internal.ads.C4956qt c4956qt2 = new com.google.android.gms.internal.ads.C4956qt(c3083Zh0.j());
            if (c4956qt2.equals(this.f26988p)) {
                c4956qt2 = this.f26988p;
            }
            this.f26975c.q(d6.f26554G, d6.f26555H);
            this.f26974b.o(iArr);
            try {
                com.google.android.gms.internal.ads.C2809Rt c2809RtA = c4956qt2.a(new com.google.android.gms.internal.ads.C2809Rt(d6.f26552E, d6.f26551D, d6.f26553F));
                iIntValue = c2809RtA.f31386c;
                i10 = c2809RtA.f31384a;
                int i12 = c2809RtA.f31385b;
                iIntValue2 = com.google.android.gms.internal.ads.EW.A(i12);
                c4956qt = c4956qt2;
                iC2 = com.google.android.gms.internal.ads.EW.C(iIntValue) * i12;
                i11 = 0;
            } catch (com.google.android.gms.internal.ads.C5397uu e6) {
                throw new com.google.android.gms.internal.ads.ME0(e6, d6);
            }
        } else {
            com.google.android.gms.internal.ads.C4956qt c4956qt3 = new com.google.android.gms.internal.ads.C4956qt(com.google.android.gms.internal.ads.AbstractC3398ci0.O());
            int i13 = d6.f26552E;
            com.google.android.gms.internal.ads.C5439vE0 c5439vE0 = com.google.android.gms.internal.ads.C5439vE0.f39363d;
            android.util.Pair pairB = this.f26990r.b(d6, this.f26993u);
            if (pairB == null) {
                throw new com.google.android.gms.internal.ads.ME0("Unable to configure passthrough for: ".concat(java.lang.String.valueOf(d6)), d6);
            }
            iIntValue = ((java.lang.Integer) pairB.first).intValue();
            c4956qt = c4956qt3;
            iC = -1;
            iIntValue2 = ((java.lang.Integer) pairB.second).intValue();
            iC2 = -1;
            i10 = i13;
            i11 = 2;
        }
        if (iIntValue == 0) {
            throw new com.google.android.gms.internal.ads.ME0("Invalid output encoding (mode=" + i11 + ") for: " + java.lang.String.valueOf(d6), d6);
        }
        if (iIntValue2 == 0) {
            throw new com.google.android.gms.internal.ads.ME0("Invalid output channel config (mode=" + i11 + ") for: " + java.lang.String.valueOf(d6), d6);
        }
        int i14 = d6.f26569j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(d6.f26574o) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        com.google.android.gms.internal.ads.LC.f(minBufferSize != -2);
        int i15 = iC2 != -1 ? iC2 : 1;
        int i16 = 250000;
        if (i11 == 0) {
            iMax = java.lang.Math.max(com.google.android.gms.internal.ads.GF0.a(250000, i10, i15), java.lang.Math.min(minBufferSize * 4, com.google.android.gms.internal.ads.GF0.a(750000, i10, i15)));
        } else if (i11 != 1) {
            if (iIntValue == 5) {
                i16 = 500000;
            } else if (iIntValue == 8) {
                i16 = 1000000;
                iIntValue = 8;
            }
            iMax = com.google.android.gms.internal.ads.AbstractC2466Ij0.b((((long) i16) * ((long) (i14 != -1 ? com.google.android.gms.internal.ads.AbstractC2207Bj0.b(i14, 8, java.math.RoundingMode.CEILING) : com.google.android.gms.internal.ads.GF0.b(iIntValue)))) / 1000000);
        } else {
            iMax = com.google.android.gms.internal.ads.AbstractC2466Ij0.b((((long) com.google.android.gms.internal.ads.GF0.b(iIntValue)) * 50000000) / 1000000);
        }
        int i17 = iIntValue;
        int iMax2 = (((java.lang.Math.max(minBufferSize, iMax) + i15) - 1) / i15) * i15;
        this.f26965T = false;
        com.google.android.gms.internal.ads.C4122jF0 c4122jF0 = new com.google.android.gms.internal.ads.C4122jF0(d6, iC, i11, iC2, i10, iIntValue2, i17, iMax2, c4956qt, false, false, false);
        if (Z()) {
            this.f26986n = c4122jF0;
        } else {
            this.f26987o = c4122jF0;
        }
    }
}
