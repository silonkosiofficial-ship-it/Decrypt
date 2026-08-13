.class final LY9/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
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

    invoke-direct {p0}, LY9/h$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LY9/h$a;LX9/Q;)Z
    .locals 0

    invoke-direct {p0, p1}, LY9/h$a;->b(LX9/Q;)Z

    move-result p0

    return p0
.end method

.method private final b(LX9/Q;)Z
    .locals 2

    invoke-virtual {p1}, LX9/Q;->o()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".class"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LS8/r;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method
