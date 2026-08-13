.class final Lo2/D$m$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D$m;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/D$m$a$a;
    }
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field K:I

.field L:I

.field M:I

.field final synthetic N:Lo2/D;

.field final synthetic O:Lo2/B;


# direct methods
.method constructor <init>(Lo2/D;Lo2/B;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lo2/D$m$a;->N:Lo2/D;

    iput-object p2, p0, Lo2/D$m$a;->O:Lo2/B;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo2/D$m$a;->M:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget v1, p0, Lo2/D$m$a;->L:I

    iget v4, p0, Lo2/D$m$a;->K:I

    iget v5, p0, Lo2/D$m$a;->J:I

    iget-object v6, p0, Lo2/D$m$a;->I:Ljava/lang/Object;

    check-cast v6, Lo2/B;

    iget-object v7, p0, Lo2/D$m$a;->H:Ljava/lang/Object;

    check-cast v7, Lo2/D;

    iget-object v8, p0, Lo2/D$m$a;->G:Ljava/lang/Object;

    check-cast v8, [Lo2/i$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo2/D$m$a;->N:Lo2/D;

    invoke-static {p1}, Lo2/D;->c(Lo2/D;)Lo2/i;

    move-result-object p1

    invoke-virtual {p1}, Lo2/i;->b()[Lo2/i$a;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v1, p0, Lo2/D$m$a;->N:Lo2/D;

    iget-object v4, p0, Lo2/D$m$a;->O:Lo2/B;

    array-length v5, p1

    const/4 v6, 0x0

    move-object v8, p1

    move-object v7, v1

    move-object p1, v4

    move v1, v5

    move v4, v6

    :goto_0
    if-ge v4, v1, :cond_6

    aget-object v5, v8, v4

    add-int/lit8 v9, v6, 0x1

    sget-object v10, Lo2/D$m$a$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v10, v5

    if-eq v5, v2, :cond_5

    const/4 v10, 0x3

    if-eq v5, v10, :cond_3

    move v6, v9

    goto :goto_2

    :cond_3
    iput-object v8, p0, Lo2/D$m$a;->G:Ljava/lang/Object;

    iput-object v7, p0, Lo2/D$m$a;->H:Ljava/lang/Object;

    iput-object p1, p0, Lo2/D$m$a;->I:Ljava/lang/Object;

    iput v9, p0, Lo2/D$m$a;->J:I

    iput v4, p0, Lo2/D$m$a;->K:I

    iput v1, p0, Lo2/D$m$a;->L:I

    iput v2, p0, Lo2/D$m$a;->M:I

    invoke-static {v7, p1, v6, p0}, Lo2/D;->g(Lo2/D;Lo2/k;ILm7/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    move-object v6, p1

    move v5, v9

    :goto_1
    move-object p1, v6

    move v6, v5

    goto :goto_2

    :cond_5
    iput-object v8, p0, Lo2/D$m$a;->G:Ljava/lang/Object;

    iput-object v7, p0, Lo2/D$m$a;->H:Ljava/lang/Object;

    iput-object p1, p0, Lo2/D$m$a;->I:Ljava/lang/Object;

    iput v9, p0, Lo2/D$m$a;->J:I

    iput v4, p0, Lo2/D$m$a;->K:I

    iput v1, p0, Lo2/D$m$a;->L:I

    iput v3, p0, Lo2/D$m$a;->M:I

    invoke-static {v7, p1, v6, p0}, Lo2/D;->f(Lo2/D;Lo2/k;ILm7/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :goto_2
    add-int/2addr v4, v3

    goto :goto_0

    :cond_6
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lo2/A;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo2/D$m$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lo2/D$m$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lo2/D$m$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/A;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lo2/D$m$a;->H(Lo2/A;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, Lo2/D$m$a;

    iget-object v0, p0, Lo2/D$m$a;->N:Lo2/D;

    iget-object v1, p0, Lo2/D$m$a;->O:Lo2/B;

    invoke-direct {p1, v0, v1, p2}, Lo2/D$m$a;-><init>(Lo2/D;Lo2/B;Lm7/e;)V

    return-object p1
.end method
