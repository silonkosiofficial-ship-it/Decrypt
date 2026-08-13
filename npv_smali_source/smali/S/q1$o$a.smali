.class final LS/q1$o$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$o;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:LD0/X;


# direct methods
.method constructor <init>(Ljava/util/List;LD0/X;)V
    .locals 0

    iput-object p1, p0, LS/q1$o$a;->D:Ljava/util/List;

    iput-object p2, p0, LS/q1$o$a;->E:LD0/X;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LS/q1$o$a;->D:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LD0/X;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v9}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v1, v0, LS/q1$o$a;->D:Ljava/util/List;

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LD0/X;

    iget-object v1, v0, LS/q1$o$a;->D:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD0/X;

    invoke-virtual {v1}, LD0/X;->I0()I

    move-result v5

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v9}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v11, v0, LS/q1$o$a;->E:LD0/X;

    iget-object v1, v0, LS/q1$o$a;->D:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD0/X;

    invoke-virtual {v1}, LD0/X;->I0()I

    move-result v1

    iget-object v2, v0, LS/q1$o$a;->E:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int v12, v1, v2

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v16}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/q1$o$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
