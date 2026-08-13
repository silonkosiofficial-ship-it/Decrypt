package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KF0 extends com.google.android.gms.internal.ads.NG0 implements com.google.android.gms.internal.ads.InterfaceC3128aB0 {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.JE0 f28861A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RE0 f28862B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5113sG0 f28863C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f28864D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private boolean f28865E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private boolean f28866F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f28867G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f28868H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private long f28869I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f28870J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private boolean f28871K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private boolean f28872L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f28873M0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final android.content.Context f28874z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KF0(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC5443vG0 interfaceC5443vG0, com.google.android.gms.internal.ads.PG0 pg0, boolean z6, android.os.Handler handler, com.google.android.gms.internal.ads.KE0 ke0, com.google.android.gms.internal.ads.RE0 re0) {
        super(1, interfaceC5443vG0, pg0, false, 44100.0f);
        com.google.android.gms.internal.ads.JF0 jf0 = null;
        com.google.android.gms.internal.ads.C5113sG0 c5113sG0 = com.google.android.gms.internal.ads.EW.f27061a >= 35 ? new com.google.android.gms.internal.ads.C5113sG0(com.google.android.gms.internal.ads.InterfaceC5003rG0.f38474a) : null;
        this.f28874z0 = context.getApplicationContext();
        this.f28862B0 = re0;
        this.f28863C0 = c5113sG0;
        this.f28873M0 = -1000;
        this.f28861A0 = new com.google.android.gms.internal.ads.JE0(handler, ke0);
        re0.u(new com.google.android.gms.internal.ads.IF0(this, jf0));
    }

    private final int c1(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6) {
        int i6;
        if (!"OMX.google.raw.decoder".equals(ag0.f25094a) || (i6 = com.google.android.gms.internal.ads.EW.f27061a) >= 24 || (i6 == 23 && com.google.android.gms.internal.ads.EW.m(this.f28874z0))) {
            return d6.f26575p;
        }
        return -1;
    }

    private static java.util.List d1(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6, boolean z6, com.google.android.gms.internal.ads.RE0 re0) {
        com.google.android.gms.internal.ads.AG0 ag0A;
        if (d6.f26574o == null) {
            return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        }
        return (!re0.p(d6) || (ag0A = com.google.android.gms.internal.ads.AbstractC3688fH0.a()) == null) ? com.google.android.gms.internal.ads.AbstractC3688fH0.e(pg0, d6, false, false) : com.google.android.gms.internal.ads.AbstractC3398ci0.P(ag0A);
    }

    private final void x0() {
        long jP = this.f28862B0.P(g());
        if (jP != Long.MIN_VALUE) {
            if (!this.f28870J0) {
                jP = java.lang.Math.max(this.f28869I0, jP);
            }
            this.f28869I0 = jP;
            this.f28870J0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void B() {
        this.f28872L0 = false;
        try {
            super.B();
            if (this.f28871K0) {
            }
        } finally {
            if (this.f28871K0) {
                this.f28871K0 = false;
                this.f28862B0.l();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Fz0
    protected final void C() {
        this.f28862B0.h();
    }

    @Override // com.google.android.gms.internal.ads.Fz0
    protected final void D() {
        x0();
        this.f28862B0.g();
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final int D0(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6) {
        int i6;
        boolean z6;
        if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(d6.f26574o)) {
            return 128;
        }
        int i10 = d6.f26558K;
        boolean zU0 = com.google.android.gms.internal.ads.NG0.u0(d6);
        int i11 = 1;
        if (!zU0 || (i10 != 0 && com.google.android.gms.internal.ads.AbstractC3688fH0.a() == null)) {
            i6 = 0;
        } else {
            com.google.android.gms.internal.ads.C5439vE0 c5439vE0V = this.f28862B0.v(d6);
            if (c5439vE0V.f39364a) {
                i6 = true != c5439vE0V.f39365b ? 512 : 1536;
                if (c5439vE0V.f39366c) {
                    i6 |= 2048;
                }
            } else {
                i6 = 0;
            }
            if (this.f28862B0.p(d6)) {
                return i6 | 172;
            }
        }
        if ((!"audio/raw".equals(d6.f26574o) || this.f28862B0.p(d6)) && this.f28862B0.p(com.google.android.gms.internal.ads.EW.a(2, d6.f26551D, d6.f26552E))) {
            java.util.List listD1 = d1(pg0, d6, false, this.f28862B0);
            if (!listD1.isEmpty()) {
                if (zU0) {
                    com.google.android.gms.internal.ads.AG0 ag0 = (com.google.android.gms.internal.ads.AG0) listD1.get(0);
                    boolean zE = ag0.e(d6);
                    if (!zE) {
                        int i12 = 1;
                        while (true) {
                            if (i12 >= listD1.size()) {
                                z6 = true;
                                break;
                            }
                            com.google.android.gms.internal.ads.AG0 ag1 = (com.google.android.gms.internal.ads.AG0) listD1.get(i12);
                            if (ag1.e(d6)) {
                                z6 = false;
                                zE = true;
                                ag0 = ag1;
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z6 = true;
                        break;
                    }
                    int i13 = true != zE ? 3 : 4;
                    int i14 = 8;
                    if (zE && ag0.f(d6)) {
                        i14 = 16;
                    }
                    return i13 | i14 | 32 | (true != ag0.f25100g ? 0 : 64) | (true != z6 ? 0 : 128) | i6;
                }
                i11 = 2;
            }
        }
        return i11 | 128;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.Hz0 E0(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.D d10) {
        int i6;
        int i10;
        com.google.android.gms.internal.ads.Hz0 hz0B = ag0.b(d6, d10);
        int i11 = hz0B.f28360e;
        if (r0(d10)) {
            i11 |= 32768;
        }
        if (c1(ag0, d10) > this.f28864D0) {
            i11 |= 64;
        }
        java.lang.String str = ag0.f25094a;
        if (i11 != 0) {
            i10 = i11;
            i6 = 0;
        } else {
            i6 = hz0B.f28359d;
            i10 = 0;
        }
        return new com.google.android.gms.internal.ads.Hz0(str, d6, d10, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.Hz0 F0(com.google.android.gms.internal.ads.UA0 ua0) {
        com.google.android.gms.internal.ads.D d6 = ua0.f32158a;
        d6.getClass();
        this.f28867G0 = d6;
        com.google.android.gms.internal.ads.Hz0 hz0F0 = super.F0(ua0);
        this.f28861A0.i(d6, hz0F0);
        return hz0F0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.C5333uG0 I0(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6, android.media.MediaCrypto mediaCrypto, float f6) {
        boolean z6;
        com.google.android.gms.internal.ads.D[] dArrG = G();
        int length = dArrG.length;
        int iC1 = c1(ag0, d6);
        if (length != 1) {
            for (com.google.android.gms.internal.ads.D d10 : dArrG) {
                if (ag0.b(d6, d10).f28359d != 0) {
                    iC1 = java.lang.Math.max(iC1, c1(ag0, d10));
                }
            }
        }
        this.f28864D0 = iC1;
        java.lang.String str = ag0.f25094a;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(com.google.android.gms.internal.ads.EW.f27063c)) {
            java.lang.String str2 = com.google.android.gms.internal.ads.EW.f27062b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f28865E0 = z6;
        java.lang.String str3 = ag0.f25094a;
        this.f28866F0 = str3.equals("OMX.google.opus.decoder") || str3.equals("c2.android.opus.decoder") || str3.equals("OMX.google.vorbis.decoder") || str3.equals("c2.android.vorbis.decoder");
        java.lang.String str4 = ag0.f25096c;
        int i10 = this.f28864D0;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str4);
        mediaFormat.setInteger("channel-count", d6.f26551D);
        mediaFormat.setInteger("sample-rate", d6.f26552E);
        com.google.android.gms.internal.ads.HN.b(mediaFormat, d6.f26577r);
        com.google.android.gms.internal.ads.HN.a(mediaFormat, "max-input-size", i10);
        if (i6 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f) {
                if (i6 == 23) {
                    java.lang.String str5 = com.google.android.gms.internal.ads.EW.f27064d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f6);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f6);
                }
            }
        }
        if (i6 <= 28 && "audio/ac4".equals(d6.f26574o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i6 >= 24 && this.f28862B0.a(com.google.android.gms.internal.ads.EW.a(4, d6.f26551D, d6.f26552E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i6 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i6 >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.f28873M0));
        }
        this.f28868H0 = (!"audio/raw".equals(ag0.f25095b) || "audio/raw".equals(d6.f26574o)) ? null : d6;
        return com.google.android.gms.internal.ads.C5333uG0.a(ag0, mediaFormat, d6, null, this.f28863C0);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final java.util.List J0(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6, boolean z6) {
        return com.google.android.gms.internal.ads.AbstractC3688fH0.f(d1(pg0, d6, false, this.f28862B0), d6);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void M0(com.google.android.gms.internal.ads.C5518vz0 c5518vz0) {
        com.google.android.gms.internal.ads.D d6;
        if (com.google.android.gms.internal.ads.EW.f27061a < 29 || (d6 = c5518vz0.f39484b) == null || !j$.util.Objects.equals(d6.f26574o, "audio/opus") || !q0()) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = c5518vz0.f39489g;
        byteBuffer.getClass();
        com.google.android.gms.internal.ads.D d10 = c5518vz0.f39484b;
        d10.getClass();
        int i6 = d10.f26554G;
        if (byteBuffer.remaining() == 8) {
            this.f28862B0.f(i6, (int) ((byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void N0(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.AbstractC3586eM.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f28861A0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void O0(java.lang.String str, com.google.android.gms.internal.ads.C5333uG0 c5333uG0, long j6, long j10) {
        this.f28861A0.e(str, j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void P0(java.lang.String str) {
        this.f28861A0.f(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final void Q(com.google.android.gms.internal.ads.C4930qg c4930qg) {
        this.f28862B0.r(c4930qg);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void Q0(com.google.android.gms.internal.ads.D d6, android.media.MediaFormat mediaFormat) throws com.google.android.gms.internal.ads.Qz0 {
        int iF;
        int i6;
        com.google.android.gms.internal.ads.D d10 = this.f28868H0;
        int[] iArr = null;
        boolean z6 = true;
        if (d10 != null) {
            d6 = d10;
        } else if (b1() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(d6.f26574o)) {
                iF = d6.f26553F;
            } else if (com.google.android.gms.internal.ads.EW.f27061a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iF = mediaFormat.containsKey("v-bits-per-sample") ? com.google.android.gms.internal.ads.EW.F(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iF = mediaFormat.getInteger("pcm-encoding");
            }
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.B("audio/raw");
            c4682oK0.u(iF);
            c4682oK0.g(d6.f26554G);
            c4682oK0.h(d6.f26555H);
            c4682oK0.t(d6.f26571l);
            c4682oK0.m(d6.f26560a);
            c4682oK0.o(d6.f26561b);
            c4682oK0.p(d6.f26562c);
            c4682oK0.q(d6.f26563d);
            c4682oK0.D(d6.f26564e);
            c4682oK0.y(d6.f26565f);
            c4682oK0.r0(mediaFormat.getInteger("channel-count"));
            c4682oK0.C(mediaFormat.getInteger("sample-rate"));
            com.google.android.gms.internal.ads.D dH = c4682oK0.H();
            if (this.f28865E0 && dH.f26551D == 6 && (i6 = d6.f26551D) < 6) {
                iArr = new int[i6];
                for (int i10 = 0; i10 < d6.f26551D; i10++) {
                    iArr[i10] = i10;
                }
            } else if (this.f28866F0) {
                int i11 = dH.f26551D;
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            d6 = dH;
        }
        try {
            int i12 = com.google.android.gms.internal.ads.EW.f27061a;
            if (i12 >= 29) {
                if (q0()) {
                    S();
                }
                if (i12 < 29) {
                    z6 = false;
                }
                com.google.android.gms.internal.ads.LC.f(z6);
            }
            this.f28862B0.z(d6, 0, iArr);
        } catch (com.google.android.gms.internal.ads.ME0 e6) {
            throw L(e6, e6.f29688C, false, 5001);
        }
    }

    protected final void R0() {
        this.f28870J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void S0() {
        this.f28862B0.i();
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void T0() throws com.google.android.gms.internal.ads.Qz0 {
        try {
            this.f28862B0.j();
        } catch (com.google.android.gms.internal.ads.QE0 e6) {
            throw L(e6, e6.f30950E, e6.f30949D, true != q0() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void U() {
        this.f28871K0 = true;
        this.f28867G0 = null;
        try {
            this.f28862B0.e();
            super.U();
        } catch (java.lang.Throwable th) {
            super.U();
            throw th;
        } finally {
            this.f28861A0.g(this.f30254s0);
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final boolean U0(long j6, long j10, com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0, java.nio.ByteBuffer byteBuffer, int i6, int i10, int i11, long j11, boolean z6, boolean z10, com.google.android.gms.internal.ads.D d6) throws com.google.android.gms.internal.ads.Qz0 {
        byteBuffer.getClass();
        if (this.f28868H0 != null && (i10 & 2) != 0) {
            interfaceC5663xG0.getClass();
            interfaceC5663xG0.i(i6, false);
            return true;
        }
        if (z6) {
            if (interfaceC5663xG0 != null) {
                interfaceC5663xG0.i(i6, false);
            }
            this.f30254s0.f27940f += i11;
            this.f28862B0.i();
            return true;
        }
        try {
            if (!this.f28862B0.w(byteBuffer, j11, i11)) {
                return false;
            }
            if (interfaceC5663xG0 != null) {
                interfaceC5663xG0.i(i6, false);
            }
            this.f30254s0.f27939e += i11;
            return true;
        } catch (com.google.android.gms.internal.ads.NE0 e6) {
            com.google.android.gms.internal.ads.D d10 = this.f28867G0;
            if (q0()) {
                S();
            }
            throw L(e6, d10, e6.f30204D, 5001);
        } catch (com.google.android.gms.internal.ads.QE0 e10) {
            if (q0()) {
                S();
            }
            throw L(e10, d6, e10.f30949D, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void V(boolean z6, boolean z10) {
        super.V(z6, z10);
        this.f28861A0.h(this.f30254s0);
        S();
        this.f28862B0.x(T());
        this.f28862B0.y(P());
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final boolean V0(com.google.android.gms.internal.ads.D d6) {
        S();
        return this.f28862B0.p(d6);
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void W(long j6, boolean z6) {
        super.W(j6, z6);
        this.f28862B0.e();
        this.f28869I0 = j6;
        this.f28872L0 = false;
        this.f28870J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.AB0
    public final boolean X() {
        return this.f28862B0.V() || super.X();
    }

    @Override // com.google.android.gms.internal.ads.AB0, com.google.android.gms.internal.ads.DB0
    public final java.lang.String Y() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final float Z(float f6, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.D[] dArr) {
        int iMax = -1;
        for (com.google.android.gms.internal.ads.D d10 : dArr) {
            int i6 = d10.f26552E;
            if (i6 != -1) {
                iMax = java.lang.Math.max(iMax, i6);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final long a() {
        if (f() == 2) {
            x0();
        }
        return this.f28869I0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final com.google.android.gms.internal.ads.C4930qg c() {
        return this.f28862B0.c();
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.AB0
    public final boolean g() {
        return super.g() && this.f28862B0.J();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final boolean j() {
        boolean z6 = this.f28872L0;
        this.f28872L0 = false;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.Fz0, com.google.android.gms.internal.ads.AB0
    public final com.google.android.gms.internal.ads.InterfaceC3128aB0 l() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.InterfaceC5433vB0
    public final void x(int i6, java.lang.Object obj) {
        com.google.android.gms.internal.ads.C5113sG0 c5113sG0;
        if (i6 == 2) {
            com.google.android.gms.internal.ads.RE0 re0 = this.f28862B0;
            obj.getClass();
            re0.q(((java.lang.Float) obj).floatValue());
            return;
        }
        if (i6 == 3) {
            com.google.android.gms.internal.ads.C5459vS c5459vS = (com.google.android.gms.internal.ads.C5459vS) obj;
            com.google.android.gms.internal.ads.RE0 re1 = this.f28862B0;
            c5459vS.getClass();
            re1.B(c5459vS);
            return;
        }
        if (i6 == 6) {
            com.google.android.gms.internal.ads.C3118a60 c3118a60 = (com.google.android.gms.internal.ads.C3118a60) obj;
            com.google.android.gms.internal.ads.RE0 re2 = this.f28862B0;
            c3118a60.getClass();
            re2.t(c3118a60);
            return;
        }
        if (i6 == 12) {
            if (com.google.android.gms.internal.ads.EW.f27061a >= 23) {
                this.f28862B0.s((android.media.AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i6 == 16) {
            obj.getClass();
            this.f28873M0 = ((java.lang.Integer) obj).intValue();
            com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0B1 = b1();
            if (interfaceC5663xG0B1 == null || com.google.android.gms.internal.ads.EW.f27061a < 35) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.f28873M0));
            interfaceC5663xG0B1.U(bundle);
            return;
        }
        if (i6 == 9) {
            com.google.android.gms.internal.ads.RE0 re3 = this.f28862B0;
            obj.getClass();
            re3.o(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (i6 != 10) {
                super.x(i6, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((java.lang.Integer) obj).intValue();
            this.f28862B0.A(iIntValue);
            if (com.google.android.gms.internal.ads.EW.f27061a < 35 || (c5113sG0 = this.f28863C0) == null) {
                return;
            }
            c5113sG0.d(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fz0
    protected final void y() {
        com.google.android.gms.internal.ads.C5113sG0 c5113sG0;
        this.f28862B0.k();
        if (com.google.android.gms.internal.ads.EW.f27061a < 35 || (c5113sG0 = this.f28863C0) == null) {
            return;
        }
        c5113sG0.b();
    }
}
