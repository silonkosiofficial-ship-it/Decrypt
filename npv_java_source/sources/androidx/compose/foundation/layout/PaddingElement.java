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
@kotlin.Metadata(d1 = {"Ϩ"}, d2 = {"ϩ", "Ϫ", "ϫ", "Ϭ", "ϭ", "Ϯ", "ϯ", "ϰ", "", "ϱ", "ϲ", "ϳ", "ϴ", "ϵ", "϶", "Ϸ", "ϸ", "Ϲ", "Ϻ", "ϻ", "ϼ", "", "Ͻ", "Ͼ", "", "Ͽ", "Ѐ", "Ё", "Ђ", "Ѓ", "Є", "Ѕ", "І", "Ї", "Ј", "Љ", "Њ", "Ћ", "Ќ", "Ѝ", "Ў", "Џ", "А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л"}, k = 1, mv = {1, 8, 0})
final class PaddingElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f19197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f19198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f19199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.l f19202g;

    private PaddingElement(float f6, float f10, float f11, float f12, boolean z6, p237x7.l lVar) {
        this.f19197b = f6;
        this.f19198c = f10;
        this.f19199d = f11;
        this.f19200e = f12;
        this.f19201f = z6;
        this.f19202g = lVar;
        if (f6 >= 0.0f || Y0.i.s(f6, Y0.i.f16208D.c())) {
            float f13 = this.f19198c;
            if (f13 >= 0.0f || Y0.i.s(f13, Y0.i.f16208D.c())) {
                float f14 = this.f19199d;
                if (f14 >= 0.0f || Y0.i.s(f14, Y0.i.f16208D.c())) {
                    float f15 = this.f19200e;
                    if (f15 >= 0.0f || Y0.i.s(f15, Y0.i.f16208D.c())) {
                        return;
                    }
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Padding must be non-negative".toString());
    }

    public /* synthetic */ PaddingElement(float f6, float f10, float f11, float f12, boolean z6, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, z6, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        androidx.compose.foundation.layout.PaddingElement paddingElement = obj instanceof androidx.compose.foundation.layout.PaddingElement ? (androidx.compose.foundation.layout.PaddingElement) obj : null;
        return paddingElement != null && Y0.i.s(this.f19197b, paddingElement.f19197b) && Y0.i.s(this.f19198c, paddingElement.f19198c) && Y0.i.s(this.f19199d, paddingElement.f19199d) && Y0.i.s(this.f19200e, paddingElement.f19200e) && this.f19201f == paddingElement.f19201f;
    }

    public int hashCode() {
        return (((((((Y0.i.t(this.f19197b) * 31) + Y0.i.t(this.f19198c)) * 31) + Y0.i.t(this.f19199d)) * 31) + Y0.i.t(this.f19200e)) * 31) + p190t.h.a(this.f19201f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.n g() {
        return new androidx.compose.foundation.layout.n(this.f19197b, this.f19198c, this.f19199d, this.f19200e, this.f19201f, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.n nVar) {
        nVar.Z1(this.f19197b);
        nVar.a2(this.f19198c);
        nVar.X1(this.f19199d);
        nVar.W1(this.f19200e);
        nVar.Y1(this.f19201f);
    }
}
