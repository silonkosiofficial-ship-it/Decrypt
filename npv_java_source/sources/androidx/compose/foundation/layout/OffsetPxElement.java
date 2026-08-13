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
@kotlin.Metadata(d1 = {"σ"}, d2 = {"τ", "υ", "φ", "χ", "ψ", "ω", "ϊ", "", "ϋ", "ό", "ύ", "ώ", "Ϗ", "ϐ", "ϑ", "ϒ", "ϓ", "ϔ", "ϕ", "", "ϖ", "ϗ", "Ϙ", "", "ϙ", "Ϛ", "", "ϛ", "Ϝ", "ϝ", "Ϟ", "ϟ", "Ϡ", "ϡ", "Ϣ", "ϣ", "Ϥ", "ϥ", "Ϧ", "ϧ"}, k = 1, mv = {1, 8, 0})
final class OffsetPxElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f19194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f19196d;

    public OffsetPxElement(p237x7.l lVar, boolean z6, p237x7.l lVar2) {
        this.f19194b = lVar;
        this.f19195c = z6;
        this.f19196d = lVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        androidx.compose.foundation.layout.OffsetPxElement offsetPxElement = obj instanceof androidx.compose.foundation.layout.OffsetPxElement ? (androidx.compose.foundation.layout.OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f19194b == offsetPxElement.f19194b && this.f19195c == offsetPxElement.f19195c;
    }

    public int hashCode() {
        return (this.f19194b.hashCode() * 31) + p190t.h.a(this.f19195c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.l g() {
        return new androidx.compose.foundation.layout.l(this.f19194b, this.f19195c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.l lVar) {
        lVar.V1(this.f19194b);
        lVar.W1(this.f19195c);
    }

    public java.lang.String toString() {
        return "OffsetPxModifier(offset=" + this.f19194b + ", rtlAware=" + this.f19195c + ')';
    }
}
