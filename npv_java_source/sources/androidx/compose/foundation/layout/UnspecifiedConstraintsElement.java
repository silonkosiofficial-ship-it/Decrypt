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
@kotlin.Metadata(d1 = {"џ"}, d2 = {"Ѡ", "ѡ", "Ѣ", "ѣ", "Ѥ", "ѥ", "Ѧ", "ѧ", "Ѩ", "ѩ", "Ѫ", "ѫ", "Ѭ", "ѭ", "", "Ѯ", "", "ѯ", "Ѱ", "", "ѱ", "Ѳ", "ѳ", "Ѵ", "ѵ", "Ѷ", "ѷ", "Ѹ", "ѹ"}, k = 1, mv = {1, 8, 0})
final class UnspecifiedConstraintsElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19212c;

    private UnspecifiedConstraintsElement(float f6, float f10) {
        this.f19211b = f6;
        this.f19212c = f10;
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f6, float f10, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.compose.foundation.layout.UnspecifiedConstraintsElement)) {
            return false;
        }
        androidx.compose.foundation.layout.UnspecifiedConstraintsElement unspecifiedConstraintsElement = (androidx.compose.foundation.layout.UnspecifiedConstraintsElement) obj;
        return Y0.i.s(this.f19211b, unspecifiedConstraintsElement.f19211b) && Y0.i.s(this.f19212c, unspecifiedConstraintsElement.f19212c);
    }

    public int hashCode() {
        return (Y0.i.t(this.f19211b) * 31) + Y0.i.t(this.f19212c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.r g() {
        return new androidx.compose.foundation.layout.r(this.f19211b, this.f19212c, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.r rVar) {
        rVar.U1(this.f19211b);
        rVar.T1(this.f19212c);
    }
}
