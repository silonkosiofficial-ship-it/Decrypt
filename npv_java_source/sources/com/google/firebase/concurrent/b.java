package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes3.dex */
class b implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.ThreadFactory f43949e = java.util.concurrent.Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f43950a = new java.util.concurrent.atomic.AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f43951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.os.StrictMode.ThreadPolicy f43953d;

    b(java.lang.String str, int i6, android.os.StrictMode.ThreadPolicy threadPolicy) {
        this.f43951b = str;
        this.f43952c = i6;
        this.f43953d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(java.lang.Runnable runnable) {
        android.os.Process.setThreadPriority(this.f43952c);
        android.os.StrictMode.ThreadPolicy threadPolicy = this.f43953d;
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(final java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = f43949e.newThread(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f43947C.b(runnable);
            }
        });
        threadNewThread.setName(java.lang.String.format(java.util.Locale.ROOT, "%s Thread #%d", this.f43951b, java.lang.Long.valueOf(this.f43950a.getAndIncrement())));
        return threadNewThread;
    }
}
