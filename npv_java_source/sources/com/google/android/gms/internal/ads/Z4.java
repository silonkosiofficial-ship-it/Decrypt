package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33473a = new com.google.android.gms.internal.ads.C5128sR();

    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        com.google.android.gms.internal.ads.C2297Dy c2297DyP;
        this.f33473a.j(bArr, i10 + i6);
        this.f33473a.l(i6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = this.f33473a;
            if (c5128sR.r() <= 0) {
                interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            com.google.android.gms.internal.ads.LC.e(c5128sR.r() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f33473a;
            int iW = c5128sR2.w() - 8;
            if (c5128sR2.w() == 1987343459) {
                com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f33473a;
                java.lang.CharSequence charSequenceA = null;
                com.google.android.gms.internal.ads.C2185Ax c2185AxB = null;
                while (iW > 0) {
                    com.google.android.gms.internal.ads.LC.e(iW >= 8, "Incomplete vtt cue box header found.");
                    int iW2 = c5128sR3.w();
                    int iW3 = c5128sR3.w();
                    int i11 = iW - 8;
                    int i12 = iW2 - 8;
                    java.lang.String strC = com.google.android.gms.internal.ads.EW.c(c5128sR3.n(), c5128sR3.t(), i12);
                    c5128sR3.m(i12);
                    if (iW3 == 1937011815) {
                        c2185AxB = com.google.android.gms.internal.ads.AbstractC4101j5.b(strC);
                    } else if (iW3 == 1885436268) {
                        charSequenceA = com.google.android.gms.internal.ads.AbstractC4101j5.a(null, strC.trim(), java.util.Collections.emptyList());
                    }
                    iW = i11 - i12;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (c2185AxB != null) {
                    c2185AxB.l(charSequenceA);
                    c2297DyP = c2185AxB.p();
                } else {
                    com.google.android.gms.internal.ads.C3883h5 c3883h5 = new com.google.android.gms.internal.ads.C3883h5();
                    c3883h5.f35990c = charSequenceA;
                    c2297DyP = c3883h5.a().p();
                }
                arrayList.add(c2297DyP);
            } else {
                this.f33473a.m(iW);
            }
        }
    }
}
