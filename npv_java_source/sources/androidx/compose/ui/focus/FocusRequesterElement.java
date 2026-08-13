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
@kotlin.Metadata(d1 = {"\u07bc"}, d2 = {"\u07bd", "\u07be", "\u07bf", "߀", "߁", "߂", "߃", "߄", "߅", "߆", "߇", "߈", "߉", "", "ߊ", "ߋ", "", "ߌ", "ߍ", "", "ߎ", "", "ߏ", "ߐ", "ߑ", "ߒ", "ߓ", "ߔ", "ߕ"}, k = 1, mv = {1, 8, 0})
final class FocusRequesterElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.ui.focus.n f19658b;

    public FocusRequesterElement(androidx.compose.ui.focus.n nVar) {
        this.f19658b = nVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.ui.focus.FocusRequesterElement) && p247y7.AbstractC7350t.b(this.f19658b, ((androidx.compose.ui.focus.FocusRequesterElement) obj).f19658b);
    }

    public int hashCode() {
        return this.f19658b.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.focus.q g() {
        return new androidx.compose.ui.focus.q(this.f19658b);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.focus.q qVar) {
        qVar.T1().e().A(qVar);
        qVar.U1(this.f19658b);
        qVar.T1().e().d(qVar);
    }

    public java.lang.String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f19658b + ')';
    }
}
