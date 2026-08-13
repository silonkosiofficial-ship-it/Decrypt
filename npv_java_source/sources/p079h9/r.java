package p079h9;

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
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"ઊ"}, d2 = {"ઋ", "", "ઌ", "ઍ", "\u0a8e", "એ", "", "ઐ", "ઑ", "\u0a92", "", "ઓ", "ઔ", "", "ક", "ખ", "ગ", "ઘ", "ઙ", "ચ", "છ", "જ", "ઝ"}, k = 1, mv = {1, 9, 0})
public final class r {
    public static final h9.r.a Companion = new h9.r.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p079h9.r f46571b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.ZoneOffset f46572a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ p079h9.r b(h9.r.a aVar, java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                interfaceC6683n = p079h9.u.b();
            }
            return aVar.a(charSequence, interfaceC6683n);
        }

        public final p079h9.r a(java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n) {
            j$.time.format.DateTimeFormatter dateTimeFormatterF;
            java.lang.String str;
            p247y7.AbstractC7350t.f(charSequence, "input");
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            h9.r.b bVar = h9.r.b.f46573a;
            if (interfaceC6683n == bVar.b()) {
                dateTimeFormatterF = p079h9.t.h();
                str = "access$getIsoFormat(...)";
            } else if (interfaceC6683n == bVar.c()) {
                dateTimeFormatterF = p079h9.t.g();
                str = "access$getIsoBasicFormat(...)";
            } else {
                if (interfaceC6683n != bVar.a()) {
                    return (p079h9.r) interfaceC6683n.b(charSequence);
                }
                dateTimeFormatterF = p079h9.t.f();
                str = "access$getFourDigitsFormat(...)";
            }
            p247y7.AbstractC7350t.e(dateTimeFormatterF, str);
            return p079h9.t.i(charSequence, dateTimeFormatterF);
        }

        public final p199t9.b serializer() {
            return p139n9.g.f52086a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h9.r.b f46573a = new h9.r.b();

        private b() {
        }

        public final p089i9.InterfaceC6683n a() {
            return p089i9.X.c();
        }

        public final p089i9.InterfaceC6683n b() {
            return p089i9.X.d();
        }

        public final p089i9.InterfaceC6683n c() {
            return p089i9.X.e();
        }
    }

    static {
        j$.time.ZoneOffset zoneOffset = j$.time.ZoneOffset.UTC;
        p247y7.AbstractC7350t.e(zoneOffset, "UTC");
        f46571b = new p079h9.r(zoneOffset);
    }

    public r(j$.time.ZoneOffset zoneOffset) {
        p247y7.AbstractC7350t.f(zoneOffset, "zoneOffset");
        this.f46572a = zoneOffset;
    }

    public final int a() {
        return this.f46572a.getTotalSeconds();
    }

    public final j$.time.ZoneOffset b() {
        return this.f46572a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p079h9.r) && p247y7.AbstractC7350t.b(this.f46572a, ((p079h9.r) obj).f46572a);
    }

    public int hashCode() {
        return this.f46572a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String string = this.f46572a.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
