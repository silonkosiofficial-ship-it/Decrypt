package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class V4 {
    public static com.google.android.gms.internal.ads.W4 a(com.google.android.gms.internal.ads.W4 w6, java.lang.String[] strArr, java.util.Map map) {
        int length;
        int i6 = 0;
        if (w6 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (com.google.android.gms.internal.ads.W4) map.get(strArr[0]);
            }
            if (length2 > 1) {
                com.google.android.gms.internal.ads.W4 w10 = new com.google.android.gms.internal.ads.W4();
                while (i6 < length2) {
                    w10.v((com.google.android.gms.internal.ads.W4) map.get(strArr[i6]));
                    i6++;
                }
                return w10;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                w6.v((com.google.android.gms.internal.ads.W4) map.get(strArr[0]));
                return w6;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i6 < length) {
                    w6.v((com.google.android.gms.internal.ads.W4) map.get(strArr[i6]));
                    i6++;
                }
            }
        }
        return w6;
    }
}
