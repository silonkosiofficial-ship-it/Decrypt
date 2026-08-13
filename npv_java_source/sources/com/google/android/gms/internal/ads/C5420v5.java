package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5420v5 implements com.google.android.gms.internal.ads.InterfaceC4433m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f39324a;

    public C5420v5(int i6, java.util.List list) {
        this.f39324a = list;
    }

    private final com.google.android.gms.internal.ads.C3446d6 c(com.google.android.gms.internal.ads.C4323l6 c4323l6) {
        return new com.google.android.gms.internal.ads.C3446d6(e(c4323l6));
    }

    private final com.google.android.gms.internal.ads.C4982r6 d(com.google.android.gms.internal.ads.C4323l6 c4323l6) {
        return new com.google.android.gms.internal.ads.C4982r6(e(c4323l6));
    }

    private final java.util.List e(com.google.android.gms.internal.ads.C4323l6 c4323l6) {
        java.lang.String str;
        int i6;
        java.util.List listSingletonList;
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(c4323l6.f37068e);
        java.util.List arrayList = this.f39324a;
        while (c5128sR.r() > 0) {
            int iC = c5128sR.C();
            int iT = c5128sR.t() + c5128sR.C();
            if (iC == 134) {
                arrayList = new java.util.ArrayList();
                int iC2 = c5128sR.C() & 31;
                for (int i10 = 0; i10 < iC2; i10++) {
                    java.lang.String strB = c5128sR.b(3, java.nio.charset.StandardCharsets.UTF_8);
                    int iC3 = c5128sR.C();
                    boolean z6 = (iC3 & 128) != 0;
                    if (z6) {
                        i6 = iC3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i6 = 1;
                    }
                    byte bC = (byte) c5128sR.C();
                    c5128sR.m(1);
                    if (z6) {
                        int i11 = bC & 64;
                        int i12 = com.google.android.gms.internal.ads.ND.f30202d;
                        listSingletonList = java.util.Collections.singletonList(i11 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                    c4682oK0.B(str);
                    c4682oK0.q(strB);
                    c4682oK0.p0(i6);
                    c4682oK0.n(listSingletonList);
                    arrayList.add(c4682oK0.H());
                }
            }
            c5128sR.l(iT);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4433m6
    public final android.util.SparseArray a() {
        return new android.util.SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4433m6
    public final com.google.android.gms.internal.ads.InterfaceC4653o6 b(int i6, com.google.android.gms.internal.ads.C4323l6 c4323l6) {
        if (i6 != 2) {
            if (i6 == 3 || i6 == 4) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.K5(c4323l6.f37065b, c4323l6.a()));
            }
            if (i6 == 21) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.I5());
            }
            if (i6 == 27) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.F5(c(c4323l6), false, false));
            }
            if (i6 == 36) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.H5(c(c4323l6)));
            }
            if (i6 == 45) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.L5());
            }
            if (i6 == 89) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.C5640x5(c4323l6.f37067d));
            }
            if (i6 == 172) {
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.C5090s5(c4323l6.f37065b, c4323l6.a()));
            }
            if (i6 == 257) {
                return new com.google.android.gms.internal.ads.C3227b6(new com.google.android.gms.internal.ads.S5("application/vnd.dvb.ait"));
            }
            if (i6 != 128) {
                if (i6 != 129) {
                    if (i6 != 138) {
                        if (i6 == 139) {
                            return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.C5530w5(c4323l6.f37065b, c4323l6.a(), 5408));
                        }
                        switch (i6) {
                            case 15:
                                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.C5310u5(false, c4323l6.f37065b, c4323l6.a()));
                            case 16:
                                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.D5(d(c4323l6)));
                            case 17:
                                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.J5(c4323l6.f37065b, c4323l6.a()));
                            default:
                                switch (i6) {
                                    case 134:
                                        return new com.google.android.gms.internal.ads.C3227b6(new com.google.android.gms.internal.ads.S5("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.C5530w5(c4323l6.f37065b, c4323l6.a(), 4096));
                }
                return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.C4871q5(c4323l6.f37065b, c4323l6.a()));
            }
        }
        return new com.google.android.gms.internal.ads.T5(new com.google.android.gms.internal.ads.A5(d(c4323l6)));
    }
}
