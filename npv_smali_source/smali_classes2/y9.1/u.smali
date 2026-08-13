.class final Ly9/u;
.super Ly9/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ly9/g;LA9/b;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Ly9/b;-><init>(Ly9/g;LA9/b;Ly7/k;)V

    invoke-direct {p0}, Ly9/u;->i()V

    return-void
.end method

.method private final i()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Ly9/b;->f()LA9/b;

    move-result-object v0

    invoke-static {}, LA9/c;->a()LA9/b;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lz9/M;

    invoke-virtual {p0}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lz9/M;-><init>(Ly9/g;)V

    invoke-virtual {p0}, Ly9/b;->f()LA9/b;

    move-result-object v1

    invoke-virtual {v1, v0}, LA9/b;->a(LA9/d;)V

    return-void
.end method
