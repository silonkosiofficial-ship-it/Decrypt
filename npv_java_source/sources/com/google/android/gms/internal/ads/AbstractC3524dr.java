package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3524dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Yk0 f34795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Yk0 f34796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Yk0 f34797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ScheduledExecutorService f34798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Zk0 f34799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Yk0 f34800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Yk0 f34801g;

    /* JADX WARN: Code duplicated, block: B:14:0x0091  */
    static {
        java.util.concurrent.Executor threadPoolExecutor;
        java.util.concurrent.ExecutorService executorServiceA;
        java.util.concurrent.ExecutorService executorServiceB;
        if (V3.e.a()) {
            com.google.android.gms.internal.ads.AbstractC2308Ee0.a();
            threadPoolExecutor = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Default")));
        } else {
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.gb;
            if (p184s3.A.c().b(abstractC5037rf) == null || !((java.lang.Boolean) p184s3.A.c().b(abstractC5037rf)).booleanValue()) {
                threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Default"));
            } else {
                com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf2 = com.google.android.gms.internal.ads.AbstractC2161Af.hb;
                if (p184s3.A.c().b(abstractC5037rf2) != null) {
                    com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf3 = com.google.android.gms.internal.ads.AbstractC2161Af.ib;
                    if (p184s3.A.c().b(abstractC5037rf3) != null) {
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = new java.util.concurrent.ThreadPoolExecutor(((java.lang.Integer) p184s3.A.c().b(abstractC5037rf2)).intValue(), ((java.lang.Integer) p184s3.A.c().b(abstractC5037rf2)).intValue(), 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((java.lang.Boolean) p184s3.A.c().b(abstractC5037rf3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Default"));
                    }
                } else {
                    threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Default"));
                }
            }
        }
        com.google.android.gms.internal.ads.AbstractC3415cr abstractC3415cr = null;
        f34795a = new com.google.android.gms.internal.ads.C3306br(threadPoolExecutor, abstractC3415cr);
        if (V3.e.a()) {
            executorServiceA = com.google.android.gms.internal.ads.AbstractC2308Ee0.a().a(5, new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Loader"), 1);
        } else {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor3 = new java.util.concurrent.ThreadPoolExecutor(5, 5, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceA = threadPoolExecutor3;
        }
        f34796b = new com.google.android.gms.internal.ads.C3306br(executorServiceA, abstractC3415cr);
        if (V3.e.a()) {
            executorServiceB = com.google.android.gms.internal.ads.AbstractC2308Ee0.a().b(new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Activeview"), 1);
        } else {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor4 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceB = threadPoolExecutor4;
        }
        f34797c = new com.google.android.gms.internal.ads.C3306br(executorServiceB, abstractC3415cr);
        com.google.android.gms.internal.ads.C3058Yq c3058Yq = new com.google.android.gms.internal.ads.C3058Yq(3, new com.google.android.gms.internal.ads.ThreadFactoryC3094Zq("Schedule"));
        f34798d = c3058Yq;
        f34799e = com.google.android.gms.internal.ads.AbstractC3733fl0.b(c3058Yq);
        f34800f = new com.google.android.gms.internal.ads.C3306br(new com.google.android.gms.internal.ads.ExecutorC3196ar(), abstractC3415cr);
        f34801g = new com.google.android.gms.internal.ads.C3306br(com.google.android.gms.internal.ads.AbstractC3733fl0.c(), abstractC3415cr);
    }
}
