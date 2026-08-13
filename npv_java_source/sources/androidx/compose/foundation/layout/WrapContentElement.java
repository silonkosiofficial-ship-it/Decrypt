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
@kotlin.Metadata(d1 = {"Ѻ"}, d2 = {"ѻ", "Ѽ", "ѽ", "Ѿ", "ѿ", "", "Ҁ", "ҁ", "҂", "҃", "҄", "҅", "", "҆", "", "҇", "҈", "҉", "Ҋ", "ҋ", "Ҍ", "ҍ", "Ҏ", "ҏ", "Ґ", "ґ", "Ғ", "", "ғ", "Ҕ", "ҕ", "Җ", "җ", "Ҙ", "ҙ", "Қ", "қ", "Ҝ", "ҝ", "Ҟ", "ҟ", "Ҡ", "ҡ"}, k = 1, mv = {1, 8, 0})
final class WrapContentElement extends F0.W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.WrapContentElement.a f19213g = new androidx.compose.foundation.layout.WrapContentElement.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.EnumC0781o f19214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.p f19216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f19217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f19218f;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C0367a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p071h0.c.InterfaceC0526c f19219D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0367a(p071h0.c.InterfaceC0526c interfaceC0526c) {
                super(2);
                this.f19219D = interfaceC0526c;
            }

            public final long a(long j6, Y0.v vVar) {
                return Y0.q.a(0, this.f19219D.a(0, Y0.t.f(j6)));
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return Y0.p.b(a(((Y0.t) obj).j(), (Y0.v) obj2));
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p071h0.c f19220D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p071h0.c cVar) {
                super(2);
                this.f19220D = cVar;
            }

            public final long a(long j6, Y0.v vVar) {
                return this.f19220D.a(Y0.t.f16230b.a(), j6, vVar);
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return Y0.p.b(a(((Y0.t) obj).j(), (Y0.v) obj2));
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ h0.c.b f19221D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h0.c.b bVar) {
                super(2);
                this.f19221D = bVar;
            }

            public final long a(long j6, Y0.v vVar) {
                return Y0.q.a(this.f19221D.a(0, Y0.t.g(j6), vVar), 0);
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return Y0.p.b(a(((Y0.t) obj).j(), (Y0.v) obj2));
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.foundation.layout.WrapContentElement a(p071h0.c.InterfaceC0526c interfaceC0526c, boolean z6) {
            return new androidx.compose.foundation.layout.WrapContentElement(A.EnumC0781o.Vertical, z6, new androidx.compose.foundation.layout.WrapContentElement.a.C0367a(interfaceC0526c), interfaceC0526c, "wrapContentHeight");
        }

        public final androidx.compose.foundation.layout.WrapContentElement b(p071h0.c cVar, boolean z6) {
            return new androidx.compose.foundation.layout.WrapContentElement(A.EnumC0781o.Both, z6, new androidx.compose.foundation.layout.WrapContentElement.a.b(cVar), cVar, "wrapContentSize");
        }

        public final androidx.compose.foundation.layout.WrapContentElement c(h0.c.b bVar, boolean z6) {
            return new androidx.compose.foundation.layout.WrapContentElement(A.EnumC0781o.Horizontal, z6, new androidx.compose.foundation.layout.WrapContentElement.a.c(bVar), bVar, "wrapContentWidth");
        }
    }

    public WrapContentElement(A.EnumC0781o enumC0781o, boolean z6, p237x7.p pVar, java.lang.Object obj, java.lang.String str) {
        this.f19214b = enumC0781o;
        this.f19215c = z6;
        this.f19216d = pVar;
        this.f19217e = obj;
        this.f19218f = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.layout.WrapContentElement.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.layout.WrapContentElement wrapContentElement = (androidx.compose.foundation.layout.WrapContentElement) obj;
        return this.f19214b == wrapContentElement.f19214b && this.f19215c == wrapContentElement.f19215c && p247y7.AbstractC7350t.b(this.f19217e, wrapContentElement.f19217e);
    }

    public int hashCode() {
        return (((this.f19214b.hashCode() * 31) + p190t.h.a(this.f19215c)) * 31) + this.f19217e.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.s g() {
        return new androidx.compose.foundation.layout.s(this.f19214b, this.f19215c, this.f19216d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.s sVar) {
        sVar.V1(this.f19214b);
        sVar.W1(this.f19215c);
        sVar.U1(this.f19216d);
    }
}
