.class public final LV/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/j0;


# instance fields
.field private final C:LV/j0;

.field private final D:LV/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/E0;->C:LV/j0;

    new-instance p1, LV/d0;

    invoke-direct {p1}, LV/d0;-><init>()V

    iput-object p1, p0, LV/E0;->D:LV/d0;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LV/j0$a;->a(LV/j0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public R(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LV/E0$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LV/E0$a;

    iget v1, v0, LV/E0$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LV/E0$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LV/E0$a;

    invoke-direct {v0, p0, p2}, LV/E0$a;-><init>(LV/E0;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LV/E0$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LV/E0$a;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LV/E0$a;->G:Ljava/lang/Object;

    check-cast p1, Lx7/l;

    iget-object v2, v0, LV/E0$a;->F:Ljava/lang/Object;

    check-cast v2, LV/E0;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LV/E0;->D:LV/d0;

    iput-object p0, v0, LV/E0$a;->F:Ljava/lang/Object;

    iput-object p1, v0, LV/E0$a;->G:Ljava/lang/Object;

    iput v4, v0, LV/E0$a;->J:I

    invoke-virtual {p2, v0}, LV/d0;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p2, v2, LV/E0;->C:LV/j0;

    const/4 v2, 0x0

    iput-object v2, v0, LV/E0$a;->F:Ljava/lang/Object;

    iput-object v2, v0, LV/E0$a;->G:Ljava/lang/Object;

    iput v3, v0, LV/E0$a;->J:I

    invoke-interface {p2, p1, v0}, LV/j0;->R(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    return-object p2
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, LV/E0;->D:LV/d0;

    invoke-virtual {v0}, LV/d0;->d()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LV/E0;->D:LV/d0;

    invoke-virtual {v0}, LV/d0;->f()V

    return-void
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, LV/i0;->a(LV/j0;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->b(LV/j0;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->d(LV/j0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->c(LV/j0;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
