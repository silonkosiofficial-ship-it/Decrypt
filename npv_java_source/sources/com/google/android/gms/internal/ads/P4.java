package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class P4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f30638d = java.util.regex.Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3947hi0 f30639e = com.google.android.gms.internal.ads.AbstractC3947hi0.Q("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3947hi0 f30640f = com.google.android.gms.internal.ads.AbstractC3947hi0.R("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3947hi0 f30641g = com.google.android.gms.internal.ads.AbstractC3947hi0.Q("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3947hi0 f30642h = com.google.android.gms.internal.ads.AbstractC3947hi0.R("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30645c;

    private P4(int i6, int i10, int i11) {
        this.f30643a = i6;
        this.f30644b = i10;
        this.f30645c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static com.google.android.gms.internal.ads.P4 a(java.lang.String str) {
        byte b6;
        int i6;
        if (str == null) {
            return null;
        }
        java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(str.trim());
        if (strA.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0N = com.google.android.gms.internal.ads.AbstractC3947hi0.N(android.text.TextUtils.split(strA, f30638d));
        java.lang.String str2 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC4056ii0.a(com.google.android.gms.internal.ads.AbstractC3729fj0.b(f30642h, abstractC3947hi0N), "outside");
        int iHashCode = str2.hashCode();
        int i10 = -1;
        int i11 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b6 = 0;
            } else {
                b6 = -1;
            }
        } else if (str2.equals("outside")) {
            b6 = 1;
        } else {
            b6 = -1;
        }
        if (b6 != 0) {
            i6 = b6 != 1 ? 1 : -2;
        } else {
            i6 = 2;
        }
        com.google.android.gms.internal.ads.AbstractC3510dj0 abstractC3510dj0B = com.google.android.gms.internal.ads.AbstractC3729fj0.b(f30639e, abstractC3947hi0N);
        if (abstractC3510dj0B.isEmpty()) {
            com.google.android.gms.internal.ads.AbstractC3510dj0 abstractC3510dj0B2 = com.google.android.gms.internal.ads.AbstractC3729fj0.b(f30641g, abstractC3947hi0N);
            com.google.android.gms.internal.ads.AbstractC3510dj0 abstractC3510dj0B3 = com.google.android.gms.internal.ads.AbstractC3729fj0.b(f30640f, abstractC3947hi0N);
            if (!abstractC3510dj0B2.isEmpty() || !abstractC3510dj0B3.isEmpty()) {
                java.lang.String str3 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC4056ii0.a(abstractC3510dj0B2, "filled");
                int i12 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                java.lang.String str4 = (java.lang.String) com.google.android.gms.internal.ads.AbstractC4056ii0.a(abstractC3510dj0B3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i10 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    i10 = 2;
                } else if (i10 != 1) {
                    i11 = i12;
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                i11 = i12;
            }
        } else {
            java.lang.String str5 = (java.lang.String) abstractC3510dj0B.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i10 = 0;
            }
        }
        return new com.google.android.gms.internal.ads.P4(i10, i11, i6);
    }
}
