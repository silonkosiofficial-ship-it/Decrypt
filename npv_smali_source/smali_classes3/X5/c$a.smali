.class public final LX5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX5/c;
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

    invoke-direct {p0}, LX5/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(II)LX5/c;
    .locals 2

    new-instance v0, LX5/c;

    new-instance v1, LE7/i;

    invoke-direct {v1, p1, p2}, LE7/i;-><init>(II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-direct {v0, v1, p1, p2}, LX5/c;-><init>(LE7/i;ZLy7/k;)V

    return-object v0
.end method
