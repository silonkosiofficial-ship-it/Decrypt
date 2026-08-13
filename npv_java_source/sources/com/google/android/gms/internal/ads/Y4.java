package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Y4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33270a = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f33274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f33275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33276g;

    public Y4(java.util.List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f33272c = 0;
            this.f33273d = -1;
            this.f33274e = "sans-serif";
            this.f33271b = false;
            this.f33275f = 0.85f;
            this.f33276g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f33272c = bArr[24];
        this.f33273d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f33274e = true == "Serif".equals(com.google.android.gms.internal.ads.EW.c(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i6 = bArr[25] * 20;
        this.f33276g = i6;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f33271b = z6;
        if (z6) {
            this.f33275f = java.lang.Math.max(0.0f, java.lang.Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i6, 0.95f));
        } else {
            this.f33275f = 0.85f;
        }
    }

    private static void b(android.text.SpannableStringBuilder spannableStringBuilder, int i6, int i10, int i11, int i12, int i13) {
        if (i6 != i10) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    private static void c(android.text.SpannableStringBuilder spannableStringBuilder, int i6, int i10, int i11, int i12, int i13) {
        android.text.style.StyleSpan styleSpan;
        java.lang.Object underlineSpan;
        if (i6 != i10) {
            int i14 = i13 | 33;
            int i15 = i6 & 1;
            int i16 = i6 & 2;
            boolean z6 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    styleSpan = new android.text.style.StyleSpan(3);
                    spannableStringBuilder.setSpan(styleSpan, i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i11, i12, i14);
                    z6 = false;
                }
            } else if (i16 != 0) {
                styleSpan = new android.text.style.StyleSpan(2);
                spannableStringBuilder.setSpan(styleSpan, i11, i12, i14);
            } else {
                z6 = false;
            }
            if ((i6 & 4) != 0) {
                underlineSpan = new android.text.style.UnderlineSpan();
            } else if (i15 != 0 || z6) {
                return;
            } else {
                underlineSpan = new android.text.style.StyleSpan(0);
            }
            spannableStringBuilder.setSpan(underlineSpan, i11, i12, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        java.lang.String strB;
        int i11;
        int length;
        this.f33270a.j(bArr, i6 + i10);
        this.f33270a.l(i6);
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f33270a;
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        com.google.android.gms.internal.ads.LC.d(c5128sR.r() >= 2);
        int iG = c5128sR.G();
        if (iG == 0) {
            strB = "";
        } else {
            int iT = c5128sR.t();
            java.nio.charset.Charset charsetC = c5128sR.c();
            int iT2 = c5128sR.t() - iT;
            if (charsetC == null) {
                charsetC = java.nio.charset.StandardCharsets.UTF_8;
            }
            strB = c5128sR.b(iG - iT2, charsetC);
        }
        if (strB.isEmpty()) {
            interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(com.google.android.gms.internal.ads.AbstractC3398ci0.O(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strB);
        c(spannableStringBuilder, this.f33272c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.f33273d, -1, 0, spannableStringBuilder.length(), 16711680);
        java.lang.String str = this.f33274e;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.f33275f;
        while (true) {
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f33270a;
            if (c5128sR2.r() < 8) {
                com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
                c2185Ax.l(spannableStringBuilder);
                c2185Ax.e(fMax, 0);
                c2185Ax.f(0);
                interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(com.google.android.gms.internal.ads.AbstractC3398ci0.P(c2185Ax.p()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iT3 = c5128sR2.t();
            int iW = c5128sR2.w();
            int iW2 = this.f33270a.w();
            if (iW2 == 1937013100) {
                com.google.android.gms.internal.ads.LC.d(this.f33270a.r() >= i14 ? i12 : i13);
                int iG2 = this.f33270a.G();
                int i15 = i13;
                while (i15 < iG2) {
                    com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f33270a;
                    com.google.android.gms.internal.ads.LC.d(c5128sR3.r() >= 12 ? i12 : i13);
                    int iG3 = c5128sR3.G();
                    int iG4 = c5128sR3.G();
                    c5128sR3.m(i14);
                    int iC = c5128sR3.C();
                    c5128sR3.m(i12);
                    int iW3 = c5128sR3.w();
                    if (iG4 > spannableStringBuilder.length()) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("Tx3gParser", "Truncating styl end (" + iG4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        length = spannableStringBuilder.length();
                    } else {
                        length = iG4;
                    }
                    if (iG3 >= length) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("Tx3gParser", "Ignoring styl with start (" + iG3 + ") >= end (" + length + ").");
                    } else {
                        int i16 = length;
                        c(spannableStringBuilder, iC, this.f33272c, iG3, i16, 0);
                        b(spannableStringBuilder, iW3, this.f33273d, iG3, i16, 0);
                    }
                    i15++;
                    iG2 = iG2;
                    i12 = 1;
                    i13 = 0;
                    i14 = 2;
                }
                i11 = i14;
            } else if (iW2 == 1952608120 && this.f33271b) {
                i11 = 2;
                com.google.android.gms.internal.ads.LC.d(this.f33270a.r() >= 2);
                fMax = java.lang.Math.max(0.0f, java.lang.Math.min(this.f33270a.G() / this.f33276g, 0.95f));
            } else {
                i11 = 2;
            }
            this.f33270a.l(iT3 + iW);
            i14 = i11;
            i12 = 1;
            i13 = 0;
        }
    }
}
