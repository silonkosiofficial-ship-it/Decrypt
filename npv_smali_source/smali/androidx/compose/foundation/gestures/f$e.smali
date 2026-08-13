.class final Landroidx/compose/foundation/gestures/f$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;->y2(Lz0/p;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Landroidx/compose/foundation/gestures/f;

.field final synthetic I:J


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/f;JLm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$e;->H:Landroidx/compose/foundation/gestures/f;

    iput-wide p2, p0, Landroidx/compose/foundation/gestures/f$e;->I:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/f$e;->G:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/f$e;->H:Landroidx/compose/foundation/gestures/f;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/f;->w2(Landroidx/compose/foundation/gestures/f;)Lx/C;

    move-result-object p1

    sget-object v1, Lv/L;->D:Lv/L;

    new-instance v3, Landroidx/compose/foundation/gestures/f$e$a;

    iget-wide v4, p0, Landroidx/compose/foundation/gestures/f$e;->I:J

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Landroidx/compose/foundation/gestures/f$e$a;-><init>(JLm7/e;)V

    iput v2, p0, Landroidx/compose/foundation/gestures/f$e;->G:I

    invoke-virtual {p1, v1, v3, p0}, Lx/C;->v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/f$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/f$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$e;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, Landroidx/compose/foundation/gestures/f$e;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$e;->H:Landroidx/compose/foundation/gestures/f;

    iget-wide v1, p0, Landroidx/compose/foundation/gestures/f$e;->I:J

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/f$e;-><init>(Landroidx/compose/foundation/gestures/f;JLm7/e;)V

    return-object p1
.end method
