.class public abstract LW8/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm7/i;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    :try_start_0
    sget-object v0, LW8/K;->g:LW8/K$a;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LW8/K;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, LW8/K;->z0(Lm7/i;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lb9/f;->a(Lm7/i;Ljava/lang/Throwable;)V

    return-void

    :goto_0
    invoke-static {p1, v0}, LW8/L;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p0, p1}, Lb9/f;->a(Lm7/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    .prologue
    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception while trying to handle coroutine exception"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, p0}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-object v0
.end method
