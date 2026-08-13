.class public Landroidx/compose/foundation/e;
.super Landroidx/compose/foundation/a;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/a;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/e;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

    return-void
.end method

.method static synthetic s2(Landroidx/compose/foundation/e;Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, Landroidx/compose/foundation/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/e$a;-><init>(Landroidx/compose/foundation/e;Lm7/e;)V

    new-instance v1, Landroidx/compose/foundation/e$b;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/e$b;-><init>(Landroidx/compose/foundation/e;)V

    invoke-static {p1, v0, v1, p2}, Lx/D;->h(Lz0/K;Lx7/q;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public g2(Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/e;->s2(Landroidx/compose/foundation/e;Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final t2(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 0

    invoke-virtual/range {p0 .. p6}, Landroidx/compose/foundation/a;->r2(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

    return-void
.end method
