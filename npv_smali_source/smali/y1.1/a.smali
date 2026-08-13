.class Ly1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ly1/h$c;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ly1/h$c;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/a;->a:Ly1/h$c;

    iput-object p2, p0, Ly1/a;->b:Landroid/os/Handler;

    return-void
.end method

.method private a(I)V
    .locals 3

    iget-object v0, p0, Ly1/a;->a:Ly1/h$c;

    iget-object v1, p0, Ly1/a;->b:Landroid/os/Handler;

    new-instance v2, Ly1/a$b;

    invoke-direct {v2, p0, v0, p1}, Ly1/a$b;-><init>(Ly1/a;Ly1/h$c;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private c(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, Ly1/a;->a:Ly1/h$c;

    iget-object v1, p0, Ly1/a;->b:Landroid/os/Handler;

    new-instance v2, Ly1/a$a;

    invoke-direct {v2, p0, v0, p1}, Ly1/a$a;-><init>(Ly1/a;Ly1/h$c;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method b(Ly1/g$e;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Ly1/g$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ly1/g$e;->a:Landroid/graphics/Typeface;

    invoke-direct {p0, p1}, Ly1/a;->c(Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_0
    iget p1, p1, Ly1/g$e;->b:I

    invoke-direct {p0, p1}, Ly1/a;->a(I)V

    :goto_0
    return-void
.end method
