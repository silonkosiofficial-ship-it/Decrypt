.class public abstract Lc9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lm7/e;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Lm7/e;Lm7/e;)V
    .locals 1

    .prologue
    :try_start_0
    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object p0

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lb9/i;->b(Lm7/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lc9/a;->a(Lm7/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lx7/l;Lm7/e;)V
    .locals 1

    .prologue
    :try_start_0
    invoke-static {p0, p1}, Ln7/b;->a(Lx7/l;Lm7/e;)Lm7/e;

    move-result-object p0

    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object p0

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lb9/i;->b(Lm7/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lc9/a;->a(Lm7/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final d(Lx7/p;Ljava/lang/Object;Lm7/e;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {p0, p1, p2}, Ln7/b;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p0

    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object p0

    sget-object p1, Li7/w;->D:Li7/w$a;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lb9/i;->b(Lm7/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lc9/a;->a(Lm7/e;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
