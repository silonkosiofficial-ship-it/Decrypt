package androidx.compose.foundation.relocation;

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
@kotlin.Metadata(d1 = {"Ԥ"}, d2 = {"ԥ", "Ԧ", "ԧ", "Ԩ", "ԩ", "Ԫ", "ԫ", "Ԭ", "ԭ", "Ԯ", "ԯ", "\u0530", "Ա", "", "Բ", "", "Գ", "Դ", "", "Ե", "Զ", "Է", "Ը", "Թ"}, k = 1, mv = {1, 8, 0})
final class BringIntoViewRequesterElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E.b f19448b;

    public BringIntoViewRequesterElement(E.b bVar) {
        this.f19448b = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterElement) && p247y7.AbstractC7350t.b(this.f19448b, ((androidx.compose.foundation.relocation.BringIntoViewRequesterElement) obj).f19448b));
    }

    public int hashCode() {
        return this.f19448b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.relocation.e g() {
        return new androidx.compose.foundation.relocation.e(this.f19448b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.relocation.e eVar) {
        eVar.U1(this.f19448b);
    }
}
