.class public LR2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private C:LJ2/j;

.field private D:Ljava/lang/String;

.field private E:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(LJ2/j;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR2/l;->C:LJ2/j;

    iput-object p2, p0, LR2/l;->D:Ljava/lang/String;

    iput-object p3, p0, LR2/l;->E:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LR2/l;->C:LJ2/j;

    invoke-virtual {v0}, LJ2/j;->m()LJ2/d;

    move-result-object v0

    iget-object v1, p0, LR2/l;->D:Ljava/lang/String;

    iget-object v2, p0, LR2/l;->E:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, LJ2/d;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
