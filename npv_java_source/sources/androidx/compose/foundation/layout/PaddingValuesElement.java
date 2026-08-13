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
@kotlin.Metadata(d1 = {"М"}, d2 = {"Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "", "Э", "Ю", "", "Я", "", "а", "б", "в", "г", "д", "е", "ж", "з", "и", "й", "к"}, k = 1, mv = {1, 8, 0})
final class PaddingValuesElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.B f19203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f19204c;

    public PaddingValuesElement(A.B b6, p237x7.l lVar) {
        this.f19203b = b6;
        this.f19204c = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.compose.foundation.layout.PaddingValuesElement paddingValuesElement = obj instanceof androidx.compose.foundation.layout.PaddingValuesElement ? (androidx.compose.foundation.layout.PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f19203b, paddingValuesElement.f19203b);
    }

    public int hashCode() {
        return this.f19203b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.o g() {
        return new androidx.compose.foundation.layout.o(this.f19203b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.o oVar) {
        oVar.U1(this.f19203b);
    }
}
