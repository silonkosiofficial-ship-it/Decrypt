package j$.time;

/* JADX INFO: loaded from: classes4.dex */
final class s extends j$.time.ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47918d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f47919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.ZoneRules f47920c;

    s(java.lang.String str, j$.time.zone.ZoneRules zoneRules) {
        this.f47919b = str;
        this.f47920c = zoneRules;
    }

    static j$.time.s Q(java.lang.String str, boolean z6) {
        j$.time.zone.ZoneRules zoneRulesB;
        j$.util.Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new j$.time.DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i6 == 0) && ((cCharAt < '0' || cCharAt > '9' || i6 == 0) && ((cCharAt != '~' || i6 == 0) && ((cCharAt != '.' || i6 == 0) && ((cCharAt != '_' || i6 == 0) && ((cCharAt != '+' || i6 == 0) && (cCharAt != '-' || i6 == 0))))))))) {
                throw new j$.time.DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            zoneRulesB = j$.time.zone.i.b(str, true);
        } catch (j$.time.zone.f e6) {
            if (z6) {
                throw e6;
            }
            zoneRulesB = null;
        }
        return new j$.time.s(str, zoneRulesB);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    final void P(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f47919b);
    }

    final void R(java.io.DataOutput dataOutput) {
        dataOutput.writeUTF(this.f47919b);
    }

    @Override // j$.time.ZoneId
    public final java.lang.String getId() {
        return this.f47919b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.ZoneRules getRules() {
        j$.time.zone.ZoneRules zoneRules = this.f47920c;
        return zoneRules != null ? zoneRules : j$.time.zone.i.b(this.f47919b, false);
    }
}
