package androidx.compose.ui;

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
@kotlin.Metadata(d1 = {"ڤ"}, d2 = {"ڥ", "ڦ", "ڧ", "", "ڨ", "ک", "ڪ", "ګ", "ڬ", "ڭ", "ڮ", "گ", "ڰ", "", "ڱ", "ڲ", "", "ڳ", "ڴ", "", "ڵ", "", "ڶ", "ڷ", "ڸ", "ڹ", "ں", "ڻ", "ڼ"}, k = 1, mv = {1, 8, 0})
public final class ZIndexElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19579b;

    public ZIndexElement(float f6) {
        this.f19579b = f6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.ZIndexElement) && java.lang.Float.compare(this.f19579b, ((androidx.compose.ui.ZIndexElement) obj).f19579b) == 0;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.f19579b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.e g() {
        return new androidx.compose.ui.e(this.f19579b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.e eVar) {
        eVar.U1(this.f19579b);
    }

    public java.lang.String toString() {
        return "ZIndexElement(zIndex=" + this.f19579b + ')';
    }
}
