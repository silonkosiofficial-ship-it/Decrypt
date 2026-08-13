.class Landroidx/work/impl/WorkDatabase$b;
.super Lo2/n$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->R()Lo2/n$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo2/n$b;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Lz2/d;)V
    .locals 1

    .prologue
    invoke-super {p0, p1}, Lo2/n$b;->f(Lz2/d;)V

    invoke-interface {p1}, Lz2/d;->u()V

    :try_start_0
    invoke-static {}, Landroidx/work/impl/WorkDatabase;->T()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lz2/d;->B(Ljava/lang/String;)V

    invoke-interface {p1}, Lz2/d;->i0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lz2/d;->B0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Lz2/d;->B0()V

    throw v0
.end method
