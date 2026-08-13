.class final Lv/N$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lv/L;

.field private final b:LW8/z0;


# direct methods
.method public constructor <init>(Lv/L;LW8/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/N$a;->a:Lv/L;

    iput-object p2, p0, Lv/N$a;->b:LW8/z0;

    return-void
.end method


# virtual methods
.method public final a(Lv/N$a;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lv/N$a;->a:Lv/L;

    iget-object p1, p1, Lv/N$a;->a:Lv/L;

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

    iget-object v0, p0, Lv/N$a;->b:LW8/z0;

    new-instance v1, Lv/M;

    invoke-direct {v1}, Lv/M;-><init>()V

    invoke-interface {v0, v1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
