package androidx.compose.ui.draw;

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
@kotlin.Metadata(d1 = {"\u070f"}, d2 = {"ܐ", "ܑ", "ܒ", "ܓ", "ܔ", "", "ܕ", "ܖ", "ܗ", "ܘ", "ܙ", "", "ܚ", "ܛ", "ܜ", "ܝ", "ܞ", "ܟ", "ܠ", "ܡ", "ܢ", "ܣ", "ܤ", "", "ܥ", "ܦ", "", "ܧ", "ܨ", "", "ܩ", "ܪ", "ܫ", "ܬ", "ܭ", "ܮ", "ܯ", "ܰ", "ܱ", "ܲ", "ܳ", "ܴ", "ܵ", "ܶ", "ܷ", "ܸ", "ܹ", "ܺ", "ܻ", "ܼ", "ܽ", "ܾ", "ܿ", "݀", "݁", "݂", "݃", "݄"}, k = 1, mv = {1, 8, 0})
final class PainterElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p191t0.b f19604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p071h0.c f19606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D0.InterfaceC0889h f19607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f19608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p141o0.AbstractC7019z0 f19609g;

    public PainterElement(p191t0.b bVar, boolean z6, p071h0.c cVar, D0.InterfaceC0889h interfaceC0889h, float f6, p141o0.AbstractC7019z0 abstractC7019z0) {
        this.f19604b = bVar;
        this.f19605c = z6;
        this.f19606d = cVar;
        this.f19607e = interfaceC0889h;
        this.f19608f = f6;
        this.f19609g = abstractC7019z0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.draw.PainterElement)) {
            return false;
        }
        androidx.compose.ui.draw.PainterElement painterElement = (androidx.compose.ui.draw.PainterElement) obj;
        return p247y7.AbstractC7350t.b(this.f19604b, painterElement.f19604b) && this.f19605c == painterElement.f19605c && p247y7.AbstractC7350t.b(this.f19606d, painterElement.f19606d) && p247y7.AbstractC7350t.b(this.f19607e, painterElement.f19607e) && java.lang.Float.compare(this.f19608f, painterElement.f19608f) == 0 && p247y7.AbstractC7350t.b(this.f19609g, painterElement.f19609g);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f19604b.hashCode() * 31) + p190t.h.a(this.f19605c)) * 31) + this.f19606d.hashCode()) * 31) + this.f19607e.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.f19608f)) * 31;
        p141o0.AbstractC7019z0 abstractC7019z0 = this.f19609g;
        return iHashCode + (abstractC7019z0 == null ? 0 : abstractC7019z0.hashCode());
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.draw.e g() {
        return new androidx.compose.ui.draw.e(this.f19604b, this.f19605c, this.f19606d, this.f19607e, this.f19608f, this.f19609g);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.draw.e eVar) {
        boolean zV1 = eVar.V1();
        boolean z6 = this.f19605c;
        boolean z10 = zV1 != z6 || (z6 && !p131n0.m.f(eVar.U1().h(), this.f19604b.h()));
        eVar.d2(this.f19604b);
        eVar.e2(this.f19605c);
        eVar.a2(this.f19606d);
        eVar.c2(this.f19607e);
        eVar.b(this.f19608f);
        eVar.b2(this.f19609g);
        if (z10) {
            F0.H.b(eVar);
        }
        F0.AbstractC0933t.a(eVar);
    }

    public java.lang.String toString() {
        return "PainterElement(painter=" + this.f19604b + ", sizeToIntrinsics=" + this.f19605c + ", alignment=" + this.f19606d + ", contentScale=" + this.f19607e + ", alpha=" + this.f19608f + ", colorFilter=" + this.f19609g + ')';
    }
}
