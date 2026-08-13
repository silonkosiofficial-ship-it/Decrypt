package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
final class a implements java.io.Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f47984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f47985b;

    public a() {
    }

    a(byte b6, java.lang.Object obj) {
        this.f47984a = b6;
        this.f47985b = obj;
    }

    static long a(java.io.DataInput dataInput) {
        int i6 = dataInput.readByte() & 255;
        if (i6 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i6 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    static j$.time.ZoneOffset b(java.io.DataInput dataInput) throws java.io.IOException {
        byte b6 = dataInput.readByte();
        return b6 == 127 ? j$.time.ZoneOffset.ofTotalSeconds(dataInput.readInt()) : j$.time.ZoneOffset.ofTotalSeconds(b6 * 900);
    }

    static void c(long j6, java.io.DataOutput dataOutput) {
        if (j6 < -4575744000L || j6 >= 10413792000L || j6 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j6);
        } else {
            int i6 = (int) ((j6 + 4575744000L) / 900);
            dataOutput.writeByte((i6 >>> 16) & 255);
            dataOutput.writeByte((i6 >>> 8) & 255);
            dataOutput.writeByte(i6 & 255);
        }
    }

    static void d(j$.time.ZoneOffset zoneOffset, java.io.DataOutput dataOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i6 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i6);
        if (i6 == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    private java.lang.Object readResolve() {
        return this.f47985b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        java.lang.Object objK;
        byte b6 = objectInput.readByte();
        this.f47984a = b6;
        if (b6 == 1) {
            objK = j$.time.zone.ZoneRules.k(objectInput);
        } else if (b6 == 2) {
            long jA = a(objectInput);
            j$.time.ZoneOffset zoneOffsetB = b(objectInput);
            j$.time.ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new java.lang.IllegalArgumentException("Offsets must not be equal");
            }
            objK = new j$.time.zone.b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b6 == 3) {
            objK = j$.time.zone.e.b(objectInput);
        } else {
            if (b6 != 100) {
                throw new java.io.StreamCorruptedException("Unknown serialized type");
            }
            objK = new j$.time.zone.ZoneRules(java.util.TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f47985b = objK;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b6 = this.f47984a;
        java.lang.Object obj = this.f47985b;
        objectOutput.writeByte(b6);
        if (b6 == 1) {
            ((j$.time.zone.ZoneRules) obj).l(objectOutput);
            return;
        }
        if (b6 == 2) {
            ((j$.time.zone.b) obj).N(objectOutput);
        } else if (b6 == 3) {
            ((j$.time.zone.e) obj).c(objectOutput);
        } else {
            if (b6 != 100) {
                throw new java.io.InvalidClassException("Unknown serialized type");
            }
            ((j$.time.zone.ZoneRules) obj).m(objectOutput);
        }
    }
}
