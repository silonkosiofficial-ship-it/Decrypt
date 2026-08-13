.class final LS/K$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->a(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LS/K$a;->D:Ljava/lang/String;

    iput-object p2, p0, LS/K$a;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 26

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)"

    const v5, -0x6c6bf7d5

    invoke-static {v5, v2, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v14, v0, LS/K$a;->D:Ljava/lang/String;

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v3, v0, LS/K$a;->D:Ljava/lang/String;

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LS/K$a;->E:Ljava/lang/String;

    invoke-interface {v1, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, LS/K$a;->D:Ljava/lang/String;

    iget-object v5, v0, LS/K$a;->E:Ljava/lang/String;

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_3

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_4

    :cond_3
    new-instance v6, LS/K$a$a;

    invoke-direct {v6, v4, v5}, LS/K$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lx7/l;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v5, v6, v3, v4}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const/16 v24, 0x0

    const v25, 0x1fffc

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v22, v14

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v1, v22

    move-object/from16 v22, p1

    invoke-static/range {v1 .. v25}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/K$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
