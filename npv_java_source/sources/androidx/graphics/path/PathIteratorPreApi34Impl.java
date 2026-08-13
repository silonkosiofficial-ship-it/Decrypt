package androidx.graphics.path;

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
@kotlin.Metadata(d1 = {"Â"}, d2 = {"Ã", "Ä", "Å", "Æ", "", "Ç", "", "È", "", "É", "Ê", "Ë", "Ì", "Í", "Î", "", "Ï", "Ð", "", "Ñ", "Ò", "Ó", "Ô", "Õ", "Ö", "×", "Ø", "Ù", "Ú", "Û", "Ü", "Ý"}, k = 1, mv = {1, 8, 0})
public final class PathIteratorPreApi34Impl extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22736b;

    private final native long createInternalPathIterator(android.graphics.Path path, int i6, float f6);

    private final native void destroyInternalPathIterator(long j6);

    @dalvik.annotation.optimization.FastNative
    private final native boolean internalPathIteratorHasNext(long j6);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorNext(long j6, float[] fArr, int i6);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorPeek(long j6);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorRawSize(long j6);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorSize(long j6);

    protected final void finalize() {
        destroyInternalPathIterator(this.f22736b);
    }
}
