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
@kotlin.Metadata(d1 = {"ɶ"}, d2 = {"ɷ", "ɸ", "ɹ", "ɺ", "ɻ", "", "ɼ", "ɽ", "ɾ", "ɿ", "ʀ", "ʁ", "ʂ", "ʃ", "ʄ", "ʅ", "", "ʆ", "ʇ", "", "ʈ", "ʉ", "ʊ", "ʋ", "ʌ", "ʍ", "ʎ", "ʏ", "ʐ", "ʑ", "ʒ", "ʓ"}, k = 1, mv = {1, 8, 0})
public final class ScrollingLayoutElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.foundation.m f18856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18858d;

    public ScrollingLayoutElement(androidx.compose.foundation.m mVar, boolean z6, boolean z10) {
        this.f18856b = mVar;
        this.f18857c = z6;
        this.f18858d = z10;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.compose.foundation.ScrollingLayoutElement)) {
            return false;
        }
        androidx.compose.foundation.ScrollingLayoutElement scrollingLayoutElement = (androidx.compose.foundation.ScrollingLayoutElement) obj;
        return p247y7.AbstractC7350t.b(this.f18856b, scrollingLayoutElement.f18856b) && this.f18857c == scrollingLayoutElement.f18857c && this.f18858d == scrollingLayoutElement.f18858d;
    }

    public int hashCode() {
        return (((this.f18856b.hashCode() * 31) + p190t.h.a(this.f18857c)) * 31) + p190t.h.a(this.f18858d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p210v.b0 g() {
        return new p210v.b0(this.f18856b, this.f18857c, this.f18858d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p210v.b0 b0Var) {
        b0Var.X1(this.f18856b);
        b0Var.W1(this.f18857c);
        b0Var.Y1(this.f18858d);
    }
}
