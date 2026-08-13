.class final Landroidx/compose/animation/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/b;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:[LD0/X;

.field final synthetic E:Landroidx/compose/animation/b;

.field final synthetic F:I

.field final synthetic G:I


# direct methods
.method constructor <init>([LD0/X;Landroidx/compose/animation/b;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/b$a;->D:[LD0/X;

    iput-object p2, p0, Landroidx/compose/animation/b$a;->E:Landroidx/compose/animation/b;

    iput p3, p0, Landroidx/compose/animation/b$a;->F:I

    iput p4, p0, Landroidx/compose/animation/b$a;->G:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 14

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/b$a;->D:[LD0/X;

    iget-object v1, p0, Landroidx/compose/animation/b$a;->E:Landroidx/compose/animation/b;

    iget v2, p0, Landroidx/compose/animation/b$a;->F:I

    iget v3, p0, Landroidx/compose/animation/b$a;->G:I

    array-length v4, v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v7, v0, v5

    if-eqz v7, :cond_0

    invoke-virtual {v1}, Landroidx/compose/animation/b;->d()Landroidx/compose/animation/e;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/animation/e;->h()Lh0/c;

    move-result-object v8

    invoke-virtual {v7}, LD0/X;->I0()I

    move-result v6

    invoke-virtual {v7}, LD0/X;->w0()I

    move-result v9

    invoke-static {v6, v9}, LY0/u;->a(II)J

    move-result-wide v9

    invoke-static {v2, v3}, LY0/u;->a(II)J

    move-result-wide v11

    sget-object v13, LY0/v;->C:LY0/v;

    invoke-interface/range {v8 .. v13}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide v8

    invoke-static {v8, v9}, LY0/p;->h(J)I

    move-result v10

    invoke-static {v8, v9}, LY0/p;->i(J)I

    move-result v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, p1

    move v8, v10

    move v10, v13

    invoke-static/range {v6 .. v12}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/b$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
