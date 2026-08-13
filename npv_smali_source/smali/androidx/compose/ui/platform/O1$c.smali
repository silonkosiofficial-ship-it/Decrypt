.class final Landroidx/compose/ui/platform/O1$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O1;->e(Landroid/content/Context;)LZ8/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Landroid/content/ContentResolver;

.field final synthetic K:Landroid/net/Uri;

.field final synthetic L:Landroidx/compose/ui/platform/O1$d;

.field final synthetic M:LY8/j;

.field final synthetic N:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroidx/compose/ui/platform/O1$d;LY8/j;Landroid/content/Context;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O1$c;->J:Landroid/content/ContentResolver;

    iput-object p2, p0, Landroidx/compose/ui/platform/O1$c;->K:Landroid/net/Uri;

    iput-object p3, p0, Landroidx/compose/ui/platform/O1$c;->L:Landroidx/compose/ui/platform/O1$d;

    iput-object p4, p0, Landroidx/compose/ui/platform/O1$c;->M:LY8/j;

    iput-object p5, p0, Landroidx/compose/ui/platform/O1$c;->N:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/O1$c;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$c;->G:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v4, p0, Landroidx/compose/ui/platform/O1$c;->I:Ljava/lang/Object;

    check-cast v4, LZ8/g;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    move-object p1, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/platform/O1$c;->G:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v4, p0, Landroidx/compose/ui/platform/O1$c;->I:Ljava/lang/Object;

    check-cast v4, LZ8/g;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/O1$c;->I:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$c;->J:Landroid/content/ContentResolver;

    iget-object v4, p0, Landroidx/compose/ui/platform/O1$c;->K:Landroid/net/Uri;

    const/4 v5, 0x0

    iget-object v6, p0, Landroidx/compose/ui/platform/O1$c;->L:Landroidx/compose/ui/platform/O1$d;

    invoke-virtual {v1, v4, v5, v6}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    :try_start_2
    iget-object v1, p0, Landroidx/compose/ui/platform/O1$c;->M:LY8/j;

    invoke-interface {v1}, LY8/B;->iterator()LY8/l;

    move-result-object v1

    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/platform/O1$c;->I:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/O1$c;->G:Ljava/lang/Object;

    iput v3, p0, Landroidx/compose/ui/platform/O1$c;->H:I

    invoke-interface {v1, p0}, LY8/l;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    move-object v7, v4

    move-object v4, p1

    move-object p1, v7

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, LY8/l;->next()Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/ui/platform/O1$c;->N:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v5, "animator_duration_scale"

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {p1, v5, v6}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result p1

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    iput-object v4, p0, Landroidx/compose/ui/platform/O1$c;->I:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/O1$c;->G:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/O1$c;->H:I

    invoke-interface {v4, p1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_5
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$c;->J:Landroid/content/ContentResolver;

    iget-object v0, p0, Landroidx/compose/ui/platform/O1$c;->L:Landroidx/compose/ui/platform/O1$d;

    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/platform/O1$c;->J:Landroid/content/ContentResolver;

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$c;->L:Landroidx/compose/ui/platform/O1$d;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    throw p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/O1$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/O1$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/O1$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/O1$c;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/platform/O1$c;

    iget-object v1, p0, Landroidx/compose/ui/platform/O1$c;->J:Landroid/content/ContentResolver;

    iget-object v2, p0, Landroidx/compose/ui/platform/O1$c;->K:Landroid/net/Uri;

    iget-object v3, p0, Landroidx/compose/ui/platform/O1$c;->L:Landroidx/compose/ui/platform/O1$d;

    iget-object v4, p0, Landroidx/compose/ui/platform/O1$c;->M:LY8/j;

    iget-object v5, p0, Landroidx/compose/ui/platform/O1$c;->N:Landroid/content/Context;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/O1$c;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroidx/compose/ui/platform/O1$d;LY8/j;Landroid/content/Context;Lm7/e;)V

    iput-object p1, v7, Landroidx/compose/ui/platform/O1$c;->I:Ljava/lang/Object;

    return-object v7
.end method
