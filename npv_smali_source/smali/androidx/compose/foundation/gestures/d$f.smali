.class final Landroidx/compose/foundation/gestures/d$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/d;->j(Lx/C;JLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx/C;

.field final synthetic J:J

.field final synthetic K:Ly7/L;


# direct methods
.method constructor <init>(Lx/C;JLy7/L;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/d$f;->I:Lx/C;

    iput-wide p2, p0, Landroidx/compose/foundation/gestures/d$f;->J:J

    iput-object p4, p0, Landroidx/compose/foundation/gestures/d$f;->K:Ly7/L;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/d$f;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/d$f;->H:Ljava/lang/Object;

    check-cast p1, Lx/r;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->I:Lx/C;

    iget-wide v3, p0, Landroidx/compose/foundation/gestures/d$f;->J:J

    invoke-virtual {v1, v3, v4}, Lx/C;->A(J)F

    move-result v6

    new-instance v9, Landroidx/compose/foundation/gestures/d$f$a;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->K:Ly7/L;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/d$f;->I:Lx/C;

    invoke-direct {v9, v1, v3, p1}, Landroidx/compose/foundation/gestures/d$f$a;-><init>(Ly7/L;Lx/C;Lx/r;)V

    iput v2, p0, Landroidx/compose/foundation/gestures/d$f;->G:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu/q0;->e(FFFLu/j;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/r;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/d$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/d$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/r;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f;->H(Lx/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Landroidx/compose/foundation/gestures/d$f;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->I:Lx/C;

    iget-wide v2, p0, Landroidx/compose/foundation/gestures/d$f;->J:J

    iget-object v4, p0, Landroidx/compose/foundation/gestures/d$f;->K:Ly7/L;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/d$f;-><init>(Lx/C;JLy7/L;Lm7/e;)V

    iput-object p1, v6, Landroidx/compose/foundation/gestures/d$f;->H:Ljava/lang/Object;

    return-object v6
.end method
