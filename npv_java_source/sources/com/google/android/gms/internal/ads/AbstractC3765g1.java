package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3765g1 {
    public static int a(int i6) {
        int i10 = 0;
        while (i6 > 0) {
            i6 >>>= 1;
            i10++;
        }
        return i10;
    }

    public static com.google.android.gms.internal.ads.C2227Cb b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            java.lang.String str = (java.lang.String) list.get(i6);
            int i10 = com.google.android.gms.internal.ads.EW.f27061a;
            java.lang.String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(com.google.android.gms.internal.ads.W1.a(new com.google.android.gms.internal.ads.C5128sR(android.util.Base64.decode(strArrSplit[1], 0))));
                } catch (java.lang.RuntimeException e6) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.g("VorbisUtil", "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new com.google.android.gms.internal.ads.P2(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.google.android.gms.internal.ads.C2227Cb(arrayList);
    }

    public static com.google.android.gms.internal.ads.C3436d1 c(com.google.android.gms.internal.ads.C5128sR c5128sR, boolean z6, boolean z10) throws com.google.android.gms.internal.ads.C4708of {
        if (z6) {
            d(3, c5128sR, false);
        }
        java.lang.String strB = c5128sR.b((int) c5128sR.I(), java.nio.charset.StandardCharsets.UTF_8);
        int length = strB.length();
        long jI = c5128sR.I();
        java.lang.String[] strArr = new java.lang.String[(int) jI];
        int length2 = length + 15;
        for (int i6 = 0; i6 < jI; i6++) {
            java.lang.String strB2 = c5128sR.b((int) c5128sR.I(), java.nio.charset.StandardCharsets.UTF_8);
            strArr[i6] = strB2;
            length2 = length2 + 4 + strB2.length();
        }
        if (z10 && (c5128sR.C() & 1) == 0) {
            throw com.google.android.gms.internal.ads.C4708of.a("framing bit expected to be set", null);
        }
        return new com.google.android.gms.internal.ads.C3436d1(strB, strArr, length2 + 1);
    }

    public static boolean d(int i6, com.google.android.gms.internal.ads.C5128sR c5128sR, boolean z6) throws com.google.android.gms.internal.ads.C4708of {
        if (c5128sR.r() < 7) {
            if (z6) {
                return false;
            }
            throw com.google.android.gms.internal.ads.C4708of.a("too short header: " + c5128sR.r(), null);
        }
        if (c5128sR.C() != i6) {
            if (z6) {
                return false;
            }
            throw com.google.android.gms.internal.ads.C4708of.a("expected header type ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i6))), null);
        }
        if (c5128sR.C() == 118 && c5128sR.C() == 111 && c5128sR.C() == 114 && c5128sR.C() == 98 && c5128sR.C() == 105 && c5128sR.C() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw com.google.android.gms.internal.ads.C4708of.a("expected characters 'vorbis'", null);
    }
}
