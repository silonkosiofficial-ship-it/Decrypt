.class final LS/b$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/b;->c(Lx7/a;Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;JJJJFLandroidx/compose/ui/window/i;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lo0/e2;

.field final synthetic H:J

.field final synthetic I:F

.field final synthetic J:J

.field final synthetic K:J

.field final synthetic L:J

.field final synthetic M:Lx7/p;

.field final synthetic N:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;Lx7/p;Lo0/e2;JFJJJLx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/b$e;->D:Lx7/p;

    iput-object p2, p0, LS/b$e;->E:Lx7/p;

    iput-object p3, p0, LS/b$e;->F:Lx7/p;

    iput-object p4, p0, LS/b$e;->G:Lo0/e2;

    iput-wide p5, p0, LS/b$e;->H:J

    iput p7, p0, LS/b$e;->I:F

    iput-wide p8, p0, LS/b$e;->J:J

    iput-wide p10, p0, LS/b$e;->K:J

    iput-wide p12, p0, LS/b$e;->L:J

    iput-object p14, p0, LS/b$e;->M:Lx7/p;

    iput-object p15, p0, LS/b$e;->N:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 22

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move/from16 v1, p2

    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)"

    const v5, -0x6e701922

    invoke-static {v5, v1, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v1, LS/b$e$a;

    iget-object v3, v0, LS/b$e;->M:Lx7/p;

    iget-object v4, v0, LS/b$e;->N:Lx7/p;

    invoke-direct {v1, v3, v4}, LS/b$e$a;-><init>(Lx7/p;Lx7/p;)V

    const/16 v3, 0x36

    const v4, 0x455a457c

    const/4 v5, 0x1

    invoke-static {v4, v5, v1, v2, v3}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    iget-object v3, v0, LS/b$e;->D:Lx7/p;

    iget-object v4, v0, LS/b$e;->E:Lx7/p;

    iget-object v5, v0, LS/b$e;->F:Lx7/p;

    iget-object v6, v0, LS/b$e;->G:Lo0/e2;

    iget-wide v7, v0, LS/b$e;->H:J

    iget v9, v0, LS/b$e;->I:F

    sget-object v10, LU/g;->a:LU/g;

    invoke-virtual {v10}, LU/g;->a()LU/e;

    move-result-object v10

    const/4 v11, 0x6

    invoke-static {v10, v2, v11}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v10

    iget-wide v12, v0, LS/b$e;->J:J

    iget-wide v14, v0, LS/b$e;->K:J

    move-object/from16 p2, v1

    iget-wide v1, v0, LS/b$e;->L:J

    move-wide/from16 v16, v1

    const/16 v20, 0x0

    const/16 v21, 0x2

    const/4 v2, 0x0

    const/16 v19, 0x6

    move-object/from16 v18, p1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v21}, LS/b;->a(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;JFJJJJLV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/b$e;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
