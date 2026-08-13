.class public final enum Lw3/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lw3/u;

.field public static final enum D:Lw3/u;

.field public static final enum E:Lw3/u;

.field public static final enum F:Lw3/u;

.field private static final synthetic G:[Lw3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lw3/u;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw3/u;->C:Lw3/u;

    new-instance v1, Lw3/u;

    const-string v3, "PERMANENT_FAILURE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw3/u;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw3/u;->D:Lw3/u;

    new-instance v3, Lw3/u;

    const-string v5, "RETRIABLE_FAILURE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw3/u;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw3/u;->E:Lw3/u;

    new-instance v5, Lw3/u;

    const-string v7, "BUFFERED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw3/u;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw3/u;->F:Lw3/u;

    const/4 v7, 0x4

    new-array v7, v7, [Lw3/u;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lw3/u;->G:[Lw3/u;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lw3/u;
    .locals 1

    sget-object v0, Lw3/u;->G:[Lw3/u;

    invoke-virtual {v0}, [Lw3/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw3/u;

    return-object v0
.end method
