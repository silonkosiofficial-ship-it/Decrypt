package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6062l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p170r.C7026a f41024a = new p170r.C7026a();

    public static synchronized android.net.Uri a(java.lang.String str) {
        android.net.Uri uri;
        p170r.C7026a c7026a = f41024a;
        uri = (android.net.Uri) c7026a.get(str);
        if (uri == null) {
            uri = android.net.Uri.parse("content://com.google.android.gms.phenotype/" + android.net.Uri.encode(str));
            c7026a.put(str, uri);
        }
        return uri;
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        if (str.contains("#")) {
            throw new java.lang.IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }

    public static boolean c(java.lang.String str, java.lang.String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
