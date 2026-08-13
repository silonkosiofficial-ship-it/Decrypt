.class final LC9/p$b;
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

.field final synthetic H:LC9/v;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Lx7/l;


# direct methods
.method constructor <init>(LC9/v;Ljava/lang/String;Lx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LC9/p$b;->H:LC9/v;

    iput-object p2, p0, LC9/p$b;->I:Ljava/lang/String;

    iput-object p3, p0, LC9/p$b;->J:Lx7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LC9/p$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LC9/p$b;->H:LC9/v;

    new-instance v0, LC9/H;

    iget-object v1, p0, LC9/p$b;->I:Ljava/lang/String;

    invoke-direct {v0, v1}, LC9/H;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LC9/p$b;->J:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LC9/H;->b()LC9/I;

    move-result-object v0

    invoke-virtual {p1, v0}, LC9/v;->f(LC9/I;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC9/p$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LC9/p$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LC9/p$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LC9/p$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LC9/p$b;

    iget-object v0, p0, LC9/p$b;->H:LC9/v;

    iget-object v1, p0, LC9/p$b;->I:Ljava/lang/String;

    iget-object v2, p0, LC9/p$b;->J:Lx7/l;

    invoke-direct {p1, v0, v1, v2, p2}, LC9/p$b;-><init>(LC9/v;Ljava/lang/String;Lx7/l;Lm7/e;)V

    return-object p1
.end method
