.class public LX9/J;
.super LX9/s;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX9/s;-><init>()V

    return-void
.end method

.method private final p(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;
    .locals 4

    .prologue
    invoke-static {p1}, LX9/z;->a(Ljava/nio/file/attribute/FileTime;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(LX9/Q;LX9/Q;)V
    .locals 3

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, LX9/Q;->y()Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {p2}, LX9/Q;->y()Ljava/nio/file/Path;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/nio/file/CopyOption;

    invoke-static {}, LX9/v;->a()Ljava/nio/file/StandardCopyOption;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {}, LX9/w;->a()Ljava/nio/file/StandardCopyOption;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1, p2, v0}, LX9/x;->a(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "atomic move not supported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-static {p1}, LX9/y;->a(Ljava/nio/file/NoSuchFileException;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public h(LX9/Q;)LX9/j;
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LX9/Q;->y()Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {p0, p1}, LX9/J;->o(Ljava/nio/file/Path;)LX9/j;

    move-result-object p1

    return-object p1
.end method

.method protected final o(Ljava/nio/file/Path;)LX9/j;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "nioPath"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    invoke-static {}, LX9/t;->a()Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/nio/file/LinkOption;

    invoke-static {}, LX9/B;->a()Ljava/nio/file/LinkOption;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {v1, v3, v5}, LX9/C;->a(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object v3
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/file/FileSystemException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v3}, LX9/D;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static/range {p1 .. p1}, LX9/E;->a(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    new-instance v5, LX9/j;

    invoke-static {v3}, LX9/F;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Z

    move-result v9

    invoke-static {v3}, LX9/G;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Z

    move-result v10

    if-eqz v1, :cond_1

    sget-object v6, LX9/Q;->D:LX9/Q$a;

    invoke-static {v6, v1, v7, v4, v2}, LX9/Q$a;->f(LX9/Q$a;Ljava/nio/file/Path;ZILjava/lang/Object;)LX9/Q;

    move-result-object v1

    move-object v11, v1

    goto :goto_1

    :cond_1
    move-object v11, v2

    :goto_1
    invoke-static {v3}, LX9/H;->a(Ljava/nio/file/attribute/BasicFileAttributes;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v3}, LX9/I;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/attribute/FileTime;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {v0, v1}, LX9/J;->p(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;

    move-result-object v1

    move-object v13, v1

    goto :goto_2

    :cond_2
    move-object v13, v2

    :goto_2
    invoke-static {v3}, LX9/u;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/attribute/FileTime;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-direct {v0, v1}, LX9/J;->p(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;

    move-result-object v1

    move-object v14, v1

    goto :goto_3

    :cond_3
    move-object v14, v2

    :goto_3
    invoke-static {v3}, LX9/A;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/attribute/FileTime;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-direct {v0, v1}, LX9/J;->p(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;

    move-result-object v2

    :cond_4
    move-object v15, v2

    const/16 v17, 0x80

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object v8, v5

    invoke-direct/range {v8 .. v18}, LX9/j;-><init>(ZZLX9/Q;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILy7/k;)V

    return-object v5

    :catch_0
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NioSystemFileSystem"

    return-object v0
.end method
