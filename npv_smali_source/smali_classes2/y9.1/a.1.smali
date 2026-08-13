.class public final enum Ly9/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Ly9/a;

.field public static final enum D:Ly9/a;

.field public static final enum E:Ly9/a;

.field private static final synthetic F:[Ly9/a;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly9/a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly9/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly9/a;->C:Ly9/a;

    new-instance v0, Ly9/a;

    const-string v1, "ALL_JSON_OBJECTS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ly9/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly9/a;->D:Ly9/a;

    new-instance v0, Ly9/a;

    const-string v1, "POLYMORPHIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ly9/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly9/a;->E:Ly9/a;

    invoke-static {}, Ly9/a;->e()[Ly9/a;

    move-result-object v0

    sput-object v0, Ly9/a;->F:[Ly9/a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Ly9/a;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Ly9/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ly9/a;

    sget-object v1, Ly9/a;->C:Ly9/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ly9/a;->D:Ly9/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ly9/a;->E:Ly9/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly9/a;
    .locals 1

    const-class v0, Ly9/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly9/a;

    return-object p0
.end method

.method public static values()[Ly9/a;
    .locals 1

    sget-object v0, Ly9/a;->F:[Ly9/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly9/a;

    return-object v0
.end method
