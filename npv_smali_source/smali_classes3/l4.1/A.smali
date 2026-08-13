.class final Ll4/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ll4/B;


# direct methods
.method constructor <init>(Ll4/B;)V
    .locals 0

    iput-object p1, p0, Ll4/A;->C:Ll4/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Ll4/A;->C:Ll4/B;

    invoke-static {v0}, Ll4/B;->b(Ll4/B;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll4/A;->C:Ll4/B;

    invoke-static {v1}, Ll4/B;->a(Ll4/B;)Ll4/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ll4/B;->a(Ll4/B;)Ll4/e;

    move-result-object v1

    invoke-interface {v1}, Ll4/e;->b()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
