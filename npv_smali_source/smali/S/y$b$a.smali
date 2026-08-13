.class final LS/y$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:J

.field final synthetic I:LS/y;


# direct methods
.method constructor <init>(LS/y;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/y$b$a;->I:LS/y;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LS/y$b$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-wide v0, p0, LS/y$b$a;->H:J

    iget-object p1, p0, LS/y$b$a;->I:LS/y;

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v2

    invoke-static {p1, v2}, LS/y;->f2(LS/y;F)V

    iget-object p1, p0, LS/y$b$a;->I:LS/y;

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result v0

    invoke-static {p1, v0}, LS/y;->g2(LS/y;F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lx/t;JLm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LS/y$b$a;

    iget-object v0, p0, LS/y$b$a;->I:LS/y;

    invoke-direct {p1, v0, p4}, LS/y$b$a;-><init>(LS/y;Lm7/e;)V

    iput-wide p2, p1, LS/y$b$a;->H:J

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/y$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, v0, v1, p3}, LS/y$b$a;->H(Lx/t;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
