.class final LT/A$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/A;->a(LT/G;Ljava/lang/String;Lx7/p;LS0/g0;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZZZLz/j;LA/B;LS/i1;Lx7/p;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM0/P;

.field final synthetic E:LM0/P;

.field final synthetic F:F

.field final synthetic G:LV/G1;

.field final synthetic H:Lx7/p;

.field final synthetic I:Z

.field final synthetic J:LV/G1;


# direct methods
.method constructor <init>(LM0/P;LM0/P;FLV/G1;Lx7/p;ZLV/G1;)V
    .locals 0

    iput-object p1, p0, LT/A$d;->D:LM0/P;

    iput-object p2, p0, LT/A$d;->E:LM0/P;

    iput p3, p0, LT/A$d;->F:F

    iput-object p4, p0, LT/A$d;->G:LV/G1;

    iput-object p5, p0, LT/A$d;->H:Lx7/p;

    iput-boolean p6, p0, LT/A$d;->I:Z

    iput-object p7, p0, LT/A$d;->J:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 36

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)"

    const v4, -0x49b4cc60

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LT/A$d;->D:LM0/P;

    iget-object v2, v0, LT/A$d;->E:LM0/P;

    iget v3, v0, LT/A$d;->F:F

    invoke-static {v1, v2, v3}, LM0/Q;->c(LM0/P;LM0/P;F)LM0/P;

    move-result-object v4

    iget-boolean v1, v0, LT/A$d;->I:Z

    iget-object v2, v0, LT/A$d;->J:LV/G1;

    if-eqz v1, :cond_3

    invoke-interface {v2}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v5

    const v34, 0xfffffe

    const/16 v35, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v4 .. v35}, LM0/P;->c(LM0/P;JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Lq0/h;IIJLX0/r;LM0/A;LX0/h;IILX0/t;ILjava/lang/Object;)LM0/P;

    move-result-object v4

    :cond_3
    move-object v7, v4

    iget-object v1, v0, LT/A$d;->G:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v5

    iget-object v8, v0, LT/A$d;->H:Lx7/p;

    const/4 v10, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v5 .. v10}, LT/A;->f(JLM0/P;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LT/A$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
