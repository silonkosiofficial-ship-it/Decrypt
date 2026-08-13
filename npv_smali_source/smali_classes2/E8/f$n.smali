.class final enum LE8/f$n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "n"
.end annotation


# static fields
.field public static final enum C:LE8/f$n;

.field public static final enum D:LE8/f$n;

.field public static final enum E:LE8/f$n;

.field private static final synthetic F:[LE8/f$n;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LE8/f$n;

    const-string v1, "NOT_COMPUTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LE8/f$n;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE8/f$n;->C:LE8/f$n;

    new-instance v1, LE8/f$n;

    const-string v3, "COMPUTING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LE8/f$n;-><init>(Ljava/lang/String;I)V

    sput-object v1, LE8/f$n;->D:LE8/f$n;

    new-instance v3, LE8/f$n;

    const-string v5, "RECURSION_WAS_DETECTED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LE8/f$n;-><init>(Ljava/lang/String;I)V

    sput-object v3, LE8/f$n;->E:LE8/f$n;

    const/4 v5, 0x3

    new-array v5, v5, [LE8/f$n;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LE8/f$n;->F:[LE8/f$n;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LE8/f$n;
    .locals 1

    const-class v0, LE8/f$n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LE8/f$n;

    return-object p0
.end method

.method public static values()[LE8/f$n;
    .locals 1

    sget-object v0, LE8/f$n;->F:[LE8/f$n;

    invoke-virtual {v0}, [LE8/f$n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LE8/f$n;

    return-object v0
.end method
