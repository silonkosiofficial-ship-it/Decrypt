package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class L4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f29190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f29192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f29193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f29198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f29199j;

    private L4(java.lang.String str, int i6, java.lang.Integer num, java.lang.Integer num2, float f6, boolean z6, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29190a = str;
        this.f29191b = i6;
        this.f29192c = num;
        this.f29193d = num2;
        this.f29194e = f6;
        this.f29195f = z6;
        this.f29196g = z10;
        this.f29197h = z11;
        this.f29198i = z12;
        this.f29199j = i10;
    }

    public static com.google.android.gms.internal.ads.L4 b(java.lang.String str, com.google.android.gms.internal.ads.J4 j6) {
        int i6;
        com.google.android.gms.internal.ads.LC.d(str.startsWith("Style:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = j6.f28592k;
        if (length != i10) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaStyle", java.lang.String.format(java.util.Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(length), str));
            return null;
        }
        try {
            java.lang.String strTrim = strArrSplit[j6.f28582a].trim();
            int i11 = j6.f28583b;
            int iD = i11 != -1 ? d(strArrSplit[i11].trim()) : -1;
            int i12 = j6.f28584c;
            java.lang.Integer numC = i12 != -1 ? c(strArrSplit[i12].trim()) : null;
            int i13 = j6.f28585d;
            java.lang.Integer numC2 = i13 != -1 ? c(strArrSplit[i13].trim()) : null;
            int i14 = j6.f28586e;
            float f6 = -3.4028235E38f;
            if (i14 != -1) {
                java.lang.String strTrim2 = strArrSplit[i14].trim();
                try {
                    f6 = java.lang.Float.parseFloat(strTrim2);
                } catch (java.lang.NumberFormatException e6) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.g("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e6);
                }
            }
            int i15 = j6.f28587f;
            boolean z6 = i15 != -1 && e(strArrSplit[i15].trim());
            int i16 = j6.f28588g;
            boolean z10 = i16 != -1 && e(strArrSplit[i16].trim());
            int i17 = j6.f28589h;
            boolean z11 = i17 != -1 && e(strArrSplit[i17].trim());
            int i18 = j6.f28590i;
            boolean z12 = i18 != -1 && e(strArrSplit[i18].trim());
            int i19 = j6.f28591j;
            if (i19 != -1) {
                java.lang.String strTrim3 = strArrSplit[i19].trim();
                try {
                    int i20 = java.lang.Integer.parseInt(strTrim3.trim());
                    if (i20 == 1 || i20 == 3) {
                        i6 = i20;
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(java.lang.String.valueOf(strTrim3)));
                        i6 = -1;
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            } else {
                i6 = -1;
            }
            return new com.google.android.gms.internal.ads.L4(strTrim, iD, numC, numC2, f6, z6, z10, z11, z12, i6);
        } catch (java.lang.RuntimeException e10) {
            com.google.android.gms.internal.ads.AbstractC3586eM.g("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static java.lang.Integer c(java.lang.String str) {
        try {
            long j6 = str.startsWith("&H") ? java.lang.Long.parseLong(str.substring(2), 16) : java.lang.Long.parseLong(str);
            com.google.android.gms.internal.ads.LC.d(j6 <= 4294967295L);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(com.google.android.gms.internal.ads.AbstractC2466Ij0.b(((j6 >> 24) & 255) ^ 255), com.google.android.gms.internal.ads.AbstractC2466Ij0.b(j6 & 255), com.google.android.gms.internal.ads.AbstractC2466Ij0.b((j6 >> 8) & 255), com.google.android.gms.internal.ads.AbstractC2466Ij0.b((j6 >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e6) {
            com.google.android.gms.internal.ads.AbstractC3586eM.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e6);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(java.lang.String str) {
        try {
            int i6 = java.lang.Integer.parseInt(str.trim());
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i6;
                default:
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("SsaStyle", "Ignoring unknown alignment: ".concat(java.lang.String.valueOf(str)));
                    return -1;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
    }

    private static boolean e(java.lang.String str) {
        try {
            int i6 = java.lang.Integer.parseInt(str);
            return i6 == 1 || i6 == -1;
        } catch (java.lang.NumberFormatException e6) {
            com.google.android.gms.internal.ads.AbstractC3586eM.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e6);
            return false;
        }
    }
}
