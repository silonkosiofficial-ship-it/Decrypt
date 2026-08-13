package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f44176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.t f44177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f44178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q4.f f44179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G5.e f44180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.Context f44182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f44183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f44184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f44185j;

    public q(Q4.f fVar, G5.e eVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.f fVar2, android.content.Context context, java.lang.String str, com.google.firebase.remoteconfig.internal.p pVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.f44176a = linkedHashSet;
        this.f44177b = new com.google.firebase.remoteconfig.internal.t(fVar, eVar, mVar, fVar2, context, str, linkedHashSet, pVar, scheduledExecutorService);
        this.f44179d = fVar;
        this.f44178c = mVar;
        this.f44180e = eVar;
        this.f44181f = fVar2;
        this.f44182g = context;
        this.f44183h = str;
        this.f44184i = pVar;
        this.f44185j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f44176a.isEmpty()) {
            this.f44177b.C();
        }
    }

    public synchronized void b(boolean z6) {
        this.f44177b.z(z6);
        if (!z6) {
            a();
        }
    }
}
