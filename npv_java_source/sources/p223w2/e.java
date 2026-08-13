package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void a(java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.channels.FileChannel fileChannel) throws java.io.IOException {
        p247y7.AbstractC7350t.f(readableByteChannel, "input");
        p247y7.AbstractC7350t.f(fileChannel, "output");
        try {
            if (android.os.Build.VERSION.SDK_INT <= 23) {
                java.io.InputStream inputStreamNewInputStream = java.nio.channels.Channels.newInputStream(readableByteChannel);
                java.io.OutputStream outputStreamNewOutputStream = java.nio.channels.Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i6 = inputStreamNewInputStream.read(bArr);
                    if (i6 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i6);
                    }
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
