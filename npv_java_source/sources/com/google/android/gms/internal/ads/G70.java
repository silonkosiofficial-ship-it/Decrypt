package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.regex.Pattern f27681a;

    public G70() {
        java.util.regex.Pattern patternCompile;
        try {
            patternCompile = java.util.regex.Pattern.compile((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25290H6));
        } catch (java.util.regex.PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f27681a = patternCompile;
    }

    public final java.lang.String a(java.lang.String str) {
        java.util.regex.Pattern pattern = this.f27681a;
        if (pattern == null || str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
