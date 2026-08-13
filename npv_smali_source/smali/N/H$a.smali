.class final LN/H$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H;->a(LN/F;Lw/i;)Lx7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/F;

.field final synthetic E:Lw/i;


# direct methods
.method constructor <init>(LN/F;Lw/i;)V
    .locals 0

    iput-object p1, p0, LN/H$a;->D:LN/F;

    iput-object p2, p0, LN/H$a;->E:Lw/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lw/g;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v1}, LN/F;->P()LS0/g0;

    move-result-object v1

    instance-of v1, v1, LS0/N;

    iget-object v2, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v2}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->h(J)Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    iget-object v4, v0, LN/H$a;->E:Lw/i;

    sget-object v5, LH/C;->D:LH/C;

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    iget-object v7, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v7}, LN/F;->D()Z

    move-result v7

    if-eqz v7, :cond_0

    if-nez v1, :cond_0

    move v11, v3

    goto :goto_0

    :cond_0
    move v11, v6

    :goto_0
    iget-object v7, v0, LN/H$a;->D:LN/F;

    new-instance v9, LH/g;

    invoke-direct {v9, v5}, LH/g;-><init>(LH/C;)V

    new-instance v13, LN/H$a$a;

    invoke-direct {v13, v4, v7}, LN/H$a$a;-><init>(Lw/i;LN/F;)V

    const/16 v14, 0xa

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v15}, Lw/g;->d(Lw/g;Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;ILjava/lang/Object;)V

    iget-object v4, v0, LN/H$a;->E:Lw/i;

    sget-object v5, LH/C;->E:LH/C;

    if-eqz v2, :cond_1

    if-nez v1, :cond_1

    move v10, v3

    goto :goto_1

    :cond_1
    move v10, v6

    :goto_1
    iget-object v1, v0, LN/H$a;->D:LN/F;

    new-instance v8, LH/g;

    invoke-direct {v8, v5}, LH/g;-><init>(LH/C;)V

    new-instance v12, LN/H$a$b;

    invoke-direct {v12, v4, v1}, LN/H$a$b;-><init>(Lw/i;LN/F;)V

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v14}, Lw/g;->d(Lw/g;Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;ILjava/lang/Object;)V

    iget-object v1, v0, LN/H$a;->E:Lw/i;

    sget-object v2, LH/C;->F:LH/C;

    iget-object v4, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v4}, LN/F;->D()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v4}, LN/F;->y()Landroidx/compose/ui/platform/m0;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v4}, Landroidx/compose/ui/platform/m0;->c()Z

    move-result v4

    if-ne v4, v3, :cond_2

    move v10, v3

    goto :goto_2

    :cond_2
    move v10, v6

    :goto_2
    iget-object v4, v0, LN/H$a;->D:LN/F;

    new-instance v8, LH/g;

    invoke-direct {v8, v2}, LH/g;-><init>(LH/C;)V

    new-instance v12, LN/H$a$c;

    invoke-direct {v12, v1, v4}, LN/H$a$c;-><init>(Lw/i;LN/F;)V

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v14}, Lw/g;->d(Lw/g;Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;ILjava/lang/Object;)V

    iget-object v1, v0, LN/H$a;->E:Lw/i;

    sget-object v2, LH/C;->G:LH/C;

    iget-object v4, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v4}, LN/F;->O()LS0/V;

    move-result-object v4

    invoke-virtual {v4}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->j(J)I

    move-result v4

    iget-object v5, v0, LN/H$a;->D:LN/F;

    invoke-virtual {v5}, LN/F;->O()LS0/V;

    move-result-object v5

    invoke-virtual {v5}, LS0/V;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v4, v5, :cond_3

    move v10, v3

    goto :goto_3

    :cond_3
    move v10, v6

    :goto_3
    iget-object v3, v0, LN/H$a;->D:LN/F;

    new-instance v8, LH/g;

    invoke-direct {v8, v2}, LH/g;-><init>(LH/C;)V

    new-instance v12, LN/H$a$d;

    invoke-direct {v12, v1, v3}, LN/H$a$d;-><init>(Lw/i;LN/F;)V

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v14}, Lw/g;->d(Lw/g;Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/g;

    invoke-virtual {p0, p1}, LN/H$a;->a(Lw/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
