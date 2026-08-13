.class final Landroidx/compose/foundation/g$a;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final P:Lz/j;

.field private Q:Z

.field private R:Z

.field private S:Z


# direct methods
.method public constructor <init>(Lz/j;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/g$a;->P:Lz/j;

    return-void
.end method

.method public static final synthetic T1(Landroidx/compose/foundation/g$a;)Lz/j;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/g$a;->P:Lz/j;

    return-object p0
.end method

.method public static final synthetic U1(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->S:Z

    return p0
.end method

.method public static final synthetic V1(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->R:Z

    return p0
.end method

.method public static final synthetic W1(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->Q:Z

    return p0
.end method

.method public static final synthetic X1(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->S:Z

    return-void
.end method

.method public static final synthetic Y1(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->R:Z

    return-void
.end method

.method public static final synthetic Z1(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->Q:Z

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v0

    new-instance v3, Landroidx/compose/foundation/g$a$a;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Landroidx/compose/foundation/g$a$a;-><init>(Landroidx/compose/foundation/g$a;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 23

    .prologue
    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->Q:Z

    if-eqz v1, :cond_0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v2

    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3e99999a    # 0.3f

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v11

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v15

    const/16 v21, 0x7a

    const/16 v22, 0x0

    const-wide/16 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v22}, Lq0/f;->m(Lq0/g;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->R:Z

    if-nez v1, :cond_1

    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->S:Z

    if-eqz v1, :cond_2

    :cond_1
    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v2

    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3dcccccd    # 0.1f

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
