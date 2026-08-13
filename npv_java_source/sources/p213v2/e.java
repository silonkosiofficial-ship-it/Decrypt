package p213v2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p253z2.e, p143o2.InterfaceC7024d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f55804C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f55805D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.io.File f55806E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.Callable f55807F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f55808G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p253z2.e f55809H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p143o2.C7023c f55810I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f55811J;

    public e(android.content.Context context, java.lang.String str, java.io.File file, java.util.concurrent.Callable callable, int i6, p253z2.e eVar) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(eVar, "delegate");
        this.f55804C = context;
        this.f55805D = str;
        this.f55806E = file;
        this.f55807F = callable;
        this.f55808G = i6;
        this.f55809H = eVar;
    }

    private final void f(java.io.File file, boolean z6) throws java.io.IOException {
        java.nio.channels.ReadableByteChannel readableByteChannelNewChannel;
        java.lang.String str;
        if (this.f55805D != null) {
            readableByteChannelNewChannel = java.nio.channels.Channels.newChannel(this.f55804C.getAssets().open(this.f55805D));
            str = "newChannel(context.assets.open(copyFromAssetPath))";
        } else if (this.f55806E != null) {
            readableByteChannelNewChannel = new java.io.FileInputStream(this.f55806E).getChannel();
            str = "FileInputStream(copyFromFile).channel";
        } else {
            java.util.concurrent.Callable callable = this.f55807F;
            if (callable == null) {
                throw new java.lang.IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = java.nio.channels.Channels.newChannel((java.io.InputStream) callable.call());
                str = "newChannel(inputStream)";
            } catch (java.lang.Exception e6) {
                throw new java.io.IOException("inputStreamCallable exception on call", e6);
            }
        }
        p247y7.AbstractC7350t.e(readableByteChannelNewChannel, str);
        java.io.File fileCreateTempFile = java.io.File.createTempFile("room-copy-helper", ".tmp", this.f55804C.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        java.nio.channels.FileChannel channel = new java.io.FileOutputStream(fileCreateTempFile).getChannel();
        p247y7.AbstractC7350t.e(channel, "output");
        p223w2.e.a(readableByteChannelNewChannel, channel);
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new java.io.IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        p247y7.AbstractC7350t.e(fileCreateTempFile, "intermediateFile");
        g(fileCreateTempFile, z6);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new java.io.IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void g(java.io.File file, boolean z6) {
        p143o2.C7023c c7023c = this.f55810I;
        if (c7023c == null) {
            p247y7.AbstractC7350t.p("databaseConfiguration");
            c7023c = null;
        }
        c7023c.getClass();
    }

    private final void o(boolean z6) {
        java.lang.String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.io.File databasePath = this.f55804C.getDatabasePath(databaseName);
        p143o2.C7023c c7023c = this.f55810I;
        p143o2.C7023c c7023c2 = null;
        if (c7023c == null) {
            p247y7.AbstractC7350t.p("databaseConfiguration");
            c7023c = null;
        }
        C2.a aVar = new C2.a(databaseName, this.f55804C.getFilesDir(), c7023c.f52418v);
        try {
            C2.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    p247y7.AbstractC7350t.e(databasePath, "databaseFile");
                    f(databasePath, z6);
                    aVar.d();
                    return;
                } catch (java.io.IOException e6) {
                    throw new java.lang.RuntimeException("Unable to copy database file.", e6);
                }
            }
            try {
                p247y7.AbstractC7350t.e(databasePath, "databaseFile");
                int iF = p223w2.b.f(databasePath);
                if (iF == this.f55808G) {
                    aVar.d();
                    return;
                }
                p143o2.C7023c c7023c3 = this.f55810I;
                if (c7023c3 == null) {
                    p247y7.AbstractC7350t.p("databaseConfiguration");
                } else {
                    c7023c2 = c7023c3;
                }
                if (c7023c2.e(iF, this.f55808G)) {
                    aVar.d();
                    return;
                }
                if (this.f55804C.deleteDatabase(databaseName)) {
                    try {
                        f(databasePath, z6);
                    } catch (java.io.IOException e10) {
                    }
                } else {
                    java.lang.String str = "Failed to delete database file (" + databaseName + ") for a copy destructive migration.";
                }
                aVar.d();
            } catch (java.io.IOException e11) {
                aVar.d();
            }
        } catch (java.lang.Throwable th) {
            aVar.d();
            throw th;
        }
    }

    @Override // p143o2.InterfaceC7024d
    public p253z2.e a() {
        return this.f55809H;
    }

    @Override // p253z2.e, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f55811J = false;
    }

    @Override // p253z2.e
    public java.lang.String getDatabaseName() {
        return a().getDatabaseName();
    }

    public final void i(p143o2.C7023c c7023c) {
        p247y7.AbstractC7350t.f(c7023c, "databaseConfiguration");
        this.f55810I = c7023c;
    }

    @Override // p253z2.e
    public void setWriteAheadLoggingEnabled(boolean z6) {
        a().setWriteAheadLoggingEnabled(z6);
    }

    @Override // p253z2.e
    public p253z2.d v0() {
        if (!this.f55811J) {
            o(true);
            this.f55811J = true;
        }
        return a().v0();
    }
}
