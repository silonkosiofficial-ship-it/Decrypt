.class final LS/T$H;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->l(Ljava/lang/Long;JILx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Long;

.field final synthetic E:J

.field final synthetic F:Lx7/l;

.field final synthetic G:Lx7/l;

.field final synthetic H:LT/f;

.field final synthetic I:LE7/i;

.field final synthetic J:LS/Q;

.field final synthetic K:LS/P0;

.field final synthetic L:LS/M;


# direct methods
.method constructor <init>(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;)V
    .locals 0

    iput-object p1, p0, LS/T$H;->D:Ljava/lang/Long;

    iput-wide p2, p0, LS/T$H;->E:J

    iput-object p4, p0, LS/T$H;->F:Lx7/l;

    iput-object p5, p0, LS/T$H;->G:Lx7/l;

    iput-object p6, p0, LS/T$H;->H:LT/f;

    iput-object p7, p0, LS/T$H;->I:LE7/i;

    iput-object p8, p0, LS/T$H;->J:LS/Q;

    iput-object p9, p0, LS/T$H;->K:LS/P0;

    iput-object p10, p0, LS/T$H;->L:LS/M;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/b;ILV/n;I)V
    .locals 14

    .prologue
    move-object v0, p0

    move/from16 v1, p2

    move-object/from16 v13, p3

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1452)"

    const v4, -0x1b67ab35

    move/from16 v5, p4

    invoke-static {v4, v5, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, LS/Y;->b:LS/Y$a;

    invoke-virtual {v2}, LS/Y$a;->b()I

    move-result v3

    invoke-static {v1, v3}, LS/Y;->f(II)Z

    move-result v3

    if-eqz v3, :cond_1

    const v1, -0x6f77b825

    invoke-interface {v13, v1}, LV/n;->T(I)V

    iget-object v1, v0, LS/T$H;->D:Ljava/lang/Long;

    iget-wide v2, v0, LS/T$H;->E:J

    iget-object v4, v0, LS/T$H;->F:Lx7/l;

    iget-object v5, v0, LS/T$H;->G:Lx7/l;

    iget-object v6, v0, LS/T$H;->H:LT/f;

    iget-object v7, v0, LS/T$H;->I:LE7/i;

    iget-object v8, v0, LS/T$H;->J:LS/Q;

    iget-object v9, v0, LS/T$H;->K:LS/P0;

    iget-object v10, v0, LS/T$H;->L:LS/M;

    const/4 v12, 0x0

    move-object/from16 v11, p3

    invoke-static/range {v1 .. v12}, LS/T;->q(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V

    :goto_0
    invoke-interface/range {p3 .. p3}, LV/n;->J()V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LS/Y$a;->a()I

    move-result v2

    invoke-static {v1, v2}, LS/Y;->f(II)Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, -0x6f776fac

    invoke-interface {v13, v1}, LV/n;->T(I)V

    iget-object v1, v0, LS/T$H;->D:Ljava/lang/Long;

    iget-object v2, v0, LS/T$H;->F:Lx7/l;

    iget-object v3, v0, LS/T$H;->H:LT/f;

    iget-object v4, v0, LS/T$H;->I:LE7/i;

    iget-object v5, v0, LS/T$H;->J:LS/Q;

    iget-object v6, v0, LS/T$H;->K:LS/P0;

    iget-object v7, v0, LS/T$H;->L:LS/M;

    const/4 v9, 0x0

    move-object/from16 v8, p3

    invoke-static/range {v1 .. v9}, LS/K;->a(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V

    goto :goto_0

    :cond_2
    const v1, -0x7f708543

    invoke-interface {v13, v1}, LV/n;->T(I)V

    goto :goto_0

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt/b;

    check-cast p2, LS/Y;

    invoke-virtual {p2}, LS/Y;->i()I

    move-result p2

    check-cast p3, LV/n;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LS/T$H;->a(Lt/b;ILV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
