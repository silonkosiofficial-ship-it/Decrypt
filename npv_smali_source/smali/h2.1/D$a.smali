.class final Lh2/D$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/D;-><init>(Lh2/E;Ljava/lang/Object;Lh2/O;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lx7/a;


# direct methods
.method constructor <init>(Lx7/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/D$a;->H:Lx7/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Lh2/D$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/D$a;->H:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lh2/D$a;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/D$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Lh2/D$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Lh2/D$a;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lh2/D$a;

    iget-object v1, p0, Lh2/D$a;->H:Lx7/a;

    invoke-direct {v0, v1, p1}, Lh2/D$a;-><init>(Lx7/a;Lm7/e;)V

    return-object v0
.end method
