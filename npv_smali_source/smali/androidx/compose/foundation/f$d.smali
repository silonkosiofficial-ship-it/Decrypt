.class final Landroidx/compose/foundation/f$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/f;->g2(Lz0/K;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:J

.field final synthetic J:Landroidx/compose/foundation/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/f;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/f$d;->J:Landroidx/compose/foundation/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/f$d;->G:I

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

    iget-object p1, p0, Landroidx/compose/foundation/f$d;->H:Ljava/lang/Object;

    check-cast p1, Lx/t;

    iget-wide v3, p0, Landroidx/compose/foundation/f$d;->I:J

    iget-object v1, p0, Landroidx/compose/foundation/f$d;->J:Landroidx/compose/foundation/f;

    invoke-virtual {v1}, Landroidx/compose/foundation/a;->l2()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/f$d;->J:Landroidx/compose/foundation/f;

    iput v2, p0, Landroidx/compose/foundation/f$d;->G:I

    invoke-virtual {v1, p1, v3, v4, p0}, Landroidx/compose/foundation/a;->n2(Lx/t;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/t;JLm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/f$d;

    iget-object v1, p0, Landroidx/compose/foundation/f$d;->J:Landroidx/compose/foundation/f;

    invoke-direct {v0, v1, p4}, Landroidx/compose/foundation/f$d;-><init>(Landroidx/compose/foundation/f;Lm7/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/f$d;->H:Ljava/lang/Object;

    iput-wide p2, v0, Landroidx/compose/foundation/f$d;->I:J

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/f$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lx/t;

    check-cast p2, Ln0/g;

    invoke-virtual {p2}, Ln0/g;->v()J

    move-result-wide v0

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, v0, v1, p3}, Landroidx/compose/foundation/f$d;->H(Lx/t;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
