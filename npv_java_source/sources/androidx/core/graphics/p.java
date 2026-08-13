package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.nio.ByteBuffer b(android.content.Context context, android.content.res.Resources resources, int i6) {
        java.io.File fileE = e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (c(fileE, resources, i6)) {
                return g(fileE);
            }
            return null;
        } finally {
            fileE.delete();
        }
    }

    public static boolean c(java.io.File file, android.content.res.Resources resources, int i6) throws java.lang.Throwable {
        java.io.InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i6);
            try {
                boolean zD = d(file, inputStreamOpenRawResource);
                a(inputStreamOpenRawResource);
                return zD;
            } catch (java.lang.Throwable th) {
                th = th;
                a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean d(java.io.File file, java.io.InputStream inputStream) throws java.lang.Throwable {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i6 = inputStream.read(bArr);
                        if (i6 == -1) {
                            a(fileOutputStream2);
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i6);
                    }
                } catch (java.io.IOException e6) {
                    e = e6;
                    fileOutputStream = fileOutputStream2;
                    java.lang.String str = "Error copying resource contents to temp file: " + e.getMessage();
                    a(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (java.io.IOException e10) {
                e = e10;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static java.io.File e(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i6 = 0; i6 < 100; i6++) {
            java.io.File file = new java.io.File(cacheDir, str + i6);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return null;
    }

    public static java.nio.ByteBuffer f(android.content.Context context, android.os.CancellationSignal cancellationSignal, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private static java.nio.ByteBuffer g(java.io.File file) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static java.util.Map h(android.content.Context context, y1.h.b[] bVarArr, android.os.CancellationSignal cancellationSignal) {
        java.util.HashMap map = new java.util.HashMap();
        for (y1.h.b bVar : bVarArr) {
            if (bVar.b() == 0) {
                android.net.Uri uriD = bVar.d();
                if (!map.containsKey(uriD)) {
                    map.put(uriD, f(context, cancellationSignal, uriD));
                }
            }
        }
        return j$.util.DesugarCollections.unmodifiableMap(map);
    }
}
