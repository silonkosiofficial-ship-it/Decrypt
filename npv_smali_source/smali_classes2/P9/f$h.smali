.class public final LP9/f$h;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/f;->v1(ILP9/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LP9/f;

.field final synthetic f:I

.field final synthetic g:LP9/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLP9/f;ILP9/b;)V
    .locals 0

    iput-object p3, p0, LP9/f$h;->e:LP9/f;

    iput p4, p0, LP9/f$h;->f:I

    iput-object p5, p0, LP9/f$h;->g:LP9/b;

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .prologue
    iget-object v0, p0, LP9/f$h;->e:LP9/f;

    invoke-static {v0}, LP9/f;->y(LP9/f;)LP9/l;

    move-result-object v0

    iget v1, p0, LP9/f$h;->f:I

    iget-object v2, p0, LP9/f$h;->g:LP9/b;

    invoke-interface {v0, v1, v2}, LP9/l;->a(ILP9/b;)V

    iget-object v0, p0, LP9/f$h;->e:LP9/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LP9/f$h;->e:LP9/f;

    invoke-static {v1}, LP9/f;->g(LP9/f;)Ljava/util/Set;

    move-result-object v1

    iget v2, p0, LP9/f$h;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, -0x1

    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
