package com.google.firebase.sessions;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"Ꮍ"}, d2 = {"Ꮎ", "Ꮏ", "Ꮐ", "Ꮑ", "", "Ꮒ", "", "Ꮓ", "Ꮔ", "Ꮕ", "Ꮖ", "Ꮗ", "Ꮘ"}, k = 1, mv = {1, 8, 0})
public final class FirebaseSessionsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final p046e5.F backgroundDispatcher;
    private static final p046e5.F blockingDispatcher;
    private static final p046e5.F firebaseApp;
    private static final p046e5.F firebaseInstallationsApi;
    private static final p046e5.F sessionLifecycleServiceBinder;
    private static final p046e5.F sessionsSettings;
    private static final p046e5.F transportFactory;
    private static final java.lang.String LIBRARY_NAME = "fire-sessions";
    private static final com.google.firebase.sessions.FirebaseSessionsRegistrar.a Companion = new com.google.firebase.sessions.FirebaseSessionsRegistrar.a(null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        p046e5.F fB = p046e5.F.b(Q4.f.class);
        p247y7.AbstractC7350t.e(fB, "unqualified(FirebaseApp::class.java)");
        firebaseApp = fB;
        p046e5.F fB2 = p046e5.F.b(G5.e.class);
        p247y7.AbstractC7350t.e(fB2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = fB2;
        p046e5.F fA = p046e5.F.a(U4.a.class, W8.J.class);
        p247y7.AbstractC7350t.e(fA, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = fA;
        p046e5.F fA2 = p046e5.F.a(U4.b.class, W8.J.class);
        p247y7.AbstractC7350t.e(fA2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = fA2;
        p046e5.F fB3 = p046e5.F.b(W2.i.class);
        p247y7.AbstractC7350t.e(fB3, "unqualified(TransportFactory::class.java)");
        transportFactory = fB3;
        p046e5.F fB4 = p046e5.F.b(U5.f.class);
        p247y7.AbstractC7350t.e(fB4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = fB4;
        p046e5.F fB5 = p046e5.F.b(S5.F.class);
        p247y7.AbstractC7350t.e(fB5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = fB5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S5.k getComponents$lambda$0(p046e5.InterfaceC6532e interfaceC6532e) {
        java.lang.Object objC = interfaceC6532e.c(firebaseApp);
        p247y7.AbstractC7350t.e(objC, "container[firebaseApp]");
        java.lang.Object objC2 = interfaceC6532e.c(sessionsSettings);
        p247y7.AbstractC7350t.e(objC2, "container[sessionsSettings]");
        java.lang.Object objC3 = interfaceC6532e.c(backgroundDispatcher);
        p247y7.AbstractC7350t.e(objC3, "container[backgroundDispatcher]");
        java.lang.Object objC4 = interfaceC6532e.c(sessionLifecycleServiceBinder);
        p247y7.AbstractC7350t.e(objC4, "container[sessionLifecycleServiceBinder]");
        return new S5.k((Q4.f) objC, (U5.f) objC2, (p127m7.i) objC3, (S5.F) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.c getComponents$lambda$1(p046e5.InterfaceC6532e interfaceC6532e) {
        return new com.google.firebase.sessions.c(S5.J.f12480a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.b getComponents$lambda$2(p046e5.InterfaceC6532e interfaceC6532e) {
        java.lang.Object objC = interfaceC6532e.c(firebaseApp);
        p247y7.AbstractC7350t.e(objC, "container[firebaseApp]");
        Q4.f fVar = (Q4.f) objC;
        java.lang.Object objC2 = interfaceC6532e.c(firebaseInstallationsApi);
        p247y7.AbstractC7350t.e(objC2, "container[firebaseInstallationsApi]");
        G5.e eVar = (G5.e) objC2;
        java.lang.Object objC3 = interfaceC6532e.c(sessionsSettings);
        p247y7.AbstractC7350t.e(objC3, "container[sessionsSettings]");
        U5.f fVar2 = (U5.f) objC3;
        F5.b bVarF = interfaceC6532e.f(transportFactory);
        p247y7.AbstractC7350t.e(bVarF, "container.getProvider(transportFactory)");
        S5.C1624g c1624g = new S5.C1624g(bVarF);
        java.lang.Object objC4 = interfaceC6532e.c(backgroundDispatcher);
        p247y7.AbstractC7350t.e(objC4, "container[backgroundDispatcher]");
        return new S5.B(fVar, eVar, fVar2, c1624g, (p127m7.i) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U5.f getComponents$lambda$3(p046e5.InterfaceC6532e interfaceC6532e) {
        java.lang.Object objC = interfaceC6532e.c(firebaseApp);
        p247y7.AbstractC7350t.e(objC, "container[firebaseApp]");
        java.lang.Object objC2 = interfaceC6532e.c(blockingDispatcher);
        p247y7.AbstractC7350t.e(objC2, "container[blockingDispatcher]");
        java.lang.Object objC3 = interfaceC6532e.c(backgroundDispatcher);
        p247y7.AbstractC7350t.e(objC3, "container[backgroundDispatcher]");
        java.lang.Object objC4 = interfaceC6532e.c(firebaseInstallationsApi);
        p247y7.AbstractC7350t.e(objC4, "container[firebaseInstallationsApi]");
        return new U5.f((Q4.f) objC, (p127m7.i) objC2, (p127m7.i) objC3, (G5.e) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(p046e5.InterfaceC6532e interfaceC6532e) {
        android.content.Context contextK = ((Q4.f) interfaceC6532e.c(firebaseApp)).k();
        p247y7.AbstractC7350t.e(contextK, "container[firebaseApp].applicationContext");
        java.lang.Object objC = interfaceC6532e.c(backgroundDispatcher);
        p247y7.AbstractC7350t.e(objC, "container[backgroundDispatcher]");
        return new S5.x(contextK, (p127m7.i) objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S5.F getComponents$lambda$5(p046e5.InterfaceC6532e interfaceC6532e) {
        java.lang.Object objC = interfaceC6532e.c(firebaseApp);
        p247y7.AbstractC7350t.e(objC, "container[firebaseApp]");
        return new S5.G((Q4.f) objC);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        p046e5.C6530c.b bVarH = p046e5.C6530c.e(S5.k.class).h("fire-sessions");
        p046e5.F f6 = firebaseApp;
        p046e5.C6530c.b bVarB = bVarH.b(p046e5.r.i(f6));
        p046e5.F f10 = sessionsSettings;
        p046e5.C6530c.b bVarB2 = bVarB.b(p046e5.r.i(f10));
        p046e5.F f11 = backgroundDispatcher;
        p046e5.C6530c c6530cD = bVarB2.b(p046e5.r.i(f11)).b(p046e5.r.i(sessionLifecycleServiceBinder)).f(new p046e5.h() { // from class: S5.m
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC6532e);
            }
        }).e().d();
        p046e5.C6530c c6530cD2 = p046e5.C6530c.e(com.google.firebase.sessions.c.class).h("session-generator").f(new p046e5.h() { // from class: S5.n
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC6532e);
            }
        }).d();
        p046e5.C6530c.b bVarB3 = p046e5.C6530c.e(com.google.firebase.sessions.b.class).h("session-publisher").b(p046e5.r.i(f6));
        p046e5.F f12 = firebaseInstallationsApi;
        return p097j7.AbstractC6879v.p(c6530cD, c6530cD2, bVarB3.b(p046e5.r.i(f12)).b(p046e5.r.i(f10)).b(p046e5.r.k(transportFactory)).b(p046e5.r.i(f11)).f(new p046e5.h() { // from class: S5.o
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$2(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.e(U5.f.class).h("sessions-settings").b(p046e5.r.i(f6)).b(p046e5.r.i(blockingDispatcher)).b(p046e5.r.i(f11)).b(p046e5.r.i(f12)).f(new p046e5.h() { // from class: S5.p
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$3(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.e(com.google.firebase.sessions.a.class).h("sessions-datastore").b(p046e5.r.i(f6)).b(p046e5.r.i(f11)).f(new p046e5.h() { // from class: S5.q
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$4(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.e(S5.F.class).h("sessions-service-binder").b(p046e5.r.i(f6)).f(new p046e5.h() { // from class: S5.r
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$5(interfaceC6532e);
            }
        }).d(), M5.h.b("fire-sessions", "2.0.7"));
    }
}
