package androidx.compose.ui.focus;

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
@kotlin.Metadata(d1 = {"ݷ"}, d2 = {"ݸ", "ݹ", "ݺ", "ݻ", "ݼ", "ݽ", "ݾ", "ݿ", "ހ", "ށ", "ނ", "ރ", "ބ", "ޅ", "", "ކ", "އ", "", "ވ", "މ", "", "ފ", "", "ދ", "ތ", "ލ", "ގ", "ޏ", "ސ", "ޑ"}, k = 1, mv = {1, 8, 0})
final class FocusChangedElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f19636b;

    public FocusChangedElement(p237x7.l lVar) {
        this.f19636b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.focus.FocusChangedElement) && p247y7.AbstractC7350t.b(this.f19636b, ((androidx.compose.ui.focus.FocusChangedElement) obj).f19636b);
    }

    public int hashCode() {
        return this.f19636b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.focus.c g() {
        return new androidx.compose.ui.focus.c(this.f19636b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.focus.c cVar) {
        cVar.T1(this.f19636b);
    }

    public java.lang.String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f19636b + ')';
    }
}
