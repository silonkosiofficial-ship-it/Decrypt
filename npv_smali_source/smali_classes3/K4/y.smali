.class public abstract LK4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Ll4/m;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LK4/y;->C:Ll4/m;

    return-void
.end method

.method public constructor <init>(Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK4/y;->C:Ll4/m;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    .prologue
    iget-object v0, p0, LK4/y;->C:Ll4/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll4/m;->d(Ljava/lang/Exception;)Z

    :cond_0
    return-void
.end method

.method protected abstract b()V
.end method

.method final c()Ll4/m;
    .locals 1

    iget-object v0, p0, LK4/y;->C:Ll4/m;

    return-object v0
.end method

.method public final run()V
    .locals 1

    .prologue
    :try_start_0
    invoke-virtual {p0}, LK4/y;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LK4/y;->a(Ljava/lang/Exception;)V

    return-void
.end method
