.class Landroidx/transition/k$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/k;->c0(Landroid/animation/Animator;Lr/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/a;

.field final synthetic b:Landroidx/transition/k;


# direct methods
.method constructor <init>(Landroidx/transition/k;Lr/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/k$b;->b:Landroidx/transition/k;

    iput-object p2, p0, Landroidx/transition/k$b;->a:Lr/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Landroidx/transition/k$b;->a:Lr/a;

    invoke-virtual {v0, p1}, Lr/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/transition/k$b;->b:Landroidx/transition/k;

    iget-object v0, v0, Landroidx/transition/k;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Landroidx/transition/k$b;->b:Landroidx/transition/k;

    iget-object v0, v0, Landroidx/transition/k;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
