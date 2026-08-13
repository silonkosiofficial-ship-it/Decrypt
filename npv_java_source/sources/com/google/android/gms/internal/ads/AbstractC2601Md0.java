package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Md0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2601Md0 {
    public static java.io.File a(java.io.File file, boolean z6) {
        if (z6 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static java.io.File b(java.lang.String str, java.lang.String str2, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        return new java.io.File(c(str, file), str2);
    }

    public static java.io.File c(java.lang.String str, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str);
        a(file2, false);
        return file2;
    }

    public static boolean d(java.io.File file) {
        if (!file.exists()) {
            return true;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        boolean z6 = true;
        if (fileArrListFiles != null) {
            for (int i6 = 0; i6 < fileArrListFiles.length; i6++) {
                java.io.File file2 = fileArrListFiles[i6];
                z6 = file2 != null && d(file2) && z6;
            }
        }
        return file.delete() && z6;
    }

    public static boolean e(java.io.File file, byte[] bArr) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                V3.l.a(fileOutputStream2);
                return true;
            } catch (java.io.IOException unused) {
                fileOutputStream = fileOutputStream2;
                V3.l.a(fileOutputStream);
                return false;
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                V3.l.a(fileOutputStream);
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
