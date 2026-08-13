.class public final enum Lf4/h0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lf4/h0;

.field public static final enum D:Lf4/h0;

.field public static final enum E:Lf4/h0;

.field public static final enum F:Lf4/h0;

.field public static final enum G:Lf4/h0;

.field private static final synthetic H:[Lf4/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lf4/h0;

    const-string v1, "DEBUG_PARAM_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf4/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/h0;->C:Lf4/h0;

    new-instance v1, Lf4/h0;

    const-string v3, "ALWAYS_SHOW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf4/h0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf4/h0;->D:Lf4/h0;

    new-instance v3, Lf4/h0;

    const-string v5, "GEO_OVERRIDE_EEA"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lf4/h0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lf4/h0;->E:Lf4/h0;

    new-instance v5, Lf4/h0;

    const-string v7, "GEO_OVERRIDE_NON_EEA"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lf4/h0;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lf4/h0;->F:Lf4/h0;

    new-instance v7, Lf4/h0;

    const-string v9, "PREVIEWING_DEBUG_MESSAGES"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lf4/h0;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lf4/h0;->G:Lf4/h0;

    const/4 v9, 0x5

    new-array v9, v9, [Lf4/h0;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lf4/h0;->H:[Lf4/h0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lf4/h0;
    .locals 1

    sget-object v0, Lf4/h0;->H:[Lf4/h0;

    invoke-virtual {v0}, [Lf4/h0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf4/h0;

    return-object v0
.end method
