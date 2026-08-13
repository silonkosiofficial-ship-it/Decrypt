.class public final Lf0/r$a;
.super Lf0/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private c:LY/f;

.field private d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY/f;)V
    .locals 0

    invoke-direct {p0}, Lf0/A;-><init>()V

    iput-object p1, p0, Lf0/r$a;->c:LY/f;

    return-void
.end method


# virtual methods
.method public c(Lf0/A;)V
    .locals 2

    .prologue
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lf0/r$a;

    iget-object v1, v1, Lf0/r$a;->c:LY/f;

    iput-object v1, p0, Lf0/r$a;->c:LY/f;

    move-object v1, p1

    check-cast v1, Lf0/r$a;

    iget v1, v1, Lf0/r$a;->d:I

    iput v1, p0, Lf0/r$a;->d:I

    check-cast p1, Lf0/r$a;

    iget p1, p1, Lf0/r$a;->e:I

    iput p1, p0, Lf0/r$a;->e:I

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public d()Lf0/A;
    .locals 2

    new-instance v0, Lf0/r$a;

    iget-object v1, p0, Lf0/r$a;->c:LY/f;

    invoke-direct {v0, v1}, Lf0/r$a;-><init>(LY/f;)V

    return-object v0
.end method

.method public final i()LY/f;
    .locals 1

    iget-object v0, p0, Lf0/r$a;->c:LY/f;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lf0/r$a;->d:I

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lf0/r$a;->e:I

    return v0
.end method

.method public final l(LY/f;)V
    .locals 0

    iput-object p1, p0, Lf0/r$a;->c:LY/f;

    return-void
.end method

.method public final m(I)V
    .locals 0

    iput p1, p0, Lf0/r$a;->d:I

    return-void
.end method

.method public final n(I)V
    .locals 0

    iput p1, p0, Lf0/r$a;->e:I

    return-void
.end method
