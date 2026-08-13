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
@kotlin.Metadata(d1 = {"ੵ"}, d2 = {"੶", "", "\u0a77", "\u0a78", "\u0a79", "\u0a7a", "\u0a7b", "", "\u0a7c", "\u0a7d", "", "\u0a7e", "\u0a7f", "", "\u0a80", "ઁ", "ં", "ઃ", "\u0a84", "અ", "આ", "ઇ", "ઈ", "ઉ"}, k = 1, mv = {1, 9, 0})
public class o {
    public static final h9.o.a Companion = new h9.o.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p079h9.e f46569b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.ZoneId f46570a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p079h9.o a() {
            j$.time.ZoneId zoneIdSystemDefault = j$.time.ZoneId.systemDefault();
            p247y7.AbstractC7350t.e(zoneIdSystemDefault, "systemDefault(...)");
            return e(zoneIdSystemDefault);
        }

        public final java.util.Set b() {
            java.util.Set<java.lang.String> availableZoneIds = j$.time.ZoneId.getAvailableZoneIds();
            p247y7.AbstractC7350t.e(availableZoneIds, "getAvailableZoneIds(...)");
            return availableZoneIds;
        }

        public final p079h9.e c() {
            return p079h9.o.f46569b;
        }

        public final p079h9.o d(java.lang.String str) throws java.lang.Exception {
            p247y7.AbstractC7350t.f(str, "zoneId");
            try {
                j$.time.ZoneId zoneIdOf = j$.time.ZoneId.of(str);
                p247y7.AbstractC7350t.e(zoneIdOf, "of(...)");
                return e(zoneIdOf);
            } catch (java.lang.Exception e6) {
                if (e6 instanceof j$.time.DateTimeException) {
                    throw new p079h9.f(e6);
                }
                throw e6;
            }
        }

        public final p079h9.o e(j$.time.ZoneId zoneId) {
            p247y7.AbstractC7350t.f(zoneId, "zoneId");
            if (zoneId instanceof j$.time.ZoneOffset) {
                return new p079h9.e(new p079h9.r((j$.time.ZoneOffset) zoneId));
            }
            if (!p079h9.q.b(zoneId)) {
                return new p079h9.o(zoneId);
            }
            j$.time.ZoneId zoneIdNormalized = zoneId.normalized();
            p247y7.AbstractC7350t.d(zoneIdNormalized, "null cannot be cast to non-null type java.time.ZoneOffset");
            return new p079h9.e(new p079h9.r((j$.time.ZoneOffset) zoneIdNormalized), zoneId);
        }

        public final p199t9.b serializer() {
            return p139n9.f.f52084a;
        }
    }

    static {
        j$.time.ZoneOffset zoneOffset = j$.time.ZoneOffset.UTC;
        p247y7.AbstractC7350t.e(zoneOffset, "UTC");
        f46569b = p079h9.u.a(new p079h9.r(zoneOffset));
    }

    public o(j$.time.ZoneId zoneId) {
        p247y7.AbstractC7350t.f(zoneId, "zoneId");
        this.f46570a = zoneId;
    }

    public final java.lang.String b() {
        java.lang.String id = this.f46570a.getId();
        p247y7.AbstractC7350t.e(id, "getId(...)");
        return id;
    }

    public final j$.time.ZoneId c() {
        return this.f46570a;
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof p079h9.o) && p247y7.AbstractC7350t.b(this.f46570a, ((p079h9.o) obj).f46570a));
    }

    public int hashCode() {
        return this.f46570a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String string = this.f46570a.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
