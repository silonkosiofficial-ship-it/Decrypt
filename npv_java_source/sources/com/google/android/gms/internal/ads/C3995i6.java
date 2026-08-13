package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3995i6 implements com.google.android.gms.internal.ads.InterfaceC3117a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f36226a = new com.google.android.gms.internal.ads.RQ(new byte[5], 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.util.SparseArray f36227b = new android.util.SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.util.SparseIntArray f36228c = new android.util.SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4103j6 f36230e;

    public C3995i6(com.google.android.gms.internal.ads.C4103j6 c4103j6, int i6) {
        this.f36230e = c4103j6;
        this.f36229d = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117a6
    public final void a(com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3117a6
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.C3267bV c3267bV;
        com.google.android.gms.internal.ads.C3267bV c3267bV2;
        int i6;
        if (c5128sR.C() != 2) {
            return;
        }
        com.google.android.gms.internal.ads.C3267bV c3267bV3 = (com.google.android.gms.internal.ads.C3267bV) this.f36230e.f36569b.get(0);
        if ((c5128sR.C() & 128) != 0) {
            c5128sR.m(1);
            int iG = c5128sR.G();
            int i10 = 3;
            c5128sR.m(3);
            c5128sR.g(this.f36226a, 2);
            this.f36226a.n(3);
            int i11 = 13;
            this.f36230e.f36585r = this.f36226a.d(13);
            c5128sR.g(this.f36226a, 2);
            int i12 = 4;
            this.f36226a.n(4);
            int i13 = 12;
            c5128sR.m(this.f36226a.d(12));
            this.f36227b.clear();
            this.f36228c.clear();
            int iR = c5128sR.r();
            while (iR > 0) {
                int i14 = 5;
                c5128sR.g(this.f36226a, 5);
                com.google.android.gms.internal.ads.RQ rq = this.f36226a;
                int iD = rq.d(8);
                rq.n(i10);
                int iD2 = this.f36226a.d(i11);
                this.f36226a.n(i12);
                int iD3 = this.f36226a.d(i13);
                int iT = c5128sR.t();
                int i15 = iT + iD3;
                int iC = 0;
                java.lang.String str = null;
                java.util.ArrayList arrayList = null;
                int i16 = -1;
                while (c5128sR.t() < i15) {
                    int iC2 = c5128sR.C();
                    int iT2 = c5128sR.t() + c5128sR.C();
                    if (iT2 > i15) {
                        break;
                    }
                    if (iC2 == i14) {
                        long jK = c5128sR.K();
                        if (jK == 1094921523) {
                            c3267bV2 = c3267bV3;
                            i16 = 129;
                        } else if (jK == 1161904947) {
                            c3267bV2 = c3267bV3;
                            i16 = 135;
                        } else if (jK == 1094921524) {
                            c3267bV2 = c3267bV3;
                            i16 = 172;
                        } else if (jK == 1212503619) {
                            i6 = 36;
                            c3267bV2 = c3267bV3;
                            i16 = i6;
                        } else {
                            c3267bV2 = c3267bV3;
                        }
                    } else if (iC2 == 106) {
                        c3267bV2 = c3267bV3;
                        i16 = 129;
                    } else if (iC2 == 122) {
                        c3267bV2 = c3267bV3;
                        i16 = 135;
                    } else {
                        if (iC2 == 127) {
                            int iC3 = c5128sR.C();
                            if (iC3 == 21) {
                                c3267bV2 = c3267bV3;
                                i16 = 172;
                            } else if (iC3 == 14) {
                                i6 = 136;
                            } else if (iC3 == 33) {
                                i6 = 139;
                            } else {
                                c3267bV2 = c3267bV3;
                            }
                        } else if (iC2 == 123) {
                            i6 = 138;
                        } else if (iC2 == 10) {
                            java.lang.String strTrim = c5128sR.b(i10, java.nio.charset.StandardCharsets.UTF_8).trim();
                            iC = c5128sR.C();
                            c3267bV2 = c3267bV3;
                            str = strTrim;
                        } else if (iC2 == 89) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (c5128sR.t() < iT2) {
                                java.lang.String strTrim2 = c5128sR.b(i10, java.nio.charset.StandardCharsets.UTF_8).trim();
                                int iC4 = c5128sR.C();
                                com.google.android.gms.internal.ads.C3267bV c3267bV4 = c3267bV3;
                                byte[] bArr = new byte[i12];
                                c5128sR.h(bArr, 0, i12);
                                arrayList2.add(new com.google.android.gms.internal.ads.C4213k6(strTrim2, iC4, bArr));
                                c3267bV3 = c3267bV4;
                                i10 = 3;
                                i12 = 4;
                            }
                            c3267bV2 = c3267bV3;
                            arrayList = arrayList2;
                            i16 = 89;
                        } else {
                            c3267bV2 = c3267bV3;
                            if (iC2 == 111) {
                                i16 = 257;
                            }
                        }
                        c3267bV2 = c3267bV3;
                        i16 = i6;
                    }
                    c5128sR.m(iT2 - c5128sR.t());
                    c3267bV3 = c3267bV2;
                    i10 = 3;
                    i12 = 4;
                    i14 = 5;
                }
                com.google.android.gms.internal.ads.C3267bV c3267bV5 = c3267bV3;
                c5128sR.l(i15);
                com.google.android.gms.internal.ads.C4323l6 c4323l6 = new com.google.android.gms.internal.ads.C4323l6(i16, str, iC, arrayList, java.util.Arrays.copyOfRange(c5128sR.n(), iT, i15));
                if (iD == 6 || iD == 5) {
                    iD = c4323l6.f37064a;
                }
                iR -= iD3 + 5;
                if (!this.f36230e.f36575h.get(iD2)) {
                    com.google.android.gms.internal.ads.InterfaceC4653o6 interfaceC4653o6B = this.f36230e.f36572e.b(iD, c4323l6);
                    this.f36228c.put(iD2, iD2);
                    this.f36227b.put(iD2, interfaceC4653o6B);
                }
                c3267bV3 = c3267bV5;
                i10 = 3;
                i12 = 4;
                i13 = 12;
                i11 = 13;
            }
            com.google.android.gms.internal.ads.C3267bV c3267bV6 = c3267bV3;
            int size = this.f36228c.size();
            int i17 = 0;
            while (i17 < size) {
                android.util.SparseIntArray sparseIntArray = this.f36228c;
                com.google.android.gms.internal.ads.C4103j6 c4103j6 = this.f36230e;
                int iKeyAt = sparseIntArray.keyAt(i17);
                int iValueAt = sparseIntArray.valueAt(i17);
                c4103j6.f36575h.put(iKeyAt, true);
                this.f36230e.f36576i.put(iValueAt, true);
                com.google.android.gms.internal.ads.InterfaceC4653o6 interfaceC4653o6 = (com.google.android.gms.internal.ads.InterfaceC4653o6) this.f36227b.valueAt(i17);
                if (interfaceC4653o6 != null) {
                    com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0 = this.f36230e.f36579l;
                    com.google.android.gms.internal.ads.C4543n6 c4543n6 = new com.google.android.gms.internal.ads.C4543n6(iG, iKeyAt, 8192);
                    c3267bV = c3267bV6;
                    interfaceC4653o6.a(c3267bV, interfaceC5520w0, c4543n6);
                    this.f36230e.f36574g.put(iValueAt, interfaceC4653o6);
                } else {
                    c3267bV = c3267bV6;
                }
                i17++;
                c3267bV6 = c3267bV;
            }
            this.f36230e.f36574g.remove(this.f36229d);
            this.f36230e.f36580m = 0;
            com.google.android.gms.internal.ads.C4103j6 c4103j7 = this.f36230e;
            if (c4103j7.f36580m == 0) {
                c4103j7.f36579l.Q();
                this.f36230e.f36581n = true;
            }
        }
    }
}
