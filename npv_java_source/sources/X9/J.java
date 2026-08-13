package X9;

/* JADX INFO: loaded from: classes2.dex */
public class J extends X9.C1850s {
    private final java.lang.Long p(java.nio.file.attribute.FileTime fileTime) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // X9.C1850s, X9.AbstractC1843k
    public void a(X9.Q q6, X9.Q q10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "source");
        p247y7.AbstractC7350t.f(q10, "target");
        try {
            java.nio.file.Files.move(q6.y(), q10.y(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e6) {
            throw new java.io.FileNotFoundException(e6.getMessage());
        }
    }

    @Override // X9.C1850s, X9.AbstractC1843k
    public X9.C1842j h(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "path");
        return o(q6.y());
    }

    protected final X9.C1842j o(java.nio.file.Path path) {
        p247y7.AbstractC7350t.f(path, "nioPath");
        try {
            java.nio.file.attribute.BasicFileAttributes attributes = java.nio.file.Files.readAttributes(path, (java.lang.Class<java.nio.file.attribute.BasicFileAttributes>) X9.AbstractC1851t.a(), java.nio.file.LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? java.nio.file.Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            X9.Q qF = symbolicLink != null ? X9.Q.a.f(X9.Q.f16083D, symbolicLink, false, 1, null) : null;
            java.lang.Long lValueOf = java.lang.Long.valueOf(attributes.size());
            java.nio.file.attribute.FileTime fileTimeCreationTime = attributes.creationTime();
            java.lang.Long lP = fileTimeCreationTime != null ? p(fileTimeCreationTime) : null;
            java.nio.file.attribute.FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            java.lang.Long lP2 = fileTimeLastModifiedTime != null ? p(fileTimeLastModifiedTime) : null;
            java.nio.file.attribute.FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new X9.C1842j(zIsRegularFile, zIsDirectory, qF, lValueOf, lP, lP2, fileTimeLastAccessTime != null ? p(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (java.nio.file.NoSuchFileException | java.nio.file.FileSystemException unused) {
            return null;
        }
    }

    @Override // X9.C1850s
    public java.lang.String toString() {
        return "NioSystemFileSystem";
    }
}
