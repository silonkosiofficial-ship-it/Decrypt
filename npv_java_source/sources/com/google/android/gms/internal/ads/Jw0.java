package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Jw0 {
    static java.lang.String a(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(abstractC3753fv0.n());
        for (int i6 = 0; i6 < abstractC3753fv0.n(); i6++) {
            int iE = abstractC3753fv0.e(i6);
            if (iE == 34) {
                str = "\\\"";
            } else if (iE == 39) {
                str = "\\'";
            } else if (iE != 92) {
                switch (iE) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iE < 32 || iE > 126) {
                            sb.append('\\');
                            sb.append((char) (((iE >>> 6) & 3) + 48));
                            sb.append((char) (((iE >>> 3) & 7) + 48));
                            iE = (iE & 7) + 48;
                        }
                        sb.append((char) iE);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
