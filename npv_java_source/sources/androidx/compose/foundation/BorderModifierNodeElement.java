package androidx.compose.foundation;

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
@kotlin.Metadata(d1 = {"Š"}, d2 = {"š", "Ţ", "ţ", "Ť", "ť", "Ŧ", "ŧ", "Ũ", "ũ", "Ū", "ū", "Ŭ", "ŭ", "Ů", "ů", "Ű", "ű", "", "Ų", "ų", "", "Ŵ", "ŵ", "", "Ŷ", "", "ŷ", "Ÿ", "Ź", "ź", "Ż", "ż", "Ž", "ž", "ſ", "ƀ", "Ɓ", "Ƃ", "ƃ", "Ƅ", "ƅ"}, k = 1, mv = {1, 8, 0})
public final class BorderModifierNodeElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.AbstractC6984n0 f18819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p141o0.e2 f18820d;

    private BorderModifierNodeElement(float f6, p141o0.AbstractC6984n0 abstractC6984n0, p141o0.e2 e2Var) {
        this.f18818b = f6;
        this.f18819c = abstractC6984n0;
        this.f18820d = e2Var;
    }

    public /* synthetic */ BorderModifierNodeElement(float f6, p141o0.AbstractC6984n0 abstractC6984n0, p141o0.e2 e2Var, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, abstractC6984n0, e2Var);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.BorderModifierNodeElement)) {
            return false;
        }
        androidx.compose.foundation.BorderModifierNodeElement borderModifierNodeElement = (androidx.compose.foundation.BorderModifierNodeElement) obj;
        return Y0.i.s(this.f18818b, borderModifierNodeElement.f18818b) && p247y7.AbstractC7350t.b(this.f18819c, borderModifierNodeElement.f18819c) && p247y7.AbstractC7350t.b(this.f18820d, borderModifierNodeElement.f18820d);
    }

    public int hashCode() {
        return (((Y0.i.t(this.f18818b) * 31) + this.f18819c.hashCode()) * 31) + this.f18820d.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p210v.C7212f g() {
        return new p210v.C7212f(this.f18818b, this.f18819c, this.f18820d, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p210v.C7212f c7212f) {
        c7212f.h2(this.f18818b);
        c7212f.g2(this.f18819c);
        c7212f.l0(this.f18820d);
    }

    public java.lang.String toString() {
        return "BorderModifierNodeElement(width=" + ((java.lang.Object) Y0.i.u(this.f18818b)) + ", brush=" + this.f18819c + ", shape=" + this.f18820d + ')';
    }
}
