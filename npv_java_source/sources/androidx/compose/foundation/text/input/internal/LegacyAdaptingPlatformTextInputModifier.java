package androidx.compose.foundation.text.input.internal;

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
@kotlin.Metadata(d1 = {"֤"}, d2 = {"֥", "֦", "֧", "֨", "֩", "֪", "֫", "֬", "֭", "֮", "֯", "ְ", "ֱ", "ֲ", "ֳ", "ִ", "ֵ", "", "ֶ", "ַ", "", "ָ", "ֹ", "", "ֺ", "", "ֻ", "ּ", "ֽ", "־", "ֿ", "׀", "ׁ", "ׂ", "׃", "ׄ", "ׅ", "׆", "ׇ", "\u05c8", "\u05c9"}, k = 1, mv = {1, 8, 0})
final class LegacyAdaptingPlatformTextInputModifier extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K.q0 f19510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H.C1230w f19511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N.F f19512d;

    public LegacyAdaptingPlatformTextInputModifier(K.q0 q0Var, H.C1230w c1230w, N.F f6) {
        this.f19510b = q0Var;
        this.f19511c = c1230w;
        this.f19512d = f6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier) obj;
        return p247y7.AbstractC7350t.b(this.f19510b, legacyAdaptingPlatformTextInputModifier.f19510b) && p247y7.AbstractC7350t.b(this.f19511c, legacyAdaptingPlatformTextInputModifier.f19511c) && p247y7.AbstractC7350t.b(this.f19512d, legacyAdaptingPlatformTextInputModifier.f19512d);
    }

    public int hashCode() {
        return (((this.f19510b.hashCode() * 31) + this.f19511c.hashCode()) * 31) + this.f19512d.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public K.n0 g() {
        return new K.n0(this.f19510b, this.f19511c, this.f19512d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(K.n0 n0Var) {
        n0Var.V1(this.f19510b);
        n0Var.U1(this.f19511c);
        n0Var.W1(this.f19512d);
    }

    public java.lang.String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f19510b + ", legacyTextFieldState=" + this.f19511c + ", textFieldSelectionManager=" + this.f19512d + ')';
    }
}
