package androidx.compose.foundation.selection;

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
@kotlin.Metadata(d1 = {"ա"}, d2 = {"բ", "գ", "դ", "ե", "զ", "է", "ը", "թ", "ժ", "", "ի", "լ", "խ", "ծ", "կ", "հ", "ձ", "ղ", "ճ", "մ", "յ", "ն", "շ", "", "ո", "չ", "պ", "", "ջ", "ռ", "ս", "վ", "տ", "ր", "ց", "ւ", "փ", "ք", "օ", "ֆ", "և", "ֈ", "։"}, k = 1, mv = {1, 8, 0})
final class TriStateToggleableElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0.a f19489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p250z.l f19490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p210v.I f19491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K0.h f19493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.a f19494g;

    private TriStateToggleableElement(L0.a aVar, p250z.l lVar, p210v.I i6, boolean z6, K0.h hVar, p237x7.a aVar2) {
        this.f19489b = aVar;
        this.f19490c = lVar;
        this.f19491d = i6;
        this.f19492e = z6;
        this.f19493f = hVar;
        this.f19494g = aVar2;
    }

    public /* synthetic */ TriStateToggleableElement(L0.a aVar, p250z.l lVar, p210v.I i6, boolean z6, K0.h hVar, p237x7.a aVar2, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, lVar, i6, z6, hVar, aVar2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.selection.TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.selection.TriStateToggleableElement triStateToggleableElement = (androidx.compose.foundation.selection.TriStateToggleableElement) obj;
        return this.f19489b == triStateToggleableElement.f19489b && p247y7.AbstractC7350t.b(this.f19490c, triStateToggleableElement.f19490c) && p247y7.AbstractC7350t.b(this.f19491d, triStateToggleableElement.f19491d) && this.f19492e == triStateToggleableElement.f19492e && p247y7.AbstractC7350t.b(this.f19493f, triStateToggleableElement.f19493f) && this.f19494g == triStateToggleableElement.f19494g;
    }

    public int hashCode() {
        int iHashCode = this.f19489b.hashCode() * 31;
        p250z.l lVar = this.f19490c;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        p210v.I i6 = this.f19491d;
        int iHashCode3 = (((iHashCode2 + (i6 != null ? i6.hashCode() : 0)) * 31) + p190t.h.a(this.f19492e)) * 31;
        K0.h hVar = this.f19493f;
        return ((iHashCode3 + (hVar != null ? K0.h.l(hVar.n()) : 0)) * 31) + this.f19494g.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.selection.d g() {
        return new androidx.compose.foundation.selection.d(this.f19489b, this.f19490c, this.f19491d, this.f19492e, this.f19493f, this.f19494g, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.selection.d dVar) {
        dVar.u2(this.f19489b, this.f19490c, this.f19491d, this.f19492e, this.f19493f, this.f19494g);
    }
}
