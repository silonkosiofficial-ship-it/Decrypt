.class public abstract Lf8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/r$a;
    }
.end annotation


# static fields
.field private static final a:LP7/g;

.field private static final b:Lf8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf8/c;

    sget-object v1, LX7/B;->v:Ln8/c;

    const-string v2, "ENHANCED_NULLABILITY_ANNOTATION"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lf8/c;-><init>(Ln8/c;)V

    sput-object v0, Lf8/r;->a:LP7/g;

    new-instance v0, Lf8/c;

    sget-object v1, LX7/B;->w:Ln8/c;

    const-string v2, "ENHANCED_MUTABILITY_ANNOTATION"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lf8/c;-><init>(Ln8/c;)V

    sput-object v0, Lf8/r;->b:Lf8/c;

    return-void
.end method

.method public static final synthetic a(Ljava/util/List;)LP7/g;
    .locals 0

    invoke-static {p0}, Lf8/r;->e(Ljava/util/List;)LP7/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LO7/h;Lf8/e;Lf8/o;)LO7/h;
    .locals 0

    invoke-static {p0, p1, p2}, Lf8/r;->f(LO7/h;Lf8/e;Lf8/o;)LO7/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lf8/c;
    .locals 1

    sget-object v0, Lf8/r;->b:Lf8/c;

    return-object v0
.end method

.method public static final synthetic d(Lf8/e;Lf8/o;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lf8/r;->h(Lf8/e;Lf8/o;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/util/List;)LP7/g;
    .locals 2

    .prologue
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, LP7/k;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, LP7/k;-><init>(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, LP7/g;

    :goto_0
    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "At least one Annotations object expected"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final f(LO7/h;Lf8/e;Lf8/o;)LO7/h;
    .locals 4

    .prologue
    sget-object v0, LN7/d;->a:LN7/d;

    invoke-static {p2}, Lf8/p;->a(Lf8/o;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p0, LO7/e;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lf8/e;->c()Lf8/f;

    move-result-object v1

    sget-object v3, Lf8/f;->C:Lf8/f;

    if-ne v1, v3, :cond_2

    sget-object v1, Lf8/o;->C:Lf8/o;

    if-ne p2, v1, :cond_2

    move-object v1, p0

    check-cast v1, LO7/e;

    invoke-virtual {v0, v1}, LN7/d;->c(LO7/e;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0, v1}, LN7/d;->a(LO7/e;)LO7/e;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lf8/e;->c()Lf8/f;

    move-result-object p1

    sget-object v1, Lf8/f;->D:Lf8/f;

    if-ne p1, v1, :cond_3

    sget-object p1, Lf8/o;->D:Lf8/o;

    if-ne p2, p1, :cond_3

    check-cast p0, LO7/e;

    invoke-virtual {v0, p0}, LN7/d;->d(LO7/e;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0, p0}, LN7/d;->b(LO7/e;)LO7/e;

    move-result-object v2

    :cond_3
    :goto_0
    return-object v2
.end method

.method public static final g()LP7/g;
    .locals 1

    sget-object v0, Lf8/r;->a:LP7/g;

    return-object v0
.end method

.method private static final h(Lf8/e;Lf8/o;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    invoke-static {p1}, Lf8/p;->a(Lf8/o;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lf8/e;->d()Lf8/h;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_0

    :cond_1
    sget-object p1, Lf8/r$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    :goto_0
    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    return-object v0
.end method

.method public static final i(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LG8/o;->a:LG8/o;

    invoke-static {v0, p0}, Lf8/s;->c(LF8/o0;LJ8/i;)Z

    move-result p0

    return p0
.end method
