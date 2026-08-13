.class public abstract Lz9/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ly7/O;Ly9/i;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, Lz9/h0;->e(Ly7/O;Ly9/i;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lv9/f;)Z
    .locals 0

    invoke-static {p0}, Lz9/h0;->c(Lv9/f;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lv9/f;)Z
    .locals 1

    .prologue
    invoke-interface {p0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    instance-of v0, v0, Lv9/d;

    if-nez v0, :cond_1

    invoke-interface {p0}, Lv9/f;->j()Lv9/m;

    move-result-object p0

    sget-object v0, Lv9/m$b;->a:Lv9/m$b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final d(Ly9/b;Ljava/lang/Object;Lt9/e;)Ly9/i;
    .locals 3

    .prologue
    const-string v0, "json"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, Lz9/Q;

    new-instance v2, Lz9/g0;

    invoke-direct {v2, v0}, Lz9/g0;-><init>(Ly7/O;)V

    invoke-direct {v1, p0, v2}, Lz9/Q;-><init>(Ly9/b;Lx7/l;)V

    invoke-virtual {v1, p2, p1}, Lz9/e;->t(Lt9/e;Ljava/lang/Object;)V

    iget-object p0, v0, Ly7/O;->C:Ljava/lang/Object;

    if-nez p0, :cond_0

    const-string p0, "result"

    invoke-static {p0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    check-cast p0, Ly9/i;

    :goto_0
    return-object p0
.end method

.method private static final e(Ly7/O;Ly9/i;)Li7/M;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly7/O;->C:Ljava/lang/Object;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
