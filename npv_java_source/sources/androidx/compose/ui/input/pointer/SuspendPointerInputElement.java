package androidx.compose.ui.input.pointer;

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
@kotlin.Metadata(d1 = {"ࢯ"}, d2 = {"ࢰ", "ࢱ", "ࢲ", "", "ࢳ", "ࢴ", "", "\u08b5", "ࢶ", "ࢷ", "ࢸ", "ࢹ", "ࢺ", "ࢻ", "ࢼ", "ࢽ", "ࢾ", "ࢿ", "ࣀ", "ࣁ", "ࣂ", "", "ࣃ", "ࣄ", "", "ࣅ", "ࣆ", "ࣇ", "\u08c8", "\u08c9", "\u08ca", "\u08cb", "\u08cc", "\u08cd", "\u08ce", "\u08cf", "\u08d0", "\u08d1", "\u08d2", "࣓", "ࣔ", "ࣕ"}, k = 1, mv = {1, 8, 0})
public final class SuspendPointerInputElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f19795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f19796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object[] f19797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.p f19798e;

    public SuspendPointerInputElement(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, p237x7.p pVar) {
        this.f19795b = obj;
        this.f19796c = obj2;
        this.f19797d = objArr;
        this.f19798e = pVar;
    }

    public /* synthetic */ SuspendPointerInputElement(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, p237x7.p pVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : obj, (i6 & 2) != 0 ? null : obj2, (i6 & 4) != 0 ? null : objArr, pVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement)) {
            return false;
        }
        androidx.compose.ui.input.pointer.SuspendPointerInputElement suspendPointerInputElement = (androidx.compose.ui.input.pointer.SuspendPointerInputElement) obj;
        if (!p247y7.AbstractC7350t.b(this.f19795b, suspendPointerInputElement.f19795b) || !p247y7.AbstractC7350t.b(this.f19796c, suspendPointerInputElement.f19796c)) {
            return false;
        }
        java.lang.Object[] objArr = this.f19797d;
        if (objArr != null) {
            java.lang.Object[] objArr2 = suspendPointerInputElement.f19797d;
            if (objArr2 == null || !java.util.Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f19797d != null) {
            return false;
        }
        return this.f19798e == suspendPointerInputElement.f19798e;
    }

    public int hashCode() {
        java.lang.Object obj = this.f19795b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f19796c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        java.lang.Object[] objArr = this.f19797d;
        return ((iHashCode2 + (objArr != null ? java.util.Arrays.hashCode(objArr) : 0)) * 31) + this.f19798e.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p251z0.X g() {
        return new p251z0.X(this.f19795b, this.f19796c, this.f19797d, this.f19798e);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p251z0.X x6) {
        x6.Y1(this.f19795b, this.f19796c, this.f19797d, this.f19798e);
    }
}
