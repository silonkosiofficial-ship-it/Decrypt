.class public final LD/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/S;


# instance fields
.field private b:Z

.field private c:Lm7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public final g(Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p1, LD/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LD/b$a;

    iget v1, v0, LD/b$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LD/b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LD/b$a;

    invoke-direct {v0, p0, p1}, LD/b$a;-><init>(LD/b;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LD/b$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LD/b$a;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, LD/b$a;->G:Ljava/lang/Object;

    check-cast v1, Lm7/e;

    iget-object v0, v0, LD/b$a;->F:Ljava/lang/Object;

    check-cast v0, LD/b;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, LD/b;->b:Z

    if-nez p1, :cond_5

    iget-object p1, p0, LD/b;->c:Lm7/e;

    iput-object p0, v0, LD/b$a;->F:Ljava/lang/Object;

    iput-object p1, v0, LD/b$a;->G:Ljava/lang/Object;

    iput v3, v0, LD/b$a;->J:I

    new-instance v2, Lm7/k;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v3

    invoke-direct {v2, v3}, Lm7/k;-><init>(Lm7/e;)V

    iput-object v2, p0, LD/b;->c:Lm7/e;

    invoke-virtual {v2}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V

    :cond_3
    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, p1

    :goto_1
    if-eqz v1, :cond_5

    sget-object p1, Li7/w;->D:Li7/w$a;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_5
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public s(LD0/t;)V
    .locals 1

    .prologue
    iget-boolean p1, p0, LD/b;->b:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LD/b;->b:Z

    iget-object p1, p0, LD/b;->c:Lm7/e;

    if-eqz p1, :cond_0

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LD/b;->c:Lm7/e;

    :cond_1
    return-void
.end method
