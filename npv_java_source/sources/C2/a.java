package C2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2.a.C0019a f1274e = new C2.a.C0019a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Map f1275f = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.io.File f1277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.locks.Lock f1278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.nio.channels.FileChannel f1279d;

    /* JADX INFO: renamed from: C2.a$a, reason: collision with other inner class name */
    private static final class C0019a {
        private C0019a() {
        }

        public /* synthetic */ C0019a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.concurrent.locks.Lock b(java.lang.String str) {
            java.util.concurrent.locks.Lock lock;
            synchronized (C2.a.f1275f) {
                try {
                    java.util.Map map = C2.a.f1275f;
                    java.lang.Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new java.util.concurrent.locks.ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (java.util.concurrent.locks.Lock) reentrantLock;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return lock;
        }
    }

    public a(java.lang.String str, java.io.File file, boolean z6) {
        java.io.File file2;
        p247y7.AbstractC7350t.f(str, "name");
        this.f1276a = z6;
        if (file != null) {
            file2 = new java.io.File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.f1277b = file2;
        this.f1278c = f1274e.b(str);
    }

    public static /* synthetic */ void c(C2.a aVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = aVar.f1276a;
        }
        aVar.b(z6);
    }

    public final void b(boolean z6) {
        this.f1278c.lock();
        if (z6) {
            try {
                java.io.File file = this.f1277b;
                if (file == null) {
                    throw new java.io.IOException("No lock directory was provided.");
                }
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(this.f1277b).getChannel();
                channel.lock();
                this.f1279d = channel;
            } catch (java.io.IOException e6) {
                this.f1279d = null;
            }
        }
    }

    public final void d() {
        try {
            java.nio.channels.FileChannel fileChannel = this.f1279d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (java.io.IOException unused) {
        }
        this.f1278c.unlock();
    }
}
