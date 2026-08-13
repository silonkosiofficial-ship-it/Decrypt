.class Landroidx/transition/t$a$a;
.super Landroidx/transition/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/t$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/a;

.field final synthetic b:Landroidx/transition/t$a;


# direct methods
.method constructor <init>(Landroidx/transition/t$a;Lr/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/t$a$a;->b:Landroidx/transition/t$a;

    iput-object p2, p0, Landroidx/transition/t$a$a;->a:Lr/a;

    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroidx/transition/k;)V
    .locals 2

    iget-object v0, p0, Landroidx/transition/t$a$a;->a:Lr/a;

    iget-object v1, p0, Landroidx/transition/t$a$a;->b:Landroidx/transition/t$a;

    iget-object v1, v1, Landroidx/transition/t$a;->D:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lr/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Landroidx/transition/k;->Z(Landroidx/transition/k$f;)Landroidx/transition/k;

    return-void
.end method
