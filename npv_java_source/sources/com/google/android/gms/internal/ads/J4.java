package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class J4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28592k;

    private J4(int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f28582a = i6;
        this.f28583b = i10;
        this.f28584c = i11;
        this.f28585d = i12;
        this.f28586e = i13;
        this.f28587f = i14;
        this.f28588g = i15;
        this.f28589h = i16;
        this.f28590i = i17;
        this.f28591j = i18;
        this.f28592k = i19;
    }

    public static com.google.android.gms.internal.ads.J4 a(java.lang.String str) {
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i6 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i6 >= length) {
                if (i10 != -1) {
                    return new com.google.android.gms.internal.ads.J4(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, length);
                }
                return null;
            }
            switch (com.google.android.gms.internal.ads.AbstractC3723fg0.a(strArrSplit[i6].trim())) {
                case "name":
                    i10 = i6;
                    break;
                case "alignment":
                    i11 = i6;
                    break;
                case "primarycolour":
                    i12 = i6;
                    break;
                case "outlinecolour":
                    i13 = i6;
                    break;
                case "fontsize":
                    i14 = i6;
                    break;
                case "bold":
                    i15 = i6;
                    break;
                case "italic":
                    i16 = i6;
                    break;
                case "underline":
                    i17 = i6;
                    break;
                case "strikeout":
                    i18 = i6;
                    break;
                case "borderstyle":
                    i19 = i6;
                    break;
            }
            i6++;
        }
    }
}
