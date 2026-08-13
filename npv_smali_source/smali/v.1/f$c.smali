.class final Lv/f$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/f;->c2(Ll0/d;Lo0/n0;Lo0/L1$c;JJZF)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lo0/n0;

.field final synthetic F:J

.field final synthetic G:F

.field final synthetic H:F

.field final synthetic I:J

.field final synthetic J:J

.field final synthetic K:Lq0/m;


# direct methods
.method constructor <init>(ZLo0/n0;JFFJJLq0/m;)V
    .locals 0

    iput-boolean p1, p0, Lv/f$c;->D:Z

    iput-object p2, p0, Lv/f$c;->E:Lo0/n0;

    iput-wide p3, p0, Lv/f$c;->F:J

    iput p5, p0, Lv/f$c;->G:F

    iput p6, p0, Lv/f$c;->H:F

    iput-wide p7, p0, Lv/f$c;->I:J

    iput-wide p9, p0, Lv/f$c;->J:J

    iput-object p11, p0, Lv/f$c;->K:Lq0/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 23

    .prologue
    move-object/from16 v1, p0

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    iget-boolean v0, v1, Lv/f$c;->D:Z

    if-eqz v0, :cond_0

    iget-object v3, v1, Lv/f$c;->E:Lo0/n0;

    iget-wide v8, v1, Lv/f$c;->F:J

    const/16 v14, 0xf6

    const/4 v15, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v15}, Lq0/f;->n(Lq0/g;Lo0/n0;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    iget-wide v2, v1, Lv/f$c;->F:J

    invoke-static {v2, v3}, Ln0/a;->d(J)F

    move-result v0

    iget v2, v1, Lv/f$c;->G:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    iget v5, v1, Lv/f$c;->H:F

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v0

    iget v2, v1, Lv/f$c;->H:F

    sub-float v6, v0, v2

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v0

    iget v2, v1, Lv/f$c;->H:F

    sub-float v7, v0, v2

    sget-object v0, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {v0}, Lo0/x0$a;->a()I

    move-result v8

    iget-object v10, v1, Lv/f$c;->E:Lo0/n0;

    iget-wide v13, v1, Lv/f$c;->F:J

    invoke-interface/range {p1 .. p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2}, Lq0/d;->i()J

    move-result-wide v11

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v2}, Lq0/d;->c()Lq0/j;

    move-result-object v3

    move v4, v5

    invoke-interface/range {v3 .. v8}, Lq0/j;->c(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v21, 0xf6

    const/16 v22, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v9, p1

    move-wide v7, v11

    move-wide v11, v3

    move-wide v3, v13

    move-wide v13, v5

    move-wide v15, v3

    :try_start_1
    invoke-static/range {v9 .. v22}, Lq0/f;->n(Lq0/g;Lo0/n0;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v2, v7, v8}, Lq0/d;->d(J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide v7, v11

    :goto_0
    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v3

    invoke-interface {v3}, Lo0/q0;->s()V

    invoke-interface {v2, v7, v8}, Lq0/d;->d(J)V

    throw v0

    :cond_1
    iget-object v10, v1, Lv/f$c;->E:Lo0/n0;

    iget-wide v11, v1, Lv/f$c;->I:J

    iget-wide v13, v1, Lv/f$c;->J:J

    iget-wide v3, v1, Lv/f$c;->F:J

    invoke-static {v3, v4, v2}, Lv/e;->d(JF)J

    move-result-wide v15

    iget-object v0, v1, Lv/f$c;->K:Lq0/m;

    const/16 v21, 0xd0

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v9, p1

    move-object/from16 v18, v0

    invoke-static/range {v9 .. v22}, Lq0/f;->n(Lq0/g;Lo0/n0;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, Lv/f$c;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
