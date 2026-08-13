.class public final Lf0/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/n;
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

    invoke-direct {p0}, Lf0/n$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lf0/n;
    .locals 1

    invoke-static {}, Lf0/n;->e()Lf0/n;

    move-result-object v0

    return-object v0
.end method
