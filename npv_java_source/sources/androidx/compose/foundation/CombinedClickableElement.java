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
@kotlin.Metadata(d1 = {"Ʈ"}, d2 = {"Ư", "ư", "Ʊ", "Ʋ", "Ƴ", "ƴ", "Ƶ", "", "ƶ", "", "Ʒ", "Ƹ", "ƹ", "ƺ", "ƻ", "Ƽ", "ƽ", "ƾ", "ƿ", "ǀ", "ǁ", "ǂ", "ǃ", "Ǆ", "ǅ", "ǆ", "", "Ǉ", "ǈ", "ǉ", "", "Ǌ", "ǋ", "ǌ", "Ǎ", "ǎ", "Ǐ", "ǐ", "Ǒ", "ǒ", "Ǔ", "ǔ", "Ǖ", "ǖ", "Ǘ", "ǘ", "Ǚ", "ǚ", "Ǜ"}, k = 1, mv = {1, 8, 0})
final class CombinedClickableElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p250z.l f18827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.I f18828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f18830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K0.h f18831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.a f18832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f18833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p237x7.a f18834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p237x7.a f18835j;

    private CombinedClickableElement(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, java.lang.String str2, p237x7.a aVar2, p237x7.a aVar3) {
        this.f18827b = lVar;
        this.f18828c = i6;
        this.f18829d = z6;
        this.f18830e = str;
        this.f18831f = hVar;
        this.f18832g = aVar;
        this.f18833h = str2;
        this.f18834i = aVar2;
        this.f18835j = aVar3;
    }

    public /* synthetic */ CombinedClickableElement(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, java.lang.String str2, p237x7.a aVar2, p237x7.a aVar3, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, i6, z6, str, hVar, aVar, str2, aVar2, aVar3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.CombinedClickableElement combinedClickableElement = (androidx.compose.foundation.CombinedClickableElement) obj;
        return p247y7.AbstractC7350t.b(this.f18827b, combinedClickableElement.f18827b) && p247y7.AbstractC7350t.b(this.f18828c, combinedClickableElement.f18828c) && this.f18829d == combinedClickableElement.f18829d && p247y7.AbstractC7350t.b(this.f18830e, combinedClickableElement.f18830e) && p247y7.AbstractC7350t.b(this.f18831f, combinedClickableElement.f18831f) && this.f18832g == combinedClickableElement.f18832g && p247y7.AbstractC7350t.b(this.f18833h, combinedClickableElement.f18833h) && this.f18834i == combinedClickableElement.f18834i && this.f18835j == combinedClickableElement.f18835j;
    }

    public int hashCode() {
        p250z.l lVar = this.f18827b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        p210v.I i6 = this.f18828c;
        int iHashCode2 = (((iHashCode + (i6 != null ? i6.hashCode() : 0)) * 31) + p190t.h.a(this.f18829d)) * 31;
        java.lang.String str = this.f18830e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        K0.h hVar = this.f18831f;
        int iL = (((iHashCode3 + (hVar != null ? K0.h.l(hVar.n()) : 0)) * 31) + this.f18832g.hashCode()) * 31;
        java.lang.String str2 = this.f18833h;
        int iHashCode4 = (iL + (str2 != null ? str2.hashCode() : 0)) * 31;
        p237x7.a aVar = this.f18834i;
        int iHashCode5 = (iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        p237x7.a aVar2 = this.f18835j;
        return iHashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.f g() {
        return new androidx.compose.foundation.f(this.f18832g, this.f18833h, this.f18834i, this.f18835j, this.f18827b, this.f18828c, this.f18829d, this.f18830e, this.f18831f, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.f fVar) {
        fVar.u2(this.f18832g, this.f18833h, this.f18834i, this.f18835j, this.f18827b, this.f18828c, this.f18829d, this.f18830e, this.f18831f);
    }
}
