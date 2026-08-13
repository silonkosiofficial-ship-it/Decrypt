package androidx.sqlite.driver.bundled;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"¨"}, d2 = {"", "©", "", "ª", "«", "¬", "\u00ad", "®", "", "¯", "°", "", "±", "²", "³", "´", "µ", "¶", "·", "¸", "¹", "º", "»", "¼", "½", "¾", "¿"}, k = 2, mv = {1, 8, 0})
public abstract class BundledSQLiteStatementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindLong(long j6, int i6, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindText(long j6, int i6, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeClose(long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetColumnCount(long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native java.lang.String nativeGetColumnName(long j6, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetColumnType(long j6, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeGetLong(long j6, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native java.lang.String nativeGetText(long j6, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeReset(long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeStep(long j6);
}
