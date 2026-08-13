.class public abstract Lo2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Ly2/e;Ljava/lang/Object;)V
.end method

.method protected abstract b()Ljava/lang/String;
.end method

.method public final c(Ly2/b;Ljava/lang/Iterable;)V
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lo2/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p1

    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, v0}, Lo2/f;->a(Ly2/e;Ljava/lang/Object;)V

    invoke-interface {p1}, Ly2/e;->p()Z

    invoke-interface {p1}, Ly2/e;->a()V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_2
    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ly2/e;->close()V

    return-void

    :goto_1
    invoke-interface {p1}, Ly2/e;->close()V

    throw p2
.end method

.method public final d(Ly2/b;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lo2/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lo2/f;->a(Ly2/e;Ljava/lang/Object;)V

    invoke-interface {p1}, Ly2/e;->p()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ly2/e;->close()V

    return-void

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Ly2/e;->close()V

    throw p2
.end method

.method public final e(Ly2/b;Ljava/lang/Object;)J
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    invoke-virtual {p0}, Lo2/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p2}, Lo2/f;->a(Ly2/e;Ljava/lang/Object;)V

    invoke-interface {v0}, Ly2/e;->p()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ly2/e;->close()V

    invoke-static {p1}, Lw2/i;->a(Ly2/b;)J

    move-result-wide p1

    return-wide p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ly2/e;->close()V

    throw p1
.end method
