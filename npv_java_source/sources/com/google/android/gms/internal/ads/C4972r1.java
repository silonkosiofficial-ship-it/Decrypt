package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4972r1 implements com.google.android.gms.internal.ads.InterfaceC4093j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 f38419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38420b;

    private C4972r1(int i6, com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0) {
        this.f38420b = i6;
        this.f38419a = abstractC3398ci0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.internal.ads.C4972r1 c(int i6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        java.lang.String strConcat;
        int iA;
        java.lang.String str;
        com.google.android.gms.internal.ads.InterfaceC4093j1 c5082s1;
        java.lang.StringBuilder sb;
        java.lang.String str2;
        java.lang.String str3;
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        int iU = c5128sR.u();
        int i10 = -2;
        while (c5128sR.r() > 8) {
            int iY = c5128sR.y();
            int iT = c5128sR.t() + c5128sR.y();
            c5128sR.k(iT);
            if (iY != 1414744396) {
                com.google.android.gms.internal.ads.C5082s1 c5082s2 = null;
                switch (iY) {
                    case 1718776947:
                        if (i10 == 2) {
                            c5128sR.m(4);
                            int iY2 = c5128sR.y();
                            int iY3 = c5128sR.y();
                            c5128sR.m(4);
                            iA = c5128sR.y();
                            switch (iA) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str3 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str3 = "video/avc";
                                    break;
                                case 842289229:
                                    str3 = "video/mp42";
                                    break;
                                case 859066445:
                                    str3 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str3 = "video/mjpeg";
                                    break;
                                default:
                                    str3 = null;
                                    break;
                            }
                            if (str3 == null) {
                                sb = new java.lang.StringBuilder();
                                str2 = "Ignoring track with unsupported compression ";
                            } else {
                                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                                c4682oK0.G(iY2);
                                c4682oK0.k(iY3);
                                c4682oK0.B(str3);
                                c5082s2 = new com.google.android.gms.internal.ads.C5082s1(c4682oK0.H());
                            }
                            c5082s1 = c5082s2;
                        } else if (i10 != 1) {
                            strConcat = "Ignoring strf box for unsupported track type: ".concat(com.google.android.gms.internal.ads.EW.d(i10));
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("StreamFormatChunk", strConcat);
                            c5082s1 = c5082s2;
                        } else {
                            iA = c5128sR.A();
                            if (iA == 1) {
                                str = "audio/raw";
                            } else if (iA == 85) {
                                str = "audio/mpeg";
                            } else if (iA == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iA != 8192) {
                                str = iA != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str != null) {
                                int iA2 = c5128sR.A();
                                int iY4 = c5128sR.y();
                                c5128sR.m(6);
                                int iF = com.google.android.gms.internal.ads.EW.F(c5128sR.A());
                                int iA3 = c5128sR.r() > 0 ? c5128sR.A() : 0;
                                byte[] bArr = new byte[iA3];
                                c5128sR.h(bArr, 0, iA3);
                                com.google.android.gms.internal.ads.C4682oK0 c4682oK1 = new com.google.android.gms.internal.ads.C4682oK0();
                                c4682oK1.B(str);
                                c4682oK1.r0(iA2);
                                c4682oK1.C(iY4);
                                if ("audio/raw".equals(str) && iF != 0) {
                                    c4682oK1.u(iF);
                                }
                                if ("audio/mp4a-latm".equals(str) && iA3 > 0) {
                                    c4682oK1.n(com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr));
                                }
                                c5082s1 = new com.google.android.gms.internal.ads.C5082s1(c4682oK1.H());
                            } else {
                                sb = new java.lang.StringBuilder();
                                str2 = "Ignoring track with unsupported format tag ";
                            }
                        }
                        sb.append(str2);
                        sb.append(iA);
                        strConcat = sb.toString();
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("StreamFormatChunk", strConcat);
                        c5082s1 = c5082s2;
                        break;
                    case 1751742049:
                        c5082s1 = com.google.android.gms.internal.ads.C4643o1.b(c5128sR);
                        break;
                    case 1752331379:
                        c5082s1 = com.google.android.gms.internal.ads.C4753p1.b(c5128sR);
                        break;
                    case 1852994675:
                        c5082s1 = com.google.android.gms.internal.ads.C5192t1.b(c5128sR);
                        break;
                    default:
                        c5082s1 = c5082s2;
                        break;
                }
            } else {
                c5082s1 = c(c5128sR.y(), c5128sR);
            }
            if (c5082s1 != null) {
                if (c5082s1.a() == 1752331379) {
                    int i11 = ((com.google.android.gms.internal.ads.C4753p1) c5082s1).f37897a;
                    if (i11 == 1935960438) {
                        i10 = 2;
                    } else if (i11 == 1935963489) {
                        i10 = 1;
                    } else if (i11 != 1937012852) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i11))));
                        i10 = -1;
                    } else {
                        i10 = 3;
                    }
                }
                c3083Zh0.g(c5082s1);
            }
            c5128sR.l(iT);
            c5128sR.k(iU);
        }
        return new com.google.android.gms.internal.ads.C4972r1(i6, c3083Zh0.j());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4093j1
    public final int a() {
        return this.f38420b;
    }

    public final com.google.android.gms.internal.ads.InterfaceC4093j1 b(java.lang.Class cls) {
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = this.f38419a;
        int size = abstractC3398ci0.size();
        int i6 = 0;
        while (i6 < size) {
            com.google.android.gms.internal.ads.InterfaceC4093j1 interfaceC4093j1 = (com.google.android.gms.internal.ads.InterfaceC4093j1) abstractC3398ci0.get(i6);
            i6++;
            if (interfaceC4093j1.getClass() == cls) {
                return interfaceC4093j1;
            }
        }
        return null;
    }
}
