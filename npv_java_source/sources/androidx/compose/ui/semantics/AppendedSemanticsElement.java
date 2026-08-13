package androidx.compose.ui.semantics;

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
@kotlin.Metadata(d1 = {"३"}, d2 = {"४", "५", "६", "७", "", "८", "९", "॰", "ॱ", "ॲ", "ॳ", "ॴ", "ॵ", "ॶ", "ॷ", "ॸ", "ॹ", "", "ॺ", "ॻ", "", "ॼ", "ॽ", "", "ॾ", "ॿ", "ঀ", "ঁ", "ং", "ঃ", "\u0984", "অ", "আ", "ই", "ঈ", "উ", "ঊ", "ঋ", "ঌ", "\u098d"}, k = 1, mv = {1, 8, 0})
public final class AppendedSemanticsElement extends F0.W implements K0.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f20459c;

    public AppendedSemanticsElement(boolean z6, p237x7.l lVar) {
        this.f20458b = z6;
        this.f20459c = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.semantics.AppendedSemanticsElement)) {
            return false;
        }
        androidx.compose.ui.semantics.AppendedSemanticsElement appendedSemanticsElement = (androidx.compose.ui.semantics.AppendedSemanticsElement) obj;
        return this.f20458b == appendedSemanticsElement.f20458b && p247y7.AbstractC7350t.b(this.f20459c, appendedSemanticsElement.f20459c);
    }

    public int hashCode() {
        return (p190t.h.a(this.f20458b) * 31) + this.f20459c.hashCode();
    }

    @Override // K0.m
    public K0.k i() {
        K0.k kVar = new K0.k();
        kVar.P(this.f20458b);
        this.f20459c.l(kVar);
        return kVar;
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public K0.c g() {
        return new K0.c(this.f20458b, false, this.f20459c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(K0.c cVar) {
        cVar.T1(this.f20458b);
        cVar.U1(this.f20459c);
    }

    public java.lang.String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f20458b + ", properties=" + this.f20459c + ')';
    }
}
