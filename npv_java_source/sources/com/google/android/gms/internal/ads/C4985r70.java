package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4985r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f38438a;

    public C4985r70(com.google.android.gms.internal.ads.Z9 z10) {
        this.f38438a = z10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[Catch: UnsupportedOperationException -> 0x00ff, TryCatch #1 {UnsupportedOperationException -> 0x00ff, blocks: (B:5:0x000c, B:7:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:17:0x005e, B:18:0x0062, B:19:0x0068, B:21:0x006e, B:22:0x00a0, B:23:0x00a5, B:24:0x00a6, B:25:0x00ad, B:26:0x00ae, B:28:0x00b4, B:30:0x00c0, B:32:0x00c8, B:33:0x00ea, B:35:0x00f7, B:36:0x00fe), top: B:40:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4 A[Catch: UnsupportedOperationException -> 0x00ff, TryCatch #1 {UnsupportedOperationException -> 0x00ff, blocks: (B:5:0x000c, B:7:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:17:0x005e, B:18:0x0062, B:19:0x0068, B:21:0x006e, B:22:0x00a0, B:23:0x00a5, B:24:0x00a6, B:25:0x00ad, B:26:0x00ae, B:28:0x00b4, B:30:0x00c0, B:32:0x00c8, B:33:0x00ea, B:35:0x00f7, B:36:0x00fe), top: B:40:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[Catch: UnsupportedOperationException -> 0x00ff, TryCatch #1 {UnsupportedOperationException -> 0x00ff, blocks: (B:5:0x000c, B:7:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:17:0x005e, B:18:0x0062, B:19:0x0068, B:21:0x006e, B:22:0x00a0, B:23:0x00a5, B:24:0x00a6, B:25:0x00ad, B:26:0x00ae, B:28:0x00b4, B:30:0x00c0, B:32:0x00c8, B:33:0x00ea, B:35:0x00f7, B:36:0x00fe), top: B:40:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8 A[Catch: UnsupportedOperationException -> 0x00ff, TryCatch #1 {UnsupportedOperationException -> 0x00ff, blocks: (B:5:0x000c, B:7:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:17:0x005e, B:18:0x0062, B:19:0x0068, B:21:0x006e, B:22:0x00a0, B:23:0x00a5, B:24:0x00a6, B:25:0x00ad, B:26:0x00ae, B:28:0x00b4, B:30:0x00c0, B:32:0x00c8, B:33:0x00ea, B:35:0x00f7, B:36:0x00fe), top: B:40:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[Catch: UnsupportedOperationException -> 0x00ff, TryCatch #1 {UnsupportedOperationException -> 0x00ff, blocks: (B:5:0x000c, B:7:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:17:0x005e, B:18:0x0062, B:19:0x0068, B:21:0x006e, B:22:0x00a0, B:23:0x00a5, B:24:0x00a6, B:25:0x00ad, B:26:0x00ae, B:28:0x00b4, B:30:0x00c0, B:32:0x00c8, B:33:0x00ea, B:35:0x00f7, B:36:0x00fe), top: B:40:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[Catch: UnsupportedOperationException -> 0x00ff, TryCatch #1 {UnsupportedOperationException -> 0x00ff, blocks: (B:5:0x000c, B:7:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:17:0x005e, B:18:0x0062, B:19:0x0068, B:21:0x006e, B:22:0x00a0, B:23:0x00a5, B:24:0x00a6, B:25:0x00ad, B:26:0x00ae, B:28:0x00b4, B:30:0x00c0, B:32:0x00c8, B:33:0x00ea, B:35:0x00f7, B:36:0x00fe), top: B:40:0x000c }] */
    private static final android.net.Uri b(android.net.Uri uri, java.lang.String str) throws com.google.android.gms.internal.ads.C3162aa {
        java.lang.String string;
        java.lang.StringBuilder sb;
        java.lang.String string2;
        int iIndexOf;
        if (uri != null) {
            try {
                try {
                    java.lang.String host = uri.getHost();
                    java.lang.String path = uri.getPath();
                    if (host == null || !host.equals("ad.doubleclick.net") || path == null || !path.contains(";")) {
                        if (uri.getQueryParameter("ms") == null) {
                            throw new com.google.android.gms.internal.ads.C3162aa("Query parameter already exists: ms");
                        }
                        string2 = uri.toString();
                        iIndexOf = string2.indexOf("&adurl");
                        if (iIndexOf == -1) {
                            iIndexOf = string2.indexOf("?adurl");
                        }
                        if (iIndexOf != -1) {
                            return uri.buildUpon().appendQueryParameter("ms", str).build();
                        }
                        int i6 = iIndexOf + 1;
                        sb = new java.lang.StringBuilder(string2.substring(0, i6));
                        sb.append("ms");
                        sb.append("=");
                        sb.append(str);
                        sb.append("&");
                        sb.append((java.lang.CharSequence) string2, i6, string2.length());
                    } else {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new com.google.android.gms.internal.ads.C3162aa("Parameter already exists: dc_ms");
                        }
                        java.lang.String string3 = uri.toString();
                        int iIndexOf2 = string3.indexOf(";adurl");
                        if (iIndexOf2 != -1) {
                            int i10 = iIndexOf2 + 1;
                            sb = new java.lang.StringBuilder(string3.substring(0, i10));
                            sb.append("dc_ms");
                            sb.append("=");
                            sb.append(str);
                            sb.append(";");
                            sb.append((java.lang.CharSequence) string3, i10, string3.length());
                        } else {
                            java.lang.String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            int iIndexOf3 = string3.indexOf(encodedPath);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(string3.substring(0, encodedPath.length() + iIndexOf3));
                            sb2.append(";");
                            sb2.append("dc_ms");
                            sb2.append("=");
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((java.lang.CharSequence) string3, iIndexOf3 + encodedPath.length(), string3.length());
                            string = sb2.toString();
                        }
                    }
                } catch (java.lang.NullPointerException unused) {
                }
                string = sb.toString();
            } catch (java.lang.UnsupportedOperationException unused2) {
                throw new com.google.android.gms.internal.ads.C3162aa("Provided Uri is not in a valid state");
            }
        } else {
            if (uri.getQueryParameter("ms") == null) {
                throw new com.google.android.gms.internal.ads.C3162aa("Query parameter already exists: ms");
            }
            string2 = uri.toString();
            iIndexOf = string2.indexOf("&adurl");
            if (iIndexOf == -1) {
                iIndexOf = string2.indexOf("?adurl");
            }
            if (iIndexOf != -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i11 = iIndexOf + 1;
            sb = new java.lang.StringBuilder(string2.substring(0, i11));
            sb.append("ms");
            sb.append("=");
            sb.append(str);
            sb.append("&");
            sb.append((java.lang.CharSequence) string2, i11, string2.length());
            string = sb.toString();
        }
        return android.net.Uri.parse(string);
    }

    public final android.net.Uri a(android.net.Uri uri, android.content.Context context, android.view.View view, android.app.Activity activity) throws com.google.android.gms.internal.ads.C3162aa {
        try {
            return b(uri, this.f38438a.c().f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new com.google.android.gms.internal.ads.C3162aa("Provided Uri is not in a valid state");
        }
    }
}
