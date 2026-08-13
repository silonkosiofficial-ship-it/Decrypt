package androidx.compose.foundation.text.handwriting;

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
@kotlin.Metadata(d1 = {"֊"}, d2 = {"\u058b", "\u058c", "֍", "֎", "", "֏", "\u0590", "֑", "֒", "֓", "֔", "֕", "֖", "֗", "", "֘", "֙", "", "֚", "֛", "", "֜", "֝", "֞", "֟", "֠", "֡", "֢", "֣"}, k = 1, mv = {1, 8, 0})
final class StylusHandwritingElementWithNegativePadding extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f19507b;

    public StylusHandwritingElementWithNegativePadding(p237x7.a aVar) {
        this.f19507b = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding) && p247y7.AbstractC7350t.b(this.f19507b, ((androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding) obj).f19507b);
    }

    public int hashCode() {
        return this.f19507b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public I.b g() {
        return new I.b(this.f19507b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(I.b bVar) {
        bVar.b2(this.f19507b);
    }

    public java.lang.String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f19507b + ')';
    }
}
