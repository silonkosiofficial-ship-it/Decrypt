package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f31520a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayDeque f31521b = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z2 f31522c = new com.google.android.gms.internal.ads.Z2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.T2 f31523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f31526g;

    private final long d(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, int i6) {
        interfaceC5300u0.M(this.f31520a, 0, i6);
        long j6 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            j6 = (j6 << 8) | ((long) (this.f31520a[i10] & 255));
        }
        return j6;
    }

    public final void a(com.google.android.gms.internal.ads.T2 t6) {
        this.f31523d = t6;
    }

    public final void b() {
        this.f31524e = 0;
        this.f31521b.clear();
        this.f31522c.e();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:0: B:3:0x0005->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e A[LOOP:2: B:61:0x0136->B:64:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x014d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0176, please report this as an issue */
    public final boolean c(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        com.google.android.gms.internal.ads.U2 u6;
        com.google.android.gms.internal.ads.X2 x6;
        long j6;
        long j10;
        int i10;
        byte[] bArr;
        java.lang.String str;
        int i11;
        long j11;
        int i12;
        long jD;
        double dLongBitsToDouble;
        int iB;
        int iC;
        com.google.android.gms.internal.ads.LC.b(this.f31523d);
        while (true) {
            com.google.android.gms.internal.ads.Q2 q6 = (com.google.android.gms.internal.ads.Q2) this.f31521b.peek();
            if (q6 != null && interfaceC5300u0.e() >= q6.f30863b) {
                ((com.google.android.gms.internal.ads.U2) this.f31523d).f32084a.g(((com.google.android.gms.internal.ads.Q2) this.f31521b.pop()).f30862a);
                return true;
            }
            int i13 = this.f31524e;
            if (i13 != 0) {
                if (i13 == 1) {
                }
                com.google.android.gms.internal.ads.T2 t6 = this.f31523d;
                i6 = this.f31525f;
                u6 = (com.google.android.gms.internal.ads.U2) t6;
                x6 = u6.f32084a;
                switch (i6) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j6 = this.f31526g;
                        if (j6 <= 8) {
                            u6.f32084a.l(i6, d(interfaceC5300u0, (int) j6));
                            this.f31524e = 0;
                            return true;
                        }
                        throw com.google.android.gms.internal.ads.C4708of.a("Invalid integer size: " + j6, null);
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        j10 = this.f31526g;
                        if (j10 <= 2147483647L) {
                            throw com.google.android.gms.internal.ads.C4708of.a("String element size: " + j10, null);
                        }
                        i10 = (int) j10;
                        if (i10 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i10];
                            interfaceC5300u0.M(bArr, 0, i10);
                            while (i10 > 0) {
                                i11 = i10 - 1;
                                if (bArr[i11] == 0) {
                                    i10 = i11;
                                } else {
                                    str = new java.lang.String(bArr, 0, i10);
                                }
                            }
                            str = new java.lang.String(bArr, 0, i10);
                        }
                        u6.f32084a.n(i6, str);
                        this.f31524e = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jE = interfaceC5300u0.e();
                        this.f31521b.push(new com.google.android.gms.internal.ads.Q2(i6, this.f31526g + jE, null));
                        ((com.google.android.gms.internal.ads.U2) this.f31523d).f32084a.m(this.f31525f, jE, this.f31526g);
                        this.f31524e = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        x6.d(i6, (int) this.f31526g, interfaceC5300u0);
                        this.f31524e = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j11 = this.f31526g;
                        if (j11 == 4 && j11 != 8) {
                            throw com.google.android.gms.internal.ads.C4708of.a("Invalid float size: " + j11, null);
                        }
                        i12 = (int) j11;
                        jD = d(interfaceC5300u0, i12);
                        if (i12 == 4) {
                            dLongBitsToDouble = java.lang.Float.intBitsToFloat((int) jD);
                        } else {
                            dLongBitsToDouble = java.lang.Double.longBitsToDouble(jD);
                        }
                        u6.f32084a.h(i6, dLongBitsToDouble);
                        this.f31524e = 0;
                        return true;
                    default:
                        interfaceC5300u0.I((int) this.f31526g);
                        this.f31524e = 0;
                        break;
                }
            } else {
                long jD2 = this.f31522c.d(interfaceC5300u0, true, false, 4);
                if (jD2 == -2) {
                    interfaceC5300u0.j();
                    while (true) {
                        interfaceC5300u0.N(this.f31520a, 0, 4);
                        iB = com.google.android.gms.internal.ads.Z2.b(this.f31520a[0]);
                        if (iB != -1 && iB <= 4) {
                            iC = (int) com.google.android.gms.internal.ads.Z2.c(this.f31520a, iB, false);
                            com.google.android.gms.internal.ads.X2 x10 = ((com.google.android.gms.internal.ads.U2) this.f31523d).f32084a;
                            if (iC != 357149030 && iC != 524531317 && iC != 475249515) {
                                if (iC == 374648427) {
                                    iC = 374648427;
                                }
                            }
                        }
                        interfaceC5300u0.I(1);
                    }
                    interfaceC5300u0.I(iB);
                    jD2 = iC;
                }
                if (jD2 == -1) {
                    return false;
                }
                this.f31525f = (int) jD2;
                this.f31524e = 1;
            }
            this.f31526g = this.f31522c.d(interfaceC5300u0, false, true, 8);
            this.f31524e = 2;
            com.google.android.gms.internal.ads.T2 t10 = this.f31523d;
            i6 = this.f31525f;
            u6 = (com.google.android.gms.internal.ads.U2) t10;
            x6 = u6.f32084a;
            switch (i6) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j6 = this.f31526g;
                    if (j6 <= 8) {
                        u6.f32084a.l(i6, d(interfaceC5300u0, (int) j6));
                        this.f31524e = 0;
                        return true;
                    }
                    throw com.google.android.gms.internal.ads.C4708of.a("Invalid integer size: " + j6, null);
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    j10 = this.f31526g;
                    if (j10 <= 2147483647L) {
                        throw com.google.android.gms.internal.ads.C4708of.a("String element size: " + j10, null);
                    }
                    i10 = (int) j10;
                    if (i10 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i10];
                        interfaceC5300u0.M(bArr, 0, i10);
                        while (i10 > 0) {
                            i11 = i10 - 1;
                            if (bArr[i11] == 0) {
                                i10 = i11;
                            } else {
                                str = new java.lang.String(bArr, 0, i10);
                            }
                        }
                        str = new java.lang.String(bArr, 0, i10);
                    }
                    u6.f32084a.n(i6, str);
                    this.f31524e = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jE2 = interfaceC5300u0.e();
                    this.f31521b.push(new com.google.android.gms.internal.ads.Q2(i6, this.f31526g + jE2, null));
                    ((com.google.android.gms.internal.ads.U2) this.f31523d).f32084a.m(this.f31525f, jE2, this.f31526g);
                    this.f31524e = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    x6.d(i6, (int) this.f31526g, interfaceC5300u0);
                    this.f31524e = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j11 = this.f31526g;
                    if (j11 == 4) {
                        break;
                    }
                    i12 = (int) j11;
                    jD = d(interfaceC5300u0, i12);
                    if (i12 == 4) {
                        dLongBitsToDouble = java.lang.Float.intBitsToFloat((int) jD);
                    } else {
                        dLongBitsToDouble = java.lang.Double.longBitsToDouble(jD);
                    }
                    u6.f32084a.h(i6, dLongBitsToDouble);
                    this.f31524e = 0;
                    return true;
                default:
                    interfaceC5300u0.I((int) this.f31526g);
                    this.f31524e = 0;
                    break;
            }
        }
    }
}
