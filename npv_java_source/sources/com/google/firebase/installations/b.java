package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.nio.channels.FileChannel f44010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.nio.channels.FileLock f44011b;

    private b(java.nio.channels.FileChannel fileChannel, java.nio.channels.FileLock fileLock) {
        this.f44010a = fileChannel;
        this.f44011b = fileLock;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static com.google.firebase.installations.b a(android.content.Context context, java.lang.String str) {
        java.nio.channels.FileChannel channel;
        java.nio.channels.FileLock fileLockLock;
        try {
            channel = new java.io.RandomAccessFile(new java.io.File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new com.google.firebase.installations.b(channel, fileLockLock);
                } catch (java.io.IOException e6) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return null;
                } catch (java.lang.Error e10) {
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (java.nio.channels.OverlappingFileLockException e11) {
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException e12) {
                fileLockLock = null;
            }
        } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException e13) {
            channel = null;
            fileLockLock = null;
        }
    }

    void b() {
        try {
            this.f44011b.release();
            this.f44010a.close();
        } catch (java.io.IOException e6) {
        }
    }
}
