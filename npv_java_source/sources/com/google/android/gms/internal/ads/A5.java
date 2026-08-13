package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class A5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double[] f25037q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f25038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f25039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4982r6 f25040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f25042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f25043f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5860z5 f25044g = new com.google.android.gms.internal.ads.C5860z5(128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f25049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f25050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f25051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25053p;

    A5(com.google.android.gms.internal.ads.C4982r6 c4982r6) {
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        this.f25040c = c4982r6;
        if (c4982r6 != null) {
            this.f25042e = new com.google.android.gms.internal.ads.R5(178, 128);
            c5128sR = new com.google.android.gms.internal.ads.C5128sR();
        } else {
            c5128sR = null;
            this.f25042e = null;
        }
        this.f25041d = c5128sR;
        this.f25049l = -9223372036854775807L;
        this.f25051n = -9223372036854775807L;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
        com.google.android.gms.internal.ads.LC.b(this.f25039b);
        if (z6) {
            boolean z10 = this.f25052o;
            long j6 = this.f25045h - this.f25050m;
            this.f25039b.b(this.f25051n, z10 ? 1 : 0, (int) j6, 0, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x017e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        boolean z6;
        boolean z10;
        int i6;
        float f6;
        int i10;
        int i11;
        char c6 = 4;
        com.google.android.gms.internal.ads.LC.b(this.f25039b);
        int iT = c5128sR.t();
        int iU = c5128sR.u();
        byte[] bArrN = c5128sR.n();
        this.f25045h += (long) c5128sR.r();
        this.f25039b.a(c5128sR, c5128sR.r());
        while (true) {
            int iA = com.google.android.gms.internal.ads.AbstractC4371lb0.a(bArrN, iT, iU, this.f25043f);
            if (iA == iU) {
                break;
            }
            int i12 = iA + 3;
            int i13 = c5128sR.n()[i12] & 255;
            int i14 = iA - iT;
            if (this.f25047j) {
                i14 = i14;
            } else {
                if (i14 > 0) {
                    this.f25044g.a(bArrN, iT, iA);
                }
                if (this.f25044g.c(i13, i14 < 0 ? -i14 : 0)) {
                    com.google.android.gms.internal.ads.C5860z5 c5860z5 = this.f25044g;
                    java.lang.String str = this.f25038a;
                    str.getClass();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(c5860z5.f40209d, c5860z5.f40207b);
                    int i15 = bArrCopyOf[c6] & 255;
                    byte b6 = bArrCopyOf[5];
                    int i16 = bArrCopyOf[6] & 255;
                    int i17 = ((b6 & 255) >> 4) | (i15 << 4);
                    int i18 = (bArrCopyOf[7] & 240) >> 4;
                    int i19 = i16 | ((b6 & 15) << 8);
                    if (i18 != 2) {
                        if (i18 == 3) {
                            i10 = i19 * 16;
                            i11 = i17 * 9;
                        } else if (i18 != 4) {
                            f6 = 1.0f;
                        } else {
                            i10 = i19 * 121;
                            i11 = i17 * 100;
                        }
                        f6 = i10 / i11;
                    } else {
                        f6 = (i19 * 4) / (i17 * 3);
                    }
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                    c4682oK0.m(str);
                    c4682oK0.B("video/mpeg2");
                    c4682oK0.G(i17);
                    c4682oK0.k(i19);
                    c4682oK0.w(f6);
                    c4682oK0.n(java.util.Collections.singletonList(bArrCopyOf));
                    com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                    int i20 = (bArrCopyOf[7] & 15) - 1;
                    long j6 = 0;
                    if (i20 < 0 || i20 >= 8) {
                        i14 = i14;
                    } else {
                        double d6 = f25037q[i20];
                        byte b10 = bArrCopyOf[c5860z5.f40208c + 9];
                        int i21 = (b10 & 96) >> 5;
                        int i22 = b10 & 31;
                        if (i21 != i22) {
                            d6 *= (((double) i21) + 1.0d) / ((double) (i22 + 1));
                        }
                        j6 = (long) (1000000.0d / d6);
                    }
                    android.util.Pair pairCreate = android.util.Pair.create(dH, java.lang.Long.valueOf(j6));
                    this.f25039b.c((com.google.android.gms.internal.ads.D) pairCreate.first);
                    this.f25048k = ((java.lang.Long) pairCreate.second).longValue();
                    this.f25047j = true;
                } else {
                    i14 = i14;
                }
            }
            com.google.android.gms.internal.ads.R5 r6 = this.f25042e;
            if (r6 != null) {
                if (i14 > 0) {
                    r6.a(bArrN, iT, iA);
                    i6 = 0;
                } else {
                    i6 = -i14;
                }
                if (this.f25042e.d(i6)) {
                    com.google.android.gms.internal.ads.R5 r10 = this.f25042e;
                    int iB = com.google.android.gms.internal.ads.AbstractC4371lb0.b(r10.f31121d, r10.f31122e);
                    com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f25041d;
                    int i23 = com.google.android.gms.internal.ads.EW.f27061a;
                    c5128sR2.j(this.f25042e.f31121d, iB);
                    this.f25040c.a(this.f25051n, this.f25041d);
                }
                if (i13 == 178) {
                    if (c5128sR.n()[iA + 2] == 1) {
                        this.f25042e.c(178);
                    }
                    i13 = 178;
                }
            }
            if (i13 == 0 || i13 == 179) {
                int i24 = iU - iA;
                if (this.f25053p && this.f25047j) {
                    long j10 = this.f25051n;
                    if (j10 != -9223372036854775807L) {
                        this.f25039b.b(j10, this.f25052o ? 1 : 0, ((int) (this.f25045h - this.f25050m)) - i24, i24, null);
                    }
                }
                if (!this.f25046i || this.f25053p) {
                    this.f25050m = this.f25045h - ((long) i24);
                    long j11 = this.f25049l;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.f25051n;
                        j11 = j12 != -9223372036854775807L ? j12 + this.f25048k : -9223372036854775807L;
                    }
                    this.f25051n = j11;
                    z6 = false;
                    this.f25052o = false;
                    this.f25049l = -9223372036854775807L;
                    z10 = true;
                    this.f25046i = true;
                } else {
                    z6 = false;
                    z10 = true;
                }
                this.f25053p = i13 == 0 ? z10 : z6;
            } else if (i13 == 184) {
                this.f25052o = true;
            }
            iT = i12;
            c6 = 4;
        }
        if (!this.f25047j) {
            this.f25044g.a(bArrN, iT, iU);
        }
        com.google.android.gms.internal.ads.R5 r11 = this.f25042e;
        if (r11 != null) {
            r11.a(bArrN, iT, iU);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f25038a = c4543n6.b();
        this.f25039b = interfaceC5520w0.S(c4543n6.a(), 2);
        com.google.android.gms.internal.ads.C4982r6 c4982r6 = this.f25040c;
        if (c4982r6 != null) {
            c4982r6.b(interfaceC5520w0, c4543n6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        com.google.android.gms.internal.ads.AbstractC4371lb0.h(this.f25043f);
        this.f25044g.b();
        com.google.android.gms.internal.ads.R5 r6 = this.f25042e;
        if (r6 != null) {
            r6.b();
        }
        this.f25045h = 0L;
        this.f25046i = false;
        this.f25049l = -9223372036854775807L;
        this.f25051n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f25049l = j6;
    }
}
