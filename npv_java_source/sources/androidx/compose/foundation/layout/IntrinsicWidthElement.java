package androidx.compose.foundation.layout;

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
@kotlin.Metadata(d1 = {"\u0383"}, d2 = {"΄", "΅", "Ά", "·", "Έ", "", "Ή", "Ί", "\u038b", "Ό", "\u038d", "Ύ", "Ώ", "ΐ", "Α", "Β", "Γ", "Δ", "", "Ε", "Ζ", "Η", "", "Θ", "Ι", "Κ", "Λ", "Μ", "Ν", "Ξ", "Ο", "Π", "Ρ", "\u03a2", "Σ", "Τ", "Υ", "Φ"}, k = 1, mv = {1, 8, 0})
final class IntrinsicWidthElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.y f19189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f19191d;

    public IntrinsicWidthElement(A.y yVar, boolean z6, p237x7.l lVar) {
        this.f19189b = yVar;
        this.f19190c = z6;
        this.f19191d = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        androidx.compose.foundation.layout.IntrinsicWidthElement intrinsicWidthElement = obj instanceof androidx.compose.foundation.layout.IntrinsicWidthElement ? (androidx.compose.foundation.layout.IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.f19189b == intrinsicWidthElement.f19189b && this.f19190c == intrinsicWidthElement.f19190c;
    }

    public int hashCode() {
        return (this.f19189b.hashCode() * 31) + p190t.h.a(this.f19190c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.j g() {
        return new androidx.compose.foundation.layout.j(this.f19189b, this.f19190c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.j jVar) {
        jVar.W1(this.f19189b);
        jVar.V1(this.f19190c);
    }
}
