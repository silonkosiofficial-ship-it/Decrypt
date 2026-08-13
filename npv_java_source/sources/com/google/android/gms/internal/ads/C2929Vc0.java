package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2929Vc0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile int f32530e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32531f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f32532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f32533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p115l4.AbstractC6931l f32534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32535d;

    public C2929Vc0(android.content.Context context, java.util.concurrent.Executor executor, p115l4.AbstractC6931l abstractC6931l, boolean z6) {
        this.f32532a = context;
        this.f32533b = executor;
        this.f32534c = abstractC6931l;
        this.f32535d = z6;
    }

    public static com.google.android.gms.internal.ads.C2929Vc0 a(final android.content.Context context, java.util.concurrent.Executor executor, boolean z6) {
        final p115l4.C6932m c6932m = new p115l4.C6932m();
        executor.execute(z6 ? new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tc0
            @Override // java.lang.Runnable
            public final void run() {
                c6932m.c(com.google.android.gms.internal.ads.C3075Zd0.b(context, "GLAS", null));
            }
        } : new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Uc0
            @Override // java.lang.Runnable
            public final void run() {
                c6932m.c(com.google.android.gms.internal.ads.C3075Zd0.c());
            }
        });
        return new com.google.android.gms.internal.ads.C2929Vc0(context, executor, c6932m.a(), z6);
    }

    static void g(int i6) {
        f32530e = i6;
    }

    private final p115l4.AbstractC6931l h(final int i6, long j6, java.lang.Exception exc, java.lang.String str, java.util.Map map, java.lang.String str2) {
        if (!this.f32535d) {
            return this.f32534c.h(this.f32533b, new p115l4.InterfaceC6922c() { // from class: com.google.android.gms.internal.ads.Rc0
                @Override // p115l4.InterfaceC6922c
                public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                    return java.lang.Boolean.valueOf(abstractC6931l.o());
                }
            });
        }
        android.content.Context context = this.f32532a;
        final com.google.android.gms.internal.ads.Z7 z7B0 = com.google.android.gms.internal.ads.C3450d8.b0();
        z7B0.z(context.getPackageName());
        z7B0.E(j6);
        z7B0.G(f32530e);
        if (exc != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            exc.printStackTrace(new java.io.PrintWriter(stringWriter));
            z7B0.F(stringWriter.toString());
            z7B0.C(exc.getClass().getName());
        }
        if (str2 != null) {
            z7B0.A(str2);
        }
        if (str != null) {
            z7B0.B(str);
        }
        return this.f32534c.h(this.f32533b, new p115l4.InterfaceC6922c() { // from class: com.google.android.gms.internal.ads.Sc0
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                int i10 = com.google.android.gms.internal.ads.C2929Vc0.f32531f;
                if (!abstractC6931l.o()) {
                    return java.lang.Boolean.FALSE;
                }
                int i11 = i6;
                com.google.android.gms.internal.ads.C3003Xd0 c3003Xd0A = ((com.google.android.gms.internal.ads.C3075Zd0) abstractC6931l.l()).a(((com.google.android.gms.internal.ads.C3450d8) z7B0.u()).l());
                c3003Xd0A.a(i11);
                c3003Xd0A.c();
                return java.lang.Boolean.TRUE;
            }
        });
    }

    public final p115l4.AbstractC6931l b(int i6, java.lang.String str) {
        return h(i6, 0L, null, null, null, str);
    }

    public final p115l4.AbstractC6931l c(int i6, long j6, java.lang.Exception exc) {
        return h(i6, j6, exc, null, null, null);
    }

    public final p115l4.AbstractC6931l d(int i6, long j6) {
        return h(i6, j6, null, null, null, null);
    }

    public final p115l4.AbstractC6931l e(int i6, long j6, java.lang.String str) {
        return h(i6, j6, null, null, null, str);
    }

    public final p115l4.AbstractC6931l f(int i6, long j6, java.lang.String str, java.util.Map map) {
        return h(i6, j6, null, str, null, null);
    }
}
