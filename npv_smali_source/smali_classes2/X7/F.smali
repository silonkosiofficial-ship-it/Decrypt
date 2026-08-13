.class public abstract LX7/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ln8/f;)Ljava/util/List;
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LX7/A;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LX7/F;->b(Ln8/f;)Ln8/f;

    move-result-object p0

    invoke-static {p0}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0}, LX7/A;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LX7/F;->f(Ln8/f;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, LX7/g;->a:LX7/g;

    invoke-virtual {v0, p0}, LX7/g;->b(Ln8/f;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ln8/f;)Ln8/f;
    .locals 7

    .prologue
    const-string v0, "methodName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "get"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LX7/F;->e(Ln8/f;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Ln8/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "is"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LX7/F;->e(Ln8/f;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Ln8/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static final c(Ln8/f;Z)Ln8/f;
    .locals 6

    .prologue
    const-string v0, "methodName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p1, "is"

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "set"

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LX7/F;->e(Ln8/f;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Ln8/f;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ln8/f;Ljava/lang/String;ZLjava/lang/String;)Ln8/f;
    .locals 4

    .prologue
    invoke-virtual {p0}, Ln8/f;->q()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Ln8/f;->m()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getIdentifier(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v1}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v2, v3, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x61

    if-gt v3, v2, :cond_3

    const/16 v3, 0x7b

    if-ge v2, v3, :cond_3

    return-object v1

    :cond_3
    if-eqz p3, :cond_4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, p1}, LS8/r;->J0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    return-object p0

    :cond_4
    if-nez p2, :cond_5

    return-object p0

    :cond_5
    invoke-static {v0, p1}, LS8/r;->J0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1}, LN8/a;->c(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ln8/f;->r(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    return-object v1

    :cond_6
    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Ln8/f;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Ln8/f;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LX7/F;->d(Ln8/f;Ljava/lang/String;ZLjava/lang/String;)Ln8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ln8/f;)Ljava/util/List;
    .locals 4

    const-string v0, "methodName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LX7/F;->c(Ln8/f;Z)Ln8/f;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p0, v2}, LX7/F;->c(Ln8/f;Z)Ln8/f;

    move-result-object p0

    const/4 v3, 0x2

    new-array v3, v3, [Ln8/f;

    aput-object v1, v3, v0

    aput-object p0, v3, v2

    invoke-static {v3}, Lj7/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
