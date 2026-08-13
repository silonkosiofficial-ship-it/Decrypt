.class public final Lw2/d$c;
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
.field G:Ljava/lang/Object;

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Z

.field final synthetic K:Z

.field final synthetic L:Lo2/n;

.field final synthetic M:Lx7/l;


# direct methods
.method public constructor <init>(ZZLo2/n;Lm7/e;Lx7/l;)V
    .locals 0

    iput-boolean p1, p0, Lw2/d$c;->J:Z

    iput-boolean p2, p0, Lw2/d$c;->K:Z

    iput-object p3, p0, Lw2/d$c;->L:Lo2/n;

    iput-object p5, p0, Lw2/d$c;->M:Lx7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw2/d$c;->H:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lw2/d$c;->I:Ljava/lang/Object;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lw2/d$c;->I:Ljava/lang/Object;

    check-cast v1, Lo2/B;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v1, p0, Lw2/d$c;->G:Ljava/lang/Object;

    check-cast v1, Lo2/B$a;

    iget-object v4, p0, Lw2/d$c;->I:Ljava/lang/Object;

    check-cast v4, Lo2/B;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lw2/d$c;->G:Ljava/lang/Object;

    check-cast v1, Lo2/B$a;

    iget-object v5, p0, Lw2/d$c;->I:Ljava/lang/Object;

    check-cast v5, Lo2/B;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw2/d$c;->I:Ljava/lang/Object;

    check-cast p1, Lo2/B;

    iget-boolean v1, p0, Lw2/d$c;->J:Z

    if-eqz v1, :cond_d

    iget-boolean v1, p0, Lw2/d$c;->K:Z

    if-eqz v1, :cond_5

    sget-object v6, Lo2/B$a;->C:Lo2/B$a;

    goto :goto_0

    :cond_5
    sget-object v6, Lo2/B$a;->D:Lo2/B$a;

    :goto_0
    if-nez v1, :cond_9

    iput-object p1, p0, Lw2/d$c;->I:Ljava/lang/Object;

    iput-object v6, p0, Lw2/d$c;->G:Ljava/lang/Object;

    iput v5, p0, Lw2/d$c;->H:I

    invoke-interface {p1, p0}, Lo2/B;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v5, p1

    move-object p1, v1

    move-object v1, v6

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lw2/d$c;->L:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->r()Landroidx/room/c;

    move-result-object p1

    iput-object v5, p0, Lw2/d$c;->I:Ljava/lang/Object;

    iput-object v1, p0, Lw2/d$c;->G:Ljava/lang/Object;

    iput v4, p0, Lw2/d$c;->H:I

    invoke-virtual {p1, p0}, Landroidx/room/c;->w(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v4, v5

    :goto_2
    move-object v6, v1

    move-object v1, v4

    goto :goto_3

    :cond_8
    move-object v6, v1

    move-object v1, v5

    goto :goto_3

    :cond_9
    move-object v1, p1

    :goto_3
    new-instance p1, Lw2/d$c$a;

    iget-object v4, p0, Lw2/d$c;->M:Lx7/l;

    const/4 v5, 0x0

    invoke-direct {p1, v5, v4}, Lw2/d$c$a;-><init>(Lm7/e;Lx7/l;)V

    iput-object v1, p0, Lw2/d$c;->I:Ljava/lang/Object;

    iput-object v5, p0, Lw2/d$c;->G:Ljava/lang/Object;

    iput v3, p0, Lw2/d$c;->H:I

    invoke-interface {v1, v6, p1, p0}, Lo2/B;->c(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_4
    iget-boolean v3, p0, Lw2/d$c;->K:Z

    if-nez v3, :cond_e

    iput-object p1, p0, Lw2/d$c;->I:Ljava/lang/Object;

    iput v2, p0, Lw2/d$c;->H:I

    invoke-interface {v1, p0}, Lo2/B;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_b

    return-object v0

    :cond_b
    move-object v0, p1

    move-object p1, v1

    :goto_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Lw2/d$c;->L:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->r()Landroidx/room/c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/room/c;->q()V

    :cond_c
    move-object p1, v0

    goto :goto_6

    :cond_d
    const-string v0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lq2/j;

    invoke-interface {p1}, Lq2/j;->d()Ly2/b;

    move-result-object p1

    iget-object v0, p0, Lw2/d$c;->M:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_e
    :goto_6
    return-object p1
.end method

.method public final H(Lo2/B;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw2/d$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lw2/d$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lw2/d$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/B;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lw2/d$c;->H(Lo2/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lw2/d$c;

    iget-boolean v1, p0, Lw2/d$c;->J:Z

    iget-boolean v2, p0, Lw2/d$c;->K:Z

    iget-object v3, p0, Lw2/d$c;->L:Lo2/n;

    iget-object v5, p0, Lw2/d$c;->M:Lx7/l;

    move-object v0, v6

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lw2/d$c;-><init>(ZZLo2/n;Lm7/e;Lx7/l;)V

    iput-object p1, v6, Lw2/d$c;->I:Ljava/lang/Object;

    return-object v6
.end method
