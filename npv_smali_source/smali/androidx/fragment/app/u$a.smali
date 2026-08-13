.class final Landroidx/fragment/app/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Landroidx/fragment/app/f;

.field c:Z

.field d:I

.field e:I

.field f:I

.field g:I

.field h:Landroidx/lifecycle/k$b;

.field i:Landroidx/lifecycle/k$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(ILandroidx/fragment/app/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/u$a;->a:I

    iput-object p2, p0, Landroidx/fragment/app/u$a;->b:Landroidx/fragment/app/f;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/u$a;->c:Z

    sget-object p1, Landroidx/lifecycle/k$b;->G:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Landroidx/fragment/app/u$a;->h:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Landroidx/fragment/app/u$a;->i:Landroidx/lifecycle/k$b;

    return-void
.end method

.method constructor <init>(ILandroidx/fragment/app/f;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/u$a;->a:I

    iput-object p2, p0, Landroidx/fragment/app/u$a;->b:Landroidx/fragment/app/f;

    iput-boolean p3, p0, Landroidx/fragment/app/u$a;->c:Z

    sget-object p1, Landroidx/lifecycle/k$b;->G:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Landroidx/fragment/app/u$a;->h:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Landroidx/fragment/app/u$a;->i:Landroidx/lifecycle/k$b;

    return-void
.end method
