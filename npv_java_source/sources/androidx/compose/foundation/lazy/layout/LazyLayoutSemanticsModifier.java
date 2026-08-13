package androidx.compose.foundation.lazy.layout;

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
@kotlin.Metadata(d1 = {"ӟ"}, d2 = {"Ӡ", "ӡ", "Ӣ", "ӣ", "Ӥ", "ӥ", "Ӧ", "ӧ", "Ө", "ө", "", "Ӫ", "ӫ", "Ӭ", "ӭ", "Ӯ", "ӯ", "Ӱ", "ӱ", "Ӳ", "ӳ", "", "Ӵ", "ӵ", "Ӷ", "", "ӷ", "Ӹ", "ӹ", "Ӻ", "ӻ", "Ӽ", "ӽ", "Ӿ", "ӿ", "Ԁ", "ԁ", "Ԃ", "ԃ", "Ԅ", "ԅ", "Ԇ", "ԇ", "Ԉ", "ԉ", "Ԋ", "ԋ"}, k = 1, mv = {1, 8, 0})
final class LazyLayoutSemanticsModifier extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f19377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D.E f19378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p230x.s f19379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19381f;

    public LazyLayoutSemanticsModifier(p237x7.a aVar, D.E e6, p230x.s sVar, boolean z6, boolean z10) {
        this.f19377b = aVar;
        this.f19378c = e6;
        this.f19379d = sVar;
        this.f19380e = z6;
        this.f19381f = z10;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier)) {
            return false;
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier) obj;
        return this.f19377b == lazyLayoutSemanticsModifier.f19377b && p247y7.AbstractC7350t.b(this.f19378c, lazyLayoutSemanticsModifier.f19378c) && this.f19379d == lazyLayoutSemanticsModifier.f19379d && this.f19380e == lazyLayoutSemanticsModifier.f19380e && this.f19381f == lazyLayoutSemanticsModifier.f19381f;
    }

    public int hashCode() {
        return (((((((this.f19377b.hashCode() * 31) + this.f19378c.hashCode()) * 31) + this.f19379d.hashCode()) * 31) + p190t.h.a(this.f19380e)) * 31) + p190t.h.a(this.f19381f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.g g() {
        return new androidx.compose.foundation.lazy.layout.g(this.f19377b, this.f19378c, this.f19379d, this.f19380e, this.f19381f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.lazy.layout.g gVar) {
        gVar.X1(this.f19377b, this.f19378c, this.f19379d, this.f19380e, this.f19381f);
    }
}
