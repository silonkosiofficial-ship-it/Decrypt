.class public final LF8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/d;

    invoke-direct {v0}, LF8/d;-><init>()V

    sput-object v0, LF8/d;->a:LF8/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(LJ8/o;LJ8/j;LJ8/j;)Z
    .locals 8

    .prologue
    invoke-interface {p1, p2}, LJ8/o;->h(LJ8/i;)I

    move-result v0

    invoke-interface {p1, p3}, LJ8/o;->h(LJ8/i;)I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_8

    invoke-interface {p1, p2}, LJ8/o;->C0(LJ8/j;)Z

    move-result v0

    invoke-interface {p1, p3}, LJ8/o;->C0(LJ8/j;)Z

    move-result v1

    if-ne v0, v1, :cond_8

    invoke-interface {p1, p2}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-interface {p1, p3}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object v3

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-ne v0, v3, :cond_8

    invoke-interface {p1, p2}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v0

    invoke-interface {p1, p3}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v3

    invoke-interface {p1, v0, v3}, LJ8/o;->h0(LJ8/m;LJ8/m;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {p1, p2, p3}, LJ8/r;->U(LJ8/j;LJ8/j;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    invoke-interface {p1, p2}, LJ8/o;->h(LJ8/i;)I

    move-result v0

    move v3, v2

    :goto_2
    if-ge v3, v0, :cond_7

    invoke-interface {p1, p2, v3}, LJ8/o;->c0(LJ8/i;I)LJ8/l;

    move-result-object v4

    invoke-interface {p1, p3, v3}, LJ8/o;->c0(LJ8/i;I)LJ8/l;

    move-result-object v5

    invoke-interface {p1, v4}, LJ8/o;->E0(LJ8/l;)Z

    move-result v6

    invoke-interface {p1, v5}, LJ8/o;->E0(LJ8/l;)Z

    move-result v7

    if-eq v6, v7, :cond_4

    return v2

    :cond_4
    invoke-interface {p1, v4}, LJ8/o;->E0(LJ8/l;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-interface {p1, v4}, LJ8/o;->u(LJ8/l;)LJ8/s;

    move-result-object v6

    invoke-interface {p1, v5}, LJ8/o;->u(LJ8/l;)LJ8/s;

    move-result-object v7

    if-eq v6, v7, :cond_5

    return v2

    :cond_5
    invoke-interface {p1, v4}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v4

    invoke-interface {p1, v5}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v5

    invoke-direct {p0, p1, v4, v5}, LF8/d;->c(LJ8/o;LJ8/i;LJ8/i;)Z

    move-result v4

    if-nez v4, :cond_6

    return v2

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    return v1

    :cond_8
    :goto_3
    return v2
.end method

.method private final c(LJ8/o;LJ8/i;LJ8/i;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p2, p3, :cond_0

    return v0

    :cond_0
    invoke-interface {p1, p2}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v1

    invoke-interface {p1, p3}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v2

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-direct {p0, p1, v1, v2}, LF8/d;->a(LJ8/o;LJ8/j;LJ8/j;)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p1, p2}, LJ8/o;->t0(LJ8/i;)LJ8/g;

    move-result-object p2

    invoke-interface {p1, p3}, LJ8/o;->t0(LJ8/i;)LJ8/g;

    move-result-object p3

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    invoke-interface {p1, p2}, LJ8/o;->c(LJ8/g;)LJ8/j;

    move-result-object v2

    invoke-interface {p1, p3}, LJ8/o;->c(LJ8/g;)LJ8/j;

    move-result-object v3

    invoke-direct {p0, p1, v2, v3}, LF8/d;->a(LJ8/o;LJ8/j;LJ8/j;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1, p2}, LJ8/o;->a(LJ8/g;)LJ8/j;

    move-result-object p2

    invoke-interface {p1, p3}, LJ8/o;->a(LJ8/g;)LJ8/j;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, LF8/d;->a(LJ8/o;LJ8/j;LJ8/j;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    return v1
.end method


# virtual methods
.method public final b(LJ8/o;LJ8/i;LJ8/i;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "a"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LF8/d;->c(LJ8/o;LJ8/i;LJ8/i;)Z

    move-result p1

    return p1
.end method
