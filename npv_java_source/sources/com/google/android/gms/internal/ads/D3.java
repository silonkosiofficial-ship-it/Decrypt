package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class D3 {
    /* JADX WARN: Code duplicated, block: B:131:0x021e A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:9:0x0035, B:11:0x0040, B:15:0x0051, B:19:0x005d, B:25:0x0072, B:28:0x007f, B:31:0x008d, B:33:0x0097, B:41:0x00b2, B:42:0x00c4, B:47:0x00e2, B:65:0x0115, B:67:0x011f, B:69:0x0129, B:71:0x0133, B:75:0x0144, B:77:0x014a, B:79:0x015e, B:80:0x0165, B:82:0x016c, B:87:0x0177, B:92:0x0183, B:131:0x021e, B:93:0x0198, B:95:0x019f, B:97:0x01a9, B:98:0x01bd, B:112:0x01e7, B:127:0x0211), top: B:139:0x0027 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x021e, please report this as an issue */
    public static com.google.android.gms.internal.ads.InterfaceC3274bb a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        java.lang.String str;
        java.lang.String strConcat;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int iT = c5128sR.t() + c5128sR.w();
        int iW = c5128sR.w();
        int i6 = (iW >> 24) & 255;
        com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bbE = null;
        try {
            if (i6 == 169 || i6 == 253) {
                int i10 = iW & 16777215;
                if (i10 == 6516084) {
                    int iW2 = c5128sR.w();
                    if (c5128sR.w() == 1684108385) {
                        c5128sR.m(8);
                        java.lang.String strA = c5128sR.a(iW2 - 16);
                        interfaceC3274bbE = new com.google.android.gms.internal.ads.C4315l2("und", strA, strA);
                    } else {
                        strConcat = "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.N00.a(iW));
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", strConcat);
                    }
                } else {
                    if (i10 == 7233901 || i10 == 7631467) {
                        str = "TIT2";
                    } else if (i10 == 6516589 || i10 == 7828084) {
                        str = "TCOM";
                    } else if (i10 == 6578553) {
                        str = "TDRC";
                    } else if (i10 == 4280916) {
                        str = "TPE1";
                    } else if (i10 == 7630703) {
                        str = "TSSE";
                    } else if (i10 == 6384738) {
                        str = "TALB";
                    } else if (i10 == 7108978) {
                        str = "USLT";
                    } else if (i10 == 6776174) {
                        interfaceC3274bbE = e(iW, "TCON", c5128sR);
                    } else if (i10 == 6779504) {
                        str = "TIT1";
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3586eM.b("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.N00.a(iW));
                    }
                    interfaceC3274bbE = e(iW, str, c5128sR);
                }
            } else if (iW == 1735291493) {
                java.lang.String strA2 = com.google.android.gms.internal.ads.AbstractC5084s2.a(b(c5128sR) - 1);
                if (strA2 != null) {
                    interfaceC3274bbE = new com.google.android.gms.internal.ads.A2("TCON", null, com.google.android.gms.internal.ads.AbstractC3398ci0.P(strA2));
                } else {
                    strConcat = "Failed to parse standard genre code";
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", strConcat);
                }
            } else {
                int i11 = 1684632427;
                if (iW == 1684632427) {
                    str4 = "TPOS";
                } else {
                    i11 = 1953655662;
                    if (iW == 1953655662) {
                        str4 = "TRCK";
                    } else if (iW == 1953329263) {
                        interfaceC3274bbE = c(1953329263, "TBPM", c5128sR, true, false);
                    } else if (iW == 1668311404) {
                        interfaceC3274bbE = c(1668311404, "TCMP", c5128sR, true, true);
                    } else if (iW == 1668249202) {
                        int iW3 = c5128sR.w();
                        if (c5128sR.w() == 1684108385) {
                            int iW4 = c5128sR.w();
                            int i12 = com.google.android.gms.internal.ads.AbstractC5416v3.f39315b;
                            int i13 = iW4 & 16777215;
                            if (i13 == 13) {
                                str3 = "image/jpeg";
                            } else if (i13 == 14) {
                                str3 = "image/png";
                                i13 = 14;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                strConcat = "Unrecognized cover art flags: " + i13;
                            } else {
                                c5128sR.m(4);
                                int i14 = iW3 - 16;
                                byte[] bArr = new byte[i14];
                                c5128sR.h(bArr, 0, i14);
                                interfaceC3274bbE = new com.google.android.gms.internal.ads.C3328c2(str3, null, 3, bArr);
                            }
                        } else {
                            strConcat = "Failed to parse cover art attribute";
                        }
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", strConcat);
                    } else {
                        int i15 = 1631670868;
                        if (iW == 1631670868) {
                            str2 = "TPE2";
                        } else {
                            i15 = 1936682605;
                            if (iW == 1936682605) {
                                str2 = "TSOT";
                            } else {
                                i15 = 1936679276;
                                if (iW == 1936679276) {
                                    str2 = "TSOA";
                                } else {
                                    i15 = 1936679282;
                                    if (iW == 1936679282) {
                                        str2 = "TSOP";
                                    } else {
                                        i15 = 1936679265;
                                        if (iW == 1936679265) {
                                            str2 = "TSO2";
                                        } else {
                                            i15 = 1936679791;
                                            if (iW == 1936679791) {
                                                str2 = "TSOC";
                                            } else if (iW == 1920233063) {
                                                interfaceC3274bbE = c(1920233063, "ITUNESADVISORY", c5128sR, false, false);
                                            } else if (iW == 1885823344) {
                                                interfaceC3274bbE = c(1885823344, "ITUNESGAPLESS", c5128sR, false, true);
                                            } else if (iW == 1936683886) {
                                                interfaceC3274bbE = e(1936683886, "TVSHOWSORT", c5128sR);
                                            } else if (iW == 1953919848) {
                                                interfaceC3274bbE = e(1953919848, "TVSHOW", c5128sR);
                                            } else if (iW == 757935405) {
                                                int i16 = -1;
                                                int i17 = -1;
                                                java.lang.String strA3 = null;
                                                java.lang.String strA4 = null;
                                                while (c5128sR.t() < iT) {
                                                    int iT2 = c5128sR.t();
                                                    int iW5 = c5128sR.w();
                                                    int iW6 = c5128sR.w();
                                                    c5128sR.m(4);
                                                    if (iW6 == 1835360622) {
                                                        strA3 = c5128sR.a(iW5 - 12);
                                                    } else {
                                                        int i18 = iW5 - 12;
                                                        if (iW6 == 1851878757) {
                                                            strA4 = c5128sR.a(i18);
                                                        } else {
                                                            if (iW6 == 1684108385) {
                                                                i17 = iW5;
                                                            }
                                                            if (iW6 == 1684108385) {
                                                                i16 = iT2;
                                                            }
                                                            c5128sR.m(i18);
                                                        }
                                                    }
                                                }
                                                if (strA3 != null && strA4 != null && i16 != -1) {
                                                    c5128sR.l(i16);
                                                    c5128sR.m(16);
                                                    interfaceC3274bbE = new com.google.android.gms.internal.ads.C5304u2(strA3, strA4, c5128sR.a(i17 - 16));
                                                }
                                            } else {
                                                com.google.android.gms.internal.ads.AbstractC3586eM.b("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.N00.a(iW));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        interfaceC3274bbE = e(i15, str2, c5128sR);
                    }
                }
                interfaceC3274bbE = d(i11, str4, c5128sR);
            }
            c5128sR.l(iT);
            return interfaceC3274bbE;
        } catch (java.lang.Throwable th) {
            c5128sR.l(iT);
            throw th;
        }
    }

    private static int b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iW = c5128sR.w();
        if (c5128sR.w() == 1684108385) {
            c5128sR.m(8);
            int i6 = iW - 16;
            if (i6 == 1) {
                return c5128sR.C();
            }
            if (i6 == 2) {
                return c5128sR.G();
            }
            if (i6 == 3) {
                return c5128sR.E();
            }
            if (i6 == 4 && (c5128sR.v() & 128) == 0) {
                return c5128sR.F();
            }
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static com.google.android.gms.internal.ads.AbstractC4974r2 c(int i6, java.lang.String str, com.google.android.gms.internal.ads.C5128sR c5128sR, boolean z6, boolean z10) {
        int iB = b(c5128sR);
        if (z10) {
            iB = java.lang.Math.min(1, iB);
        }
        if (iB >= 0) {
            return z6 ? new com.google.android.gms.internal.ads.A2(str, null, com.google.android.gms.internal.ads.AbstractC3398ci0.P(java.lang.Integer.toString(iB))) : new com.google.android.gms.internal.ads.C4315l2("und", str, java.lang.Integer.toString(iB));
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(com.google.android.gms.internal.ads.N00.a(i6)));
        return null;
    }

    private static com.google.android.gms.internal.ads.A2 d(int i6, java.lang.String str, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iW = c5128sR.w();
        if (c5128sR.w() == 1684108385 && iW >= 22) {
            c5128sR.m(10);
            int iG = c5128sR.G();
            if (iG > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(iG);
                java.lang.String string = sb.toString();
                int iG2 = c5128sR.G();
                if (iG2 > 0) {
                    string = string + "/" + iG2;
                }
                return new com.google.android.gms.internal.ads.A2(str, null, com.google.android.gms.internal.ads.AbstractC3398ci0.P(string));
            }
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(com.google.android.gms.internal.ads.N00.a(i6)));
        return null;
    }

    private static com.google.android.gms.internal.ads.A2 e(int i6, java.lang.String str, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iW = c5128sR.w();
        if (c5128sR.w() == 1684108385) {
            c5128sR.m(8);
            return new com.google.android.gms.internal.ads.A2(str, null, com.google.android.gms.internal.ads.AbstractC3398ci0.P(c5128sR.a(iW - 16)));
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("MetadataUtil", "Failed to parse text attribute: ".concat(com.google.android.gms.internal.ads.N00.a(i6)));
        return null;
    }
}
