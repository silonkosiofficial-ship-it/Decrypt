.class public final LT7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LT7/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)LT7/f;
    .locals 3

    .prologue
    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh8/b;

    invoke-direct {v0}, Lh8/b;-><init>()V

    sget-object v1, LT7/c;->a:LT7/c;

    invoke-virtual {v1, p1, v0}, LT7/c;->b(Ljava/lang/Class;Lg8/t$c;)V

    new-instance v1, LT7/f;

    invoke-virtual {v0}, Lh8/b;->n()Lh8/a;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    invoke-direct {v1, p1, v0, v2}, LT7/f;-><init>(Ljava/lang/Class;Lh8/a;Ly7/k;)V

    return-object v1
.end method
