.class public abstract LC/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/z;


# instance fields
.field private final a:LC/l;

.field private final b:LD/w;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC/l;LD/w;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/w;->a:LC/l;

    iput-object p2, p0, LC/w;->b:LD/w;

    iput p3, p0, LC/w;->c:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a(IIIJ)LD/y;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LC/w;->c(IIIJ)LC/v;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LC/v;
.end method

.method public c(IIIJ)LC/v;
    .locals 7

    iget v6, p0, LC/w;->c:I

    move-object v0, p0

    move v1, p1

    move-wide v2, p4

    move v4, p2

    move v5, p3

    invoke-virtual/range {v0 .. v6}, LC/w;->d(IJIII)LC/v;

    move-result-object p1

    return-object p1
.end method

.method public final d(IJIII)LC/v;
    .locals 12

    .prologue
    move-object v11, p0

    move v1, p1

    iget-object v0, v11, LC/w;->a:LC/l;

    invoke-interface {v0, p1}, LD/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    iget-object v0, v11, LC/w;->a:LC/l;

    invoke-interface {v0, p1}, LD/s;->e(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v0, v11, LC/w;->b:LD/w;

    move-wide v7, p2

    invoke-interface {v0, p1, p2, p3}, LD/w;->p0(IJ)Ljava/util/List;

    move-result-object v6

    invoke-static {p2, p3}, LY0/b;->j(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, LY0/b;->n(J)I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    invoke-static {p2, p3}, LY0/b;->i(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2, p3}, LY0/b;->m(J)I

    move-result v0

    goto :goto_0

    :goto_1
    move-object v0, p0

    move v1, p1

    move/from16 v5, p6

    move-wide v7, p2

    move/from16 v9, p4

    move/from16 v10, p5

    invoke-virtual/range {v0 .. v10}, LC/w;->b(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LC/v;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "does not have fixed height"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Landroidx/compose/foundation/lazy/layout/c;
    .locals 1

    iget-object v0, p0, LC/w;->a:LC/l;

    invoke-interface {v0}, LC/l;->c()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v0

    return-object v0
.end method
