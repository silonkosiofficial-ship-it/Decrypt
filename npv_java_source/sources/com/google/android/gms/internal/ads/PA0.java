package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PA0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.PA0 f30661h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f30665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30668g;

    static {
        com.google.android.gms.internal.ads.Oz0 oz0 = new com.google.android.gms.internal.ads.Oz0();
        oz0.c(1);
        oz0.b(2);
        oz0.d(3);
        f30661h = oz0.g();
        com.google.android.gms.internal.ads.Oz0 oz1 = new com.google.android.gms.internal.ads.Oz0();
        oz1.c(1);
        oz1.b(1);
        oz1.d(2);
        oz1.g();
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
    }

    /* synthetic */ PA0(int i6, int i10, int i11, byte[] bArr, int i12, int i13, com.google.android.gms.internal.ads.AbstractC4772pA0 abstractC4772pA0) {
        this.f30662a = i6;
        this.f30663b = i10;
        this.f30664c = i11;
        this.f30665d = bArr;
        this.f30666e = i12;
        this.f30667f = i13;
    }

    public static int a(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 != 9) {
            return (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i6) {
        if (i6 == 1) {
            return 3;
        }
        if (i6 == 4) {
            return 10;
        }
        if (i6 == 13) {
            return 2;
        }
        if (i6 == 16) {
            return 6;
        }
        if (i6 != 18) {
            return (i6 == 6 || i6 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean g(com.google.android.gms.internal.ads.PA0 pa0) {
        int i6;
        int i10;
        int i11;
        int i12;
        if (pa0 == null) {
            return true;
        }
        int i13 = pa0.f30662a;
        return (i13 == -1 || i13 == 1 || i13 == 2) && ((i6 = pa0.f30663b) == -1 || i6 == 2) && (((i10 = pa0.f30664c) == -1 || i10 == 3) && pa0.f30665d == null && (((i11 = pa0.f30667f) == -1 || i11 == 8) && ((i12 = pa0.f30666e) == -1 || i12 == 8)));
    }

    private static java.lang.String h(int i6) {
        if (i6 == -1) {
            return "Unset color range";
        }
        if (i6 == 1) {
            return "Full range";
        }
        if (i6 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i6;
    }

    private static java.lang.String i(int i6) {
        if (i6 == -1) {
            return "Unset color space";
        }
        if (i6 == 6) {
            return "BT2020";
        }
        if (i6 == 1) {
            return "BT709";
        }
        if (i6 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i6;
    }

    private static java.lang.String j(int i6) {
        if (i6 == -1) {
            return "Unset color transfer";
        }
        if (i6 == 10) {
            return "Gamma 2.2";
        }
        if (i6 == 1) {
            return "Linear";
        }
        if (i6 == 2) {
            return "sRGB";
        }
        if (i6 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i6 == 6) {
            return "ST2084 PQ";
        }
        if (i6 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i6;
    }

    public final com.google.android.gms.internal.ads.Oz0 c() {
        return new com.google.android.gms.internal.ads.Oz0(this, null);
    }

    public final java.lang.String d() {
        java.lang.String str;
        java.lang.String str2 = f() ? java.lang.String.format(java.util.Locale.US, "%s/%s/%s", i(this.f30662a), h(this.f30663b), j(this.f30664c)) : "NA/NA/NA";
        if (e()) {
            str = this.f30666e + "/" + this.f30667f;
        } else {
            str = "NA/NA";
        }
        return str2 + "/" + str;
    }

    public final boolean e() {
        return (this.f30666e == -1 || this.f30667f == -1) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.PA0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.PA0 pa0 = (com.google.android.gms.internal.ads.PA0) obj;
            if (this.f30662a == pa0.f30662a && this.f30663b == pa0.f30663b && this.f30664c == pa0.f30664c && java.util.Arrays.equals(this.f30665d, pa0.f30665d) && this.f30666e == pa0.f30666e && this.f30667f == pa0.f30667f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f30662a == -1 || this.f30663b == -1 || this.f30664c == -1) ? false : true;
    }

    public final int hashCode() {
        int i6 = this.f30668g;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = ((((((((((this.f30662a + 527) * 31) + this.f30663b) * 31) + this.f30664c) * 31) + java.util.Arrays.hashCode(this.f30665d)) * 31) + this.f30666e) * 31) + this.f30667f;
        this.f30668g = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i6 = this.f30666e;
        int i10 = this.f30664c;
        int i11 = this.f30663b;
        java.lang.String strI = i(this.f30662a);
        java.lang.String strH = h(i11);
        java.lang.String strJ = j(i10);
        java.lang.String str2 = "NA";
        if (i6 != -1) {
            str = i6 + "bit Luma";
        } else {
            str = "NA";
        }
        int i12 = this.f30667f;
        if (i12 != -1) {
            str2 = i12 + "bit Chroma";
        }
        return "ColorInfo(" + strI + ", " + strH + ", " + strJ + ", " + (this.f30665d != null) + ", " + str + ", " + str2 + ")";
    }
}
