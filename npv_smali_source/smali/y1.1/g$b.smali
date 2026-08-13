.class Ly1/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/g;->d(Landroid/content/Context;Ly1/f;ILjava/util/concurrent/Executor;Ly1/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly1/a;


# direct methods
.method constructor <init>(Ly1/a;)V
    .locals 0

    iput-object p1, p0, Ly1/g$b;->a:Ly1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly1/g$e;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    new-instance p1, Ly1/g$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Ly1/g$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, Ly1/g$b;->a:Ly1/a;

    invoke-virtual {v0, p1}, Ly1/a;->b(Ly1/g$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ly1/g$e;

    invoke-virtual {p0, p1}, Ly1/g$b;->a(Ly1/g$e;)V

    return-void
.end method
