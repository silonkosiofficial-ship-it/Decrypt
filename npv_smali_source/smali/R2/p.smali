.class public LR2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/f;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:LS2/a;

.field final b:LP2/a;

.field final c:LQ2/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR2/p;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;LP2/a;LS2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LR2/p;->b:LP2/a;

    iput-object p3, p0, LR2/p;->a:LS2/a;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object p1

    iput-object p1, p0, LR2/p;->c:LQ2/q;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;LI2/e;)LP4/d;
    .locals 9

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object v6

    iget-object v7, p0, LR2/p;->a:LS2/a;

    new-instance v8, LR2/p$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LR2/p$a;-><init>(LR2/p;Landroidx/work/impl/utils/futures/c;Ljava/util/UUID;LI2/e;Landroid/content/Context;)V

    invoke-interface {v7, v8}, LS2/a;->b(Ljava/lang/Runnable;)V

    return-object v6
.end method
