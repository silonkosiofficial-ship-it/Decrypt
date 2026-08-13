package androidx.compose.ui.layout;

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
@kotlin.Metadata(d1 = {"ࣴ"}, d2 = {"ࣵ", "ࣶ", "ࣷ", "ࣸ", "ࣹ", "ࣺ", "ࣻ", "ࣼ", "ࣽ", "ࣾ", "ࣿ", "ऀ", "ँ", "ं", "ः", "ऄ", "अ", "", "आ", "इ", "", "ई", "उ", "", "ऊ", "", "ऋ", "ऌ", "ऍ", "ऎ", "ए", "ऐ", "ऑ"}, k = 1, mv = {1, 8, 0})
final class LayoutElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.q f19803b;

    public LayoutElement(p237x7.q qVar) {
        this.f19803b = qVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.layout.LayoutElement) && p247y7.AbstractC7350t.b(this.f19803b, ((androidx.compose.ui.layout.LayoutElement) obj).f19803b);
    }

    public int hashCode() {
        return this.f19803b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public D0.B g() {
        return new D0.B(this.f19803b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(D0.B b6) {
        b6.T1(this.f19803b);
    }

    public java.lang.String toString() {
        return "LayoutElement(measure=" + this.f19803b + ')';
    }
}
