.class public final Lw2/d$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw2/d;->c(Lo2/n;ZZLx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lo2/n;

.field final synthetic I:Z

.field final synthetic J:Z

.field final synthetic K:Lx7/l;


# direct methods
.method public constructor <init>(Lm7/e;Lo2/n;ZZLx7/l;)V
    .locals 0

    iput-object p2, p0, Lw2/d$a;->H:Lo2/n;

    iput-boolean p3, p0, Lw2/d$a;->I:Z

    iput-boolean p4, p0, Lw2/d$a;->J:Z

    iput-object p5, p0, Lw2/d$a;->K:Lx7/l;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw2/d$a;->G:I

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

    iget-object p1, p0, Lw2/d$a;->H:Lo2/n;

    iget-boolean v1, p0, Lw2/d$a;->I:Z

    new-instance v9, Lw2/d$c;

    iget-boolean v4, p0, Lw2/d$a;->J:Z

    const/4 v7, 0x0

    iget-object v8, p0, Lw2/d$a;->K:Lx7/l;

    move-object v3, v9

    move v5, v1

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Lw2/d$c;-><init>(ZZLo2/n;Lm7/e;Lx7/l;)V

    iput v2, p0, Lw2/d$a;->G:I

    invoke-virtual {p1, v1, v9, p0}, Lo2/n;->O(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw2/d$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lw2/d$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lw2/d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lw2/d$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, Lw2/d$a;

    iget-object v2, p0, Lw2/d$a;->H:Lo2/n;

    iget-boolean v3, p0, Lw2/d$a;->I:Z

    iget-boolean v4, p0, Lw2/d$a;->J:Z

    iget-object v5, p0, Lw2/d$a;->K:Lx7/l;

    move-object v0, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lw2/d$a;-><init>(Lm7/e;Lo2/n;ZZLx7/l;)V

    return-object p1
.end method
