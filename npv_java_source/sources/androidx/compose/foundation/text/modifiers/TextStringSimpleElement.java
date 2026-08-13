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
@kotlin.Metadata(d1 = {"ه"}, d2 = {"و", "ى", "ي", "", "ً", "ٌ", "ٍ", "َ", "ُ", "ِ", "ّ", "", "ْ", "", "ٓ", "ٔ", "ٕ", "ٖ", "ٗ", "٘", "ٙ", "ٚ", "ٛ", "ٜ", "ٝ", "ٞ", "", "ٟ", "٠", "١", "٢", "٣", "٤", "٥", "٦", "٧", "٨", "٩", "٪", "٫", "٬", "٭", "ٮ", "ٯ", "ٰ", "ٱ", "ٲ"}, k = 1, mv = {1, 8, 0})
public final class TextStringSimpleElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f19538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.P f19539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.AbstractC1494h.b f19540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p141o0.B0 f19545i;

    private TextStringSimpleElement(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, p141o0.B0 b6) {
        this.f19538b = str;
        this.f19539c = p6;
        this.f19540d = bVar;
        this.f19541e = i6;
        this.f19542f = z6;
        this.f19543g = i10;
        this.f19544h = i11;
        this.f19545i = b6;
    }

    public /* synthetic */ TextStringSimpleElement(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, p141o0.B0 b6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, p6, bVar, i6, z6, i10, i11, b6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.text.modifiers.TextStringSimpleElement)) {
            return false;
        }
        androidx.compose.foundation.text.modifiers.TextStringSimpleElement textStringSimpleElement = (androidx.compose.foundation.text.modifiers.TextStringSimpleElement) obj;
        return p247y7.AbstractC7350t.b(this.f19545i, textStringSimpleElement.f19545i) && p247y7.AbstractC7350t.b(this.f19538b, textStringSimpleElement.f19538b) && p247y7.AbstractC7350t.b(this.f19539c, textStringSimpleElement.f19539c) && p247y7.AbstractC7350t.b(this.f19540d, textStringSimpleElement.f19540d) && X0.u.e(this.f19541e, textStringSimpleElement.f19541e) && this.f19542f == textStringSimpleElement.f19542f && this.f19543g == textStringSimpleElement.f19543g && this.f19544h == textStringSimpleElement.f19544h;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f19538b.hashCode() * 31) + this.f19539c.hashCode()) * 31) + this.f19540d.hashCode()) * 31) + X0.u.f(this.f19541e)) * 31) + p190t.h.a(this.f19542f)) * 31) + this.f19543g) * 31) + this.f19544h) * 31;
        p141o0.B0 b6 = this.f19545i;
        return iHashCode + (b6 != null ? b6.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public M.i g() {
        return new M.i(this.f19538b, this.f19539c, this.f19540d, this.f19541e, this.f19542f, this.f19543g, this.f19544h, this.f19545i, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(M.i iVar) {
        iVar.b2(iVar.g2(this.f19545i, this.f19539c), iVar.i2(this.f19538b), iVar.h2(this.f19539c, this.f19544h, this.f19543g, this.f19542f, this.f19540d, this.f19541e));
    }
}
