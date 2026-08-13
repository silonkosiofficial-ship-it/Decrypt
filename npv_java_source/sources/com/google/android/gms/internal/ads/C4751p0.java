package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4751p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f37896a;

    private C4751p0(int i6, int i10, java.lang.String str) {
        this.f37896a = str;
    }

    public static com.google.android.gms.internal.ads.C4751p0 a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        java.lang.String str;
        c5128sR.m(2);
        int iC = c5128sR.C();
        int i6 = iC >> 1;
        int i10 = iC & 1;
        int iC2 = c5128sR.C() >> 3;
        if (i6 == 4 || i6 == 5 || i6 == 7) {
            str = "dvhe";
        } else if (i6 == 8) {
            str = "hev1";
        } else {
            if (i6 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i11 = iC2 | (i10 << 5);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i6);
        sb.append(i11 >= 10 ? "." : ".0");
        sb.append(i11);
        return new com.google.android.gms.internal.ads.C4751p0(i6, i11, sb.toString());
    }
}
