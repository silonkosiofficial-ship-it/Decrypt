.class public abstract Lz9/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly9/b;Ly9/i;Lt9/a;)Ljava/lang/Object;
    .locals 8

    .prologue
    const-string v0, "json"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly9/D;

    if-eqz v0, :cond_0

    new-instance v0, Lz9/P;

    move-object v3, p1

    check-cast v3, Ly9/D;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lz9/P;-><init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;ILy7/k;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ly9/c;

    if-eqz v0, :cond_1

    new-instance v0, Lz9/S;

    check-cast p1, Ly9/c;

    invoke-direct {v0, p0, p1}, Lz9/S;-><init>(Ly9/b;Ly9/c;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Ly9/w;

    if-nez v0, :cond_3

    sget-object v0, Ly9/A;->INSTANCE:Ly9/A;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_3
    :goto_0
    new-instance v6, Lz9/K;

    move-object v2, p1

    check-cast v2, Ly9/F;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lz9/K;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;ILy7/k;)V

    :goto_1
    invoke-virtual {v0, p2}, Lz9/c;->x(Lt9/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
