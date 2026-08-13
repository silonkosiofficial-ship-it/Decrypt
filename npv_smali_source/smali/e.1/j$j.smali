.class final Le/j$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le/j;


# direct methods
.method constructor <init>(Le/j;)V
    .locals 0

    iput-object p1, p0, Le/j$j;->D:Le/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Le/j;Le/x;)V
    .locals 0

    invoke-static {p0, p1}, Le/j$j;->k(Le/j;Le/x;)V

    return-void
.end method

.method public static synthetic e(Le/j;)V
    .locals 0

    invoke-static {p0}, Le/j$j;->g(Le/j;)V

    return-void
.end method

.method private static final g(Le/j;)V
    .locals 2

    .prologue
    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Le/j;->L(Le/j;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    throw p0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    throw p0
.end method

.method private static final k(Le/j;Le/x;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dispatcher"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Le/j;->I(Le/j;Le/x;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le/j$j;->f()Le/x;

    move-result-object v0

    return-object v0
.end method

.method public final f()Le/x;
    .locals 4

    .prologue
    new-instance v0, Le/x;

    iget-object v1, p0, Le/j$j;->D:Le/j;

    new-instance v2, Le/n;

    invoke-direct {v2, v1}, Le/n;-><init>(Le/j;)V

    invoke-direct {v0, v2}, Le/x;-><init>(Ljava/lang/Runnable;)V

    iget-object v1, p0, Le/j$j;->D:Le/j;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Le/o;

    invoke-direct {v3, v1, v0}, Le/o;-><init>(Le/j;Le/x;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1, v0}, Le/j;->I(Le/j;Le/x;)V

    :cond_1
    :goto_0
    return-object v0
.end method
