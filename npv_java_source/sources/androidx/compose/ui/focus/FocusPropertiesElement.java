package androidx.compose.ui.focus;

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
@kotlin.Metadata(d1 = {"ޢ"}, d2 = {"ޣ", "ޤ", "ޥ", "ަ", "ާ", "ި", "ީ", "ު", "ޫ", "ެ", "ޭ", "ޮ", "ޯ", "", "ް", "ޱ", "", "\u07b2", "\u07b3", "", "\u07b4", "", "\u07b5", "\u07b6", "\u07b7", "\u07b8", "\u07b9", "\u07ba", "\u07bb"}, k = 1, mv = {1, 8, 0})
final class FocusPropertiesElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p121m0.l f19657b;

    public FocusPropertiesElement(p121m0.l lVar) {
        this.f19657b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.focus.FocusPropertiesElement) && p247y7.AbstractC7350t.b(this.f19657b, ((androidx.compose.ui.focus.FocusPropertiesElement) obj).f19657b);
    }

    public int hashCode() {
        return this.f19657b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.focus.m g() {
        return new androidx.compose.ui.focus.m(this.f19657b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.focus.m mVar) {
        mVar.T1(this.f19657b);
    }

    public java.lang.String toString() {
        return "FocusPropertiesElement(scope=" + this.f19657b + ')';
    }
}
