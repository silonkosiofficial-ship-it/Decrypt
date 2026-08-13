.class public abstract Lv9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lv9/a;)Li7/M;
    .locals 0

    invoke-static {p0}, Lv9/l;->e(Lv9/a;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;Lv9/d;)Lv9/f;
    .locals 1

    .prologue
    const-string v0, "serialName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lx9/r0;->a(Ljava/lang/String;Lv9/d;)Lv9/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Blank serial names are prohibited"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;)Lv9/f;
    .locals 7

    .prologue
    const-string v0, "serialName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameters"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    sget-object v0, Lv9/n$a;->a:Lv9/n$a;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v6, Lv9/a;

    invoke-direct {v6, p0}, Lv9/a;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, v6}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lv9/i;

    invoke-virtual {v6}, Lv9/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {p2}, Lj7/n;->R0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v1, p3

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lv9/i;-><init>(Ljava/lang/String;Lv9/m;ILjava/util/List;Lv9/a;)V

    return-object p3

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Blank serial names are prohibited"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic d(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;ILjava/lang/Object;)Lv9/f;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    new-instance p3, Lv9/k;

    invoke-direct {p3}, Lv9/k;-><init>()V

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lv9/l;->c(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;)Lv9/f;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lv9/a;)Li7/M;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
