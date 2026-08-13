package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f28362c = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28363a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28364b = -1;

    private final boolean c(java.lang.String str) {
        java.util.regex.Matcher matcher = f28362c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            java.lang.String strGroup = matcher.group(1);
            int i6 = com.google.android.gms.internal.ads.EW.f27061a;
            int i10 = java.lang.Integer.parseInt(strGroup, 16);
            int i11 = java.lang.Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f28363a = i10;
            this.f28364b = i11;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f28363a == -1 || this.f28364b == -1) ? false : true;
    }

    public final boolean b(com.google.android.gms.internal.ads.C2227Cb c2227Cb) {
        for (int i6 = 0; i6 < c2227Cb.a(); i6++) {
            com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bbB = c2227Cb.b(i6);
            if (interfaceC3274bbB instanceof com.google.android.gms.internal.ads.C4315l2) {
                com.google.android.gms.internal.ads.C4315l2 c4315l2 = (com.google.android.gms.internal.ads.C4315l2) interfaceC3274bbB;
                if ("iTunSMPB".equals(c4315l2.f37054E) && c(c4315l2.f37055F)) {
                    return true;
                }
            } else if (interfaceC3274bbB instanceof com.google.android.gms.internal.ads.C5304u2) {
                com.google.android.gms.internal.ads.C5304u2 c5304u2 = (com.google.android.gms.internal.ads.C5304u2) interfaceC3274bbB;
                if ("com.apple.iTunes".equals(c5304u2.f39078D) && "iTunSMPB".equals(c5304u2.f39079E) && c(c5304u2.f39080F)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
