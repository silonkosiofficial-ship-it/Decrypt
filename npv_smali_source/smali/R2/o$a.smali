.class LR2/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/o;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/work/impl/utils/futures/c;

.field final synthetic D:LR2/o;


# direct methods
.method constructor <init>(LR2/o;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    iput-object p1, p0, LR2/o$a;->D:LR2/o;

    iput-object p2, p0, LR2/o$a;->C:Landroidx/work/impl/utils/futures/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LR2/o$a;->C:Landroidx/work/impl/utils/futures/c;

    iget-object v1, p0, LR2/o$a;->D:LR2/o;

    iget-object v1, v1, LR2/o;->F:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getForegroundInfoAsync()LP4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->s(LP4/d;)Z

    return-void
.end method
