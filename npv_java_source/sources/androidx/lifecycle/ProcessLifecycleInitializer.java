package androidx.lifecycle;

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
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"Þ"}, d2 = {"ß", "à", "á", "â", "ã", "ä", "å", "æ", "ç", "", "è", "é", "ê", "ë"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements D2.a {
    @Override // D2.a
    public java.util.List a() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // D2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public androidx.lifecycle.r b(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        p247y7.AbstractC7350t.e(aVarE, "getInstance(context)");
        if (!aVarE.g(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            throw new java.lang.IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        androidx.lifecycle.C2082n.a(context);
        androidx.lifecycle.D.b bVar = androidx.lifecycle.D.f22738K;
        bVar.b(context);
        return bVar.a();
    }
}
