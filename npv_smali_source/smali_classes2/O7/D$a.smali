.class public final LO7/D$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/D;
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

    invoke-direct {p0}, LO7/D$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZZZ)LO7/D;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    sget-object p1, LO7/D;->E:LO7/D;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    sget-object p1, LO7/D;->G:LO7/D;

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    sget-object p1, LO7/D;->F:LO7/D;

    goto :goto_0

    :cond_2
    sget-object p1, LO7/D;->D:LO7/D;

    :goto_0
    return-object p1
.end method
