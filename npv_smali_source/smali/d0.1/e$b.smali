.class public final Ld0/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Ld0/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ld0/e;
    .locals 1

    invoke-static {}, Ld0/e;->x()Ld0/e;

    move-result-object v0

    return-object v0
.end method
