package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ThreadFactoryC6069m1 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ThreadFactory f41033a = java.util.concurrent.Executors.defaultThreadFactory();

    ThreadFactoryC6069m1(com.google.android.gms.internal.measurement.C5997e1 c5997e1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.f41033a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
