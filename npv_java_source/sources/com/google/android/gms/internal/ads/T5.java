package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T5 implements com.google.android.gms.internal.ads.InterfaceC4653o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5750y5 f31860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f31861b = new com.google.android.gms.internal.ads.RQ(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31862c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3267bV f31864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31870k;

    public T5(com.google.android.gms.internal.ads.InterfaceC5750y5 interfaceC5750y5) {
        this.f31860a = interfaceC5750y5;
    }

    private final void e(int i6) {
        this.f31862c = i6;
        this.f31863d = 0;
    }

    private final boolean f(com.google.android.gms.internal.ads.C5128sR c5128sR, byte[] bArr, int i6) {
        int iMin = java.lang.Math.min(c5128sR.r(), i6 - this.f31863d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c5128sR.m(iMin);
        } else {
            c5128sR.h(bArr, this.f31863d, iMin);
        }
        int i10 = this.f31863d + iMin;
        this.f31863d = i10;
        return i10 == i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4653o6
    public final void a(com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        this.f31864e = c3267bV;
        this.f31860a.c(interfaceC5520w0, c4543n6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.RQ] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.ads.y5] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4653o6
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        int i10;
        ?? r6;
        int i11;
        int i12;
        int i13;
        ?? r10;
        long jB;
        com.google.android.gms.internal.ads.LC.b(this.f31864e);
        int i14 = -1;
        int i15 = 2;
        ?? r11 = 0;
        int i16 = 1;
        if ((i6 & 1) != 0) {
            int i17 = this.f31862c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    int i18 = this.f31869j;
                    if (i18 != -1) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("PesReader", "Unexpected start indicator: expected " + i18 + " more bytes");
                    }
                    this.f31860a.a(c5128sR.u() == 0);
                } else {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            e(1);
        }
        int i19 = i6;
        while (c5128sR.r() > 0) {
            int i20 = this.f31862c;
            if (i20 == 0) {
                i10 = i15;
                r6 = r11;
                i11 = i16;
                c5128sR.m(c5128sR.r());
            } else if (i20 != i16) {
                if (i20 != i15) {
                    int iR = c5128sR.r();
                    int i21 = this.f31869j;
                    if (i21 == i14) {
                        r10 = r11;
                    } else {
                        i13 = iR - i21;
                    }
                    if (r10 > 0) {
                        r10 = i13;
                        iR -= r10;
                        c5128sR.k(c5128sR.t() + iR);
                    }
                    r10 = i13;
                    this.f31860a.b(c5128sR);
                    int i22 = this.f31869j;
                    if (i22 != i14) {
                        int i23 = i22 - iR;
                        this.f31869j = i23;
                        if (i23 == 0) {
                            this.f31860a.a(r11);
                            e(i16);
                        }
                    }
                } else {
                    if (f(c5128sR, this.f31861b.f31264a, java.lang.Math.min(10, this.f31868i)) && f(c5128sR, null, this.f31868i)) {
                        this.f31861b.l(r11);
                        if (this.f31865f) {
                            this.f31861b.n(4);
                            long jD = this.f31861b.d(3);
                            this.f31861b.n(i16);
                            int iD = this.f31861b.d(15) << 15;
                            this.f31861b.n(i16);
                            long jD2 = this.f31861b.d(15);
                            this.f31861b.n(i16);
                            if (!this.f31867h && this.f31866g) {
                                this.f31861b.n(4);
                                long jD3 = ((long) this.f31861b.d(3)) << 30;
                                this.f31861b.n(i16);
                                int iD2 = this.f31861b.d(15) << 15;
                                this.f31861b.n(i16);
                                long jD4 = this.f31861b.d(15);
                                this.f31861b.n(i16);
                                this.f31864e.b(jD3 | ((long) iD2) | jD4);
                                this.f31867h = true;
                            }
                            jB = this.f31864e.b((jD << 30) | ((long) iD) | jD2);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i19 |= true != this.f31870k ? 0 : 4;
                        this.f31860a.e(jB, i19);
                        e(3);
                        i14 = -1;
                        i15 = 2;
                        r11 = 0;
                        i16 = 1;
                    }
                }
                i10 = i15;
                r6 = r11;
                i11 = i16;
            } else if (f(c5128sR, this.f31861b.f31264a, 9)) {
                r6 = 0;
                this.f31861b.l(0);
                int iD3 = this.f31861b.d(24);
                i11 = 1;
                if (iD3 != 1) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("PesReader", "Unexpected start code prefix: " + iD3);
                    i14 = -1;
                    this.f31869j = -1;
                    i12 = 0;
                    i10 = 2;
                } else {
                    this.f31861b.n(8);
                    com.google.android.gms.internal.ads.RQ rq = this.f31861b;
                    int iD4 = rq.d(16);
                    rq.n(5);
                    this.f31870k = this.f31861b.p();
                    i10 = 2;
                    this.f31861b.n(2);
                    this.f31865f = this.f31861b.p();
                    this.f31866g = this.f31861b.p();
                    this.f31861b.n(6);
                    int iD5 = this.f31861b.d(8);
                    this.f31868i = iD5;
                    if (iD4 == 0) {
                        this.f31869j = -1;
                        i14 = -1;
                    } else {
                        int i24 = (iD4 - 3) - iD5;
                        this.f31869j = i24;
                        if (i24 < 0) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("PesReader", "Found negative packet payload size: " + i24);
                            i14 = -1;
                            this.f31869j = -1;
                        } else {
                            i14 = -1;
                        }
                    }
                    i12 = 2;
                }
                e(i12);
            } else {
                i14 = -1;
                r6 = 0;
                i11 = 1;
                i10 = 2;
            }
            i16 = i11;
            r11 = r6;
            i15 = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4653o6
    public final void c() {
        this.f31862c = 0;
        this.f31863d = 0;
        this.f31867h = false;
        this.f31860a.d();
    }

    public final boolean d(boolean z6) {
        return this.f31862c == 3 && this.f31869j == -1;
    }
}
