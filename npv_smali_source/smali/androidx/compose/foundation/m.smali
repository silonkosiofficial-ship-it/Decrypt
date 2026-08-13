.class public final Landroidx/compose/foundation/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/m$c;
    }
.end annotation


# static fields
.field public static final i:Landroidx/compose/foundation/m$c;

.field private static final j:Le0/j;


# instance fields
.field private final a:LV/s0;

.field private final b:LV/s0;

.field private final c:Lz/l;

.field private d:LV/s0;

.field private e:F

.field private final f:Lx/A;

.field private final g:LV/G1;

.field private final h:LV/G1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/m$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/m$c;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/m;->i:Landroidx/compose/foundation/m$c;

    sget-object v0, Landroidx/compose/foundation/m$a;->D:Landroidx/compose/foundation/m$a;

    sget-object v1, Landroidx/compose/foundation/m$b;->D:Landroidx/compose/foundation/m$b;

    invoke-static {v0, v1}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/m;->j:Le0/j;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->a:LV/s0;

    const/4 p1, 0x0

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->b:LV/s0;

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->c:Lz/l;

    const p1, 0x7fffffff

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->d:LV/s0;

    new-instance p1, Landroidx/compose/foundation/m$f;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/m$f;-><init>(Landroidx/compose/foundation/m;)V

    invoke-static {p1}, Lx/B;->a(Lx7/l;)Lx/A;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->f:Lx/A;

    new-instance p1, Landroidx/compose/foundation/m$e;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/m$e;-><init>(Landroidx/compose/foundation/m;)V

    invoke-static {p1}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->g:LV/G1;

    new-instance p1, Landroidx/compose/foundation/m$d;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/m$d;-><init>(Landroidx/compose/foundation/m;)V

    invoke-static {p1}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/m;->h:LV/G1;

    return-void
.end method

.method public static final synthetic f(Landroidx/compose/foundation/m;)F
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/m;->e:F

    return p0
.end method

.method public static final synthetic g()Le0/j;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/m;->j:Le0/j;

    return-object v0
.end method

.method public static final synthetic h(Landroidx/compose/foundation/m;F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/m;->e:F

    return-void
.end method

.method public static final synthetic i(Landroidx/compose/foundation/m;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/m;->n(I)V

    return-void
.end method

.method private final n(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->a:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->f:Lx/A;

    invoke-interface {v0}, Lx/A;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->h:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->g:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/m;->f:Lx/A;

    invoke-interface {v0, p1, p2, p3}, Lx/A;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->f:Lx/A;

    invoke-interface {v0, p1}, Lx/A;->e(F)F

    move-result p1

    return p1
.end method

.method public final j()Lz/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->c:Lz/l;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->d:LV/s0;

    invoke-interface {v0}, LV/s0;->d()I

    move-result v0

    return v0
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->a:LV/s0;

    invoke-interface {v0}, LV/Y;->d()I

    move-result v0

    return v0
.end method

.method public final m(I)V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/m;->d:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->d()Lf0/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lf0/k;->h()Lx7/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/foundation/m;->l()I

    move-result v4

    if-le v4, p1, :cond_1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/m;->n(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :goto_2
    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1
.end method

.method public final o(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/m;->b:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    return-void
.end method
