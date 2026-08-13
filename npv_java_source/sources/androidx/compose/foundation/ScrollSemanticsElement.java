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
@kotlin.Metadata(d1 = {"ɍ"}, d2 = {"Ɏ", "ɏ", "ɐ", "ɑ", "ɒ", "", "ɓ", "ɔ", "ɕ", "ɖ", "ɗ", "ɘ", "ə", "ɚ", "ɛ", "ɜ", "ɝ", "ɞ", "ɟ", "", "ɠ", "ɡ", "", "ɢ", "ɣ", "", "ɤ", "ɥ", "ɦ", "ɧ", "ɨ", "ɩ", "ɪ", "ɫ", "ɬ", "ɭ", "ɮ", "ɯ", "ɰ", "ɱ", "ɲ", "ɳ", "ɴ", "ɵ"}, k = 1, mv = {1, 8, 0})
final class ScrollSemanticsElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.foundation.m f18851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p230x.p f18853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18855f;

    public ScrollSemanticsElement(androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10, boolean z11) {
        this.f18851b = mVar;
        this.f18852c = z6;
        this.f18853d = pVar;
        this.f18854e = z10;
        this.f18855f = z11;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.ScrollSemanticsElement)) {
            return false;
        }
        androidx.compose.foundation.ScrollSemanticsElement scrollSemanticsElement = (androidx.compose.foundation.ScrollSemanticsElement) obj;
        return p247y7.AbstractC7350t.b(this.f18851b, scrollSemanticsElement.f18851b) && this.f18852c == scrollSemanticsElement.f18852c && p247y7.AbstractC7350t.b(this.f18853d, scrollSemanticsElement.f18853d) && this.f18854e == scrollSemanticsElement.f18854e && this.f18855f == scrollSemanticsElement.f18855f;
    }

    public int hashCode() {
        int iHashCode = ((this.f18851b.hashCode() * 31) + p190t.h.a(this.f18852c)) * 31;
        p230x.p pVar = this.f18853d;
        return ((((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + p190t.h.a(this.f18854e)) * 31) + p190t.h.a(this.f18855f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.l g() {
        return new androidx.compose.foundation.l(this.f18851b, this.f18852c, this.f18853d, this.f18854e, this.f18855f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.l lVar) {
        lVar.X1(this.f18851b);
        lVar.V1(this.f18852c);
        lVar.U1(this.f18853d);
        lVar.W1(this.f18854e);
        lVar.Y1(this.f18855f);
    }

    public java.lang.String toString() {
        return "ScrollSemanticsElement(state=" + this.f18851b + ", reverseScrolling=" + this.f18852c + ", flingBehavior=" + this.f18853d + ", isScrollable=" + this.f18854e + ", isVertical=" + this.f18855f + ')';
    }
}
