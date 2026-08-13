.class public abstract synthetic LX0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LX0/o;LX0/o;)LX0/o;
    .locals 3

    .prologue
    instance-of v0, p1, LX0/c;

    if-eqz v0, :cond_0

    instance-of v1, p0, LX0/c;

    if-eqz v1, :cond_0

    new-instance v0, LX0/c;

    move-object v1, p1

    check-cast v1, LX0/c;

    invoke-virtual {v1}, LX0/c;->b()Lo0/a2;

    move-result-object v1

    invoke-interface {p1}, LX0/o;->a()F

    move-result p1

    new-instance v2, LX0/n$a;

    invoke-direct {v2, p0}, LX0/n$a;-><init>(LX0/o;)V

    invoke-static {p1, v2}, LX0/m;->a(FLx7/a;)F

    move-result p0

    invoke-direct {v0, v1, p0}, LX0/c;-><init>(Lo0/a2;F)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    instance-of v1, p0, LX0/c;

    if-nez v1, :cond_1

    move-object p0, p1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    instance-of v0, p0, LX0/c;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, LX0/n$b;

    invoke-direct {v0, p0}, LX0/n$b;-><init>(LX0/o;)V

    invoke-interface {p1, v0}, LX0/o;->d(Lx7/a;)LX0/o;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static b(LX0/o;Lx7/a;)LX0/o;
    .locals 1

    .prologue
    sget-object v0, LX0/o$b;->b:LX0/o$b;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LX0/o;

    :goto_0
    return-object p0
.end method
