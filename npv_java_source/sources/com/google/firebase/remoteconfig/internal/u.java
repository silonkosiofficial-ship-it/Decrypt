package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f44211c = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f44212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f44213b;

    private u(android.content.Context context, java.lang.String str) {
        this.f44212a = context;
        this.f44213b = str;
    }

    public static synchronized com.google.firebase.remoteconfig.internal.u c(android.content.Context context, java.lang.String str) {
        java.util.Map map;
        try {
            map = f44211c;
            if (!map.containsKey(str)) {
                map.put(str, new com.google.firebase.remoteconfig.internal.u(context, str));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (com.google.firebase.remoteconfig.internal.u) map.get(str);
    }

    public synchronized java.lang.Void a() {
        this.f44212a.deleteFile(this.f44213b);
        return null;
    }

    java.lang.String b() {
        return this.f44213b;
    }

    public synchronized com.google.firebase.remoteconfig.internal.g d() {
        java.io.FileInputStream fileInputStreamOpenFileInput;
        java.lang.Throwable th;
        try {
            try {
                fileInputStreamOpenFileInput = this.f44212a.openFileInput(this.f44213b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    com.google.firebase.remoteconfig.internal.g gVarB = com.google.firebase.remoteconfig.internal.g.b(new org.json.JSONObject(new java.lang.String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return gVarB;
                } catch (java.io.FileNotFoundException | org.json.JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        } catch (java.io.FileNotFoundException | org.json.JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (java.lang.Throwable th4) {
            fileInputStreamOpenFileInput = null;
            th = th4;
        }
    }

    public synchronized java.lang.Void e(com.google.firebase.remoteconfig.internal.g gVar) {
        java.io.FileOutputStream fileOutputStreamOpenFileOutput = this.f44212a.openFileOutput(this.f44213b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(gVar.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (java.lang.Throwable th) {
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        return null;
    }
}
