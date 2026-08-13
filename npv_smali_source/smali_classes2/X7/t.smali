.class public final LX7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/t$a;
    }
.end annotation


# static fields
.field public static final a:LX7/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX7/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX7/t$a;-><init>(Ly7/k;)V

    sput-object v0, LX7/t;->a:LX7/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(LO7/a;LO7/a;LO7/e;)Z
    .locals 7

    .prologue
    instance-of v0, p1, LO7/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    instance-of v0, p2, LO7/y;

    if-eqz v0, :cond_9

    invoke-static {p2}, LL7/g;->g0(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v0, LX7/f;->o:LX7/f;

    check-cast p2, LO7/y;

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LX7/f;->l(Ln8/f;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LX7/I$a;->k(Ln8/f;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    move-object v0, p1

    check-cast v0, LO7/b;

    invoke-static {v0}, LX7/H;->e(LO7/b;)LO7/b;

    move-result-object v0

    instance-of v2, p1, LO7/y;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v4, p1

    check-cast v4, LO7/y;

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-interface {p2}, LO7/y;->F0()Z

    move-result v6

    invoke-interface {v4}, LO7/y;->F0()Z

    move-result v4

    if-ne v6, v4, :cond_3

    move v4, v5

    goto :goto_1

    :cond_3
    move v4, v1

    :goto_1
    xor-int/2addr v4, v5

    if-eqz v4, :cond_5

    if-eqz v0, :cond_4

    invoke-interface {p2}, LO7/y;->F0()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    return v5

    :cond_5
    instance-of v4, p3, LZ7/c;

    if-eqz v4, :cond_9

    invoke-interface {p2}, LO7/y;->l0()LO7/y;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    if-eqz v0, :cond_9

    invoke-static {p3, v0}, LX7/H;->f(LO7/e;LO7/a;)Z

    move-result p3

    if-eqz p3, :cond_7

    goto :goto_2

    :cond_7
    instance-of p3, v0, LO7/y;

    if-eqz p3, :cond_8

    if-eqz v2, :cond_8

    check-cast v0, LO7/y;

    invoke-static {v0}, LX7/f;->k(LO7/y;)LO7/y;

    move-result-object p3

    if-eqz p3, :cond_8

    const/4 p3, 0x2

    invoke-static {p2, v1, v1, p3, v3}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    check-cast p1, LO7/y;

    invoke-interface {p1}, LO7/y;->a()LO7/y;

    move-result-object p1

    const-string v0, "getOriginal(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1, v1, p3, v3}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    return v1

    :cond_8
    return v5

    :cond_9
    :goto_2
    return v1
.end method


# virtual methods
.method public a()Lr8/g$a;
    .locals 1

    sget-object v0, Lr8/g$a;->C:Lr8/g$a;

    return-object v0
.end method

.method public b(LO7/a;LO7/a;LO7/e;)Lr8/g$b;
    .locals 1

    .prologue
    const-string v0, "superDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LX7/t;->c(LO7/a;LO7/a;LO7/e;)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lr8/g$b;->E:Lr8/g$b;

    return-object p1

    :cond_0
    sget-object p3, LX7/t;->a:LX7/t$a;

    invoke-virtual {p3, p1, p2}, LX7/t$a;->a(LO7/a;LO7/a;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lr8/g$b;->E:Lr8/g$b;

    return-object p1

    :cond_1
    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1
.end method
