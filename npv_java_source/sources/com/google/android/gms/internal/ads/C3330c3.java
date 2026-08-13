package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3330c3 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f34427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f34428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f34429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f34430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2227Cb f34432j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f34434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f34435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f34436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3549e3 f34438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34439q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f34423a = new com.google.android.gms.internal.ads.C5128sR(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.M0 f34424b = new com.google.android.gms.internal.ads.M0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.I0 f34425c = new com.google.android.gms.internal.ads.I0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f34433k = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K0 f34426d = new com.google.android.gms.internal.ads.K0();

    public C3330c3(int i6) {
        com.google.android.gms.internal.ads.C4641o0 c4641o0 = new com.google.android.gms.internal.ads.C4641o0();
        this.f34427e = c4641o0;
        this.f34430h = c4641o0;
        this.f34436n = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00cf, please report this as an issue */
    private final int b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        int iE;
        int i6;
        int iW;
        com.google.android.gms.internal.ads.C3769g3 c3769g3B;
        com.google.android.gms.internal.ads.I0 i10;
        long jE;
        long jF;
        long jA;
        long j6;
        com.google.android.gms.internal.ads.InterfaceC3549e3 c3111a3;
        long j10;
        long j11;
        int i11;
        int i12;
        com.google.android.gms.internal.ads.C3221b3 c3221b3D;
        com.google.android.gms.internal.ads.InterfaceC3549e3 interfaceC3549e3;
        com.google.android.gms.internal.ads.InterfaceC3549e3 c3111a4;
        long jK;
        if (this.f34431i == 0) {
            try {
                m(interfaceC5300u0, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.f34438p == null) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(this.f34424b.f29626c);
            interfaceC5300u0.N(c5128sR.n(), 0, this.f34424b.f29626c);
            com.google.android.gms.internal.ads.M0 m6 = this.f34424b;
            int i13 = m6.f29624a & 1;
            int i14 = 21;
            int i15 = m6.f29628e;
            if (i13 != 0) {
                if (i15 != 1) {
                    i14 = 36;
                }
            } else if (i15 == 1) {
                i14 = 13;
            }
            if (c5128sR.u() >= i14 + 4) {
                c5128sR.l(i14);
                iW = c5128sR.w();
                if (iW != 1483304551) {
                    if (iW == 1231971951) {
                        iW = 1231971951;
                    } else if (c5128sR.u() >= 40) {
                        c5128sR.l(36);
                        if (c5128sR.w() == 1447187017) {
                            iW = 1447187017;
                        } else {
                            iW = 0;
                        }
                    } else {
                        iW = 0;
                    }
                }
            } else if (c5128sR.u() >= 40) {
                c5128sR.l(36);
                if (c5128sR.w() == 1447187017) {
                    iW = 1447187017;
                } else {
                    iW = 0;
                }
            } else {
                iW = 0;
            }
            if (iW == 1231971951) {
                c3769g3B = com.google.android.gms.internal.ads.C3769g3.b(this.f34424b, c5128sR);
                i10 = this.f34425c;
                if (!i10.a() && (i11 = c3769g3B.f35520d) != -1 && (i12 = c3769g3B.f35521e) != -1) {
                    i10.f28363a = i11;
                    i10.f28364b = i12;
                }
                jE = interfaceC5300u0.e();
                if (interfaceC5300u0.f() != -1) {
                    j10 = c3769g3B.f35519c;
                    if (j10 != -1) {
                        j11 = j10 + jE;
                        if (interfaceC5300u0.f() != j11) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.e("Mp3Extractor", "Data size mismatch between stream (" + interfaceC5300u0.f() + ") and Xing frame (" + j11 + "), using Xing value.");
                        }
                    }
                }
                interfaceC5300u0.I(this.f34424b.f29626c);
                if (iW == 1483304551) {
                    c3111a3 = com.google.android.gms.internal.ads.C3879h3.d(c3769g3B, jE);
                } else {
                    jF = interfaceC5300u0.f();
                    jA = c3769g3B.a();
                    if (jA != -9223372036854775807L) {
                        c3111a3 = null;
                    } else {
                        j6 = c3769g3B.f35519c;
                        if (j6 != -1) {
                            jF = jE + j6;
                        } else if (jF != -1) {
                            j6 = jF - jE;
                        } else {
                            c3111a3 = null;
                        }
                        long j12 = j6 - ((long) c3769g3B.f35517a.f29626c);
                        long j13 = jF;
                        java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;
                        c3111a3 = new com.google.android.gms.internal.ads.C3111a3(j13, jE + ((long) c3769g3B.f35517a.f29626c), com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.EW.M(j12, 8000000L, jA, roundingMode)), com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j12, c3769g3B.f35518b, roundingMode)), false);
                    }
                }
            } else if (iW != 1447187017) {
                if (iW != 1483304551) {
                    interfaceC5300u0.j();
                } else {
                    c3769g3B = com.google.android.gms.internal.ads.C3769g3.b(this.f34424b, c5128sR);
                    i10 = this.f34425c;
                    if (!i10.a()) {
                        i10.f28363a = i11;
                        i10.f28364b = i12;
                    }
                    jE = interfaceC5300u0.e();
                    if (interfaceC5300u0.f() != -1) {
                        j10 = c3769g3B.f35519c;
                        if (j10 != -1) {
                            j11 = j10 + jE;
                            if (interfaceC5300u0.f() != j11) {
                                com.google.android.gms.internal.ads.AbstractC3586eM.e("Mp3Extractor", "Data size mismatch between stream (" + interfaceC5300u0.f() + ") and Xing frame (" + j11 + "), using Xing value.");
                            }
                        }
                    }
                    interfaceC5300u0.I(this.f34424b.f29626c);
                    if (iW == 1483304551) {
                        c3111a3 = com.google.android.gms.internal.ads.C3879h3.d(c3769g3B, jE);
                    } else {
                        jF = interfaceC5300u0.f();
                        jA = c3769g3B.a();
                        if (jA != -9223372036854775807L) {
                            j6 = c3769g3B.f35519c;
                            if (j6 != -1) {
                                jF = jE + j6;
                            } else if (jF != -1) {
                                j6 = jF - jE;
                            }
                            long j14 = j6 - ((long) c3769g3B.f35517a.f29626c);
                            long j15 = jF;
                            java.math.RoundingMode roundingMode2 = java.math.RoundingMode.HALF_UP;
                            c3111a3 = new com.google.android.gms.internal.ads.C3111a3(j15, jE + ((long) c3769g3B.f35517a.f29626c), com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.EW.M(j14, 8000000L, jA, roundingMode2)), com.google.android.gms.internal.ads.AbstractC2466Ij0.b(com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j14, c3769g3B.f35518b, roundingMode2)), false);
                        }
                    }
                }
                c3111a3 = null;
            } else {
                c3111a3 = com.google.android.gms.internal.ads.C3659f3.d(interfaceC5300u0.f(), interfaceC5300u0.e(), this.f34424b, c5128sR);
                interfaceC5300u0.I(this.f34424b.f29626c);
            }
            com.google.android.gms.internal.ads.C2227Cb c2227Cb = this.f34432j;
            long jE2 = interfaceC5300u0.e();
            if (c2227Cb == null) {
                c3221b3D = null;
                break;
            }
            int iA = c2227Cb.a();
            int i16 = 0;
            while (true) {
                if (i16 >= iA) {
                    c3221b3D = null;
                    break;
                }
                com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bbB = c2227Cb.b(i16);
                if (interfaceC3274bbB instanceof com.google.android.gms.internal.ads.C5524w2) {
                    com.google.android.gms.internal.ads.C5524w2 c5524w2 = (com.google.android.gms.internal.ads.C5524w2) interfaceC3274bbB;
                    int iA2 = c2227Cb.a();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= iA2) {
                            jK = -9223372036854775807L;
                            break;
                        }
                        com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bbB2 = c2227Cb.b(i17);
                        if (interfaceC3274bbB2 instanceof com.google.android.gms.internal.ads.A2) {
                            com.google.android.gms.internal.ads.A2 a6 = (com.google.android.gms.internal.ads.A2) interfaceC3274bbB2;
                            if (a6.f38422C.equals("TLEN")) {
                                jK = com.google.android.gms.internal.ads.EW.K(java.lang.Long.parseLong((java.lang.String) a6.f25013E.get(0)));
                                break;
                            }
                        }
                        i17++;
                    }
                    c3221b3D = com.google.android.gms.internal.ads.C3221b3.d(jE2, c5524w2, jK);
                    break;
                }
                i16++;
            }
            if (this.f34439q) {
                c3111a4 = new com.google.android.gms.internal.ads.C3440d3();
            } else {
                if (c3221b3D != null) {
                    interfaceC3549e3 = c3221b3D;
                } else {
                    interfaceC3549e3 = c3111a3 == null ? null : c3111a3;
                }
                if (interfaceC3549e3 != null) {
                    interfaceC3549e3.g();
                    c3111a4 = interfaceC3549e3;
                } else {
                    interfaceC5300u0.N(this.f34423a.n(), 0, 4);
                    this.f34423a.l(0);
                    this.f34424b.a(this.f34423a.w());
                    long jF2 = interfaceC5300u0.f();
                    long jE3 = interfaceC5300u0.e();
                    com.google.android.gms.internal.ads.M0 m10 = this.f34424b;
                    c3111a4 = new com.google.android.gms.internal.ads.C3111a3(jF2, jE3, m10.f29629f, m10.f29626c, false);
                }
            }
            this.f34438p = c3111a4;
            this.f34428f.R(c3111a4);
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.B(this.f34424b.f29625b);
            c4682oK0.r(4096);
            c4682oK0.r0(this.f34424b.f29628e);
            c4682oK0.C(this.f34424b.f29627d);
            c4682oK0.g(this.f34425c.f28363a);
            c4682oK0.h(this.f34425c.f28364b);
            c4682oK0.t(this.f34432j);
            if (this.f34438p.c() != -2147483647) {
                c4682oK0.q0(this.f34438p.c());
            }
            this.f34430h.c(c4682oK0.H());
            this.f34435m = interfaceC5300u0.e();
        } else {
            long j16 = this.f34435m;
            if (j16 != 0) {
                long jE4 = interfaceC5300u0.e();
                if (jE4 < j16) {
                    interfaceC5300u0.I((int) (j16 - jE4));
                }
            }
        }
        int i18 = this.f34437o;
        if (i18 == 0) {
            interfaceC5300u0.j();
            if (l(interfaceC5300u0)) {
                return -1;
            }
            this.f34423a.l(0);
            int iW2 = this.f34423a.w();
            if (!h(iW2, this.f34431i) || com.google.android.gms.internal.ads.N0.b(iW2) == -1) {
                interfaceC5300u0.I(1);
                this.f34431i = 0;
            } else {
                this.f34424b.a(iW2);
                if (this.f34433k == -9223372036854775807L) {
                    this.f34433k = this.f34438p.h(interfaceC5300u0.e());
                }
                i18 = this.f34424b.f29626c;
                this.f34437o = i18;
                this.f34436n = interfaceC5300u0.e() + ((long) i18);
                iE = this.f34430h.e(interfaceC5300u0, i18, true);
                if (iE == -1) {
                    return -1;
                }
                i6 = this.f34437o - iE;
                this.f34437o = i6;
                if (i6 <= 0) {
                    this.f34430h.b(d(this.f34434l), 1, this.f34424b.f29626c, 0, null);
                    this.f34434l += (long) this.f34424b.f29630g;
                    this.f34437o = 0;
                    return 0;
                }
            }
        } else {
            iE = this.f34430h.e(interfaceC5300u0, i18, true);
            if (iE == -1) {
                return -1;
            }
            i6 = this.f34437o - iE;
            this.f34437o = i6;
            if (i6 <= 0) {
                this.f34430h.b(d(this.f34434l), 1, this.f34424b.f29626c, 0, null);
                this.f34434l += (long) this.f34424b.f29630g;
                this.f34437o = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long d(long j6) {
        return this.f34433k + ((j6 * 1000000) / ((long) this.f34424b.f29627d));
    }

    private final void g() {
        com.google.android.gms.internal.ads.InterfaceC3549e3 interfaceC3549e3 = this.f34438p;
        if ((interfaceC3549e3 instanceof com.google.android.gms.internal.ads.C3111a3) && interfaceC3549e3.g()) {
            long j6 = this.f34436n;
            if (j6 == -1 || j6 == this.f34438p.f()) {
                return;
            }
            this.f34438p = ((com.google.android.gms.internal.ads.C3111a3) this.f34438p).i(this.f34436n);
            com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0 = this.f34428f;
            interfaceC5520w0.getClass();
            interfaceC5520w0.R(this.f34438p);
        }
    }

    private static boolean h(int i6, long j6) {
        return ((long) (i6 & (-128000))) == (j6 & (-128000));
    }

    private final boolean l(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.InterfaceC3549e3 interfaceC3549e3 = this.f34438p;
        if (interfaceC3549e3 != null) {
            long jF = interfaceC3549e3.f();
            if (jF != -1 && interfaceC5300u0.d() > jF - 4) {
                return true;
            }
        }
        try {
            return !interfaceC5300u0.L(this.f34423a.n(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private final boolean m(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, boolean z6) throws java.io.EOFException {
        int iD;
        int i6;
        int iB;
        interfaceC5300u0.j();
        if (interfaceC5300u0.e() == 0) {
            com.google.android.gms.internal.ads.C2227Cb c2227CbA = this.f34426d.a(interfaceC5300u0, null);
            this.f34432j = c2227CbA;
            if (c2227CbA != null) {
                this.f34425c.b(c2227CbA);
            }
            iD = (int) interfaceC5300u0.d();
            if (!z6) {
                interfaceC5300u0.I(iD);
            }
            i6 = 0;
        } else {
            iD = 0;
            i6 = 0;
        }
        int i10 = i6;
        int i11 = i10;
        while (true) {
            if (l(interfaceC5300u0)) {
                if (i10 > 0) {
                    break;
                }
                g();
                throw new java.io.EOFException();
            }
            this.f34423a.l(0);
            int iW = this.f34423a.w();
            if ((i6 == 0 || h(iW, i6)) && (iB = com.google.android.gms.internal.ads.N0.b(iW)) != -1) {
                i10++;
                if (i10 != 1) {
                    if (i10 == 4) {
                        break;
                    }
                } else {
                    this.f34424b.a(iW);
                    i6 = iW;
                }
                interfaceC5300u0.D(iB - 4);
            } else {
                int i12 = i11 + 1;
                if (i11 == (true != z6 ? 131072 : 32768)) {
                    if (z6) {
                        return false;
                    }
                    g();
                    throw new java.io.EOFException();
                }
                if (z6) {
                    interfaceC5300u0.j();
                    interfaceC5300u0.D(iD + i12);
                } else {
                    interfaceC5300u0.I(1);
                }
                i6 = 0;
                i11 = i12;
                i10 = 0;
            }
        }
        if (z6) {
            interfaceC5300u0.I(iD + i11);
        } else {
            interfaceC5300u0.j();
        }
        this.f34431i = i6;
        return true;
    }

    public final void a() {
        this.f34439q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f34431i = 0;
        this.f34433k = -9223372036854775807L;
        this.f34434l = 0L;
        this.f34437o = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        com.google.android.gms.internal.ads.LC.b(this.f34429g);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return b(interfaceC5300u0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        return m(interfaceC5300u0, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f34428f = interfaceC5520w0;
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(0, 1);
        this.f34429g = interfaceC3107a1S;
        this.f34430h = interfaceC3107a1S;
        this.f34428f.Q();
    }
}
