package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J6 {
    public static java.security.cert.X509Certificate[][] a(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
        try {
            android.util.Pair pairC = com.google.android.gms.internal.ads.K6.c(randomAccessFile);
            if (pairC == null) {
                throw new com.google.android.gms.internal.ads.F6("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) pairC.first;
            long jLongValue = ((java.lang.Long) pairC.second).longValue();
            long j6 = (-20) + jLongValue;
            if (j6 >= 0) {
                randomAccessFile.seek(j6);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new com.google.android.gms.internal.ads.F6("ZIP64 APK not supported");
                }
            }
            long jA = com.google.android.gms.internal.ads.K6.a(byteBuffer);
            if (jA >= jLongValue) {
                throw new com.google.android.gms.internal.ads.F6("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (com.google.android.gms.internal.ads.K6.b(byteBuffer) + jA != jLongValue) {
                throw new com.google.android.gms.internal.ads.F6("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new com.google.android.gms.internal.ads.F6("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(24);
            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new com.google.android.gms.internal.ads.F6("No APK Signing Block before ZIP Central Directory");
            }
            int i6 = 0;
            long j10 = byteBufferAllocate.getLong(0);
            if (j10 < byteBufferAllocate.capacity() || j10 > 2147483639) {
                throw new com.google.android.gms.internal.ads.F6("APK Signing Block size out of range: " + j10);
            }
            int i10 = (int) (8 + j10);
            long j11 = jA - ((long) i10);
            if (j11 < 0) {
                throw new com.google.android.gms.internal.ads.F6("APK Signing Block offset out of range: " + j11);
            }
            java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(i10);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j11);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j12 = byteBufferAllocate2.getLong(0);
            if (j12 != j10) {
                throw new com.google.android.gms.internal.ads.F6("APK Signing Block sizes in header and footer do not match: " + j12 + " vs " + j10);
            }
            android.util.Pair pairCreate = android.util.Pair.create(byteBufferAllocate2, java.lang.Long.valueOf(j11));
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) pairCreate.first;
            long jLongValue2 = ((java.lang.Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new java.lang.IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new java.lang.IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                java.nio.ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                while (byteBufferSlice.hasRemaining()) {
                    i6++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new com.google.android.gms.internal.ads.F6("Insufficient data to read size of APK Signing Block entry #" + i6);
                    }
                    long j13 = byteBufferSlice.getLong();
                    if (j13 < 4 || j13 > 2147483647L) {
                        throw new com.google.android.gms.internal.ads.F6("APK Signing Block entry #" + i6 + " size out of range: " + j13);
                    }
                    int i11 = (int) j13;
                    int iPosition2 = byteBufferSlice.position() + i11;
                    if (i11 > byteBufferSlice.remaining()) {
                        throw new com.google.android.gms.internal.ads.F6("APK Signing Block entry #" + i6 + " size out of range: " + i11 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        java.security.cert.X509Certificate[][] x509CertificateArrL = l(randomAccessFile.getChannel(), new com.google.android.gms.internal.ads.E6(e(byteBufferSlice, i11 - 4), jLongValue2, jA, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (java.io.IOException unused) {
                        }
                        return x509CertificateArrL;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new com.google.android.gms.internal.ads.F6("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (java.lang.Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused2) {
            }
            throw th2;
        }
    }

    private static int b(int i6) {
        if (i6 == 1) {
            return 32;
        }
        if (i6 == 2) {
            return 64;
        }
        throw new java.lang.IllegalArgumentException("Unknown content digest algorthm: " + i6);
    }

    private static int c(int i6) {
        if (i6 == 513) {
            return 1;
        }
        if (i6 == 514) {
            return 2;
        }
        if (i6 == 769) {
            return 1;
        }
        switch (i6) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i6))));
        }
    }

    private static java.lang.String d(int i6) {
        if (i6 == 1) {
            return "SHA-256";
        }
        if (i6 == 2) {
            return "SHA-512";
        }
        throw new java.lang.IllegalArgumentException("Unknown content digest algorthm: " + i6);
    }

    private static java.nio.ByteBuffer e(java.nio.ByteBuffer byteBuffer, int i6) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i10 = i6 + iPosition;
        if (i10 < iPosition || i10 > iLimit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i10);
        try {
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i10);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static java.nio.ByteBuffer f(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer.remaining() < 4) {
            throw new java.io.IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i6 = byteBuffer.getInt();
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        if (i6 <= byteBuffer.remaining()) {
            return e(byteBuffer, i6);
        }
        throw new java.io.IOException("Length-prefixed field longer than remaining buffer. Field length: " + i6 + ", remaining: " + byteBuffer.remaining());
    }

    private static void g(int i6, byte[] bArr, int i10) {
        bArr[1] = (byte) (i6 & 255);
        bArr[2] = (byte) ((i6 >>> 8) & 255);
        bArr[3] = (byte) ((i6 >>> 16) & 255);
        bArr[4] = (byte) (i6 >> 24);
    }

    private static void h(java.util.Map map, java.nio.channels.FileChannel fileChannel, long j6, long j10, long j11, java.nio.ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new java.lang.SecurityException("No digests provided");
        }
        com.google.android.gms.internal.ads.D6 d6 = new com.google.android.gms.internal.ads.D6(fileChannel, 0L, j6);
        com.google.android.gms.internal.ads.D6 d10 = new com.google.android.gms.internal.ads.D6(fileChannel, j10, j11 - j10);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        com.google.android.gms.internal.ads.K6.d(byteBufferDuplicate, j6);
        com.google.android.gms.internal.ads.B6 b6 = new com.google.android.gms.internal.ads.B6(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator it = map.keySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            iArr[i6] = ((java.lang.Integer) it.next()).intValue();
            i6++;
        }
        try {
            byte[][] bArrK = k(iArr, new com.google.android.gms.internal.ads.C6[]{d6, d10, b6});
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = iArr[i10];
                if (!java.security.MessageDigest.isEqual((byte[]) map.get(java.lang.Integer.valueOf(i11)), bArrK[i10])) {
                    throw new java.lang.SecurityException(d(i11).concat(" digest of contents did not verify"));
                }
            }
        } catch (java.security.DigestException e6) {
            throw new java.lang.SecurityException("Failed to compute digest(s) of contents", e6);
        }
    }

    private static byte[] i(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i6 = byteBuffer.getInt();
        if (i6 < 0) {
            throw new java.io.IOException("Negative length");
        }
        if (i6 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i6];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new java.io.IOException("Underflow while reading length-prefixed value. Length: " + i6 + ", available: " + byteBuffer.remaining());
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0216  */
    /* JADX WARN: Code duplicated, block: B:115:0x022b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0238  */
    /* JADX WARN: Code duplicated, block: B:119:0x0240  */
    /* JADX WARN: Code duplicated, block: B:121:0x0248  */
    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:151:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x012f A[Catch: SignatureException -> 0x0133, InvalidAlgorithmParameterException -> 0x0136, InvalidKeyException -> 0x0139, InvalidKeySpecException -> 0x013c, NoSuchAlgorithmException -> 0x013f, TryCatch #5 {InvalidAlgorithmParameterException -> 0x0136, InvalidKeyException -> 0x0139, NoSuchAlgorithmException -> 0x013f, SignatureException -> 0x0133, InvalidKeySpecException -> 0x013c, blocks: (B:61:0x0119, B:63:0x012f, B:74:0x0142), top: B:133:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0169 A[Catch: BufferUnderflowException -> 0x017b, IOException -> 0x017d, TryCatch #8 {IOException -> 0x017d, BufferUnderflowException -> 0x017b, blocks: (B:80:0x015f, B:82:0x0169, B:84:0x0176, B:89:0x017f, B:90:0x0186), top: B:131:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6  */
    private static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.security.cert.CertificateFactory certificateFactory) throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        android.util.Pair pairCreate;
        java.lang.String str3;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec;
        java.security.Signature signature;
        java.nio.ByteBuffer byteBufferF;
        java.util.ArrayList arrayList;
        int i6;
        byte[] bArr;
        java.nio.ByteBuffer byteBufferF2;
        java.util.ArrayList arrayList2;
        int i10;
        java.nio.ByteBuffer byteBufferF3;
        int i11;
        java.security.spec.PSSParameterSpec pSSParameterSpec;
        java.lang.String str4;
        java.nio.ByteBuffer byteBufferF4 = f(byteBuffer);
        java.nio.ByteBuffer byteBufferF5 = f(byteBuffer);
        byte[] bArrI = i(byteBuffer);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        byte[] bArrI2 = null;
        byte[] bArrI3 = null;
        int i12 = -1;
        int i13 = 0;
        while (byteBufferF5.hasRemaining()) {
            i13++;
            try {
                java.nio.ByteBuffer byteBufferF6 = f(byteBufferF5);
                if (byteBufferF6.remaining() < 8) {
                    throw new java.lang.SecurityException("Signature record too short");
                }
                int i14 = byteBufferF6.getInt();
                arrayList3.add(java.lang.Integer.valueOf(i14));
                if (i14 != 513 && i14 != 514 && i14 != 769) {
                    switch (i14) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i12 != -1) {
                    int iC = c(i14);
                    int iC2 = c(i12);
                    if (iC != 1 && iC2 == 1) {
                    }
                }
                bArrI3 = i(byteBufferF6);
                i12 = i14;
            } catch (java.io.IOException e6) {
                e = e6;
                throw new java.lang.SecurityException("Failed to parse signature record #" + i13, e);
            } catch (java.nio.BufferUnderflowException e10) {
                e = e10;
                throw new java.lang.SecurityException("Failed to parse signature record #" + i13, e);
            }
        }
        if (i12 == -1) {
            if (i13 == 0) {
                throw new java.lang.SecurityException("No signatures found");
            }
            throw new java.lang.SecurityException("No supported signatures found");
        }
        if (i12 == 513 || i12 == 514) {
            str = "EC";
        } else if (i12 != 769) {
            switch (i12) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i12))));
            }
        } else {
            str = "DSA";
        }
        try {
            if (i12 == 513) {
                str2 = "SHA256withECDSA";
            } else if (i12 == 514) {
                str2 = "SHA512withECDSA";
            } else if (i12 != 769) {
                switch (i12) {
                    case 257:
                        pSSParameterSpec = new java.security.spec.PSSParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, 32, 1);
                        str4 = "SHA256withRSA/PSS";
                        pairCreate = android.util.Pair.create(str4, pSSParameterSpec);
                        str3 = (java.lang.String) pairCreate.first;
                        algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) pairCreate.second;
                        java.security.PublicKey publicKeyGeneratePublic = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(bArrI));
                        signature = java.security.Signature.getInstance(str3);
                        signature.initVerify(publicKeyGeneratePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(byteBufferF4);
                        if (!signature.verify(bArrI3)) {
                            throw new java.lang.SecurityException(java.lang.String.valueOf(str3).concat(" signature did not verify"));
                        }
                        byteBufferF4.clear();
                        byteBufferF = f(byteBufferF4);
                        arrayList = new java.util.ArrayList();
                        i6 = 0;
                        while (byteBufferF.hasRemaining()) {
                            i6++;
                            try {
                                byteBufferF3 = f(byteBufferF);
                                if (byteBufferF3.remaining() < 8) {
                                    throw new java.io.IOException("Record too short");
                                }
                                i11 = byteBufferF3.getInt();
                                arrayList.add(java.lang.Integer.valueOf(i11));
                                if (i11 == i12) {
                                    bArrI2 = i(byteBufferF3);
                                }
                            } catch (java.io.IOException e11) {
                                e = e11;
                                throw new java.io.IOException("Failed to parse digest record #" + i6, e);
                            } catch (java.nio.BufferUnderflowException e12) {
                                e = e12;
                                throw new java.io.IOException("Failed to parse digest record #" + i6, e);
                            }
                        }
                        if (!arrayList3.equals(arrayList)) {
                            throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int iC3 = c(i12);
                        bArr = (byte[]) map.put(java.lang.Integer.valueOf(iC3), bArrI2);
                        if (bArr == null && !java.security.MessageDigest.isEqual(bArr, bArrI2)) {
                            throw new java.lang.SecurityException(d(iC3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                        byteBufferF2 = f(byteBufferF4);
                        arrayList2 = new java.util.ArrayList();
                        i10 = 0;
                        while (byteBufferF2.hasRemaining()) {
                            i10++;
                            byte[] bArrI4 = i(byteBufferF2);
                            try {
                                arrayList2.add(new com.google.android.gms.internal.ads.G6((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrI4)), bArrI4));
                            } catch (java.security.cert.CertificateException e13) {
                                throw new java.lang.SecurityException("Failed to decode certificate #" + i10, e13);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            throw new java.lang.SecurityException("No certificates listed");
                        }
                        if (java.util.Arrays.equals(bArrI, ((java.security.cert.X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                            return (java.security.cert.X509Certificate[]) arrayList2.toArray(new java.security.cert.X509Certificate[arrayList2.size()]);
                        }
                        throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
                    case 258:
                        pSSParameterSpec = new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, 64, 1);
                        str4 = "SHA512withRSA/PSS";
                        pairCreate = android.util.Pair.create(str4, pSSParameterSpec);
                        str3 = (java.lang.String) pairCreate.first;
                        algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) pairCreate.second;
                        java.security.PublicKey publicKeyGeneratePublic2 = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(bArrI));
                        signature = java.security.Signature.getInstance(str3);
                        signature.initVerify(publicKeyGeneratePublic2);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(byteBufferF4);
                        if (!signature.verify(bArrI3)) {
                            throw new java.lang.SecurityException(java.lang.String.valueOf(str3).concat(" signature did not verify"));
                        }
                        byteBufferF4.clear();
                        byteBufferF = f(byteBufferF4);
                        arrayList = new java.util.ArrayList();
                        i6 = 0;
                        while (byteBufferF.hasRemaining()) {
                            i6++;
                            byteBufferF3 = f(byteBufferF);
                            if (byteBufferF3.remaining() < 8) {
                                throw new java.io.IOException("Record too short");
                            }
                            i11 = byteBufferF3.getInt();
                            arrayList.add(java.lang.Integer.valueOf(i11));
                            if (i11 == i12) {
                                bArrI2 = i(byteBufferF3);
                            }
                        }
                        if (!arrayList3.equals(arrayList)) {
                            throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int iC4 = c(i12);
                        bArr = (byte[]) map.put(java.lang.Integer.valueOf(iC4), bArrI2);
                        if (bArr == null) {
                            break;
                        }
                        byteBufferF2 = f(byteBufferF4);
                        arrayList2 = new java.util.ArrayList();
                        i10 = 0;
                        while (byteBufferF2.hasRemaining()) {
                            i10++;
                            byte[] bArrI5 = i(byteBufferF2);
                            arrayList2.add(new com.google.android.gms.internal.ads.G6((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrI5)), bArrI5));
                        }
                        if (arrayList2.isEmpty()) {
                            throw new java.lang.SecurityException("No certificates listed");
                        }
                        if (java.util.Arrays.equals(bArrI, ((java.security.cert.X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                            return (java.security.cert.X509Certificate[]) arrayList2.toArray(new java.security.cert.X509Certificate[arrayList2.size()]);
                        }
                        throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
                    case 259:
                        str2 = "SHA256withRSA";
                        break;
                    case 260:
                        str2 = "SHA512withRSA";
                        break;
                    default:
                        throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i12))));
                }
            } else {
                str2 = "SHA256withDSA";
            }
            java.security.PublicKey publicKeyGeneratePublic3 = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(bArrI));
            signature = java.security.Signature.getInstance(str3);
            signature.initVerify(publicKeyGeneratePublic3);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF4);
            if (!signature.verify(bArrI3)) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(str3).concat(" signature did not verify"));
            }
            byteBufferF4.clear();
            byteBufferF = f(byteBufferF4);
            arrayList = new java.util.ArrayList();
            i6 = 0;
            while (byteBufferF.hasRemaining()) {
                i6++;
                byteBufferF3 = f(byteBufferF);
                if (byteBufferF3.remaining() < 8) {
                    throw new java.io.IOException("Record too short");
                }
                i11 = byteBufferF3.getInt();
                arrayList.add(java.lang.Integer.valueOf(i11));
                if (i11 == i12) {
                    bArrI2 = i(byteBufferF3);
                }
            }
            if (!arrayList3.equals(arrayList)) {
                throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iC5 = c(i12);
            bArr = (byte[]) map.put(java.lang.Integer.valueOf(iC5), bArrI2);
            if (bArr == null) {
            }
            byteBufferF2 = f(byteBufferF4);
            arrayList2 = new java.util.ArrayList();
            i10 = 0;
            while (byteBufferF2.hasRemaining()) {
                i10++;
                byte[] bArrI6 = i(byteBufferF2);
                arrayList2.add(new com.google.android.gms.internal.ads.G6((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrI6)), bArrI6));
            }
            if (arrayList2.isEmpty()) {
                throw new java.lang.SecurityException("No certificates listed");
            }
            if (java.util.Arrays.equals(bArrI, ((java.security.cert.X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                return (java.security.cert.X509Certificate[]) arrayList2.toArray(new java.security.cert.X509Certificate[arrayList2.size()]);
            }
            throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
        } catch (java.security.InvalidAlgorithmParameterException e14) {
            e = e14;
            throw new java.lang.SecurityException("Failed to verify " + str3 + " signature", e);
        } catch (java.security.InvalidKeyException e15) {
            e = e15;
            throw new java.lang.SecurityException("Failed to verify " + str3 + " signature", e);
        } catch (java.security.NoSuchAlgorithmException e16) {
            e = e16;
            throw new java.lang.SecurityException("Failed to verify " + str3 + " signature", e);
        } catch (java.security.SignatureException e17) {
            e = e17;
            throw new java.lang.SecurityException("Failed to verify " + str3 + " signature", e);
        } catch (java.security.spec.InvalidKeySpecException e18) {
            e = e18;
            throw new java.lang.SecurityException("Failed to verify " + str3 + " signature", e);
        }
        pairCreate = android.util.Pair.create(str2, null);
        str3 = (java.lang.String) pairCreate.first;
        algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) pairCreate.second;
    }

    private static byte[][] k(int[] iArr, com.google.android.gms.internal.ads.C6[] c6Arr) throws java.security.DigestException {
        long j6;
        int i6;
        int length;
        int i10 = 0;
        long j10 = 0;
        int i11 = 0;
        long jA = 0;
        while (true) {
            j6 = 1048576;
            if (i11 >= 3) {
                break;
            }
            jA += (c6Arr[i11].a() + 1048575) / 1048576;
            i11++;
        }
        if (jA >= 2097151) {
            throw new java.security.DigestException("Too many chunks: " + jA);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jA;
            byte[] bArr2 = new byte[(b(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            g(i13, bArr2, 1);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        java.security.MessageDigest[] messageDigestArr = new java.security.MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            java.lang.String strD = d(iArr[i14]);
            try {
                messageDigestArr[i14] = java.security.MessageDigest.getInstance(strD);
            } catch (java.security.NoSuchAlgorithmException e6) {
                throw new java.lang.RuntimeException(strD.concat(" digest not supported"), e6);
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (i6 = 3; i15 < i6; i6 = 3) {
            com.google.android.gms.internal.ads.C6 c6 = c6Arr[i15];
            long j11 = j10;
            long jA2 = c6.a();
            while (jA2 > j10) {
                int iMin = (int) java.lang.Math.min(jA2, j6);
                g(iMin, bArr3, 1);
                for (int i17 = 0; i17 < length; i17++) {
                    messageDigestArr[i17].update(bArr3);
                }
                long j12 = j11;
                try {
                    c6.b(messageDigestArr, j12, iMin);
                    byte[] bArr4 = bArr3;
                    int i18 = 0;
                    while (i18 < iArr.length) {
                        int i19 = iArr[i18];
                        com.google.android.gms.internal.ads.C6 c10 = c6;
                        byte[] bArr5 = bArr[i18];
                        int iB = b(i19);
                        int i20 = length;
                        java.security.MessageDigest messageDigest = messageDigestArr[i18];
                        java.security.MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i16 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new java.lang.RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i18++;
                        c6 = c10;
                        length = i20;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j13 = iMin;
                    long j14 = j12 + j13;
                    jA2 -= j13;
                    i16++;
                    j10 = 0;
                    j6 = 1048576;
                    bArr3 = bArr4;
                    j11 = j14;
                    messageDigestArr = messageDigestArr;
                } catch (java.io.IOException e10) {
                    throw new java.security.DigestException("Failed to digest chunk #" + i16 + " of section #" + i10, e10);
                }
            }
            i10++;
            i15++;
            j10 = 0;
            j6 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            byte[] bArr7 = bArr[i21];
            java.lang.String strD2 = d(i22);
            try {
                bArr6[i21] = java.security.MessageDigest.getInstance(strD2).digest(bArr7);
            } catch (java.security.NoSuchAlgorithmException e11) {
                throw new java.lang.RuntimeException(strD2.concat(" digest not supported"), e11);
            }
        }
        return bArr6;
    }

    private static java.security.cert.X509Certificate[][] l(java.nio.channels.FileChannel fileChannel, com.google.android.gms.internal.ads.E6 e6) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            try {
                java.nio.ByteBuffer byteBufferF = f(e6.f26897a);
                int i6 = 0;
                while (byteBufferF.hasRemaining()) {
                    i6++;
                    try {
                        arrayList.add(j(f(byteBufferF), map, certificateFactory));
                    } catch (java.io.IOException | java.lang.SecurityException | java.nio.BufferUnderflowException e10) {
                        throw new java.lang.SecurityException("Failed to parse/verify signer #" + i6 + " block", e10);
                    }
                }
                if (i6 <= 0) {
                    throw new java.lang.SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new java.lang.SecurityException("No content digests found");
                }
                h(map, fileChannel, e6.f26898b, e6.f26899c, e6.f26900d, e6.f26901e);
                return (java.security.cert.X509Certificate[][]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()][]);
            } catch (java.io.IOException e11) {
                throw new java.lang.SecurityException("Failed to read list of signers", e11);
            }
        } catch (java.security.cert.CertificateException e12) {
            throw new java.lang.RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
