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
@kotlin.Metadata(d1 = {"\u05ca"}, d2 = {"\u05cb", "\u05cc", "\u05cd", "\u05ce", "\u05cf", "א", "ב", "ג", "ד", "ה", "ו", "ז", "ח", "ט", "י", "", "ך", "", "כ", "ל", "", "ם", "מ", "ן", "נ", "ס", "ע", "ף", "פ", "ץ", "צ", "ק", "ר", "ש", "ת", "\u05eb", "\u05ec", "", "\u05ed", "\u05ee", "ׯ", "װ", "ױ", "", "ײ", "׳", "״", "\u05f5", "\u05f6", "\u05f7", "\u05f8", "\u05f9", "\u05fa", "\u05fb", "\u05fc", "\u05fd", "\u05fe", "\u05ff", "\u0600", "\u0601", "\u0602", "\u0603", "\u0604", "\u0605", "؆", "؇"}, k = 1, mv = {1, 8, 0})
public final class SelectableTextAnnotatedStringElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.C1332d f19513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.P f19514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.AbstractC1494h.b f19515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f19516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f19521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p237x7.l f19522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M.g f19523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p141o0.B0 f19524m;

    private SelectableTextAnnotatedStringElement(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6) {
        this.f19513b = c1332d;
        this.f19514c = p6;
        this.f19515d = bVar;
        this.f19516e = lVar;
        this.f19517f = i6;
        this.f19518g = z6;
        this.f19519h = i10;
        this.f19520i = i11;
        this.f19521j = list;
        this.f19522k = lVar2;
        this.f19524m = b6;
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, bVar, lVar, i6, z6, i10, i11, list, lVar2, gVar, b6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement)) {
            return false;
        }
        androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement) obj;
        return p247y7.AbstractC7350t.b(this.f19524m, selectableTextAnnotatedStringElement.f19524m) && p247y7.AbstractC7350t.b(this.f19513b, selectableTextAnnotatedStringElement.f19513b) && p247y7.AbstractC7350t.b(this.f19514c, selectableTextAnnotatedStringElement.f19514c) && p247y7.AbstractC7350t.b(this.f19521j, selectableTextAnnotatedStringElement.f19521j) && p247y7.AbstractC7350t.b(this.f19515d, selectableTextAnnotatedStringElement.f19515d) && this.f19516e == selectableTextAnnotatedStringElement.f19516e && X0.u.e(this.f19517f, selectableTextAnnotatedStringElement.f19517f) && this.f19518g == selectableTextAnnotatedStringElement.f19518g && this.f19519h == selectableTextAnnotatedStringElement.f19519h && this.f19520i == selectableTextAnnotatedStringElement.f19520i && this.f19522k == selectableTextAnnotatedStringElement.f19522k && p247y7.AbstractC7350t.b(this.f19523l, selectableTextAnnotatedStringElement.f19523l);
    }

    public int hashCode() {
        int iHashCode = ((((this.f19513b.hashCode() * 31) + this.f19514c.hashCode()) * 31) + this.f19515d.hashCode()) * 31;
        p237x7.l lVar = this.f19516e;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + X0.u.f(this.f19517f)) * 31) + p190t.h.a(this.f19518g)) * 31) + this.f19519h) * 31) + this.f19520i) * 31;
        java.util.List list = this.f19521j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        p237x7.l lVar2 = this.f19522k;
        int iHashCode4 = (((iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + 0) * 31;
        p141o0.B0 b6 = this.f19524m;
        return iHashCode4 + (b6 != null ? b6.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.text.modifiers.a g() {
        return new androidx.compose.foundation.text.modifiers.a(this.f19513b, this.f19514c, this.f19515d, this.f19516e, this.f19517f, this.f19518g, this.f19519h, this.f19520i, this.f19521j, this.f19522k, this.f19523l, this.f19524m, null, 4096, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.text.modifiers.a aVar) {
        aVar.Z1(this.f19513b, this.f19514c, this.f19521j, this.f19520i, this.f19519h, this.f19518g, this.f19515d, this.f19517f, this.f19516e, this.f19522k, this.f19523l, this.f19524m);
    }

    public java.lang.String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((java.lang.Object) this.f19513b) + ", style=" + this.f19514c + ", fontFamilyResolver=" + this.f19515d + ", onTextLayout=" + this.f19516e + ", overflow=" + ((java.lang.Object) X0.u.g(this.f19517f)) + ", softWrap=" + this.f19518g + ", maxLines=" + this.f19519h + ", minLines=" + this.f19520i + ", placeholders=" + this.f19521j + ", onPlaceholderLayout=" + this.f19522k + ", selectionController=" + this.f19523l + ", color=" + this.f19524m + ')';
    }
}
