package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4550n90 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final P4.d f37529d = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f37530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f37531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4660o90 f37532c;

    public AbstractC4550n90(com.google.android.gms.internal.ads.Yk0 yk0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.InterfaceC4660o90 interfaceC4660o90) {
        this.f37530a = yk0;
        this.f37531b = scheduledExecutorService;
        this.f37532c = interfaceC4660o90;
    }

    public final com.google.android.gms.internal.ads.C3343c90 a(java.lang.Object obj, P4.d... dVarArr) {
        return new com.google.android.gms.internal.ads.C3343c90(this, obj, java.util.Arrays.asList(dVarArr), null);
    }

    public final com.google.android.gms.internal.ads.C4330l90 b(java.lang.Object obj, P4.d dVar) {
        return new com.google.android.gms.internal.ads.C4330l90(this, obj, dVar, java.util.Collections.singletonList(dVar), dVar);
    }

    protected abstract java.lang.String f(java.lang.Object obj);
}
