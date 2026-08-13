.class public abstract Lr8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;

.field private static final b:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln8/c;

    const-string v1, "kotlin.jvm.JvmInline"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr8/h;->a:Ln8/c;

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    const-string v1, "topLevel(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lr8/h;->b:Ln8/b;

    return-void
.end method

.method public static final a(LO7/a;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/V;

    if-eqz v0, :cond_0

    check-cast p0, LO7/V;

    invoke-interface {p0}, LO7/T;->K0()LO7/U;

    move-result-object p0

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/h;->f(LO7/k0;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LO7/m;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/e;

    if-eqz v0, :cond_0

    check-cast p0, LO7/e;

    invoke-interface {p0}, LO7/e;->I0()LO7/h0;

    move-result-object p0

    instance-of p0, p0, LO7/z;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lr8/h;->b(LO7/m;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(LO7/m;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/e;

    if-eqz v0, :cond_0

    check-cast p0, LO7/e;

    invoke-interface {p0}, LO7/e;->I0()LO7/h0;

    move-result-object p0

    instance-of p0, p0, LO7/H;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(LO7/k0;)Z
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/a;->v0()LO7/X;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-interface {p0}, LO7/i0;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lv8/c;->n(LO7/e;)LO7/z;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LO7/z;->d()Ln8/f;

    move-result-object v2

    :cond_1
    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object p0

    invoke-static {v2, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final f(LO7/k0;)Z
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/a;->v0()LO7/X;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p0}, LO7/i0;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    if-eqz v1, :cond_0

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LO7/e;->I0()LO7/h0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object p0

    const-string v1, "getName(...)"

    invoke-static {p0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LO7/h0;->a(Ln8/f;)Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static final g(LO7/m;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/h;->b(LO7/m;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lr8/h;->d(LO7/m;)Z

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

.method public static final h(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lr8/h;->g(LO7/m;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final i(LF8/E;)Z
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lr8/h;->d(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LG8/o;->a:LG8/o;

    invoke-virtual {v0, p0}, LG8/o;->p(LJ8/i;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static final j(LF8/E;)LF8/E;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/h;->k(LF8/E;)LF8/E;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LF8/n0;->f(LF8/E;)LF8/n0;

    move-result-object p0

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-virtual {p0, v0, v1}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final k(LF8/E;)LF8/E;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    instance-of v0, p0, LO7/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LO7/e;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lv8/c;->n(LO7/e;)LO7/z;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LO7/z;->e()LJ8/j;

    move-result-object p0

    move-object v1, p0

    check-cast v1, LF8/M;

    :cond_1
    return-object v1
.end method
