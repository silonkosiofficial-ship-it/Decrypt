.class public abstract Lo2/g;
.super Lo2/w;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo2/n;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo2/w;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method protected abstract i(Lz2/h;Ljava/lang/Object;)V
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lo2/w;->b()Lz2/h;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lo2/g;->i(Lz2/h;Ljava/lang/Object;)V

    invoke-interface {v0}, Lz2/h;->o1()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lo2/w;->h(Lz2/h;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lo2/w;->h(Lz2/h;)V

    throw p1
.end method
