package androidx.compose.foundation.lazy.layout;

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
@kotlin.Metadata(d1 = {"Ԍ"}, d2 = {"ԍ", "Ԏ", "ԏ", "Ԑ", "ԑ", "Ԓ", "ԓ", "Ԕ", "ԕ", "Ԗ", "ԗ", "Ԙ", "ԙ", "", "Ԛ", "ԛ", "", "Ԝ", "ԝ", "", "Ԟ", "", "ԟ", "Ԡ", "ԡ", "Ԣ", "ԣ"}, k = 1, mv = {1, 8, 0})
final class TraversablePrefetchStateModifierElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f19382b;

    public TraversablePrefetchStateModifierElement(androidx.compose.foundation.lazy.layout.d dVar) {
        this.f19382b = dVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement) && p247y7.AbstractC7350t.b(this.f19382b, ((androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement) obj).f19382b);
    }

    public int hashCode() {
        return this.f19382b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.i g() {
        return new androidx.compose.foundation.lazy.layout.i(this.f19382b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.lazy.layout.i iVar) {
        iVar.V1(this.f19382b);
    }

    public java.lang.String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f19382b + ')';
    }
}
