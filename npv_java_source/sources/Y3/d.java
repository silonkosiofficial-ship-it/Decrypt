package Y3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.ClassLoader f16348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.Thread f16349b;

    /* JADX WARN: Code duplicated, block: B:52:0x00a8 A[Catch: all -> 0x00a4, PHI: r1
  0x00a8: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:46:0x00a1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x009f, B:60:0x00cc, B:12:0x001f, B:51:0x00a7, B:52:0x00a8, B:63:0x00d0, B:64:0x00d1, B:53:0x00a9, B:59:0x00cb, B:58:0x00b3, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:42:0x0085, B:43:0x009d, B:18:0x003c), top: B:74:0x0003, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized java.lang.ClassLoader a() {
        java.lang.SecurityException e6;
        java.lang.Thread thread;
        java.lang.ThreadGroup threadGroup;
        if (f16348a == null) {
            java.lang.Thread thread2 = f16349b;
            java.lang.ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f16349b.getContextClassLoader();
                    } catch (java.lang.SecurityException e10) {
                        java.lang.String str = "Failed to get thread context classloader " + e10.getMessage();
                    }
                }
                f16348a = contextClassLoader;
            } else {
                java.lang.ThreadGroup threadGroup2 = android.os.Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (java.lang.Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                java.lang.ThreadGroup[] threadGroupArr = new java.lang.ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i6 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i10];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new java.lang.ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                java.lang.Thread[] threadArr = new java.lang.Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i6 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i6];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i6++;
                                }
                                if (thread == null) {
                                    try {
                                        Y3.c cVar = new Y3.c(threadGroup, "GmsDynamite");
                                        try {
                                            cVar.setContextClassLoader(null);
                                            cVar.start();
                                            thread = cVar;
                                        } catch (java.lang.SecurityException e11) {
                                            e6 = e11;
                                            thread = cVar;
                                            java.lang.String str2 = "Failed to enumerate thread/threadgroup " + e6.getMessage();
                                        }
                                    } catch (java.lang.SecurityException e12) {
                                        e6 = e12;
                                    }
                                }
                            } catch (java.lang.SecurityException e13) {
                                e6 = e13;
                                thread = null;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f16349b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f16349b.getContextClassLoader();
                    }
                }
                f16348a = contextClassLoader;
            }
        }
        return f16348a;
    }
}
