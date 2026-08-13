package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3770g30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f35523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f35524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f35525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f35526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TT f35527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f35528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p224w3.a f35529g;

    C3770g30(p214v3.InterfaceC7268s0 interfaceC7268s0, android.content.Context context, com.google.android.gms.internal.ads.Yk0 yk0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.TT tt, com.google.android.gms.internal.ads.C4546n70 c4546n70, p224w3.a aVar) {
        this.f35523a = interfaceC7268s0;
        this.f35524b = context;
        this.f35525c = yk0;
        this.f35526d = scheduledExecutorService;
        this.f35527e = tt;
        this.f35528f = c4546n70;
        this.f35529g = aVar;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 56;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.f35524b.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.L20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P4.d b() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3770g30.b():P4.d");
    }

    final /* synthetic */ P4.d c(final java.lang.Throwable th) {
        com.google.android.gms.internal.ads.C3990i30 c3990i30;
        this.f35525c.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.d30
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.oa)).booleanValue();
                java.lang.Throwable th2 = th;
                if (zBooleanValue) {
                    p174r3.v.s().y(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    p174r3.v.s().w(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof java.lang.SecurityException) {
            c3990i30 = new com.google.android.gms.internal.ads.C3990i30("", 2, null);
        } else if (th instanceof java.lang.IllegalStateException) {
            c3990i30 = new com.google.android.gms.internal.ads.C3990i30("", 3, null);
        } else if (th instanceof java.lang.IllegalArgumentException) {
            c3990i30 = new com.google.android.gms.internal.ads.C3990i30("", 4, null);
        } else {
            c3990i30 = th instanceof java.util.concurrent.TimeoutException ? new com.google.android.gms.internal.ads.C3990i30("", 5, null) : new com.google.android.gms.internal.ads.C3990i30("", 0, null);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c3990i30);
    }
}
