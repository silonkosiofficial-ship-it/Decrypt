.class public final LR0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR0/e$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LQ0/b;

.field private final c:LQ0/c;

.field private final d:LU0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, LR0/e$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, LR0/e;->a:Ljava/lang/Object;

    new-instance v1, LQ0/b;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, LQ0/b;-><init>(I)V

    iput-object v1, p0, LR0/e;->b:LQ0/b;

    new-instance v1, LQ0/c;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v0}, LQ0/c;-><init>(IILy7/k;)V

    iput-object v1, p0, LR0/e;->c:LQ0/c;

    invoke-static {}, LU0/q;->a()LU0/r;

    move-result-object v0

    iput-object v0, p0, LR0/e;->d:LU0/r;

    return-void
.end method
