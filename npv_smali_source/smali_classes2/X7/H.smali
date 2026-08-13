.class public abstract LX7/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/b;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LX7/H;->d(LO7/b;)LO7/b;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LO7/b;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "callableMemberDescriptor"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LX7/H;->c(LO7/b;)LO7/b;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p0, LO7/U;

    if-eqz v1, :cond_1

    sget-object v0, LX7/i;->a:LX7/i;

    invoke-virtual {v0, p0}, LX7/i;->a(LO7/b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, p0, LO7/Z;

    if-eqz v1, :cond_2

    sget-object v1, LX7/e;->o:LX7/e;

    check-cast p0, LO7/Z;

    invoke-virtual {v1, p0}, LX7/e;->i(LO7/Z;)Ln8/f;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private static final c(LO7/b;)LO7/b;
    .locals 1

    .prologue
    invoke-static {p0}, LL7/g;->g0(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LX7/H;->d(LO7/b;)LO7/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(LO7/b;)LO7/b;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0}, LX7/I$a;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, LX7/g;->a:LX7/g;

    invoke-virtual {v0}, LX7/g;->d()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object v2

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v0, p0, LO7/U;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    instance-of v0, p0, LO7/T;

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_2

    sget-object v0, LX7/H$a;->D:LX7/H$a;

    :goto_1
    invoke-static {p0, v3, v0, v2, v1}, Lv8/c;->f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;

    move-result-object v1

    goto :goto_2

    :cond_2
    instance-of v0, p0, LO7/Z;

    if-eqz v0, :cond_3

    sget-object v0, LX7/H$b;->D:LX7/H$b;

    goto :goto_1

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static final e(LO7/b;)LO7/b;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LX7/H;->d(LO7/b;)LO7/b;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LX7/f;->o:LX7/f;

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LX7/f;->l(Ln8/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LX7/H$c;->D:LX7/H$c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v2, v1}, Lv8/c;->f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LO7/e;LO7/a;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCallableDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LO7/e;

    invoke-interface {p1}, LO7/e;->w()LF8/M;

    move-result-object p1

    const-string v0, "getDefaultType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, Lr8/f;->s(LO7/e;)LO7/e;

    move-result-object p0

    if-eqz p0, :cond_1

    instance-of v0, p0, LZ7/c;

    if-nez v0, :cond_0

    invoke-interface {p0}, LO7/e;->w()LF8/M;

    move-result-object v0

    invoke-static {v0, p1}, LG8/s;->b(LF8/E;LF8/E;)LF8/E;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LL7/g;->g0(LO7/m;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final g(LO7/b;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object p0

    invoke-interface {p0}, LO7/n;->b()LO7/m;

    move-result-object p0

    instance-of p0, p0, LZ7/c;

    return p0
.end method

.method public static final h(LO7/b;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LX7/H;->g(LO7/b;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, LL7/g;->g0(LO7/m;)Z

    move-result p0

    if-eqz p0, :cond_0

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
