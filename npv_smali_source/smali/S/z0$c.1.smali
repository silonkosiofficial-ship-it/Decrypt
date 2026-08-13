.class final LS/z0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/z0;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:I

.field final synthetic F:LD0/X;

.field final synthetic G:LD0/X;

.field final synthetic H:LD0/X;

.field final synthetic I:LD0/X;

.field final synthetic J:LD0/X;

.field final synthetic K:LD0/X;

.field final synthetic L:LD0/X;

.field final synthetic M:LD0/X;

.field final synthetic N:LD0/X;

.field final synthetic O:LS/z0;

.field final synthetic P:LD0/M;


# direct methods
.method constructor <init>(IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LS/z0;LD0/M;)V
    .locals 0

    iput p1, p0, LS/z0$c;->D:I

    iput p2, p0, LS/z0$c;->E:I

    iput-object p3, p0, LS/z0$c;->F:LD0/X;

    iput-object p4, p0, LS/z0$c;->G:LD0/X;

    iput-object p5, p0, LS/z0$c;->H:LD0/X;

    iput-object p6, p0, LS/z0$c;->I:LD0/X;

    iput-object p7, p0, LS/z0$c;->J:LD0/X;

    iput-object p8, p0, LS/z0$c;->K:LD0/X;

    iput-object p9, p0, LS/z0$c;->L:LD0/X;

    iput-object p10, p0, LS/z0$c;->M:LD0/X;

    iput-object p11, p0, LS/z0$c;->N:LD0/X;

    iput-object p12, p0, LS/z0$c;->O:LS/z0;

    iput-object p13, p0, LS/z0$c;->P:LD0/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, LS/z0$c;->D:I

    iget v3, v0, LS/z0$c;->E:I

    iget-object v4, v0, LS/z0$c;->F:LD0/X;

    iget-object v5, v0, LS/z0$c;->G:LD0/X;

    iget-object v6, v0, LS/z0$c;->H:LD0/X;

    iget-object v7, v0, LS/z0$c;->I:LD0/X;

    iget-object v8, v0, LS/z0$c;->J:LD0/X;

    iget-object v9, v0, LS/z0$c;->K:LD0/X;

    iget-object v10, v0, LS/z0$c;->L:LD0/X;

    iget-object v11, v0, LS/z0$c;->M:LD0/X;

    iget-object v12, v0, LS/z0$c;->N:LD0/X;

    iget-object v13, v0, LS/z0$c;->O:LS/z0;

    invoke-static {v13}, LS/z0;->d(LS/z0;)F

    move-result v13

    iget-object v14, v0, LS/z0$c;->O:LS/z0;

    invoke-static {v14}, LS/z0;->g(LS/z0;)Z

    move-result v14

    iget-object v15, v0, LS/z0$c;->P:LD0/M;

    invoke-interface {v15}, LY0/e;->getDensity()F

    move-result v15

    iget-object v1, v0, LS/z0$c;->P:LD0/M;

    invoke-interface {v1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v16

    iget-object v1, v0, LS/z0$c;->O:LS/z0;

    invoke-static {v1}, LS/z0;->f(LS/z0;)LA/B;

    move-result-object v17

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, LS/y0;->g(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;FZFLY0/v;LA/B;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/z0$c;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
