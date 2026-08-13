.class final LH/L$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/L;->l(Landroid/view/KeyEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/L$b$i;
    }
.end annotation


# instance fields
.field final synthetic D:LH/o;

.field final synthetic E:LH/L;

.field final synthetic F:Ly7/K;


# direct methods
.method constructor <init>(LH/o;LH/L;Ly7/K;)V
    .locals 0

    iput-object p1, p0, LH/L$b;->D:LH/o;

    iput-object p2, p0, LH/L$b;->E:LH/L;

    iput-object p3, p0, LH/L$b;->F:Ly7/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/E;)V
    .locals 3

    .prologue
    iget-object v0, p0, LH/L$b;->D:LH/o;

    sget-object v1, LH/L$b$i;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    invoke-static {}, LH/p;->b()V

    goto/16 :goto_5

    :pswitch_1
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->k()LH/Y;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LH/Y;->c()LS0/V;

    move-result-object p1

    if-eqz p1, :cond_3

    :goto_0
    iget-object v0, p0, LH/L$b;->E:LH/L;

    invoke-static {v0}, LH/L;->d(LH/L;)Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :pswitch_2
    iget-object v0, p0, LH/L$b;->E:LH/L;

    invoke-virtual {v0}, LH/L;->k()LH/Y;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LN/E;->Z()LS0/V;

    move-result-object p1

    invoke-virtual {v0, p1}, LH/Y;->b(LS0/V;)V

    :cond_0
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->k()LH/Y;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LH/Y;->g()LS0/V;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_3
    invoke-virtual {p1}, LN/b;->d()LN/b;

    goto/16 :goto_5

    :pswitch_4
    invoke-virtual {p1}, LN/b;->K()LN/b;

    move-result-object p1

    :goto_1
    check-cast p1, LN/E;

    :goto_2
    invoke-virtual {p1}, LN/b;->S()LN/b;

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual {p1}, LN/b;->L()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_6
    invoke-virtual {p1}, LN/E;->b0()LN/E;

    move-result-object p1

    goto :goto_2

    :pswitch_7
    invoke-virtual {p1}, LN/E;->c0()LN/E;

    move-result-object p1

    goto :goto_2

    :pswitch_8
    invoke-virtual {p1}, LN/b;->z()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_9
    invoke-virtual {p1}, LN/b;->Q()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_a
    invoke-virtual {p1}, LN/b;->O()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_b
    invoke-virtual {p1}, LN/b;->N()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_c
    invoke-virtual {p1}, LN/b;->M()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_d
    invoke-virtual {p1}, LN/b;->P()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_e
    invoke-virtual {p1}, LN/b;->D()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_f
    invoke-virtual {p1}, LN/b;->G()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_10
    invoke-virtual {p1}, LN/b;->J()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_11
    invoke-virtual {p1}, LN/b;->B()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_12
    invoke-virtual {p1}, LN/b;->I()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_13
    invoke-virtual {p1}, LN/b;->A()LN/b;

    move-result-object p1

    goto :goto_1

    :pswitch_14
    invoke-virtual {p1}, LN/b;->R()LN/b;

    goto/16 :goto_5

    :pswitch_15
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->i()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LH/L$b;->E:LH/L;

    new-instance v0, LS0/a;

    const-string v1, "\t"

    invoke-direct {v0, v1, v2}, LS0/a;-><init>(Ljava/lang/String;I)V

    :goto_3
    invoke-static {p1, v0}, LH/L;->a(LH/L;LS0/i;)V

    goto/16 :goto_5

    :cond_1
    iget-object p1, p0, LH/L$b;->F:Ly7/K;

    iput-boolean v1, p1, Ly7/K;->C:Z

    goto/16 :goto_5

    :pswitch_16
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LH/L$b;->E:LH/L;

    new-instance v0, LS0/a;

    const-string v1, "\n"

    invoke-direct {v0, v1, v2}, LS0/a;-><init>(Ljava/lang/String;I)V

    goto :goto_3

    :cond_2
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->j()LH/w;

    move-result-object p1

    invoke-virtual {p1}, LH/w;->l()Lx7/l;

    move-result-object p1

    iget-object v0, p0, LH/L$b;->E:LH/L;

    invoke-static {v0}, LH/L;->c(LH/L;)I

    move-result v0

    invoke-static {v0}, LS0/r;->j(I)LS0/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :pswitch_17
    sget-object v0, LH/L$b$h;->D:LH/L$b$h;

    invoke-virtual {p1, v0}, LN/E;->Y(Lx7/l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    :goto_4
    iget-object v0, p0, LH/L$b;->E:LH/L;

    invoke-static {v0, p1}, LH/L;->b(LH/L;Ljava/util/List;)V

    goto/16 :goto_5

    :pswitch_18
    sget-object v0, LH/L$b$g;->D:LH/L$b$g;

    invoke-virtual {p1, v0}, LN/E;->Y(Lx7/l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_4

    :pswitch_19
    sget-object v0, LH/L$b$f;->D:LH/L$b$f;

    invoke-virtual {p1, v0}, LN/E;->Y(Lx7/l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_4

    :pswitch_1a
    sget-object v0, LH/L$b$e;->D:LH/L$b$e;

    invoke-virtual {p1, v0}, LN/E;->Y(Lx7/l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_4

    :pswitch_1b
    sget-object v0, LH/L$b$d;->D:LH/L$b$d;

    invoke-virtual {p1, v0}, LN/E;->Y(Lx7/l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_4

    :pswitch_1c
    sget-object v0, LH/L$b$c;->D:LH/L$b$c;

    invoke-virtual {p1, v0}, LN/E;->Y(Lx7/l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_4

    :pswitch_1d
    invoke-virtual {p1}, LN/b;->K()LN/b;

    goto/16 :goto_5

    :pswitch_1e
    invoke-virtual {p1}, LN/b;->L()LN/b;

    goto :goto_5

    :pswitch_1f
    invoke-virtual {p1}, LN/b;->O()LN/b;

    goto :goto_5

    :pswitch_20
    invoke-virtual {p1}, LN/b;->N()LN/b;

    goto :goto_5

    :pswitch_21
    invoke-virtual {p1}, LN/b;->M()LN/b;

    goto :goto_5

    :pswitch_22
    invoke-virtual {p1}, LN/b;->P()LN/b;

    goto :goto_5

    :pswitch_23
    invoke-virtual {p1}, LN/E;->b0()LN/E;

    goto :goto_5

    :pswitch_24
    invoke-virtual {p1}, LN/E;->c0()LN/E;

    goto :goto_5

    :pswitch_25
    invoke-virtual {p1}, LN/b;->z()LN/b;

    goto :goto_5

    :pswitch_26
    invoke-virtual {p1}, LN/b;->Q()LN/b;

    goto :goto_5

    :pswitch_27
    invoke-virtual {p1}, LN/b;->D()LN/b;

    goto :goto_5

    :pswitch_28
    invoke-virtual {p1}, LN/b;->G()LN/b;

    goto :goto_5

    :pswitch_29
    invoke-virtual {p1}, LN/b;->J()LN/b;

    goto :goto_5

    :pswitch_2a
    invoke-virtual {p1}, LN/b;->B()LN/b;

    goto :goto_5

    :pswitch_2b
    sget-object v0, LH/L$b$b;->D:LH/L$b$b;

    invoke-virtual {p1, v0}, LN/b;->c(Lx7/l;)LN/b;

    goto :goto_5

    :pswitch_2c
    sget-object v0, LH/L$b$a;->D:LH/L$b$a;

    invoke-virtual {p1, v0}, LN/b;->b(Lx7/l;)LN/b;

    goto :goto_5

    :pswitch_2d
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->h()LN/F;

    move-result-object p1

    invoke-virtual {p1}, LN/F;->s()V

    goto :goto_5

    :pswitch_2e
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->h()LN/F;

    move-result-object p1

    invoke-virtual {p1}, LN/F;->T()V

    goto :goto_5

    :pswitch_2f
    iget-object p1, p0, LH/L$b;->E:LH/L;

    invoke-virtual {p1}, LH/L;->h()LN/F;

    move-result-object p1

    invoke-virtual {p1, v1}, LN/F;->o(Z)V

    :cond_3
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/E;

    invoke-virtual {p0, p1}, LH/L$b;->a(LN/E;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
