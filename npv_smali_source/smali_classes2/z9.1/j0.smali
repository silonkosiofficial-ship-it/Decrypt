.class public abstract Lz9/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv9/f;LA9/b;)Lv9/f;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    sget-object v1, Lv9/m$a;->a:Lv9/m$a;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p0}, Lv9/b;->b(LA9/b;Lv9/f;)Lv9/f;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p1}, Lz9/j0;->a(Lv9/f;LA9/b;)Lv9/f;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lv9/f;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lv9/f;->h(I)Lv9/f;

    move-result-object p0

    invoke-static {p0, p1}, Lz9/j0;->a(Lv9/f;LA9/b;)Lv9/f;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static final b(Ly9/b;Lv9/f;)Lz9/i0;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    instance-of v1, v0, Lv9/c;

    if-eqz v1, :cond_0

    sget-object p0, Lz9/i0;->H:Lz9/i0;

    goto :goto_2

    :cond_0
    sget-object v1, Lv9/n$b;->a:Lv9/n$b;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    sget-object p0, Lz9/i0;->F:Lz9/i0;

    goto :goto_2

    :cond_1
    sget-object v1, Lv9/n$c;->a:Lv9/n$c;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-virtual {p0}, Ly9/b;->f()LA9/b;

    move-result-object v0

    invoke-static {p1, v0}, Lz9/j0;->a(Lv9/f;LA9/b;)Lv9/f;

    move-result-object p1

    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    instance-of v1, v0, Lv9/d;

    if-nez v1, :cond_4

    sget-object v1, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ly9/b;->e()Ly9/g;

    move-result-object p0

    invoke-virtual {p0}, Ly9/g;->c()Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lz9/G;->d(Lv9/f;)Lz9/E;

    move-result-object p0

    throw p0

    :cond_4
    :goto_1
    sget-object p0, Lz9/i0;->G:Lz9/i0;

    goto :goto_2

    :cond_5
    sget-object p0, Lz9/i0;->E:Lz9/i0;

    :goto_2
    return-object p0
.end method
