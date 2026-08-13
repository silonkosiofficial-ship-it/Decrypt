package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2656No extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2656No> CREATOR = new com.google.android.gms.internal.ads.C2693Oo();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    android.os.ParcelFileDescriptor f30376C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.os.Parcelable f30377D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f30378E = true;

    public C2656No(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f30376C = parcelFileDescriptor;
    }

    public final R3.d e(android.os.Parcelable.Creator creator) {
        if (this.f30378E) {
            if (this.f30376C == null) {
                p224w3.p.d("File descriptor is empty, returning null.");
                return null;
            }
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.f30376C));
            try {
                try {
                    int i6 = dataInputStream.readInt();
                    byte[] bArr = new byte[i6];
                    dataInputStream.readFully(bArr, 0, i6);
                    V3.l.a(dataInputStream);
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i6);
                        parcelObtain.setDataPosition(0);
                        this.f30377D = (android.os.Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f30378E = false;
                    } catch (java.lang.Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (java.io.IOException e6) {
                    p224w3.p.e("Could not read from parcel file descriptor", e6);
                    V3.l.a(dataInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                V3.l.a(dataInputStream);
                throw th2;
            }
        }
        return (R3.d) this.f30377D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        final android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f30376C == null) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            try {
                this.f30377D.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                android.os.ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Mo
                            @Override // java.lang.Runnable
                            public final void run() throws java.lang.Throwable {
                                android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2656No> creator = com.google.android.gms.internal.ads.C2656No.CREATOR;
                                java.io.OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                java.io.DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            V3.l.a(dataOutputStream2);
                                        } catch (java.io.IOException e6) {
                                            e = e6;
                                            dataOutputStream = dataOutputStream2;
                                            p224w3.p.e("Error transporting the ad response", e);
                                            p174r3.v.s().x(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                V3.l.a(outputStream);
                                            } else {
                                                V3.l.a(dataOutputStream);
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                V3.l.a(outputStream);
                                            } else {
                                                V3.l.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (java.io.IOException e10) {
                                        e = e10;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (java.io.IOException e6) {
                        e = e6;
                        p224w3.p.e("Error transporting the ad response", e);
                        p174r3.v.s().x(e, "LargeParcelTeleporter.pipeData.2");
                        V3.l.a(autoCloseOutputStream);
                    }
                } catch (java.io.IOException e10) {
                    e = e10;
                    autoCloseOutputStream = null;
                }
                this.f30376C = parcelFileDescriptor;
            } catch (java.lang.Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iA = R3.c.a(parcel);
        R3.c.p(parcel, 2, this.f30376C, i6, false);
        R3.c.b(parcel, iA);
    }
}
