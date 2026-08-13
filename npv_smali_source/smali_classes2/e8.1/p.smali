.class public abstract Le8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Le8/r;)Z
    .locals 2

    .prologue
    invoke-interface {p0}, Le8/r;->n()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lj7/v;->I0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le8/B;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Le8/B;->getType()Le8/x;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, Le8/j;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Le8/j;

    :cond_1
    const/4 p0, 0x0

    if-nez v0, :cond_2

    return p0

    :cond_2
    invoke-interface {v0}, Le8/j;->b()Le8/i;

    move-result-object v0

    instance-of v1, v0, Le8/g;

    if-eqz v1, :cond_3

    check-cast v0, Le8/g;

    invoke-interface {v0}, Le8/g;->e()Ln8/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.lang.Object"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x1

    :cond_3
    return p0
.end method

.method private static final b(Le8/r;)Z
    .locals 3

    .prologue
    invoke-interface {p0}, Le8/t;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x69e9ad94

    if-eq v1, v2, :cond_3

    const v2, -0x4d378041

    if-eq v1, v2, :cond_1

    const v2, 0x8cdac1b

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "hashCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_1
    const-string v1, "equals"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0}, Le8/p;->a(Le8/r;)Z

    move-result p0

    goto :goto_1

    :cond_3
    const-string v1, "toString"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-interface {p0}, Le8/r;->n()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final c(Le8/q;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Le8/q;->V()Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p0, Le8/r;

    if-eqz v0, :cond_0

    check-cast p0, Le8/r;

    invoke-static {p0}, Le8/p;->b(Le8/r;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
