.class public final enum LB8/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LB8/b;

.field public static final enum D:LB8/b;

.field public static final enum E:LB8/b;

.field public static final enum F:LB8/b;

.field private static final synthetic G:[LB8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LB8/b;

    const-string v1, "FUNCTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LB8/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB8/b;->C:LB8/b;

    new-instance v1, LB8/b;

    const-string v3, "PROPERTY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LB8/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, LB8/b;->D:LB8/b;

    new-instance v3, LB8/b;

    const-string v5, "PROPERTY_GETTER"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LB8/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, LB8/b;->E:LB8/b;

    new-instance v5, LB8/b;

    const-string v7, "PROPERTY_SETTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LB8/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, LB8/b;->F:LB8/b;

    const/4 v7, 0x4

    new-array v7, v7, [LB8/b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LB8/b;->G:[LB8/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LB8/b;
    .locals 1

    const-class v0, LB8/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LB8/b;

    return-object p0
.end method

.method public static values()[LB8/b;
    .locals 1

    sget-object v0, LB8/b;->G:[LB8/b;

    invoke-virtual {v0}, [LB8/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LB8/b;

    return-object v0
.end method
