.class public abstract Landroidx/compose/foundation/a;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements LF0/v0;
.implements Lx0/e;
.implements Lm0/b;
.implements LF0/z0;
.implements LF0/E0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/a$a;
    }
.end annotation


# static fields
.field public static final j0:Landroidx/compose/foundation/a$a;

.field public static final k0:I


# instance fields
.field private R:Lz/l;

.field private S:Lv/I;

.field private T:Ljava/lang/String;

.field private U:LK0/h;

.field private V:Z

.field private W:Lx7/a;

.field private final X:Z

.field private final Y:Lv/x;

.field private final Z:Lv/z;

.field private a0:Lz0/W;

.field private b0:LF0/j;

.field private c0:Lz/n$b;

.field private d0:Lz/g;

.field private final e0:Ljava/util/Map;

.field private f0:J

.field private g0:Lz/l;

.field private h0:Z

.field private final i0:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/a$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/a;->j0:Landroidx/compose/foundation/a$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/a;->k0:I

    return-void
.end method

.method private constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, LF0/m;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    iput-object p2, p0, Landroidx/compose/foundation/a;->S:Lv/I;

    iput-object p4, p0, Landroidx/compose/foundation/a;->T:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/foundation/a;->U:LK0/h;

    iput-boolean p3, p0, Landroidx/compose/foundation/a;->V:Z

    iput-object p6, p0, Landroidx/compose/foundation/a;->W:Lx7/a;

    new-instance p1, Lv/x;

    invoke-direct {p1}, Lv/x;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->Y:Lv/x;

    new-instance p1, Lv/z;

    iget-object p2, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    invoke-direct {p1, p2}, Lv/z;-><init>(Lz/l;)V

    iput-object p1, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->e0:Ljava/util/Map;

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/a;->f0:J

    iget-object p1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    iput-object p1, p0, Landroidx/compose/foundation/a;->g0:Lz/l;

    invoke-direct {p0}, Landroidx/compose/foundation/a;->q2()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/compose/foundation/a;->h0:Z

    sget-object p1, Landroidx/compose/foundation/a;->j0:Landroidx/compose/foundation/a$a;

    iput-object p1, p0, Landroidx/compose/foundation/a;->i0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/a;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

    return-void
.end method

