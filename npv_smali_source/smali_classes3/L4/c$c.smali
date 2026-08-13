.class public final enum LL4/c$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum C:LL4/c$c;

.field public static final enum D:LL4/c$c;

.field public static final enum E:LL4/c$c;

.field private static final synthetic F:[LL4/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LL4/c$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LL4/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LL4/c$c;->C:LL4/c$c;

    new-instance v1, LL4/c$c;

    const-string v3, "NOT_REQUIRED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LL4/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, LL4/c$c;->D:LL4/c$c;

    new-instance v3, LL4/c$c;

    const-string v5, "REQUIRED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LL4/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, LL4/c$c;->E:LL4/c$c;

    const/4 v5, 0x3

    new-array v5, v5, [LL4/c$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LL4/c$c;->F:[LL4/c$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LL4/c$c;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    const-class v0, LL4/c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL4/c$c;

    return-object p0
.end method

.method public static values()[LL4/c$c;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    sget-object v0, LL4/c$c;->F:[LL4/c$c;

    invoke-virtual {v0}, [LL4/c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL4/c$c;

    return-object v0
.end method
