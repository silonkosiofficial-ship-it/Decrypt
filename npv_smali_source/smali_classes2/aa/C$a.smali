.class public final Laa/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/C;
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

    invoke-direct {p0}, Laa/C$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)Laa/C;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    sget-object p1, Laa/C;->E:Laa/C;

    goto :goto_0

    :cond_0
    sget-object p1, Laa/C;->D:Laa/C;

    :goto_0
    return-object p1
.end method
