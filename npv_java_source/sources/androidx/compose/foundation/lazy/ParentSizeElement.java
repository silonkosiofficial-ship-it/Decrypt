package androidx.compose.foundation.lazy;

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
@kotlin.Metadata(d1 = {"Ң"}, d2 = {"ң", "Ҥ", "ҥ", "", "Ҧ", "ҧ", "", "Ҩ", "ҩ", "", "Ҫ", "ҫ", "Ҭ", "ҭ", "Ү", "ү", "Ұ", "ұ", "Ҳ", "", "ҳ", "", "Ҵ", "ҵ", "Ҷ", "ҷ", "Ҹ", "ҹ", "Һ", "һ", "Ҽ", "ҽ", "Ҿ", "ҿ", "Ӏ", "Ӂ", "ӂ", "Ӄ", "ӄ", "Ӆ", "ӆ"}, k = 1, mv = {1, 8, 0})
final class ParentSizeElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.G1 f19343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.G1 f19344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f19345e;

    public ParentSizeElement(float f6, V.G1 g6, V.G1 g10, java.lang.String str) {
        this.f19342b = f6;
        this.f19343c = g6;
        this.f19344d = g10;
        this.f19345e = str;
    }

    public /* synthetic */ ParentSizeElement(float f6, V.G1 g6, V.G1 g10, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, (i6 & 2) != 0 ? null : g6, (i6 & 4) != 0 ? null : g10, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.lazy.ParentSizeElement)) {
            return false;
        }
        androidx.compose.foundation.lazy.ParentSizeElement parentSizeElement = (androidx.compose.foundation.lazy.ParentSizeElement) obj;
        return this.f19342b == parentSizeElement.f19342b && p247y7.AbstractC7350t.b(this.f19343c, parentSizeElement.f19343c) && p247y7.AbstractC7350t.b(this.f19344d, parentSizeElement.f19344d);
    }

    public int hashCode() {
        V.G1 g6 = this.f19343c;
        int iHashCode = (g6 != null ? g6.hashCode() : 0) * 31;
        V.G1 g10 = this.f19344d;
        return ((iHashCode + (g10 != null ? g10.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.f19342b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.b g() {
        return new androidx.compose.foundation.lazy.b(this.f19342b, this.f19343c, this.f19344d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.lazy.b bVar) {
        bVar.T1(this.f19342b);
        bVar.V1(this.f19343c);
        bVar.U1(this.f19344d);
    }
}
