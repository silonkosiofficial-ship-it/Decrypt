.class final Landroidx/compose/foundation/selection/d;
.super Landroidx/compose/foundation/e;
.source "SourceFile"


# instance fields
.field private l0:LL0/a;


# direct methods
.method private constructor <init>(LL0/a;Lz/l;Lv/I;ZLK0/h;Lx7/a;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/e;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    iput-object p1, p0, Landroidx/compose/foundation/selection/d;->l0:LL0/a;

    return-void
.end method

.method public synthetic constructor <init>(LL0/a;Lz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/d;-><init>(LL0/a;Lz/l;Lv/I;ZLK0/h;Lx7/a;)V

    return-void
.end method


# virtual methods
.method public f2(LK0/w;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/selection/d;->l0:LL0/a;

    invoke-static {p1, v0}, LK0/u;->j0(LK0/w;LL0/a;)V

    return-void
.end method

.method public final u2(LL0/a;Lz/l;Lv/I;ZLK0/h;Lx7/a;)V
    .locals 8

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/selection/d;->l0:LL0/a;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/compose/foundation/selection/d;->l0:LL0/a;

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_0
    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    move-object v7, p6

    invoke-super/range {v1 .. v7}, Landroidx/compose/foundation/e;->t2(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

    return-void
.end method
