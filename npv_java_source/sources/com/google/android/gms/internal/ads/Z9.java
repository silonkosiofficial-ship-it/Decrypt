package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f33506d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f33507a = "ad.doubleclick.net";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String[] f33508b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T9 f33509c;

    public Z9(com.google.android.gms.internal.ads.T9 t10) {
        this.f33509c = t10;
    }

    private final android.net.Uri g(android.net.Uri uri, java.lang.String str) throws com.google.android.gms.internal.ads.C3162aa {
        java.lang.StringBuilder sb;
        java.lang.String string;
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f33507a) && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new com.google.android.gms.internal.ads.C3162aa("Parameter already exists: dc_ms");
                    }
                    java.lang.String string2 = uri.toString();
                    int iIndexOf = string2.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i6 = iIndexOf + 1;
                        sb = new java.lang.StringBuilder(string2.substring(0, i6));
                        sb.append("dc_ms");
                        sb.append("=");
                        sb.append(str);
                        sb.append(";");
                        sb.append(string2.substring(i6));
                    } else {
                        java.lang.String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string2.indexOf(encodedPath);
                        string = string2.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string2.substring(iIndexOf2 + encodedPath.length());
                    }
                    return android.net.Uri.parse(string);
                }
                if (uri.getQueryParameter("ms") != null) {
                    throw new com.google.android.gms.internal.ads.C3162aa("Query parameter already exists: ms");
                }
                java.lang.String string3 = uri.toString();
                int iIndexOf3 = string3.indexOf("&adurl");
                if (iIndexOf3 == -1) {
                    iIndexOf3 = string3.indexOf("?adurl");
                }
                if (iIndexOf3 == -1) {
                    return uri.buildUpon().appendQueryParameter("ms", str).build();
                }
                int i10 = iIndexOf3 + 1;
                sb = new java.lang.StringBuilder(string3.substring(0, i10));
                sb.append("ms");
                sb.append("=");
                sb.append(str);
                sb.append("&");
                sb.append(string3.substring(i10));
            } catch (java.lang.NullPointerException unused) {
            }
            string = sb.toString();
            return android.net.Uri.parse(string);
        } catch (java.lang.UnsupportedOperationException unused2) {
            throw new com.google.android.gms.internal.ads.C3162aa("Provided Uri is not in a valid state");
        }
    }

    public final android.net.Uri a(android.net.Uri uri, android.content.Context context, android.view.View view, android.app.Activity activity) throws com.google.android.gms.internal.ads.C3162aa {
        try {
            return g(uri, this.f33509c.f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new com.google.android.gms.internal.ads.C3162aa("Provided Uri is not in a valid state");
        }
    }

    public final android.net.Uri b(android.net.Uri uri, android.content.Context context) {
        return g(uri, this.f33509c.a(context));
    }

    public final com.google.android.gms.internal.ads.T9 c() {
        return this.f33509c;
    }

    public final void d(android.view.MotionEvent motionEvent) {
        this.f33509c.h(motionEvent);
    }

    public final boolean e(android.net.Uri uri) {
        if (f(uri)) {
            java.lang.String[] strArr = f33506d;
            for (int i6 = 0; i6 < 3; i6++) {
                if (uri.getPath().endsWith(strArr[i6])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(android.net.Uri uri) {
        uri.getClass();
        try {
            java.lang.String host = uri.getHost();
            java.lang.String[] strArr = this.f33508b;
            for (int i6 = 0; i6 < 3; i6++) {
                if (host.endsWith(strArr[i6])) {
                    return true;
                }
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return false;
    }
}
