.class public abstract Lv9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv9/f;)LF7/c;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lx9/t0;

    if-eqz v0, :cond_0

    check-cast p0, Lx9/t0;

    invoke-virtual {p0}, Lx9/t0;->l()Lv9/f;

    move-result-object p0

    invoke-static {p0}, Lv9/b;->a(Lv9/f;)LF7/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(LA9/b;Lv9/f;)Lv9/f;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lv9/b;->a(Lv9/f;)LF7/c;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, LA9/b;->c(LA9/b;LF7/c;Ljava/util/List;ILjava/lang/Object;)Lt9/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lt9/b;->a()Lv9/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method
