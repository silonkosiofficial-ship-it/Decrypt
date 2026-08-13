package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class VE0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f32443A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f32444B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f32445C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f32446D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f32447E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f32448F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f32449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f32450H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4447mD f32451I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UE0 f32452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f32453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.media.AudioTrack f32454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.TE0 f32456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f32460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f32463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.lang.reflect.Method f32464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f32465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f32467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f32468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f32469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f32470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f32471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f32472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f32474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f32475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f32476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f32477z;

    public VE0(com.google.android.gms.internal.ads.UE0 ue0) {
        this.f32452a = ue0;
        try {
            this.f32464m = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        this.f32453b = new long[10];
        this.f32451I = com.google.android.gms.internal.ads.InterfaceC4447mD.f37298a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    private final long l() {
        long jB = this.f32451I.b();
        int i6 = 2;
        if (this.f32475x != -9223372036854775807L) {
            android.media.AudioTrack audioTrack = this.f32454c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f32477z;
            }
            return java.lang.Math.min(this.f32443A, this.f32477z + com.google.android.gms.internal.ads.EW.H(com.google.android.gms.internal.ads.EW.I(com.google.android.gms.internal.ads.EW.K(jB) - this.f32475x, this.f32460i), this.f32457f));
        }
        if (jB - this.f32469r >= 5) {
            android.media.AudioTrack audioTrack2 = this.f32454c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                long j6 = 0;
                if (this.f32458g) {
                    if (playState != 2) {
                        i6 = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.f32472u = this.f32470s;
                    }
                    playbackHeadPosition += this.f32472u;
                    playState = i6;
                }
                if (com.google.android.gms.internal.ads.EW.f27061a > 29) {
                    if (this.f32470s > playbackHeadPosition) {
                        this.f32471t++;
                    }
                    this.f32470s = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j6 = playbackHeadPosition;
                    } else if (this.f32470s > 0 && playState == 3) {
                        if (this.f32476y == -9223372036854775807L) {
                            this.f32476y = jB;
                        }
                    }
                    this.f32476y = -9223372036854775807L;
                    playbackHeadPosition = j6;
                    if (this.f32470s > playbackHeadPosition) {
                        this.f32471t++;
                    }
                    this.f32470s = playbackHeadPosition;
                }
            }
            this.f32469r = jB;
        }
        return this.f32470s + this.f32450H + (this.f32471t << 32);
    }

    private final long m() {
        return com.google.android.gms.internal.ads.EW.L(l(), this.f32457f);
    }

    private final void n() {
        this.f32462k = 0L;
        this.f32474w = 0;
        this.f32473v = 0;
        this.f32463l = 0L;
        this.f32445C = 0L;
        this.f32448F = 0L;
        this.f32461j = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:36:0x00c9, B:38:0x00cd, B:40:0x00ea, B:41:0x00f2), top: B:67:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:36:0x00c9, B:38:0x00cd, B:40:0x00ea, B:41:0x00f2), top: B:67:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f3, blocks: (B:36:0x00c9, B:38:0x00cd, B:40:0x00ea, B:41:0x00f2), top: B:67:0x00c9 }] */
    public final long a(boolean z6) {
        long jMax;
        com.google.android.gms.internal.ads.TE0 te0;
        java.lang.reflect.Method method;
        android.media.AudioTrack audioTrack;
        long jMax2;
        long jB;
        long jA;
        long jM;
        com.google.android.gms.internal.ads.TE0 te1;
        android.media.AudioTrack audioTrack2 = this.f32454c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jC = this.f32451I.c() / 1000;
            if (jC - this.f32463l >= 30000) {
                long jM2 = m();
                if (jM2 != 0) {
                    this.f32453b[this.f32473v] = com.google.android.gms.internal.ads.EW.J(jM2, this.f32460i) - jC;
                    this.f32473v = (this.f32473v + 1) % 10;
                    int i6 = this.f32474w;
                    if (i6 < 10) {
                        this.f32474w = i6 + 1;
                    }
                    this.f32463l = jC;
                    this.f32462k = 0L;
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f32474w;
                        if (i10 >= i11) {
                            break;
                        }
                        this.f32462k += this.f32453b[i10] / ((long) i11);
                        i10++;
                    }
                    if (!this.f32458g) {
                        te0 = this.f32456e;
                        te0.getClass();
                        if (te0.g(jC)) {
                            jB = te0.b();
                            jA = te0.a();
                            jM = m();
                            if (java.lang.Math.abs(jB - jC) > 5000000) {
                                te1 = te0;
                                this.f32452a.k(jA, jB, jC, jM);
                            } else {
                                te1 = te0;
                                if (java.lang.Math.abs(com.google.android.gms.internal.ads.EW.L(jA, this.f32457f) - jM) > 5000000) {
                                    this.f32452a.j(jA, jB, jC, jM);
                                } else {
                                    te1.c();
                                }
                            }
                            te1.d();
                        }
                        if (this.f32467p && (method = this.f32464m) != null && jC - this.f32468q >= 500000) {
                            try {
                                audioTrack = this.f32454c;
                                if (audioTrack != null) {
                                    throw null;
                                }
                                java.lang.Integer num = (java.lang.Integer) method.invoke(audioTrack, null);
                                int i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f32459h;
                                this.f32465n = jIntValue;
                                jMax2 = java.lang.Math.max(jIntValue, 0L);
                                this.f32465n = jMax2;
                                if (jMax2 > 5000000) {
                                    this.f32452a.b(jMax2);
                                    this.f32465n = 0L;
                                }
                                this.f32468q = jC;
                            } catch (java.lang.Exception unused) {
                                this.f32464m = null;
                            }
                        }
                    }
                }
            } else if (!this.f32458g) {
                te0 = this.f32456e;
                te0.getClass();
                if (te0.g(jC)) {
                    jB = te0.b();
                    jA = te0.a();
                    jM = m();
                    if (java.lang.Math.abs(jB - jC) > 5000000) {
                        te1 = te0;
                        this.f32452a.k(jA, jB, jC, jM);
                    } else {
                        te1 = te0;
                        if (java.lang.Math.abs(com.google.android.gms.internal.ads.EW.L(jA, this.f32457f) - jM) > 5000000) {
                            this.f32452a.j(jA, jB, jC, jM);
                        } else {
                            te1.c();
                        }
                    }
                    te1.d();
                }
                if (this.f32467p) {
                    audioTrack = this.f32454c;
                    if (audioTrack != null) {
                        throw null;
                    }
                    java.lang.Integer num2 = (java.lang.Integer) method.invoke(audioTrack, null);
                    int i13 = com.google.android.gms.internal.ads.EW.f27061a;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f32459h;
                    this.f32465n = jIntValue2;
                    jMax2 = java.lang.Math.max(jIntValue2, 0L);
                    this.f32465n = jMax2;
                    if (jMax2 > 5000000) {
                        this.f32452a.b(jMax2);
                        this.f32465n = 0L;
                    }
                    this.f32468q = jC;
                }
            }
        }
        long jC2 = this.f32451I.c() / 1000;
        com.google.android.gms.internal.ads.TE0 te2 = this.f32456e;
        te2.getClass();
        boolean zF = te2.f();
        if (zF) {
            jMax = com.google.android.gms.internal.ads.EW.L(te2.a(), this.f32457f) + com.google.android.gms.internal.ads.EW.I(jC2 - te2.b(), this.f32460i);
        } else {
            long jM3 = this.f32474w == 0 ? m() : com.google.android.gms.internal.ads.EW.I(this.f32462k + jC2, this.f32460i);
            jMax = !z6 ? java.lang.Math.max(0L, jM3 - this.f32465n) : jM3;
        }
        if (this.f32446D != zF) {
            this.f32448F = this.f32445C;
            this.f32447E = this.f32444B;
        }
        long j6 = jC2 - this.f32448F;
        if (j6 < 1000000) {
            long jI = this.f32447E + com.google.android.gms.internal.ads.EW.I(j6, this.f32460i);
            long j10 = (j6 * 1000) / 1000000;
            jMax = ((jMax * j10) + ((1000 - j10) * jI)) / 1000;
        }
        if (!this.f32461j) {
            long j11 = this.f32444B;
            if (jMax > j11) {
                this.f32461j = true;
                int i14 = com.google.android.gms.internal.ads.EW.f27061a;
                this.f32452a.a(this.f32451I.a() - com.google.android.gms.internal.ads.EW.N(com.google.android.gms.internal.ads.EW.J(com.google.android.gms.internal.ads.EW.N(jMax - j11), this.f32460i)));
            }
        }
        this.f32445C = jC2;
        this.f32444B = jMax;
        this.f32446D = zF;
        return jMax;
    }

    public final void b(long j6) {
        this.f32477z = l();
        this.f32475x = com.google.android.gms.internal.ads.EW.K(this.f32451I.b());
        this.f32443A = j6;
    }

    public final void c() {
        n();
        this.f32454c = null;
        this.f32456e = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final void d(android.media.AudioTrack audioTrack, boolean z6, int i6, int i10, int i11) {
        boolean z10;
        this.f32454c = audioTrack;
        this.f32455d = i11;
        this.f32456e = new com.google.android.gms.internal.ads.TE0(audioTrack);
        this.f32457f = audioTrack.getSampleRate();
        if (!z6 || com.google.android.gms.internal.ads.EW.f27061a >= 23) {
            z10 = false;
        } else {
            z10 = true;
            if (i6 != 5) {
                if (i6 == 6) {
                    i6 = 6;
                } else {
                    z10 = false;
                }
            }
        }
        this.f32458g = z10;
        boolean zJ = com.google.android.gms.internal.ads.EW.j(i6);
        this.f32467p = zJ;
        this.f32459h = zJ ? com.google.android.gms.internal.ads.EW.L(i11 / i10, this.f32457f) : -9223372036854775807L;
        this.f32470s = 0L;
        this.f32471t = 0L;
        this.f32449G = false;
        this.f32450H = 0L;
        this.f32472u = 0L;
        this.f32466o = false;
        this.f32475x = -9223372036854775807L;
        this.f32476y = -9223372036854775807L;
        this.f32468q = 0L;
        this.f32465n = 0L;
        this.f32460i = 1.0f;
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        this.f32451I = interfaceC4447mD;
    }

    public final void f() {
        if (this.f32475x != -9223372036854775807L) {
            this.f32475x = com.google.android.gms.internal.ads.EW.K(this.f32451I.b());
        }
        com.google.android.gms.internal.ads.TE0 te0 = this.f32456e;
        te0.getClass();
        te0.e();
    }

    public final boolean g(long j6) {
        if (j6 > com.google.android.gms.internal.ads.EW.H(a(false), this.f32457f)) {
            return true;
        }
        if (this.f32458g) {
            android.media.AudioTrack audioTrack = this.f32454c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && l() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        android.media.AudioTrack audioTrack = this.f32454c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j6) {
        return this.f32476y != -9223372036854775807L && j6 > 0 && this.f32451I.b() - this.f32476y >= 200;
    }

    public final boolean j(long j6) {
        android.media.AudioTrack audioTrack = this.f32454c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f32458g) {
            if (playState == 2) {
                this.f32466o = false;
                return false;
            }
            if (playState == 1) {
                if (l() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z6 = this.f32466o;
        boolean zG = g(j6);
        this.f32466o = zG;
        if (z6 && !zG && playState != 1) {
            this.f32452a.i(this.f32455d, com.google.android.gms.internal.ads.EW.N(this.f32459h));
        }
        return true;
    }

    public final boolean k() {
        n();
        if (this.f32475x != -9223372036854775807L) {
            this.f32477z = l();
            return false;
        }
        com.google.android.gms.internal.ads.TE0 te0 = this.f32456e;
        te0.getClass();
        te0.e();
        return true;
    }
}
