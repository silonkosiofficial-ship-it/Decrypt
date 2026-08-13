package androidx.compose.foundation.gestures;

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
@kotlin.Metadata(d1 = {"˃"}, d2 = {"˄", "˅", "ˆ", "ˇ", "ˈ", "ˉ", "ˊ", "ˋ", "ˌ", "", "ˍ", "ˎ", "ˏ", "ː", "ˑ", "˒", "˓", "˔", "˕", "˖", "˗", "˘", "˙", "˚", "˛", "˜", "", "˝", "˞", "", "˟", "ˠ", "ˡ", "ˢ", "ˣ", "ˤ", "˥", "˦", "˧", "˨", "˩", "˪", "˫", "ˬ", "˭", "ˮ", "˯", "˰", "˱", "˲", "˳", "˴", "˵", "˶", "˷", "˸", "˹", "˺", "˻", "˼", "˽", "˾", "˿", "̀"}, k = 1, mv = {1, 8, 0})
final class ScrollableElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p230x.A f18998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p230x.s f18999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p210v.T f19000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p230x.p f19003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p250z.l f19004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p230x.InterfaceC7286f f19005i;

    public ScrollableElement(p230x.A a6, p230x.s sVar, p210v.T t6, boolean z6, boolean z10, p230x.p pVar, p250z.l lVar, p230x.InterfaceC7286f interfaceC7286f) {
        this.f18998b = a6;
        this.f18999c = sVar;
        this.f19000d = t6;
        this.f19001e = z6;
        this.f19002f = z10;
        this.f19003g = pVar;
        this.f19004h = lVar;
        this.f19005i = interfaceC7286f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.gestures.ScrollableElement)) {
            return false;
        }
        androidx.compose.foundation.gestures.ScrollableElement scrollableElement = (androidx.compose.foundation.gestures.ScrollableElement) obj;
        return p247y7.AbstractC7350t.b(this.f18998b, scrollableElement.f18998b) && this.f18999c == scrollableElement.f18999c && p247y7.AbstractC7350t.b(this.f19000d, scrollableElement.f19000d) && this.f19001e == scrollableElement.f19001e && this.f19002f == scrollableElement.f19002f && p247y7.AbstractC7350t.b(this.f19003g, scrollableElement.f19003g) && p247y7.AbstractC7350t.b(this.f19004h, scrollableElement.f19004h) && p247y7.AbstractC7350t.b(this.f19005i, scrollableElement.f19005i);
    }

    public int hashCode() {
        int iHashCode = ((this.f18998b.hashCode() * 31) + this.f18999c.hashCode()) * 31;
        p210v.T t6 = this.f19000d;
        int iHashCode2 = (((((iHashCode + (t6 != null ? t6.hashCode() : 0)) * 31) + p190t.h.a(this.f19001e)) * 31) + p190t.h.a(this.f19002f)) * 31;
        p230x.p pVar = this.f19003g;
        int iHashCode3 = (iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        p250z.l lVar = this.f19004h;
        int iHashCode4 = (iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        p230x.InterfaceC7286f interfaceC7286f = this.f19005i;
        return iHashCode4 + (interfaceC7286f != null ? interfaceC7286f.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.gestures.f g() {
        return new androidx.compose.foundation.gestures.f(this.f18998b, this.f19000d, this.f19003g, this.f18999c, this.f19001e, this.f19002f, this.f19004h, this.f19005i);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.gestures.f fVar) {
        fVar.A2(this.f18998b, this.f18999c, this.f19000d, this.f19001e, this.f19002f, this.f19003g, this.f19004h, this.f19005i);
    }
}
