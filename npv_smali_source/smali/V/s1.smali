.class public abstract LV/s1;
.super Lf0/z;
.source "SourceFile"

# interfaces
.implements Lf0/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/s1$a;
    }
.end annotation


# instance fields
.field private final D:LV/u1;

.field private E:LV/s1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;LV/u1;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lf0/z;-><init>()V

    iput-object p2, p0, LV/s1;->D:LV/u1;

    new-instance p2, LV/s1$a;

    invoke-direct {p2, p1}, LV/s1$a;-><init>(Ljava/lang/Object;)V

    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LV/s1$a;

    invoke-direct {v0, p1}, LV/s1$a;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lf0/A;->h(I)V

    invoke-virtual {p2, v0}, Lf0/A;->g(Lf0/A;)V

    :cond_0
    iput-object p2, p0, LV/s1;->E:LV/s1$a;

    return-void
.end method


# virtual methods
.method public C(Lf0/A;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV/s1$a;

    iput-object p1, p0, LV/s1;->E:LV/s1$a;

    return-void
.end method

.method public c()LV/u1;
    .locals 1

    iget-object v0, p0, LV/s1;->D:LV/u1;

    return-object v0
.end method

.method public e()Lf0/A;
    .locals 1

    iget-object v0, p0, LV/s1;->E:LV/s1$a;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/s1;->E:LV/s1$a;

    invoke-static {v0, p0}, Lf0/p;->X(Lf0/A;Lf0/y;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/s1$a;

    invoke-virtual {v0}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public s(Lf0/A;Lf0/A;Lf0/A;)Lf0/A;
    .locals 4

    .prologue
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV/s1$a;

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, LV/s1$a;

    invoke-static {p3, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, LV/s1$a;

    invoke-virtual {p0}, LV/s1;->c()LV/u1;

    move-result-object v0

    invoke-virtual {v1}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p3}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, LV/u1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LV/s1;->c()LV/u1;

    move-result-object p2

    invoke-virtual {p1}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p1, v0, v1}, LV/u1;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p3}, LV/s1$a;->d()Lf0/A;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>"

    invoke-static {p2, p3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p3, p2

    check-cast p3, LV/s1$a;

    invoke-virtual {p3, p1}, LV/s1$a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 4

    .prologue
    iget-object v0, p0, LV/s1;->E:LV/s1$a;

    invoke-static {v0}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/s1$a;

    invoke-virtual {p0}, LV/s1;->c()LV/u1;

    move-result-object v1

    invoke-virtual {v0}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2, p1}, LV/u1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LV/s1;->E:LV/s1$a;

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

    check-cast v0, LV/s1$a;

    invoke-virtual {v0, p1}, LV/s1$a;->j(Ljava/lang/Object;)V

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

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LV/s1;->E:LV/s1$a;

    invoke-static {v0}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, LV/s1$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MutableState(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LV/s1$a;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
