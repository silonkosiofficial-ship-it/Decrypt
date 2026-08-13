package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27657a = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27658b = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F4 f27659c = new com.google.android.gms.internal.ads.F4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.zip.Inflater f27660d;

    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        this.f27657a.j(bArr, i10 + i6);
        this.f27657a.l(i6);
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f27657a;
        if (c5128sR.r() > 0 && c5128sR.v() == 120) {
            if (this.f27660d == null) {
                this.f27660d = new java.util.zip.Inflater();
            }
            if (com.google.android.gms.internal.ads.EW.h(c5128sR, this.f27658b, this.f27660d)) {
                com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f27658b;
                c5128sR.j(c5128sR2.n(), c5128sR2.u());
            }
        }
        this.f27659c.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f27657a;
            if (c5128sR3.r() < 3) {
                interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            com.google.android.gms.internal.ads.F4 f6 = this.f27659c;
            int iU = c5128sR3.u();
            int iC = c5128sR3.C();
            int iG = c5128sR3.G();
            int iT = c5128sR3.t() + iG;
            com.google.android.gms.internal.ads.C2297Dy c2297DyA = null;
            if (iT > iU) {
                c5128sR3.l(iU);
            } else {
                if (iC != 128) {
                    switch (iC) {
                        case 20:
                            com.google.android.gms.internal.ads.F4.d(f6, c5128sR3, iG);
                            break;
                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                            com.google.android.gms.internal.ads.F4.b(f6, c5128sR3, iG);
                            break;
                        case 22:
                            com.google.android.gms.internal.ads.F4.c(f6, c5128sR3, iG);
                            break;
                    }
                } else {
                    c2297DyA = f6.a();
                    f6.e();
                }
                c5128sR3.l(iT);
            }
            if (c2297DyA != null) {
                arrayList.add(c2297DyA);
            }
        }
    }
}
