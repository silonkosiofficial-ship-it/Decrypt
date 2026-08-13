.class final Lt2/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a;-><init>([Ljava/lang/String;Lt2/b;Lx7/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lt2/a;


# direct methods
.method constructor <init>(Lt2/a;)V
    .locals 0

    iput-object p1, p0, Lt2/a$a;->D:Lt2/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lt2/a$a;->D:Lt2/a;

    invoke-static {v0}, Lt2/a;->c(Lt2/a;)LW8/z0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt2/a$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