.method public static final synthetic Z1(Landroidx/compose/foundation/a;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->h2()Z

    move-result p0

    return p0
.end method

.method public static final synthetic a2(Landroidx/compose/foundation/a;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->j2()V

    return-void
.end method

.method public static final synthetic b2(Landroidx/compose/foundation/a;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->k2()V

    return-void
.end method

.method public static final synthetic c2(Landroidx/compose/foundation/a;)Lz/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    return-object p0
.end method

.method public static final synthetic d2(Landroidx/compose/foundation/a;)Lz/n$b;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/a;->c0:Lz/n$b;

    return-object p0
.end method

.method public static final synthetic e2(Landroidx/compose/foundation/a;Lz/n$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/a;->c0:Lz/n$b;

    return-void
.end method

.method private final h2()Z
    .locals 1

    .prologue
    invoke-static {p0}, Landroidx/compose/foundation/d;->h(LF0/E0;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lv/k;->c(LF0/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final j2()V
    .locals 8

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    if-nez v0, :cond_1

    new-instance v0, Lz/g;

    invoke-direct {v0}, Lz/g;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/a$c;

    const/4 v3, 0x0

    invoke-direct {v5, v1, v0, v3}, Landroidx/compose/foundation/a$c;-><init>(Lz/l;Lz/g;Lm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    iput-object v0, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    :cond_1
    return-void
.end method

.method private final k2()V
    .locals 9

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    if-eqz v0, :cond_1

    new-instance v1, Lz/h;

    invoke-direct {v1, v0}, Lz/h;-><init>(Lz/g;)V

    iget-object v0, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v3

    new-instance v6, Landroidx/compose/foundation/a$d;

    invoke-direct {v6, v0, v1, v2}, Landroidx/compose/foundation/a$d;-><init>(Lz/l;Lz/h;Lm7/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    iput-object v2, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    :cond_1
    return-void
.end method

.method private final o2()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->S:Lv/I;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-nez v1, :cond_1

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    iget-object v2, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    invoke-virtual {v1, v2}, Lv/z;->Z1(Lz/l;)V

    iget-object v1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lv/I;->a(Lz/j;)LF0/j;

    move-result-object v0

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    iput-object v0, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    :cond_2
    return-void
.end method

.method private final q2()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->g0:Lz/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/a;->S:Lv/I;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final D1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->h0:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->o2()V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->Y:Lv/x;

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    iget-object v0, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    :cond_1
    return-void
.end method

.method public final E1()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->i2()V

    iget-object v0, p0, Landroidx/compose/foundation/a;->g0:Lz/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, LF0/m;->W1(LF0/j;)V

    :cond_1
    iput-object v1, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    return-void
.end method

.method public final H(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public K()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/a;->i0:Ljava/lang/Object;

    return-object v0
.end method

.method public final M0(LK0/w;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->U:LK0/h;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LK0/h;->n()I

    move-result v0

    invoke-static {p1, v0}, LK0/u;->X(LK0/w;I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->T:Ljava/lang/String;

    new-instance v1, Landroidx/compose/foundation/a$b;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/a$b;-><init>(Landroidx/compose/foundation/a;)V

    invoke-static {p1, v0, v1}, LK0/u;->u(LK0/w;Ljava/lang/String;Lx7/a;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    invoke-virtual {v0, p1}, Lv/z;->M0(LK0/w;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LK0/u;->j(LK0/w;)V

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/a;->f2(LK0/w;)V

    return-void
.end method

.method public final R0(Lm0/n;)V
    .locals 1

    .prologue
    invoke-interface {p1}, Lm0/n;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/a;->o2()V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    invoke-virtual {v0, p1}, Lv/z;->R0(Lm0/n;)V

    :cond_1
    return-void
.end method

.method public synthetic Y0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->d(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public final b0(Landroid/view/KeyEvent;)Z
    .locals 10

    .prologue
    invoke-direct {p0}, Landroidx/compose/foundation/a;->o2()V

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lv/k;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/a;->e0:Ljava/util/Map;

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lx0/a;->m(J)Lx0/a;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lz/n$b;

    iget-wide v4, p0, Landroidx/compose/foundation/a;->f0:J

    invoke-direct {v0, v4, v5, v3}, Lz/n$b;-><init>(JLy7/k;)V

    iget-object v1, p0, Landroidx/compose/foundation/a;->e0:Ljava/util/Map;

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lx0/a;->m(J)Lx0/a;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v4

    new-instance v7, Landroidx/compose/foundation/a$f;

    invoke-direct {v7, p0, v0, v3}, Landroidx/compose/foundation/a$f;-><init>(Landroidx/compose/foundation/a;Lz/n$b;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    if-eqz v0, :cond_3

    invoke-static {p1}, Lv/k;->b(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/foundation/a;->e0:Ljava/util/Map;

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lx0/a;->m(J)Lx0/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/n$b;

    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v4

    new-instance v7, Landroidx/compose/foundation/a$g;

    invoke-direct {v7, p0, p1, v3}, Landroidx/compose/foundation/a$g;-><init>(Landroidx/compose/foundation/a;Lz/n$b;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/a;->W:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public synthetic f1()V
    .locals 0

    invoke-static {p0}, LF0/u0;->c(LF0/v0;)V

    return-void
.end method

.method public f2(LK0/w;)V
    .locals 0

    return-void
.end method

.method public final g0()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    if-eqz v1, :cond_0

    new-instance v2, Lz/h;

    invoke-direct {v2, v1}, Lz/h;-><init>(Lz/g;)V

    invoke-interface {v0, v2}, Lz/l;->a(Lz/i;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    iget-object v0, p0, Landroidx/compose/foundation/a;->a0:Lz0/W;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LF0/v0;->g0()V

    :cond_1
    return-void
.end method

.method public abstract g2(Lz0/K;Lm7/e;)Ljava/lang/Object;
.end method

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method protected final i2()V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/a;->c0:Lz/n$b;

    if-eqz v1, :cond_0

    new-instance v2, Lz/n$a;

    invoke-direct {v2, v1}, Lz/n$a;-><init>(Lz/n$b;)V

    invoke-interface {v0, v2}, Lz/l;->a(Lz/i;)Z

    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    if-eqz v1, :cond_1

    new-instance v2, Lz/h;

    invoke-direct {v2, v1}, Lz/h;-><init>(Lz/g;)V

    invoke-interface {v0, v2}, Lz/l;->a(Lz/i;)Z

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/a;->e0:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/n$b;

    new-instance v3, Lz/n$a;

    invoke-direct {v3, v2}, Lz/n$a;-><init>(Lz/n$b;)V

    invoke-interface {v0, v3}, Lz/l;->a(Lz/i;)Z

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/a;->c0:Lz/n$b;

    iput-object v0, p0, Landroidx/compose/foundation/a;->d0:Lz/g;

    iget-object v0, p0, Landroidx/compose/foundation/a;->e0:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final k1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final l2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    return v0
.end method

.method protected final m2()Lx7/a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/a;->W:Lx7/a;

    return-object v0
.end method

.method public synthetic n0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->a(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method protected final n2(Lx/t;JLm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    iget-object v4, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    if-eqz v4, :cond_0

    new-instance v7, Landroidx/compose/foundation/a$e;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/a$e;-><init>(Lx/t;JLz/l;Landroidx/compose/foundation/a;Lm7/e;)V

    invoke-static {v7, p4}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method protected final p2()Li7/M;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->a0:Lz0/W;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz0/W;->o1()V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected final r2(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/a;->g0:Lz/l;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->i2()V

    iput-object p1, p0, Landroidx/compose/foundation/a;->g0:Lz/l;

    iput-object p1, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->S:Lv/I;

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p2, p0, Landroidx/compose/foundation/a;->S:Lv/I;

    move p1, v1

    :cond_1
    iget-boolean p2, p0, Landroidx/compose/foundation/a;->V:Z

    if-eq p2, p3, :cond_3

    iget-object p2, p0, Landroidx/compose/foundation/a;->Y:Lv/x;

    if-eqz p3, :cond_2

    invoke-virtual {p0, p2}, LF0/m;->T1(LF0/j;)LF0/j;

    iget-object p2, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    invoke-virtual {p0, p2}, LF0/m;->T1(LF0/j;)LF0/j;

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p2}, LF0/m;->W1(LF0/j;)V

    iget-object p2, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    invoke-virtual {p0, p2}, LF0/m;->W1(LF0/j;)V

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->i2()V

    :goto_1
    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    iput-boolean p3, p0, Landroidx/compose/foundation/a;->V:Z

    :cond_3
    iget-object p2, p0, Landroidx/compose/foundation/a;->T:Ljava/lang/String;

    invoke-static {p2, p4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    iput-object p4, p0, Landroidx/compose/foundation/a;->T:Ljava/lang/String;

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_4
    iget-object p2, p0, Landroidx/compose/foundation/a;->U:LK0/h;

    invoke-static {p2, p5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    iput-object p5, p0, Landroidx/compose/foundation/a;->U:LK0/h;

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_5
    iput-object p6, p0, Landroidx/compose/foundation/a;->W:Lx7/a;

    iget-boolean p2, p0, Landroidx/compose/foundation/a;->h0:Z

    invoke-direct {p0}, Landroidx/compose/foundation/a;->q2()Z

    move-result p3

    if-eq p2, p3, :cond_6

    invoke-direct {p0}, Landroidx/compose/foundation/a;->q2()Z

    move-result p2

    iput-boolean p2, p0, Landroidx/compose/foundation/a;->h0:Z

    if-nez p2, :cond_6

    iget-object p2, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    if-nez p2, :cond_6

    goto :goto_2

    :cond_6
    move v1, p1

    :goto_2
    if-eqz v1, :cond_9

    iget-object p1, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    if-nez p1, :cond_7

    iget-boolean p2, p0, Landroidx/compose/foundation/a;->h0:Z

    if-nez p2, :cond_9

    :cond_7
    if-eqz p1, :cond_8

    invoke-virtual {p0, p1}, LF0/m;->W1(LF0/j;)V

    :cond_8
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/foundation/a;->b0:LF0/j;

    invoke-direct {p0}, Landroidx/compose/foundation/a;->o2()V

    :cond_9
    iget-object p1, p0, Landroidx/compose/foundation/a;->Z:Lv/z;

    iget-object p2, p0, Landroidx/compose/foundation/a;->R:Lz/l;

    invoke-virtual {p1, p2}, Lv/z;->Z1(Lz/l;)V

    return-void
.end method

.method public synthetic t0()V
    .locals 0

    invoke-static {p0}, LF0/u0;->b(LF0/v0;)V

    return-void
.end method

.method public final w0(Lz0/p;Lz0/r;J)V
    .locals 10

    .prologue
    invoke-static {p3, p4}, LY0/u;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v2, v0}, Ln0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/a;->f0:J

    invoke-direct {p0}, Landroidx/compose/foundation/a;->o2()V

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->V:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lz0/r;->D:Lz0/r;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Lz0/p;->f()I

    move-result v0

    sget-object v2, Lz0/t;->a:Lz0/t$a;

    invoke-virtual {v2}, Lz0/t$a;->a()I

    move-result v3

    invoke-static {v0, v3}, Lz0/t;->i(II)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v4

    new-instance v7, Landroidx/compose/foundation/a$h;

    invoke-direct {v7, p0, v1}, Landroidx/compose/foundation/a$h;-><init>(Landroidx/compose/foundation/a;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lz0/t$a;->b()I

    move-result v2

    invoke-static {v0, v2}, Lz0/t;->i(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/a$i;

    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/a$i;-><init>(Landroidx/compose/foundation/a;Lm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/a;->a0:Lz0/W;

    if-nez v0, :cond_2

    new-instance v0, Landroidx/compose/foundation/a$j;

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/a$j;-><init>(Landroidx/compose/foundation/a;Lm7/e;)V

    invoke-static {v0}, Lz0/U;->a(Lx7/p;)Lz0/W;

    move-result-object v0

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object v0

    check-cast v0, Lz0/W;

    iput-object v0, p0, Landroidx/compose/foundation/a;->a0:Lz0/W;

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/a;->a0:Lz0/W;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2, p3, p4}, LF0/v0;->w0(Lz0/p;Lz0/r;J)V

    :cond_3
    return-void
.end method

.method public final y1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/a;->X:Z

    return v0
.end method
