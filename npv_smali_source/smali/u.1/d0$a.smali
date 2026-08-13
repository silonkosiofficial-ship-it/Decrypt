.class final Lu/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lu/a0;

.field private final b:LW8/z0;


# direct methods
.method public constructor <init>(Lu/a0;LW8/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/d0$a;->a:Lu/a0;

    iput-object p2, p0, Lu/d0$a;->b:LW8/z0;

    return-void
.end method


# virtual methods
.method public final a(Lu/d0$a;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lu/d0$a;->a:Lu/a0;

    iget-object p1, p1, Lu/d0$a;->a:Lu/a0;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lu/d0$a;->b:LW8/z0;

    new-instance v1, Lu/b0;

    invoke-direct {v1}, Lu/b0;-><init>()V

    invoke-interface {v0, v1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
