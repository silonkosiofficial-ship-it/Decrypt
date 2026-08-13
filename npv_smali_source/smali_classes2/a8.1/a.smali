.class public abstract La8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(La8/g;LO7/m;Le8/z;ILi7/n;)La8/g;
    .locals 2

    .prologue
    invoke-virtual {p0}, La8/g;->a()La8/b;

    move-result-object v0

    if-eqz p2, :cond_0

    new-instance v1, La8/h;

    invoke-direct {v1, p0, p1, p2, p3}, La8/h;-><init>(La8/g;LO7/m;Le8/z;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La8/g;->f()La8/k;

    move-result-object v1

    :goto_0
    new-instance p0, La8/g;

    invoke-direct {p0, v0, v1, p4}, La8/g;-><init>(La8/b;La8/k;Li7/n;)V

    return-object p0
.end method

.method public static final b(La8/g;La8/k;)La8/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterResolver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La8/g;

    invoke-virtual {p0}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {p0}, La8/g;->c()Li7/n;

    move-result-object p0

    invoke-direct {v0, v1, p1, p0}, La8/g;-><init>(La8/b;La8/k;Li7/n;)V

    return-object v0
.end method

.method public static final c(La8/g;LO7/g;Le8/z;I)La8/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li7/r;->E:Li7/r;

    new-instance v1, La8/a$a;

    invoke-direct {v1, p0, p1}, La8/a$a;-><init>(La8/g;LO7/g;)V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, La8/a;->a(La8/g;LO7/m;Le8/z;ILi7/n;)La8/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(La8/g;LO7/g;Le8/z;IILjava/lang/Object;)La8/g;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, La8/a;->c(La8/g;LO7/g;Le8/z;I)La8/g;

    move-result-object p0

    return-object p0
.end method

.method public static final e(La8/g;LO7/m;Le8/z;I)La8/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterOwner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La8/g;->c()Li7/n;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, La8/a;->a(La8/g;LO7/m;Le8/z;ILi7/n;)La8/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(La8/g;LO7/m;Le8/z;IILjava/lang/Object;)La8/g;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, La8/a;->e(La8/g;LO7/m;Le8/z;I)La8/g;

    move-result-object p0

    return-object p0
.end method

.method public static final g(La8/g;LP7/g;)LX7/y;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalAnnotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->a()LX7/d;

    move-result-object v0

    invoke-virtual {p0}, La8/g;->b()LX7/y;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, LX7/a;->c(LX7/y;Ljava/lang/Iterable;)LX7/y;

    move-result-object p0

    return-object p0
.end method

.method public static final h(La8/g;LP7/g;)La8/g;
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalAnnotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP7/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, La8/g;

    invoke-virtual {p0}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {p0}, La8/g;->f()La8/k;

    move-result-object v2

    sget-object v3, Li7/r;->E:Li7/r;

    new-instance v4, La8/a$b;

    invoke-direct {v4, p0, p1}, La8/a$b;-><init>(La8/g;LP7/g;)V

    invoke-static {v3, v4}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, La8/g;-><init>(La8/b;La8/k;Li7/n;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final i(La8/g;La8/b;)La8/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La8/g;

    invoke-virtual {p0}, La8/g;->f()La8/k;

    move-result-object v1

    invoke-virtual {p0}, La8/g;->c()Li7/n;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, La8/g;-><init>(La8/b;La8/k;Li7/n;)V

    return-object v0
.end method
