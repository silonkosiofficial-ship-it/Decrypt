package androidx.compose.foundation.text.modifiers;

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
@kotlin.Metadata(d1 = {"؈"}, d2 = {"؉", "؊", "؋", "،", "؍", "؎", "؏", "ؐ", "ؑ", "ؒ", "ؓ", "ؔ", "ؕ", "ؖ", "ؗ", "", "ؘ", "", "ؙ", "ؚ", "", "؛", "\u061c", "\u061d", "؞", "؟", "ؠ", "ء", "آ", "أ", "ؤ", "إ", "ئ", "ا", "ب", "ة", "ت", "ث", "ج", "", "ح", "خ", "د", "ذ", "ر", "ز", "س", "ش", "ص", "ض", "ط", "ظ", "ع", "غ", "ػ", "ؼ", "ؽ", "ؾ", "ؿ", "ـ", "ف", "ق", "ك", "ل", "م", "ن"}, k = 1, mv = {1, 8, 0})
public final class TextAnnotatedStringElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.C1332d f19525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.P f19526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.AbstractC1494h.b f19527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f19528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f19533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p237x7.l f19534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M.g f19535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p141o0.B0 f19536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p237x7.l f19537n;

    private TextAnnotatedStringElement(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6, p237x7.l lVar3) {
        this.f19525b = c1332d;
        this.f19526c = p6;
        this.f19527d = bVar;
        this.f19528e = lVar;
        this.f19529f = i6;
        this.f19530g = z6;
        this.f19531h = i10;
        this.f19532i = i11;
        this.f19533j = list;
        this.f19534k = lVar2;
        this.f19536m = b6;
        this.f19537n = lVar3;
    }

    public /* synthetic */ TextAnnotatedStringElement(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6, p237x7.l lVar3, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, bVar, lVar, i6, z6, i10, i11, list, lVar2, gVar, b6, lVar3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement)) {
            return false;
        }
        androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement textAnnotatedStringElement = (androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement) obj;
        return p247y7.AbstractC7350t.b(this.f19536m, textAnnotatedStringElement.f19536m) && p247y7.AbstractC7350t.b(this.f19525b, textAnnotatedStringElement.f19525b) && p247y7.AbstractC7350t.b(this.f19526c, textAnnotatedStringElement.f19526c) && p247y7.AbstractC7350t.b(this.f19533j, textAnnotatedStringElement.f19533j) && p247y7.AbstractC7350t.b(this.f19527d, textAnnotatedStringElement.f19527d) && this.f19528e == textAnnotatedStringElement.f19528e && this.f19537n == textAnnotatedStringElement.f19537n && X0.u.e(this.f19529f, textAnnotatedStringElement.f19529f) && this.f19530g == textAnnotatedStringElement.f19530g && this.f19531h == textAnnotatedStringElement.f19531h && this.f19532i == textAnnotatedStringElement.f19532i && this.f19534k == textAnnotatedStringElement.f19534k && p247y7.AbstractC7350t.b(this.f19535l, textAnnotatedStringElement.f19535l);
    }

    public int hashCode() {
        int iHashCode = ((((this.f19525b.hashCode() * 31) + this.f19526c.hashCode()) * 31) + this.f19527d.hashCode()) * 31;
        p237x7.l lVar = this.f19528e;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + X0.u.f(this.f19529f)) * 31) + p190t.h.a(this.f19530g)) * 31) + this.f19531h) * 31) + this.f19532i) * 31;
        java.util.List list = this.f19533j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        p237x7.l lVar2 = this.f19534k;
        int iHashCode4 = (((iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + 0) * 31;
        p141o0.B0 b6 = this.f19536m;
        int iHashCode5 = (iHashCode4 + (b6 != null ? b6.hashCode() : 0)) * 31;
        p237x7.l lVar3 = this.f19537n;
        return iHashCode5 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.text.modifiers.b g() {
        return new androidx.compose.foundation.text.modifiers.b(this.f19525b, this.f19526c, this.f19527d, this.f19528e, this.f19529f, this.f19530g, this.f19531h, this.f19532i, this.f19533j, this.f19534k, this.f19535l, this.f19536m, this.f19537n, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.text.modifiers.b bVar) {
        bVar.a2(bVar.n2(this.f19536m, this.f19526c), bVar.p2(this.f19525b), bVar.o2(this.f19526c, this.f19533j, this.f19532i, this.f19531h, this.f19530g, this.f19527d, this.f19529f), bVar.m2(this.f19528e, this.f19534k, this.f19535l, this.f19537n));
    }
}
