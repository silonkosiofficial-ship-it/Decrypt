.class final Lx/C$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/C;->n(JLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:J

.field J:I

.field private synthetic K:Ljava/lang/Object;

.field final synthetic L:Lx/C;

.field final synthetic M:Ly7/N;

.field final synthetic N:J


# direct methods
.method constructor <init>(Lx/C;Ly7/N;JLm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/C$b;->L:Lx/C;

    iput-object p2, p0, Lx/C$b;->M:Ly7/N;

    iput-wide p3, p0, Lx/C$b;->N:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/C$b;->J:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lx/C$b;->I:J

    iget-object v2, p0, Lx/C$b;->H:Ljava/lang/Object;

    check-cast v2, Ly7/N;

    iget-object v3, p0, Lx/C$b;->G:Ljava/lang/Object;

    check-cast v3, Lx/C;

    iget-object v4, p0, Lx/C$b;->K:Ljava/lang/Object;

    check-cast v4, Lx/C;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx/C$b;->K:Ljava/lang/Object;

    check-cast p1, Lx/r;

    new-instance v1, Lx/C$b$a;

    iget-object v3, p0, Lx/C$b;->L:Lx/C;

    invoke-direct {v1, v3, p1}, Lx/C$b$a;-><init>(Lx/C;Lx/r;)V

    iget-object v3, p0, Lx/C$b;->L:Lx/C;

    iget-object p1, p0, Lx/C$b;->M:Ly7/N;

    iget-wide v4, p0, Lx/C$b;->N:J

    invoke-static {v3}, Lx/C;->a(Lx/C;)Lx/p;

    move-result-object v6

    iget-wide v7, p1, Ly7/N;->C:J

    invoke-static {v3, v4, v5}, Lx/C;->l(Lx/C;J)F

    move-result v4

    invoke-virtual {v3, v4}, Lx/C;->t(F)F

    move-result v4

    iput-object v3, p0, Lx/C$b;->K:Ljava/lang/Object;

    iput-object v3, p0, Lx/C$b;->G:Ljava/lang/Object;

    iput-object p1, p0, Lx/C$b;->H:Ljava/lang/Object;

    iput-wide v7, p0, Lx/C$b;->I:J

    iput v2, p0, Lx/C$b;->J:I

    invoke-interface {v6, v1, v4, p0}, Lx/p;->b(Lx/w;FLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v2, p1

    move-object p1, v1

    move-object v4, v3

    move-wide v0, v7

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v4, p1}, Lx/C;->t(F)F

    move-result p1

    invoke-static {v3, v0, v1, p1}, Lx/C;->m(Lx/C;JF)J

    move-result-wide v0

    iput-wide v0, v2, Ly7/N;->C:J

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/r;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/C$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/C$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/C$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/r;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/C$b;->H(Lx/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lx/C$b;

    iget-object v1, p0, Lx/C$b;->L:Lx/C;

    iget-object v2, p0, Lx/C$b;->M:Ly7/N;

    iget-wide v3, p0, Lx/C$b;->N:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lx/C$b;-><init>(Lx/C;Ly7/N;JLm7/e;)V

    iput-object p1, v6, Lx/C$b;->K:Ljava/lang/Object;

    return-object v6
.end method
