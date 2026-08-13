.class public final Ly0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ly0/d;

.field private b:Lx7/a;

.field private c:LW8/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/c$a;

    invoke-direct {v0, p0}, Ly0/c$a;-><init>(Ly0/c;)V

    iput-object v0, p0, Ly0/c;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final a(JJLm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p5, Ly0/c$b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ly0/c$b;

    iget v1, v0, Ly0/c$b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly0/c$b;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ly0/c$b;

    invoke-direct {v0, p0, p5}, Ly0/c$b;-><init>(Ly0/c;Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Ly0/c$b;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, Ly0/c$b;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly0/c;->g()Ly0/b;

    move-result-object v1

    if-eqz v1, :cond_4

    iput v2, v6, Ly0/c$b;->H:I

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v1 .. v6}, Ly0/b;->J(JJLm7/e;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p5, LY0/A;

    invoke-virtual {p5}, LY0/A;->o()J

    move-result-wide p1

    goto :goto_3

    :cond_4
    sget-object p1, LY0/A;->b:LY0/A$a;

    invoke-virtual {p1}, LY0/A$a;->a()J

    move-result-wide p1

    :goto_3
    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    return-object p1
.end method

.method public final b(JJI)J
    .locals 6

    .prologue
    invoke-virtual {p0}, Ly0/c;->g()Ly0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Ly0/b;->e1(JJI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final c(JLm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p3, Ly0/c$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ly0/c$c;

    iget v1, v0, Ly0/c$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly0/c$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly0/c$c;

    invoke-direct {v0, p0, p3}, Ly0/c$c;-><init>(Ly0/c;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Ly0/c$c;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly0/c$c;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly0/c;->g()Ly0/b;

    move-result-object p3

    if-eqz p3, :cond_4

    iput v3, v0, Ly0/c$c;->H:I

    invoke-interface {p3, p1, p2, v0}, Ly0/b;->h1(JLm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, LY0/A;

    invoke-virtual {p3}, LY0/A;->o()J

    move-result-wide p1

    goto :goto_2

    :cond_4
    sget-object p1, LY0/A;->b:LY0/A$a;

    invoke-virtual {p1}, LY0/A$a;->a()J

    move-result-wide p1

    :goto_2
    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    return-object p1
.end method

.method public final d(JI)J
    .locals 1

    .prologue
    invoke-virtual {p0}, Ly0/c;->g()Ly0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Ly0/b;->u0(JI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final e()LW8/N;
    .locals 2

    .prologue
    iget-object v0, p0, Ly0/c;->b:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/N;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()Ly0/d;
    .locals 1

    iget-object v0, p0, Ly0/c;->a:Ly0/d;

    return-object v0
.end method

.method public final g()Ly0/b;
    .locals 1

    .prologue
    iget-object v0, p0, Ly0/c;->a:Ly0/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly0/d;->W1()Ly0/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final h()LW8/N;
    .locals 1

    iget-object v0, p0, Ly0/c;->c:LW8/N;

    return-object v0
.end method

.method public final i(Lx7/a;)V
    .locals 0

    iput-object p1, p0, Ly0/c;->b:Lx7/a;

    return-void
.end method

.method public final j(Ly0/d;)V
    .locals 0

    iput-object p1, p0, Ly0/c;->a:Ly0/d;

    return-void
.end method

.method public final k(LW8/N;)V
    .locals 0

    iput-object p1, p0, Ly0/c;->c:LW8/N;

    return-void
.end method
