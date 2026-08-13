package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JY implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.JY> CREATOR = new com.google.android.gms.internal.ads.GX();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f28702C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final byte[] f28703D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f28704E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f28705F;

    /* synthetic */ JY(android.os.Parcel parcel, com.google.android.gms.internal.ads.AbstractC3928hY abstractC3928hY) {
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f28702C = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f28703D = bArrCreateByteArray;
        this.f28704E = parcel.readInt();
        int i10 = parcel.readInt();
        this.f28705F = i10;
        a(string, bArrCreateByteArray, i10);
    }

    public JY(java.lang.String str, byte[] bArr, int i6, int i10) {
        a(str, bArr, i10);
        this.f28702C = str;
        this.f28703D = bArr;
        this.f28704E = i6;
        this.f28705F = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private static void a(java.lang.String str, byte[] bArr, int i6) {
        byte b6;
        byte b10;
        boolean z6 = true;
        switch (str) {
            case "com.android.capture.fps":
                b6 = 0;
                break;
            case "editable.tracks.samples.location":
                b6 = 4;
                break;
            case "editable.tracks.length":
                b6 = 2;
                break;
            case "editable.tracks.offset":
                b6 = 1;
                break;
            case "editable.tracks.map":
                b6 = 3;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0) {
            com.google.android.gms.internal.ads.LC.d(i6 == 23 && bArr.length == 4);
            return;
        }
        if (b6 == 1 || b6 == 2) {
            com.google.android.gms.internal.ads.LC.d(i6 == 78 && bArr.length == 8);
            return;
        }
        if (b6 == 3) {
            com.google.android.gms.internal.ads.LC.d(i6 == 0);
            return;
        }
        if (b6 != 4) {
            return;
        }
        if (i6 != 75 || bArr.length != 1 || ((b10 = bArr[0]) != 0 && b10 != 1)) {
            z6 = false;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.JY.class == obj.getClass()) {
            com.google.android.gms.internal.ads.JY jy = (com.google.android.gms.internal.ads.JY) obj;
            if (this.f28702C.equals(jy.f28702C) && java.util.Arrays.equals(this.f28703D, jy.f28703D) && this.f28704E == jy.f28704E && this.f28705F == jy.f28705F) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        return ((((((this.f28702C.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.f28703D)) * 31) + this.f28704E) * 31) + this.f28705F;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5 A[LOOP:0: B:27:0x00a2->B:29:0x00a5, LOOP_END] */
    public final java.lang.String toString() {
        java.lang.String string;
        byte[] bArr;
        java.lang.StringBuilder sb;
        int iD;
        int i6 = this.f28705F;
        int i10 = 0;
        if (i6 != 0) {
            if (i6 == 1) {
                string = com.google.android.gms.internal.ads.EW.b(this.f28703D);
            } else if (i6 != 23) {
                if (i6 == 67) {
                    iD = com.google.android.gms.internal.ads.AbstractC2466Ij0.d(this.f28703D);
                } else if (i6 == 75) {
                    iD = this.f28703D[0] & 255;
                } else if (i6 != 78) {
                    bArr = this.f28703D;
                    int length = bArr.length;
                    sb = new java.lang.StringBuilder(length + length);
                    while (i10 < bArr.length) {
                        sb.append(java.lang.Character.forDigit((bArr[i10] >> 4) & 15, 16));
                        sb.append(java.lang.Character.forDigit(bArr[i10] & 15, 16));
                        i10++;
                    }
                    string = sb.toString();
                } else {
                    string = java.lang.String.valueOf(new com.google.android.gms.internal.ads.C5128sR(this.f28703D).M());
                }
                string = java.lang.String.valueOf(iD);
            } else {
                string = java.lang.String.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.AbstractC2466Ij0.d(this.f28703D)));
            }
        } else if (this.f28702C.equals("editable.tracks.map")) {
            com.google.android.gms.internal.ads.LC.g(this.f28702C.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
            byte b6 = this.f28703D[1];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i10 < b6) {
                arrayList.add(java.lang.Integer.valueOf(this.f28703D[i10 + 2]));
                i10++;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("track types = ");
            com.google.android.gms.internal.ads.AbstractC5150sg0.b(sb2, arrayList, ",");
            string = sb2.toString();
        } else {
            bArr = this.f28703D;
            int length2 = bArr.length;
            sb = new java.lang.StringBuilder(length2 + length2);
            while (i10 < bArr.length) {
                sb.append(java.lang.Character.forDigit((bArr[i10] >> 4) & 15, 16));
                sb.append(java.lang.Character.forDigit(bArr[i10] & 15, 16));
                i10++;
            }
            string = sb.toString();
        }
        return "mdta: key=" + this.f28702C + ", value=" + string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f28702C);
        parcel.writeByteArray(this.f28703D);
        parcel.writeInt(this.f28704E);
        parcel.writeInt(this.f28705F);
    }
}
