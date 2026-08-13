.class public final LM/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM/c;
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

    invoke-direct {p0}, LM/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM/c;LY0/v;LM0/P;LY0/e;LR0/h$b;)LM/c;
    .locals 7

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, LM/c;->g()LY0/v;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, LM/c;->f()LM0/P;

    move-result-object v0

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p4}, LY0/e;->getDensity()F

    move-result v0

    invoke-virtual {p1}, LM/c;->d()LY0/e;

    move-result-object v1

    invoke-interface {v1}, LY0/e;->getDensity()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, LM/c;->e()LR0/h$b;

    move-result-object v0

    if-ne p5, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, LM/c;->a()LM/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LM/c;->g()LY0/v;

    move-result-object v0

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, LM/c;->f()LM0/P;

    move-result-object v0

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4}, LY0/e;->getDensity()F

    move-result v0

    invoke-virtual {p1}, LM/c;->d()LY0/e;

    move-result-object v1

    invoke-interface {v1}, LY0/e;->getDensity()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p1}, LM/c;->e()LR0/h$b;

    move-result-object v0

    if-ne p5, v0, :cond_1

    return-object p1

    :cond_1
    new-instance p1, LM/c;

    invoke-static {p3, p2}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object v3

    invoke-interface {p4}, LY0/e;->getDensity()F

    move-result p3

    invoke-interface {p4}, LY0/n;->v0()F

    move-result p4

    invoke-static {p3, p4}, LY0/g;->a(FF)LY0/e;

    move-result-object v4

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, LM/c;-><init>(LY0/v;LM0/P;LY0/e;LR0/h$b;Ly7/k;)V

    invoke-static {p1}, LM/c;->b(LM/c;)V

    return-object p1
.end method
