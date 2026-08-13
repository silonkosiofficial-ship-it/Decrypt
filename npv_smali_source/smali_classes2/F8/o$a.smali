.class public final LF8/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LF8/o$a;-><init>()V

    return-void
.end method

.method private final a(LF8/t0;)Z
    .locals 1

    .prologue
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v0, v0, LO7/f0;

    if-nez v0, :cond_0

    instance-of p1, p1, LG8/i;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public static synthetic c(LF8/o$a;LF8/t0;ZZILjava/lang/Object;)LF8/o;
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LF8/o$a;->b(LF8/t0;ZZ)LF8/o;

    move-result-object p0

    return-object p0
.end method

.method private final d(LF8/t0;Z)Z
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LF8/o$a;->a(LF8/t0;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LR7/K;

    if-eqz v1, :cond_1

    check-cast v0, LR7/K;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LR7/K;->c1()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p2

    invoke-interface {p2}, LF8/e0;->w()LO7/h;

    move-result-object p2

    instance-of p2, p2, LO7/f0;

    if-eqz p2, :cond_3

    invoke-static {p1}, LF8/q0;->l(LF8/E;)Z

    move-result p1

    return p1

    :cond_3
    sget-object p2, LG8/n;->a:LG8/n;

    invoke-virtual {p2, p1}, LG8/n;->a(LF8/t0;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method


# virtual methods
.method public final b(LF8/t0;ZZ)LF8/o;
    .locals 2

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LF8/o;

    if-eqz v0, :cond_0

    check-cast p1, LF8/o;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-nez p3, :cond_2

    invoke-direct {p0, p1, p2}, LF8/o$a;->d(LF8/t0;Z)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_1

    :cond_2
    :goto_0
    instance-of p3, p1, LF8/y;

    if-eqz p3, :cond_3

    move-object p3, p1

    check-cast p3, LF8/y;

    invoke-virtual {p3}, LF8/y;->e1()LF8/M;

    move-result-object v1

    invoke-virtual {v1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p3}, LF8/y;->f1()LF8/M;

    move-result-object p3

    invoke-virtual {p3}, LF8/E;->W0()LF8/e0;

    move-result-object p3

    invoke-static {v1, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    new-instance p3, LF8/o;

    invoke-static {p1}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    invoke-direct {p3, p1, p2, v0}, LF8/o;-><init>(LF8/M;ZLy7/k;)V

    move-object p1, p3

    :goto_1
    return-object p1
.end method
