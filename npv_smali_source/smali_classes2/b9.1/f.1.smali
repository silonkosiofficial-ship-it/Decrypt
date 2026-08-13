.class public abstract Lb9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm7/i;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    invoke-static {}, Lb9/e;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW8/K;

    :try_start_0
    invoke-interface {v1, p0, p1}, LW8/K;->z0(Lm7/i;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {p1, v1}, LW8/L;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Lb9/e;->b(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Lb9/g;

    invoke-direct {v0, p0}, Lb9/g;-><init>(Lm7/i;)V

    invoke-static {p1, v0}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    invoke-static {p1}, Lb9/e;->b(Ljava/lang/Throwable;)V

    return-void
.end method
