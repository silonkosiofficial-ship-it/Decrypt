.class final LB/D$h;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/D;->J(IILm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LB/D;

.field final synthetic I:I

.field final synthetic J:I


# direct methods
.method constructor <init>(LB/D;IILm7/e;)V
    .locals 0

    iput-object p1, p0, LB/D$h;->H:LB/D;

    iput p2, p0, LB/D$h;->I:I

    iput p3, p0, LB/D$h;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LB/D$h;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LB/D$h;->H:LB/D;

    iget v0, p0, LB/D$h;->I:I

    iget v1, p0, LB/D$h;->J:I

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, LB/D;->N(IIZ)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lx/w;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LB/D$h;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LB/D$h;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LB/D$h;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/w;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LB/D$h;->H(Lx/w;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LB/D$h;

    iget-object v0, p0, LB/D$h;->H:LB/D;

    iget v1, p0, LB/D$h;->I:I

    iget v2, p0, LB/D$h;->J:I

    invoke-direct {p1, v0, v1, v2, p2}, LB/D$h;-><init>(LB/D;IILm7/e;)V

    return-object p1
.end method
