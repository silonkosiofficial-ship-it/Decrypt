package androidx.compose.ui.input.pointer;

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
@kotlin.Metadata(d1 = {"\u0890"}, d2 = {"\u0891", "\u0892", "\u0893", "\u0894", "\u0895", "", "\u0896", "\u0897", "\u0898", "\u0899", "\u089a", "\u089b", "\u089c", "\u089d", "\u089e", "", "\u089f", "ࢠ", "", "ࢡ", "ࢢ", "", "ࢣ", "ࢤ", "ࢥ", "ࢦ", "ࢧ", "ࢨ", "ࢩ", "ࢪ", "ࢫ", "ࢬ", "ࢭ", "ࢮ"}, k = 1, mv = {1, 8, 0})
public final class PointerHoverIconModifierElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p251z0.InterfaceC7386w f19793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19794c;

    public PointerHoverIconModifierElement(p251z0.InterfaceC7386w interfaceC7386w, boolean z6) {
        this.f19793b = interfaceC7386w;
        this.f19794c = z6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.input.pointer.PointerHoverIconModifierElement)) {
            return false;
        }
        androidx.compose.ui.input.pointer.PointerHoverIconModifierElement pointerHoverIconModifierElement = (androidx.compose.ui.input.pointer.PointerHoverIconModifierElement) obj;
        return p247y7.AbstractC7350t.b(this.f19793b, pointerHoverIconModifierElement.f19793b) && this.f19794c == pointerHoverIconModifierElement.f19794c;
    }

    public int hashCode() {
        return (this.f19793b.hashCode() * 31) + p190t.h.a(this.f19794c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p251z0.C7385v g() {
        return new p251z0.C7385v(this.f19793b, this.f19794c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p251z0.C7385v c7385v) {
        c7385v.g2(this.f19793b);
        c7385v.h2(this.f19794c);
    }

    public java.lang.String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f19793b + ", overrideDescendants=" + this.f19794c + ')';
    }
}
