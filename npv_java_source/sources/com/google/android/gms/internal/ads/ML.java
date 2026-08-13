package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ML implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p174r3.a f29705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f29706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f29707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f29708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f29709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f29710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p224w3.a f29711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f29712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f29713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4985r70 f29714j;

    public ML(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.Z9 z10, p224w3.a aVar, p174r3.a aVar2, com.google.android.gms.internal.ads.C3640eu c3640eu, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        this.f29706b = context;
        this.f29709e = executor;
        this.f29710f = z10;
        this.f29711g = aVar;
        this.f29705a = aVar2;
        this.f29708d = c4033iT;
        this.f29712h = c2559La0;
        this.f29707c = c3588eO;
        this.f29713i = binderC5240tT;
        this.f29714j = c4985r70;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        com.google.android.gms.internal.ads.PL pl = new com.google.android.gms.internal.ads.PL(this);
        pl.k();
        return pl;
    }
}
