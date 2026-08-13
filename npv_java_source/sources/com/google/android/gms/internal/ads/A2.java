package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class A2 extends com.google.android.gms.internal.ads.AbstractC4974r2 {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.A2> CREATOR = new com.google.android.gms.internal.ads.C5854z2();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f25012D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 f25013E;

    public A2(java.lang.String str, java.lang.String str2, java.util.List list) {
        super(str);
        com.google.android.gms.internal.ads.LC.d(!list.isEmpty());
        this.f25012D = str2;
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0M = com.google.android.gms.internal.ads.AbstractC3398ci0.M(list);
        this.f25013E = abstractC3398ci0M;
    }

    private static java.util.List a(java.lang.String str) {
        int i6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                i6 = java.lang.Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i6 = java.lang.Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                i6 = java.lang.Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(java.lang.Integer.valueOf(i6));
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.A2.class == obj.getClass()) {
            com.google.android.gms.internal.ads.A2 a6 = (com.google.android.gms.internal.ads.A2) obj;
            if (j$.util.Objects.equals(this.f38422C, a6.f38422C) && j$.util.Objects.equals(this.f25012D, a6.f25012D) && this.f25013E.equals(a6.f25013E)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2, com.google.android.gms.internal.ads.InterfaceC3274bb
    public final void g(com.google.android.gms.internal.ads.S8 s10) {
        switch (this.f38422C) {
            case "TT2":
            case "TIT2":
                s10.J((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TP1":
            case "TPE1":
                s10.x((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TP2":
            case "TPE2":
                s10.v((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TAL":
            case "TALB":
                s10.w((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TRK":
            case "TRCK":
                java.lang.String str = (java.lang.String) this.f25013E.get(0);
                int i6 = com.google.android.gms.internal.ads.EW.f27061a;
                java.lang.String[] strArrSplit = str.split("/", -1);
                try {
                    int i10 = java.lang.Integer.parseInt(strArrSplit[0]);
                    java.lang.Integer numValueOf = strArrSplit.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])) : null;
                    s10.L(java.lang.Integer.valueOf(i10));
                    s10.K(numValueOf);
                    break;
                } catch (java.lang.NumberFormatException unused) {
                    return;
                }
                break;
            case "TYE":
            case "TYER":
                try {
                    s10.E(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) this.f25013E.get(0))));
                    break;
                } catch (java.lang.NumberFormatException unused2) {
                    return;
                }
                break;
            case "TDA":
            case "TDAT":
                try {
                    java.lang.String str2 = (java.lang.String) this.f25013E.get(0);
                    int i11 = java.lang.Integer.parseInt(str2.substring(2, 4));
                    int i12 = java.lang.Integer.parseInt(str2.substring(0, 2));
                    s10.D(java.lang.Integer.valueOf(i11));
                    s10.C(java.lang.Integer.valueOf(i12));
                    break;
                } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case "TDRC":
                java.util.List listA = a((java.lang.String) this.f25013E.get(0));
                int size = listA.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            s10.C((java.lang.Integer) listA.get(2));
                        }
                    }
                    s10.D((java.lang.Integer) listA.get(1));
                }
                s10.E((java.lang.Integer) listA.get(0));
                break;
            case "TDRL":
                java.util.List listA2 = a((java.lang.String) this.f25013E.get(0));
                int size2 = listA2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            s10.F((java.lang.Integer) listA2.get(2));
                        }
                    }
                    s10.G((java.lang.Integer) listA2.get(1));
                }
                s10.H((java.lang.Integer) listA2.get(0));
                break;
            case "TCM":
            case "TCOM":
                s10.y((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TP3":
            case "TPE3":
                s10.z((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TXT":
            case "TEXT":
                s10.M((java.lang.CharSequence) this.f25013E.get(0));
                break;
            case "TCON":
                java.lang.Integer numF = com.google.android.gms.internal.ads.AbstractC2466Ij0.f((java.lang.String) this.f25013E.get(0), 10);
                if (numF == null) {
                    s10.B((java.lang.CharSequence) this.f25013E.get(0));
                    break;
                } else {
                    java.lang.String strA = com.google.android.gms.internal.ads.AbstractC5084s2.a(numF.intValue());
                    if (strA != null) {
                        s10.B(strA);
                    }
                    break;
                }
                break;
        }
    }

    public final int hashCode() {
        int iHashCode = this.f38422C.hashCode() + 527;
        java.lang.String str = this.f25012D;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f25013E.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4974r2
    public final java.lang.String toString() {
        return this.f38422C + ": description=" + this.f25012D + ": values=" + java.lang.String.valueOf(this.f25013E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f38422C);
        parcel.writeString(this.f25012D);
        parcel.writeStringArray((java.lang.String[]) this.f25013E.toArray(new java.lang.String[0]));
    }
}
