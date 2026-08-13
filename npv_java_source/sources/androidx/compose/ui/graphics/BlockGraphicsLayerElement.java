package androidx.compose.ui.graphics;

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
@kotlin.Metadata(d1 = {"ߨ"}, d2 = {"ߩ", "ߪ", "߫", "߬", "߭", "߮", "߯", "߰", "߱", "߲", "߳", "ߴ", "ߵ", "߶", "", "߷", "߸", "", "߹", "ߺ", "", "\u07fb", "", "\u07fc", "߽", "߾", "߿", "ࠀ", "ࠁ", "ࠂ"}, k = 1, mv = {1, 8, 0})
final class BlockGraphicsLayerElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f19722b;

    public BlockGraphicsLayerElement(p237x7.l lVar) {
        this.f19722b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.graphics.BlockGraphicsLayerElement) && p247y7.AbstractC7350t.b(this.f19722b, ((androidx.compose.ui.graphics.BlockGraphicsLayerElement) obj).f19722b);
    }

    public int hashCode() {
        return this.f19722b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p141o0.C6981m0 g() {
        return new p141o0.C6981m0(this.f19722b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p141o0.C6981m0 c6981m0) {
        c6981m0.V1(this.f19722b);
        c6981m0.U1();
    }

    public java.lang.String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f19722b + ')';
    }
}
