.class final Landroidx/compose/foundation/a$e$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/a$e;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:Landroidx/compose/foundation/a;

.field final synthetic J:J

.field final synthetic K:Lz/l;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/a;JLz/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/a$e$a;->I:Landroidx/compose/foundation/a;

    iput-wide p2, p0, Landroidx/compose/foundation/a$e$a;->J:J

    iput-object p4, p0, Landroidx/compose/foundation/a$e$a;->K:Lz/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/a$e$a;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/a$e$a;->G:Ljava/lang/Object;

    check-cast v0, Lz/n$b;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/a$e$a;->I:Landroidx/compose/foundation/a;

    invoke-static {p1}, Landroidx/compose/foundation/a;->Z1(Landroidx/compose/foundation/a;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lv/k;->a()J

    move-result-wide v4

    iput v3, p0, Landroidx/compose/foundation/a$e$a;->H:I

    invoke-static {v4, v5, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    new-instance p1, Lz/n$b;

    iget-wide v3, p0, Landroidx/compose/foundation/a$e$a;->J:J

    const/4 v1, 0x0

    invoke-direct {p1, v3, v4, v1}, Lz/n$b;-><init>(JLy7/k;)V

    iget-object v1, p0, Landroidx/compose/foundation/a$e$a;->K:Lz/l;

    iput-object p1, p0, Landroidx/compose/foundation/a$e$a;->G:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/foundation/a$e$a;->H:I

    invoke-interface {v1, p1, p0}, Lz/l;->c(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/a$e$a;->I:Landroidx/compose/foundation/a;

    invoke-static {p1, v0}, Landroidx/compose/foundation/a;->e2(Landroidx/compose/foundation/a;Lz/n$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/a$e$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/a$e$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/a$e$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/a$e$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, Landroidx/compose/foundation/a$e$a;

    iget-object v1, p0, Landroidx/compose/foundation/a$e$a;->I:Landroidx/compose/foundation/a;

    iget-wide v2, p0, Landroidx/compose/foundation/a$e$a;->J:J

    iget-object v4, p0, Landroidx/compose/foundation/a$e$a;->K:Lz/l;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/a$e$a;-><init>(Landroidx/compose/foundation/a;JLz/l;Lm7/e;)V

    return-object p1
.end method
