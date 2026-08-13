package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class M4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f29646d = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.regex.Pattern f29647e = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.StringBuilder f29648a = new java.lang.StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f29649b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f29650c = new com.google.android.gms.internal.ads.C5128sR();

    public static float b(int i6) {
        if (i6 == 0) {
            return 0.08f;
        }
        if (i6 == 1) {
            return 0.5f;
        }
        if (i6 == 2) {
            return 0.92f;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static long c(java.util.regex.Matcher matcher, int i6) {
        java.lang.String strGroup = matcher.group(i6 + 1);
        long j6 = strGroup != null ? java.lang.Long.parseLong(strGroup) * 3600000 : 0L;
        java.lang.String strGroup2 = matcher.group(i6 + 2);
        strGroup2.getClass();
        long j10 = j6 + (java.lang.Long.parseLong(strGroup2) * 60000);
        java.lang.String strGroup3 = matcher.group(i6 + 3);
        strGroup3.getClass();
        long j11 = j10 + (java.lang.Long.parseLong(strGroup3) * 1000);
        java.lang.String strGroup4 = matcher.group(i6 + 4);
        if (strGroup4 != null) {
            j11 += java.lang.Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        java.lang.String str;
        java.lang.String str2;
        byte b6;
        int i11;
        byte b10;
        int i12;
        com.google.android.gms.internal.ads.M4 m6 = this;
        m6.f29650c.j(bArr, i6 + i10);
        m6.f29650c.l(i6);
        java.nio.charset.Charset charsetC = m6.f29650c.c();
        if (charsetC == null) {
            charsetC = java.nio.charset.StandardCharsets.UTF_8;
        }
        while (true) {
            java.lang.String strP = m6.f29650c.P(charsetC);
            if (strP == null) {
                return;
            }
            if (strP.length() != 0) {
                try {
                    java.lang.Integer.parseInt(strP);
                    strP = m6.f29650c.P(charsetC);
                    if (strP == null) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("SubripParser", "Unexpected end");
                        return;
                    }
                    java.util.regex.Matcher matcher = f29646d.matcher(strP);
                    if (matcher.matches()) {
                        long jC = c(matcher, 1);
                        long jC2 = c(matcher, 6);
                        int i13 = 0;
                        m6.f29648a.setLength(0);
                        m6.f29649b.clear();
                        java.lang.String strP2 = m6.f29650c.P(charsetC);
                        while (!android.text.TextUtils.isEmpty(strP2)) {
                            if (m6.f29648a.length() > 0) {
                                m6.f29648a.append("<br>");
                            }
                            java.lang.StringBuilder sb = m6.f29648a;
                            java.util.ArrayList arrayList = m6.f29649b;
                            java.lang.String strTrim = strP2.trim();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strTrim);
                            java.util.regex.Matcher matcher2 = f29647e.matcher(strTrim);
                            int i14 = i13;
                            while (matcher2.find()) {
                                java.lang.String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i14;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i14 += length;
                            }
                            sb.append(sb2.toString());
                            strP2 = m6.f29650c.P(charsetC);
                            i13 = 0;
                        }
                        android.text.Spanned spannedFromHtml = android.text.Html.fromHtml(m6.f29648a.toString());
                        int i15 = 0;
                        while (true) {
                            if (i15 < m6.f29649b.size()) {
                                str2 = (java.lang.String) m6.f29649b.get(i15);
                                if (!str2.matches("\\{\\\\an[1-9]\\}")) {
                                    i15++;
                                }
                            } else {
                                str2 = null;
                            }
                        }
                        com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
                        c2185Ax.l(spannedFromHtml);
                        if (str2 != null) {
                            switch (str2) {
                                case "{\an1}":
                                    b6 = 0;
                                    break;
                                case "{\an3}":
                                    b6 = 3;
                                    break;
                                case "{\an4}":
                                    b6 = 1;
                                    break;
                                case "{\an6}":
                                    b6 = 4;
                                    break;
                                case "{\an7}":
                                    b6 = 2;
                                    break;
                                case "{\an9}":
                                    b6 = 5;
                                    break;
                                default:
                                    b6 = -1;
                                    break;
                            }
                            if (b6 != 0) {
                                i11 = 1;
                                if (b6 == 1 || b6 == 2) {
                                    i11 = 0;
                                } else if (b6 == 3 || b6 == 4 || b6 == 5) {
                                    i11 = 2;
                                }
                            } else {
                                i11 = 0;
                            }
                            c2185Ax.i(i11);
                            switch (str2) {
                                case "{\an1}":
                                    b10 = 0;
                                    break;
                                case "{\an2}":
                                    b10 = 1;
                                    break;
                                case "{\an3}":
                                    b10 = 2;
                                    break;
                                case "{\an7}":
                                    b10 = 3;
                                    break;
                                case "{\an8}":
                                    b10 = 4;
                                    break;
                                case "{\an9}":
                                    b10 = 5;
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0 || b10 == 1) {
                                i12 = 2;
                            } else if (b10 != 2) {
                                if (b10 == 3 || b10 == 4 || b10 == 5) {
                                    i12 = 0;
                                } else {
                                    c2185Ax.f(1);
                                }
                                c2185Ax.h(b(c2185Ax.b()));
                                c2185Ax.e(b(c2185Ax.a()), 0);
                            } else {
                                i12 = 2;
                            }
                            c2185Ax.f(i12);
                            c2185Ax.h(b(c2185Ax.b()));
                            c2185Ax.e(b(c2185Ax.a()), 0);
                        }
                        interfaceC5000rF.b(new com.google.android.gms.internal.ads.C4099j4(com.google.android.gms.internal.ads.AbstractC3398ci0.P(c2185Ax.p()), jC, jC2 - jC));
                    } else {
                        str = "Skipping invalid timing: ";
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("SubripParser", str.concat(strP));
                    }
                } catch (java.lang.NumberFormatException unused) {
                    str = "Skipping invalid index: ";
                }
            }
            m6 = this;
        }
    }
}
