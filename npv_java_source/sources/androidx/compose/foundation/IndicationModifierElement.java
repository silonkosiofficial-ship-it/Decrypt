package androidx.compose.foundation;

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
@kotlin.Metadata(d1 = {"Ȃ"}, d2 = {"ȃ", "Ȅ", "ȅ", "Ȇ", "ȇ", "Ȉ", "ȉ", "Ȋ", "ȋ", "Ȍ", "ȍ", "Ȏ", "ȏ", "Ȑ", "ȑ", "", "Ȓ", "", "ȓ", "Ȕ", "", "ȕ", "Ȗ", "ȗ", "Ș", "ș", "Ț", "ț"}, k = 1, mv = {1, 8, 0})
final class IndicationModifierElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p250z.j f18839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.I f18840c;

    public IndicationModifierElement(p250z.j jVar, p210v.I i6) {
        this.f18839b = jVar;
        this.f18840c = i6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.IndicationModifierElement)) {
            return false;
        }
        androidx.compose.foundation.IndicationModifierElement indicationModifierElement = (androidx.compose.foundation.IndicationModifierElement) obj;
        return p247y7.AbstractC7350t.b(this.f18839b, indicationModifierElement.f18839b) && p247y7.AbstractC7350t.b(this.f18840c, indicationModifierElement.f18840c);
    }

    public int hashCode() {
        return (this.f18839b.hashCode() * 31) + this.f18840c.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.j g() {
        return new androidx.compose.foundation.j(this.f18840c.a(this.f18839b));
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.j jVar) {
        jVar.Z1(this.f18840c.a(this.f18839b));
    }
}
