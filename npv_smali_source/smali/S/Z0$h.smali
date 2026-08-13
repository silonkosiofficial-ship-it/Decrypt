.class final LS/Z0$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0;->d(LS/U0;Landroidx/compose/ui/d;ZLo0/e2;JJJJJLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:LS/U0;

.field final synthetic F:Ljava/lang/String;


# direct methods
.method constructor <init>(JLS/U0;Ljava/lang/String;)V
    .locals 0

    iput-wide p1, p0, LS/Z0$h;->D:J

    iput-object p3, p0, LS/Z0$h;->E:LS/U0;

    iput-object p4, p0, LS/Z0$h;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v13, p1

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)"

    const v4, -0x5227657f

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LS/l;->a:LS/l;

    iget-wide v4, v0, LS/Z0$h;->D:J

    const/16 v11, 0x6000

    const/16 v12, 0xd

    const-wide/16 v2, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object/from16 v10, p1

    invoke-virtual/range {v1 .. v12}, LS/l;->s(JJJJLV/n;II)LS/k;

    move-result-object v5

    iget-object v1, v0, LS/Z0$h;->E:LS/U0;

    invoke-interface {v13, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LS/Z0$h;->E:LS/U0;

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, LS/Z0$h$a;

    invoke-direct {v3, v2}, LS/Z0$h$a;-><init>(LS/U0;)V

    invoke-interface {v13, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v1, v3

    check-cast v1, Lx7/a;

    new-instance v2, LS/Z0$h$b;

    iget-object v3, v0, LS/Z0$h;->F:Ljava/lang/String;

    invoke-direct {v2, v3}, LS/Z0$h$b;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x36

    const v4, 0x1f0f8424

    const/4 v6, 0x1

    invoke-static {v4, v6, v2, v13, v3}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v10

    const/high16 v12, 0x30000000

    const/16 v14, 0x1ee

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v11, p1

    move v13, v14

    invoke-static/range {v1 .. v13}, LS/n;->c(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/k;LS/m;Lv/g;LA/B;Lz/l;Lx7/q;LV/n;II)V

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

    invoke-virtual {p0, p1, p2}, LS/Z0$h;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
