.class final LS/k1$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/k1$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:LS0/g0;

.field final synthetic H:Lz/l;

.field final synthetic I:Z

.field final synthetic J:Lx7/p;

.field final synthetic K:Lx7/p;

.field final synthetic L:Lx7/p;

.field final synthetic M:Lx7/p;

.field final synthetic N:Lx7/p;

.field final synthetic O:Lx7/p;

.field final synthetic P:Lx7/p;

.field final synthetic Q:Lo0/e2;

.field final synthetic R:LS/i1;


# direct methods
.method constructor <init>(Ljava/lang/String;ZZLS0/g0;Lz/l;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;LS/i1;)V
    .locals 0

    iput-object p1, p0, LS/k1$a$a;->D:Ljava/lang/String;

    iput-boolean p2, p0, LS/k1$a$a;->E:Z

    iput-boolean p3, p0, LS/k1$a$a;->F:Z

    iput-object p4, p0, LS/k1$a$a;->G:LS0/g0;

    iput-object p5, p0, LS/k1$a$a;->H:Lz/l;

    iput-boolean p6, p0, LS/k1$a$a;->I:Z

    iput-object p7, p0, LS/k1$a$a;->J:Lx7/p;

    iput-object p8, p0, LS/k1$a$a;->K:Lx7/p;

    iput-object p9, p0, LS/k1$a$a;->L:Lx7/p;

    iput-object p10, p0, LS/k1$a$a;->M:Lx7/p;

    iput-object p11, p0, LS/k1$a$a;->N:Lx7/p;

    iput-object p12, p0, LS/k1$a$a;->O:Lx7/p;

    iput-object p13, p0, LS/k1$a$a;->P:Lx7/p;

    iput-object p14, p0, LS/k1$a$a;->Q:Lo0/e2;

    iput-object p15, p0, LS/k1$a$a;->R:LS/i1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/p;LV/n;I)V
    .locals 25

    .prologue
    move-object/from16 v0, p0

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    invoke-interface {v4, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    move v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move/from16 v15, p3

    :goto_1
    and-int/lit8 v2, v15, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LV/n;->A()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)"

    const v5, -0x112dc373

    invoke-static {v5, v15, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, LS/j1;->a:LS/j1;

    iget-object v3, v0, LS/k1$a$a;->D:Ljava/lang/String;

    iget-boolean v5, v0, LS/k1$a$a;->E:Z

    iget-boolean v6, v0, LS/k1$a$a;->F:Z

    iget-object v7, v0, LS/k1$a$a;->G:LS0/g0;

    iget-object v8, v0, LS/k1$a$a;->H:Lz/l;

    iget-boolean v9, v0, LS/k1$a$a;->I:Z

    iget-object v10, v0, LS/k1$a$a;->J:Lx7/p;

    iget-object v11, v0, LS/k1$a$a;->K:Lx7/p;

    iget-object v12, v0, LS/k1$a$a;->L:Lx7/p;

    iget-object v13, v0, LS/k1$a$a;->M:Lx7/p;

    iget-object v14, v0, LS/k1$a$a;->N:Lx7/p;

    iget-object v1, v0, LS/k1$a$a;->O:Lx7/p;

    move/from16 v19, v15

    move-object v15, v1

    iget-object v1, v0, LS/k1$a$a;->P:Lx7/p;

    move-object/from16 v16, v1

    iget-object v1, v0, LS/k1$a$a;->Q:Lo0/e2;

    move-object/from16 v17, v1

    iget-object v1, v0, LS/k1$a$a;->R:LS/i1;

    move-object/from16 v18, v1

    shl-int/lit8 v1, v19, 0x3

    and-int/lit8 v22, v1, 0x70

    const/high16 v23, 0x6000000

    const/high16 v24, 0x30000

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v4, p1

    move-object/from16 v21, p2

    invoke-virtual/range {v2 .. v24}, LS/j1;->b(Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;LS/i1;LA/B;Lx7/p;LV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/p;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/k1$a$a;->a(Lx7/p;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
