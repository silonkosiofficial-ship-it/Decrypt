.class Landroidx/transition/v$a;
.super Landroidx/transition/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/v;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/transition/k;

.field final synthetic b:Landroidx/transition/v;


# direct methods
.method constructor <init>(Landroidx/transition/v;Landroidx/transition/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/v$a;->b:Landroidx/transition/v;

    iput-object p2, p0, Landroidx/transition/v$a;->a:Landroidx/transition/k;

    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroidx/transition/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/transition/v$a;->a:Landroidx/transition/k;

    invoke-virtual {v0}, Landroidx/transition/k;->d0()V

    invoke-virtual {p1, p0}, Landroidx/transition/k;->Z(Landroidx/transition/k$f;)Landroidx/transition/k;

    return-void
.end method
