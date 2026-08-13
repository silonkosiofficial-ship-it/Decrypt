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
@kotlin.Metadata(d1 = {"Ɔ"}, d2 = {"Ƈ", "ƈ", "Ɖ", "Ɗ", "Ƌ", "ƌ", "ƍ", "", "Ǝ", "", "Ə", "Ɛ", "Ƒ", "ƒ", "Ɠ", "Ɣ", "ƕ", "Ɩ", "Ɨ", "Ƙ", "ƙ", "ƚ", "ƛ", "", "Ɯ", "Ɲ", "ƞ", "", "Ɵ", "Ơ", "ơ", "Ƣ", "ƣ", "Ƥ", "ƥ", "Ʀ", "Ƨ", "ƨ", "Ʃ", "ƪ", "ƫ", "Ƭ", "ƭ"}, k = 1, mv = {1, 8, 0})
final class ClickableElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p250z.l f18821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.I f18822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f18824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K0.h f18825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.a f18826g;

    private ClickableElement(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        this.f18821b = lVar;
        this.f18822c = i6;
        this.f18823d = z6;
        this.f18824e = str;
        this.f18825f = hVar;
        this.f18826g = aVar;
    }

    public /* synthetic */ ClickableElement(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, i6, z6, str, hVar, aVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.ClickableElement.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.ClickableElement clickableElement = (androidx.compose.foundation.ClickableElement) obj;
        return p247y7.AbstractC7350t.b(this.f18821b, clickableElement.f18821b) && p247y7.AbstractC7350t.b(this.f18822c, clickableElement.f18822c) && this.f18823d == clickableElement.f18823d && p247y7.AbstractC7350t.b(this.f18824e, clickableElement.f18824e) && p247y7.AbstractC7350t.b(this.f18825f, clickableElement.f18825f) && this.f18826g == clickableElement.f18826g;
    }

    public int hashCode() {
        p250z.l lVar = this.f18821b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        p210v.I i6 = this.f18822c;
        int iHashCode2 = (((iHashCode + (i6 != null ? i6.hashCode() : 0)) * 31) + p190t.h.a(this.f18823d)) * 31;
        java.lang.String str = this.f18824e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        K0.h hVar = this.f18825f;
        return ((iHashCode3 + (hVar != null ? K0.h.l(hVar.n()) : 0)) * 31) + this.f18826g.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.e g() {
        return new androidx.compose.foundation.e(this.f18821b, this.f18822c, this.f18823d, this.f18824e, this.f18825f, this.f18826g, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.e eVar) {
        eVar.t2(this.f18821b, this.f18822c, this.f18823d, this.f18824e, this.f18825f, this.f18826g);
    }
}
