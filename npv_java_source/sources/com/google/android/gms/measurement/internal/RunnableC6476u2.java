package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6476u2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.net.URL f42642C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final byte[] f42643D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.InterfaceC6469t2 f42644E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f42645F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.Map f42646G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6449q2 f42647H;

    public RunnableC6476u2(com.google.android.gms.measurement.internal.C6449q2 c6449q2, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.InterfaceC6469t2 interfaceC6469t2) {
        this.f42647H = c6449q2;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(url);
        Q3.AbstractC1477p.l(interfaceC6469t2);
        this.f42642C = url;
        this.f42643D = bArr;
        this.f42644E = interfaceC6469t2;
        this.f42645F = str;
        this.f42646G = map;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.measurement.internal.s2.<init>(java.lang.String, com.google.android.gms.measurement.internal.t2, int, java.lang.Throwable, byte[], java.util.Map, i4.j):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC6476u2.run():void");
    }
}
