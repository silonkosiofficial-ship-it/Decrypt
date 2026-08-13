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
@kotlin.Metadata(d1 = {"Ժ"}, d2 = {"Ի", "Լ", "Խ", "", "Ծ", "Կ", "Հ", "Ձ", "Ղ", "Ճ", "Մ", "Յ", "Ն", "Շ", "Ո", "Չ", "Պ", "Ջ", "Ռ", "Ս", "Վ", "Տ", "", "Ր", "Ց", "Ւ", "", "Փ", "Ք", "Օ", "Ֆ", "\u0557", "\u0558", "ՙ", "՚", "՛", "՜", "՝", "՞", "՟", "ՠ"}, k = 1, mv = {1, 8, 0})
final class SelectableElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p250z.l f19484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p210v.I f19485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K0.h f19487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.a f19488g;

    private SelectableElement(boolean z6, p250z.l lVar, p210v.I i6, boolean z10, K0.h hVar, p237x7.a aVar) {
        this.f19483b = z6;
        this.f19484c = lVar;
        this.f19485d = i6;
        this.f19486e = z10;
        this.f19487f = hVar;
        this.f19488g = aVar;
    }

    public /* synthetic */ SelectableElement(boolean z6, p250z.l lVar, p210v.I i6, boolean z10, K0.h hVar, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, lVar, i6, z10, hVar, aVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.selection.SelectableElement.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.selection.SelectableElement selectableElement = (androidx.compose.foundation.selection.SelectableElement) obj;
        return this.f19483b == selectableElement.f19483b && p247y7.AbstractC7350t.b(this.f19484c, selectableElement.f19484c) && p247y7.AbstractC7350t.b(this.f19485d, selectableElement.f19485d) && this.f19486e == selectableElement.f19486e && p247y7.AbstractC7350t.b(this.f19487f, selectableElement.f19487f) && this.f19488g == selectableElement.f19488g;
    }

    public int hashCode() {
        int iA = p190t.h.a(this.f19483b) * 31;
        p250z.l lVar = this.f19484c;
        int iHashCode = (iA + (lVar != null ? lVar.hashCode() : 0)) * 31;
        p210v.I i6 = this.f19485d;
        int iHashCode2 = (((iHashCode + (i6 != null ? i6.hashCode() : 0)) * 31) + p190t.h.a(this.f19486e)) * 31;
        K0.h hVar = this.f19487f;
        return ((iHashCode2 + (hVar != null ? K0.h.l(hVar.n()) : 0)) * 31) + this.f19488g.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.selection.b g() {
        return new androidx.compose.foundation.selection.b(this.f19483b, this.f19484c, this.f19485d, this.f19486e, this.f19487f, this.f19488g, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.selection.b bVar) {
        bVar.u2(this.f19483b, this.f19484c, this.f19485d, this.f19486e, this.f19487f, this.f19488g);
    }
}
