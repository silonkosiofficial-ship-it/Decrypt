.class public final LX9/c0;
.super LX9/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/c0$a;
    }
.end annotation


# static fields
.field private static final i:LX9/c0$a;

.field private static final j:LX9/Q;


# instance fields
.field private final e:LX9/Q;

.field private final f:LX9/k;

.field private final g:Ljava/util/Map;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LX9/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX9/c0$a;-><init>(Ly7/k;)V

    sput-object v0, LX9/c0;->i:LX9/c0$a;

    sget-object v0, LX9/Q;->D:LX9/Q$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "/"

    invoke-static {v0, v4, v2, v3, v1}, LX9/Q$a;->e(LX9/Q$a;Ljava/lang/String;ZILjava/lang/Object;)LX9/Q;

    move-result-object v0

    sput-object v0, LX9/c0;->j:LX9/Q;

    return-void
.end method

.method public constructor <init>(LX9/Q;LX9/k;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1

    const-string v0, "zipPath"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileSystem"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entries"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LX9/k;-><init>()V

    iput-object p1, p0, LX9/c0;->e:LX9/Q;

    iput-object p2, p0, LX9/c0;->f:LX9/k;

    iput-object p3, p0, LX9/c0;->g:Ljava/util/Map;

    iput-object p4, p0, LX9/c0;->h:Ljava/lang/String;

    return-void
.end method

.method private final m(LX9/Q;)LX9/Q;
    .locals 2

    sget-object v0, LX9/c0;->j:LX9/Q;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, LX9/Q;->u(LX9/Q;Z)LX9/Q;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(LX9/Q;LX9/Q;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip file systems are read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(LX9/Q;Z)V
    .locals 0

    const-string p2, "dir"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip file systems are read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(LX9/Q;Z)V
    .locals 0

    const-string p2, "path"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip file systems are read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(LX9/Q;)LX9/j;
    .locals 13

    .prologue
    const-string v0, "path"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LX9/c0;->m(LX9/Q;)LX9/Q;

    move-result-object p1

    iget-object v0, p0, LX9/c0;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY9/i;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LY9/i;->i()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_7

    iget-object v1, p0, LX9/c0;->f:LX9/k;

    iget-object v2, p0, LX9/c0;->e:LX9/Q;

    invoke-virtual {v1, v2}, LX9/k;->i(LX9/Q;)LX9/i;

    move-result-object v1

    :try_start_0
    invoke-virtual {p1}, LY9/i;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LX9/i;->o0(J)LX9/Z;

    move-result-object v2

    invoke-static {v2}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-static {v2, p1}, LY9/j;->j(LX9/f;LY9/i;)LY9/i;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_1

    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_1
    :goto_0
    move-object v2, v0

    goto :goto_2

    :catchall_1
    move-exception p1

    if-eqz v2, :cond_2

    :try_start_3
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {p1, v2}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    goto :goto_4

    :cond_2
    :goto_1
    move-object v2, p1

    move-object p1, v0

    :goto_2
    if-nez v2, :cond_4

    if-eqz v1, :cond_3

    :try_start_5
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v1

    goto :goto_6

    :cond_3
    :goto_3
    move-object v1, v0

    goto :goto_6

    :cond_4
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_4
    if-eqz v1, :cond_5

    :try_start_7
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v1

    invoke-static {p1, v1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_5
    :goto_5
    move-object v1, p1

    move-object p1, v0

    :goto_6
    if-nez v1, :cond_6

    goto :goto_7

    :cond_6
    throw v1

    :cond_7
    :goto_7
    new-instance v12, LX9/j;

    invoke-virtual {p1}, LY9/i;->k()Z

    move-result v1

    xor-int/lit8 v2, v1, 0x1

    invoke-virtual {p1}, LY9/i;->k()Z

    move-result v3

    invoke-virtual {p1}, LY9/i;->k()Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_8
    move-object v5, v0

    goto :goto_9

    :cond_8
    invoke-virtual {p1}, LY9/i;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_8

    :goto_9
    invoke-virtual {p1}, LY9/i;->f()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1}, LY9/i;->h()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {p1}, LY9/i;->g()Ljava/lang/Long;

    move-result-object v8

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, LX9/j;-><init>(ZZLX9/Q;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILy7/k;)V

    return-object v12
.end method

.method public i(LX9/Q;)LX9/i;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "not implemented yet!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(LX9/Q;ZZ)LX9/i;
    .locals 0

    const-string p2, "file"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip entries are not writable"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l(LX9/Q;)LX9/Z;
    .locals 7

    .prologue
    const-string v0, "file"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LX9/c0;->m(LX9/Q;)LX9/Q;

    move-result-object v0

    iget-object v1, p0, LX9/c0;->g:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY9/i;

    if-eqz v0, :cond_4

    iget-object p1, p0, LX9/c0;->f:LX9/k;

    iget-object v1, p0, LX9/c0;->e:LX9/Q;

    invoke-virtual {p1, v1}, LX9/k;->i(LX9/Q;)LX9/i;

    move-result-object p1

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, LY9/i;->i()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, LX9/i;->o0(J)LX9/Z;

    move-result-object v2

    invoke-static {v2}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :cond_0
    :goto_0
    move-object v6, v2

    move-object v2, v1

    move-object v1, v6

    goto :goto_1

    :catchall_1
    move-exception v2

    if-eqz p1, :cond_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-static {v2, p1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    if-nez v2, :cond_3

    invoke-static {v1}, LY9/j;->m(LX9/f;)V

    invoke-virtual {v0}, LY9/i;->e()I

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_2

    new-instance p1, LY9/g;

    invoke-virtual {v0}, LY9/i;->j()J

    move-result-wide v3

    invoke-direct {p1, v1, v3, v4, v2}, LY9/g;-><init>(LX9/Z;JZ)V

    goto :goto_2

    :cond_2
    new-instance p1, LX9/p;

    new-instance v3, LY9/g;

    invoke-virtual {v0}, LY9/i;->d()J

    move-result-wide v4

    invoke-direct {v3, v1, v4, v5, v2}, LY9/g;-><init>(LX9/Z;JZ)V

    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1, v2}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-direct {p1, v3, v1}, LX9/p;-><init>(LX9/Z;Ljava/util/zip/Inflater;)V

    new-instance v1, LY9/g;

    invoke-virtual {v0}, LY9/i;->j()J

    move-result-wide v2

    const/4 v0, 0x0

    invoke-direct {v1, p1, v2, v3, v0}, LY9/g;-><init>(LX9/Z;JZ)V

    move-object p1, v1

    :goto_2
    return-object p1

    :cond_3
    throw v2

    :cond_4
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no such file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
