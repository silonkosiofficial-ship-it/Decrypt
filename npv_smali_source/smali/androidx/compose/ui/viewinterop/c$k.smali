.class final Landroidx/compose/ui/viewinterop/c$k;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;->onNestedFling(Landroid/view/View;FFZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Z

.field final synthetic I:Landroidx/compose/ui/viewinterop/c;

.field final synthetic J:J


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/viewinterop/c;JLm7/e;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/c$k;->H:Z

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$k;->I:Landroidx/compose/ui/viewinterop/c;

    iput-wide p3, p0, Landroidx/compose/ui/viewinterop/c$k;->J:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/viewinterop/c$k;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Landroidx/compose/ui/viewinterop/c$k;->H:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$k;->I:Landroidx/compose/ui/viewinterop/c;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/c;->b(Landroidx/compose/ui/viewinterop/c;)Ly0/c;

    move-result-object v4

    sget-object p1, LY0/A;->b:LY0/A$a;

    invoke-virtual {p1}, LY0/A$a;->a()J

    move-result-wide v5

    iget-wide v7, p0, Landroidx/compose/ui/viewinterop/c$k;->J:J

    iput v3, p0, Landroidx/compose/ui/viewinterop/c$k;->G:I

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Ly0/c;->a(JJLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$k;->I:Landroidx/compose/ui/viewinterop/c;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/c;->b(Landroidx/compose/ui/viewinterop/c;)Ly0/c;

    move-result-object v3

    iget-wide v4, p0, Landroidx/compose/ui/viewinterop/c$k;->J:J

    sget-object p1, LY0/A;->b:LY0/A$a;

    invoke-virtual {p1}, LY0/A$a;->a()J

    move-result-wide v6

    iput v2, p0, Landroidx/compose/ui/viewinterop/c$k;->G:I

    move-object v8, p0

    invoke-virtual/range {v3 .. v8}, Ly0/c;->a(JJLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/c$k;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/viewinterop/c$k;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/viewinterop/c$k;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/c$k;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, Landroidx/compose/ui/viewinterop/c$k;

    iget-boolean v1, p0, Landroidx/compose/ui/viewinterop/c$k;->H:Z

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/c$k;->I:Landroidx/compose/ui/viewinterop/c;

    iget-wide v3, p0, Landroidx/compose/ui/viewinterop/c$k;->J:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/c$k;-><init>(ZLandroidx/compose/ui/viewinterop/c;JLm7/e;)V

    return-object p1
.end method
