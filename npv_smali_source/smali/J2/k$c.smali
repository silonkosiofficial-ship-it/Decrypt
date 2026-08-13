.class public LJ2/k$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Landroidx/work/ListenableWorker;

.field c:LP2/a;

.field d:LS2/a;

.field e:Landroidx/work/a;

.field f:Landroidx/work/impl/WorkDatabase;

.field g:Ljava/lang/String;

.field h:Ljava/util/List;

.field i:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LS2/a;LP2/a;Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/work/WorkerParameters$a;

    invoke-direct {v0}, Landroidx/work/WorkerParameters$a;-><init>()V

    iput-object v0, p0, LJ2/k$c;->i:Landroidx/work/WorkerParameters$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LJ2/k$c;->a:Landroid/content/Context;

    iput-object p3, p0, LJ2/k$c;->d:LS2/a;

    iput-object p4, p0, LJ2/k$c;->c:LP2/a;

    iput-object p2, p0, LJ2/k$c;->e:Landroidx/work/a;

    iput-object p5, p0, LJ2/k$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, LJ2/k$c;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()LJ2/k;
    .locals 1

    new-instance v0, LJ2/k;

    invoke-direct {v0, p0}, LJ2/k;-><init>(LJ2/k$c;)V

    return-object v0
.end method

.method public b(Landroidx/work/WorkerParameters$a;)LJ2/k$c;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iput-object p1, p0, LJ2/k$c;->i:Landroidx/work/WorkerParameters$a;

    :cond_0
    return-object p0
.end method

.method public c(Ljava/util/List;)LJ2/k$c;
    .locals 0

    iput-object p1, p0, LJ2/k$c;->h:Ljava/util/List;

    return-object p0
.end method
