.class public final LT0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT0/h;
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

    invoke-direct {p0}, LT0/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT0/h;
    .locals 1

    invoke-static {}, LT0/j;->a()LT0/i;

    move-result-object v0

    invoke-interface {v0}, LT0/i;->b()LT0/h;

    move-result-object v0

    return-object v0
.end method

.method public final b()LT0/h;
    .locals 1

    invoke-static {}, LT0/h;->d()LT0/h;

    move-result-object v0

    return-object v0
.end method
