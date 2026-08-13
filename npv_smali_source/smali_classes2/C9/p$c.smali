.class final LC9/p$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p;->g(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Le0/d;

.field final synthetic I:LV/G1;


# direct methods
.method constructor <init>(Le0/d;LV/G1;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LC9/p$c;->H:Le0/d;

    iput-object p2, p0, LC9/p$c;->I:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LC9/p$c;->G:I

    if-nez v0, :cond_4

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LC9/p$c;->I:LV/G1;

    invoke-static {p1}, LC9/p;->z(LV/G1;)LC9/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LC9/g;->k()LD9/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v0, v0, LD9/a;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LC9/g;->q()LC9/P;

    move-result-object v0

    if-eqz v0, :cond_2

    instance-of v1, v0, LC9/j;

    if-eqz v1, :cond_2

    check-cast v0, LC9/j;

    invoke-virtual {v0}, LC9/j;->b()Le0/d;

    move-result-object v0

    iget-object v1, p0, LC9/p$c;->H:Le0/d;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    new-instance v0, LC9/j;

    iget-object v1, p0, LC9/p$c;->H:Le0/d;

    invoke-direct {v0, v1}, LC9/j;-><init>(Le0/d;)V

    invoke-virtual {p1, v0}, LC9/g;->x(LC9/P;)V

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC9/p$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LC9/p$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LC9/p$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LC9/p$c;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LC9/p$c;

    iget-object v0, p0, LC9/p$c;->H:Le0/d;

    iget-object v1, p0, LC9/p$c;->I:LV/G1;

    invoke-direct {p1, v0, v1, p2}, LC9/p$c;-><init>(Le0/d;LV/G1;Lm7/e;)V

    return-object p1
.end method
