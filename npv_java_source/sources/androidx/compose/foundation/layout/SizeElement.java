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
@kotlin.Metadata(d1 = {"л"}, d2 = {"м", "н", "о", "п", "р", "с", "т", "у", "", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я", "", "ѐ", "ё", "ђ", "", "ѓ", "є", "ѕ", "і", "ї", "ј", "љ", "њ", "ћ", "ќ", "ѝ", "ў"}, k = 1, mv = {1, 8, 0})
final class SizeElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f19208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.l f19210g;

    private SizeElement(float f6, float f10, float f11, float f12, boolean z6, p237x7.l lVar) {
        this.f19205b = f6;
        this.f19206c = f10;
        this.f19207d = f11;
        this.f19208e = f12;
        this.f19209f = z6;
        this.f19210g = lVar;
    }

    public /* synthetic */ SizeElement(float f6, float f10, float f11, float f12, boolean z6, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? Y0.i.f16208D.c() : f6, (i6 & 2) != 0 ? Y0.i.f16208D.c() : f10, (i6 & 4) != 0 ? Y0.i.f16208D.c() : f11, (i6 & 8) != 0 ? Y0.i.f16208D.c() : f12, z6, lVar, null);
    }

    public /* synthetic */ SizeElement(float f6, float f10, float f11, float f12, boolean z6, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, z6, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.layout.SizeElement)) {
            return false;
        }
        androidx.compose.foundation.layout.SizeElement sizeElement = (androidx.compose.foundation.layout.SizeElement) obj;
        return Y0.i.s(this.f19205b, sizeElement.f19205b) && Y0.i.s(this.f19206c, sizeElement.f19206c) && Y0.i.s(this.f19207d, sizeElement.f19207d) && Y0.i.s(this.f19208e, sizeElement.f19208e) && this.f19209f == sizeElement.f19209f;
    }

    public int hashCode() {
        return (((((((Y0.i.t(this.f19205b) * 31) + Y0.i.t(this.f19206c)) * 31) + Y0.i.t(this.f19207d)) * 31) + Y0.i.t(this.f19208e)) * 31) + p190t.h.a(this.f19209f);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.q g() {
        return new androidx.compose.foundation.layout.q(this.f19205b, this.f19206c, this.f19207d, this.f19208e, this.f19209f, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.q qVar) {
        qVar.Y1(this.f19205b);
        qVar.X1(this.f19206c);
        qVar.W1(this.f19207d);
        qVar.V1(this.f19208e);
        qVar.U1(this.f19209f);
    }
}
