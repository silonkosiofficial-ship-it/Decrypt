package androidx.compose.ui.input.key;

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
@kotlin.Metadata(d1 = {"ࡔ"}, d2 = {"ࡕ", "ࡖ", "ࡗ", "ࡘ", "࡙", "", "࡚", "࡛", "\u085c", "\u085d", "࡞", "\u085f", "ࡠ", "ࡡ", "ࡢ", "ࡣ", "", "ࡤ", "ࡥ", "", "ࡦ", "ࡧ", "", "ࡨ", "ࡩ", "ࡪ", "\u086b", "\u086c", "\u086d", "\u086e", "\u086f", "\u0870", "\u0871"}, k = 1, mv = {1, 8, 0})
final class KeyInputElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f19787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f19788c;

    public KeyInputElement(p237x7.l lVar, p237x7.l lVar2) {
        this.f19787b = lVar;
        this.f19788c = lVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.input.key.KeyInputElement)) {
            return false;
        }
        androidx.compose.ui.input.key.KeyInputElement keyInputElement = (androidx.compose.ui.input.key.KeyInputElement) obj;
        return p247y7.AbstractC7350t.b(this.f19787b, keyInputElement.f19787b) && p247y7.AbstractC7350t.b(this.f19788c, keyInputElement.f19788c);
    }

    public int hashCode() {
        p237x7.l lVar = this.f19787b;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        p237x7.l lVar2 = this.f19788c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.input.key.b g() {
        return new androidx.compose.ui.input.key.b(this.f19787b, this.f19788c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.input.key.b bVar) {
        bVar.T1(this.f19787b);
        bVar.U1(this.f19788c);
    }

    public java.lang.String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f19787b + ", onPreKeyEvent=" + this.f19788c + ')';
    }
}
