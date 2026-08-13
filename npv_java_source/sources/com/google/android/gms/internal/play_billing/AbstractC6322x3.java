package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6322x3 {
    static java.lang.String a(com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(abstractC6268o2.f());
        for (int i6 = 0; i6 < abstractC6268o2.f(); i6++) {
            int iD = abstractC6268o2.d(i6);
            if (iD == 34) {
                str = "\\\"";
            } else if (iD == 39) {
                str = "\\'";
            } else if (iD != 92) {
                switch (iD) {
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
                        if (iD < 32 || iD > 126) {
                            sb.append('\\');
                            sb.append((char) (((iD >>> 6) & 3) + 48));
                            sb.append((char) (((iD >>> 3) & 7) + 48));
                            iD = (iD & 7) + 48;
                        }
                        sb.append((char) iD);
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
