.class public final LI0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/C;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/C;-><init>(IILy7/k;)V

    iput-object v0, p0, LI0/b;->a:Lr/C;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LI0/b;->a:Lr/C;

    invoke-virtual {v0}, Lr/C;->i()V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
