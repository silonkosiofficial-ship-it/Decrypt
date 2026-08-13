.class LR1/a$d;
.super LR1/a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final b:Landroid/view/Choreographer;

.field private final c:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method constructor <init>(LR1/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, LR1/a$c;-><init>(LR1/a$a;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, LR1/a$d;->b:Landroid/view/Choreographer;

    new-instance p1, LR1/a$d$a;

    invoke-direct {p1, p0}, LR1/a$d$a;-><init>(LR1/a$d;)V

    iput-object p1, p0, LR1/a$d;->c:Landroid/view/Choreographer$FrameCallback;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, LR1/a$d;->b:Landroid/view/Choreographer;

    iget-object v1, p0, LR1/a$d;->c:Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
