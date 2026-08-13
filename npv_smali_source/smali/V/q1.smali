.class public abstract LV/q1;
.super Lf0/z;
.source "SourceFile"

# interfaces
.implements LV/s0;
.implements Lf0/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/q1$a;
    }
.end annotation


# instance fields
.field private D:LV/q1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .prologue
    invoke-direct {p0}, Lf0/z;-><init>()V

    new-instance v0, LV/q1$a;

    invoke-direct {v0, p1}, LV/q1$a;-><init>(I)V

    sget-object v1, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v1}, Lf0/k$a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LV/q1$a;

    invoke-direct {v1, p1}, LV/q1$a;-><init>(I)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Lf0/A;->h(I)V

    invoke-virtual {v0, v1}, Lf0/A;->g(Lf0/A;)V

    :cond_0
    iput-object v0, p0, LV/q1;->D:LV/q1$a;

    return-void
.end method


# virtual methods
.method public C(Lf0/A;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV/q1$a;

    iput-object p1, p0, LV/q1;->D:LV/q1$a;

    return-void
.end method

.method public c()LV/u1;
    .locals 1

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LV/q1;->D:LV/q1$a;

    invoke-static {v0, p0}, Lf0/p;->X(Lf0/A;Lf0/y;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/q1$a;

    invoke-virtual {v0}, LV/q1$a;->i()I

    move-result v0

    return v0
.end method

.method public e()Lf0/A;
    .locals 1

    iget-object v0, p0, LV/q1;->D:LV/q1$a;

    return-object v0
.end method

.method public synthetic getValue()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, LV/r0;->a(LV/s0;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, LV/r0;->b(LV/s0;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i(I)V
    .locals 4

    .prologue
    iget-object v0, p0, LV/q1;->D:LV/q1$a;

    invoke-static {v0}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/q1$a;

    invoke-virtual {v0}, LV/q1$a;->i()I

    move-result v1

    if-eq v1, p1, :cond_0

    iget-object v1, p0, LV/q1;->D:LV/q1$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    sget-object v3, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v3}, Lf0/k$a;->c()Lf0/k;

    move-result-object v3

    invoke-static {v1, p0, v3, v0}, Lf0/p;->S(Lf0/A;Lf0/y;Lf0/k;Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/q1$a;

    invoke-virtual {v0, p1}, LV/q1$a;->j(I)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-static {v3, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public synthetic l(I)V
    .locals 0

    invoke-static {p0, p1}, LV/r0;->c(LV/s0;I)V

    return-void
.end method

.method public s(Lf0/A;Lf0/A;Lf0/A;)Lf0/A;
    .locals 1

    .prologue
    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord"

    invoke-static {p2, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, LV/q1$a;

    invoke-static {p3, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, LV/q1$a;

    invoke-virtual {v0}, LV/q1$a;->i()I

    move-result p1

    invoke-virtual {p3}, LV/q1$a;->i()I

    move-result p3

    if-ne p1, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LV/r0;->d(LV/s0;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LV/q1;->D:LV/q1$a;

    invoke-static {v0}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/q1$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MutableIntState(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LV/q1$a;->i()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
