.class final Lz9/W$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/W;->g()Ly9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lz9/W;


# direct methods
.method constructor <init>(Lz9/W;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lz9/W$a;->G:Lz9/W;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lz9/W$a;->E:I

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

    iget-object p1, p0, Lz9/W$a;->F:Ljava/lang/Object;

    check-cast p1, Li7/c;

    iget-object v1, p0, Lz9/W$a;->G:Lz9/W;

    invoke-static {v1}, Lz9/W;->a(Lz9/W;)Lz9/a;

    move-result-object v1

    invoke-virtual {v1}, Lz9/a;->D()B

    move-result v1

    if-ne v1, v2, :cond_2

    iget-object p1, p0, Lz9/W$a;->G:Lz9/W;

    invoke-static {p1, v2}, Lz9/W;->d(Lz9/W;Z)Ly9/F;

    move-result-object p1

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    iget-object p1, p0, Lz9/W$a;->G:Lz9/W;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lz9/W;->d(Lz9/W;Z)Ly9/F;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 v3, 0x6

    if-ne v1, v3, :cond_5

    iget-object v1, p0, Lz9/W$a;->G:Lz9/W;

    iput v2, p0, Lz9/W$a;->E:I

    invoke-static {v1, p1, p0}, Lz9/W;->c(Lz9/W;Li7/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ly9/i;

    goto :goto_1

    :cond_5
    const/16 p1, 0x8

    if-ne v1, p1, :cond_6

    iget-object p1, p0, Lz9/W$a;->G:Lz9/W;

    invoke-static {p1}, Lz9/W;->b(Lz9/W;)Ly9/i;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_6
    iget-object p1, p0, Lz9/W$a;->G:Lz9/W;

    invoke-static {p1}, Lz9/W;->a(Lz9/W;)Lz9/a;

    move-result-object v0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "Can\'t begin reading element, unexpected token"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final E(Li7/c;Li7/M;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p2, Lz9/W$a;

    iget-object v0, p0, Lz9/W$a;->G:Lz9/W;

    invoke-direct {p2, v0, p3}, Lz9/W$a;-><init>(Lz9/W;Lm7/e;)V

    iput-object p1, p2, Lz9/W$a;->F:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {p2, p1}, Lz9/W$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/c;

    check-cast p2, Li7/M;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lz9/W$a;->E(Li7/c;Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
