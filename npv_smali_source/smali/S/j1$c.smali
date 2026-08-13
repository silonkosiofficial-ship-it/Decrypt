.class final LS/j1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/j1;->b(Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;LS/i1;LA/B;Lx7/p;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Z

.field final synthetic F:Lz/j;

.field final synthetic G:LS/i1;

.field final synthetic H:Lo0/e2;


# direct methods
.method constructor <init>(ZZLz/j;LS/i1;Lo0/e2;)V
    .locals 0

    iput-boolean p1, p0, LS/j1$c;->D:Z

    iput-boolean p2, p0, LS/j1$c;->E:Z

    iput-object p3, p0, LS/j1$c;->F:Lz/j;

    iput-object p4, p0, LS/j1$c;->G:LS/i1;

    iput-object p5, p0, LS/j1$c;->H:Lo0/e2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 17

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)"

    const v4, -0x19f590cf

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v5, LS/j1;->a:LS/j1;

    iget-boolean v6, v0, LS/j1$c;->D:Z

    iget-boolean v7, v0, LS/j1$c;->E:Z

    iget-object v8, v0, LS/j1$c;->F:Lz/j;

    sget-object v9, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v10, v0, LS/j1$c;->G:LS/i1;

    iget-object v11, v0, LS/j1$c;->H:Lo0/e2;

    invoke-virtual {v5}, LS/j1;->i()F

    move-result v12

    invoke-virtual {v5}, LS/j1;->m()F

    move-result v13

    const v15, 0x6d80c00

    const/16 v16, 0x0

    move-object/from16 v14, p1

    invoke-virtual/range {v5 .. v16}, LS/j1;->a(ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFLV/n;II)V

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

    invoke-virtual {p0, p1, p2}, LS/j1$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
