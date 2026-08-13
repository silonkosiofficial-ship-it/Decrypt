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
@kotlin.Metadata(d1 = {"Ȝ"}, d2 = {"ȝ", "Ȟ", "ȟ", "Ƞ", "ȡ", "Ȣ", "ȣ", "Ȥ", "ȥ", "Ȧ", "ȧ", "", "Ȩ", "", "ȩ", "Ȫ", "ȫ", "Ȭ", "ȭ", "Ȯ", "ȯ", "Ȱ", "ȱ", "Ȳ", "ȳ", "ȴ", "ȵ", "ȶ", "ȷ", "", "ȸ", "ȹ", "Ⱥ", "", "Ȼ", "ȼ", "Ƚ", "Ⱦ", "ȿ", "ɀ", "Ɂ", "ɂ", "Ƀ", "Ʉ", "Ʌ", "Ɇ", "ɇ", "Ɉ", "ɉ", "Ɋ", "ɋ", "Ɍ"}, k = 1, mv = {1, 8, 0})
public final class MagnifierElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f18841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f18842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f18843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f18844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f18846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f18847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f18848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f18849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p210v.W f18850k;

    private MagnifierElement(p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, float f6, boolean z6, long j6, float f10, float f11, boolean z10, p210v.W w6) {
        this.f18841b = lVar;
        this.f18842c = lVar2;
        this.f18843d = lVar3;
        this.f18844e = f6;
        this.f18845f = z6;
        this.f18846g = j6;
        this.f18847h = f10;
        this.f18848i = f11;
        this.f18849j = z10;
        this.f18850k = w6;
    }

    public /* synthetic */ MagnifierElement(p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, float f6, boolean z6, long j6, float f10, float f11, boolean z10, p210v.W w6, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, lVar2, lVar3, f6, z6, j6, f10, f11, z10, w6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.MagnifierElement)) {
            return false;
        }
        androidx.compose.foundation.MagnifierElement magnifierElement = (androidx.compose.foundation.MagnifierElement) obj;
        return this.f18841b == magnifierElement.f18841b && this.f18842c == magnifierElement.f18842c && this.f18844e == magnifierElement.f18844e && this.f18845f == magnifierElement.f18845f && Y0.l.f(this.f18846g, magnifierElement.f18846g) && Y0.i.s(this.f18847h, magnifierElement.f18847h) && Y0.i.s(this.f18848i, magnifierElement.f18848i) && this.f18849j == magnifierElement.f18849j && this.f18843d == magnifierElement.f18843d && p247y7.AbstractC7350t.b(this.f18850k, magnifierElement.f18850k);
    }

    public int hashCode() {
        int iHashCode = this.f18841b.hashCode() * 31;
        p237x7.l lVar = this.f18842c;
        int iHashCode2 = (((((((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.f18844e)) * 31) + p190t.h.a(this.f18845f)) * 31) + Y0.l.i(this.f18846g)) * 31) + Y0.i.t(this.f18847h)) * 31) + Y0.i.t(this.f18848i)) * 31) + p190t.h.a(this.f18849j)) * 31;
        p237x7.l lVar2 = this.f18843d;
        return ((iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.f18850k.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p210v.J g() {
        return new p210v.J(this.f18841b, this.f18842c, this.f18843d, this.f18844e, this.f18845f, this.f18846g, this.f18847h, this.f18848i, this.f18849j, this.f18850k, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p210v.J j6) {
        j6.b2(this.f18841b, this.f18842c, this.f18844e, this.f18845f, this.f18846g, this.f18847h, this.f18848i, this.f18849j, this.f18843d, this.f18850k);
    }
}
