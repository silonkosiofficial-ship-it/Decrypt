.class public abstract Lw2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly2/b;)J
    .locals 2

    .prologue
    const-string v0, "connection"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lw2/i;->b(Ly2/b;)I

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    const-string v0, "SELECT last_insert_rowid()"

    invoke-interface {p0, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ly2/e;->p()Z

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ly2/e;->getLong(I)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ly2/e;->close()V

    return-wide v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ly2/e;->close()V

    throw v0
.end method

.method public static final b(Ly2/b;)I
    .locals 2

    .prologue
    const-string v0, "connection"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT changes()"

    invoke-interface {p0, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ly2/e;->p()Z

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ly2/e;->getLong(I)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v0, v0

    invoke-interface {p0}, Ly2/e;->close()V

    return v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ly2/e;->close()V

    throw v0
.end method
