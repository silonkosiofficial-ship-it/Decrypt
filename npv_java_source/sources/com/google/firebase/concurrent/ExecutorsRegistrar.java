package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@android.annotation.SuppressLint({"፞"})
public class ExecutorsRegistrar implements com.google.firebase.components.ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p046e5.x f43943a = new p046e5.x(new F5.b() { // from class: f5.b
        @Override // F5.b
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final p046e5.x f43944b = new p046e5.x(new F5.b() { // from class: f5.c
        @Override // F5.b
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final p046e5.x f43945c = new p046e5.x(new F5.b() { // from class: f5.d
        @Override // F5.b
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final p046e5.x f43946d = new p046e5.x(new F5.b() { // from class: f5.e
        @Override // F5.b
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.s();
        }
    });

    private static android.os.StrictMode.ThreadPolicy i() {
        android.os.StrictMode.ThreadPolicy.Builder builderDetectNetwork = new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i6 = android.os.Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i6 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static java.util.concurrent.ThreadFactory j(java.lang.String str, int i6) {
        return new com.google.firebase.concurrent.b(str, i6, null);
    }

    private static java.util.concurrent.ThreadFactory k(java.lang.String str, int i6, android.os.StrictMode.ThreadPolicy threadPolicy) {
        return new com.google.firebase.concurrent.b(str, i6, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService l(p046e5.InterfaceC6532e interfaceC6532e) {
        return (java.util.concurrent.ScheduledExecutorService) f43943a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService m(p046e5.InterfaceC6532e interfaceC6532e) {
        return (java.util.concurrent.ScheduledExecutorService) f43945c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService n(p046e5.InterfaceC6532e interfaceC6532e) {
        return (java.util.concurrent.ScheduledExecutorService) f43944b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.Executor o(p046e5.InterfaceC6532e interfaceC6532e) {
        return p056f5.l.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService p() {
        return u(java.util.concurrent.Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService q() {
        return u(java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService r() {
        return u(java.util.concurrent.Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService s() {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static android.os.StrictMode.ThreadPolicy t() {
        return new android.os.StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static java.util.concurrent.ScheduledExecutorService u(java.util.concurrent.ExecutorService executorService) {
        return new com.google.firebase.concurrent.o(executorService, (java.util.concurrent.ScheduledExecutorService) f43946d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.d(p046e5.F.a(U4.a.class, java.util.concurrent.ScheduledExecutorService.class), p046e5.F.a(U4.a.class, java.util.concurrent.ExecutorService.class), p046e5.F.a(U4.a.class, java.util.concurrent.Executor.class)).f(new p046e5.h() { // from class: f5.f
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.l(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.d(p046e5.F.a(U4.b.class, java.util.concurrent.ScheduledExecutorService.class), p046e5.F.a(U4.b.class, java.util.concurrent.ExecutorService.class), p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class)).f(new p046e5.h() { // from class: f5.g
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.m(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.d(p046e5.F.a(U4.c.class, java.util.concurrent.ScheduledExecutorService.class), p046e5.F.a(U4.c.class, java.util.concurrent.ExecutorService.class), p046e5.F.a(U4.c.class, java.util.concurrent.Executor.class)).f(new p046e5.h() { // from class: f5.h
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.n(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.c(p046e5.F.a(U4.d.class, java.util.concurrent.Executor.class)).f(new p046e5.h() { // from class: f5.i
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.o(interfaceC6532e);
            }
        }).d());
    }
}
