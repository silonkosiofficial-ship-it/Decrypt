.class public abstract LU6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU6/b$a;,
        LU6/b$b;,
        LU6/b$c;,
        LU6/b$d;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LU6/b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Long;
.end method

.method public b()LT6/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()LT6/p;
    .locals 1

    sget-object v0, LT6/p;->a:LT6/p$a;

    invoke-virtual {v0}, LT6/p$a;->a()LT6/p;

    move-result-object v0

    return-object v0
.end method
