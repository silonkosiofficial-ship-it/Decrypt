package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract class B5 {
    static java.lang.String a(com.google.android.gms.internal.measurement.L3 l6) {
        java.lang.String str;
        com.google.android.gms.internal.measurement.A5 a6 = new com.google.android.gms.internal.measurement.A5(l6);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(a6.a());
        for (int i6 = 0; i6 < a6.a(); i6++) {
            int iR = a6.r(i6);
            if (iR == 34) {
                str = "\\\"";
            } else if (iR == 39) {
                str = "\\'";
            } else if (iR != 92) {
                switch (iR) {
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
                        if (iR < 32 || iR > 126) {
                            sb.append('\\');
                            sb.append((char) (((iR >>> 6) & 3) + 48));
                            sb.append((char) (((iR >>> 3) & 7) + 48));
                            iR = (iR & 7) + 48;
                        }
                        sb.append((char) iR);
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
