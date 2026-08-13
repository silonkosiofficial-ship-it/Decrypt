package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class K4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f28823c = java.util.regex.Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f28824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.regex.Pattern f28825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.regex.Pattern f28826f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f28828b;

    static {
        java.util.Locale locale = java.util.Locale.US;
        f28824d = java.util.regex.Pattern.compile(java.lang.String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f28825e = java.util.regex.Pattern.compile(java.lang.String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f28826f = java.util.regex.Pattern.compile("\\\\an(\\d+)");
    }

    private K4(int i6, android.graphics.PointF pointF) {
        this.f28827a = i6;
        this.f28828b = pointF;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:23:0x0082, B:25:0x008e, B:27:0x0094, B:28:0x0099), top: B:37:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x000a A[SYNTHETIC] */
    public static com.google.android.gms.internal.ads.K4 a(java.lang.String str) {
        java.util.regex.Matcher matcher;
        int iD;
        java.lang.String strGroup;
        android.graphics.PointF pointF;
        java.lang.String strGroup2;
        java.lang.String strGroup3;
        java.util.regex.Matcher matcher2 = f28823c.matcher(str);
        android.graphics.PointF pointF2 = null;
        int i6 = -1;
        while (matcher2.find()) {
            java.lang.String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            try {
                java.util.regex.Matcher matcher3 = f28824d.matcher(strGroup4);
                java.util.regex.Matcher matcher4 = f28825e.matcher(strGroup4);
                boolean zFind = matcher3.find();
                boolean zFind2 = matcher4.find();
                if (zFind) {
                    if (zFind2) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup4 + "'");
                    }
                    strGroup2 = matcher3.group(1);
                    strGroup3 = matcher3.group(2);
                } else {
                    if (zFind2) {
                        java.lang.String strGroup5 = matcher4.group(1);
                        java.lang.String strGroup6 = matcher4.group(2);
                        strGroup2 = strGroup5;
                        strGroup3 = strGroup6;
                    } else {
                        pointF = null;
                    }
                    if (pointF != null) {
                        pointF2 = pointF;
                    }
                    try {
                        matcher = f28826f.matcher(strGroup4);
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                            if (strGroup != null) {
                                throw null;
                            }
                            iD = com.google.android.gms.internal.ads.L4.d(strGroup);
                        } else {
                            iD = -1;
                        }
                        if (iD != -1) {
                            i6 = iD;
                        }
                    } catch (java.lang.RuntimeException unused) {
                    }
                }
                if (strGroup2 == null) {
                    throw null;
                }
                float f6 = java.lang.Float.parseFloat(strGroup2.trim());
                if (strGroup3 == null) {
                    throw null;
                }
                pointF = new android.graphics.PointF(f6, java.lang.Float.parseFloat(strGroup3.trim()));
                if (pointF != null) {
                    pointF2 = pointF;
                }
                matcher = f28826f.matcher(strGroup4);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                    if (strGroup != null) {
                        throw null;
                    }
                    iD = com.google.android.gms.internal.ads.L4.d(strGroup);
                } else {
                    iD = -1;
                }
                if (iD != -1) {
                    i6 = iD;
                }
            } catch (java.lang.RuntimeException unused2) {
            }
        }
        return new com.google.android.gms.internal.ads.K4(i6, pointF2);
    }

    public static java.lang.String b(java.lang.String str) {
        return f28823c.matcher(str).replaceAll("");
    }
}
