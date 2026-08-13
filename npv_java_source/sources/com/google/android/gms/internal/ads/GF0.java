package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GF0 implements com.google.android.gms.internal.ads.InterfaceC3684fF0 {
    protected GF0(com.google.android.gms.internal.ads.FF0 ff0) {
    }

    protected static int a(int i6, int i10, int i11) {
        return com.google.android.gms.internal.ads.AbstractC2466Ij0.b(((((long) i6) * ((long) i10)) * ((long) i11)) / 1000000);
    }

    protected static int b(int i6) {
        if (i6 == 20) {
            return 63750;
        }
        if (i6 == 30) {
            return 2250000;
        }
        switch (i6) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i6) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new java.lang.IllegalArgumentException();
                }
        }
    }
}
