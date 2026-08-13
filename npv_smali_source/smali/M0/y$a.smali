.class public final LM0/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/y;
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

    invoke-direct {p0}, LM0/y$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LM0/y;
    .locals 1

    invoke-static {}, LM0/y;->a()LM0/y;

    move-result-object v0

    return-object v0
.end method
