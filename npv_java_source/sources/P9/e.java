package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P9.e f8548a = new P9.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X9.C1839g f8549b = X9.C1839g.f16149F.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f8550c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f8551d = new java.lang.String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String[] f8552e;

    static {
        java.lang.String[] strArr = new java.lang.String[256];
        for (int i6 = 0; i6 < 256; i6++) {
            java.lang.String binaryString = java.lang.Integer.toBinaryString(i6);
            p247y7.AbstractC7350t.e(binaryString, "toBinaryString(it)");
            strArr[i6] = S8.r.Q(I9.d.t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f8552e = strArr;
        java.lang.String[] strArr2 = f8551d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            java.lang.String[] strArr3 = f8551d;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        int length = f8551d.length;
        for (int i15 = 0; i15 < length; i15++) {
            java.lang.String[] strArr4 = f8551d;
            if (strArr4[i15] == null) {
                strArr4[i15] = f8552e[i15];
            }
        }
    }

    private e() {
    }

    public final java.lang.String a(int i6, int i10) {
        java.lang.String str;
        int i11;
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.String str3;
        if (i10 == 0) {
            return "";
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 == 4 || i6 == 6) {
                return i10 == 1 ? "ACK" : f8552e[i10];
            }
            if (i6 != 7 && i6 != 8) {
                java.lang.String[] strArr = f8551d;
                if (i10 < strArr.length) {
                    str = strArr[i10];
                    p247y7.AbstractC7350t.c(str);
                } else {
                    str = f8552e[i10];
                }
                java.lang.String str4 = str;
                if (i6 == 5 && (i10 & 4) != 0) {
                    i11 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i6 != 0 || (i10 & 32) == 0) {
                        return str4;
                    }
                    i11 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return S8.r.R(str4, str2, str3, false, i11, obj);
            }
        }
        return f8552e[i10];
    }

    public final java.lang.String b(int i6) {
        java.lang.String[] strArr = f8550c;
        return i6 < strArr.length ? strArr[i6] : I9.d.t("0x%02x", java.lang.Integer.valueOf(i6));
    }

    public final java.lang.String c(boolean z6, int i6, int i10, int i11, int i12) {
        return I9.d.t("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10), b(i11), a(i11, i12));
    }
}
