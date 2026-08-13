.class final Lo2/D$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;->k(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lo2/D;


# direct methods
.method constructor <init>(Lo2/D;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lo2/D$f;->I:Lo2/D;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo2/D$f;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lo2/D$f;->H:Ljava/lang/Object;

    check-cast v1, Lo2/B;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo2/D$f;->H:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lo2/B;

    iput-object v1, p0, Lo2/D$f;->H:Ljava/lang/Object;

    iput v3, p0, Lo2/D$f;->G:I

    invoke-interface {v1, p0}, Lo2/B;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_4
    :try_start_1
    sget-object p1, Lo2/B$a;->D:Lo2/B$a;

    new-instance v3, Lo2/D$f$a;

    iget-object v4, p0, Lo2/D$f;->I:Lo2/D;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lo2/D$f$a;-><init>(Lo2/D;Lm7/e;)V

    iput-object v5, p0, Lo2/D$f;->H:Ljava/lang/Object;

    iput v2, p0, Lo2/D$f;->G:I

    invoke-interface {v1, p1, v3, p0}, Lo2/B;->c(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Ljava/util/Set;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final H(Lo2/B;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo2/D$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lo2/D$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lo2/D$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/B;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lo2/D$f;->H(Lo2/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lo2/D$f;

    iget-object v1, p0, Lo2/D$f;->I:Lo2/D;

    invoke-direct {v0, v1, p2}, Lo2/D$f;-><init>(Lo2/D;Lm7/e;)V

    iput-object p1, v0, Lo2/D$f;->H:Ljava/lang/Object;

    return-object v0
.end method
