.class final LV/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lx7/l;

.field private final b:Lm7/e;


# direct methods
.method public constructor <init>(Lx7/l;Lm7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/i$a;->a:Lx7/l;

    iput-object p2, p0, LV/i$a;->b:Lm7/e;

    return-void
.end method


# virtual methods
.method public final a()Lm7/e;
    .locals 1

    iget-object v0, p0, LV/i$a;->b:Lm7/e;

    return-object v0
.end method

.method public final b(J)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/i$a;->b:Lm7/e;

    :try_start_0
    sget-object v1, Li7/w;->D:Li7/w$a;

    iget-object v1, p0, LV/i$a;->a:Lx7/l;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method
