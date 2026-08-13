package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3640eu {
    public static final com.google.android.gms.internal.ads.InterfaceC2698Ot a(final android.content.Context context, final com.google.android.gms.internal.ads.C2625Mu c2625Mu, final java.lang.String str, final boolean z6, final boolean z10, final com.google.android.gms.internal.ads.Z9 z11, final com.google.android.gms.internal.ads.C4051ig c4051ig, final p224w3.a aVar, com.google.android.gms.internal.ads.C2752Qf c2752Qf, final p174r3.n nVar, final p174r3.a aVar2, final com.google.android.gms.internal.ads.C4704od c4704od, final com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.U60 u60, final com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, final com.google.android.gms.internal.ads.C4985r70 c4985r70) throws com.google.android.gms.internal.ads.C3530du {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        try {
            final com.google.android.gms.internal.ads.C2752Qf c2752Qf2 = null;
            com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0 = new com.google.android.gms.internal.ads.InterfaceC2865Tg0(context, c2625Mu, str, z6, z10, z11, c4051ig, aVar, c2752Qf2, nVar, aVar2, c4704od, r60, u60, c4985r70, binderC5240tT) { // from class: com.google.android.gms.internal.ads.au

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                public final /* synthetic */ android.content.Context f34158C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.C2625Mu f34159D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f34160E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                public final /* synthetic */ boolean f34161F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                public final /* synthetic */ boolean f34162G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.Z9 f34163H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.C4051ig f34164I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                public final /* synthetic */ p224w3.a f34165J;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                public final /* synthetic */ p174r3.n f34166K;

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                public final /* synthetic */ p174r3.a f34167L;

                /* JADX INFO: renamed from: M, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.C4704od f34168M;

                /* JADX INFO: renamed from: N, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.R60 f34169N;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.U60 f34170O;

                /* JADX INFO: renamed from: P, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.C4985r70 f34171P;

                /* JADX INFO: renamed from: Q, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.ads.BinderC5240tT f34172Q;

                {
                    this.f34166K = nVar;
                    this.f34167L = aVar2;
                    this.f34168M = c4704od;
                    this.f34169N = r60;
                    this.f34170O = u60;
                    this.f34171P = c4985r70;
                    this.f34172Q = binderC5240tT;
                }

                @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
                public final java.lang.Object a() {
                    com.google.android.gms.internal.ads.C2625Mu c2625Mu2 = this.f34159D;
                    java.lang.String str2 = this.f34160E;
                    boolean z12 = this.f34161F;
                    com.google.android.gms.internal.ads.C4704od c4704od2 = this.f34168M;
                    boolean z13 = this.f34162G;
                    com.google.android.gms.internal.ads.Z9 z14 = this.f34163H;
                    com.google.android.gms.internal.ads.R60 r61 = this.f34169N;
                    com.google.android.gms.internal.ads.C4051ig c4051ig2 = this.f34164I;
                    p174r3.n nVar2 = this.f34166K;
                    com.google.android.gms.internal.ads.U60 u61 = this.f34170O;
                    android.content.Context context2 = this.f34158C;
                    p224w3.a aVar3 = this.f34165J;
                    p174r3.a aVar4 = this.f34167L;
                    com.google.android.gms.internal.ads.C4985r70 c4985r71 = this.f34171P;
                    com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT2 = this.f34172Q;
                    try {
                        android.net.TrafficStats.setThreadStatsTag(264);
                        int i6 = com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu.f38344D0;
                        com.google.android.gms.internal.ads.C4188ju c4188ju = new com.google.android.gms.internal.ads.C4188ju(new com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu(new com.google.android.gms.internal.ads.C2588Lu(context2), c2625Mu2, str2, z12, z13, z14, c4051ig2, aVar3, null, nVar2, aVar4, c4704od2, r61, u61, c4985r71));
                        c4188ju.setWebViewClient(p174r3.v.u().c(c4188ju, c4704od2, z13, binderC5240tT2));
                        c4188ju.setWebChromeClient(new com.google.android.gms.internal.ads.C2661Nt(c4188ju));
                        return c4188ju;
                    } finally {
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            try {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (com.google.android.gms.internal.ads.InterfaceC2698Ot) interfaceC2865Tg0.a();
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.ads.C3530du("Webview initialization failed.", th);
        }
    }
}
