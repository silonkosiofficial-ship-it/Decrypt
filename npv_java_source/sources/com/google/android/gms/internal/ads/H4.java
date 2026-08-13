package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class H4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27960e;

    private H4(int i6, int i10, int i11, int i12, int i13) {
        this.f27956a = i6;
        this.f27957b = i10;
        this.f27958c = i11;
        this.f27959d = i12;
        this.f27960e = i13;
    }

    public static com.google.android.gms.internal.ads.H4 a(java.lang.String str) {
        byte b6;
        com.google.android.gms.internal.ads.LC.d(str.startsWith("Format:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i6 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i6 >= length) {
                if (i10 == -1 || i11 == -1 || i13 == -1) {
                    return null;
                }
                return new com.google.android.gms.internal.ads.H4(i10, i11, i12, i13, length);
            }
            switch (com.google.android.gms.internal.ads.AbstractC3723fg0.a(strArrSplit[i6].trim())) {
                case "end":
                    b6 = 1;
                    break;
                case "text":
                    b6 = 3;
                    break;
                case "start":
                    b6 = 0;
                    break;
                case "style":
                    b6 = 2;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                i10 = i6;
            } else if (b6 == 1) {
                i11 = i6;
            } else if (b6 == 2) {
                i12 = i6;
            } else if (b6 == 3) {
                i13 = i6;
            }
            i6++;
        }
    }
}
