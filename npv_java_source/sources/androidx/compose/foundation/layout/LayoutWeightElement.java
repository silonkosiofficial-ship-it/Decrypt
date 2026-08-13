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
@kotlin.Metadata(d1 = {"Χ"}, d2 = {"Ψ", "Ω", "Ϊ", "", "Ϋ", "", "ά", "έ", "ή", "ί", "ΰ", "α", "β", "γ", "δ", "", "ε", "ζ", "", "η", "θ", "ι", "κ", "λ", "μ", "ν", "ξ", "ο", "π", "ρ", "ς"}, k = 1, mv = {1, 8, 0})
public final class LayoutWeightElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19193c;

    public LayoutWeightElement(float f6, boolean z6) {
        this.f19192b = f6;
        this.f19193c = z6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        androidx.compose.foundation.layout.LayoutWeightElement layoutWeightElement = obj instanceof androidx.compose.foundation.layout.LayoutWeightElement ? (androidx.compose.foundation.layout.LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f19192b == layoutWeightElement.f19192b && this.f19193c == layoutWeightElement.f19193c;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f19192b) * 31) + p190t.h.a(this.f19193c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public A.z g() {
        return new A.z(this.f19192b, this.f19193c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(A.z zVar) {
        zVar.V1(this.f19192b);
        zVar.U1(this.f19193c);
    }
}
