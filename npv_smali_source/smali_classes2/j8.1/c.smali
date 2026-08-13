.class public abstract Lj8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/io/InputStream;)Li7/u;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lj8/a;->g:Lj8/a$a;

    invoke-virtual {v0, p0}, Lj8/a$a;->a(Ljava/io/InputStream;)Lj8/a;

    move-result-object v0

    invoke-virtual {v0}, Lj8/a;->h()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lp8/g;->d()Lp8/g;

    move-result-object v1

    invoke-static {v1}, Lj8/b;->a(Lp8/g;)V

    invoke-static {p0, v1}, Li8/m;->W(Ljava/io/InputStream;Lp8/g;)Li8/m;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v1, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v2}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p0, v0}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
