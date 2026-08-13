.class public final Le/x$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/x$g;->a(Lx7/l;Lx7/l;Lx7/a;Lx7/a;)Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/l;

.field final synthetic b:Lx7/l;

.field final synthetic c:Lx7/a;

.field final synthetic d:Lx7/a;


# direct methods
.method constructor <init>(Lx7/l;Lx7/l;Lx7/a;Lx7/a;)V
    .locals 0

    iput-object p1, p0, Le/x$g$a;->a:Lx7/l;

    iput-object p2, p0, Le/x$g$a;->b:Lx7/l;

    iput-object p3, p0, Le/x$g$a;->c:Lx7/a;

    iput-object p4, p0, Le/x$g$a;->d:Lx7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackCancelled()V
    .locals 1

    iget-object v0, p0, Le/x$g$a;->d:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public onBackInvoked()V
    .locals 1

    iget-object v0, p0, Le/x$g$a;->c:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/x$g$a;->b:Lx7/l;

    new-instance v1, Le/b;

    invoke-direct {v1, p1}, Le/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/x$g$a;->a:Lx7/l;

    new-instance v1, Le/b;

    invoke-direct {v1, p1}, Le/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
