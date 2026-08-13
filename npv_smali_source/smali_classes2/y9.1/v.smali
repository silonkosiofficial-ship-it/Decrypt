.class public abstract Ly9/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly9/b;Lx7/l;)Ly9/b;
    .locals 1

    const-string v0, "from"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly9/e;

    invoke-direct {v0, p0}, Ly9/e;-><init>(Ly9/b;)V

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ly9/e;->a()Ly9/g;

    move-result-object p0

    new-instance p1, Ly9/u;

    invoke-virtual {v0}, Ly9/e;->b()LA9/b;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ly9/u;-><init>(Ly9/g;LA9/b;)V

    return-object p1
.end method

.method public static synthetic b(Ly9/b;Lx7/l;ILjava/lang/Object;)Ly9/b;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Ly9/b;->d:Ly9/b$a;

    :cond_0
    invoke-static {p0, p1}, Ly9/v;->a(Ly9/b;Lx7/l;)Ly9/b;

    move-result-object p0

    return-object p0
.end method
