package p153p2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f52723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.nio.channels.FileChannel f52724b;

    public c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "filename");
        this.f52723a = str + ".lck";
    }

    public final void a() throws java.io.IOException {
        if (this.f52724b != null) {
            return;
        }
        try {
            java.io.File file = new java.io.File(this.f52723a);
            java.io.File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file).getChannel();
            this.f52724b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (java.lang.Throwable th) {
            java.nio.channels.FileChannel fileChannel = this.f52724b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f52724b = null;
            throw new java.lang.IllegalStateException("Unable to lock file: '" + this.f52723a + "'.", th);
        }
    }

    public final void b() {
        java.nio.channels.FileChannel fileChannel = this.f52724b;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.f52724b = null;
        }
    }
}
