.class final Lr2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/B;
.implements Lq2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/d$a;,
        Lr2/d$b;
    }
.end annotation


# instance fields
.field private final a:Lr2/a;

.field private b:Lo2/B$a;


# direct methods
.method public constructor <init>(Lr2/a;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/d;->a:Lr2/a;

    return-void
.end method

.method public static final synthetic e(Lr2/d;Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr2/d;->f(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p3, Lr2/d$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lr2/d$c;

    iget v1, v0, Lr2/d$c;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr2/d$c;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr2/d$c;

    invoke-direct {v0, p0, p3}, Lr2/d$c;-><init>(Lr2/d;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lr2/d$c;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr2/d$c;->J:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lr2/d$c;->G:Ljava/lang/Object;

    check-cast p1, Lz2/d;

    iget-object p2, v0, Lr2/d$c;->F:Ljava/lang/Object;

    check-cast p2, Lr2/d;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p3

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lr2/d;->a:Lr2/a;

    invoke-virtual {p3}, Lr2/a;->a()Lz2/d;

    move-result-object p3

    invoke-interface {p3}, Lz2/d;->V0()Z

    move-result v2

    if-nez v2, :cond_3

    iput-object p1, p0, Lr2/d;->b:Lo2/B$a;

    :cond_3
    sget-object v2, Lr2/d$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v4, :cond_6

    const/4 v2, 0x2

    if-eq p1, v2, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p3}, Lz2/d;->u()V

    goto :goto_1

    :cond_5
    invoke-interface {p3}, Lz2/d;->l0()V

    goto :goto_1

    :cond_6
    invoke-interface {p3}, Lz2/d;->S()V

    :goto_1
    :try_start_1
    new-instance p1, Lr2/d$a;

    invoke-direct {p1, p0}, Lr2/d$a;-><init>(Lr2/d;)V

    iput-object p0, v0, Lr2/d$c;->F:Ljava/lang/Object;

    iput-object p3, v0, Lr2/d$c;->G:Ljava/lang/Object;

    iput v4, v0, Lr2/d$c;->J:I

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object p2, p0

    move-object v5, p3

    move-object p3, p1

    move-object p1, v5

    :goto_2
    :try_start_2
    invoke-interface {p1}, Lz2/d;->i0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1}, Lz2/d;->B0()V

    invoke-interface {p1}, Lz2/d;->V0()Z

    move-result p1

    if-nez p1, :cond_8

    iput-object v3, p2, Lr2/d;->b:Lo2/B$a;

    :cond_8
    return-object p3

    :catchall_1
    move-exception p1

    move-object p2, p0

    move-object v5, p3

    move-object p3, p1

    move-object p1, v5

    :goto_3
    invoke-interface {p1}, Lz2/d;->B0()V

    invoke-interface {p1}, Lz2/d;->V0()Z

    move-result p1

    if-nez p1, :cond_9

    iput-object v3, p2, Lr2/d;->b:Lo2/B$a;

    :cond_9
    throw p3
.end method


# virtual methods
.method public a(Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lr2/d;->a:Lr2/a;

    invoke-virtual {p1}, Lr2/a;->a()Lz2/d;

    move-result-object p1

    invoke-interface {p1}, Lz2/d;->V0()Z

    move-result p1

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    iget-object p3, p0, Lr2/d;->a:Lr2/a;

    invoke-virtual {p3, p1}, Lr2/a;->b(Ljava/lang/String;)Lr2/e;

    move-result-object p1

    :try_start_0
    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ly2/e;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Ly2/e;->close()V

    throw p2
.end method

.method public c(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr2/d;->f(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Ly2/b;
    .locals 1

    iget-object v0, p0, Lr2/d;->a:Lr2/a;

    return-object v0
.end method
