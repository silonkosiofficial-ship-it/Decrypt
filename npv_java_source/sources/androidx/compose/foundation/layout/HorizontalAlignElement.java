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
@kotlin.Metadata(d1 = {"ͫ"}, d2 = {"ͬ", "ͭ", "ͮ", "ͯ", "Ͱ", "ͱ", "Ͳ", "ͳ", "ʹ", "͵", "Ͷ", "ͷ", "\u0378", "", "\u0379", "ͺ", "", "ͻ", "", "ͼ", "ͽ", ";", "Ϳ", "\u0380", "\u0381", "\u0382"}, k = 1, mv = {1, 8, 0})
public final class HorizontalAlignElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.c.b f19188b;

    public HorizontalAlignElement(h0.c.b bVar) {
        this.f19188b = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        androidx.compose.foundation.layout.HorizontalAlignElement horizontalAlignElement = obj instanceof androidx.compose.foundation.layout.HorizontalAlignElement ? (androidx.compose.foundation.layout.HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f19188b, horizontalAlignElement.f19188b);
    }

    public int hashCode() {
        return this.f19188b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public A.C0784s g() {
        return new A.C0784s(this.f19188b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(A.C0784s c0784s) {
        c0784s.U1(this.f19188b);
    }
}
