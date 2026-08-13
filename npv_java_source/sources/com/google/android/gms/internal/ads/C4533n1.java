package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4533n1 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f37461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4313l1 f37462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f37464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f37466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4643o1 f37467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4863q1[] f37469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4863q1 f37471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f37474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37476p;

    public C4533n1(int i6, com.google.android.gms.internal.ads.InterfaceC4869q4 interfaceC4869q4) {
        this.f37464d = interfaceC4869q4;
        this.f37463c = 1 == (i6 ^ 1);
        this.f37461a = new com.google.android.gms.internal.ads.C5128sR(12);
        this.f37462b = new com.google.android.gms.internal.ads.C4313l1(null);
        this.f37466f = new com.google.android.gms.internal.ads.O0();
        this.f37469i = new com.google.android.gms.internal.ads.C4863q1[0];
        this.f37473m = -1L;
        this.f37474n = -1L;
        this.f37472l = -1;
        this.f37468h = -9223372036854775807L;
    }

    private final com.google.android.gms.internal.ads.C4863q1 b(int i6) {
        for (com.google.android.gms.internal.ads.C4863q1 c4863q1 : this.f37469i) {
            if (c4863q1.f(i6)) {
                return c4863q1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f37470j = -1L;
        this.f37471k = null;
        for (com.google.android.gms.internal.ads.C4863q1 c4863q1 : this.f37469i) {
            c4863q1.e(j6);
        }
        if (j6 == 0) {
            this.f37465e = this.f37469i.length != 0 ? 3 : 0;
        } else {
            this.f37465e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02f8  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        boolean z6;
        int i6;
        int i10;
        com.google.android.gms.internal.ads.C4863q1 c4863q1;
        java.lang.String str;
        long j6;
        long jE;
        long j10 = this.f37470j;
        int i11 = 0;
        if (j10 != -1) {
            long jE2 = interfaceC5300u0.e();
            if (j10 < jE2 || j10 > 262144 + jE2) {
                q6.f30855a = j10;
                z6 = true;
            } else {
                interfaceC5300u0.I((int) (j10 - jE2));
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f37470j = -1L;
        if (z6) {
            return 1;
        }
        int i12 = this.f37465e;
        com.google.android.gms.internal.ads.C4863q1 c4863q2 = null;
        if (i12 == 0) {
            if (!j(interfaceC5300u0)) {
                throw com.google.android.gms.internal.ads.C4708of.a("AVI Header List not found", null);
            }
            interfaceC5300u0.I(12);
            this.f37465e = 1;
            return 0;
        }
        if (i12 == 1) {
            interfaceC5300u0.M(this.f37461a.n(), 0, 12);
            this.f37461a.l(0);
            com.google.android.gms.internal.ads.C4313l1 c4313l1 = this.f37462b;
            com.google.android.gms.internal.ads.C5128sR c5128sR = this.f37461a;
            c4313l1.a(c5128sR);
            int i13 = c4313l1.f37049a;
            if (i13 != 1414744396) {
                throw com.google.android.gms.internal.ads.C4708of.a("LIST expected, found: " + i13, null);
            }
            c4313l1.f37051c = c5128sR.y();
            com.google.android.gms.internal.ads.C4313l1 c4313l2 = this.f37462b;
            int i14 = c4313l2.f37051c;
            if (i14 == 1819436136) {
                this.f37472l = c4313l2.f37050b;
                this.f37465e = 2;
                return 0;
            }
            throw com.google.android.gms.internal.ads.C4708of.a("hdrl expected, found: " + i14, null);
        }
        if (i12 == 2) {
            int i15 = this.f37472l - 4;
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = new com.google.android.gms.internal.ads.C5128sR(i15);
            interfaceC5300u0.M(c5128sR2.n(), 0, i15);
            com.google.android.gms.internal.ads.C4972r1 c4972r1C = com.google.android.gms.internal.ads.C4972r1.c(1819436136, c5128sR2);
            if (c4972r1C.a() != 1819436136) {
                throw com.google.android.gms.internal.ads.C4708of.a("Unexpected header list type " + c4972r1C.a(), null);
            }
            com.google.android.gms.internal.ads.C4643o1 c4643o1 = (com.google.android.gms.internal.ads.C4643o1) c4972r1C.b(com.google.android.gms.internal.ads.C4643o1.class);
            if (c4643o1 == null) {
                throw com.google.android.gms.internal.ads.C4708of.a("AviHeader not found", null);
            }
            this.f37467g = c4643o1;
            this.f37468h = ((long) c4643o1.f37707c) * ((long) c4643o1.f37705a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = c4972r1C.f38419a;
            int size = abstractC3398ci0.size();
            int i16 = 0;
            int i17 = 0;
            while (i16 < size) {
                com.google.android.gms.internal.ads.InterfaceC4093j1 interfaceC4093j1 = (com.google.android.gms.internal.ads.InterfaceC4093j1) abstractC3398ci0.get(i16);
                if (interfaceC4093j1.a() == 1819440243) {
                    com.google.android.gms.internal.ads.C4972r1 c4972r1 = (com.google.android.gms.internal.ads.C4972r1) interfaceC4093j1;
                    int i18 = i17 + 1;
                    com.google.android.gms.internal.ads.C4753p1 c4753p1 = (com.google.android.gms.internal.ads.C4753p1) c4972r1.b(com.google.android.gms.internal.ads.C4753p1.class);
                    com.google.android.gms.internal.ads.C5082s1 c5082s1 = (com.google.android.gms.internal.ads.C5082s1) c4972r1.b(com.google.android.gms.internal.ads.C5082s1.class);
                    if (c4753p1 == null) {
                        str = "Missing Stream Header";
                    } else {
                        if (c5082s1 == null) {
                            str = "Missing Stream Format";
                        } else {
                            int i19 = c4753p1.f37900d;
                            int i20 = c4753p1.f37898b;
                            int i21 = c4753p1.f37899c;
                            com.google.android.gms.internal.ads.D d6 = c5082s1.f38612a;
                            i6 = i18;
                            long jM = com.google.android.gms.internal.ads.EW.M(i19, ((long) i20) * 1000000, i21, java.math.RoundingMode.DOWN);
                            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
                            c4682oK0B.l(i17);
                            int i22 = c4753p1.f37901e;
                            if (i22 != 0) {
                                c4682oK0B.r(i22);
                            }
                            com.google.android.gms.internal.ads.C5192t1 c5192t1 = (com.google.android.gms.internal.ads.C5192t1) c4972r1.b(com.google.android.gms.internal.ads.C5192t1.class);
                            if (c5192t1 != null) {
                                c4682oK0B.o(c5192t1.f38846a);
                            }
                            int iB = com.google.android.gms.internal.ads.AbstractC3606ed.b(d6.f26574o);
                            if (iB == 1) {
                                i10 = iB;
                            } else if (iB == 2) {
                                i10 = 2;
                            } else {
                                c4863q1 = null;
                            }
                            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = this.f37466f.S(i17, i10);
                            interfaceC3107a1S.c(c4682oK0B.H());
                            c4863q1 = new com.google.android.gms.internal.ads.C4863q1(i17, i10, jM, c4753p1.f37900d, interfaceC3107a1S);
                            this.f37468h = java.lang.Math.max(this.f37468h, jM);
                        }
                        if (c4863q1 != null) {
                            arrayList.add(c4863q1);
                        }
                        i17 = i6;
                    }
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("AviExtractor", str);
                    c4863q1 = c4863q2;
                    i6 = i18;
                    if (c4863q1 != null) {
                        arrayList.add(c4863q1);
                    }
                    i17 = i6;
                }
                i16++;
                c4863q2 = null;
                i11 = 0;
            }
            int i23 = i11;
            this.f37469i = (com.google.android.gms.internal.ads.C4863q1[]) arrayList.toArray(new com.google.android.gms.internal.ads.C4863q1[i23]);
            this.f37466f.Q();
            this.f37465e = 3;
            return i23;
        }
        if (i12 == 3) {
            long j11 = this.f37473m;
            if (j11 != -1 && interfaceC5300u0.e() != j11) {
                this.f37470j = j11;
                return 0;
            }
            interfaceC5300u0.N(this.f37461a.n(), 0, 12);
            interfaceC5300u0.j();
            this.f37461a.l(0);
            this.f37462b.a(this.f37461a);
            com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f37461a;
            com.google.android.gms.internal.ads.C4313l1 c4313l3 = this.f37462b;
            int iY = c5128sR3.y();
            int i24 = c4313l3.f37049a;
            if (i24 == 1179011410) {
                interfaceC5300u0.I(12);
                return 0;
            }
            if (i24 != 1414744396 || iY != 1769369453) {
                this.f37470j = interfaceC5300u0.e() + ((long) this.f37462b.f37050b) + 8;
                return 0;
            }
            long jE3 = interfaceC5300u0.e();
            this.f37473m = jE3;
            long j12 = jE3 + ((long) this.f37462b.f37050b) + 8;
            this.f37474n = j12;
            if (!this.f37476p) {
                com.google.android.gms.internal.ads.C4643o1 c4643o2 = this.f37467g;
                c4643o2.getClass();
                if ((c4643o2.f37706b & 16) == 16) {
                    this.f37465e = 4;
                    this.f37470j = j12;
                    return 0;
                }
                this.f37466f.R(new com.google.android.gms.internal.ads.S0(this.f37468h, 0L));
                this.f37476p = true;
            }
            this.f37470j = interfaceC5300u0.e() + 12;
            this.f37465e = 6;
            return 0;
        }
        if (i12 == 4) {
            interfaceC5300u0.M(this.f37461a.n(), 0, 8);
            this.f37461a.l(0);
            com.google.android.gms.internal.ads.C5128sR c5128sR4 = this.f37461a;
            int iY2 = c5128sR4.y();
            int iY3 = c5128sR4.y();
            if (iY2 == 829973609) {
                this.f37465e = 5;
                this.f37475o = iY3;
            } else {
                this.f37470j = interfaceC5300u0.e() + ((long) iY3);
            }
            return 0;
        }
        if (i12 == 5) {
            com.google.android.gms.internal.ads.C5128sR c5128sR5 = new com.google.android.gms.internal.ads.C5128sR(this.f37475o);
            interfaceC5300u0.M(c5128sR5.n(), 0, this.f37475o);
            if (c5128sR5.r() < 16) {
                j6 = 0;
            } else {
                int iT = c5128sR5.t();
                c5128sR5.m(8);
                long jY = c5128sR5.y();
                long j13 = this.f37473m;
                j6 = jY > j13 ? 0L : j13 + 8;
                c5128sR5.l(iT);
            }
            while (c5128sR5.r() >= 16) {
                int iY4 = c5128sR5.y();
                int iY5 = c5128sR5.y();
                long jY2 = ((long) c5128sR5.y()) + j6;
                c5128sR5.y();
                com.google.android.gms.internal.ads.C4863q1 c4863q1B = b(iY4);
                if (c4863q1B != null) {
                    c4863q1B.b(jY2, (iY5 & 16) == 16);
                }
            }
            for (com.google.android.gms.internal.ads.C4863q1 c4863q3 : this.f37469i) {
                c4863q3.c();
            }
            this.f37476p = true;
            this.f37466f.R(new com.google.android.gms.internal.ads.C4203k1(this, this.f37468h));
            this.f37465e = 6;
            this.f37470j = this.f37473m;
            return 0;
        }
        if (interfaceC5300u0.e() >= this.f37474n) {
            return -1;
        }
        com.google.android.gms.internal.ads.C4863q1 c4863q4 = this.f37471k;
        if (c4863q4 != null) {
            if (!c4863q4.g(interfaceC5300u0)) {
                return 0;
            }
            this.f37471k = null;
            return 0;
        }
        if ((interfaceC5300u0.e() & 1) == 1) {
            interfaceC5300u0.I(1);
        }
        interfaceC5300u0.N(this.f37461a.n(), 0, 12);
        this.f37461a.l(0);
        int iY6 = this.f37461a.y();
        if (iY6 == 1414744396) {
            this.f37461a.l(8);
            interfaceC5300u0.I(this.f37461a.y() != 1769369453 ? 8 : 12);
            interfaceC5300u0.j();
            return 0;
        }
        int iY7 = this.f37461a.y();
        if (iY6 == 1263424842) {
            jE = interfaceC5300u0.e() + ((long) iY7) + 8;
        } else {
            interfaceC5300u0.I(8);
            interfaceC5300u0.j();
            com.google.android.gms.internal.ads.C4863q1 c4863q1B2 = b(iY6);
            if (c4863q1B2 != null) {
                c4863q1B2.d(iY7);
                this.f37471k = c4863q1B2;
                return 0;
            }
            jE = interfaceC5300u0.e() + ((long) iY7);
        }
        this.f37470j = jE;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        interfaceC5300u0.N(this.f37461a.n(), 0, 12);
        this.f37461a.l(0);
        if (this.f37461a.y() != 1179011410) {
            return false;
        }
        this.f37461a.m(4);
        return this.f37461a.y() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f37465e = 0;
        if (this.f37463c) {
            interfaceC5520w0 = new com.google.android.gms.internal.ads.C5198t4(interfaceC5520w0, this.f37464d);
        }
        this.f37466f = interfaceC5520w0;
        this.f37470j = -1L;
    }
}
