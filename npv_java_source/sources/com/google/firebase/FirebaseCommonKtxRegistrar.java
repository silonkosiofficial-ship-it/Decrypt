package com.google.firebase;

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
@kotlin.Metadata(d1 = {"ፃ"}, d2 = {"ፄ", "ፅ", "ፆ", "ፇ", "", "ፈ", "ፉ", "ፊ", "ፋ"}, k = 1, mv = {1, 8, 0})
public final class FirebaseCommonKtxRegistrar implements com.google.firebase.components.ComponentRegistrar {

    public static final class a implements p046e5.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.google.firebase.FirebaseCommonKtxRegistrar.a f43918a = new com.google.firebase.FirebaseCommonKtxRegistrar.a();

        @Override // p046e5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W8.J a(p046e5.InterfaceC6532e interfaceC6532e) {
            java.lang.Object objC = interfaceC6532e.c(p046e5.F.a(U4.a.class, java.util.concurrent.Executor.class));
            p247y7.AbstractC7350t.e(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return W8.AbstractC1808s0.b((java.util.concurrent.Executor) objC);
        }
    }

    public static final class b implements p046e5.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.google.firebase.FirebaseCommonKtxRegistrar.b f43919a = new com.google.firebase.FirebaseCommonKtxRegistrar.b();

        @Override // p046e5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W8.J a(p046e5.InterfaceC6532e interfaceC6532e) {
            java.lang.Object objC = interfaceC6532e.c(p046e5.F.a(U4.c.class, java.util.concurrent.Executor.class));
            p247y7.AbstractC7350t.e(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return W8.AbstractC1808s0.b((java.util.concurrent.Executor) objC);
        }
    }

    public static final class c implements p046e5.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.google.firebase.FirebaseCommonKtxRegistrar.c f43920a = new com.google.firebase.FirebaseCommonKtxRegistrar.c();

        @Override // p046e5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W8.J a(p046e5.InterfaceC6532e interfaceC6532e) {
            java.lang.Object objC = interfaceC6532e.c(p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class));
            p247y7.AbstractC7350t.e(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return W8.AbstractC1808s0.b((java.util.concurrent.Executor) objC);
        }
    }

    public static final class d implements p046e5.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.google.firebase.FirebaseCommonKtxRegistrar.d f43921a = new com.google.firebase.FirebaseCommonKtxRegistrar.d();

        @Override // p046e5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W8.J a(p046e5.InterfaceC6532e interfaceC6532e) {
            java.lang.Object objC = interfaceC6532e.c(p046e5.F.a(U4.d.class, java.util.concurrent.Executor.class));
            p247y7.AbstractC7350t.e(objC, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return W8.AbstractC1808s0.b((java.util.concurrent.Executor) objC);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        p046e5.C6530c c6530cD = p046e5.C6530c.c(p046e5.F.a(U4.a.class, W8.J.class)).b(p046e5.r.i(p046e5.F.a(U4.a.class, java.util.concurrent.Executor.class))).f(com.google.firebase.FirebaseCommonKtxRegistrar.a.f43918a).d();
        p247y7.AbstractC7350t.e(c6530cD, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        p046e5.C6530c c6530cD2 = p046e5.C6530c.c(p046e5.F.a(U4.c.class, W8.J.class)).b(p046e5.r.i(p046e5.F.a(U4.c.class, java.util.concurrent.Executor.class))).f(com.google.firebase.FirebaseCommonKtxRegistrar.b.f43919a).d();
        p247y7.AbstractC7350t.e(c6530cD2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        p046e5.C6530c c6530cD3 = p046e5.C6530c.c(p046e5.F.a(U4.b.class, W8.J.class)).b(p046e5.r.i(p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class))).f(com.google.firebase.FirebaseCommonKtxRegistrar.c.f43920a).d();
        p247y7.AbstractC7350t.e(c6530cD3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        p046e5.C6530c c6530cD4 = p046e5.C6530c.c(p046e5.F.a(U4.d.class, W8.J.class)).b(p046e5.r.i(p046e5.F.a(U4.d.class, java.util.concurrent.Executor.class))).f(com.google.firebase.FirebaseCommonKtxRegistrar.d.f43921a).d();
        p247y7.AbstractC7350t.e(c6530cD4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return p097j7.AbstractC6879v.p(c6530cD, c6530cD2, c6530cD3, c6530cD4);
    }
}
