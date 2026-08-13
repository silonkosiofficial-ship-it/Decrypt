.class final LS/g1$c$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/g1$c$a;->a(LD0/j0;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:LD0/j0;

.field final synthetic F:Lx7/p;

.field final synthetic G:Ly7/M;

.field final synthetic H:J

.field final synthetic I:I

.field final synthetic J:Lx7/q;

.field final synthetic K:Ljava/util/List;

.field final synthetic L:I


# direct methods
.method constructor <init>(Ljava/util/List;LD0/j0;Lx7/p;Ly7/M;JILx7/q;Ljava/util/List;I)V
    .locals 0

    iput-object p1, p0, LS/g1$c$a$a;->D:Ljava/util/List;

    iput-object p2, p0, LS/g1$c$a$a;->E:LD0/j0;

    iput-object p3, p0, LS/g1$c$a$a;->F:Lx7/p;

    iput-object p4, p0, LS/g1$c$a$a;->G:Ly7/M;

    iput-wide p5, p0, LS/g1$c$a$a;->H:J

    iput p7, p0, LS/g1$c$a$a;->I:I

    iput-object p8, p0, LS/g1$c$a$a;->J:Lx7/q;

    iput-object p9, p0, LS/g1$c$a$a;->K:Ljava/util/List;

    iput p10, p0, LS/g1$c$a$a;->L:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 24

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LS/g1$c$a$a;->D:Ljava/util/List;

    iget-object v2, v0, LS/g1$c$a$a;->G:Ly7/M;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, LD0/X;

    iget v6, v2, Ly7/M;->C:I

    mul-int v9, v5, v6

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v13}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, v0, LS/g1$c$a$a;->E:LD0/j0;

    sget-object v2, LS/h1;->D:LS/h1;

    iget-object v3, v0, LS/g1$c$a$a;->F:Lx7/p;

    invoke-interface {v1, v2, v3}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v1

    iget-wide v2, v0, LS/g1$c$a$a;->H:J

    iget v13, v0, LS/g1$c$a$a;->I:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_1

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, LD0/G;

    const/16 v11, 0xb

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v5, v2

    move-object v4, v12

    move-object/from16 v12, v16

    invoke-static/range {v5 .. v12}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v5

    invoke-interface {v4, v5, v6}, LD0/G;->U(J)LD0/X;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, LD0/X;->w0()I

    move-result v4

    sub-int v20, v13, v4

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, p1

    invoke-static/range {v17 .. v23}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, v0, LS/g1$c$a$a;->E:LD0/j0;

    sget-object v2, LS/h1;->E:LS/h1;

    new-instance v3, LS/g1$c$a$a$a;

    iget-object v4, v0, LS/g1$c$a$a;->J:Lx7/q;

    iget-object v5, v0, LS/g1$c$a$a;->K:Ljava/util/List;

    invoke-direct {v3, v4, v5}, LS/g1$c$a$a$a;-><init>(Lx7/q;Ljava/util/List;)V

    const v4, 0x60ada49c    # 1.0009838E20f

    const/4 v5, 0x1

    invoke-static {v4, v5, v3}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v1

    iget v2, v0, LS/g1$c$a$a;->L:I

    iget v3, v0, LS/g1$c$a$a;->I:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_2

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD0/G;

    sget-object v7, LY0/b;->b:LY0/b$a;

    invoke-virtual {v7, v2, v3}, LY0/b$a;->c(II)J

    move-result-wide v7

    invoke-interface {v6, v7, v8}, LD0/G;->U(J)LD0/X;

    move-result-object v10

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/g1$c$a$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
