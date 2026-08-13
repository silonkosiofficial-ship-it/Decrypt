.class Landroidx/browser/customtabs/c$a;
.super Ld/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/c;->b(Landroidx/browser/customtabs/b;)Ld/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private C:Landroid/os/Handler;

.field final synthetic D:Landroidx/browser/customtabs/b;

.field final synthetic E:Landroidx/browser/customtabs/c;


# direct methods
.method constructor <init>(Landroidx/browser/customtabs/c;Landroidx/browser/customtabs/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/customtabs/c$a;->E:Landroidx/browser/customtabs/c;

    iput-object p2, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    invoke-direct {p0}, Ld/a$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public C4(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$h;

    invoke-direct {v1, p0, p1}, Landroidx/browser/customtabs/c$a$h;-><init>(Landroidx/browser/customtabs/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public M5(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$d;

    invoke-direct {v1, p0, p1}, Landroidx/browser/customtabs/c$a$d;-><init>(Landroidx/browser/customtabs/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public Q3(IILandroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$g;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/browser/customtabs/c$a$g;-><init>(Landroidx/browser/customtabs/c$a;IILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public R4(ILandroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$b;

    invoke-direct {v1, p0, p1, p2}, Landroidx/browser/customtabs/c$a$b;-><init>(Landroidx/browser/customtabs/c$a;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public R5(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 8

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v7, Landroidx/browser/customtabs/c$a$f;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/browser/customtabs/c$a$f;-><init>(Landroidx/browser/customtabs/c$a;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public i3(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$j;

    invoke-direct {v1, p0, p1}, Landroidx/browser/customtabs/c$a$j;-><init>(Landroidx/browser/customtabs/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public m2(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroidx/browser/customtabs/b;->b(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public q4(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$c;

    invoke-direct {v1, p0, p1, p2}, Landroidx/browser/customtabs/c$a$c;-><init>(Landroidx/browser/customtabs/c$a;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public s1(IIIIILandroid/os/Bundle;)V
    .locals 11

    .prologue
    move-object v8, p0

    iget-object v0, v8, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v9, v8, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v10, Landroidx/browser/customtabs/c$a$i;

    move-object v0, v10

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/browser/customtabs/c$a$i;-><init>(Landroidx/browser/customtabs/c$a;IIIIILandroid/os/Bundle;)V

    invoke-virtual {v9, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w3(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$a;

    invoke-direct {v1, p0, p1}, Landroidx/browser/customtabs/c$a$a;-><init>(Landroidx/browser/customtabs/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public y5(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/browser/customtabs/c$a;->C:Landroid/os/Handler;

    new-instance v1, Landroidx/browser/customtabs/c$a$e;

    invoke-direct {v1, p0, p1, p2}, Landroidx/browser/customtabs/c$a$e;-><init>(Landroidx/browser/customtabs/c$a;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
