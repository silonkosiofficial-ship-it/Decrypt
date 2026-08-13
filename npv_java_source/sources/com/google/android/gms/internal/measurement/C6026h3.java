package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6026h3 {

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile M4.g f40960a;

        public static M4.g a(android.content.Context context) {
            M4.g gVarA;
            M4.g gVar = f40960a;
            if (gVar == null) {
                synchronized (com.google.android.gms.internal.measurement.C6026h3.a.class) {
                    try {
                        gVar = f40960a;
                        if (gVar == null) {
                            new com.google.android.gms.internal.measurement.C6026h3();
                            if (com.google.android.gms.internal.measurement.AbstractC6062l3.c(android.os.Build.TYPE, android.os.Build.TAGS)) {
                                if (com.google.android.gms.internal.measurement.T2.a() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                gVarA = com.google.android.gms.internal.measurement.C6026h3.a(context);
                            } else {
                                gVarA = M4.g.a();
                            }
                            f40960a = gVarA;
                            gVar = gVarA;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            return gVar;
        }
    }

    static M4.g a(android.content.Context context) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            android.os.StrictMode.allowThreadDiskWrites();
            M4.g gVarD = d(context);
            return gVarD.c() ? M4.g.d(b(context, (java.io.File) gVarD.b())) : M4.g.a();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static com.google.android.gms.internal.measurement.InterfaceC6035i3 b(android.content.Context context, java.io.File file) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
            try {
                p170r.Y y6 = new p170r.Y();
                java.util.HashMap map = new java.util.HashMap();
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        java.lang.String str = "Parsed " + java.lang.String.valueOf(file) + " for Android package " + context.getPackageName();
                        com.google.android.gms.internal.measurement.Z2 z6 = new com.google.android.gms.internal.measurement.Z2(y6);
                        bufferedReader.close();
                        return z6;
                    }
                    java.lang.String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        java.lang.String str2 = "Invalid: " + line;
                    } else {
                        java.lang.String strC = c(strArrSplit[0]);
                        java.lang.String strDecode = android.net.Uri.decode(c(strArrSplit[1]));
                        java.lang.String strDecode2 = (java.lang.String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            java.lang.String strC2 = c(strArrSplit[2]);
                            strDecode2 = android.net.Uri.decode(strC2);
                            if (strDecode2.length() < 1024 || strDecode2 == strC2) {
                                map.put(strC2, strDecode2);
                            }
                        }
                        p170r.Y y10 = (p170r.Y) y6.get(strC);
                        if (y10 == null) {
                            y10 = new p170r.Y();
                            y6.put(strC, y10);
                        }
                        y10.put(strDecode, strDecode2);
                    }
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    private static final java.lang.String c(java.lang.String str) {
        return new java.lang.String(str);
    }

    private static M4.g d(android.content.Context context) {
        try {
            java.io.File file = new java.io.File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? M4.g.d(file) : M4.g.a();
        } catch (java.lang.RuntimeException e6) {
            return M4.g.a();
        }
    }
}
