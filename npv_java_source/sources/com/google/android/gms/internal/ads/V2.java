package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V2 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public byte[] f32348O;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C3217b1 f32354U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f32355V;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public com.google.android.gms.internal.ads.InterfaceC3107a1 f32358Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f32359Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f32360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f32361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f32368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.google.android.gms.internal.ads.Z0 f32369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f32370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.gms.internal.ads.EH0 f32371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32372m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32373n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32374o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32375p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32376q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32377r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32378s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f32379t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f32380u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f32381v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f32382w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f32383x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f32384y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f32385z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f32334A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f32335B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f32336C = 1000;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f32337D = 200;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f32338E = -1.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f32339F = -1.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f32340G = -1.0f;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f32341H = -1.0f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f32342I = -1.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f32343J = -1.0f;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f32344K = -1.0f;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f32345L = -1.0f;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f32346M = -1.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f32347N = -1.0f;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f32349P = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f32350Q = -1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f32351R = 8000;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f32352S = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f32353T = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f32356W = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private java.lang.String f32357X = "eng";

    protected V2() {
    }

    private static android.util.Pair f(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        try {
            c5128sR.m(16);
            long jI = c5128sR.I();
            if (jI == 1482049860) {
                return new android.util.Pair("video/divx", null);
            }
            if (jI == 859189832) {
                return new android.util.Pair("video/3gpp", null);
            }
            if (jI != 826496599) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new android.util.Pair("video/x-unknown", null);
            }
            int iT = c5128sR.t() + 20;
            byte[] bArrN = c5128sR.n();
            while (true) {
                int length = bArrN.length;
                if (iT >= length - 4) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Failed to find FourCC VC1 initialization data", null);
                }
                int i6 = iT + 1;
                if (bArrN[iT] == 0 && bArrN[i6] == 0 && bArrN[iT + 2] == 1 && bArrN[iT + 3] == 15) {
                    return new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(bArrN, iT, length)));
                }
                iT = i6;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.C4708of.a("Error parsing FourCC private data", null);
        }
    }

    private static java.util.List g(byte[] bArr) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        int i10;
        try {
            if (bArr[0] != 2) {
                throw com.google.android.gms.internal.ads.C4708of.a("Error parsing vorbis codec private", null);
            }
            int i11 = 0;
            int i12 = 1;
            while (true) {
                int i13 = bArr[i12];
                i12++;
                i6 = i13 & 255;
                if (i6 != 255) {
                    break;
                }
                i11 += 255;
            }
            int i14 = i11 + i6;
            int i15 = 0;
            while (true) {
                int i16 = bArr[i12];
                i12++;
                i10 = i16 & 255;
                if (i10 != 255) {
                    break;
                }
                i15 += 255;
            }
            int i17 = i15 + i10;
            if (bArr[i12] != 1) {
                throw com.google.android.gms.internal.ads.C4708of.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i14];
            java.lang.System.arraycopy(bArr, i12, bArr2, 0, i14);
            int i18 = i12 + i14;
            if (bArr[i18] != 3) {
                throw com.google.android.gms.internal.ads.C4708of.a("Error parsing vorbis codec private", null);
            }
            int i19 = i18 + i17;
            if (bArr[i19] != 5) {
                throw com.google.android.gms.internal.ads.C4708of.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i19;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr, i19, bArr3, 0, length);
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.C4708of.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        try {
            int iA = c5128sR.A();
            if (iA == 1) {
                return true;
            }
            if (iA == 65534) {
                c5128sR.l(24);
                if (c5128sR.J() == com.google.android.gms.internal.ads.X2.f32977i0.getMostSignificantBits() && c5128sR.J() == com.google.android.gms.internal.ads.X2.f32977i0.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.C4708of.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(java.lang.String str) throws com.google.android.gms.internal.ads.C4708of {
        byte[] bArr = this.f32370k;
        if (bArr != null) {
            return bArr;
        }
        throw com.google.android.gms.internal.ads.C4708of.a("Missing CodecPrivate for codec ".concat(java.lang.String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb A[PHI: r9
  0x01eb: PHI (r9v7 int) = (r9v1 int), (r9v2 int), (r9v3 int), (r9v4 int), (r9v5 int), (r9v6 int), (r9v0 int) binds: [B:141:0x0252, B:136:0x022f, B:133:0x021e, B:131:0x0219, B:129:0x0214, B:127:0x0210, B:120:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x0379  */
    /* JADX WARN: Code duplicated, block: B:178:0x0393  */
    /* JADX WARN: Code duplicated, block: B:179:0x0395  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:200:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:228:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:233:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:251:0x0534  */
    /* JADX WARN: Code duplicated, block: B:253:0x0554  */
    /* JADX WARN: Code duplicated, block: B:255:0x055c  */
    /* JADX WARN: Code duplicated, block: B:270:0x058b  */
    public final void e(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, int i6) throws com.google.android.gms.internal.ads.C4708of {
        byte b6;
        java.util.List listSingletonList;
        java.util.List list;
        java.lang.String str;
        java.lang.String str2;
        int i10;
        int i11;
        java.lang.String string;
        int i12;
        java.lang.StringBuilder sb;
        java.lang.String str3;
        java.lang.String str4;
        int i13;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0;
        int i14;
        int iIntValue;
        int i15;
        float f6;
        int i16;
        int i17;
        int i18;
        com.google.android.gms.internal.ads.C4751p0 c4751p0A;
        java.lang.String str5 = this.f32361b;
        int iF = 4;
        int i19 = 0;
        switch (str5) {
            case "V_MPEG4/ISO/AP":
                b6 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b6 = 4;
                break;
            case "A_MS/ACM":
                b6 = 23;
                break;
            case "A_TRUEHD":
                b6 = 18;
                break;
            case "A_VORBIS":
                b6 = 11;
                break;
            case "A_MPEG/L2":
                b6 = 14;
                break;
            case "A_MPEG/L3":
                b6 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b6 = 9;
                break;
            case "S_DVBSUB":
                b6 = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b6 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b6 = 7;
                break;
            case "S_VOBSUB":
                b6 = 30;
                break;
            case "A_DTS/LOSSLESS":
                b6 = 21;
                break;
            case "A_AAC":
                b6 = 13;
                break;
            case "A_AC3":
                b6 = 16;
                break;
            case "A_DTS":
                b6 = 19;
                break;
            case "V_AV1":
                b6 = 2;
                break;
            case "V_VP8":
                b6 = 0;
                break;
            case "V_VP9":
                b6 = 1;
                break;
            case "S_HDMV/PGS":
                b6 = 31;
                break;
            case "V_THEORA":
                b6 = 10;
                break;
            case "A_DTS/EXPRESS":
                b6 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b6 = 26;
                break;
            case "A_PCM/INT/BIG":
                b6 = 25;
                break;
            case "A_PCM/INT/LIT":
                b6 = 24;
                break;
            case "S_TEXT/ASS":
                b6 = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b6 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b6 = 29;
                break;
            case "S_TEXT/UTF8":
                b6 = 27;
                break;
            case "V_MPEG2":
                b6 = 3;
                break;
            case "A_EAC3":
                b6 = 17;
                break;
            case "A_FLAC":
                b6 = 22;
                break;
            case "A_OPUS":
                b6 = 12;
                break;
            default:
                b6 = -1;
                break;
        }
        java.lang.String str6 = "audio/raw";
        com.google.android.gms.internal.ads.PA0 pa0G = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b6) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null && (c4751p0A = com.google.android.gms.internal.ads.C4751p0.a(new com.google.android.gms.internal.ads.C5128sR(this.f32348O))) != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z6 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i20 = (z6 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                } else if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                    if (this.f32377r == 0) {
                        i17 = this.f32375p;
                        iIntValue = -1;
                        if (i17 == -1) {
                            i17 = this.f32372m;
                        }
                        this.f32375p = i17;
                        i18 = this.f32376q;
                        if (i18 == -1) {
                            i18 = this.f32373n;
                        }
                        this.f32376q = i18;
                    } else {
                        iIntValue = -1;
                    }
                    i15 = this.f32375p;
                    if (i15 != iIntValue || (i16 = this.f32376q) == iIntValue) {
                        f6 = -1.0f;
                    } else {
                        f6 = (this.f32373n * i15) / (this.f32372m * i16);
                    }
                    if (this.f32384y) {
                        if (this.f32338E != -1.0f && this.f32339F != -1.0f && this.f32340G != -1.0f && this.f32341H != -1.0f && this.f32342I != -1.0f && this.f32343J != -1.0f && this.f32344K != -1.0f && this.f32345L != -1.0f && this.f32346M != -1.0f && this.f32347N != -1.0f) {
                            bArr = new byte[25];
                            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f32346M + 0.5f));
                            byteBufferOrder.putShort((short) (this.f32347N + 0.5f));
                            byteBufferOrder.putShort((short) this.f32336C);
                            byteBufferOrder.putShort((short) this.f32337D);
                        }
                        com.google.android.gms.internal.ads.Oz0 oz0 = new com.google.android.gms.internal.ads.Oz0();
                        oz0.c(this.f32385z);
                        oz0.b(this.f32335B);
                        oz0.d(this.f32334A);
                        oz0.e(bArr);
                        oz0.f(this.f32374o);
                        oz0.a(this.f32374o);
                        pa0G = oz0.g();
                    }
                    if (this.f32360a != null && com.google.android.gms.internal.ads.X2.f32978j0.containsKey(this.f32360a)) {
                        iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                    }
                    if (this.f32378s == 0 || java.lang.Float.compare(this.f32379t, 0.0f) != 0 || java.lang.Float.compare(this.f32380u, 0.0f) != 0) {
                        i19 = iIntValue;
                    } else if (java.lang.Float.compare(this.f32381v, 0.0f) != 0) {
                        if (java.lang.Float.compare(this.f32381v, 90.0f) == 0) {
                            i19 = 90;
                        } else if (java.lang.Float.compare(this.f32381v, -180.0f) == 0 || java.lang.Float.compare(this.f32381v, 180.0f) == 0) {
                            i19 = 180;
                        } else if (java.lang.Float.compare(this.f32381v, -90.0f) == 0) {
                            i19 = 270;
                        } else {
                            i19 = iIntValue;
                        }
                    }
                    c4682oK0.G(this.f32372m);
                    c4682oK0.k(this.f32373n);
                    c4682oK0.w(f6);
                    c4682oK0.z(i19);
                    c4682oK0.x(this.f32382w);
                    c4682oK0.E(this.f32383x);
                    c4682oK0.b(pa0G);
                    i14 = 2;
                } else {
                    if ("application/x-subrip".equals(str4) && !"text/x-ssa".equals(str4) && !"text/vtt".equals(str4) && !"application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                        throw com.google.android.gms.internal.ads.C4708of.a("Unexpected MIME type.", null);
                    }
                    i14 = 3;
                }
                if (this.f32360a != null && !com.google.android.gms.internal.ads.X2.f32978j0.containsKey(this.f32360a)) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i20);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S;
                interfaceC3107a1S.c(dH);
                return;
            case 1:
                str6 = "video/x-vnd.on2.vp9";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z10 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21 = (z10 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder2 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder2.put((byte) 0);
                                byteBufferOrder2.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder2.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder2.putShort((short) this.f32336C);
                                byteBufferOrder2.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz1 = new com.google.android.gms.internal.ads.Oz0();
                            oz1.c(this.f32385z);
                            oz1.b(this.f32335B);
                            oz1.d(this.f32334A);
                            oz1.e(bArr);
                            oz1.f(this.f32374o);
                            oz1.a(this.f32374o);
                            pa0G = oz1.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i21);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH2 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S2 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S2;
                interfaceC3107a1S2.c(dH2);
                return;
            case 2:
                str6 = "video/av01";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z11 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i22 = (z11 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder3 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder3.put((byte) 0);
                                byteBufferOrder3.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder3.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder3.putShort((short) this.f32336C);
                                byteBufferOrder3.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz2 = new com.google.android.gms.internal.ads.Oz0();
                            oz2.c(this.f32385z);
                            oz2.b(this.f32335B);
                            oz2.d(this.f32334A);
                            oz2.e(bArr);
                            oz2.f(this.f32374o);
                            oz2.a(this.f32374o);
                            pa0G = oz2.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i22);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH3 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S3 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S3;
                interfaceC3107a1S3.c(dH3);
                return;
            case 3:
                str6 = "video/mpeg2";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z12 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i23 = (z12 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder4 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder4.put((byte) 0);
                                byteBufferOrder4.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder4.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder4.putShort((short) this.f32336C);
                                byteBufferOrder4.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz3 = new com.google.android.gms.internal.ads.Oz0();
                            oz3.c(this.f32385z);
                            oz3.b(this.f32335B);
                            oz3.d(this.f32334A);
                            oz3.e(bArr);
                            oz3.f(this.f32374o);
                            oz3.a(this.f32374o);
                            pa0G = oz3.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i23);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH4 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S4 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S4;
                interfaceC3107a1S4.c(dH4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.f32370k;
                listSingletonList = bArr2 == null ? null : java.util.Collections.singletonList(bArr2);
                str6 = "video/mp4v-es";
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z13 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i24 = (z13 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder5 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder5.putShort((short) this.f32336C);
                                byteBufferOrder5.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz4 = new com.google.android.gms.internal.ads.Oz0();
                            oz4.c(this.f32385z);
                            oz4.b(this.f32335B);
                            oz4.d(this.f32334A);
                            oz4.e(bArr);
                            oz4.f(this.f32374o);
                            oz4.a(this.f32374o);
                            pa0G = oz4.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i24);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH5 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S5 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S5;
                interfaceC3107a1S5.c(dH5);
                return;
            case 7:
                com.google.android.gms.internal.ads.W wA = com.google.android.gms.internal.ads.W.a(new com.google.android.gms.internal.ads.C5128sR(i(this.f32361b)));
                list = wA.f32633a;
                this.f32359Z = wA.f32634b;
                str = wA.f32644l;
                str6 = "video/avc";
                str2 = str;
                listSingletonList = list;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z14 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i25 = (z14 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder6 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder6.put((byte) 0);
                                byteBufferOrder6.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder6.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder6.putShort((short) this.f32336C);
                                byteBufferOrder6.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz5 = new com.google.android.gms.internal.ads.Oz0();
                            oz5.c(this.f32385z);
                            oz5.b(this.f32335B);
                            oz5.d(this.f32334A);
                            oz5.e(bArr);
                            oz5.f(this.f32374o);
                            oz5.a(this.f32374o);
                            pa0G = oz5.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i25);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH6 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S6 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S6;
                interfaceC3107a1S6.c(dH6);
                return;
            case 8:
                com.google.android.gms.internal.ads.J0 j0A = com.google.android.gms.internal.ads.J0.a(new com.google.android.gms.internal.ads.C5128sR(i(this.f32361b)));
                list = j0A.f28563a;
                this.f32359Z = j0A.f28564b;
                str = j0A.f28573k;
                str6 = "video/hevc";
                str2 = str;
                listSingletonList = list;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z15 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i26 = (z15 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder7 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder7.putShort((short) this.f32336C);
                                byteBufferOrder7.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz6 = new com.google.android.gms.internal.ads.Oz0();
                            oz6.c(this.f32385z);
                            oz6.b(this.f32335B);
                            oz6.d(this.f32334A);
                            oz6.e(bArr);
                            oz6.f(this.f32374o);
                            oz6.a(this.f32374o);
                            pa0G = oz6.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i26);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH7 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S7 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S7;
                interfaceC3107a1S7.c(dH7);
                return;
            case 9:
                android.util.Pair pairF = f(new com.google.android.gms.internal.ads.C5128sR(i(this.f32361b)));
                str6 = (java.lang.String) pairF.first;
                listSingletonList = (java.util.List) pairF.second;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z16 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i27 = (z16 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder8 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder8.putShort((short) this.f32336C);
                                byteBufferOrder8.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz7 = new com.google.android.gms.internal.ads.Oz0();
                            oz7.c(this.f32385z);
                            oz7.b(this.f32335B);
                            oz7.d(this.f32334A);
                            oz7.e(bArr);
                            oz7.f(this.f32374o);
                            oz7.a(this.f32374o);
                            pa0G = oz7.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i27);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH8 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S8 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S8;
                interfaceC3107a1S8.c(dH8);
                return;
            case 10:
                str6 = "video/x-unknown";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z17 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i28 = (z17 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder9 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder9.put((byte) 0);
                                byteBufferOrder9.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder9.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder9.putShort((short) this.f32336C);
                                byteBufferOrder9.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz8 = new com.google.android.gms.internal.ads.Oz0();
                            oz8.c(this.f32385z);
                            oz8.b(this.f32335B);
                            oz8.d(this.f32334A);
                            oz8.e(bArr);
                            oz8.f(this.f32374o);
                            oz8.a(this.f32374o);
                            pa0G = oz8.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i28);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH9 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S9 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S9;
                interfaceC3107a1S9.c(dH9);
                return;
            case 11:
                listSingletonList = g(i(str5));
                i10 = 8192;
                str6 = "audio/vorbis";
                str2 = null;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z18 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i29 = (z18 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder10 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder10.putShort((short) this.f32336C);
                                byteBufferOrder10.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz9 = new com.google.android.gms.internal.ads.Oz0();
                            oz9.c(this.f32385z);
                            oz9.b(this.f32335B);
                            oz9.d(this.f32334A);
                            oz9.e(bArr);
                            oz9.f(this.f32374o);
                            oz9.a(this.f32374o);
                            pa0G = oz9.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i29);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH10 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S10 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S10;
                interfaceC3107a1S10.c(dH10);
                return;
            case 12:
                listSingletonList = new java.util.ArrayList(3);
                listSingletonList.add(i(this.f32361b));
                java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
                java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
                listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f32352S).array());
                listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(byteOrder).putLong(this.f32353T).array());
                i10 = 5760;
                str6 = "audio/opus";
                str2 = null;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z19 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i210 = (z19 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder11 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder11.putShort((short) this.f32336C);
                                byteBufferOrder11.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz10 = new com.google.android.gms.internal.ads.Oz0();
                            oz10.c(this.f32385z);
                            oz10.b(this.f32335B);
                            oz10.d(this.f32334A);
                            oz10.e(bArr);
                            oz10.f(this.f32374o);
                            oz10.a(this.f32374o);
                            pa0G = oz10.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i210);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH11 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S11 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S11;
                interfaceC3107a1S11.c(dH11);
                return;
            case 13:
                listSingletonList = java.util.Collections.singletonList(i(str5));
                com.google.android.gms.internal.ads.M mA = com.google.android.gms.internal.ads.O.a(this.f32370k);
                this.f32351R = mA.f29621a;
                this.f32349P = mA.f29622b;
                str6 = "audio/mp4a-latm";
                str2 = mA.f29623c;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z110 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i211 = (z110 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder12 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder12.putShort((short) this.f32336C);
                                byteBufferOrder12.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz11 = new com.google.android.gms.internal.ads.Oz0();
                            oz11.c(this.f32385z);
                            oz11.b(this.f32335B);
                            oz11.d(this.f32334A);
                            oz11.e(bArr);
                            oz11.f(this.f32374o);
                            oz11.a(this.f32374o);
                            pa0G = oz11.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i211);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH12 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S12 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S12;
                interfaceC3107a1S12.c(dH12);
                return;
            case 14:
                i11 = 4096;
                str6 = "audio/mpeg-L2";
                i10 = i11;
                listSingletonList = null;
                str2 = null;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z111 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i212 = (z111 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder13 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder13.putShort((short) this.f32336C);
                                byteBufferOrder13.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz12 = new com.google.android.gms.internal.ads.Oz0();
                            oz12.c(this.f32385z);
                            oz12.b(this.f32335B);
                            oz12.d(this.f32334A);
                            oz12.e(bArr);
                            oz12.f(this.f32374o);
                            oz12.a(this.f32374o);
                            pa0G = oz12.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i212);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH13 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S13 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S13;
                interfaceC3107a1S13.c(dH13);
                return;
            case 15:
                i11 = 4096;
                str6 = "audio/mpeg";
                i10 = i11;
                listSingletonList = null;
                str2 = null;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z112 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i213 = (z112 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder14 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder14.putShort((short) this.f32336C);
                                byteBufferOrder14.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz13 = new com.google.android.gms.internal.ads.Oz0();
                            oz13.c(this.f32385z);
                            oz13.b(this.f32335B);
                            oz13.d(this.f32334A);
                            oz13.e(bArr);
                            oz13.f(this.f32374o);
                            oz13.a(this.f32374o);
                            pa0G = oz13.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i213);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH14 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S14 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S14;
                interfaceC3107a1S14.c(dH14);
                return;
            case 16:
                str6 = "audio/ac3";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z113 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i214 = (z113 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder15 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder15.putShort((short) this.f32336C);
                                byteBufferOrder15.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz14 = new com.google.android.gms.internal.ads.Oz0();
                            oz14.c(this.f32385z);
                            oz14.b(this.f32335B);
                            oz14.d(this.f32334A);
                            oz14.e(bArr);
                            oz14.f(this.f32374o);
                            oz14.a(this.f32374o);
                            pa0G = oz14.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i214);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH15 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S15 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S15;
                interfaceC3107a1S15.c(dH15);
                return;
            case 17:
                str6 = "audio/eac3";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z114 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i215 = (z114 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder16 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder16.putShort((short) this.f32336C);
                                byteBufferOrder16.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz15 = new com.google.android.gms.internal.ads.Oz0();
                            oz15.c(this.f32385z);
                            oz15.b(this.f32335B);
                            oz15.d(this.f32334A);
                            oz15.e(bArr);
                            oz15.f(this.f32374o);
                            oz15.a(this.f32374o);
                            pa0G = oz15.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i215);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH16 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S16 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S16;
                interfaceC3107a1S16.c(dH16);
                return;
            case 18:
                this.f32354U = new com.google.android.gms.internal.ads.C3217b1();
                str6 = "audio/true-hd";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z115 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i216 = (z115 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder17 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder17.putShort((short) this.f32336C);
                                byteBufferOrder17.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz16 = new com.google.android.gms.internal.ads.Oz0();
                            oz16.c(this.f32385z);
                            oz16.b(this.f32335B);
                            oz16.d(this.f32334A);
                            oz16.e(bArr);
                            oz16.f(this.f32374o);
                            oz16.a(this.f32374o);
                            pa0G = oz16.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i216);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH17 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S17 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S17;
                interfaceC3107a1S17.c(dH17);
                return;
            case 19:
            case 20:
                str6 = "audio/vnd.dts";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z116 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i217 = (z116 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder18 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder18.putShort((short) this.f32336C);
                                byteBufferOrder18.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz17 = new com.google.android.gms.internal.ads.Oz0();
                            oz17.c(this.f32385z);
                            oz17.b(this.f32335B);
                            oz17.d(this.f32334A);
                            oz17.e(bArr);
                            oz17.f(this.f32374o);
                            oz17.a(this.f32374o);
                            pa0G = oz17.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i217);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH18 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S18 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S18;
                interfaceC3107a1S18.c(dH18);
                return;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                str6 = "audio/vnd.dts.hd";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z117 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i218 = (z117 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder19 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder19.putShort((short) this.f32336C);
                                byteBufferOrder19.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz18 = new com.google.android.gms.internal.ads.Oz0();
                            oz18.c(this.f32385z);
                            oz18.b(this.f32335B);
                            oz18.d(this.f32334A);
                            oz18.e(bArr);
                            oz18.f(this.f32374o);
                            oz18.a(this.f32374o);
                            pa0G = oz18.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i218);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH19 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S19 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S19;
                interfaceC3107a1S19.c(dH19);
                return;
            case 22:
                listSingletonList = java.util.Collections.singletonList(i(str5));
                str6 = "audio/flac";
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z118 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i219 = (z118 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder110 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder110.putShort((short) this.f32336C);
                                byteBufferOrder110.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz19 = new com.google.android.gms.internal.ads.Oz0();
                            oz19.c(this.f32385z);
                            oz19.b(this.f32335B);
                            oz19.d(this.f32334A);
                            oz19.e(bArr);
                            oz19.f(this.f32374o);
                            oz19.a(this.f32374o);
                            pa0G = oz19.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i219);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH110 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S110 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S110;
                interfaceC3107a1S110.c(dH110);
                return;
            case 23:
                if (h(new com.google.android.gms.internal.ads.C5128sR(i(this.f32361b)))) {
                    iF = com.google.android.gms.internal.ads.EW.F(this.f32350Q);
                    if (iF == 0) {
                        i12 = this.f32350Q;
                        sb = new java.lang.StringBuilder();
                        str3 = "Unsupported PCM bit depth: ";
                        sb.append(str3);
                        sb.append(i12);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        string = sb.toString();
                    } else {
                        listSingletonList = null;
                        str2 = null;
                        i10 = -1;
                    }
                    if (this.f32348O != null) {
                        str2 = c4751p0A.f37896a;
                        str6 = "video/dolby-vision";
                    }
                    str4 = str6;
                    boolean z119 = this.f32356W;
                    if (true != this.f32355V) {
                        i13 = 0;
                    } else {
                        i13 = 2;
                    }
                    int i2110 = (z119 ? 1 : 0) | i13;
                    c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                    if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                        if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                            if (this.f32377r == 0) {
                                i17 = this.f32375p;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f32372m;
                                }
                                this.f32375p = i17;
                                i18 = this.f32376q;
                                if (i18 == -1) {
                                    i18 = this.f32373n;
                                }
                                this.f32376q = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f32375p;
                            if (i15 != iIntValue) {
                                f6 = -1.0f;
                            } else {
                                f6 = -1.0f;
                            }
                            if (this.f32384y) {
                                if (this.f32338E != -1.0f) {
                                    bArr = new byte[25];
                                    java.nio.ByteBuffer byteBufferOrder111 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder111.put((byte) 0);
                                    byteBufferOrder111.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.f32346M + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.f32347N + 0.5f));
                                    byteBufferOrder111.putShort((short) this.f32336C);
                                    byteBufferOrder111.putShort((short) this.f32337D);
                                }
                                com.google.android.gms.internal.ads.Oz0 oz110 = new com.google.android.gms.internal.ads.Oz0();
                                oz110.c(this.f32385z);
                                oz110.b(this.f32335B);
                                oz110.d(this.f32334A);
                                oz110.e(bArr);
                                oz110.f(this.f32374o);
                                oz110.a(this.f32374o);
                                pa0G = oz110.g();
                            }
                            if (this.f32360a != null) {
                                iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                            }
                            if (this.f32378s == 0) {
                                i19 = iIntValue;
                            } else {
                                i19 = iIntValue;
                            }
                            c4682oK0.G(this.f32372m);
                            c4682oK0.k(this.f32373n);
                            c4682oK0.w(f6);
                            c4682oK0.z(i19);
                            c4682oK0.x(this.f32382w);
                            c4682oK0.E(this.f32383x);
                            c4682oK0.b(pa0G);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str4)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        c4682oK0.r0(this.f32349P);
                        c4682oK0.C(this.f32351R);
                        c4682oK0.u(iF);
                        i14 = 1;
                    }
                    if (this.f32360a != null) {
                        c4682oK0.o(this.f32360a);
                    }
                    c4682oK0.l(i6);
                    c4682oK0.B(str4);
                    c4682oK0.r(i10);
                    c4682oK0.q(this.f32357X);
                    c4682oK0.D(i2110);
                    c4682oK0.n(listSingletonList);
                    c4682oK0.a(str2);
                    c4682oK0.f(this.f32371l);
                    com.google.android.gms.internal.ads.D dH111 = c4682oK0.H();
                    com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S111 = interfaceC5520w0.S(this.f32362c, i14);
                    this.f32358Y = interfaceC3107a1S111;
                    interfaceC3107a1S111.c(dH111);
                    return;
                }
                string = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                com.google.android.gms.internal.ads.AbstractC3586eM.f("MatroskaExtractor", string);
                listSingletonList = null;
                str2 = null;
                str6 = "audio/x-unknown";
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1110 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2111 = (z1110 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder112 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder112.putShort((short) this.f32336C);
                                byteBufferOrder112.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz111 = new com.google.android.gms.internal.ads.Oz0();
                            oz111.c(this.f32385z);
                            oz111.b(this.f32335B);
                            oz111.d(this.f32334A);
                            oz111.e(bArr);
                            oz111.f(this.f32374o);
                            oz111.a(this.f32374o);
                            pa0G = oz111.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2111);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH112 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S112 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S112;
                interfaceC3107a1S112.c(dH112);
                return;
            case 24:
                iF = com.google.android.gms.internal.ads.EW.F(this.f32350Q);
                if (iF == 0) {
                    i12 = this.f32350Q;
                    sb = new java.lang.StringBuilder();
                    str3 = "Unsupported little endian PCM bit depth: ";
                    sb.append(str3);
                    sb.append(i12);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    string = sb.toString();
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("MatroskaExtractor", string);
                    listSingletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i10 = -1;
                    iF = -1;
                } else {
                    listSingletonList = null;
                    str2 = null;
                    i10 = -1;
                }
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1111 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2112 = (z1111 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder113 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder113.putShort((short) this.f32336C);
                                byteBufferOrder113.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz112 = new com.google.android.gms.internal.ads.Oz0();
                            oz112.c(this.f32385z);
                            oz112.b(this.f32335B);
                            oz112.d(this.f32334A);
                            oz112.e(bArr);
                            oz112.f(this.f32374o);
                            oz112.a(this.f32374o);
                            pa0G = oz112.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2112);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH113 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S113 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S113;
                interfaceC3107a1S113.c(dH113);
                return;
            case 25:
                i12 = this.f32350Q;
                if (i12 == 8) {
                    iF = 3;
                } else if (i12 == 16) {
                    iF = 268435456;
                } else if (i12 == 24) {
                    iF = 1342177280;
                } else {
                    if (i12 != 32) {
                        sb = new java.lang.StringBuilder();
                        str3 = "Unsupported big endian PCM bit depth: ";
                        sb.append(str3);
                        sb.append(i12);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        string = sb.toString();
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("MatroskaExtractor", string);
                        listSingletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i10 = -1;
                        iF = -1;
                        if (this.f32348O != null) {
                            str2 = c4751p0A.f37896a;
                            str6 = "video/dolby-vision";
                        }
                        str4 = str6;
                        boolean z1112 = this.f32356W;
                        if (true != this.f32355V) {
                            i13 = 0;
                        } else {
                            i13 = 2;
                        }
                        int i2113 = (z1112 ? 1 : 0) | i13;
                        c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                        if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                            if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                                if (this.f32377r == 0) {
                                    i17 = this.f32375p;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f32372m;
                                    }
                                    this.f32375p = i17;
                                    i18 = this.f32376q;
                                    if (i18 == -1) {
                                        i18 = this.f32373n;
                                    }
                                    this.f32376q = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f32375p;
                                if (i15 != iIntValue) {
                                    f6 = -1.0f;
                                } else {
                                    f6 = -1.0f;
                                }
                                if (this.f32384y) {
                                    if (this.f32338E != -1.0f) {
                                        bArr = new byte[25];
                                        java.nio.ByteBuffer byteBufferOrder114 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder114.put((byte) 0);
                                        byteBufferOrder114.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.f32346M + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.f32347N + 0.5f));
                                        byteBufferOrder114.putShort((short) this.f32336C);
                                        byteBufferOrder114.putShort((short) this.f32337D);
                                    }
                                    com.google.android.gms.internal.ads.Oz0 oz113 = new com.google.android.gms.internal.ads.Oz0();
                                    oz113.c(this.f32385z);
                                    oz113.b(this.f32335B);
                                    oz113.d(this.f32334A);
                                    oz113.e(bArr);
                                    oz113.f(this.f32374o);
                                    oz113.a(this.f32374o);
                                    pa0G = oz113.g();
                                }
                                if (this.f32360a != null) {
                                    iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                                }
                                if (this.f32378s == 0) {
                                    i19 = iIntValue;
                                } else {
                                    i19 = iIntValue;
                                }
                                c4682oK0.G(this.f32372m);
                                c4682oK0.k(this.f32373n);
                                c4682oK0.w(f6);
                                c4682oK0.z(i19);
                                c4682oK0.x(this.f32382w);
                                c4682oK0.E(this.f32383x);
                                c4682oK0.b(pa0G);
                                i14 = 2;
                            } else {
                                if ("application/x-subrip".equals(str4)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            c4682oK0.r0(this.f32349P);
                            c4682oK0.C(this.f32351R);
                            c4682oK0.u(iF);
                            i14 = 1;
                        }
                        if (this.f32360a != null) {
                            c4682oK0.o(this.f32360a);
                        }
                        c4682oK0.l(i6);
                        c4682oK0.B(str4);
                        c4682oK0.r(i10);
                        c4682oK0.q(this.f32357X);
                        c4682oK0.D(i2113);
                        c4682oK0.n(listSingletonList);
                        c4682oK0.a(str2);
                        c4682oK0.f(this.f32371l);
                        com.google.android.gms.internal.ads.D dH114 = c4682oK0.H();
                        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S114 = interfaceC5520w0.S(this.f32362c, i14);
                        this.f32358Y = interfaceC3107a1S114;
                        interfaceC3107a1S114.c(dH114);
                        return;
                    }
                    iF = 1610612736;
                }
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1113 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2114 = (z1113 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder115 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder115.putShort((short) this.f32336C);
                                byteBufferOrder115.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz114 = new com.google.android.gms.internal.ads.Oz0();
                            oz114.c(this.f32385z);
                            oz114.b(this.f32335B);
                            oz114.d(this.f32334A);
                            oz114.e(bArr);
                            oz114.f(this.f32374o);
                            oz114.a(this.f32374o);
                            pa0G = oz114.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2114);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH115 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S115 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S115;
                interfaceC3107a1S115.c(dH115);
                return;
            case 26:
                i12 = this.f32350Q;
                if (i12 == 32) {
                    listSingletonList = null;
                    str2 = null;
                    i10 = -1;
                } else {
                    sb = new java.lang.StringBuilder();
                    str3 = "Unsupported floating point PCM bit depth: ";
                    sb.append(str3);
                    sb.append(i12);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    string = sb.toString();
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("MatroskaExtractor", string);
                    listSingletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i10 = -1;
                    iF = -1;
                }
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1114 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2115 = (z1114 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder116 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder116.putShort((short) this.f32336C);
                                byteBufferOrder116.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz115 = new com.google.android.gms.internal.ads.Oz0();
                            oz115.c(this.f32385z);
                            oz115.b(this.f32335B);
                            oz115.d(this.f32334A);
                            oz115.e(bArr);
                            oz115.f(this.f32374o);
                            oz115.a(this.f32374o);
                            pa0G = oz115.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2115);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH116 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S116 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S116;
                interfaceC3107a1S116.c(dH116);
                return;
            case 27:
                str6 = "application/x-subrip";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1115 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2116 = (z1115 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder117 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder117.putShort((short) this.f32336C);
                                byteBufferOrder117.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz116 = new com.google.android.gms.internal.ads.Oz0();
                            oz116.c(this.f32385z);
                            oz116.b(this.f32335B);
                            oz116.d(this.f32334A);
                            oz116.e(bArr);
                            oz116.f(this.f32374o);
                            oz116.a(this.f32374o);
                            pa0G = oz116.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2116);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH117 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S117 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S117;
                interfaceC3107a1S117.c(dH117);
                return;
            case 28:
                listSingletonList = com.google.android.gms.internal.ads.AbstractC3398ci0.Q(com.google.android.gms.internal.ads.X2.f32974f0, i(this.f32361b));
                str6 = "text/x-ssa";
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1116 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2117 = (z1116 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder118 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder118.putShort((short) this.f32336C);
                                byteBufferOrder118.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz117 = new com.google.android.gms.internal.ads.Oz0();
                            oz117.c(this.f32385z);
                            oz117.b(this.f32335B);
                            oz117.d(this.f32334A);
                            oz117.e(bArr);
                            oz117.f(this.f32374o);
                            oz117.a(this.f32374o);
                            pa0G = oz117.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2117);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH118 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S118 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S118;
                interfaceC3107a1S118.c(dH118);
                return;
            case 29:
                str6 = "text/vtt";
                listSingletonList = null;
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1117 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2118 = (z1117 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder119 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder119.putShort((short) this.f32336C);
                                byteBufferOrder119.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz118 = new com.google.android.gms.internal.ads.Oz0();
                            oz118.c(this.f32385z);
                            oz118.b(this.f32335B);
                            oz118.d(this.f32334A);
                            oz118.e(bArr);
                            oz118.f(this.f32374o);
                            oz118.a(this.f32374o);
                            pa0G = oz118.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2118);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH119 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S119 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S119;
                interfaceC3107a1S119.c(dH119);
                return;
            case 30:
                listSingletonList = com.google.android.gms.internal.ads.AbstractC3398ci0.P(i(str5));
                str2 = null;
                str6 = "application/vobsub";
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1118 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2119 = (z1118 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder1110 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder1110.putShort((short) this.f32336C);
                                byteBufferOrder1110.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz119 = new com.google.android.gms.internal.ads.Oz0();
                            oz119.c(this.f32385z);
                            oz119.b(this.f32335B);
                            oz119.d(this.f32334A);
                            oz119.e(bArr);
                            oz119.f(this.f32374o);
                            oz119.a(this.f32374o);
                            pa0G = oz119.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i2119);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH1110 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S1110 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S1110;
                interfaceC3107a1S1110.c(dH1110);
                return;
            case 31:
                listSingletonList = null;
                str2 = null;
                str6 = "application/pgs";
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z1119 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21110 = (z1119 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder1111 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder1111.putShort((short) this.f32336C);
                                byteBufferOrder1111.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz1110 = new com.google.android.gms.internal.ads.Oz0();
                            oz1110.c(this.f32385z);
                            oz1110.b(this.f32335B);
                            oz1110.d(this.f32334A);
                            oz1110.e(bArr);
                            oz1110.f(this.f32374o);
                            oz1110.a(this.f32374o);
                            pa0G = oz1110.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i21110);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH1111 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S1111 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S1111;
                interfaceC3107a1S1111.c(dH1111);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                java.lang.System.arraycopy(i(str5), 0, bArr3, 0, 4);
                listSingletonList = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr3);
                str6 = "application/dvbsubs";
                str2 = null;
                i10 = -1;
                iF = -1;
                if (this.f32348O != null) {
                    str2 = c4751p0A.f37896a;
                    str6 = "video/dolby-vision";
                }
                str4 = str6;
                boolean z11110 = this.f32356W;
                if (true != this.f32355V) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21111 = (z11110 ? 1 : 0) | i13;
                c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                if (!com.google.android.gms.internal.ads.AbstractC3606ed.g(str4)) {
                    if (com.google.android.gms.internal.ads.AbstractC3606ed.i(str4)) {
                        if (this.f32377r == 0) {
                            i17 = this.f32375p;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f32372m;
                            }
                            this.f32375p = i17;
                            i18 = this.f32376q;
                            if (i18 == -1) {
                                i18 = this.f32373n;
                            }
                            this.f32376q = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f32375p;
                        if (i15 != iIntValue) {
                            f6 = -1.0f;
                        } else {
                            f6 = -1.0f;
                        }
                        if (this.f32384y) {
                            if (this.f32338E != -1.0f) {
                                bArr = new byte[25];
                                java.nio.ByteBuffer byteBufferOrder1112 = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.f32338E * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32339F * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32340G * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32341H * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32342I * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32343J * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32344K * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f32345L * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f32346M + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f32347N + 0.5f));
                                byteBufferOrder1112.putShort((short) this.f32336C);
                                byteBufferOrder1112.putShort((short) this.f32337D);
                            }
                            com.google.android.gms.internal.ads.Oz0 oz1111 = new com.google.android.gms.internal.ads.Oz0();
                            oz1111.c(this.f32385z);
                            oz1111.b(this.f32335B);
                            oz1111.d(this.f32334A);
                            oz1111.e(bArr);
                            oz1111.f(this.f32374o);
                            oz1111.a(this.f32374o);
                            pa0G = oz1111.g();
                        }
                        if (this.f32360a != null) {
                            iIntValue = ((java.lang.Integer) com.google.android.gms.internal.ads.X2.f32978j0.get(this.f32360a)).intValue();
                        }
                        if (this.f32378s == 0) {
                            i19 = iIntValue;
                        } else {
                            i19 = iIntValue;
                        }
                        c4682oK0.G(this.f32372m);
                        c4682oK0.k(this.f32373n);
                        c4682oK0.w(f6);
                        c4682oK0.z(i19);
                        c4682oK0.x(this.f32382w);
                        c4682oK0.E(this.f32383x);
                        c4682oK0.b(pa0G);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                        }
                        i14 = 3;
                    }
                    break;
                } else {
                    c4682oK0.r0(this.f32349P);
                    c4682oK0.C(this.f32351R);
                    c4682oK0.u(iF);
                    i14 = 1;
                }
                if (this.f32360a != null) {
                    c4682oK0.o(this.f32360a);
                }
                c4682oK0.l(i6);
                c4682oK0.B(str4);
                c4682oK0.r(i10);
                c4682oK0.q(this.f32357X);
                c4682oK0.D(i21111);
                c4682oK0.n(listSingletonList);
                c4682oK0.a(str2);
                c4682oK0.f(this.f32371l);
                com.google.android.gms.internal.ads.D dH1112 = c4682oK0.H();
                com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S1112 = interfaceC5520w0.S(this.f32362c, i14);
                this.f32358Y = interfaceC3107a1S1112;
                interfaceC3107a1S1112.c(dH1112);
                return;
            default:
                throw com.google.android.gms.internal.ads.C4708of.a("Unrecognized codec identifier.", null);
        }
    }
}
