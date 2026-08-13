package com.napsternetlabs.napsternetv;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedMyApplication$ProtectedMyApplication$a$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.io.File f44246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f44247b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.String f44248c = "alice";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f44249d = 11;

    public static void a(int i6, java.lang.Object obj) {
        int iIntValue;
        if (i6 == f44249d && a(obj)) {
            if (!(obj instanceof java.lang.Number)) {
                if (obj instanceof java.lang.String) {
                    java.lang.String[] strArrSplit = ((java.lang.String) obj).split(" ");
                    iIntValue = java.lang.Integer.parseInt(strArrSplit[0]);
                    java.lang.String str = strArrSplit.length > 1 ? strArrSplit[1] : "";
                    com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.b(iIntValue, str);
                }
                return;
            }
            iIntValue = ((java.lang.Number) obj).intValue();
            com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.b(iIntValue, str);
        }
    }

    public static void a(android.content.Context context) {
        a(context, "");
    }

    public static void a(android.content.Context context, java.lang.String str) {
        java.lang.System.loadLibrary(f44248c);
        boolean z6 = !com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.a();
        f44247b = z6;
        if (z6) {
            f44246a = new java.io.File(context.getFilesDir().getAbsolutePath());
            com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.a(context);
            com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.a(context.getFilesDir().getAbsolutePath());
        }
    }

    private static boolean a(java.lang.Object obj) {
        return (obj instanceof java.lang.Number) || ((obj instanceof java.lang.String) && ((java.lang.String) obj).matches("\\d+([ a-fA-F0-9]*)?"));
    }

    public static boolean a(byte[] bArr, long j6) throws java.lang.Throwable {
        java.net.HttpURLConnection httpURLConnectionA;
        java.lang.Throwable th;
        java.io.DataOutputStream dataOutputStream;
        java.net.HttpURLConnection httpURLConnection = null;
        java.io.DataOutputStream dataOutputStream2 = null;
        boolean z6 = false;
        try {
            httpURLConnectionA = com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.a(bArr, j6);
            try {
                if (httpURLConnectionA != null) {
                    try {
                        java.io.DataOutputStream dataOutputStream3 = new java.io.DataOutputStream(httpURLConnectionA.getOutputStream());
                        try {
                            dataOutputStream3.write(bArr);
                            dataOutputStream3.flush();
                            boolean z10 = httpURLConnectionA.getResponseCode() == 200;
                            try {
                                dataOutputStream3.close();
                                z6 = z10;
                            } catch (java.io.IOException e6) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            dataOutputStream = dataOutputStream3;
                            if (dataOutputStream == null) {
                                throw th;
                            }
                            try {
                                dataOutputStream.close();
                                throw th;
                            } catch (java.io.IOException e10) {
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        dataOutputStream = null;
                    }
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                } else if (httpURLConnectionA != null) {
                    httpURLConnectionA.disconnect();
                }
            } catch (java.lang.Throwable th4) {
                httpURLConnection = httpURLConnectionA;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            httpURLConnectionA = null;
        }
        return z6;
    }

    public static void b(android.content.Context context) {
        com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.d.b(context.getApplicationContext());
    }

    public static void b(android.content.Context context, java.lang.String str) {
        a(context, str);
        b(context);
    }
}
