package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class K3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C2755Qg0 f28816d = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c(':'));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C2755Qg0 f28817e = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c('*'));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f28818a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28819b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28820c;

    public final int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6, java.util.List list) throws com.google.android.gms.internal.ads.C4708of {
        long j6;
        byte b6;
        char c6;
        int i6 = this.f28819b;
        if (i6 == 0) {
            long jF = interfaceC5300u0.f();
            q6.f30855a = (jF == -1 || jF < 8) ? 0L : jF - 8;
            this.f28819b = 1;
            return 1;
        }
        int i10 = 2;
        if (i6 == 1) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(8);
            interfaceC5300u0.M(c5128sR.n(), 0, 8);
            this.f28820c = c5128sR.y() + 8;
            if (c5128sR.w() == 1397048916) {
                q6.f30855a = interfaceC5300u0.e() - ((long) (this.f28820c - 12));
                this.f28819b = 2;
            }
            return 1;
        }
        short s6 = 2817;
        short s10 = 2816;
        short s11 = 2192;
        if (i6 == 2) {
            long jF2 = interfaceC5300u0.f();
            int i11 = this.f28820c - 20;
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = new com.google.android.gms.internal.ads.C5128sR(i11);
            interfaceC5300u0.M(c5128sR2.n(), 0, i11);
            int i12 = 0;
            while (i12 < i11 / 12) {
                c5128sR2.m(i10);
                short sD = c5128sR2.d();
                if (sD == s11 || sD == s10 || sD == s6 || sD == 2819 || sD == 2820) {
                    this.f28818a.add(new com.google.android.gms.internal.ads.J3(sD, (jF2 - ((long) this.f28820c)) - ((long) c5128sR2.y()), c5128sR2.y()));
                } else {
                    c5128sR2.m(8);
                }
                i12++;
                i11 = i11;
                i10 = 2;
                s6 = 2817;
                s10 = 2816;
                s11 = 2192;
            }
            if (!this.f28818a.isEmpty()) {
                this.f28819b = 3;
                j6 = ((com.google.android.gms.internal.ads.J3) this.f28818a.get(0)).f28580a;
            }
            q6.f30855a = j6;
            return 1;
        }
        long jE = interfaceC5300u0.e();
        int iF = (int) ((interfaceC5300u0.f() - interfaceC5300u0.e()) - ((long) this.f28820c));
        com.google.android.gms.internal.ads.C5128sR c5128sR3 = new com.google.android.gms.internal.ads.C5128sR(iF);
        interfaceC5300u0.M(c5128sR3.n(), 0, iF);
        for (int i13 = 0; i13 < this.f28818a.size(); i13++) {
            com.google.android.gms.internal.ads.J3 j10 = (com.google.android.gms.internal.ads.J3) this.f28818a.get(i13);
            c5128sR3.l((int) (j10.f28580a - jE));
            c5128sR3.m(4);
            int iY = c5128sR3.y();
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            switch (c5128sR3.b(iY, charset)) {
                case "SlowMotion_Data":
                    b6 = 0;
                    break;
                case "Super_SlowMotion_Edit_Data":
                    b6 = 3;
                    break;
                case "Super_SlowMotion_Data":
                    b6 = 1;
                    break;
                case "Super_SlowMotion_Deflickering_On":
                    b6 = 4;
                    break;
                case "Super_SlowMotion_BGM":
                    b6 = 2;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                c6 = 2192;
            } else if (b6 == 1) {
                c6 = 2816;
            } else if (b6 == 2) {
                c6 = 2817;
            } else if (b6 == 3) {
                c6 = 2819;
            } else {
                if (b6 != 4) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Invalid SEF name", null);
                }
                c6 = 2820;
            }
            int i14 = j10.f28581b - (iY + 8);
            if (c6 == 2192) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List listF = f28817e.f(c5128sR3.b(i14, charset));
                for (int i15 = 0; i15 < listF.size(); i15++) {
                    java.util.List listF2 = f28816d.f((java.lang.CharSequence) listF.get(i15));
                    if (listF2.size() != 3) {
                        throw com.google.android.gms.internal.ads.C4708of.a(null, null);
                    }
                    try {
                        arrayList.add(new com.google.android.gms.internal.ads.I2(java.lang.Long.parseLong((java.lang.String) listF2.get(0)), java.lang.Long.parseLong((java.lang.String) listF2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listF2.get(2)) - 1)));
                    } catch (java.lang.NumberFormatException e6) {
                        throw com.google.android.gms.internal.ads.C4708of.a(null, e6);
                    }
                }
                list.add(new com.google.android.gms.internal.ads.J2(arrayList));
            } else if (c6 != 2816 && c6 != 2817 && c6 != 2819 && c6 != 2820) {
                throw new java.lang.IllegalStateException();
            }
        }
        q6.f30855a = 0L;
        return 1;
        j6 = 0;
        q6.f30855a = j6;
        return 1;
    }

    public final void b() {
        this.f28818a.clear();
        this.f28819b = 0;
    }
}
