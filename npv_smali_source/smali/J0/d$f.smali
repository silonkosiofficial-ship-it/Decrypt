.class final LJ0/d$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/d;-><init>(LK0/o;LY0/r;LW8/N;LJ0/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Z

.field H:I

.field synthetic I:F

.field final synthetic J:LJ0/d;


# direct methods
.method constructor <init>(LJ0/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LJ0/d$f;->J:LJ0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ0/d$f;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, LJ0/d$f;->G:Z

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget p1, p0, LJ0/d$f;->I:F

    iget-object v1, p0, LJ0/d$f;->J:LJ0/d;

    invoke-static {v1}, LJ0/d;->b(LJ0/d;)LK0/o;

    move-result-object v1

    invoke-static {v1}, LJ0/n;->c(LK0/o;)Lx7/p;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v3, p0, LJ0/d$f;->J:LJ0/d;

    invoke-static {v3}, LJ0/d;->b(LJ0/d;)LK0/o;

    move-result-object v3

    invoke-virtual {v3}, LK0/o;->w()LK0/k;

    move-result-object v3

    sget-object v4, LK0/r;->a:LK0/r;

    invoke-virtual {v4}, LK0/r;->I()LK0/v;

    move-result-object v4

    invoke-virtual {v3, v4}, LK0/k;->s(LK0/v;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LK0/i;

    invoke-virtual {v3}, LK0/i;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    neg-float p1, p1

    :cond_2
    const/4 v4, 0x0

    invoke-static {v4, p1}, Ln0/h;->a(FF)J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    iput-boolean v3, p0, LJ0/d$f;->G:Z

    iput v2, p0, LJ0/d$f;->H:I

    invoke-interface {v1, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move v0, v3

    :goto_0
    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result p1

    if-eqz v0, :cond_4

    neg-float p1, p1

    :cond_4
    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_5
    const-string p1, "Required value was null."

    invoke-static {p1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final H(FLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LJ0/d$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LJ0/d$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LJ0/d$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LJ0/d$f;->H(FLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LJ0/d$f;

    iget-object v1, p0, LJ0/d$f;->J:LJ0/d;

    invoke-direct {v0, v1, p2}, LJ0/d$f;-><init>(LJ0/d;Lm7/e;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, LJ0/d$f;->I:F

    return-object v0
.end method
