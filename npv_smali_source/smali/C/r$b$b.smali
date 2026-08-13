.class public final LC/r$b$b;
.super LC/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r$b;->a(LD/w;J)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:LD/w;

.field final synthetic e:LC/K;

.field final synthetic f:Z

.field final synthetic g:Z

.field final synthetic h:I

.field final synthetic i:I

.field final synthetic j:J


# direct methods
.method constructor <init>(LC/l;LD/w;ILC/K;ZZIIJ)V
    .locals 0

    iput-object p2, p0, LC/r$b$b;->d:LD/w;

    iput-object p4, p0, LC/r$b$b;->e:LC/K;

    iput-boolean p5, p0, LC/r$b$b;->f:Z

    iput-boolean p6, p0, LC/r$b$b;->g:Z

    iput p7, p0, LC/r$b$b;->h:I

    iput p8, p0, LC/r$b$b;->i:I

    iput-wide p9, p0, LC/r$b$b;->j:J

    invoke-direct {p0, p1, p2, p3}, LC/w;-><init>(LC/l;LD/w;I)V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LC/v;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v14, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v11, p6

    move-wide/from16 v16, p7

    move/from16 v18, p9

    move/from16 v19, p10

    iget-object v1, v0, LC/r$b$b;->d:LD/w;

    invoke-interface {v1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v8

    iget-object v1, v0, LC/r$b$b;->e:LC/K;

    invoke-virtual {v1}, LC/K;->q()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v15

    new-instance v21, LC/v;

    move-object/from16 v1, v21

    iget-boolean v4, v0, LC/r$b$b;->f:Z

    iget-boolean v7, v0, LC/r$b$b;->g:Z

    iget v9, v0, LC/r$b$b;->h:I

    iget v10, v0, LC/r$b$b;->i:I

    iget-wide v12, v0, LC/r$b$b;->j:J

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v20}, LC/v;-><init>(ILjava/lang/Object;ZIIZLY0/v;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILy7/k;)V

    return-object v21
.end method
