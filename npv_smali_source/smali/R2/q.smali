.class public LR2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# static fields
.field static final c:Ljava/lang/String;


# instance fields
.field final a:Landroidx/work/impl/WorkDatabase;

.field final b:LS2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkProgressUpdater"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR2/q;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;LS2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, LR2/q;->b:LS2/a;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/b;)LP4/d;
    .locals 2

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object p1

    iget-object v0, p0, LR2/q;->b:LS2/a;

    new-instance v1, LR2/q$a;

    invoke-direct {v1, p0, p2, p3, p1}, LR2/q$a;-><init>(LR2/q;Ljava/util/UUID;Landroidx/work/b;Landroidx/work/impl/utils/futures/c;)V

    invoke-interface {v0, v1}, LS2/a;->b(Ljava/lang/Runnable;)V

    return-object p1
.end method
