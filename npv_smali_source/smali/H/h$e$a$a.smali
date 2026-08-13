.class final LH/h$e$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$e$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/F;

.field final synthetic E:LH/w;

.field final synthetic F:Z

.field final synthetic G:Z

.field final synthetic H:Lx7/l;

.field final synthetic I:LS0/V;

.field final synthetic J:LS0/L;

.field final synthetic K:LY0/e;

.field final synthetic L:I


# direct methods
.method constructor <init>(LN/F;LH/w;ZZLx7/l;LS0/V;LS0/L;LY0/e;I)V
    .locals 0

    iput-object p1, p0, LH/h$e$a$a;->D:LN/F;

    iput-object p2, p0, LH/h$e$a$a;->E:LH/w;

    iput-boolean p3, p0, LH/h$e$a$a;->F:Z

    iput-boolean p4, p0, LH/h$e$a$a;->G:Z

    iput-object p5, p0, LH/h$e$a$a;->H:Lx7/l;

    iput-object p6, p0, LH/h$e$a$a;->I:LS0/V;

    iput-object p7, p0, LH/h$e$a$a;->J:LS0/L;

    iput-object p8, p0, LH/h$e$a$a;->K:LY0/e;

    iput p9, p0, LH/h$e$a$a;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"

    const v2, -0x15a57eaf

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, LH/h$e$a$a$a;

    iget-object v4, p0, LH/h$e$a$a;->E:LH/w;

    iget-object v5, p0, LH/h$e$a$a;->H:Lx7/l;

    iget-object v6, p0, LH/h$e$a$a;->I:LS0/V;

    iget-object v7, p0, LH/h$e$a$a;->J:LS0/L;

    iget-object v8, p0, LH/h$e$a$a;->K:LY0/e;

    iget v9, p0, LH/h$e$a$a;->L:I

    move-object v3, p2

    invoke-direct/range {v3 .. v9}, LH/h$e$a$a$a;-><init>(LH/w;Lx7/l;LS0/V;LS0/L;LY0/e;I)V

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LV/k;->a(LV/n;I)I

    move-result v2

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {p1, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v4, LF0/g;->a:LF0/g$a;

    invoke-virtual {v4}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, p2, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object p2

    invoke-static {v5, v3, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object p2

    invoke-interface {v5}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, p2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object p2

    invoke-static {v5, v0, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-interface {p1}, LV/n;->Q()V

    iget-object p2, p0, LH/h$e$a$a;->D:LN/F;

    iget-object v0, p0, LH/h$e$a$a;->E:LH/w;

    invoke-virtual {v0}, LH/w;->d()LH/l;

    move-result-object v0

    sget-object v2, LH/l;->C:LH/l;

    if-eq v0, v2, :cond_7

    iget-object v0, p0, LH/h$e$a$a;->E:LH/w;

    invoke-virtual {v0}, LH/w;->i()LD0/t;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, LH/h$e$a$a;->E:LH/w;

    invoke-virtual {v0}, LH/w;->i()LD0/t;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, LH/h$e$a$a;->F:Z

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_2

    :cond_7
    move v0, v1

    :goto_2
    invoke-static {p2, v0, p1, v1}, LH/h;->h(LN/F;ZLV/n;I)V

    iget-object p2, p0, LH/h$e$a$a;->E:LH/w;

    invoke-virtual {p2}, LH/w;->d()LH/l;

    move-result-object p2

    sget-object v0, LH/l;->E:LH/l;

    if-ne p2, v0, :cond_8

    iget-boolean p2, p0, LH/h$e$a$a;->G:Z

    if-nez p2, :cond_8

    iget-boolean p2, p0, LH/h$e$a$a;->F:Z

    if-eqz p2, :cond_8

    const p2, -0x1f0292

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object p2, p0, LH/h$e$a$a;->D:LN/F;

    invoke-static {p2, p1, v1}, LH/h;->e(LN/F;LV/n;I)V

    :goto_3
    invoke-interface {p1}, LV/n;->J()V

    goto :goto_4

    :cond_8
    const p2, -0x1dd642

    invoke-interface {p1, p2}, LV/n;->T(I)V

    goto :goto_3

    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_5
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LH/h$e$a$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
