.class final Lv/f$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/f;->b2(Ll0/d;Lo0/n0;Lo0/L1$a;ZF)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ln0/i;

.field final synthetic E:Ly7/O;

.field final synthetic F:J

.field final synthetic G:Lo0/z0;


# direct methods
.method constructor <init>(Ln0/i;Ly7/O;JLo0/z0;)V
    .locals 0

    iput-object p1, p0, Lv/f$b;->D:Ln0/i;

    iput-object p2, p0, Lv/f$b;->E:Ly7/O;

    iput-wide p3, p0, Lv/f$b;->F:J

    iput-object p5, p0, Lv/f$b;->G:Lo0/z0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 21

    .prologue
    move-object/from16 v1, p0

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    iget-object v0, v1, Lv/f$b;->D:Ln0/i;

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v2

    iget-object v0, v1, Lv/f$b;->D:Ln0/i;

    invoke-virtual {v0}, Ln0/i;->l()F

    move-result v3

    iget-object v0, v1, Lv/f$b;->E:Ly7/O;

    iget-wide v8, v1, Lv/f$b;->F:J

    iget-object v5, v1, Lv/f$b;->G:Lo0/z0;

    invoke-interface/range {p1 .. p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v4

    invoke-interface {v4}, Lq0/d;->c()Lq0/j;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Lq0/j;->d(FF)V

    :try_start_0
    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, Lo0/E1;

    const/16 v19, 0x37a

    const/16 v20, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v4, p1

    move-object/from16 v16, v5

    move-object v5, v0

    invoke-static/range {v4 .. v20}, Lq0/f;->f(Lq0/g;Lo0/E1;JJJJFLq0/h;Lo0/z0;IIILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface/range {p1 .. p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0}, Lq0/d;->c()Lq0/j;

    move-result-object v0

    neg-float v2, v2

    neg-float v3, v3

    invoke-interface {v0, v2, v3}, Lq0/j;->d(FF)V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface/range {p1 .. p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v4

    invoke-interface {v4}, Lq0/d;->c()Lq0/j;

    move-result-object v4

    neg-float v2, v2

    neg-float v3, v3

    invoke-interface {v4, v2, v3}, Lq0/j;->d(FF)V

    throw v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, Lv/f$b;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
