.class final Laa/f$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f;->j(Ljava/lang/String;Ljava/lang/String;Laa/r;Lx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:Lx7/l;

.field final synthetic J:Laa/r;

.field final synthetic K:Ljava/lang/String;


# direct methods
.method constructor <init>(Lx7/l;Laa/r;Ljava/lang/String;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Laa/f$f;->I:Lx7/l;

    iput-object p2, p0, Laa/f$f;->J:Laa/r;

    iput-object p3, p0, Laa/f$f;->K:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Laa/f$f;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Laa/f$f;->G:Ljava/lang/Object;

    check-cast v0, Lx7/l;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Laa/f$f;->I:Lx7/l;

    iget-object v1, p0, Laa/f$f;->J:Laa/r;

    iget-object v3, p0, Laa/f$f;->K:Ljava/lang/String;

    iput-object p1, p0, Laa/f$f;->G:Ljava/lang/Object;

    iput v2, p0, Laa/f$f;->H:I

    invoke-interface {v1, v3, p0}, Laa/r;->b(Ljava/lang/String;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Laa/f$f;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Laa/f$f;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Laa/f$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Laa/f$f;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Laa/f$f;

    iget-object v1, p0, Laa/f$f;->I:Lx7/l;

    iget-object v2, p0, Laa/f$f;->J:Laa/r;

    iget-object v3, p0, Laa/f$f;->K:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Laa/f$f;-><init>(Lx7/l;Laa/r;Ljava/lang/String;Lm7/e;)V

    return-object v0
.end method
