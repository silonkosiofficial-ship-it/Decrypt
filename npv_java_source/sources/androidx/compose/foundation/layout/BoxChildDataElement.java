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
@kotlin.Metadata(d1 = {"̩"}, d2 = {"̪", "̫", "̬", "̭", "̮", "", "̯", "̰", "̱", "̲", "̳", "̴", "̵", "̶", "̷", "̸", "̹", "̺", "", "̻", "̼", "", "̽", "̾", "̿", "̀", "́", "͂", "̓", "̈́", "ͅ", "͆", "͇", "͈", "͉", "͊", "͋", "͌"}, k = 1, mv = {1, 8, 0})
final class BoxChildDataElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p071h0.c f19181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f19183d;

    public BoxChildDataElement(p071h0.c cVar, boolean z6, p237x7.l lVar) {
        this.f19181b = cVar;
        this.f19182c = z6;
        this.f19183d = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        androidx.compose.foundation.layout.BoxChildDataElement boxChildDataElement = obj instanceof androidx.compose.foundation.layout.BoxChildDataElement ? (androidx.compose.foundation.layout.BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f19181b, boxChildDataElement.f19181b) && this.f19182c == boxChildDataElement.f19182c;
    }

    public int hashCode() {
        return (this.f19181b.hashCode() * 31) + p190t.h.a(this.f19182c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.c g() {
        return new androidx.compose.foundation.layout.c(this.f19181b, this.f19182c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.c cVar) {
        cVar.W1(this.f19181b);
        cVar.X1(this.f19182c);
    }
}
